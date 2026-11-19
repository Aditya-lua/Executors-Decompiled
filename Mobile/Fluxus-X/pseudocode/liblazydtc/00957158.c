/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00957158
 */

undefined8 FUN_00957158(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = (*(code *)PTR_calloc_00cc4690)(1,0x50);
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    FUN_00904528(lVar1 + 0x28,0x10000);
    uVar2 = 0;
    *(long *)(param_1 + 0x1a0) = lVar1;
  }
  return uVar2;
}

