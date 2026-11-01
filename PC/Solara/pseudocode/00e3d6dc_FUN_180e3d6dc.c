/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e3d6dc(undefined8 *param_1,uint param_2,short *param_3,ulonglong param_4)

{
  short sVar1;
  undefined8 uVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  longlong lVar6;
  uint uVar7;
  ulonglong uVar8;
  short *psVar9;
  short *psVar10;
  short *psVar11;
  undefined8 uStackX_10;
  undefined8 uStack_30;
  
  uStack_30 = 0x180e3d6f8;
  lVar6 = FUN_180e15b20();
  lVar6 = -lVar6;
  *(ulonglong *)(&stack0x00001438 + lVar6) =
       _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffd8 + lVar6);
  psVar11 = (short *)((param_4 & 0xffffffff) + (longlong)param_3);
  uVar2 = *(undefined8 *)
           (*(longlong *)(((longlong)(int)param_2 >> 6) * 8 + 0x1810d49f0) + 0x28 +
           (ulonglong)(param_2 & 0x3f) * 0x48);
  *param_1 = 0;
  *(undefined4 *)(param_1 + 1) = 0;
  psVar9 = param_3;
  do {
    if (psVar11 <= psVar9) {
LAB_180e3d821:
      *(undefined8 *)((longlong)&uStack_30 + lVar6) = 0x180e3d834;
      FUN_180e155e0(*(ulonglong *)(&stack0x00001438 + lVar6) ^
                    (ulonglong)(&stack0xffffffffffffffd8 + lVar6));
      return;
    }
    psVar10 = (short *)(&stack0x00000028 + lVar6);
    do {
      if (psVar11 <= psVar9) break;
      sVar1 = *psVar9;
      psVar9 = psVar9 + 1;
      if (sVar1 == 10) {
        *psVar10 = 0xd;
        psVar10 = psVar10 + 1;
      }
      *psVar10 = sVar1;
      psVar10 = psVar10 + 1;
    } while (psVar10 < &stack0x000006d0 + lVar6);
    *(undefined8 *)((longlong)&uStackX_10 + lVar6) = 0;
    *(undefined8 *)(&stack0x00000008 + lVar6) = 0;
    *(undefined4 *)(&stack0x00000000 + lVar6) = 0xd55;
    *(undefined1 **)(&stack0xfffffffffffffff8 + lVar6) = &stack0x000006d8 + lVar6;
    *(undefined8 *)((longlong)&uStack_30 + lVar6) = 0x180e3d7c2;
    uVar3 = FUN_180e3fd50(0xfde9,0,&stack0x00000028 + lVar6,
                          (longlong)psVar10 - (longlong)(&stack0x00000028 + lVar6) >> 1);
    if (uVar3 == 0) {
LAB_180e3d819:
      *(undefined8 *)((longlong)&uStack_30 + lVar6) = 0x180e3d81f;
      uVar5 = GetLastError();
      *(undefined4 *)param_1 = uVar5;
      goto LAB_180e3d821;
    }
    uVar8 = 0;
    if (uVar3 != 0) {
      do {
        *(undefined4 *)(&stack0x00000018 + lVar6) = 0;
        *(undefined8 *)(&stack0xfffffffffffffff8 + lVar6) = 0;
        *(undefined8 *)((longlong)&uStack_30 + lVar6) = 0x180e3d7fa;
        iVar4 = WriteFile(uVar2,&stack0x000006d8 + uVar8 + lVar6,uVar3 - (int)uVar8,
                          &stack0x00000018 + lVar6);
        if (iVar4 == 0) goto LAB_180e3d819;
        uVar7 = (int)uVar8 + *(int *)(&stack0x00000018 + lVar6);
        uVar8 = (ulonglong)uVar7;
      } while (uVar7 < uVar3);
    }
    *(int *)((longlong)param_1 + 4) = (int)psVar9 - (int)param_3;
  } while( true );
}


