
/* WARNING: Possible PIC construction at 0x002fd5f4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002fd5f8) */
/* WARNING: Type propagation algorithm not settling */

undefined8
FUN_002fbfd0(undefined8 param_1,undefined8 param_2,long *param_3,segment_command *param_4)

{
  char *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  char cVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  long *plVar48;
  int iVar49;
  undefined4 uVar50;
  uint uVar51;
  int iVar52;
  int iVar53;
  uint uVar54;
  long lVar55;
  segment_command *psVar56;
  long *plVar57;
  segment_command *psVar58;
  ulong uVar59;
  long extraout_x8;
  long lVar60;
  ulong *puVar61;
  long extraout_x9;
  long lVar62;
  long lVar63;
  uint uVar64;
  ulong extraout_x11;
  ulong uVar65;
  ulong uVar66;
  ulong uVar67;
  long extraout_x14;
  segment_command *unaff_x19;
  qword qVar68;
  undefined8 *puVar69;
  segment_command *unaff_x20;
  long *unaff_x21;
  undefined8 uVar70;
  segment_command *unaff_x22;
  segment_command *psVar71;
  long *unaff_x23;
  segment_command *unaff_x24;
  long *unaff_x25;
  segment_command *psVar72;
  long *unaff_x27;
  long *plVar73;
  ulong unaff_x28;
  undefined1 *puVar74;
  undefined *puVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar94;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  byte bVar100;
  byte bVar101;
  byte bVar102;
  byte bVar103;
  byte bVar104;
  byte bVar105;
  byte bVar106;
  byte bVar107;
  undefined1 auVar93 [16];
  byte bVar108;
  byte bVar109;
  byte bVar110;
  byte bVar111;
  byte bVar112;
  byte bVar113;
  byte bVar114;
  byte bVar115;
  byte bVar116;
  byte bVar117;
  byte bVar119;
  byte bVar120;
  byte bVar121;
  byte bVar122;
  byte bVar123;
  byte bVar124;
  undefined8 uVar118;
  byte bVar125;
  byte bVar126;
  byte bVar128;
  byte bVar129;
  byte bVar130;
  byte bVar131;
  byte bVar132;
  byte bVar133;
  undefined8 uVar127;
  byte bVar134;
  byte bVar135;
  byte bVar137;
  byte bVar138;
  byte bVar139;
  byte bVar140;
  byte bVar141;
  byte bVar142;
  undefined8 uVar136;
  byte bVar143;
  undefined8 uVar144;
  undefined8 uVar145;
  undefined8 uVar146;
  undefined8 uVar147;
  undefined8 uVar148;
  undefined8 uVar149;
  undefined8 uVar150;
  undefined8 uVar151;
  undefined1 auVar152 [16];
  long lStack_80;
  long lStack_78;
  long *plStack_70;
  segment_command *psStack_68;
  ulong uStack_60;
  long *plStack_58;
  segment_command *psStack_50;
  long *plStack_48;
  undefined1 auStack_6 [6];
  
  psVar72 = (segment_command *)0x0;
  if (unaff_x24 != (segment_command *)0x0) {
    unaff_x27 = (long *)((long)&MACH_HEADER.magic + 1);
    unaff_x28 = 0x1f;
    do {
      unaff_x25 = (long *)func_0x0036e31c(0x18);
      if (unaff_x25 == (long *)0x0) {
LAB_002fc0bc:
        pcVar1 = unaff_x22->segname + (long)psVar72 * 8 + -8;
        pcVar1[0] = '\0';
        pcVar1[1] = '\0';
        pcVar1[2] = '\0';
        pcVar1[3] = '\0';
        pcVar1[4] = '\0';
        pcVar1[5] = '\0';
        pcVar1[6] = '\0';
        pcVar1[7] = '\0';
        psVar56 = *(segment_command **)&unaff_x20[4].nsects;
        if (psVar56 < psVar72) {
          do {
            func_0x002f636c(*(undefined8 *)(unaff_x22->segname + (long)psVar56 * 8 + -8));
            psVar56 = (segment_command *)((long)&psVar56->cmd + 1);
          } while (psVar72 != psVar56);
        }
        func_0x0036e3d8();
        func_0x0036e3d8();
        uVar70 = 0;
        goto code_r0x002fc07c;
      }
      lVar55 = func_0x0036e31c(0x18);
      if (lVar55 == 0) {
        plVar48 = unaff_x25;
LAB_002fc0b0:
        *plVar48 = 0;
        func_0x002f636c(unaff_x25);
        goto LAB_002fc0bc;
      }
      *(undefined4 *)(lVar55 + 0x14) = 1;
      *unaff_x25 = lVar55;
      lVar55 = func_0x0036e31c(0x18);
      if (lVar55 == 0) {
        plVar48 = unaff_x25 + 1;
        goto LAB_002fc0b0;
      }
      *(undefined4 *)(lVar55 + 0x14) = 1;
      unaff_x25[1] = lVar55;
      *(undefined4 *)(unaff_x25 + 2) = 0x1f;
      *(long **)(unaff_x22->segname + (long)psVar72 * 8 + -8) = unaff_x25;
      psVar72 = (segment_command *)((long)&psVar72->cmd + 1);
    } while (unaff_x24 != psVar72);
    psVar72 = *(segment_command **)&unaff_x20[4].nsects;
  }
  _bzero((long)unaff_x23 + (long)psVar72,(long)unaff_x24 - (long)psVar72);
  *(undefined1 *)((long)unaff_x23 + *(long *)&unaff_x20[4].nsects) = 1;
  lVar55._0_4_ = unaff_x20[4].nsects;
  lVar55._4_4_ = unaff_x20[4].flags;
  *unaff_x21 = lVar55;
  if (lVar55 != 0x400) {
    uVar118._0_4_ = unaff_x20[5].cmd;
    uVar118._4_4_ = unaff_x20[5].cmdsize;
    uVar70 = *(undefined8 *)(unaff_x22->segname + *(long *)&unaff_x20[4].nsects * 8 + -8);
    func_0x0036e3d8(uVar118);
    *(segment_command **)(unaff_x20 + 5) = unaff_x22;
    func_0x0036e3d8(*(undefined8 *)unaff_x20[5].segname);
    *(long **)unaff_x20[5].segname = unaff_x23;
    *(segment_command **)&unaff_x20[4].nsects = unaff_x24;
code_r0x002fc07c:
    func_0x00373e0c();
    return uVar70;
  }
  auVar152 = func_0x0079eee0();
  psVar56 = auVar152._8_8_;
  puVar74 = auStack_6 + -10;
  uStack_60 = unaff_x28;
  plStack_58 = unaff_x27;
  psStack_50 = psVar72;
  plStack_48 = unaff_x25;
  if (param_3[1] == 0) {
    func_0x0079ef58();
code_r0x002fc52c:
    func_0x0079ef80();
code_r0x002fc530:
    func_0x0079efa8();
code_r0x002fc534:
    func_0x0079efd0();
code_r0x002fc538:
    func_0x0079eff8();
code_r0x002fc53c:
    func_0x0079f020();
  }
  else {
    unaff_x21 = param_3;
    if (param_3[2] == 0) goto code_r0x002fc52c;
    if (param_3[3] == 0) goto code_r0x002fc530;
    if (param_3[4] == 0) goto code_r0x002fc534;
    if (param_3[5] == 0) goto code_r0x002fc538;
    if (param_3[6] == 0) goto code_r0x002fc53c;
    if (param_3[7] != 0) {
      if (param_3[8] == 0) goto code_r0x002fc544;
      if ((char)param_4->fileoff == '\0') {
        qVar68 = param_4->vmsize;
        psVar72 = *(segment_command **)(param_4->segname + 8);
        if (psVar72 == (segment_command *)param_4->vmaddr) {
          unaff_x20 = &segment_command_00000020;
          if (psVar72 != (segment_command *)0x0) {
            unaff_x20 = (segment_command *)((ulong)((long)psVar72 * 3) >> 1);
          }
          if (((unaff_x20 <= psVar72) || ((ulong)unaff_x20 >> 0x3d != 0)) ||
             (lVar55 = func_0x0036e48c(*(undefined8 *)param_4->segname,(long)unaff_x20 << 3),
             lVar55 == 0)) {
            *(undefined2 *)&param_4->fileoff = 0x101;
            goto code_r0x002fc1f4;
          }
          *(long *)param_4->segname = lVar55;
          param_4->vmaddr = (qword)unaff_x20;
          psVar72 = *(segment_command **)(param_4->segname + 8);
        }
        else {
          lVar55 = *(long *)param_4->segname;
        }
        *(qword *)(lVar55 + (long)psVar72 * 8) = qVar68;
        *(long *)(param_4->segname + 8) = *(long *)(param_4->segname + 8) + 1;
      }
code_r0x002fc1f4:
      unaff_x24 = (segment_command *)func_0x0029e340(param_4);
      unaff_x27 = (long *)func_0x0029e340(param_4);
      unaff_x22 = (segment_command *)func_0x0029e340(param_4);
      uVar70 = 0;
      if (unaff_x24 == (segment_command *)0x0) goto code_r0x002fc288;
      if (unaff_x27 == (long *)0x0) goto code_r0x002fc288;
      if (unaff_x22 == (segment_command *)0x0) goto code_r0x002fc288;
      uVar70 = func_0x002fbc24(param_3,param_4);
      if ((int)uVar70 == 0) goto code_r0x002fc288;
      unaff_x25 = (long *)param_3[0x25];
      psVar71 = (segment_command *)param_3[0x26];
      unaff_x23 = unaff_x25 + 3;
      auVar18._8_8_ = psVar56;
      auVar18._0_8_ = unaff_x23;
      auVar93._8_8_ = psVar56;
      auVar93._0_8_ = unaff_x23;
      psVar58 = (segment_command *)*unaff_x23;
      unaff_x28 = param_3[0x27];
      uVar70._0_4_ = psVar56->cmd;
      uVar70._4_4_ = psVar56->cmdsize;
      psVar72 = (segment_command *)(long)(int)unaff_x25[4];
      psStack_68 = auVar152._0_8_;
      iVar49 = func_0x0029d99c(uVar70,(long)*(int *)psVar56->segname);
      if (-1 < iVar49) {
        func_0x0079f098();
code_r0x002fc6a4:
        auVar20._8_8_ = param_3;
        auVar20._0_8_ = unaff_x22;
        puVar75 = &_aws_lc_0_24_0_RSA_generate_key_ex;
        auVar152 = func_0x0079f0c0();
        uVar59 = 0;
        plVar48 = &lStack_80;
        while( true ) {
          *(ulong *)((long)plVar48 + -0x60) = unaff_x28;
          *(long **)((long)plVar48 + -0x58) = unaff_x27;
          *(segment_command **)((long)plVar48 + -0x50) = psVar56;
          *(long **)((long)plVar48 + -0x48) = unaff_x25;
          *(segment_command **)((long)plVar48 + -0x40) = unaff_x24;
          *(long **)((long)plVar48 + -0x38) = unaff_x23;
          *(undefined1 (*) [16])((long)plVar48 + -0x30) = auVar20;
          *(segment_command **)((long)plVar48 + -0x20) = psVar71;
          *(segment_command **)((long)plVar48 + -0x18) = param_4;
          *(undefined1 **)((long)plVar48 + -0x10) = puVar74;
          *(undefined **)((long)plVar48 + -8) = puVar75;
          uVar51 = auVar152._8_4_ & 0xffffff80;
          if ((int)uVar51 < 0x100) break;
          *(long *)((long)plVar48 + -0xb0) = auVar152._0_8_;
          unaff_x25 = (long *)0x0;
          *(uint *)((long)plVar48 + -0xa8) = uVar51;
          uVar51 = uVar51 >> 1;
          uVar54 = uVar51 - 100 >> 6;
          *(ulong *)((long)plVar48 + -0x88) = (ulong)uVar54;
          *(segment_command **)((long)plVar48 + -0x80) = psVar72;
          uVar64 = auVar152._8_4_ >> 7;
          *(ulong *)((long)plVar48 + -0x98) = (ulong)(uVar54 + 1);
          *(ulong *)((long)plVar48 + -0x90) = (ulong)uVar64;
          *(ulong *)((long)plVar48 + -0xa0) = (ulong)(uVar64 + 1);
          *(uint *)((long)plVar48 + -0xa4) = uVar51;
          *(uint *)((long)plVar48 + -0xb8) = uVar51 - 0x800;
          *(uint *)((long)plVar48 + -0xb4) = 0x800 - uVar51;
          plVar73 = unaff_x27;
          unaff_x28 = uVar59;
code_r0x002fc85c:
          psVar71 = auVar20._0_8_;
          func_0x0028f0e4();
          lVar55 = func_0x002f8ac4(0);
          if (lVar55 == 0) {
            uVar70 = 0;
            goto code_r0x002fd4a8;
          }
          uVar54 = *(uint *)psVar58->segname;
          uVar59 = (ulong)uVar54;
          uVar51 = uVar54 & (int)uVar54 >> 0x1f;
          lVar60 = uVar59 * 8;
          do {
            lVar60 = lVar60 + -8;
            uVar64 = (uint)uVar59;
            uVar59 = (ulong)(uVar64 - 1);
            if ((int)uVar64 < 1) {
              if (-1 < (int)uVar54) goto code_r0x002fc954;
              lVar63._0_4_ = psVar58->cmd;
              lVar63._4_4_ = psVar58->cmdsize;
              goto code_r0x002fc8ac;
            }
            lVar63 = *(long *)psVar58;
          } while (*(long *)(lVar63 + lVar60) == 0);
          uVar51 = uVar64;
code_r0x002fc8ac:
          uVar67 = *(ulong *)(lVar63 + (long)(int)(uVar51 - 1) * 8);
          uVar65 = uVar67 >> 0x20;
          uVar59 = uVar65;
          if (uVar65 == 0) {
            uVar59 = uVar67;
          }
          uVar66 = uVar59 >> 0x10;
          uVar2 = uVar66;
          if (uVar66 == 0) {
            uVar2 = uVar59;
          }
          uVar59 = uVar2 >> 8;
          if (uVar2 < 0x100) {
            uVar59 = uVar2;
          }
          uVar3 = uVar59 >> 4;
          if (uVar59 < 0x10) {
            uVar3 = uVar59;
          }
          uVar4 = uVar3 >> 2;
          if (uVar3 < 4) {
            uVar4 = uVar3;
          }
          uVar51 = (uint)(uVar67 != 0) | (uVar51 - 1) * 0x40 | (uint)(uVar65 != 0) << 5 |
                   (uint)(uVar66 != 0) << 4 | (uint)(0xff < uVar2) << 3 | (uint)(0xf < uVar59) << 2
                   | (uint)(3 < uVar3) << 1;
          if (1 < uVar4) {
            uVar51 = uVar51 + 1;
          }
          if (0x20 < uVar51) {
            func_0x0028f83c(4,0,0x65,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3fd);
            unaff_x27 = plVar73;
code_r0x002fd084:
            uVar118 = func_0x0028edc4();
            auVar20._8_8_ = uVar118;
            auVar20._0_8_ = psVar71;
            func_0x002f7efc(lVar55);
            uVar70 = 0;
            lVar55 = 0;
            if (((2 < (uint)unaff_x25) || (((uint)uVar118 & 0xff000000) != 0x4000000)) ||
               (unaff_x25 = (long *)(ulong)((uint)unaff_x25 + 1), plVar73 = unaff_x27,
               ((uint)uVar118 & 0xfff) != 0x8d)) goto code_r0x002fd4a8;
            goto code_r0x002fc85c;
          }
code_r0x002fc954:
          psVar56 = (segment_command *)func_0x0036e31c(0x30);
          if (psVar56 == (segment_command *)0x0) {
LAB_002fd00c:
            psVar71 = auVar20._0_8_;
            psVar72 = (segment_command *)((long)&MACH_HEADER.magic + 3);
            func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
joined_r0x002fd12c:
            plVar57 = (long *)((long)&MACH_HEADER.magic + 1);
            unaff_x27 = plVar73;
            auVar44 = auVar20;
joined_r0x002fd12c:
            if (psVar56 != (segment_command *)0x0) {
              psVar71 = auVar44._0_8_;
              if ((char)psVar56->fileoff == '\0') {
                if (*(long *)(psVar56->segname + 8) == 0) {
                  func_0x0079db4c();
code_r0x002fd4e8:
                  func_0x0079f160();
code_r0x002fd4ec:
                  func_0x0079f138();
code_r0x002fd4f0:
                  func_0x0079f110();
                  goto code_r0x002fd4f4;
                }
                lVar60 = *(long *)(psVar56->segname + 8) + -1;
                *(long *)(psVar56->segname + 8) = lVar60;
                qVar68 = *(qword *)(*(long *)psVar56->segname + lVar60 * 8);
                psVar56->vmsize = qVar68;
                if (qVar68 != 0) goto code_r0x002fd4f8;
              }
              uVar146._0_4_ = psVar56->cmd;
              uVar146._4_4_ = psVar56->cmdsize;
              func_0x00373520(uVar146,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
              func_0x0036e3d8(*(undefined8 *)psVar56->segname);
              func_0x0036e3d8(psVar56);
            }
            if ((int)plVar57 == 0) {
              if (((int)unaff_x28 != 0) && (iVar49 = func_0x002fb278(lVar55), iVar49 == 0)) {
                func_0x002f7efc(lVar55);
                return 0;
              }
              lVar60 = *(long *)((long)plVar48 + -0xb0);
              func_0x002f8cb0(lVar60);
              puVar69 = *(undefined8 **)(lVar60 + 8);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 8) = *(undefined8 *)(lVar55 + 8);
              *(undefined8 *)(lVar55 + 8) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x10);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x10) = *(undefined8 *)(lVar55 + 0x10);
              *(undefined8 *)(lVar55 + 0x10) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x18);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x18) = *(undefined8 *)(lVar55 + 0x18);
              *(undefined8 *)(lVar55 + 0x18) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x20);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x20) = *(undefined8 *)(lVar55 + 0x20);
              *(undefined8 *)(lVar55 + 0x20) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x28);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x28) = *(undefined8 *)(lVar55 + 0x28);
              *(undefined8 *)(lVar55 + 0x28) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x30);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x30) = *(undefined8 *)(lVar55 + 0x30);
              *(undefined8 *)(lVar55 + 0x30) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x38);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x38) = *(undefined8 *)(lVar55 + 0x38);
              *(undefined8 *)(lVar55 + 0x38) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x40);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x40) = *(undefined8 *)(lVar55 + 0x40);
              *(undefined8 *)(lVar55 + 0x40) = 0;
              func_0x002a34e0(*(undefined8 *)(lVar60 + 0x128));
              *(undefined8 *)(lVar60 + 0x128) = *(undefined8 *)(lVar55 + 0x128);
              *(undefined8 *)(lVar55 + 0x128) = 0;
              func_0x002a34e0(*(undefined8 *)(lVar60 + 0x130));
              *(undefined8 *)(lVar60 + 0x130) = *(undefined8 *)(lVar55 + 0x130);
              *(undefined8 *)(lVar55 + 0x130) = 0;
              func_0x002a34e0(*(undefined8 *)(lVar60 + 0x138));
              *(undefined8 *)(lVar60 + 0x138) = *(undefined8 *)(lVar55 + 0x138);
              *(undefined8 *)(lVar55 + 0x138) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x140);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x140) = *(undefined8 *)(lVar55 + 0x140);
              *(undefined8 *)(lVar55 + 0x140) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x148);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x148) = *(undefined8 *)(lVar55 + 0x148);
              *(undefined8 *)(lVar55 + 0x148) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x150);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x150) = *(undefined8 *)(lVar55 + 0x150);
              *(undefined8 *)(lVar55 + 0x150) = 0;
              puVar69 = *(undefined8 **)(lVar60 + 0x158);
              if (puVar69 != (undefined8 *)0x0) {
                uVar51 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar51 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar51 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar51 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar60 + 0x158) = *(undefined8 *)(lVar55 + 0x158);
              *(undefined8 *)(lVar55 + 0x158) = 0;
              *(byte *)(lVar60 + 0x180) =
                   *(byte *)(lVar60 + 0x180) & 0xfe | *(byte *)(lVar55 + 0x180) & 1;
              uVar70 = 1;
              goto code_r0x002fd4a8;
            }
            goto code_r0x002fd084;
          }
          psVar56->segname[0] = '\0';
          psVar56->segname[1] = '\0';
          psVar56->segname[2] = '\0';
          psVar56->segname[3] = '\0';
          psVar56->segname[4] = '\0';
          psVar56->segname[5] = '\0';
          psVar56->segname[6] = '\0';
          psVar56->segname[7] = '\0';
          psVar56->segname[8] = '\0';
          psVar56->segname[9] = '\0';
          psVar56->segname[10] = '\0';
          psVar56->segname[0xb] = '\0';
          psVar56->segname[0xc] = '\0';
          psVar56->segname[0xd] = '\0';
          psVar56->segname[0xe] = '\0';
          psVar56->segname[0xf] = '\0';
          psVar56->vmaddr = 0;
          if ((char)psVar56->fileoff == '\0') {
            qVar68 = psVar56->vmsize;
            lVar60 = func_0x0036e48c(0,0x100);
            if (lVar60 == 0) {
              *(undefined2 *)&psVar56->fileoff = 0x101;
            }
            else {
              psVar56->vmaddr = 0x20;
              *(qword *)(lVar60 + *(long *)(psVar56->segname + 8) * 8) = qVar68;
              *(long *)psVar56->segname = lVar60;
              *(long *)(psVar56->segname + 8) = *(long *)(psVar56->segname + 8) + 1;
            }
          }
          lVar60 = func_0x0029e340(psVar56);
          uVar70 = func_0x0029e340(psVar56);
          *(undefined8 *)((long)plVar48 + -0x70) = uVar70;
          uVar59 = func_0x0029e340(psVar56);
          auVar43._8_8_ = uVar59;
          auVar43._0_8_ = lVar60;
          auVar42._8_8_ = uVar59;
          auVar42._0_8_ = lVar60;
          auVar41._8_8_ = uVar59;
          auVar41._0_8_ = lVar60;
          auVar40._8_8_ = uVar59;
          auVar40._0_8_ = lVar60;
          auVar39._8_8_ = uVar59;
          auVar39._0_8_ = lVar60;
          auVar38._8_8_ = uVar59;
          auVar38._0_8_ = lVar60;
          auVar37._8_8_ = uVar59;
          auVar37._0_8_ = lVar60;
          auVar27._8_8_ = uVar59;
          auVar27._0_8_ = lVar60;
          auVar26._8_8_ = uVar59;
          auVar26._0_8_ = lVar60;
          auVar25._8_8_ = uVar59;
          auVar25._0_8_ = lVar60;
          auVar24._8_8_ = uVar59;
          auVar24._0_8_ = lVar60;
          auVar23._8_8_ = uVar59;
          auVar23._0_8_ = lVar60;
          auVar22._8_8_ = uVar59;
          auVar22._0_8_ = lVar60;
          auVar21._8_8_ = uVar59;
          auVar21._0_8_ = lVar60;
          auVar20._8_8_ = uVar59;
          auVar20._0_8_ = lVar60;
          unaff_x24 = (segment_command *)func_0x0029e340(psVar56);
          plVar57 = (long *)func_0x0029e340(psVar56);
          unaff_x27 = (long *)func_0x0029e340(psVar56);
          *(long *)((long)plVar48 + -0x78) = lVar60;
          if (((((lVar60 == 0) || (auVar20 = auVar21, *(long *)((long)plVar48 + -0x70) == 0)) ||
               (auVar20 = auVar22, uVar59 == 0)) ||
              ((auVar20 = auVar23, unaff_x24 == (segment_command *)0x0 ||
               (auVar20 = auVar24, plVar57 == (long *)0x0)))) ||
             (plVar73 = unaff_x27, auVar20 = auVar25, unaff_x27 == (long *)0x0)) goto LAB_002fd00c;
          lVar60 = *(long *)((long)plVar48 + -0x88);
          if ((int)plVar57[1] <= (int)lVar60) {
            iVar49 = func_0x0029afb8(plVar57,*(undefined8 *)((long)plVar48 + -0x98));
            auVar20 = auVar26;
            if (iVar49 == 0) goto LAB_002fd00c;
            iVar49 = (int)plVar57[1];
            lVar60 = *(long *)((long)plVar48 + -0x88);
            if (iVar49 <= (int)lVar60) {
              _bzero(*plVar57 + (long)iVar49 * 8,(ulong)(uint)((int)lVar60 - iVar49) * 8 + 8);
              lVar60 = *(long *)((long)plVar48 + -0x88);
            }
            *(int *)(plVar57 + 1) = (int)*(undefined8 *)((long)plVar48 + -0x98);
          }
          *(ulong *)(*plVar57 + lVar60 * 8) = *(ulong *)(*plVar57 + lVar60 * 8) | 0x10000000;
          lVar60 = *(long *)((long)plVar48 + -0x90);
          if ((int)unaff_x27[1] <= (int)lVar60) {
            iVar49 = func_0x0029afb8(unaff_x27,*(undefined8 *)((long)plVar48 + -0xa0));
            auVar20 = auVar27;
            if (iVar49 == 0) goto LAB_002fd00c;
            iVar49 = (int)unaff_x27[1];
            lVar60 = *(long *)((long)plVar48 + -0x90);
            if (iVar49 <= (int)lVar60) {
              _bzero(*unaff_x27 + (long)iVar49 * 8,(ulong)(uint)((int)lVar60 - iVar49) * 8 + 8);
              lVar60 = *(long *)((long)plVar48 + -0x90);
            }
            *(int *)(unaff_x27 + 1) = (int)*(undefined8 *)((long)plVar48 + -0xa0);
          }
          *(ulong *)(*unaff_x27 + lVar60 * 8) = *(ulong *)(*unaff_x27 + lVar60 * 8) | 1;
          if (*(long *)(lVar55 + 8) == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 8) = 0;
              auVar20 = auVar43;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 8) = lVar60;
            lVar60 = *(long *)(lVar55 + 0x18);
          }
          else {
            lVar60 = *(long *)(lVar55 + 0x18);
          }
          if (lVar60 == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 0x18) = 0;
              auVar20 = auVar42;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 0x18) = lVar60;
            lVar60 = *(long *)(lVar55 + 0x10);
          }
          else {
            lVar60 = *(long *)(lVar55 + 0x10);
          }
          if (lVar60 == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 0x10) = 0;
              auVar20 = auVar41;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 0x10) = lVar60;
            lVar60 = *(long *)(lVar55 + 0x20);
          }
          else {
            lVar60 = *(long *)(lVar55 + 0x20);
          }
          if (lVar60 == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 0x20) = 0;
              auVar20 = auVar40;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 0x20) = lVar60;
            lVar60 = *(long *)(lVar55 + 0x28);
          }
          else {
            lVar60 = *(long *)(lVar55 + 0x28);
          }
          if (lVar60 == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 0x28) = 0;
              auVar20 = auVar39;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 0x28) = lVar60;
            lVar60 = *(long *)(lVar55 + 0x30);
          }
          else {
            lVar60 = *(long *)(lVar55 + 0x30);
          }
          if (lVar60 == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 0x30) = 0;
              auVar20 = auVar38;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 0x30) = lVar60;
            lVar60 = *(long *)(lVar55 + 0x38);
          }
          else {
            lVar60 = *(long *)(lVar55 + 0x38);
          }
          if (lVar60 == 0) {
            lVar60 = func_0x0036e31c(0x18);
            if (lVar60 == 0) {
              *(undefined8 *)(lVar55 + 0x38) = 0;
              auVar20 = auVar37;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar60 + 0x14) = 1;
            *(long *)(lVar55 + 0x38) = lVar60;
            psVar71 = *(segment_command **)(lVar55 + 0x10);
            if (psVar71 != psVar58) goto code_r0x002fcb2c;
LAB_002fcc64:
            psVar72 = &segment_command_00000020;
            iVar49 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo);
          }
          else {
            psVar71 = *(segment_command **)(lVar55 + 0x10);
            if (psVar71 == psVar58) goto LAB_002fcc64;
code_r0x002fcb2c:
            auVar20._0_8_ = psVar71;
            iVar49 = func_0x0029afb8(psVar71,(long)*(int *)psVar58->segname);
            if (iVar49 == 0) goto LAB_002fd00c;
            uVar50 = 0;
            if (*(int *)psVar58->segname != 0) {
              uVar136._0_4_ = psVar58->cmd;
              uVar136._4_4_ = psVar58->cmdsize;
              uVar127._0_4_ = psVar71->cmd;
              uVar127._4_4_ = psVar71->cmdsize;
              _memcpy(uVar127,uVar136,(long)*(int *)psVar58->segname << 3);
              uVar50 = *(undefined4 *)psVar58->segname;
            }
            *(undefined4 *)psVar71->segname = uVar50;
            *(undefined4 *)(psVar71->segname + 8) = *(undefined4 *)(psVar58->segname + 8);
            psVar72 = &segment_command_00000020;
            iVar49 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo);
          }
          auVar20._0_8_ = psVar71;
          if (iVar49 == 0) goto LAB_002fd00c;
          auVar44._8_8_ = uVar59;
          auVar44._0_8_ = psVar71;
          auVar36._8_8_ = uVar59;
          auVar36._0_8_ = psVar71;
          iVar49 = func_0x0029bf0c(unaff_x24);
          if (iVar49 != 0x800) goto code_r0x002fd4e8;
          if (*(uint *)((long)plVar48 + -0xa8) < 0x1000) {
            psVar72 = (segment_command *)(ulong)*(uint *)((long)plVar48 + -0xb4);
            iVar49 = func_0x0029f130(unaff_x24,unaff_x24);
            auVar20 = auVar44;
            if (iVar49 == 0) goto LAB_002fd00c;
          }
          else if (*(uint *)((long)plVar48 + -0xa8) != 0x1000) {
            iVar49 = func_0x0029b0e4(unaff_x24,1);
            if (iVar49 != 0) {
              psVar72 = (segment_command *)(ulong)*(uint *)((long)plVar48 + -0xb8);
              iVar49 = func_0x0029ed38(unaff_x24,unaff_x24);
              auVar20 = auVar36;
              if (iVar49 != 0) goto code_r0x002fccfc;
            }
            goto LAB_002fd00c;
          }
code_r0x002fccfc:
          *(ulong *)((long)plVar48 + -0xc0) = uVar59;
          iVar49 = func_0x0029bf0c(unaff_x24);
          *(int *)((long)plVar48 + -0xc4) = (int)unaff_x28;
          if (*(int *)((long)plVar48 + -0xa4) != iVar49) goto code_r0x002fd4ec;
code_r0x002fcd40:
          do {
            auVar35._8_8_ = uVar59;
            auVar35._0_8_ = psVar71;
            auVar34._8_8_ = uVar59;
            auVar34._0_8_ = psVar71;
            auVar30._8_8_ = uVar59;
            auVar30._0_8_ = psVar71;
            auVar29._8_8_ = uVar59;
            auVar29._0_8_ = psVar71;
            auVar28._8_8_ = uVar59;
            auVar28._0_8_ = psVar71;
            auVar20._8_8_ = uVar59;
            auVar20._0_8_ = psVar71;
            iVar49 = func_0x0031de90(*(undefined8 *)(lVar55 + 0x20),
                                     *(undefined4 *)((long)plVar48 + -0xa4),
                                     *(undefined8 *)(lVar55 + 0x10),0,unaff_x24,plVar57,psVar56,
                                     *(undefined8 *)((long)plVar48 + -0x80));
            if (iVar49 == 0) goto LAB_002fd00c;
            if (*(long *)((long)plVar48 + -0x80) != 0) {
              cVar5 = **(char **)((long)plVar48 + -0x80);
              if (cVar5 == '\x01') {
                iVar49 = (**(code **)(*(char **)((long)plVar48 + -0x80) + 0x10))(3,0);
                auVar20 = auVar35;
                if (iVar49 == 0) goto LAB_002fd00c;
              }
              else {
                auVar20 = auVar28;
                if (cVar5 != '\x02') goto LAB_002fd00c;
                (**(code **)(*(long *)((long)plVar48 + -0x80) + 0x10))(3,0);
              }
            }
            iVar49 = func_0x0031de90(*(undefined8 *)(lVar55 + 0x28),
                                     *(undefined4 *)((long)plVar48 + -0xa4),
                                     *(undefined8 *)(lVar55 + 0x10),*(undefined8 *)(lVar55 + 0x20),
                                     unaff_x24,plVar57,psVar56,
                                     *(undefined8 *)((long)plVar48 + -0x80));
            auVar20 = auVar29;
            if (iVar49 == 0) goto LAB_002fd00c;
            if (*(long *)((long)plVar48 + -0x80) != 0) {
              cVar5 = **(char **)((long)plVar48 + -0x80);
              if (cVar5 == '\x01') {
                iVar49 = (**(code **)(*(char **)((long)plVar48 + -0x80) + 0x10))(3,1);
                auVar20 = auVar34;
                if (iVar49 == 0) goto LAB_002fd00c;
              }
              else {
                auVar20 = auVar30;
                if (cVar5 != '\x02') goto LAB_002fd00c;
                (**(code **)(*(long *)((long)plVar48 + -0x80) + 0x10))(3,1);
              }
            }
            psVar71 = *(segment_command **)(lVar55 + 0x20);
            psVar72 = *(segment_command **)(lVar55 + 0x28);
            if ((psVar71 == (segment_command *)0x0) || (psVar72 == (segment_command *)0x0)) {
              if (psVar71 != (segment_command *)0x0) goto code_r0x002fce74;
              psVar72 = (segment_command *)0x0;
            }
            else {
              iVar49 = *(int *)(psVar71->segname + 8);
              if (iVar49 == *(int *)(psVar72->segname + 8)) {
                uVar144._0_4_ = psVar71->cmd;
                uVar144._4_4_ = psVar71->cmdsize;
                uVar145._0_4_ = psVar72->cmd;
                uVar145._4_4_ = psVar72->cmdsize;
                iVar53 = func_0x0029d99c(uVar144,(long)*(int *)psVar71->segname,uVar145,
                                         (long)*(int *)psVar72->segname);
                iVar52 = -iVar53;
                if (iVar49 == 0) {
                  iVar52 = iVar53;
                }
                if (-1 < iVar52) {
code_r0x002fce7c:
                  psVar72 = psVar71;
                  goto code_r0x002fce80;
                }
              }
              else if (iVar49 == 0) goto code_r0x002fce7c;
code_r0x002fce74:
              *(segment_command **)(lVar55 + 0x20) = psVar72;
              *(segment_command **)(lVar55 + 0x28) = psVar71;
            }
code_r0x002fce80:
            func_0x00373e9c(0xa29210,&DAT_0029be70);
            iVar49 = func_0x0029b864(*(undefined8 *)((long)plVar48 + -0x70),psVar72,0xa398c0);
            uVar59 = *(ulong *)((long)plVar48 + -0xc0);
            if (iVar49 == 0) {
code_r0x002fd008:
              auVar20._8_8_ = uVar59;
              auVar20._0_8_ = psVar71;
              unaff_x28 = (ulong)*(uint *)((long)plVar48 + -0xc4);
              goto LAB_002fd00c;
            }
            psVar71 = *(segment_command **)(lVar55 + 0x28);
            func_0x00373e9c(0xa29210,&DAT_0029be70);
            iVar49 = func_0x0029b864(uVar59,psVar71,0xa398c0);
            if ((iVar49 == 0) ||
               (iVar49 = func_0x002a7f48(*(undefined8 *)((long)plVar48 + -0x78),
                                         *(undefined8 *)((long)plVar48 + -0x70),uVar59,psVar56),
               iVar49 == 0)) goto code_r0x002fd008;
            psVar72 = *(segment_command **)(lVar55 + 0x10);
            iVar49 = func_0x002a5b4c(*(undefined8 *)(lVar55 + 0x18),
                                     (undefined1 *)((long)plVar48 + -100),psVar72,
                                     *(undefined8 *)((long)plVar48 + -0x78),psVar56);
            if (iVar49 == 0) goto code_r0x002fd008;
            puVar69 = *(undefined8 **)(lVar55 + 0x18);
            unaff_x28 = (ulong)*(uint *)((long)plVar48 + -0xc4);
            if (puVar69 == (undefined8 *)0x0) break;
            uVar51 = *(uint *)(puVar69 + 2);
            uVar59 = (ulong)uVar51;
            if (uVar51 != *(uint *)(unaff_x27 + 2)) {
              if (uVar51 == 0) break;
              goto code_r0x002fcd40;
            }
            psVar72 = (segment_command *)*unaff_x27;
            iVar52 = func_0x0029d99c(*puVar69,(long)*(int *)(puVar69 + 1),psVar72,
                                     (long)(int)unaff_x27[1]);
            iVar49 = -iVar52;
            if (uVar51 == 0) {
              iVar49 = iVar52;
            }
          } while (iVar49 < 1);
          auVar44._8_8_ = uVar59;
          auVar44._0_8_ = psVar71;
          uVar54 = func_0x0029bf0c(*(undefined8 *)((long)plVar48 + -0x70));
          uVar51 = *(uint *)((long)plVar48 + -0xa4);
          plVar57 = (long *)(ulong)uVar51;
          if (uVar54 != uVar51) goto code_r0x002fd4f0;
          uVar70 = *(undefined8 *)((long)plVar48 + -0xc0);
          auVar44._8_8_ = uVar70;
          auVar47._8_8_ = uVar70;
          auVar47._0_8_ = psVar71;
          auVar46._8_8_ = uVar70;
          auVar46._0_8_ = psVar71;
          auVar45._8_8_ = uVar70;
          auVar45._0_8_ = psVar71;
          auVar33._8_8_ = uVar70;
          auVar33._0_8_ = psVar71;
          auVar32._8_8_ = uVar70;
          auVar32._0_8_ = psVar71;
          auVar31._8_8_ = uVar70;
          auVar31._0_8_ = psVar71;
          auVar20._8_8_ = uVar70;
          auVar20._0_8_ = psVar71;
          uVar54 = func_0x0029bf0c(uVar70);
          if (uVar54 == uVar51) {
            iVar49 = func_0x002a80fc(*(undefined8 *)(lVar55 + 8),*(undefined8 *)(lVar55 + 0x20),
                                     *(undefined8 *)(lVar55 + 0x28),psVar56);
            if ((iVar49 == 0) ||
               (iVar49 = func_0x0029f764(0,*(undefined8 *)(lVar55 + 0x30),
                                         *(undefined8 *)(lVar55 + 0x18),
                                         *(undefined8 *)((long)plVar48 + -0x70),
                                         *(undefined4 *)((long)plVar48 + -0xa4),psVar56),
               auVar20 = auVar31, iVar49 == 0)) goto LAB_002fd00c;
            psVar72 = *(segment_command **)(lVar55 + 0x18);
            iVar49 = func_0x0029f764(0,*(undefined8 *)(lVar55 + 0x38),psVar72,uVar70,
                                     *(undefined4 *)((long)plVar48 + -0xa4),psVar56);
            auVar20 = auVar32;
            if (iVar49 == 0) goto LAB_002fd00c;
            plVar57 = *(long **)(lVar55 + 8);
            uVar51 = *(uint *)(plVar57 + 1);
            uVar59 = (ulong)uVar51;
            lVar60 = uVar59 * 8;
            do {
              lVar60 = lVar60 + -8;
              iVar49 = (int)uVar59;
              uVar59 = (ulong)(iVar49 - 1);
              if (iVar49 < 1) {
                *(uint *)(plVar57 + 1) = uVar51 & (int)uVar51 >> 0x1f;
                if (-1 < (int)uVar51) {
                  *(undefined4 *)(plVar57 + 2) = 0;
                }
                goto code_r0x002fd0d4;
              }
            } while (*(long *)(*plVar57 + lVar60) == 0);
            *(int *)(plVar57 + 1) = iVar49;
code_r0x002fd0d4:
            iVar49 = func_0x0029bf0c();
            if (iVar49 != *(int *)((long)plVar48 + -0xa8)) {
              psVar72 = (segment_command *)((long)&segment_command_00000020.vmsize + 4);
              func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
              auVar20 = auVar47;
              goto joined_r0x002fd12c;
            }
            iVar49 = func_0x002fbc24(lVar55,psVar56);
            auVar20 = auVar33;
            if (iVar49 == 0) goto LAB_002fd00c;
            iVar49 = func_0x002f77a0(lVar55);
            if (iVar49 == 0) {
              psVar72 = (segment_command *)(section_00000068.segname + 4);
              func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
              auVar20 = auVar46;
              goto joined_r0x002fd12c;
            }
            plVar57 = (long *)0x0;
            auVar44 = auVar45;
            goto joined_r0x002fd12c;
          }
code_r0x002fd4f4:
          func_0x0079f0e8();
code_r0x002fd4f8:
          auVar152 = func_0x0079db28();
          *(segment_command **)((long)plVar48 + -0x110) = unaff_x24;
          *(segment_command **)((long)plVar48 + -0x108) = psVar58;
          *(undefined1 (*) [16])((long)plVar48 + -0x100) = auVar44;
          *(long *)((long)plVar48 + -0xf0) = lVar55;
          *(long **)((long)plVar48 + -0xe8) = plVar57;
          *(undefined1 **)((long)plVar48 + -0xe0) = (undefined1 *)((long)plVar48 + -0x10);
          *(undefined **)((long)plVar48 + -0xd8) = &_aws_lc_0_24_0_RSA_generate_key_fips;
          puVar74 = (undefined1 *)((long)plVar48 + -0xe0);
          if ((auVar152._8_4_ < 0x800) || ((auVar152._8_8_ & 0x7f) != 0)) {
            func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
            return 0;
          }
          psVar58 = (segment_command *)func_0x0036e31c(0x18);
          if (psVar58 == (segment_command *)0x0) {
            return 0;
          }
          psVar58->segname[0xc] = '\x01';
          psVar58->segname[0xd] = '\0';
          psVar58->segname[0xe] = '\0';
          psVar58->segname[0xf] = '\0';
          if (*(int *)(psVar58->segname + 4) == 0) {
            unaff_x23 = (long *)func_0x0036e358(1,8);
            if (unaff_x23 == (long *)0x0) {
              uVar51 = *(uint *)(psVar58->segname + 0xc);
              if ((uVar51 >> 1 & 1) == 0) {
                uVar147._0_4_ = psVar58->cmd;
                uVar147._4_4_ = psVar58->cmdsize;
                func_0x0036e3d8(uVar147);
                uVar51 = *(uint *)(psVar58->segname + 0xc);
              }
              if ((uVar51 & 1) == 0) {
                psVar58->cmd = 0;
                psVar58->cmdsize = 0;
                return 0;
              }
              func_0x0036e3d8(psVar58);
              return 0;
            }
            if (*(int *)psVar58->segname != 0) {
              uVar148._0_4_ = psVar58->cmd;
              uVar148._4_4_ = psVar58->cmdsize;
              _memcpy(unaff_x23,uVar148,(long)*(int *)psVar58->segname << 3);
            }
            uVar149._0_4_ = psVar58->cmd;
            uVar149._4_4_ = psVar58->cmdsize;
            func_0x0036e3d8(uVar149);
            *(long **)psVar58 = unaff_x23;
            psVar58->segname[4] = '\x01';
            psVar58->segname[5] = '\0';
            psVar58->segname[6] = '\0';
            psVar58->segname[7] = '\0';
          }
          else {
            unaff_x23 = *(long **)psVar58;
          }
          psVar58->segname[8] = '\0';
          psVar58->segname[9] = '\0';
          psVar58->segname[10] = '\0';
          psVar58->segname[0xb] = '\0';
          *unaff_x23 = (long)&UNK_00010001;
          psVar58->segname[0] = '\x01';
          psVar58->segname[1] = '\0';
          psVar58->segname[2] = '\0';
          psVar58->segname[3] = '\0';
          uVar59 = 1;
          puVar75 = &UNK_002fd5f8;
          plVar48 = (long *)((long)plVar48 + -0x110);
          param_4 = psVar58;
          psVar71 = psVar72;
          auVar20 = auVar152;
        }
        func_0x0028f0e4();
        lVar55 = func_0x002f8ac4(0);
        if (lVar55 == 0) {
code_r0x002fd15c:
          uVar70 = 0;
          lVar55 = 0;
        }
        else {
          func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
          uVar51 = func_0x0028edc4();
          func_0x002f7efc(lVar55);
          if ((uVar51 & 0xff000fff) == 0x400008d) {
            func_0x0028f0e4();
            lVar55 = func_0x002f8ac4(0);
            if (lVar55 == 0) goto code_r0x002fd15c;
            func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
            uVar51 = func_0x0028edc4();
            func_0x002f7efc(lVar55);
            if ((uVar51 & 0xff000fff) == 0x400008d) {
              func_0x0028f0e4();
              lVar55 = func_0x002f8ac4(0);
              if (lVar55 == 0) goto code_r0x002fd15c;
              func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
              uVar51 = func_0x0028edc4();
              func_0x002f7efc(lVar55);
              if ((uVar51 & 0xff000fff) == 0x400008d) {
                func_0x0028f0e4();
                lVar55 = func_0x002f8ac4(0);
                if (lVar55 == 0) goto code_r0x002fd15c;
                func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
                func_0x0028edc4();
                func_0x002f7efc(lVar55);
              }
            }
          }
          lVar55 = 0;
          uVar70 = 0;
        }
code_r0x002fd4a8:
        func_0x002f7efc(lVar55);
        return uVar70;
      }
      if ((int)psVar71->fileoff != 0) goto code_r0x002fc268;
      unaff_x20 = (segment_command *)&psVar71->vmaddr;
      lVar55 = (long)(int)*(uint *)(unaff_x28 + 0x20);
      uVar51 = (uint)psVar71->vmsize;
      if (*(uint *)(unaff_x28 + 0x20) < uVar51) {
        uVar59 = (int)uVar51 - lVar55;
        if (uVar59 < 8) {
          uVar67 = 0;
          lVar60 = lVar55;
code_r0x002fc360:
          lVar55 = (int)uVar51 - lVar60;
          puVar61 = (ulong *)(*(qword *)unaff_x20 + lVar60 * 8);
          do {
            uVar67 = *puVar61 | uVar67;
            lVar55 = lVar55 + -1;
            puVar61 = puVar61 + 1;
          } while (lVar55 != 0);
        }
        else {
          uVar65 = uVar59 & 0xfffffffffffffff8;
          lVar60 = uVar65 + lVar55;
          bVar76 = 0;
          bVar77 = 0;
          bVar78 = 0;
          bVar79 = 0;
          bVar80 = 0;
          bVar81 = 0;
          bVar82 = 0;
          bVar83 = 0;
          bVar84 = 0;
          bVar85 = 0;
          bVar86 = 0;
          bVar87 = 0;
          bVar88 = 0;
          bVar89 = 0;
          bVar90 = 0;
          bVar91 = 0;
          bVar92 = 0;
          bVar94 = 0;
          bVar95 = 0;
          bVar96 = 0;
          bVar97 = 0;
          bVar98 = 0;
          bVar99 = 0;
          bVar100 = 0;
          bVar101 = 0;
          bVar102 = 0;
          bVar103 = 0;
          bVar104 = 0;
          bVar105 = 0;
          bVar106 = 0;
          bVar107 = 0;
          bVar108 = 0;
          uVar70 = 0;
          uVar118 = 0;
          uVar127 = 0;
          uVar136 = 0;
          puVar69 = (undefined8 *)(*(qword *)unaff_x20 + lVar55 * 8 + 0x20);
          uVar67 = uVar65;
          do {
            uVar145 = puVar69[-3];
            uVar144 = puVar69[-4];
            uVar147 = puVar69[-1];
            uVar146 = puVar69[-2];
            uVar149 = puVar69[1];
            uVar148 = *puVar69;
            uVar151 = puVar69[3];
            uVar150 = puVar69[2];
            bVar76 = (byte)uVar144 | bVar76;
            bVar77 = (byte)((ulong)uVar144 >> 8) | bVar77;
            bVar78 = (byte)((ulong)uVar144 >> 0x10) | bVar78;
            bVar79 = (byte)((ulong)uVar144 >> 0x18) | bVar79;
            bVar80 = (byte)((ulong)uVar144 >> 0x20) | bVar80;
            bVar81 = (byte)((ulong)uVar144 >> 0x28) | bVar81;
            bVar82 = (byte)((ulong)uVar144 >> 0x30) | bVar82;
            bVar83 = (byte)((ulong)uVar144 >> 0x38) | bVar83;
            bVar84 = (byte)uVar145 | bVar84;
            bVar85 = (byte)((ulong)uVar145 >> 8) | bVar85;
            bVar86 = (byte)((ulong)uVar145 >> 0x10) | bVar86;
            bVar87 = (byte)((ulong)uVar145 >> 0x18) | bVar87;
            bVar88 = (byte)((ulong)uVar145 >> 0x20) | bVar88;
            bVar89 = (byte)((ulong)uVar145 >> 0x28) | bVar89;
            bVar90 = (byte)((ulong)uVar145 >> 0x30) | bVar90;
            bVar91 = (byte)((ulong)uVar145 >> 0x38) | bVar91;
            bVar92 = (byte)uVar146 | bVar92;
            bVar94 = (byte)((ulong)uVar146 >> 8) | bVar94;
            bVar95 = (byte)((ulong)uVar146 >> 0x10) | bVar95;
            bVar96 = (byte)((ulong)uVar146 >> 0x18) | bVar96;
            bVar97 = (byte)((ulong)uVar146 >> 0x20) | bVar97;
            bVar98 = (byte)((ulong)uVar146 >> 0x28) | bVar98;
            bVar99 = (byte)((ulong)uVar146 >> 0x30) | bVar99;
            bVar100 = (byte)((ulong)uVar146 >> 0x38) | bVar100;
            bVar101 = (byte)uVar147 | bVar101;
            bVar102 = (byte)((ulong)uVar147 >> 8) | bVar102;
            bVar103 = (byte)((ulong)uVar147 >> 0x10) | bVar103;
            bVar104 = (byte)((ulong)uVar147 >> 0x18) | bVar104;
            bVar105 = (byte)((ulong)uVar147 >> 0x20) | bVar105;
            bVar106 = (byte)((ulong)uVar147 >> 0x28) | bVar106;
            bVar107 = (byte)((ulong)uVar147 >> 0x30) | bVar107;
            bVar108 = (byte)((ulong)uVar147 >> 0x38) | bVar108;
            bVar109 = (byte)uVar148 | (byte)uVar70;
            bVar110 = (byte)((ulong)uVar148 >> 8) | (byte)((ulong)uVar70 >> 8);
            bVar111 = (byte)((ulong)uVar148 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
            bVar112 = (byte)((ulong)uVar148 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
            bVar113 = (byte)((ulong)uVar148 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
            bVar114 = (byte)((ulong)uVar148 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
            bVar115 = (byte)((ulong)uVar148 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
            bVar116 = (byte)((ulong)uVar148 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
            uVar70 = CONCAT17(bVar116,CONCAT16(bVar115,CONCAT15(bVar114,CONCAT14(bVar113,CONCAT13(
                                                  bVar112,CONCAT12(bVar111,CONCAT11(bVar110,bVar109)
                                                                  ))))));
            bVar117 = (byte)uVar149 | (byte)uVar118;
            bVar119 = (byte)((ulong)uVar149 >> 8) | (byte)((ulong)uVar118 >> 8);
            bVar120 = (byte)((ulong)uVar149 >> 0x10) | (byte)((ulong)uVar118 >> 0x10);
            bVar121 = (byte)((ulong)uVar149 >> 0x18) | (byte)((ulong)uVar118 >> 0x18);
            bVar122 = (byte)((ulong)uVar149 >> 0x20) | (byte)((ulong)uVar118 >> 0x20);
            bVar123 = (byte)((ulong)uVar149 >> 0x28) | (byte)((ulong)uVar118 >> 0x28);
            bVar124 = (byte)((ulong)uVar149 >> 0x30) | (byte)((ulong)uVar118 >> 0x30);
            bVar125 = (byte)((ulong)uVar149 >> 0x38) | (byte)((ulong)uVar118 >> 0x38);
            uVar118 = CONCAT17(bVar125,CONCAT16(bVar124,CONCAT15(bVar123,CONCAT14(bVar122,CONCAT13(
                                                  bVar121,CONCAT12(bVar120,CONCAT11(bVar119,bVar117)
                                                                  ))))));
            bVar126 = (byte)uVar150 | (byte)uVar127;
            bVar128 = (byte)((ulong)uVar150 >> 8) | (byte)((ulong)uVar127 >> 8);
            bVar129 = (byte)((ulong)uVar150 >> 0x10) | (byte)((ulong)uVar127 >> 0x10);
            bVar130 = (byte)((ulong)uVar150 >> 0x18) | (byte)((ulong)uVar127 >> 0x18);
            bVar131 = (byte)((ulong)uVar150 >> 0x20) | (byte)((ulong)uVar127 >> 0x20);
            bVar132 = (byte)((ulong)uVar150 >> 0x28) | (byte)((ulong)uVar127 >> 0x28);
            bVar133 = (byte)((ulong)uVar150 >> 0x30) | (byte)((ulong)uVar127 >> 0x30);
            bVar134 = (byte)((ulong)uVar150 >> 0x38) | (byte)((ulong)uVar127 >> 0x38);
            uVar127 = CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar131,CONCAT13(
                                                  bVar130,CONCAT12(bVar129,CONCAT11(bVar128,bVar126)
                                                                  ))))));
            bVar135 = (byte)uVar151 | (byte)uVar136;
            bVar137 = (byte)((ulong)uVar151 >> 8) | (byte)((ulong)uVar136 >> 8);
            bVar138 = (byte)((ulong)uVar151 >> 0x10) | (byte)((ulong)uVar136 >> 0x10);
            bVar139 = (byte)((ulong)uVar151 >> 0x18) | (byte)((ulong)uVar136 >> 0x18);
            bVar140 = (byte)((ulong)uVar151 >> 0x20) | (byte)((ulong)uVar136 >> 0x20);
            bVar141 = (byte)((ulong)uVar151 >> 0x28) | (byte)((ulong)uVar136 >> 0x28);
            bVar142 = (byte)((ulong)uVar151 >> 0x30) | (byte)((ulong)uVar136 >> 0x30);
            bVar143 = (byte)((ulong)uVar151 >> 0x38) | (byte)((ulong)uVar136 >> 0x38);
            uVar136 = CONCAT17(bVar143,CONCAT16(bVar142,CONCAT15(bVar141,CONCAT14(bVar140,CONCAT13(
                                                  bVar139,CONCAT12(bVar138,CONCAT11(bVar137,bVar135)
                                                                  ))))));
            uVar67 = uVar67 - 8;
            puVar69 = puVar69 + 8;
          } while (uVar67 != 0);
          bVar126 = bVar126 | bVar109 | bVar92 | bVar76;
          bVar128 = bVar128 | bVar110 | bVar94 | bVar77;
          bVar129 = bVar129 | bVar111 | bVar95 | bVar78;
          bVar130 = bVar130 | bVar112 | bVar96 | bVar79;
          bVar131 = bVar131 | bVar113 | bVar97 | bVar80;
          bVar132 = bVar132 | bVar114 | bVar98 | bVar81;
          bVar133 = bVar133 | bVar115 | bVar99 | bVar82;
          bVar134 = bVar134 | bVar116 | bVar100 | bVar83;
          bVar135 = bVar135 | bVar117 | bVar101 | bVar84;
          bVar137 = bVar137 | bVar119 | bVar102 | bVar85;
          bVar138 = bVar138 | bVar120 | bVar103 | bVar86;
          bVar139 = bVar139 | bVar121 | bVar104 | bVar87;
          bVar140 = bVar140 | bVar122 | bVar105 | bVar88;
          bVar141 = bVar141 | bVar123 | bVar106 | bVar89;
          bVar142 = bVar142 | bVar124 | bVar107 | bVar90;
          bVar143 = bVar143 | bVar125 | bVar108 | bVar91;
          auVar10[1] = bVar128;
          auVar10[0] = bVar126;
          auVar10[2] = bVar129;
          auVar10[3] = bVar130;
          auVar10[4] = bVar131;
          auVar10[5] = bVar132;
          auVar10[6] = bVar133;
          auVar10[7] = bVar134;
          auVar10[8] = bVar135;
          auVar10[9] = bVar137;
          auVar10[10] = bVar138;
          auVar10[0xb] = bVar139;
          auVar10[0xc] = bVar140;
          auVar10[0xd] = bVar141;
          auVar10[0xe] = bVar142;
          auVar10[0xf] = bVar143;
          auVar11[1] = bVar128;
          auVar11[0] = bVar126;
          auVar11[2] = bVar129;
          auVar11[3] = bVar130;
          auVar11[4] = bVar131;
          auVar11[5] = bVar132;
          auVar11[6] = bVar133;
          auVar11[7] = bVar134;
          auVar11[8] = bVar135;
          auVar11[9] = bVar137;
          auVar11[10] = bVar138;
          auVar11[0xb] = bVar139;
          auVar11[0xc] = bVar140;
          auVar11[0xd] = bVar141;
          auVar11[0xe] = bVar142;
          auVar11[0xf] = bVar143;
          auVar152 = NEON_ext(auVar10,auVar11,8,1);
          uVar67 = CONCAT17(bVar134 | auVar152[7],
                            CONCAT16(bVar133 | auVar152[6],
                                     CONCAT15(bVar132 | auVar152[5],
                                              CONCAT14(bVar131 | auVar152[4],
                                                       CONCAT13(bVar130 | auVar152[3],
                                                                CONCAT12(bVar129 | auVar152[2],
                                                                         CONCAT11(bVar128 | auVar152
                                                  [1],bVar126 | auVar152[0])))))));
          if (uVar59 != uVar65) goto code_r0x002fc360;
        }
        if (uVar67 != 0) goto code_r0x002fc268;
      }
      uVar70 = func_0x002a3384(unaff_x24,psVar56,unaff_x28,param_4);
      auVar152 = auVar93;
      if ((int)uVar70 == 0) goto code_r0x002fc288;
      uVar70 = func_0x002a3110(unaff_x24,unaff_x24,unaff_x28,unaff_x28,param_4);
      auVar152 = auVar18;
      if ((int)uVar70 == 0) goto code_r0x002fc288;
      psVar71 = unaff_x20;
      if (*(int *)(unaff_x28 + 0x28) != 0) goto code_r0x002fc268;
      lVar55 = param_3[0x26];
      auVar19._8_8_ = lVar55;
      auVar19._0_8_ = unaff_x23;
      auVar152._8_8_ = lVar55;
      auVar152._0_8_ = unaff_x23;
      lVar60 = (long)(int)*(uint *)(lVar55 + 0x20);
      uVar51 = *(uint *)(unaff_x28 + 0x20);
      if (uVar51 <= *(uint *)(lVar55 + 0x20)) goto code_r0x002fc470;
      lVar63 = *(long *)(unaff_x28 + 0x18);
      uVar59 = (int)uVar51 - lVar60;
      if (uVar59 < 8) {
        uVar67 = 0;
        lVar62 = lVar60;
code_r0x002fc454:
        lVar60 = (int)uVar51 - lVar62;
        puVar61 = (ulong *)(lVar63 + lVar62 * 8);
        do {
          uVar67 = *puVar61 | uVar67;
          lVar60 = lVar60 + -1;
          puVar61 = puVar61 + 1;
        } while (lVar60 != 0);
      }
      else {
        uVar65 = uVar59 & 0xfffffffffffffff8;
        lVar62 = uVar65 + lVar60;
        bVar76 = 0;
        bVar77 = 0;
        bVar78 = 0;
        bVar79 = 0;
        bVar80 = 0;
        bVar81 = 0;
        bVar82 = 0;
        bVar83 = 0;
        bVar84 = 0;
        bVar85 = 0;
        bVar86 = 0;
        bVar87 = 0;
        bVar88 = 0;
        bVar89 = 0;
        bVar90 = 0;
        bVar91 = 0;
        bVar92 = 0;
        bVar94 = 0;
        bVar95 = 0;
        bVar96 = 0;
        bVar97 = 0;
        bVar98 = 0;
        bVar99 = 0;
        bVar100 = 0;
        bVar101 = 0;
        bVar102 = 0;
        bVar103 = 0;
        bVar104 = 0;
        bVar105 = 0;
        bVar106 = 0;
        bVar107 = 0;
        bVar108 = 0;
        uVar70 = 0;
        uVar118 = 0;
        uVar127 = 0;
        uVar136 = 0;
        puVar69 = (undefined8 *)(lVar63 + lVar60 * 8 + 0x20);
        uVar67 = uVar65;
        do {
          uVar145 = puVar69[-3];
          uVar144 = puVar69[-4];
          uVar147 = puVar69[-1];
          uVar146 = puVar69[-2];
          uVar149 = puVar69[1];
          uVar148 = *puVar69;
          uVar151 = puVar69[3];
          uVar150 = puVar69[2];
          bVar76 = (byte)uVar144 | bVar76;
          bVar77 = (byte)((ulong)uVar144 >> 8) | bVar77;
          bVar78 = (byte)((ulong)uVar144 >> 0x10) | bVar78;
          bVar79 = (byte)((ulong)uVar144 >> 0x18) | bVar79;
          bVar80 = (byte)((ulong)uVar144 >> 0x20) | bVar80;
          bVar81 = (byte)((ulong)uVar144 >> 0x28) | bVar81;
          bVar82 = (byte)((ulong)uVar144 >> 0x30) | bVar82;
          bVar83 = (byte)((ulong)uVar144 >> 0x38) | bVar83;
          bVar84 = (byte)uVar145 | bVar84;
          bVar85 = (byte)((ulong)uVar145 >> 8) | bVar85;
          bVar86 = (byte)((ulong)uVar145 >> 0x10) | bVar86;
          bVar87 = (byte)((ulong)uVar145 >> 0x18) | bVar87;
          bVar88 = (byte)((ulong)uVar145 >> 0x20) | bVar88;
          bVar89 = (byte)((ulong)uVar145 >> 0x28) | bVar89;
          bVar90 = (byte)((ulong)uVar145 >> 0x30) | bVar90;
          bVar91 = (byte)((ulong)uVar145 >> 0x38) | bVar91;
          bVar92 = (byte)uVar146 | bVar92;
          bVar94 = (byte)((ulong)uVar146 >> 8) | bVar94;
          bVar95 = (byte)((ulong)uVar146 >> 0x10) | bVar95;
          bVar96 = (byte)((ulong)uVar146 >> 0x18) | bVar96;
          bVar97 = (byte)((ulong)uVar146 >> 0x20) | bVar97;
          bVar98 = (byte)((ulong)uVar146 >> 0x28) | bVar98;
          bVar99 = (byte)((ulong)uVar146 >> 0x30) | bVar99;
          bVar100 = (byte)((ulong)uVar146 >> 0x38) | bVar100;
          bVar101 = (byte)uVar147 | bVar101;
          bVar102 = (byte)((ulong)uVar147 >> 8) | bVar102;
          bVar103 = (byte)((ulong)uVar147 >> 0x10) | bVar103;
          bVar104 = (byte)((ulong)uVar147 >> 0x18) | bVar104;
          bVar105 = (byte)((ulong)uVar147 >> 0x20) | bVar105;
          bVar106 = (byte)((ulong)uVar147 >> 0x28) | bVar106;
          bVar107 = (byte)((ulong)uVar147 >> 0x30) | bVar107;
          bVar108 = (byte)((ulong)uVar147 >> 0x38) | bVar108;
          bVar109 = (byte)uVar148 | (byte)uVar70;
          bVar110 = (byte)((ulong)uVar148 >> 8) | (byte)((ulong)uVar70 >> 8);
          bVar111 = (byte)((ulong)uVar148 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
          bVar112 = (byte)((ulong)uVar148 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
          bVar113 = (byte)((ulong)uVar148 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
          bVar114 = (byte)((ulong)uVar148 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
          bVar115 = (byte)((ulong)uVar148 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
          bVar116 = (byte)((ulong)uVar148 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
          uVar70 = CONCAT17(bVar116,CONCAT16(bVar115,CONCAT15(bVar114,CONCAT14(bVar113,CONCAT13(
                                                  bVar112,CONCAT12(bVar111,CONCAT11(bVar110,bVar109)
                                                                  ))))));
          bVar117 = (byte)uVar149 | (byte)uVar118;
          bVar119 = (byte)((ulong)uVar149 >> 8) | (byte)((ulong)uVar118 >> 8);
          bVar120 = (byte)((ulong)uVar149 >> 0x10) | (byte)((ulong)uVar118 >> 0x10);
          bVar121 = (byte)((ulong)uVar149 >> 0x18) | (byte)((ulong)uVar118 >> 0x18);
          bVar122 = (byte)((ulong)uVar149 >> 0x20) | (byte)((ulong)uVar118 >> 0x20);
          bVar123 = (byte)((ulong)uVar149 >> 0x28) | (byte)((ulong)uVar118 >> 0x28);
          bVar124 = (byte)((ulong)uVar149 >> 0x30) | (byte)((ulong)uVar118 >> 0x30);
          bVar125 = (byte)((ulong)uVar149 >> 0x38) | (byte)((ulong)uVar118 >> 0x38);
          uVar118 = CONCAT17(bVar125,CONCAT16(bVar124,CONCAT15(bVar123,CONCAT14(bVar122,CONCAT13(
                                                  bVar121,CONCAT12(bVar120,CONCAT11(bVar119,bVar117)
                                                                  ))))));
          bVar126 = (byte)uVar150 | (byte)uVar127;
          bVar128 = (byte)((ulong)uVar150 >> 8) | (byte)((ulong)uVar127 >> 8);
          bVar129 = (byte)((ulong)uVar150 >> 0x10) | (byte)((ulong)uVar127 >> 0x10);
          bVar130 = (byte)((ulong)uVar150 >> 0x18) | (byte)((ulong)uVar127 >> 0x18);
          bVar131 = (byte)((ulong)uVar150 >> 0x20) | (byte)((ulong)uVar127 >> 0x20);
          bVar132 = (byte)((ulong)uVar150 >> 0x28) | (byte)((ulong)uVar127 >> 0x28);
          bVar133 = (byte)((ulong)uVar150 >> 0x30) | (byte)((ulong)uVar127 >> 0x30);
          bVar134 = (byte)((ulong)uVar150 >> 0x38) | (byte)((ulong)uVar127 >> 0x38);
          uVar127 = CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar131,CONCAT13(
                                                  bVar130,CONCAT12(bVar129,CONCAT11(bVar128,bVar126)
                                                                  ))))));
          bVar135 = (byte)uVar151 | (byte)uVar136;
          bVar137 = (byte)((ulong)uVar151 >> 8) | (byte)((ulong)uVar136 >> 8);
          bVar138 = (byte)((ulong)uVar151 >> 0x10) | (byte)((ulong)uVar136 >> 0x10);
          bVar139 = (byte)((ulong)uVar151 >> 0x18) | (byte)((ulong)uVar136 >> 0x18);
          bVar140 = (byte)((ulong)uVar151 >> 0x20) | (byte)((ulong)uVar136 >> 0x20);
          bVar141 = (byte)((ulong)uVar151 >> 0x28) | (byte)((ulong)uVar136 >> 0x28);
          bVar142 = (byte)((ulong)uVar151 >> 0x30) | (byte)((ulong)uVar136 >> 0x30);
          bVar143 = (byte)((ulong)uVar151 >> 0x38) | (byte)((ulong)uVar136 >> 0x38);
          uVar136 = CONCAT17(bVar143,CONCAT16(bVar142,CONCAT15(bVar141,CONCAT14(bVar140,CONCAT13(
                                                  bVar139,CONCAT12(bVar138,CONCAT11(bVar137,bVar135)
                                                                  ))))));
          uVar67 = uVar67 - 8;
          puVar69 = puVar69 + 8;
        } while (uVar67 != 0);
        bVar126 = bVar126 | bVar109 | bVar92 | bVar76;
        bVar128 = bVar128 | bVar110 | bVar94 | bVar77;
        bVar129 = bVar129 | bVar111 | bVar95 | bVar78;
        bVar130 = bVar130 | bVar112 | bVar96 | bVar79;
        bVar131 = bVar131 | bVar113 | bVar97 | bVar80;
        bVar132 = bVar132 | bVar114 | bVar98 | bVar81;
        bVar133 = bVar133 | bVar115 | bVar99 | bVar82;
        bVar134 = bVar134 | bVar116 | bVar100 | bVar83;
        bVar135 = bVar135 | bVar117 | bVar101 | bVar84;
        bVar137 = bVar137 | bVar119 | bVar102 | bVar85;
        bVar138 = bVar138 | bVar120 | bVar103 | bVar86;
        bVar139 = bVar139 | bVar121 | bVar104 | bVar87;
        bVar140 = bVar140 | bVar122 | bVar105 | bVar88;
        bVar141 = bVar141 | bVar123 | bVar106 | bVar89;
        bVar142 = bVar142 | bVar124 | bVar107 | bVar90;
        bVar143 = bVar143 | bVar125 | bVar108 | bVar91;
        auVar8[1] = bVar128;
        auVar8[0] = bVar126;
        auVar8[2] = bVar129;
        auVar8[3] = bVar130;
        auVar8[4] = bVar131;
        auVar8[5] = bVar132;
        auVar8[6] = bVar133;
        auVar8[7] = bVar134;
        auVar8[8] = bVar135;
        auVar8[9] = bVar137;
        auVar8[10] = bVar138;
        auVar8[0xb] = bVar139;
        auVar8[0xc] = bVar140;
        auVar8[0xd] = bVar141;
        auVar8[0xe] = bVar142;
        auVar8[0xf] = bVar143;
        auVar9[1] = bVar128;
        auVar9[0] = bVar126;
        auVar9[2] = bVar129;
        auVar9[3] = bVar130;
        auVar9[4] = bVar131;
        auVar9[5] = bVar132;
        auVar9[6] = bVar133;
        auVar9[7] = bVar134;
        auVar9[8] = bVar135;
        auVar9[9] = bVar137;
        auVar9[10] = bVar138;
        auVar9[0xb] = bVar139;
        auVar9[0xc] = bVar140;
        auVar9[0xd] = bVar141;
        auVar9[0xe] = bVar142;
        auVar9[0xf] = bVar143;
        auVar93 = NEON_ext(auVar8,auVar9,8,1);
        uVar67 = CONCAT17(bVar134 | auVar93[7],
                          CONCAT16(bVar133 | auVar93[6],
                                   CONCAT15(bVar132 | auVar93[5],
                                            CONCAT14(bVar131 | auVar93[4],
                                                     CONCAT13(bVar130 | auVar93[3],
                                                              CONCAT12(bVar129 | auVar93[2],
                                                                       CONCAT11(bVar128 | auVar93[1]
                                                                                ,bVar126 | auVar93[0
                                                  ])))))));
        if (uVar59 != uVar65) goto code_r0x002fc454;
      }
      if (uVar67 != 0) goto code_r0x002fc268;
code_r0x002fc470:
      plStack_70 = (long *)(unaff_x28 + 0x18);
      uVar70 = func_0x002a3384(unaff_x27,psVar56,lVar55,param_4);
      if ((int)uVar70 == 0) goto code_r0x002fc288;
      uVar70 = func_0x002a3110(unaff_x27,unaff_x27,lVar55,lVar55,param_4);
      auVar152 = auVar19;
      if ((int)uVar70 == 0) goto code_r0x002fc288;
      lStack_80 = param_3[0x29];
      lStack_78 = param_3[0x26];
      psVar56 = (segment_command *)
                func_0x002a42a0(unaff_x22,unaff_x24,param_3[0x2a],plStack_70,param_4,param_3[0x27]);
      uVar51 = func_0x002a42a0(psStack_68,unaff_x27,lStack_80,unaff_x20,param_4,lStack_78);
      if ((uVar51 & (uint)psVar56) == 0) goto code_r0x002fc284;
      if (*(int *)(unaff_x28 + 0x28) != 0) goto code_r0x002fc268;
      psVar56 = (segment_command *)param_3[0x26];
      uVar51 = (uint)psVar56->vmsize;
      lVar55 = (long)(int)uVar51;
      lVar60 = (long)(int)*(uint *)(unaff_x28 + 0x20);
      if (*(uint *)(unaff_x28 + 0x20) <= uVar51) goto code_r0x002fc5cc;
      lVar63 = *plStack_70;
      uVar59 = lVar60 - lVar55;
      lVar62 = lVar55;
      if (7 < uVar59) goto code_r0x002fc54c;
      uVar67 = 0;
      goto code_r0x002fc5b0;
    }
  }
  func_0x0079f048();
code_r0x002fc544:
  uVar70 = func_0x0079f070();
  param_4 = unaff_x19;
  param_3 = unaff_x21;
  psVar56 = psVar72;
  do {
    func_0x0079db4c(uVar70);
    lVar60 = extraout_x8;
    lVar63 = extraout_x9;
    uVar59 = extraout_x11;
    lVar62 = extraout_x14;
code_r0x002fc54c:
    uVar65 = uVar59 & 0xfffffffffffffff8;
    lVar55 = uVar65 + lVar62;
    bVar76 = 0;
    bVar77 = 0;
    bVar78 = 0;
    bVar79 = 0;
    bVar80 = 0;
    bVar81 = 0;
    bVar82 = 0;
    bVar83 = 0;
    bVar84 = 0;
    bVar85 = 0;
    bVar86 = 0;
    bVar87 = 0;
    bVar88 = 0;
    bVar89 = 0;
    bVar90 = 0;
    bVar91 = 0;
    bVar92 = 0;
    bVar94 = 0;
    bVar95 = 0;
    bVar96 = 0;
    bVar97 = 0;
    bVar98 = 0;
    bVar99 = 0;
    bVar100 = 0;
    bVar101 = 0;
    bVar102 = 0;
    bVar103 = 0;
    bVar104 = 0;
    bVar105 = 0;
    bVar106 = 0;
    bVar107 = 0;
    bVar108 = 0;
    uVar70 = 0;
    uVar118 = 0;
    uVar127 = 0;
    uVar136 = 0;
    puVar69 = (undefined8 *)(lVar63 + lVar62 * 8 + 0x20);
    uVar67 = uVar65;
    do {
      uVar145 = puVar69[-3];
      uVar144 = puVar69[-4];
      uVar147 = puVar69[-1];
      uVar146 = puVar69[-2];
      uVar149 = puVar69[1];
      uVar148 = *puVar69;
      uVar151 = puVar69[3];
      uVar150 = puVar69[2];
      bVar76 = (byte)uVar144 | bVar76;
      bVar77 = (byte)((ulong)uVar144 >> 8) | bVar77;
      bVar78 = (byte)((ulong)uVar144 >> 0x10) | bVar78;
      bVar79 = (byte)((ulong)uVar144 >> 0x18) | bVar79;
      bVar80 = (byte)((ulong)uVar144 >> 0x20) | bVar80;
      bVar81 = (byte)((ulong)uVar144 >> 0x28) | bVar81;
      bVar82 = (byte)((ulong)uVar144 >> 0x30) | bVar82;
      bVar83 = (byte)((ulong)uVar144 >> 0x38) | bVar83;
      bVar84 = (byte)uVar145 | bVar84;
      bVar85 = (byte)((ulong)uVar145 >> 8) | bVar85;
      bVar86 = (byte)((ulong)uVar145 >> 0x10) | bVar86;
      bVar87 = (byte)((ulong)uVar145 >> 0x18) | bVar87;
      bVar88 = (byte)((ulong)uVar145 >> 0x20) | bVar88;
      bVar89 = (byte)((ulong)uVar145 >> 0x28) | bVar89;
      bVar90 = (byte)((ulong)uVar145 >> 0x30) | bVar90;
      bVar91 = (byte)((ulong)uVar145 >> 0x38) | bVar91;
      bVar92 = (byte)uVar146 | bVar92;
      bVar94 = (byte)((ulong)uVar146 >> 8) | bVar94;
      bVar95 = (byte)((ulong)uVar146 >> 0x10) | bVar95;
      bVar96 = (byte)((ulong)uVar146 >> 0x18) | bVar96;
      bVar97 = (byte)((ulong)uVar146 >> 0x20) | bVar97;
      bVar98 = (byte)((ulong)uVar146 >> 0x28) | bVar98;
      bVar99 = (byte)((ulong)uVar146 >> 0x30) | bVar99;
      bVar100 = (byte)((ulong)uVar146 >> 0x38) | bVar100;
      bVar101 = (byte)uVar147 | bVar101;
      bVar102 = (byte)((ulong)uVar147 >> 8) | bVar102;
      bVar103 = (byte)((ulong)uVar147 >> 0x10) | bVar103;
      bVar104 = (byte)((ulong)uVar147 >> 0x18) | bVar104;
      bVar105 = (byte)((ulong)uVar147 >> 0x20) | bVar105;
      bVar106 = (byte)((ulong)uVar147 >> 0x28) | bVar106;
      bVar107 = (byte)((ulong)uVar147 >> 0x30) | bVar107;
      bVar108 = (byte)((ulong)uVar147 >> 0x38) | bVar108;
      bVar109 = (byte)uVar148 | (byte)uVar70;
      bVar110 = (byte)((ulong)uVar148 >> 8) | (byte)((ulong)uVar70 >> 8);
      bVar111 = (byte)((ulong)uVar148 >> 0x10) | (byte)((ulong)uVar70 >> 0x10);
      bVar112 = (byte)((ulong)uVar148 >> 0x18) | (byte)((ulong)uVar70 >> 0x18);
      bVar113 = (byte)((ulong)uVar148 >> 0x20) | (byte)((ulong)uVar70 >> 0x20);
      bVar114 = (byte)((ulong)uVar148 >> 0x28) | (byte)((ulong)uVar70 >> 0x28);
      bVar115 = (byte)((ulong)uVar148 >> 0x30) | (byte)((ulong)uVar70 >> 0x30);
      bVar116 = (byte)((ulong)uVar148 >> 0x38) | (byte)((ulong)uVar70 >> 0x38);
      uVar70 = CONCAT17(bVar116,CONCAT16(bVar115,CONCAT15(bVar114,CONCAT14(bVar113,CONCAT13(bVar112,
                                                  CONCAT12(bVar111,CONCAT11(bVar110,bVar109)))))));
      bVar117 = (byte)uVar149 | (byte)uVar118;
      bVar119 = (byte)((ulong)uVar149 >> 8) | (byte)((ulong)uVar118 >> 8);
      bVar120 = (byte)((ulong)uVar149 >> 0x10) | (byte)((ulong)uVar118 >> 0x10);
      bVar121 = (byte)((ulong)uVar149 >> 0x18) | (byte)((ulong)uVar118 >> 0x18);
      bVar122 = (byte)((ulong)uVar149 >> 0x20) | (byte)((ulong)uVar118 >> 0x20);
      bVar123 = (byte)((ulong)uVar149 >> 0x28) | (byte)((ulong)uVar118 >> 0x28);
      bVar124 = (byte)((ulong)uVar149 >> 0x30) | (byte)((ulong)uVar118 >> 0x30);
      bVar125 = (byte)((ulong)uVar149 >> 0x38) | (byte)((ulong)uVar118 >> 0x38);
      uVar118 = CONCAT17(bVar125,CONCAT16(bVar124,CONCAT15(bVar123,CONCAT14(bVar122,CONCAT13(bVar121
                                                  ,CONCAT12(bVar120,CONCAT11(bVar119,bVar117)))))));
      bVar126 = (byte)uVar150 | (byte)uVar127;
      bVar128 = (byte)((ulong)uVar150 >> 8) | (byte)((ulong)uVar127 >> 8);
      bVar129 = (byte)((ulong)uVar150 >> 0x10) | (byte)((ulong)uVar127 >> 0x10);
      bVar130 = (byte)((ulong)uVar150 >> 0x18) | (byte)((ulong)uVar127 >> 0x18);
      bVar131 = (byte)((ulong)uVar150 >> 0x20) | (byte)((ulong)uVar127 >> 0x20);
      bVar132 = (byte)((ulong)uVar150 >> 0x28) | (byte)((ulong)uVar127 >> 0x28);
      bVar133 = (byte)((ulong)uVar150 >> 0x30) | (byte)((ulong)uVar127 >> 0x30);
      bVar134 = (byte)((ulong)uVar150 >> 0x38) | (byte)((ulong)uVar127 >> 0x38);
      uVar127 = CONCAT17(bVar134,CONCAT16(bVar133,CONCAT15(bVar132,CONCAT14(bVar131,CONCAT13(bVar130
                                                  ,CONCAT12(bVar129,CONCAT11(bVar128,bVar126)))))));
      bVar135 = (byte)uVar151 | (byte)uVar136;
      bVar137 = (byte)((ulong)uVar151 >> 8) | (byte)((ulong)uVar136 >> 8);
      bVar138 = (byte)((ulong)uVar151 >> 0x10) | (byte)((ulong)uVar136 >> 0x10);
      bVar139 = (byte)((ulong)uVar151 >> 0x18) | (byte)((ulong)uVar136 >> 0x18);
      bVar140 = (byte)((ulong)uVar151 >> 0x20) | (byte)((ulong)uVar136 >> 0x20);
      bVar141 = (byte)((ulong)uVar151 >> 0x28) | (byte)((ulong)uVar136 >> 0x28);
      bVar142 = (byte)((ulong)uVar151 >> 0x30) | (byte)((ulong)uVar136 >> 0x30);
      bVar143 = (byte)((ulong)uVar151 >> 0x38) | (byte)((ulong)uVar136 >> 0x38);
      uVar136 = CONCAT17(bVar143,CONCAT16(bVar142,CONCAT15(bVar141,CONCAT14(bVar140,CONCAT13(bVar139
                                                  ,CONCAT12(bVar138,CONCAT11(bVar137,bVar135)))))));
      uVar67 = uVar67 - 8;
      puVar69 = puVar69 + 8;
    } while (uVar67 != 0);
    bVar126 = bVar126 | bVar109 | bVar92 | bVar76;
    bVar128 = bVar128 | bVar110 | bVar94 | bVar77;
    bVar129 = bVar129 | bVar111 | bVar95 | bVar78;
    bVar130 = bVar130 | bVar112 | bVar96 | bVar79;
    bVar131 = bVar131 | bVar113 | bVar97 | bVar80;
    bVar132 = bVar132 | bVar114 | bVar98 | bVar81;
    bVar133 = bVar133 | bVar115 | bVar99 | bVar82;
    bVar134 = bVar134 | bVar116 | bVar100 | bVar83;
    bVar135 = bVar135 | bVar117 | bVar101 | bVar84;
    bVar137 = bVar137 | bVar119 | bVar102 | bVar85;
    bVar138 = bVar138 | bVar120 | bVar103 | bVar86;
    bVar139 = bVar139 | bVar121 | bVar104 | bVar87;
    bVar140 = bVar140 | bVar122 | bVar105 | bVar88;
    bVar141 = bVar141 | bVar123 | bVar106 | bVar89;
    bVar142 = bVar142 | bVar124 | bVar107 | bVar90;
    bVar143 = bVar143 | bVar125 | bVar108 | bVar91;
    auVar6[1] = bVar128;
    auVar6[0] = bVar126;
    auVar6[2] = bVar129;
    auVar6[3] = bVar130;
    auVar6[4] = bVar131;
    auVar6[5] = bVar132;
    auVar6[6] = bVar133;
    auVar6[7] = bVar134;
    auVar6[8] = bVar135;
    auVar6[9] = bVar137;
    auVar6[10] = bVar138;
    auVar6[0xb] = bVar139;
    auVar6[0xc] = bVar140;
    auVar6[0xd] = bVar141;
    auVar6[0xe] = bVar142;
    auVar6[0xf] = bVar143;
    auVar7[1] = bVar128;
    auVar7[0] = bVar126;
    auVar7[2] = bVar129;
    auVar7[3] = bVar130;
    auVar7[4] = bVar131;
    auVar7[5] = bVar132;
    auVar7[6] = bVar133;
    auVar7[7] = bVar134;
    auVar7[8] = bVar135;
    auVar7[9] = bVar137;
    auVar7[10] = bVar138;
    auVar7[0xb] = bVar139;
    auVar7[0xc] = bVar140;
    auVar7[0xd] = bVar141;
    auVar7[0xe] = bVar142;
    auVar7[0xf] = bVar143;
    auVar152 = NEON_ext(auVar6,auVar7,8,1);
    uVar67 = CONCAT17(bVar134 | auVar152[7],
                      CONCAT16(bVar133 | auVar152[6],
                               CONCAT15(bVar132 | auVar152[5],
                                        CONCAT14(bVar131 | auVar152[4],
                                                 CONCAT13(bVar130 | auVar152[3],
                                                          CONCAT12(bVar129 | auVar152[2],
                                                                   CONCAT11(bVar128 | auVar152[1],
                                                                            bVar126 | auVar152[0])))
                                                ))));
    if (uVar59 != uVar65) {
code_r0x002fc5b0:
      lVar60 = lVar60 - lVar55;
      puVar61 = (ulong *)(lVar63 + lVar55 * 8);
      do {
        uVar67 = *puVar61 | uVar67;
        lVar60 = lVar60 + -1;
        puVar61 = puVar61 + 1;
      } while (lVar60 != 0);
    }
    psVar71 = unaff_x20;
    if (uVar67 == 0) {
code_r0x002fc5cc:
      auVar12._8_8_ = psVar56;
      auVar12._0_8_ = unaff_x23;
      auVar152._8_8_ = psVar56;
      auVar152._0_8_ = unaff_x23;
      uVar70 = func_0x002a3384(unaff_x24,unaff_x22,psVar56,param_4);
      if ((int)uVar70 != 0) {
        uVar70 = func_0x002a3110(unaff_x24,unaff_x24,psVar56,psVar56,param_4);
        psVar56 = psStack_68;
        auVar17._8_8_ = psStack_68;
        auVar17._0_8_ = unaff_x23;
        auVar16._8_8_ = psStack_68;
        auVar16._0_8_ = unaff_x23;
        auVar15._8_8_ = psStack_68;
        auVar15._0_8_ = unaff_x23;
        auVar14._8_8_ = psStack_68;
        auVar14._0_8_ = unaff_x23;
        auVar13._8_8_ = psStack_68;
        auVar13._0_8_ = unaff_x23;
        auVar152 = auVar12;
        if ((((int)uVar70 != 0) &&
            (uVar70 = func_0x002a0344(psStack_68,psStack_68,unaff_x24,unaff_x20,param_4),
            auVar152 = auVar13, (int)uVar70 != 0)) &&
           ((uVar70 = func_0x002a3110(psVar56,psVar56,param_3[0x2b],param_3[0x26],param_4),
            auVar152 = auVar14, (int)uVar70 != 0 &&
            ((psVar72 = param_4, uVar70 = func_0x002a80fc(psVar56,psVar56,plStack_70),
             auVar152 = auVar15, (int)uVar70 != 0 &&
             (psVar58 = unaff_x22, uVar70 = func_0x0029aefc(psVar56,psVar56), auVar152 = auVar16,
             (int)uVar70 != 0)))))) {
          iVar49 = func_0x0029db84(psStack_68,unaff_x23);
          psVar71 = unaff_x20;
          if (-1 < iVar49) goto code_r0x002fc6a4;
          uVar50 = func_0x0029bfd4(unaff_x23);
          unaff_x20 = psStack_68;
          func_0x0029cb94(psStack_68,uVar50);
          uVar70 = func_0x0029c3cc(unaff_x20,(long)(int)unaff_x25[4]);
          auVar152 = auVar17;
        }
      }
    }
    else {
code_r0x002fc268:
      func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x2a9);
      unaff_x20 = psVar71;
code_r0x002fc284:
      auVar152._8_8_ = psVar56;
      auVar152._0_8_ = unaff_x23;
      uVar70 = 0;
    }
code_r0x002fc288:
    unaff_x23 = auVar152._0_8_;
    if ((char)param_4->fileoff != '\0') {
      return uVar70;
    }
    psVar56 = auVar152._8_8_;
    if (*(long *)(param_4->segname + 8) != 0) {
      lVar55 = *(long *)(param_4->segname + 8) + -1;
      *(long *)(param_4->segname + 8) = lVar55;
      param_4->vmsize = *(qword *)(*(long *)param_4->segname + lVar55 * 8);
      return uVar70;
    }
  } while( true );
}

