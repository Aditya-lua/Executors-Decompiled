/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094369c
 */

undefined8 FUN_0094369c(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = (*(code *)PTR_calloc_00cc4690)(1,0x18);
  *(long *)(param_1 + 0x1a0) = lVar1;
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    uVar2 = 0;
    *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) & 0xfffffffff7ffffff;
  }
  return uVar2;
}

