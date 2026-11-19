/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ea0c
 */

undefined4 FUN_0090ea0c(undefined8 param_1,long *param_2)

{
  long lVar1;
  undefined4 uVar2;
  
  lVar1 = (*(code *)PTR_calloc_00cc4690)(1,0x10);
  *param_2 = lVar1;
  uVar2 = 0x1b;
  if (lVar1 != 0) {
    uVar2 = 0;
  }
  return uVar2;
}

