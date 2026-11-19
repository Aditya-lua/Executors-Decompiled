/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84b90
 */

void FUN_00a84b90(void)

{
  int iVar1;
  
  iVar1 = async_init();
  if (iVar1 != 0) {
    DAT_00d2201c = 1;
  }
  DAT_00d2206c = (uint)(iVar1 != 0);
  return;
}

