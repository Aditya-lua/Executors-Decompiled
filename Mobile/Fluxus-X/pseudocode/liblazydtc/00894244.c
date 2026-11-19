/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00894244
 */

void FUN_00894244(undefined8 *param_1,ulong param_2,undefined4 param_3,long param_4,
                 undefined4 param_5)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  
  uVar3 = FUN_008868ec(param_1,param_4);
  if (uVar3 < 0x100) {
    uVar5 = 0x2f;
    if ((param_2 & 1) == 0) {
      uVar5 = 0x30;
    }
    FUN_00875b54(*param_1,uVar5,param_5,param_3,uVar3);
    return;
  }
  uVar5 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 008942b0 to 00894347 has its CatchHandler @ 00894348 */
  iVar4 = FUN_0088df20(param_1,param_4);
  if (iVar4 < 0) {
    iVar2 = *(int *)((long)param_1 + 0x64c);
    uVar3 = iVar2 + 1;
    if (0xff < uVar3) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_4 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                   ,iVar4);
    }
    *(uint *)((long)param_1 + 0x64c) = uVar3;
    uVar1 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar3) {
      uVar1 = uVar3;
    }
    *(uint *)(param_1 + 0xca) = uVar1;
    iVar4 = FUN_00891438(param_1,param_4,iVar2,0xff);
  }
  uVar6 = 0x2d;
  if ((param_2 & 1) == 0) {
    uVar6 = 0x2e;
  }
  FUN_00875b54(*param_1,uVar6,param_5,param_3,iVar4);
  *(undefined4 *)((long)param_1 + 0x64c) = uVar5;
  return;
}

