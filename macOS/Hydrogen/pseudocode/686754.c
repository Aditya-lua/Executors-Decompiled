
void FUN_00686754(long *param_1,undefined8 param_2,long param_3,long param_4,ulong param_5)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  byte bVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  
  uVar5 = *(uint *)(param_1 + 5);
  lVar9 = (ulong)uVar5 - 1;
  do {
    bVar6 = *(byte *)(param_1[0xb] + lVar9);
    uVar8 = 0x100 - (ulong)bVar6;
    uVar2 = param_5;
    if (uVar8 <= param_5) {
      uVar2 = uVar8;
    }
    lVar7 = uVar2 * uVar5;
    lVar3 = 0;
    if (param_3 != 0) {
      lVar3 = lVar7;
    }
    lVar4 = 0;
    if (param_4 != 0) {
      lVar4 = lVar7;
    }
    (**(code **)(*(long *)(param_1[2] + 8) + 0x58))
              ((long *)(param_1[2] + 8),param_1[0xb],param_4,param_3,lVar7,0x11);
    uVar1 = (uint)bVar6 + (int)uVar2;
    *(char *)(param_1[0xb] + lVar9) = (char)uVar1;
    if ((uVar1 & 0xff) == 0) {
      (**(code **)(*param_1 + 0xb8))(param_1);
    }
    param_3 = param_3 + lVar3;
    param_4 = param_4 + lVar4;
    param_5 = param_5 - uVar2;
  } while (param_5 != 0);
  return;
}

