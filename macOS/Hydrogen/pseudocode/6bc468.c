
void FUN_006bc468(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  byte bVar1;
  bool bVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined1 uVar5;
  int iVar6;
  uint uVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  long *plVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  long *plVar18;
  byte bVar19;
  long *plVar20;
  undefined1 auVar21 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined1 auStack_77c [16];
  undefined1 uStack_76c;
  undefined8 uStack_768;
  undefined8 uStack_760;
  undefined8 uStack_758;
  undefined8 uStack_750;
  undefined8 uStack_748;
  undefined8 uStack_740;
  undefined8 uStack_738;
  undefined8 uStack_730;
  undefined8 uStack_728;
  undefined8 uStack_720;
  undefined8 uStack_718;
  undefined *puStack_710;
  char *pcStack_708;
  char *pcStack_700;
  undefined1 auStack_650 [176];
  long lStack_5a0;
  long lStack_598;
  long lStack_590;
  ulong uStack_588;
  undefined1 auStack_578 [40];
  undefined1 auStack_550 [40];
  undefined1 auStack_528 [40];
  undefined1 auStack_500 [40];
  undefined1 auStack_4d8 [40];
  long lStack_4b0;
  long lStack_4a8;
  ulong uStack_4a0;
  ulong uStack_498;
  undefined1 auStack_488 [40];
  undefined1 auStack_460 [40];
  undefined1 auStack_438 [40];
  undefined1 auStack_410 [568];
  undefined1 *puStack_1d8;
  undefined1 uStack_1d0;
  char cStack_1b7;
  char acStack_1b6 [174];
  undefined *puStack_108;
  undefined8 **ppuStack_100;
  undefined2 uStack_f8;
  undefined8 *puStack_f0;
  undefined8 *puStack_e8;
  undefined8 *puStack_e0;
  undefined1 uStack_d1;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  long *plStack_a0;
  long *plStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  
  while (__ZdlPv(in_stack_00000000), -1 < in_stack_00000030) {
    __Unwind_Resume();
  }
  __ZdlPv(in_stack_00000020);
  auVar21 = __Unwind_Resume();
  puVar17 = auVar21._8_8_;
  uVar8 = auVar21._0_8_;
  uStack_a8 = param_4[5];
  uStack_b0 = param_4[4];
  plStack_98 = (long *)param_4[7];
  plStack_a0 = (long *)param_4[6];
  uStack_88 = param_4[9];
  uStack_90 = param_4[8];
  uStack_c8 = param_4[1];
  uStack_d0 = *param_4;
  uStack_b8 = param_4[3];
  uStack_c0 = param_4[2];
  uStack_80 = param_4[10];
  uStack_d1 = 0;
  plVar20 = (long *)puVar17[3];
  if ((long *)puVar17[2] == plVar20) {
    bVar2 = false;
  }
  else {
    bVar2 = false;
    plVar18 = (long *)puVar17[2] + 3;
    do {
      if ((char)plVar18[-3] != '\0') {
        bVar1 = *(byte *)((long)plVar18 + 0x17);
        if ((char)bVar1 < '\0') {
          uVar10 = plVar18[1];
          if (8 < uVar10) {
            uVar10 = 9;
          }
          iVar6 = _memcmp(*plVar18,"optimize ",uVar10);
          if (8 < uVar10 && iVar6 == 0) goto code_r0x006bc590;
code_r0x006bc550:
          uVar10 = plVar18[1];
          if (-1 < (char)bVar1) {
            uVar10 = (ulong)bVar1;
          }
        }
        else {
          bVar19 = bVar1;
          if (8 < bVar1) {
            bVar19 = 9;
          }
          iVar6 = _memcmp(plVar18,"optimize ",bVar19);
          if (bVar19 < 9 || iVar6 != 0) goto code_r0x006bc550;
code_r0x006bc590:
          plVar12 = plVar18;
          if ((char)bVar1 < '\0') {
            plVar12 = (long *)*plVar18;
          }
          uVar7 = _atoi((long)plVar12 + 9);
          if (1 < (int)uVar7) {
            uVar7 = 2;
          }
          uStack_d0 = CONCAT44(uStack_d0._4_4_,uVar7 & ((int)uVar7 >> 0x1f ^ 0xffffffffU));
          uVar10 = plVar18[1];
          if (-1 < (char)bVar1) {
            uVar10 = (ulong)bVar1;
          }
        }
        if (uVar10 == 6) {
          plVar12 = (long *)*plVar18;
          if (-1 < (char)bVar1) {
            plVar12 = plVar18;
          }
          if ((int)*plVar12 == 0x6974616e && *(short *)((long)plVar12 + 4) == 0x6576) {
            bVar2 = true;
            uStack_d1 = 1;
            uStack_d0._4_4_ = (undefined4)((ulong)uStack_d0 >> 0x20);
            uStack_d0 = CONCAT44(uStack_d0._4_4_,2);
            uStack_c8._4_4_ = (undefined4)((ulong)uStack_c8 >> 0x20);
            uStack_c8 = CONCAT44(uStack_c8._4_4_,1);
          }
        }
      }
      plVar12 = plVar18 + 3;
      plVar18 = plVar18 + 6;
    } while (plVar12 != plVar20);
  }
  puVar17 = (undefined8 *)*puVar17;
  puStack_e8 = (undefined8 *)0x0;
  puStack_f0 = (undefined8 *)0x0;
  puStack_e0 = (undefined8 *)0x0;
  puStack_108 = &UNK_00a1a578;
  ppuStack_100 = &puStack_f0;
  uStack_f8 = 0;
  puStack_f0 = (undefined8 *)__Znwm(0x80);
  puStack_e0 = puStack_f0 + 0x10;
  puStack_e8 = puStack_f0;
  (**(code **)*puVar17)(puVar17,&puStack_108);
  if (uStack_f8._1_1_ != '\0') {
    uStack_d0 = CONCAT44(uStack_d0._4_4_,2);
    uStack_c8 = CONCAT44(uStack_c8._4_4_,1);
  }
  func_0x006be314(auStack_650,uVar8,&uStack_d0,param_3);
  func_0x006e021c(&lStack_5a0,param_3,uStack_a8);
  func_0x006e043c(&lStack_5a0,auStack_578,puVar17);
  if ((0 < (int)uStack_d0) &&
     ((lVar9 = func_0x0070b968(param_3,"getfenv"), lVar9 != 0 ||
      (lVar9 = func_0x0070b968(param_3,"setfenv"), lVar9 != 0)))) {
    pcStack_708 = &cStack_1b7;
    pcStack_700 = acStack_1b6;
    puStack_710 = &UNK_00a1a7b0;
    (**(code **)*puVar17)(puVar17,&puStack_710);
  }
  if (((1 < (int)uStack_d0) && (cStack_1b7 == '\0')) && (acStack_1b6[0] == '\0')) {
    puStack_1d8 = auStack_4d8;
    uVar10 = func_0x0070b968(param_3,"math");
    if (uVar10 == 0) {
code_r0x006bc7cc:
      if (plStack_98 != (long *)0x0) {
        lVar9 = *plStack_98;
        plVar20 = plStack_98;
        while (lVar9 != 0) {
          uVar10 = func_0x0070b968(param_3);
          if (uVar10 != 0) {
            if ((lStack_590 == 0) || (uStack_588 == uVar10)) goto code_r0x006bc850;
            uVar13 = 0;
            uVar14 = uVar10 >> 4 ^ uVar10 >> 9;
            while( true ) {
              uVar14 = uVar14 & lStack_598 - 1U;
              uVar15 = *(ulong *)(lStack_5a0 + uVar14 * 0x10);
              if (uVar15 == uVar10) break;
              uVar13 = uVar13 + 1;
              uVar14 = uVar13 + uVar14;
              if (uVar15 == uStack_588 || lStack_598 - 1U < uVar13) goto code_r0x006bc850;
            }
            if (*(int *)(lStack_5a0 + uVar14 * 0x10 + 8) == 0) goto code_r0x006bc850;
          }
          plVar20 = plVar20 + 1;
          lVar9 = *plVar20;
        }
      }
    }
    else {
      if ((lStack_590 != 0) && (uStack_588 != uVar10)) {
        uVar13 = 0;
        uVar14 = uVar10 >> 4 ^ uVar10 >> 9;
        do {
          uVar14 = uVar14 & lStack_598 - 1U;
          uVar15 = *(ulong *)(lStack_5a0 + uVar14 * 0x10);
          if (uVar15 == uVar10) {
            if (*(int *)(lStack_5a0 + uVar14 * 0x10 + 8) != 0) goto code_r0x006bc7cc;
            break;
          }
          uVar13 = uVar13 + 1;
          uVar14 = uVar13 + uVar14;
        } while (uVar15 != uStack_588 && uVar13 <= lStack_598 - 1U);
      }
code_r0x006bc850:
      uStack_1d0 = 1;
    }
  }
  if (0 < (int)uStack_d0) {
    func_0x006d221c(auStack_4d8,&lStack_5a0,auStack_578,&uStack_d0,puVar17,param_3);
    func_0x006d621c(auStack_550,auStack_578,auStack_528,puStack_1d8,uStack_1d0,uStack_88,puVar17,
                    param_3);
    func_0x006db3bc(auStack_500,puVar17);
  }
  if ((plStack_a0 != (long *)0x0) && (*plStack_a0 != 0)) {
    plVar20 = plStack_a0;
    do {
      uVar10 = func_0x0070b968(param_3);
      if (uVar10 != 0) {
        uVar5 = func_0x006b2c94(uVar8,uVar10);
        if ((ulong)(lStack_4a8 * 3) >> 2 <= uStack_4a0) {
          if ((uStack_4a0 != 0) && (uStack_498 != uVar10)) {
            uVar13 = 0;
            uVar14 = uVar10 >> 4 ^ uVar10 >> 9;
            do {
              uVar14 = uVar14 & lStack_4a8 - 1U;
              uVar15 = *(ulong *)(lStack_4b0 + uVar14 * 0x10);
              if (uVar15 == uVar10) goto code_r0x006bc980;
              uVar13 = uVar13 + 1;
              uVar14 = uVar13 + uVar14;
            } while (uVar15 != uStack_498 && uVar13 <= lStack_4a8 - 1U);
          }
          func_0x006d0b38(&lStack_4b0);
        }
code_r0x006bc980:
        uVar13 = (uVar10 >> 4 ^ uVar10 >> 9) & lStack_4a8 - 1U;
        uVar14 = *(ulong *)(lStack_4b0 + uVar13 * 0x10);
        if (uVar14 != uStack_498) {
          lVar9 = 1;
          do {
            if (uVar14 == uVar10) goto code_r0x006bc8e8;
            uVar13 = uVar13 + lVar9 & lStack_4a8 - 1U;
            uVar14 = *(ulong *)(lStack_4b0 + uVar13 * 0x10);
            lVar9 = lVar9 + 1;
          } while (uVar14 != uStack_498);
        }
        *(ulong *)(lStack_4b0 + uVar13 * 0x10) = uVar10;
        uStack_4a0 = uStack_4a0 + 1;
code_r0x006bc8e8:
        *(undefined1 *)(lStack_4b0 + uVar13 * 0x10 + 8) = uVar5;
      }
      plVar20 = plVar20 + 1;
    } while (*plVar20 != 0);
    if (0x100 < (ulong)((long)plVar20 - (long)plStack_a0)) {
      func_0x006bc388((long)puVar17 + 0xc,"Exceeded userdata type limit in the compilation options")
      ;
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x6bcb54);
      (*pcVar4)();
    }
  }
  if ((0 < (int)uStack_c8) || (1 < (int)uStack_d0)) {
    func_0x006dcdf0(auStack_488,auStack_460,auStack_438,puVar17,uStack_b0,&lStack_4b0,auStack_410,
                    auStack_4d8,&lStack_5a0,uStack_90,uVar8);
  }
  puVar3 = puStack_e8;
  for (puVar16 = puStack_f0; puVar16 != puVar3; puVar16 = puVar16 + 1) {
    puStack_710 = (undefined *)((ulong)puStack_710 & 0xffffffffffffff00);
    func_0x006bcbc0(auStack_650,*puVar16,&puStack_710);
    if ((((byte)puStack_710 >> 2 & 1) != 0) && (!bVar2)) {
      uStack_d1 = bVar2;
    }
  }
  uStack_720 = 0;
  uStack_718 = 0;
  uStack_730 = 0;
  uStack_728 = 0;
  uStack_740 = 0;
  uStack_738 = 0;
  uStack_750 = 0;
  uStack_748 = 0;
  uStack_760 = 0;
  uStack_758 = 0;
  uStack_768 = 0;
  auStack_77c[0] = 0;
  uStack_76c = 0;
  func_0x00706378(&puStack_710,(long)puVar17 + 0xc,&uStack_720,&uStack_730,&uStack_740,0,&uStack_750
                  ,1,&uStack_760,puVar17,0,&uStack_768,0,0,auStack_77c);
  uVar11 = func_0x006bcbc0(auStack_650,&puStack_710,&uStack_d1);
  func_0x006b0e28(uVar8,uVar11);
  func_0x006b33ec(uVar8);
  func_0x006d03d8(auStack_650);
  if (puStack_f0 != (undefined8 *)0x0) {
    puStack_e8 = puStack_f0;
    __ZdlPv();
  }
  return;
}

