/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00933014
 */

undefined8 FUN_00933014(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = (*(code *)PTR_calloc_00cc4690)(1,0x10);
  *(long *)(param_1 + 0x1a0) = lVar1;
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    FUN_00904528(param_2 + 0x428,1000000);
    uVar2 = 0;
  }
  return uVar2;
}

