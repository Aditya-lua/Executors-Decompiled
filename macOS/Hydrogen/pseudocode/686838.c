
void FUN_00686838(long param_1,undefined8 param_2,long param_3,long param_4,ulong param_5)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  byte bVar6;
  long *plVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long *plStack0000000000000008;
  
  plStack0000000000000008 = (long *)(param_1 + -0x38);
  uVar5 = *(uint *)(param_1 + -0x10);
  lVar10 = (ulong)uVar5 - 1;
  do {
    bVar6 = *(byte *)(*(long *)(param_1 + 0x20) + lVar10);
    uVar9 = 0x100 - (ulong)bVar6;
    uVar2 = param_5;
    if (uVar9 <= param_5) {
      uVar2 = uVar9;
    }
    lVar8 = uVar2 * uVar5;
    lVar3 = 0;
    if (param_3 != 0) {
      lVar3 = lVar8;
    }
    lVar4 = 0;
    if (param_4 != 0) {
      lVar4 = lVar8;
    }
    plVar7 = (long *)(*(long *)(param_1 + -0x28) + 8);
    (**(code **)(*plVar7 + 0x58))(plVar7,*(long *)(param_1 + 0x20),param_4,param_3,lVar8,0x11);
    uVar1 = (uint)bVar6 + (int)uVar2;
    *(char *)(*(long *)(param_1 + 0x20) + lVar10) = (char)uVar1;
    if ((uVar1 & 0xff) == 0) {
      (**(code **)(*plStack0000000000000008 + 0xb8))();
    }
    param_3 = param_3 + lVar3;
    param_4 = param_4 + lVar4;
    param_5 = param_5 - uVar2;
  } while (param_5 != 0);
  return;
}

