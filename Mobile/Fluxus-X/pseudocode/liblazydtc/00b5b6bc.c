/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5b6bc
 */

undefined8 FUN_00b5b6bc(long param_1,uint param_2)

{
  undefined8 uVar1;
  undefined8 in_x5;
  
  uVar1 = FUN_00b5b884(param_1,in_x5);
  if (((int)uVar1 != 0) && (uVar1 = 0, param_2 <= *(uint *)(param_1 + 0xc))) {
    uVar1 = 1;
    *(undefined4 *)(param_1 + 8) = 1;
    *(undefined8 *)(param_1 + 0x30) = 0;
  }
  return uVar1;
}

