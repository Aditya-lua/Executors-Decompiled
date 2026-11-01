int FUN_180e3da08(uint param_1,short *param_2,uint param_3,longlong param_4)

{
  char cVar1;
  longlong lVar2;
  int iVar3;
  short sVar4;
  short sVar5;
  int iVar6;
  undefined4 uVar7;
  ulonglong uVar8;
  ulonglong *puVar9;
  int iVar10;
  longlong lVar11;
  ulonglong uVar12;
  short *psVar13;
  undefined8 uStack_70;
  int iStack_68;
  ulonglong uStack_60;
  undefined4 auStack_50 [4];
  
  iVar10 = 0;
  uVar12 = (ulonglong)param_3;
  if (param_3 == 0) {
    return 0;
  }
  if (param_2 == (short *)0x0) {
LAB_180e3da38:
    *(undefined1 *)(param_4 + 0x38) = 1;
    *(undefined4 *)(param_4 + 0x34) = 0;
    *(undefined1 *)(param_4 + 0x30) = 1;
    *(undefined4 *)(param_4 + 0x2c) = 0x16;
    FUN_180e2c42c(0,0,0,0,0,param_4);
    return -1;
  }
  uVar8 = (ulonglong)(param_1 & 0x3f);
  lVar11 = (longlong)(int)param_1 >> 6;
  lVar2 = *(longlong *)(lVar11 * 8 + 0x1810d49f0);
  cVar1 = *(char *)(lVar2 + 0x39 + uVar8 * 0x48);
  if (((byte)(cVar1 - 1U) < 2) && ((~param_3 & 1) == 0)) goto LAB_180e3da38;
  if ((*(byte *)(lVar2 + 0x38 + uVar8 * 0x48) & 0x20) != 0) {
    func_0x000180e3eeac(param_1,0,2);
  }
  uStack_60 = 0;
  iVar6 = FUN_180e4d64c();
  if ((iVar6 == 0) ||
     (-1 < *(char *)(*(longlong *)(lVar11 * 8 + 0x1810d49f0) + 0x38 + uVar8 * 0x48))) {
LAB_180e3dbf0:
    lVar2 = *(longlong *)(lVar11 * 8 + 0x1810d49f0);
    if (-1 < *(char *)(lVar2 + 0x38 + (ulonglong)(param_1 & 0x3f) * 0x48)) {
      uStack_70 = 0;
      iStack_68 = 0;
      iVar6 = WriteFile(*(undefined8 *)(lVar2 + 0x28 + (ulonglong)(param_1 & 0x3f) * 0x48),param_2,
                        uVar12,(longlong)&uStack_70 + 4,0);
      iVar10 = iStack_68;
      uVar8 = uStack_70;
      if (iVar6 == 0) {
        uVar7 = GetLastError();
        uStack_70 = CONCAT44(uStack_70._4_4_,uVar7);
        iVar10 = iStack_68;
        uVar8 = uStack_70;
      }
      goto LAB_180e3dca5;
    }
    if (cVar1 == '\0') {
      puVar9 = (ulonglong *)FUN_180e3d4b8(&uStack_70,param_1,param_2,uVar12);
    }
    else if (cVar1 == '\x01') {
      puVar9 = (ulonglong *)FUN_180e3d6dc(&uStack_70,param_1,param_2,uVar12);
    }
    else {
      iVar10 = 0;
      uVar8 = uStack_60;
      if (cVar1 != '\x02') goto LAB_180e3dca5;
      puVar9 = (ulonglong *)FUN_180e3d5c0(&uStack_70,param_1,param_2,uVar12);
    }
  }
  else {
    if (*(char *)(param_4 + 0x28) == '\0') {
      FUN_180e23dd0();
    }
    if ((*(longlong *)(*(longlong *)(param_4 + 0x18) + 0x138) == 0) &&
       (*(char *)(*(longlong *)(lVar11 * 8 + 0x1810d49f0) + 0x39 + uVar8 * 0x48) == '\0'))
    goto LAB_180e3dbf0;
    auStack_50[0] = 0;
    iVar6 = GetConsoleMode(*(undefined8 *)
                            (*(longlong *)(lVar11 * 8 + 0x1810d49f0) + 0x28 + uVar8 * 0x48),
                           auStack_50);
    if (iVar6 == 0) goto LAB_180e3dbf0;
    if (cVar1 != '\0') {
      if ((cVar1 == '\x01') || (uVar8 = uStack_60, cVar1 == '\x02')) {
        uStack_70 = 0;
        uVar8 = uStack_70;
        if (param_2 < (short *)((longlong)param_2 + uVar12)) {
          uStack_70._4_4_ = 0;
          psVar13 = param_2;
          iVar6 = uStack_70._4_4_;
          do {
            sVar5 = *psVar13;
            sVar4 = FUN_180e4d6ac(sVar5);
            if (sVar4 != sVar5) {
LAB_180e3dbb8:
              uVar7 = GetLastError();
              uStack_70 = CONCAT44(uStack_70._4_4_,uVar7);
              uVar8 = uStack_70;
              break;
            }
            uStack_70 = CONCAT44(iVar6 + 2,(undefined4)uStack_70);
            iVar3 = iVar6 + 2;
            if (sVar5 == 10) {
              sVar5 = FUN_180e4d6ac(0xd);
              if (sVar5 != 0xd) goto LAB_180e3dbb8;
              uStack_70 = CONCAT44(iVar6 + 3,(undefined4)uStack_70);
              iVar10 = iVar10 + 1;
              iVar3 = iVar6 + 3;
            }
            iVar6 = iVar3;
            psVar13 = psVar13 + 1;
            uVar8 = uStack_70;
          } while (psVar13 < (short *)((longlong)param_2 + uVar12));
        }
      }
      goto LAB_180e3dca5;
    }
    puVar9 = (ulonglong *)FUN_180e3d024(&uStack_70,param_1,param_2,uVar12,param_4);
  }
  iVar10 = (int)puVar9[1];
  uVar8 = *puVar9;
LAB_180e3dca5:
  uStack_60 = uVar8;
  iVar6 = (int)(uStack_60 >> 0x20);
  if (iVar6 != 0) {
    return iVar6 - iVar10;
  }
  if ((int)uStack_60 != 0) {
    if ((int)uStack_60 == 5) {
      *(undefined1 *)(param_4 + 0x30) = 1;
      *(undefined4 *)(param_4 + 0x2c) = 9;
      *(undefined1 *)(param_4 + 0x38) = 1;
      *(undefined4 *)(param_4 + 0x34) = 5;
      return -1;
    }
    FUN_180e1dad8(uStack_60 & 0xffffffff,param_4);
    return -1;
  }
  if (((*(byte *)(*(longlong *)(lVar11 * 8 + 0x1810d49f0) + 0x38 +
                 (ulonglong)(param_1 & 0x3f) * 0x48) & 0x40) != 0) && ((char)*param_2 == '\x1a')) {
    return 0;
  }
  *(undefined4 *)(param_4 + 0x34) = 0;
  *(undefined1 *)(param_4 + 0x30) = 1;
  *(undefined4 *)(param_4 + 0x2c) = 0x1c;
  *(undefined1 *)(param_4 + 0x38) = 1;
  return -1;
}


