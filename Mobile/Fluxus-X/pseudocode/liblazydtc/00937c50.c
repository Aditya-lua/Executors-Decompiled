/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00937c50
 */

undefined8 FUN_00937c50(long *param_1,char *param_2)

{
  fde_table_entry *pfVar1;
  long lVar2;
  
  (*(code *)PTR_free_00cc4678)(*param_1);
  *param_1 = 0;
  if (param_2 != (char *)0x0) {
    pfVar1 = (fde_table_entry *)strlen(param_2);
    if (&fde_table_entry_007a1200 < pfVar1) {
      return 0x2b;
    }
    lVar2 = (*(code *)PTR_strdup_00cc4688)(param_2);
    *param_1 = lVar2;
    if (lVar2 == 0) {
      return 0x1b;
    }
  }
  return 0;
}

