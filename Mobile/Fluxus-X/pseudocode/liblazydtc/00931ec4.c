/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931ec4
 */

void FUN_00931ec4(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  if ((*(long *)(param_1 + 0x330) != 0) &&
     (lVar1 = FUN_00941d54(param_2,param_3,*(undefined8 *)(param_1 + 0xb88),
                           *(undefined8 *)(param_1 + 0xb90)), 2999 < lVar1)) {
    *(undefined8 *)(param_1 + 0xb88) = param_2;
    *(undefined8 *)(param_1 + 0xb90) = param_3;
    *(undefined8 *)(param_1 + 0xb98) = *(undefined8 *)(param_1 + 0xac0);
  }
  if ((*(long *)(param_1 + 0x328) != 0) &&
     (lVar1 = FUN_00941d54(param_2,param_3,*(undefined8 *)(param_1 + 0xb70),
                           *(undefined8 *)(param_1 + 0xb78)), 2999 < lVar1)) {
    *(undefined8 *)(param_1 + 0xb70) = param_2;
    *(undefined8 *)(param_1 + 0xb78) = param_3;
    *(undefined8 *)(param_1 + 0xb80) = *(undefined8 *)(param_1 + 0xac8);
  }
  return;
}

