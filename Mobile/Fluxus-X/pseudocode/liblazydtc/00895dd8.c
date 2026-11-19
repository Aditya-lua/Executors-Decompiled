/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00895dd8
 */

void FUN_00895dd8(undefined8 *param_1,long param_2,int param_3,ulong param_4,ulong param_5,
                 uint param_6,uint param_7)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 uVar7;
  uint uVar8;
  
  uVar7 = **(undefined8 **)(param_2 + 0x38);
  uVar4 = FUN_0088df20(param_1,uVar7);
  if ((int)uVar4 < 0) {
    uVar4 = param_7 + 1;
    uVar8 = uVar4 & 0xff;
    uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
    *(uint *)((long)param_1 + 0x64c) = uVar8 + 1;
                    /* try { // try from 00895e50 to 00895e63 has its CatchHandler @ 00895f90 */
    FUN_0088d1d0(param_1,uVar7,uVar4,1);
    *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
  }
  else {
    uVar8 = uVar4 & 0xff;
  }
  uVar7 = FUN_00875ec8(*param_1);
  FUN_00875b54(*param_1,0x49,0x39,uVar4,0);
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x20),param_7,1);
  uVar1 = (param_7 & 0xff) + 1;
  if (uVar1 != uVar8) {
    FUN_00875b54(*param_1,6,uVar1,uVar4,0);
  }
  FUN_00875b54(*param_1,0x3f,param_7 + 2,0,0);
  uVar5 = FUN_00875ec8(*param_1);
  uVar6 = FUN_00876054(*param_1,uVar7,uVar5);
  if ((uVar6 & 1) == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(*(long *)(param_2 + 0x20) + 0xc,
                 "Exceeded jump distance limit; simplify the code to compile");
  }
  iVar2 = 0;
  if ((param_6 & 1) == 0) {
    iVar2 = (int)param_4 + 1;
  }
  FUN_00875b54(*param_1,0x15,param_7,0,iVar2);
  if (((param_5 & 1) == 0) && ((param_4 & 0xff) != 0)) {
    uVar6 = 0;
    do {
      FUN_00875b54(*param_1,6,param_3 + (int)uVar6,param_7 + (int)uVar6,0);
      uVar6 = uVar6 + 1;
    } while ((param_4 & 0xff) != uVar6);
  }
  return;
}

