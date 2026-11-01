
void FUN_006bc494(undefined8 param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4)

{
  byte bVar1;
  bool bVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined1 uVar5;
  int iVar6;
  uint uVar7;
  long lVar8;
  ulong uVar9;
  undefined8 uVar10;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  long *plVar16;
  byte bVar17;
  long *plVar18;
  undefined1 auStack_71c [16];
  undefined1 uStack_70c;
  undefined8 uStack_708;
  undefined8 uStack_700;
  undefined8 uStack_6f8;
  undefined8 uStack_6f0;
  undefined8 uStack_6e8;
  undefined8 uStack_6e0;
  undefined8 uStack_6d8;
  undefined8 uStack_6d0;
  undefined8 uStack_6c8;
  undefined8 uStack_6c0;
  undefined8 uStack_6b8;
  undefined *puStack_6b0;
  char *pcStack_6a8;
  char *pcStack_6a0;
  undefined1 auStack_5f0 [176];
  long lStack_540;
  long lStack_538;
  long lStack_530;
  ulong uStack_528;
  undefined1 auStack_518 [40];
  undefined1 auStack_4f0 [40];
  undefined1 auStack_4c8 [40];
  undefined1 auStack_4a0 [40];
  undefined1 auStack_478 [40];
  long lStack_450;
  long lStack_448;
  ulong uStack_440;
  ulong uStack_438;
  undefined1 auStack_428 [40];
  undefined1 auStack_400 [40];
  undefined1 auStack_3d8 [40];
  undefined1 auStack_3b0 [568];
  undefined1 *puStack_178;
  undefined1 uStack_170;
  char cStack_157;
  char acStack_156 [174];
  undefined *puStack_a8;
  undefined8 **ppuStack_a0;
  undefined2 uStack_98;
  undefined8 *puStack_90;
  undefined8 *puStack_88;
  undefined8 *puStack_80;
  undefined1 uStack_71;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long *plStack_40;
  long *plStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  
  uStack_48 = param_4[5];
  uStack_50 = param_4[4];
  plStack_38 = (long *)param_4[7];
  plStack_40 = (long *)param_4[6];
  uStack_28 = param_4[9];
  uStack_30 = param_4[8];
  uStack_68 = param_4[1];
  uStack_70 = *param_4;
  uStack_58 = param_4[3];
  uStack_60 = param_4[2];
  uStack_20 = param_4[10];
  uStack_71 = 0;
  plVar18 = (long *)param_2[3];
  if ((long *)param_2[2] == plVar18) {
    bVar2 = false;
  }
  else {
    bVar2 = false;
    plVar16 = (long *)param_2[2] + 3;
    do {
      if ((char)plVar16[-3] != '\0') {
        bVar1 = *(byte *)((long)plVar16 + 0x17);
        if ((char)bVar1 < '\0') {
          uVar9 = plVar16[1];
          if (8 < uVar9) {
            uVar9 = 9;
          }
          iVar6 = _memcmp(*plVar16,"optimize ",uVar9);
          if (8 < uVar9 && iVar6 == 0) goto LAB_006bc590;
LAB_006bc550:
          uVar9 = plVar16[1];
          if (-1 < (char)bVar1) {
            uVar9 = (ulong)bVar1;
          }
        }
        else {
          bVar17 = bVar1;
          if (8 < bVar1) {
            bVar17 = 9;
          }
          iVar6 = _memcmp(plVar16,"optimize ",bVar17);
          if (bVar17 < 9 || iVar6 != 0) goto LAB_006bc550;
LAB_006bc590:
          plVar11 = plVar16;
          if ((char)bVar1 < '\0') {
            plVar11 = (long *)*plVar16;
          }
          uVar7 = _atoi((long)plVar11 + 9);
          if (1 < (int)uVar7) {
            uVar7 = 2;
          }
          uStack_70 = CONCAT44(uStack_70._4_4_,uVar7 & ((int)uVar7 >> 0x1f ^ 0xffffffffU));
          uVar9 = plVar16[1];
          if (-1 < (char)bVar1) {
            uVar9 = (ulong)bVar1;
          }
        }
        if (uVar9 == 6) {
          plVar11 = (long *)*plVar16;
          if (-1 < (char)bVar1) {
            plVar11 = plVar16;
          }
          if ((int)*plVar11 == 0x6974616e && *(short *)((long)plVar11 + 4) == 0x6576) {
            bVar2 = true;
            uStack_71 = 1;
            uStack_70._4_4_ = (undefined4)((ulong)uStack_70 >> 0x20);
            uStack_70 = CONCAT44(uStack_70._4_4_,2);
            uStack_68._4_4_ = (undefined4)((ulong)uStack_68 >> 0x20);
            uStack_68 = CONCAT44(uStack_68._4_4_,1);
          }
        }
      }
      plVar11 = plVar16 + 3;
      plVar16 = plVar16 + 6;
    } while (plVar11 != plVar18);
  }
  param_2 = (undefined8 *)*param_2;
  puStack_88 = (undefined8 *)0x0;
  puStack_90 = (undefined8 *)0x0;
  puStack_80 = (undefined8 *)0x0;
  puStack_a8 = &UNK_00a1a578;
  ppuStack_a0 = &puStack_90;
  uStack_98 = 0;
  puStack_90 = (undefined8 *)__Znwm(0x80);
  puStack_80 = puStack_90 + 0x10;
  puStack_88 = puStack_90;
  (**(code **)*param_2)(param_2,&puStack_a8);
  if (uStack_98._1_1_ != '\0') {
    uStack_70 = CONCAT44(uStack_70._4_4_,2);
    uStack_68 = CONCAT44(uStack_68._4_4_,1);
  }
  func_0x006be314(auStack_5f0,param_1,&uStack_70,param_3);
  func_0x006e021c(&lStack_540,param_3,uStack_48);
  func_0x006e043c(&lStack_540,auStack_518,param_2);
  if ((0 < (int)uStack_70) &&
     ((lVar8 = func_0x0070b968(param_3,"getfenv"), lVar8 != 0 ||
      (lVar8 = func_0x0070b968(param_3,"setfenv"), lVar8 != 0)))) {
    pcStack_6a8 = &cStack_157;
    pcStack_6a0 = acStack_156;
    puStack_6b0 = &UNK_00a1a7b0;
    (**(code **)*param_2)(param_2,&puStack_6b0);
  }
  if (((1 < (int)uStack_70) && (cStack_157 == '\0')) && (acStack_156[0] == '\0')) {
    puStack_178 = auStack_478;
    uVar9 = func_0x0070b968(param_3,"math");
    if (uVar9 == 0) {
code_r0x006bc7cc:
      if (plStack_38 != (long *)0x0) {
        lVar8 = *plStack_38;
        plVar18 = plStack_38;
        while (lVar8 != 0) {
          uVar9 = func_0x0070b968(param_3);
          if (uVar9 != 0) {
            if ((lStack_530 == 0) || (uStack_528 == uVar9)) goto code_r0x006bc850;
            uVar12 = 0;
            uVar13 = uVar9 >> 4 ^ uVar9 >> 9;
            while( true ) {
              uVar13 = uVar13 & lStack_538 - 1U;
              uVar14 = *(ulong *)(lStack_540 + uVar13 * 0x10);
              if (uVar14 == uVar9) break;
              uVar12 = uVar12 + 1;
              uVar13 = uVar12 + uVar13;
              if (uVar14 == uStack_528 || lStack_538 - 1U < uVar12) goto code_r0x006bc850;
            }
            if (*(int *)(lStack_540 + uVar13 * 0x10 + 8) == 0) goto code_r0x006bc850;
          }
          plVar18 = plVar18 + 1;
          lVar8 = *plVar18;
        }
      }
    }
    else {
      if ((lStack_530 != 0) && (uStack_528 != uVar9)) {
        uVar12 = 0;
        uVar13 = uVar9 >> 4 ^ uVar9 >> 9;
        do {
          uVar13 = uVar13 & lStack_538 - 1U;
          uVar14 = *(ulong *)(lStack_540 + uVar13 * 0x10);
          if (uVar14 == uVar9) {
            if (*(int *)(lStack_540 + uVar13 * 0x10 + 8) != 0) goto code_r0x006bc7cc;
            break;
          }
          uVar12 = uVar12 + 1;
          uVar13 = uVar12 + uVar13;
        } while (uVar14 != uStack_528 && uVar12 <= lStack_538 - 1U);
      }
code_r0x006bc850:
      uStack_170 = 1;
    }
  }
  if (0 < (int)uStack_70) {
    func_0x006d221c(auStack_478,&lStack_540,auStack_518,&uStack_70,param_2,param_3);
    func_0x006d621c(auStack_4f0,auStack_518,auStack_4c8,puStack_178,uStack_170,uStack_28,param_2,
                    param_3);
    func_0x006db3bc(auStack_4a0,param_2);
  }
  if ((plStack_40 != (long *)0x0) && (*plStack_40 != 0)) {
    plVar18 = plStack_40;
    do {
      uVar9 = func_0x0070b968(param_3);
      if (uVar9 != 0) {
        uVar5 = func_0x006b2c94(param_1,uVar9);
        if ((ulong)(lStack_448 * 3) >> 2 <= uStack_440) {
          if ((uStack_440 != 0) && (uStack_438 != uVar9)) {
            uVar12 = 0;
            uVar13 = uVar9 >> 4 ^ uVar9 >> 9;
            do {
              uVar13 = uVar13 & lStack_448 - 1U;
              uVar14 = *(ulong *)(lStack_450 + uVar13 * 0x10);
              if (uVar14 == uVar9) goto code_r0x006bc980;
              uVar12 = uVar12 + 1;
              uVar13 = uVar12 + uVar13;
            } while (uVar14 != uStack_438 && uVar12 <= lStack_448 - 1U);
          }
          func_0x006d0b38(&lStack_450);
        }
code_r0x006bc980:
        uVar12 = (uVar9 >> 4 ^ uVar9 >> 9) & lStack_448 - 1U;
        uVar13 = *(ulong *)(lStack_450 + uVar12 * 0x10);
        if (uVar13 != uStack_438) {
          lVar8 = 1;
          do {
            if (uVar13 == uVar9) goto code_r0x006bc8e8;
            uVar12 = uVar12 + lVar8 & lStack_448 - 1U;
            uVar13 = *(ulong *)(lStack_450 + uVar12 * 0x10);
            lVar8 = lVar8 + 1;
          } while (uVar13 != uStack_438);
        }
        *(ulong *)(lStack_450 + uVar12 * 0x10) = uVar9;
        uStack_440 = uStack_440 + 1;
code_r0x006bc8e8:
        *(undefined1 *)(lStack_450 + uVar12 * 0x10 + 8) = uVar5;
      }
      plVar18 = plVar18 + 1;
    } while (*plVar18 != 0);
    if (0x100 < (ulong)((long)plVar18 - (long)plStack_40)) {
      func_0x006bc388((long)param_2 + 0xc,"Exceeded userdata type limit in the compilation options")
      ;
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x6bcb54);
      (*pcVar4)();
    }
  }
  if ((0 < (int)uStack_68) || (1 < (int)uStack_70)) {
    func_0x006dcdf0(auStack_428,auStack_400,auStack_3d8,param_2,uStack_50,&lStack_450,auStack_3b0,
                    auStack_478,&lStack_540,uStack_30,param_1);
  }
  puVar3 = puStack_88;
  for (puVar15 = puStack_90; puVar15 != puVar3; puVar15 = puVar15 + 1) {
    puStack_6b0 = (undefined *)((ulong)puStack_6b0 & 0xffffffffffffff00);
    func_0x006bcbc0(auStack_5f0,*puVar15,&puStack_6b0);
    if ((((byte)puStack_6b0 >> 2 & 1) != 0) && (!bVar2)) {
      uStack_71 = bVar2;
    }
  }
  uStack_6c0 = 0;
  uStack_6b8 = 0;
  uStack_6d0 = 0;
  uStack_6c8 = 0;
  uStack_6e0 = 0;
  uStack_6d8 = 0;
  uStack_6f0 = 0;
  uStack_6e8 = 0;
  uStack_700 = 0;
  uStack_6f8 = 0;
  uStack_708 = 0;
  auStack_71c[0] = 0;
  uStack_70c = 0;
  func_0x00706378(&puStack_6b0,(long)param_2 + 0xc,&uStack_6c0,&uStack_6d0,&uStack_6e0,0,&uStack_6f0
                  ,1,&uStack_700,param_2,0,&uStack_708,0,0,auStack_71c);
  uVar10 = func_0x006bcbc0(auStack_5f0,&puStack_6b0,&uStack_71);
  func_0x006b0e28(param_1,uVar10);
  func_0x006b33ec(param_1);
  func_0x006d03d8(auStack_5f0);
  if (puStack_90 != (undefined8 *)0x0) {
    puStack_88 = puStack_90;
    __ZdlPv();
  }
  return;
}

