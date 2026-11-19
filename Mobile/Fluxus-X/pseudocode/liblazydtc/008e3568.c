/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3568
 */

undefined8 FUN_008e3568(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (DAT_00d1fec8 != (long *)0x0) {
    (**(code **)(*DAT_00d1fec8 + 0x10))(DAT_00d1fec8,param_1,param_2,param_3);
  }
  if (*(long *)(param_1 + 0x28) == 0) {
    uVar1 = FUN_008e4884(param_2,param_3);
    *(undefined8 *)(param_1 + 0x28) = uVar1;
  }
  return 1;
}

