/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b55f3c
 */

undefined8 SipHash_Init(undefined8 *param_1,ulong *param_2,int param_3,int param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar4 = *param_2;
  uVar5 = param_2[1];
  iVar1 = 0x10;
  if (*(int *)((long)param_1 + 0x2c) != 0) {
    iVar1 = *(int *)((long)param_1 + 0x2c);
  }
  *param_1 = 0;
  param_1[1] = uVar4 ^ 0x736f6d6570736575;
  param_1[2] = uVar5 ^ 0x646f72616e646f6d;
  param_1[3] = uVar4 ^ 0x6c7967656e657261;
  iVar2 = 4;
  if (param_4 != 0) {
    iVar2 = param_4;
  }
  iVar3 = 2;
  if (param_3 != 0) {
    iVar3 = param_3;
  }
  *(undefined4 *)(param_1 + 5) = 0;
  *(int *)((long)param_1 + 0x2c) = iVar1;
  *(int *)(param_1 + 6) = iVar3;
  *(int *)((long)param_1 + 0x34) = iVar2;
  param_1[4] = uVar5 ^ 0x7465646279746573;
  if (iVar1 == 0x10) {
    param_1[2] = uVar5 ^ 0x646f72616e646f83;
  }
  return 1;
}

