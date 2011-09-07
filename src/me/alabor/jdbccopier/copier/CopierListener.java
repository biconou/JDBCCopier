package me.alabor.jdbccopier.copier;

import me.alabor.jdbccopier.database.meta.Table;

public interface CopierListener {

	/**
	 * Notifies that the {@link Copier} begins now to copy the {@link Table} table
	 * 
	 * @param table
	 */
	public void startCopyTable(Table table);
	
	/**
	 * Provides information about the progress during copying the {@link Table}
	 * table.
	 * 
	 * @param table
	 * @param currentPos
	 * @param totalRows
	 */
	public void copyTableStatus(Table table, long currentPos, long totalRows);
	
	/**
	 * Error happend during copy the {@link Table} table.
	 * 
	 * @param table
	 * @param exception
	 */
	public void error(Table table, Exception exception);
	
	/**
	 * Notifies that the {@link Copier} has finished the copy of {@link Table}
	 * table.
	 * 
	 * @param table
	 */
	public void endCopyTable(Table table);
	
	/**
	 * Notifies that the {@link Copier} has completed its actions.
	 * 
	 * @param totalSuccess Statistics
	 * @param totalError Statistics
	 */
	public void endCopy(int totalSuccess, int totalError);
	
}
