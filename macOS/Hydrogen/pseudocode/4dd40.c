
/* WARNING: Removing unreachable block (ram,0x0004e41c) */
/* WARNING: Removing unreachable block (ram,0x0004e2e8) */
/* WARNING: Removing unreachable block (ram,0x0004e06c) */
/* WARNING: Removing unreachable block (ram,0x0004e088) */
/* WARNING: Removing unreachable block (ram,0x0004dd50) */
/* WARNING: Removing unreachable block (ram,0x0004e1a4) */
/* WARNING: Removing unreachable block (ram,0x0004e32c) */
/* WARNING: Removing unreachable block (ram,0x0004e464) */
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */
/* WARNING: Type propagation algorithm not settling */

void FUN_0004dd40(undefined8 param_1,undefined8 param_2,int param_3)

{
  char *******pppppppcVar1;
  ulong uVar2;
  byte bVar3;
  undefined8 *puVar4;
  ulong uVar5;
  code *pcVar6;
  bool bVar7;
  char cVar8;
  int iVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long *plVar12;
  long *plVar13;
  undefined8 *puVar14;
  long extraout_x1;
  long extraout_x1_00;
  int extraout_w8;
  undefined8 *extraout_x8;
  ulong uVar15;
  char *pcVar16;
  long lVar17;
  char *******extraout_x9;
  char *pcVar18;
  long extraout_x10;
  char *******pppppppcVar19;
  char *******extraout_x11;
  char *******pppppppcVar20;
  char *******pppppppcVar21;
  ulong uVar22;
  char *******pppppppcVar23;
  char *******pppppppcVar24;
  undefined1 auVar25 [16];
  undefined8 in_stack_00000080;
  char *******pppppppcStack_170;
  ulong uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_150;
  ulong uStack_148;
  ulong uStack_140;
  int aiStack_130 [2];
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  ulong uStack_110;
  char *******pppppppcStack_100;
  ulong uStack_f8;
  undefined8 uStack_f0;
  char *******pppppppcStack_e0;
  ulong uStack_d8;
  undefined4 uStack_d0;
  undefined4 uStack_cc;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  long lStack_b8;
  char *******pppppppcStack_b0;
  undefined7 uStack_a8;
  undefined4 uStack_a1;
  undefined4 uStack_9d;
  byte bStack_99;
  char acStack_91 [2];
  undefined6 uStack_8f;
  undefined1 uStack_89;
  undefined7 uStack_88;
  undefined1 uStack_81;
  undefined8 uStack_80;
  long lStack_78;
  
  __ZdlPv(in_stack_00000080);
  auVar25 = __Unwind_Resume();
  puVar14 = auVar25._8_8_;
  uVar10 = auVar25._0_8_;
  lStack_78 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"safe_path",9);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0x54);
  __ZNKSt3__18ios_base6getlocEv(&pppppppcStack_b0,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&pppppppcStack_b0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&pppppppcStack_b0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uStack_c8 = 0;
  uStack_c0 = 0;
  lStack_b8 = 0;
  uVar15 = puVar14[1];
  puVar4 = (undefined8 *)*puVar14;
  if (-1 < (char)*(byte *)((long)puVar14 + 0x17)) {
    uVar15 = (ulong)*(byte *)((long)puVar14 + 0x17);
    puVar4 = puVar14;
  }
  func_0x00017184(&uStack_c8,puVar4,(long)puVar4 + uVar15);
  __ZNKSt3__14__fs10filesystem4path16__root_directoryEv(&uStack_c8);
  if (extraout_x1 != 0) {
    func_0x006e644c(uVar10,"Absolute paths are not allowed");
    goto code_r0x0004e7c0;
  }
  if (param_3 != 0) {
    pppppppcStack_100 = (char *******)0x0;
    uStack_f8 = 0;
    uStack_f0 = 0;
    uVar15 = puVar14[1];
    puVar4 = (undefined8 *)*puVar14;
    if (-1 < (char)*(byte *)((long)puVar14 + 0x17)) {
      uVar15 = (ulong)*(byte *)((long)puVar14 + 0x17);
      puVar4 = puVar14;
    }
    func_0x00017184(&pppppppcStack_100,puVar4,(long)puVar4 + uVar15);
    auVar25 = __ZNKSt3__14__fs10filesystem4path11__extensionEv(&pppppppcStack_100);
    uVar15 = auVar25._8_8_;
    if (0x7ffffffffffffff7 < uVar15) {
      func_0x0001748c(&pppppppcStack_b0);
      goto code_r0x0004e7c0;
    }
    if (uVar15 < 0x17) {
      bStack_99 = auVar25[8];
      pppppppcVar24 = (char *******)&pppppppcStack_b0;
      if (uVar15 != 0) goto code_r0x0004df30;
    }
    else {
      uVar2 = (uVar15 & 0xfffffffffffffff8) + 8;
      if ((uVar15 | 7) != 0x17) {
        uVar2 = uVar15 | 7;
      }
      lVar17 = uVar2 + 1;
      pppppppcVar24 = (char *******)__Znwm(lVar17);
      bStack_99 = (byte)((ulong)lVar17 >> 0x38) | 0x80;
      uStack_a8 = auVar25._8_7_;
      uStack_a1._0_1_ = auVar25[0xf];
      uStack_a1._1_3_ = (undefined3)lVar17;
      uStack_9d = (undefined4)((ulong)lVar17 >> 0x18);
      pppppppcStack_b0 = pppppppcVar24;
code_r0x0004df30:
      _memmove(pppppppcVar24,auVar25._0_8_,uVar15);
    }
    *(char *)((long)pppppppcVar24 + uVar15) = '\0';
    uStack_120._0_3_ = (undefined3)((uint)uStack_a1 >> 8);
    uStack_120._0_7_ = CONCAT43(uStack_9d,(undefined3)uStack_120);
    pppppppcStack_e0 = pppppppcStack_b0;
    uStack_d8 = CONCAT17((undefined1)uStack_a1,uStack_a8);
    uStack_d0 = CONCAT13((char)uStack_9d,(undefined3)uStack_120);
    uStack_cc = CONCAT13(bStack_99,(int3)((uint)uStack_9d >> 8));
    if (uStack_f0 < 0) {
      __ZdlPv(pppppppcStack_100);
    }
    uVar15 = (ulong)(uint)(int)(char)uStack_cc._3_1_;
    pppppppcVar24 = pppppppcStack_e0;
    pppppppcVar19 = (char *******)((long)pppppppcStack_e0 + uStack_d8);
    if (-1 < (char)uStack_cc._3_1_) {
      pppppppcVar24 = (char *******)&pppppppcStack_e0;
      pppppppcVar19 = (char *******)((long)&pppppppcStack_e0 + (ulong)uStack_cc._3_1_);
    }
    if (pppppppcVar24 != pppppppcVar19) {
      do {
        cVar8 = ___tolower((long)*(char *)pppppppcVar24);
        pppppppcVar23 = (char *******)((long)pppppppcVar24 + 1);
        *(char *)pppppppcVar24 = cVar8;
        pppppppcVar24 = pppppppcVar23;
      } while (pppppppcVar23 != pppppppcVar19);
      uVar15 = (ulong)uStack_cc._3_1_;
    }
    uVar5 = uStack_d8;
    pppppppcVar24 = pppppppcStack_e0;
    uVar22 = uVar15 & 0xff;
    uVar2 = uStack_d8;
    if (-1 < (char)uVar15) {
      uVar2 = uVar22;
    }
    if (((uint)uVar15 >> 7 & 1) == 0) {
      if ((uint)uVar22 == 0) {
        lVar17 = 0;
        do {
          uVar15 = *(ulong *)(lVar17 + 0xa27df0);
          if (-1 < (char)*(byte *)(lVar17 + 0xa27dff)) {
            uVar15 = (ulong)*(byte *)(lVar17 + 0xa27dff);
          }
          if (uVar2 == uVar15) goto code_r0x0004e058;
          lVar17 = lVar17 + 0x18;
        } while (lVar17 != 0xaf8);
      }
      else {
        pcVar16 = (char *)0xa27de8;
        do {
          bVar3 = pcVar16[0x17];
          uVar15 = *(ulong *)(pcVar16 + 8);
          if (-1 < (char)bVar3) {
            uVar15 = (ulong)bVar3;
          }
          if (uVar2 == uVar15) {
            pcVar18 = *(char **)pcVar16;
            if (-1 < (char)bVar3) {
              pcVar18 = pcVar16;
            }
            pppppppcVar19 = (char *******)&pppppppcStack_e0;
            uVar15 = uVar22;
            while (*(char *)pppppppcVar19 == *pcVar18) {
              pppppppcVar19 = (char *******)((long)pppppppcVar19 + 1);
              pcVar18 = pcVar18 + 1;
              uVar15 = uVar15 - 1;
              if (uVar15 == 0) goto code_r0x0004e058;
            }
          }
          pcVar16 = pcVar16 + 0x18;
        } while (pcVar16 != (char *)0xa288e0);
      }
    }
    else {
      lVar17 = 0;
      do {
        bVar3 = *(byte *)(lVar17 + 0xa27dff);
        uVar15 = *(ulong *)(lVar17 + 0xa27df0);
        if (-1 < (char)bVar3) {
          uVar15 = (ulong)bVar3;
        }
        if (uVar2 == uVar15) {
          plVar12 = (long *)*(long *)(lVar17 + 0xa27de8);
          if (-1 < (char)bVar3) {
            plVar12 = (long *)(lVar17 + 0xa27de8);
          }
          iVar9 = _memcmp(pppppppcVar24,plVar12,uVar5);
          if (iVar9 == 0) goto code_r0x0004e058;
        }
        lVar17 = lVar17 + 0x18;
      } while (lVar17 != 0xaf8);
    }
    if ((uint)uVar22 >> 7 != 0) {
      __ZdlPv(pppppppcVar24);
    }
  }
  if ((char)bRam0000000000a33947 < '\0') {
    func_0x00017634(&pppppppcStack_b0,pppppppcRam0000000000a33930,uRam0000000000a33938);
  }
  else {
    uStack_a8 = (undefined7)uRam0000000000a33938;
    uStack_a1._0_1_ = (undefined1)(uRam0000000000a33938 >> 0x38);
    pppppppcStack_b0 = pppppppcRam0000000000a33930;
    uStack_a1._1_3_ = (undefined3)uRam0000000000a33940;
    uStack_9d = (undefined4)((uint7)uRam0000000000a33940 >> 0x18);
    bStack_99 = bRam0000000000a33947;
  }
  func_0x0001754c(&pppppppcStack_b0,&uStack_c8);
  FUN_0004e9ac(&pppppppcStack_e0,&pppppppcStack_b0);
  if (uStack_cc < 0) {
    func_0x00017634(&pppppppcStack_100,pppppppcStack_e0,uStack_d8);
  }
  else {
    uStack_f8 = uStack_d8;
    pppppppcStack_100 = pppppppcStack_e0;
    uStack_f0 = CONCAT44(uStack_cc,uStack_d0);
  }
  uStack_120 = 0;
  uStack_118 = 0;
  uStack_110 = 0;
  while( true ) {
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
              (&pppppppcStack_b0,&pppppppcStack_100,0);
    if (((char)pppppppcStack_b0 != -1 && (char)pppppppcStack_b0 != '\0') ||
       (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&pppppppcStack_100), extraout_x1_00 == 0)
       ) break;
    auVar25 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&pppppppcStack_100);
    uVar15 = auVar25._8_8_;
    if (0x7ffffffffffffff7 < uVar15) {
      func_0x0001748c(&pppppppcStack_b0);
      goto code_r0x0004e7c0;
    }
    if (uVar15 < 0x17) {
      bStack_99 = auVar25[8];
      pppppppcVar24 = (char *******)&pppppppcStack_b0;
      if (uVar15 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar2 = (uVar15 & 0xfffffffffffffff8) + 8;
      if ((uVar15 | 7) != 0x17) {
        uVar2 = uVar15 | 7;
      }
      lVar17 = uVar2 + 1;
      pppppppcVar24 = (char *******)__Znwm(lVar17);
      bStack_99 = (byte)((ulong)lVar17 >> 0x38) | 0x80;
      uStack_a8 = auVar25._8_7_;
      uStack_a1._0_1_ = auVar25[0xf];
      uStack_a1._1_3_ = (undefined3)lVar17;
      uStack_9d = (undefined4)((ulong)lVar17 >> 0x18);
      pppppppcStack_b0 = pppppppcVar24;
code_r0x0004e29c:
      _memmove(pppppppcVar24,auVar25._0_8_,uVar15);
    }
    *(char *)((long)pppppppcVar24 + uVar15) = '\0';
    uStack_150._0_3_ = (undefined3)((uint)uStack_a1 >> 8);
    uStack_150._0_7_ = CONCAT43(uStack_9d,(undefined3)uStack_150);
    acStack_91[1] = (char)pppppppcStack_b0;
    uStack_8f = (undefined6)((ulong)pppppppcStack_b0 >> 8);
    uStack_89 = (undefined1)((ulong)pppppppcStack_b0 >> 0x38);
    uStack_88 = uStack_a8;
    uStack_81 = (undefined1)uStack_a1;
    uStack_80._0_7_ = CONCAT43(uStack_9d,(undefined3)uStack_150);
    uStack_80 = CONCAT17(bStack_99,(undefined7)uStack_80);
    func_0x0001754c(acStack_91 + 1,&uStack_120);
    if ((long)uStack_110 < 0) {
      __ZdlPv(uStack_120);
    }
    uStack_118 = CONCAT17(uStack_81,uStack_88);
    uStack_120 = CONCAT17(uStack_89,CONCAT61(uStack_8f,acStack_91[1]));
    uStack_110 = uStack_80;
    uStack_80 = uStack_80 & 0xffffffffffffff;
    acStack_91[1] = 0;
    auVar25 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&pppppppcStack_100);
    uVar15 = auVar25._8_8_;
    if (0x7ffffffffffffff7 < uVar15) {
      func_0x0001748c(&pppppppcStack_b0);
      goto code_r0x0004e7c0;
    }
    if (uVar15 < 0x17) {
      bStack_99 = auVar25[8];
      pppppppcVar24 = (char *******)&pppppppcStack_b0;
      if (uVar15 != 0) goto code_r0x0004e39c;
    }
    else {
      uVar2 = (uVar15 & 0xfffffffffffffff8) + 8;
      if ((uVar15 | 7) != 0x17) {
        uVar2 = uVar15 | 7;
      }
      lVar17 = uVar2 + 1;
      pppppppcVar24 = (char *******)__Znwm(lVar17);
      bStack_99 = (byte)((ulong)lVar17 >> 0x38) | 0x80;
      uStack_a8 = auVar25._8_7_;
      uStack_a1._0_1_ = auVar25[0xf];
      uStack_a1._1_3_ = (undefined3)lVar17;
      uStack_9d = (undefined4)((ulong)lVar17 >> 0x18);
      pppppppcStack_b0 = pppppppcVar24;
code_r0x0004e39c:
      _memmove(pppppppcVar24,auVar25._0_8_,uVar15);
    }
    *(char *)((long)pppppppcVar24 + uVar15) = '\0';
    bVar3 = bStack_99;
    pppppppcVar24 = pppppppcStack_b0;
    acStack_91[1] = (char)uStack_a8;
    uStack_8f = (undefined6)((uint7)uStack_a8 >> 8);
    uStack_89 = (undefined1)uStack_a1;
    uStack_88 = (undefined7)(CONCAT44(uStack_9d,uStack_a1) >> 8);
    if (uStack_f0 < 0) {
      __ZdlPv(pppppppcStack_100);
    }
    *(undefined8 *)((ulong)&pppppppcStack_100 | 8) =
         CONCAT17(uStack_89,CONCAT61(uStack_8f,acStack_91[1]));
    *(ulong *)((long)((ulong)&pppppppcStack_100 | 8) + 7) = CONCAT71(uStack_88,uStack_89);
    uStack_f0 = CONCAT17(bVar3,(undefined7)uStack_f0);
    pppppppcStack_100 = pppppppcVar24;
  }
  aiStack_130[0] = 0;
  uStack_128 = __ZNSt3__115system_categoryEv();
  __ZNSt3__14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE
            (&pppppppcStack_b0,&pppppppcStack_100,aiStack_130);
  if (aiStack_130[0] == 0) {
    uStack_88 = uStack_a8;
    uStack_81 = (undefined1)uStack_a1;
    acStack_91[1] = (char)pppppppcStack_b0;
    uStack_8f = (undefined6)((ulong)pppppppcStack_b0 >> 8);
    uStack_89 = (undefined1)((ulong)pppppppcStack_b0 >> 0x38);
    uStack_80 = CONCAT17(bStack_99,CONCAT43(uStack_9d,uStack_a1._1_3_));
    func_0x0001754c(acStack_91 + 1,&uStack_120);
    func_0x0004e9b0(extraout_x8,acStack_91 + 1);
    if (*(char *)((long)extraout_x8 + 0x17) < '\0') {
      func_0x00017634(acStack_91 + 1,*extraout_x8,extraout_x8[1]);
    }
    else {
      uVar11 = *extraout_x8;
      uStack_88 = (undefined7)extraout_x8[1];
      uStack_81 = (undefined1)((ulong)extraout_x8[1] >> 0x38);
      acStack_91[1] = (char)uVar11;
      uStack_8f = (undefined6)((ulong)uVar11 >> 8);
      uStack_89 = (undefined1)((ulong)uVar11 >> 0x38);
      uStack_80 = extraout_x8[2];
    }
    while( true ) {
      uVar15 = (ulong)uStack_80._7_1_;
      if ((uStack_80._7_1_ < 2) || (acStack_91[uVar15] != '/')) break;
      uStack_80 = CONCAT17(uStack_80._7_1_ - 1,(undefined7)uStack_80);
      acStack_91[uVar15] = '\0';
    }
    uStack_150 = (char *******)0x0;
    uStack_148 = 0;
    uStack_140 = 0;
    uVar2 = CONCAT17(uStack_81,uStack_88);
    pcVar16 = (char *)CONCAT17(uStack_89,CONCAT61(uStack_8f,acStack_91[1]));
    if (-1 < (long)uStack_80) {
      uVar2 = uVar15;
      pcVar16 = acStack_91 + 1;
    }
    func_0x00017184(&uStack_150,pcVar16,pcVar16 + uVar2);
    if (*(char *)((long)extraout_x8 + 0x17) < '\0') {
      __ZdlPv(*extraout_x8);
    }
    extraout_x8[1] = uStack_148;
    *extraout_x8 = uStack_150;
    extraout_x8[2] = uStack_140;
    if ((char)bRam0000000000a33947 < '\0') {
      func_0x00017634(&uStack_150,pppppppcRam0000000000a33930,uRam0000000000a33938);
    }
    else {
      uStack_148 = uRam0000000000a33938;
      uStack_150 = pppppppcRam0000000000a33930;
      uStack_140 = CONCAT17(bRam0000000000a33947,uRam0000000000a33940);
    }
    if (*(char *)((long)extraout_x8 + 0x17) < '\0') {
      func_0x00017634(&pppppppcStack_170,*extraout_x8,extraout_x8[1]);
    }
    else {
      uStack_168 = extraout_x8[1];
      pppppppcStack_170 = (char *******)*extraout_x8;
      uStack_160 = extraout_x8[2];
    }
    iVar9 = (int)(char)uStack_160._7_1_;
    uVar15 = uStack_168;
    pppppppcVar24 = pppppppcStack_170;
    if (-1 < iVar9) {
      uVar15 = (ulong)uStack_160._7_1_;
      pppppppcVar24 = (char *******)&pppppppcStack_170;
    }
    uVar2 = uStack_148;
    pppppppcVar19 = uStack_150;
    if (-1 < (long)uStack_140) {
      uVar2 = uStack_140 >> 0x38;
      pppppppcVar19 = (char *******)&uStack_150;
    }
    if (uVar2 <= uVar15) {
      uVar15 = uVar2;
    }
    pppppppcVar23 = (char *******)((long)pppppppcVar24 + uVar15);
    lVar17 = 0;
    if (uVar2 == 0) goto code_r0x0004e748;
    pppppppcVar20 = pppppppcVar23;
    if (uVar15 != 0) {
      pppppppcVar21 = pppppppcVar24;
      do {
        if (*(char *)pppppppcVar21 == *(char *)pppppppcVar19) {
          uVar15 = 1;
          do {
            if (uVar2 == uVar15) {
              pppppppcVar20 = pppppppcVar21;
              break;
            }
            pppppppcVar1 = (char *******)((long)pppppppcVar21 + uVar15);
            if (pppppppcVar1 == pppppppcVar23) goto LAB_0004e638;
            pcVar16 = (char *)((long)pppppppcVar19 + uVar15);
            uVar15 = uVar15 + 1;
          } while (*(char *)pppppppcVar1 == *pcVar16);
        }
        pppppppcVar21 = (char *******)((long)pppppppcVar21 + 1);
      } while (pppppppcVar21 != pppppppcVar23);
    }
LAB_0004e638:
    bVar7 = (uVar2 == 0 || pppppppcVar20 != pppppppcVar23) && pppppppcVar20 == pppppppcVar24;
    while( true ) {
      if (iVar9 < 0) {
        __ZdlPv();
      }
      if (!bVar7) break;
      if ((long)uStack_140 < 0) {
        __ZdlPv(uStack_150);
      }
      if ((long)uStack_110 < 0) {
        __ZdlPv(uStack_120);
        if (-1 < uStack_f0) goto LAB_0004e67c;
LAB_0004e704:
        __ZdlPv(pppppppcStack_100);
        if (-1 < uStack_cc) goto code_r0x0004e684;
LAB_0004e714:
        __ZdlPv(pppppppcStack_e0);
        if (-1 < lStack_b8) goto code_r0x0004e68c;
LAB_0004e724:
        __ZdlPv(uStack_c8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_78) {
          return;
        }
      }
      else {
        if (uStack_f0 < 0) goto LAB_0004e704;
LAB_0004e67c:
        if (uStack_cc < 0) goto LAB_0004e714;
code_r0x0004e684:
        if (lStack_b8 < 0) goto LAB_0004e724;
code_r0x0004e68c:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_78) {
          return;
        }
      }
      ___stack_chk_fail();
      pppppppcVar24 = extraout_x9;
      lVar17 = extraout_x10;
      pppppppcVar23 = extraout_x11;
      iVar9 = extraout_w8;
code_r0x0004e748:
      bVar7 = lVar17 == 0 && pppppppcVar23 == pppppppcVar24;
    }
    func_0x006e644c(uVar10,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(uVar10,"Failed to resolve path component");
  }
code_r0x0004e7c0:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar6)();
code_r0x0004e058:
  func_0x006e644c(uVar10,"Disallowed file extension detected");
  goto code_r0x0004e7c0;
}

