/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009435fc
 */

undefined8 FUN_009435fc(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long lVar2;
  
  if (((param_1 == 0) || (lVar2 = *(long *)(param_1 + 0x20), lVar2 == 0)) ||
     (*(int *)(lVar2 + 0x3cc) == -1)) {
    return 2;
  }
  uVar1 = FUN_00907008(param_1,*(int *)(lVar2 + 0x3cc) == *(int *)(lVar2 + 0x224),param_2);
  return uVar1;
}

