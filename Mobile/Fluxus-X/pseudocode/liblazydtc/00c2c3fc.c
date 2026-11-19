/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c3fc
 */

undefined8 FUN_00c2c3fc(long *param_1,undefined4 param_2,undefined8 *param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  
  uVar1 = (**(code **)(*param_1 + 0x10))();
  if ((uVar1 & 1) == 0) {
    return 0xffffe672;
  }
  uVar2 = (**(code **)(*param_1 + 0x18))(param_1,param_2);
  *param_3 = uVar2;
  return 0;
}

