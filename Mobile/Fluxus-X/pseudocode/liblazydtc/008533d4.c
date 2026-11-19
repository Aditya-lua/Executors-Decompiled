/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008533d4
 */

void FUN_008533d4(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  int iVar1;
  
  iVar1 = (int)((ulong)param_5 >> 0x20);
  *param_1 = param_2;
  param_1[1] = param_3;
  *(undefined4 *)(param_1 + 2) = 0;
  *(int *)((long)param_1 + 0x14) = (int)param_5;
  *(int *)((long)param_1 + 0x2c) = (int)param_5;
  *(int *)(param_1 + 6) = iVar1;
  *(int *)(param_1 + 3) = -iVar1;
  *(undefined4 *)(param_1 + 4) = 0;
  *(undefined8 *)((long)param_1 + 0x24) = param_5;
  *(undefined8 *)((long)param_1 + 0x34) = 0;
  *(undefined8 *)((long)param_1 + 0x44) = 0;
  *(undefined8 *)((long)param_1 + 0x3c) = 0;
  *(undefined4 *)((long)param_1 + 0x4c) = 0;
  param_1[10] = param_4;
  *(undefined2 *)(param_1 + 0xb) = 0x100;
  param_1[0xd] = 0;
  param_1[0xe] = 0;
  param_1[0xc] = 0;
  return;
}

