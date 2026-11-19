/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008520e0
 */

void FUN_008520e0(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                 undefined8 param_9,undefined8 param_10,undefined8 param_11,undefined8 param_12)

{
  undefined4 uVar1;
  
  uVar1 = DAT_00d1eb20;
  *(undefined8 *)(param_1 + 1) = param_2;
  *(undefined8 *)(param_1 + 4) = param_3;
  *(undefined8 *)(param_1 + 6) = param_4;
  *param_1 = uVar1;
  *(undefined8 *)(param_1 + 8) = param_5;
  *(undefined8 *)(param_1 + 10) = param_6;
  *(undefined8 *)(param_1 + 0xc) = param_7;
  *(undefined8 *)(param_1 + 0xe) = param_8;
  *(undefined8 *)(param_1 + 0x12) = param_10;
  *(undefined8 *)(param_1 + 0x10) = param_9;
  *(undefined8 *)(param_1 + 0x14) = param_11;
  *(undefined8 *)(param_1 + 0x16) = param_12;
  return;
}

