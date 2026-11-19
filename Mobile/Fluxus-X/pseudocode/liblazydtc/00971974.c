/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00971974
 */

int FUN_00971974(void)

{
  int iVar1;
  
  iVar1 = 0;
  if (DAT_00d20260 != (FILE *)0x0) {
    iVar1 = fclose(DAT_00d20260);
    DAT_00d20260 = (FILE *)0x0;
  }
  return iVar1;
}

