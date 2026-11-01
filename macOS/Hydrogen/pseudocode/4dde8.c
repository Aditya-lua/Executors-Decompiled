
/* WARNING: Removing unreachable block (ram,0x0004e41c) */
/* WARNING: Removing unreachable block (ram,0x0004e2e8) */
/* WARNING: Removing unreachable block (ram,0x0004e06c) */
/* WARNING: Removing unreachable block (ram,0x0004e088) */
/* WARNING: Removing unreachable block (ram,0x0004e1a4) */
/* WARNING: Removing unreachable block (ram,0x0004e32c) */
/* WARNING: Removing unreachable block (ram,0x0004e464) */
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004dde8(undefined8 param_1)

{
  char *pcVar1;
  char *pcVar2;
  ulong uVar3;
  byte bVar4;
  undefined1 uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  code *pcVar8;
  bool bVar9;
  char cVar10;
  int iVar11;
  undefined8 uVar12;
  long *plVar13;
  long *plVar14;
  long extraout_x1;
  long extraout_x1_00;
  int extraout_w8;
  ulong uVar15;
  char *pcVar16;
  char *extraout_x9;
  long extraout_x10;
  char *pcVar17;
  char *extraout_x11;
  char *pcVar18;
  ulong uVar19;
  char *pcVar20;
  undefined8 *unaff_x21;
  char *pcVar21;
  int unaff_w22;
  long lVar22;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined1 auVar23 [16];
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined4 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  undefined7 uStack0000000000000090;
  undefined8 uStack00000000000000a0;
  ulong in_stack_000000a8;
  undefined4 uStack00000000000000b0;
  int iStack00000000000000b4;
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c0;
  long in_stack_000000c8;
  undefined8 in_stack_000000e0;
  undefined1 in_stack_000000f0 [16];
  
  uVar12 = func_0x00086db4(param_1,":",1);
  plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0x54);
  __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0xa0,(long)plVar13 + *(long *)(*plVar13 + -0x18));
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (unaff_x29 + -0xa0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(unaff_x29 + -0xa0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
  uStack00000000000000b8 = 0;
  in_stack_000000c0 = 0;
  in_stack_000000c8 = 0;
  uVar15 = unaff_x21[1];
  puVar6 = (undefined8 *)*unaff_x21;
  if (-1 < (char)*(byte *)((long)unaff_x21 + 0x17)) {
    uVar15 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
    puVar6 = unaff_x21;
  }
  func_0x00017184(&uStack00000000000000b8,puVar6,(long)puVar6 + uVar15);
  __ZNKSt3__14__fs10filesystem4path16__root_directoryEv(&uStack00000000000000b8);
  if (extraout_x1 != 0) {
    func_0x006e644c();
    goto code_r0x0004e7c0;
  }
  if (unaff_w22 != 0) {
    uStack0000000000000080 = (char *)0x0;
    in_stack_00000088 = 0;
    _uStack0000000000000090 = 0;
    uVar15 = unaff_x21[1];
    puVar6 = (undefined8 *)*unaff_x21;
    if (-1 < (char)*(byte *)((long)unaff_x21 + 0x17)) {
      uVar15 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
      puVar6 = unaff_x21;
    }
    func_0x00017184(&uStack0000000000000080,puVar6,(long)puVar6 + uVar15);
    auVar23 = __ZNKSt3__14__fs10filesystem4path11__extensionEv(&uStack0000000000000080);
    uVar15 = auVar23._8_8_;
    if (0x7ffffffffffffff7 < uVar15) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar15 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar23[8];
      lVar22 = unaff_x29 + -0xa0;
      if (uVar15 != 0) goto code_r0x0004df30;
    }
    else {
      uVar3 = (uVar15 & 0xfffffffffffffff8) + 8;
      if ((uVar15 | 7) != 0x17) {
        uVar3 = uVar15 | 7;
      }
      lVar22 = __Znwm(uVar3 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar15;
      *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar22;
code_r0x0004df30:
      _memmove(lVar22,auVar23._0_8_,uVar15);
    }
    *(undefined1 *)(lVar22 + uVar15) = 0;
    uStack0000000000000060._0_3_ = (undefined3)*(undefined4 *)(unaff_x29 + -0x90);
    uStack0000000000000060._0_7_ =
         CONCAT43(in_stack_000000e0._3_4_,(undefined3)uStack0000000000000060);
    uStack00000000000000a0 = *(char **)(unaff_x29 + -0xa0);
    in_stack_000000a8 = *(ulong *)(unaff_x29 + -0x98);
    uStack00000000000000b0 =
         CONCAT13((char)in_stack_000000e0._3_4_,(undefined3)uStack0000000000000060);
    iStack00000000000000b4 =
         CONCAT13(*(undefined1 *)(unaff_x29 + -0x89),(int3)((uint)in_stack_000000e0._3_4_ >> 8));
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    uVar15 = (ulong)(uint)(int)(char)iStack00000000000000b4._3_1_;
    pcVar21 = uStack00000000000000a0;
    pcVar16 = uStack00000000000000a0 + in_stack_000000a8;
    if (-1 < (char)iStack00000000000000b4._3_1_) {
      pcVar21 = (char *)&uStack00000000000000a0;
      pcVar16 = (char *)((long)&uStack00000000000000a0 + (ulong)iStack00000000000000b4._3_1_);
    }
    if (pcVar21 != pcVar16) {
      do {
        cVar10 = ___tolower((long)*pcVar21);
        pcVar20 = pcVar21 + 1;
        *pcVar21 = cVar10;
        pcVar21 = pcVar20;
      } while (pcVar20 != pcVar16);
      uVar15 = (ulong)iStack00000000000000b4._3_1_;
    }
    uVar7 = in_stack_000000a8;
    pcVar21 = uStack00000000000000a0;
    uVar19 = uVar15 & 0xff;
    uVar3 = in_stack_000000a8;
    if (-1 < (char)uVar15) {
      uVar3 = uVar19;
    }
    if (((uint)uVar15 >> 7 & 1) == 0) {
      if ((uint)uVar19 == 0) {
        lVar22 = 0;
        do {
          uVar15 = *(ulong *)(lVar22 + 0xa27df0);
          if (-1 < (char)*(byte *)(lVar22 + 0xa27dff)) {
            uVar15 = (ulong)*(byte *)(lVar22 + 0xa27dff);
          }
          if (uVar3 == uVar15) goto code_r0x0004e058;
          lVar22 = lVar22 + 0x18;
        } while (lVar22 != 0xaf8);
      }
      else {
        pcVar16 = (char *)0xa27de8;
        do {
          bVar4 = pcVar16[0x17];
          uVar15 = *(ulong *)(pcVar16 + 8);
          if (-1 < (char)bVar4) {
            uVar15 = (ulong)bVar4;
          }
          if (uVar3 == uVar15) {
            pcVar20 = *(char **)pcVar16;
            if (-1 < (char)bVar4) {
              pcVar20 = pcVar16;
            }
            pcVar17 = (char *)&uStack00000000000000a0;
            uVar15 = uVar19;
            while (*pcVar17 == *pcVar20) {
              pcVar17 = pcVar17 + 1;
              pcVar20 = pcVar20 + 1;
              uVar15 = uVar15 - 1;
              if (uVar15 == 0) goto code_r0x0004e058;
            }
          }
          pcVar16 = pcVar16 + 0x18;
        } while (pcVar16 != (char *)0xa288e0);
      }
    }
    else {
      lVar22 = 0;
      do {
        bVar4 = *(byte *)(lVar22 + 0xa27dff);
        uVar15 = *(ulong *)(lVar22 + 0xa27df0);
        if (-1 < (char)bVar4) {
          uVar15 = (ulong)bVar4;
        }
        if (uVar3 == uVar15) {
          plVar13 = (long *)*(long *)(lVar22 + 0xa27de8);
          if (-1 < (char)bVar4) {
            plVar13 = (long *)(lVar22 + 0xa27de8);
          }
          iVar11 = _memcmp(pcVar21,plVar13,uVar7);
          if (iVar11 == 0) goto code_r0x0004e058;
        }
        lVar22 = lVar22 + 0x18;
      } while (lVar22 != 0xaf8);
    }
    if ((uint)uVar19 >> 7 != 0) {
      __ZdlPv(pcVar21);
    }
  }
  pcVar21 = pcRam0000000000a33930;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(unaff_x29 + -0xa0,pcRam0000000000a33930,uRam0000000000a33938);
  }
  else {
    *(ulong *)(unaff_x29 + -0x98) = uRam0000000000a33938;
    *(char **)(unaff_x29 + -0xa0) = pcVar21;
    *(ulong *)(unaff_x29 + -0x90) = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
  }
  func_0x0001754c(unaff_x29 + -0xa0,&uStack00000000000000b8);
  func_0x0004e9b0(&uStack00000000000000a0,unaff_x29 + -0xa0);
  if (iStack00000000000000b4 < 0) {
    func_0x00017634(&uStack0000000000000080,uStack00000000000000a0,in_stack_000000a8);
  }
  else {
    in_stack_00000088 = in_stack_000000a8;
    uStack0000000000000080 = uStack00000000000000a0;
    _uStack0000000000000090 = CONCAT44(iStack00000000000000b4,uStack00000000000000b0);
  }
  uStack0000000000000060 = 0;
  in_stack_00000068 = 0;
  in_stack_00000070 = 0;
  while ((__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                    (unaff_x29 + -0xa0,&uStack0000000000000080,0),
         *(char *)(unaff_x29 + -0xa0) == -1 || *(char *)(unaff_x29 + -0xa0) == '\0' &&
         (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080),
         extraout_x1_00 != 0))) {
    auVar23 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&uStack0000000000000080);
    uVar15 = auVar23._8_8_;
    if (0x7ffffffffffffff7 < uVar15) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar15 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar23[8];
      lVar22 = unaff_x29 + -0xa0;
      if (uVar15 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar3 = (uVar15 & 0xfffffffffffffff8) + 8;
      if ((uVar15 | 7) != 0x17) {
        uVar3 = uVar15 | 7;
      }
      lVar22 = __Znwm(uVar3 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar15;
      *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar22;
code_r0x0004e29c:
      _memmove(lVar22,auVar23._0_8_,uVar15);
    }
    *(undefined1 *)(lVar22 + uVar15) = 0;
    uStack0000000000000030._0_7_ =
         CONCAT43(*(undefined4 *)(unaff_x29 + -0x8d),(int3)*(undefined4 *)(unaff_x29 + -0x90));
    pcVar21 = uStack0000000000000030;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined4 *)(unaff_x29 + -0x70) = (undefined4)uStack0000000000000030;
    *(undefined4 *)(unaff_x29 + -0x6d) = *(undefined4 *)(unaff_x29 + -0x8d);
    *(undefined1 *)(unaff_x29 + -0x69) = *(undefined1 *)(unaff_x29 + -0x89);
    uStack0000000000000030 = pcVar21;
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack0000000000000060 = *(undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000070 = *(long *)(unaff_x29 + -0x70);
    *(undefined1 *)(unaff_x29 + -0x69) = 0;
    *(undefined1 *)(unaff_x29 + -0x80) = 0;
    auVar23 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080);
    uVar15 = auVar23._8_8_;
    if (0x7ffffffffffffff7 < uVar15) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar15 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar23[8];
      lVar22 = unaff_x29 + -0xa0;
      if (uVar15 != 0) goto code_r0x0004e39c;
    }
    else {
      uVar3 = (uVar15 & 0xfffffffffffffff8) + 8;
      if ((uVar15 | 7) != 0x17) {
        uVar3 = uVar15 | 7;
      }
      lVar22 = __Znwm(uVar3 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar15;
      *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar22;
code_r0x0004e39c:
      _memmove(lVar22,auVar23._0_8_,uVar15);
    }
    *(undefined1 *)(lVar22 + uVar15) = 0;
    pcVar21 = *(char **)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x98);
    in_stack_000000f0._7_8_ = *(undefined8 *)(unaff_x29 + -0x91);
    uVar5 = *(undefined1 *)(unaff_x29 + -0x89);
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    *(undefined8 *)((ulong)&uStack0000000000000080 | 8) = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)((long)((ulong)&uStack0000000000000080 | 8) + 7) = in_stack_000000f0._7_8_;
    _uStack0000000000000090 = CONCAT17(uVar5,uStack0000000000000090);
    uStack0000000000000080 = pcVar21;
  }
  uStack0000000000000050 = 0;
  in_stack_00000058 = __ZNSt3__115system_categoryEv();
  __ZNSt3__14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0xa0,&uStack0000000000000080,&uStack0000000000000050);
  if (uStack0000000000000050 == 0) {
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0x90);
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    func_0x0004e9b0(in_stack_00000008,unaff_x29 + -0x80);
    if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
      func_0x00017634(unaff_x29 + -0x80,*in_stack_00000008,in_stack_00000008[1]);
    }
    else {
      uVar12 = *in_stack_00000008;
      *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000008[1];
      *(undefined8 *)(unaff_x29 + -0x80) = uVar12;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000008[2];
    }
    while( true ) {
      bVar4 = *(byte *)(unaff_x29 + -0x69);
      uVar15 = (ulong)bVar4;
      if ((bVar4 < 2) || (*(char *)(unaff_x29 + -0x81 + uVar15) != '/')) break;
      *(char *)(unaff_x29 + -0x69) = (char)(uVar15 - 1);
      *(undefined1 *)(unaff_x29 + -0x80 + (uVar15 - 1)) = 0;
    }
    uStack0000000000000030 = (char *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar3 = *(ulong *)(unaff_x29 + -0x78);
    lVar22 = *(long *)(unaff_x29 + -0x80);
    if (-1 < (char)bVar4) {
      uVar3 = uVar15;
      lVar22 = unaff_x29 + -0x80;
    }
    func_0x00017184(&uStack0000000000000030,lVar22,lVar22 + uVar3);
    if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
      __ZdlPv(*in_stack_00000008);
    }
    in_stack_00000008[1] = in_stack_00000038;
    *in_stack_00000008 = uStack0000000000000030;
    in_stack_00000008[2] = in_stack_00000040;
    if (cRam0000000000a33947 < '\0') {
      func_0x00017634(&uStack0000000000000030,pcRam0000000000a33930,uRam0000000000a33938);
    }
    else {
      in_stack_00000038 = uRam0000000000a33938;
      uStack0000000000000030 = pcRam0000000000a33930;
      in_stack_00000040 = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
    }
    if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
      func_0x00017634(&uStack0000000000000010,*in_stack_00000008,in_stack_00000008[1]);
    }
    else {
      in_stack_00000018 = in_stack_00000008[1];
      uStack0000000000000010 = (char *)*in_stack_00000008;
      in_stack_00000020 = in_stack_00000008[2];
    }
    iVar11 = (int)(char)in_stack_00000020._7_1_;
    uVar15 = in_stack_00000018;
    pcVar21 = uStack0000000000000010;
    if (-1 < iVar11) {
      uVar15 = (ulong)in_stack_00000020._7_1_;
      pcVar21 = (char *)&uStack0000000000000010;
    }
    uVar3 = in_stack_00000038;
    pcVar16 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar3 = in_stack_00000040 >> 0x38;
      pcVar16 = (char *)&uStack0000000000000030;
    }
    if (uVar3 <= uVar15) {
      uVar15 = uVar3;
    }
    pcVar20 = pcVar21 + uVar15;
    lVar22 = 0;
    if (uVar3 == 0) goto code_r0x0004e748;
    pcVar17 = pcVar20;
    if (uVar15 != 0) {
      pcVar18 = pcVar21;
      do {
        if (*pcVar18 == *pcVar16) {
          uVar15 = 1;
          do {
            if (uVar3 == uVar15) {
              pcVar17 = pcVar18;
              break;
            }
            pcVar2 = pcVar18 + uVar15;
            if (pcVar2 == pcVar20) goto code_r0x0004e638;
            pcVar1 = pcVar16 + uVar15;
            uVar15 = uVar15 + 1;
          } while (*pcVar2 == *pcVar1);
        }
        pcVar18 = pcVar18 + 1;
      } while (pcVar18 != pcVar20);
    }
code_r0x0004e638:
    bVar9 = (uVar3 == 0 || pcVar17 != pcVar20) && pcVar17 == pcVar21;
    while( true ) {
      if (iVar11 < 0) {
        __ZdlPv();
      }
      if (!bVar9) break;
      if ((long)in_stack_00000040 < 0) {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
        if (_uStack0000000000000090 < 0) goto code_r0x0004e704;
code_r0x0004e67c:
        if (-1 < iStack00000000000000b4) goto code_r0x0004e684;
code_r0x0004e714:
        __ZdlPv(uStack00000000000000a0);
        if (in_stack_000000c8 < 0) goto code_r0x0004e724;
code_r0x0004e68c:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      else {
        if (-1 < _uStack0000000000000090) goto code_r0x0004e67c;
code_r0x0004e704:
        __ZdlPv(uStack0000000000000080);
        if (iStack00000000000000b4 < 0) goto code_r0x0004e714;
code_r0x0004e684:
        if (-1 < in_stack_000000c8) goto code_r0x0004e68c;
code_r0x0004e724:
        __ZdlPv(uStack00000000000000b8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      ___stack_chk_fail();
      pcVar21 = extraout_x9;
      lVar22 = extraout_x10;
      pcVar20 = extraout_x11;
      iVar11 = extraout_w8;
code_r0x0004e748:
      bVar9 = lVar22 == 0 && pcVar20 == pcVar21;
    }
    func_0x006e644c(unaff_x27,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(unaff_x27,"Failed to resolve path component");
  }
code_r0x0004e7c0:
                    /* WARNING: Does not return */
  pcVar8 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar8)();
code_r0x0004e058:
  func_0x006e644c();
  goto code_r0x0004e7c0;
}

