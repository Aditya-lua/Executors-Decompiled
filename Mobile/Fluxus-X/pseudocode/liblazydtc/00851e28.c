/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851e28
 */

void FUN_00851e28(undefined4 *param_1)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 2) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  uVar1 = DAT_00d1e990;
  *(undefined8 *)(param_1 + 10) = 0;
  *(undefined8 *)(param_1 + 0xc) = 0;
  *param_1 = uVar1;
  *(undefined8 *)(param_1 + 6) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 8) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0xe) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0x12) = 0;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x16) = 0;
  *(undefined8 *)(param_1 + 0x14) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0x1a) = 0xffffffffffffffff;
  return;
}

