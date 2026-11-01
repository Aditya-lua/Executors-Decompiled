/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e3d5c0(undefined8 *param_1,uint param_2,short *param_3,ulonglong param_4)

{
  short sVar1;
  uint uVar2;
  undefined8 uVar3;
  uint uVar4;
  int iVar5;
  undefined4 uVar6;
  longlong lVar7;
  short *psVar8;
  short *psVar9;
  undefined8 uStack_20;
  
  uStack_20 = 0x180e3d5d8;
  lVar7 = FUN_180e15b20();
  lVar7 = -lVar7;
  *(ulonglong *)(&stack0x00001428 + lVar7) =
       _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffe8 + lVar7);
  psVar9 = (short *)((param_4 & 0xffffffff) + (longlong)param_3);
  uVar3 = *(undefined8 *)
           (*(longlong *)(((longlong)(int)param_2 >> 6) * 8 + 0x1810d49f0) + 0x28 +
           (ulonglong)(param_2 & 0x3f) * 0x48);
  *param_1 = 0;
  *(undefined4 *)(param_1 + 1) = 0;
  do {
    if (psVar9 <= param_3) break;
    psVar8 = (short *)(&stack0x00000028 + lVar7);
    do {
      if (psVar9 <= param_3) break;
      sVar1 = *param_3;
      param_3 = param_3 + 1;
      if (sVar1 == 10) {
        *(int *)(param_1 + 1) = *(int *)(param_1 + 1) + 2;
        *psVar8 = 0xd;
        psVar8 = psVar8 + 1;
      }
      *psVar8 = sVar1;
      psVar8 = psVar8 + 1;
    } while (psVar8 < &stack0x00001426 + lVar7);
    *(undefined4 *)(&stack0x00000018 + lVar7) = 0;
    *(undefined8 *)(&stack0x00000008 + lVar7) = 0;
    uVar4 = (int)((longlong)psVar8 - (longlong)(&stack0x00000028 + lVar7) >> 1) * 2;
    *(undefined8 *)((longlong)&uStack_20 + lVar7) = 0x180e3d692;
    iVar5 = WriteFile(uVar3,&stack0x00000028 + lVar7,uVar4,&stack0x00000018 + lVar7);
    if (iVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar7) = 0x180e3d6ae;
      uVar6 = GetLastError();
      *(undefined4 *)param_1 = uVar6;
      break;
    }
    uVar2 = *(uint *)(&stack0x00000018 + lVar7);
    *(int *)((longlong)param_1 + 4) = *(int *)((longlong)param_1 + 4) + uVar2;
  } while (uVar4 <= uVar2);
  *(undefined8 *)((longlong)&uStack_20 + lVar7) = 0x180e3d6c3;
  FUN_180e155e0(*(ulonglong *)(&stack0x00001428 + lVar7) ^
                (ulonglong)(&stack0xffffffffffffffe8 + lVar7));
  return;
}


