
/* WARNING: Possible PIC construction at 0x002fd5f4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002fd5f8) */
/* WARNING: Type propagation algorithm not settling */

long * FUN_002fbe74(segment_command *param_1,undefined8 param_2,undefined8 param_3,
                   segment_command *param_4,segment_command *param_5)

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
  qword *pqVar47;
  int iVar48;
  uint uVar50;
  int iVar51;
  int iVar52;
  uint uVar53;
  undefined1 *puVar54;
  undefined4 uVar49;
  segment_command *psVar55;
  segment_command *psVar56;
  qword qVar57;
  long lVar58;
  segment_command *psVar59;
  long extraout_x8;
  long lVar60;
  long lVar61;
  ulong *puVar62;
  long extraout_x9;
  ulong uVar63;
  long lVar64;
  uint uVar65;
  ulong extraout_x11;
  ulong uVar66;
  ulong uVar67;
  ulong uVar68;
  long extraout_x14;
  segment_command *unaff_x19;
  undefined8 *puVar69;
  segment_command *unaff_x20;
  segment_command *unaff_x21;
  long *plVar70;
  segment_command *unaff_x22;
  segment_command *psVar71;
  long unaff_x23;
  long *plVar72;
  segment_command *unaff_x24;
  long *unaff_x25;
  segment_command *unaff_x26;
  long *unaff_x27;
  qword unaff_x28;
  undefined *puVar73;
  byte bVar74;
  byte bVar75;
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
  byte bVar93;
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
  byte bVar108;
  byte bVar109;
  byte bVar110;
  byte bVar111;
  byte bVar112;
  byte bVar113;
  undefined8 uVar107;
  byte bVar114;
  byte bVar115;
  byte bVar117;
  byte bVar118;
  byte bVar119;
  byte bVar120;
  byte bVar121;
  byte bVar122;
  undefined8 uVar116;
  byte bVar123;
  byte bVar124;
  byte bVar126;
  byte bVar127;
  byte bVar128;
  byte bVar129;
  byte bVar130;
  byte bVar131;
  undefined8 uVar125;
  byte bVar132;
  byte bVar133;
  byte bVar135;
  byte bVar136;
  byte bVar137;
  byte bVar138;
  byte bVar139;
  byte bVar140;
  undefined8 uVar134;
  byte bVar141;
  undefined8 uVar142;
  undefined8 uVar143;
  undefined8 uVar144;
  undefined8 uVar145;
  undefined8 uVar146;
  undefined8 uVar147;
  undefined8 uVar148;
  undefined8 uVar149;
  undefined1 auVar150 [16];
  undefined1 auVar151 [16];
  qword qStack_80;
  undefined8 uStack_78;
  long *plStack_70;
  segment_command *psStack_68;
  qword qStack_60;
  long *plStack_58;
  segment_command *psStack_50;
  long *plStack_48;
  segment_command *psStack_40;
  long lStack_38;
  segment_command *psStack_30;
  undefined1 auStack_6 [6];
  
  lVar60 = *(long *)unaff_x20[5].segname;
  do {
    if (param_1->segname[lVar60 + -8] != '\0') {
      func_0x0079ef30();
      func_0x0079eeb8();
      goto code_r0x002fc100;
    }
    *(undefined4 *)(*(long *)(*(long *)(unaff_x20 + 5) + (long)param_1 * 8) + 0x10) = 0x1f;
    param_1 = (segment_command *)((long)&param_1->cmd + 1);
  } while (unaff_x22 != param_1);
  unaff_x20[5].segname[8] = '\0';
  unaff_x20[5].segname[9] = '\0';
  unaff_x20[5].segname[10] = '\0';
  unaff_x20[5].segname[0xb] = '\0';
  unaff_x20[5].segname[0xc] = '\0';
  unaff_x20[5].segname[0xd] = '\0';
  unaff_x20[5].segname[0xe] = '\0';
  unaff_x20[5].segname[0xf] = '\0';
  if (unaff_x22 != (segment_command *)0x0) {
    param_4 = unaff_x22;
    puVar54 = (undefined1 *)_memchr(*(undefined8 *)unaff_x20[5].segname,0);
    if (puVar54 != (undefined1 *)0x0) {
      *puVar54 = 1;
      lVar60 = *(long *)(unaff_x20 + 5);
      lVar58 = (long)puVar54 - *(long *)unaff_x20[5].segname;
      *(long *)unaff_x21 = lVar58;
      plVar70 = *(long **)(lVar60 + lVar58 * 8);
      goto LAB_002fc07c;
    }
    if (unaff_x22 < &section_000003d8.size) goto LAB_002fbf30;
    unaff_x21->cmd = 0x400;
    unaff_x21->cmdsize = 0;
    plVar70 = (long *)func_0x0036e31c(0x18);
    if (plVar70 == (long *)0x0) goto LAB_002fc07c;
    lVar60 = func_0x0036e31c(0x18);
    plVar72 = plVar70;
    if (lVar60 != 0) {
      *(undefined4 *)(lVar60 + 0x14) = 1;
      *plVar70 = lVar60;
      lVar60 = func_0x0036e31c(0x18);
      if (lVar60 != 0) {
        *(undefined4 *)(lVar60 + 0x14) = 1;
        plVar70[1] = lVar60;
        *(undefined4 *)(plVar70 + 2) = 0x1f;
        goto LAB_002fc07c;
      }
      plVar72 = plVar70 + 1;
    }
    *plVar72 = 0;
    func_0x002f636c(plVar70);
code_r0x002fbf88:
    plVar70 = (long *)0x0;
LAB_002fc07c:
    func_0x00373e0c();
    return plVar70;
  }
LAB_002fbf30:
  unaff_x24 = (segment_command *)((long)unaff_x22 << 1);
  if ((segment_command *)((long)&section_000003d8.addr + 7) < unaff_x24) {
    unaff_x24 = (segment_command *)&section_000003d8.size;
  }
  if (unaff_x22 == (segment_command *)0x0) {
    unaff_x24 = (segment_command *)((long)&MACH_HEADER.magic + 1);
  }
  if (unaff_x22 < unaff_x24) {
    unaff_x22 = (segment_command *)func_0x0036e358(unaff_x24,8);
    unaff_x23 = func_0x0036e274(unaff_x24);
    if (unaff_x22 == (segment_command *)0x0 || unaff_x23 == 0) {
code_r0x002fbf78:
      func_0x0036e3d8(unaff_x23);
      func_0x0036e3d8(unaff_x22);
      goto code_r0x002fbf88;
    }
    param_4 = *(segment_command **)&unaff_x20[4].nsects;
    if ((long)param_4 << 3 != 0) {
      uVar107._0_4_ = unaff_x20[5].cmd;
      uVar107._4_4_ = unaff_x20[5].cmdsize;
      _memcpy(unaff_x22,uVar107,(long)param_4 << 3);
      param_4 = *(segment_command **)&unaff_x20[4].nsects;
    }
    if (param_4 == (segment_command *)0x0) {
      unaff_x26 = (segment_command *)0x0;
      if (unaff_x24 != (segment_command *)0x0) goto code_r0x002fbfdc;
    }
    else {
      _memcpy(unaff_x23,*(undefined8 *)unaff_x20[5].segname);
      unaff_x26 = *(segment_command **)&unaff_x20[4].nsects;
      if (unaff_x26 < unaff_x24) {
code_r0x002fbfdc:
        unaff_x27 = (long *)((long)&MACH_HEADER.magic + 1);
        unaff_x28 = 0x1f;
        do {
          unaff_x25 = (long *)func_0x0036e31c(0x18);
          if (unaff_x25 == (long *)0x0) {
LAB_002fc0bc:
            pcVar1 = unaff_x22->segname + (long)unaff_x26 * 8 + -8;
            pcVar1[0] = '\0';
            pcVar1[1] = '\0';
            pcVar1[2] = '\0';
            pcVar1[3] = '\0';
            pcVar1[4] = '\0';
            pcVar1[5] = '\0';
            pcVar1[6] = '\0';
            pcVar1[7] = '\0';
            psVar55 = *(segment_command **)&unaff_x20[4].nsects;
            if (psVar55 < unaff_x26) {
              do {
                func_0x002f636c(*(undefined8 *)(unaff_x22->segname + (long)psVar55 * 8 + -8));
                psVar55 = (segment_command *)((long)&psVar55->cmd + 1);
              } while (unaff_x26 != psVar55);
            }
            goto code_r0x002fbf78;
          }
          lVar60 = func_0x0036e31c(0x18);
          if (lVar60 == 0) {
            plVar70 = unaff_x25;
LAB_002fc0b0:
            *plVar70 = 0;
            func_0x002f636c(unaff_x25);
            goto LAB_002fc0bc;
          }
          *(undefined4 *)(lVar60 + 0x14) = 1;
          *unaff_x25 = lVar60;
          lVar60 = func_0x0036e31c(0x18);
          if (lVar60 == 0) {
            plVar70 = unaff_x25 + 1;
            goto LAB_002fc0b0;
          }
          *(undefined4 *)(lVar60 + 0x14) = 1;
          unaff_x25[1] = lVar60;
          *(undefined4 *)(unaff_x25 + 2) = 0x1f;
          *(long **)(unaff_x22->segname + (long)unaff_x26 * 8 + -8) = unaff_x25;
          unaff_x26 = (segment_command *)((long)&unaff_x26->cmd + 1);
        } while (unaff_x24 != unaff_x26);
        unaff_x26 = *(segment_command **)&unaff_x20[4].nsects;
      }
    }
    _bzero(unaff_x26->segname + unaff_x23 + -8,(long)unaff_x24 - (long)unaff_x26);
    *(undefined1 *)(unaff_x23 + *(long *)&unaff_x20[4].nsects) = 1;
    lVar60._0_4_ = unaff_x20[4].nsects;
    lVar60._4_4_ = unaff_x20[4].flags;
    unaff_x21->cmd = (undefined4)lVar60;
    unaff_x21->cmdsize = lVar60._4_4_;
    if (lVar60 != 0x400) {
      uVar116._0_4_ = unaff_x20[5].cmd;
      uVar116._4_4_ = unaff_x20[5].cmdsize;
      plVar70 = *(long **)(unaff_x22->segname + *(long *)&unaff_x20[4].nsects * 8 + -8);
      func_0x0036e3d8(uVar116);
      *(segment_command **)(unaff_x20 + 5) = unaff_x22;
      func_0x0036e3d8(*(undefined8 *)unaff_x20[5].segname);
      *(long *)unaff_x20[5].segname = unaff_x23;
      *(segment_command **)&unaff_x20[4].nsects = unaff_x24;
      goto LAB_002fc07c;
    }
  }
  else {
code_r0x002fc100:
    func_0x0079ef08();
  }
  auVar151._8_8_ = unaff_x26;
  auVar151._0_8_ = unaff_x23;
  auVar150 = func_0x0079eee0();
  psVar55 = auVar150._8_8_;
  puVar54 = auStack_6 + -10;
  qStack_60 = unaff_x28;
  plStack_58 = unaff_x27;
  psStack_50 = unaff_x26;
  plStack_48 = unaff_x25;
  psStack_40 = unaff_x24;
  lStack_38 = unaff_x23;
  psStack_30 = unaff_x22;
  if (*(long *)param_4->segname == 0) {
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
    unaff_x21 = param_4;
    if (*(long *)(param_4->segname + 8) == 0) goto code_r0x002fc52c;
    if (param_4->vmaddr == 0) goto code_r0x002fc530;
    if (param_4->vmsize == 0) goto code_r0x002fc534;
    if (param_4->fileoff == 0) goto code_r0x002fc538;
    if (param_4->filesize == 0) goto code_r0x002fc53c;
    lVar58._0_4_ = param_4->maxprot;
    lVar58._4_4_ = param_4->initprot;
    if (lVar58 != 0) {
      lVar61._0_4_ = param_4->nsects;
      lVar61._4_4_ = param_4->flags;
      if (lVar61 == 0) goto code_r0x002fc544;
      if ((char)param_5->fileoff == '\0') {
        qVar57 = param_5->vmsize;
        psVar59 = *(segment_command **)(param_5->segname + 8);
        if (psVar59 == (segment_command *)param_5->vmaddr) {
          unaff_x20 = &segment_command_00000020;
          if (psVar59 != (segment_command *)0x0) {
            unaff_x20 = (segment_command *)((ulong)((long)psVar59 * 3) >> 1);
          }
          if (((unaff_x20 <= psVar59) || ((ulong)unaff_x20 >> 0x3d != 0)) ||
             (lVar60 = func_0x0036e48c(*(undefined8 *)param_5->segname,(long)unaff_x20 << 3),
             lVar60 == 0)) {
            *(undefined2 *)&param_5->fileoff = 0x101;
            goto code_r0x002fc1f4;
          }
          *(long *)param_5->segname = lVar60;
          param_5->vmaddr = (qword)unaff_x20;
          psVar59 = *(segment_command **)(param_5->segname + 8);
        }
        else {
          lVar60 = *(long *)param_5->segname;
        }
        *(qword *)(lVar60 + (long)psVar59 * 8) = qVar57;
        *(long *)(param_5->segname + 8) = *(long *)(param_5->segname + 8) + 1;
      }
code_r0x002fc1f4:
      unaff_x24 = (segment_command *)func_0x0029e340(param_5);
      unaff_x27 = (long *)func_0x0029e340(param_5);
      unaff_x22 = (segment_command *)func_0x0029e340(param_5);
      plVar70 = (long *)0x0;
      auVar151 = auVar150;
      if (unaff_x24 == (segment_command *)0x0) goto code_r0x002fc288;
      if (unaff_x27 == (long *)0x0) goto code_r0x002fc288;
      if (unaff_x22 == (segment_command *)0x0) goto code_r0x002fc288;
      plVar70 = (long *)func_0x002fbc24(param_4,param_5);
      if ((int)plVar70 == 0) goto code_r0x002fc288;
      unaff_x25 = *(long **)param_4[4].segname;
      psVar71 = *(segment_command **)(param_4[4].segname + 8);
      plVar72 = unaff_x25 + 3;
      auVar16._8_8_ = psVar55;
      auVar16._0_8_ = plVar72;
      auVar151._8_8_ = psVar55;
      auVar151._0_8_ = plVar72;
      psVar56 = (segment_command *)*plVar72;
      unaff_x28 = param_4[4].vmaddr;
      uVar125._0_4_ = psVar55->cmd;
      uVar125._4_4_ = psVar55->cmdsize;
      psVar59 = (segment_command *)(long)(int)unaff_x25[4];
      psStack_68 = auVar150._0_8_;
      iVar48 = func_0x0029d99c(uVar125,(long)*(int *)psVar55->segname);
      if (-1 < iVar48) {
        func_0x0079f098();
code_r0x002fc6a4:
        auVar19._8_8_ = param_4;
        auVar19._0_8_ = unaff_x22;
        puVar73 = &_aws_lc_0_24_0_RSA_generate_key_ex;
        auVar151 = func_0x0079f0c0();
        qVar57 = 0;
        pqVar47 = &qStack_80;
        while( true ) {
          *(qword *)((long)pqVar47 + -0x60) = unaff_x28;
          *(long **)((long)pqVar47 + -0x58) = unaff_x27;
          *(segment_command **)((long)pqVar47 + -0x50) = psVar55;
          *(long **)((long)pqVar47 + -0x48) = unaff_x25;
          *(segment_command **)((long)pqVar47 + -0x40) = unaff_x24;
          *(long **)((long)pqVar47 + -0x38) = plVar72;
          *(undefined1 (*) [16])((long)pqVar47 + -0x30) = auVar19;
          *(segment_command **)((long)pqVar47 + -0x20) = psVar71;
          *(segment_command **)((long)pqVar47 + -0x18) = param_5;
          *(undefined1 **)((long)pqVar47 + -0x10) = puVar54;
          *(undefined **)((long)pqVar47 + -8) = puVar73;
          uVar50 = auVar151._8_4_ & 0xffffff80;
          if ((int)uVar50 < 0x100) break;
          *(long *)((long)pqVar47 + -0xb0) = auVar151._0_8_;
          unaff_x25 = (long *)0x0;
          *(uint *)((long)pqVar47 + -0xa8) = uVar50;
          uVar50 = uVar50 >> 1;
          uVar53 = uVar50 - 100 >> 6;
          *(ulong *)((long)pqVar47 + -0x88) = (ulong)uVar53;
          *(segment_command **)((long)pqVar47 + -0x80) = psVar59;
          uVar65 = auVar151._8_4_ >> 7;
          *(ulong *)((long)pqVar47 + -0x98) = (ulong)(uVar53 + 1);
          *(ulong *)((long)pqVar47 + -0x90) = (ulong)uVar65;
          *(ulong *)((long)pqVar47 + -0xa0) = (ulong)(uVar65 + 1);
          *(uint *)((long)pqVar47 + -0xa4) = uVar50;
          *(uint *)((long)pqVar47 + -0xb8) = uVar50 - 0x800;
          *(uint *)((long)pqVar47 + -0xb4) = 0x800 - uVar50;
          plVar72 = unaff_x27;
          unaff_x28 = qVar57;
code_r0x002fc85c:
          psVar71 = auVar19._0_8_;
          func_0x0028f0e4();
          lVar60 = func_0x002f8ac4(0);
          if (lVar60 == 0) {
            plVar70 = (long *)0x0;
            goto code_r0x002fd4a8;
          }
          uVar53 = *(uint *)psVar56->segname;
          uVar63 = (ulong)uVar53;
          uVar50 = uVar53 & (int)uVar53 >> 0x1f;
          lVar58 = uVar63 * 8;
          do {
            lVar58 = lVar58 + -8;
            uVar65 = (uint)uVar63;
            uVar63 = (ulong)(uVar65 - 1);
            if ((int)uVar65 < 1) {
              if (-1 < (int)uVar53) goto code_r0x002fc954;
              lVar64._0_4_ = psVar56->cmd;
              lVar64._4_4_ = psVar56->cmdsize;
              goto code_r0x002fc8ac;
            }
            lVar64 = *(long *)psVar56;
          } while (*(long *)(lVar64 + lVar58) == 0);
          uVar50 = uVar65;
code_r0x002fc8ac:
          uVar68 = *(ulong *)(lVar64 + (long)(int)(uVar50 - 1) * 8);
          uVar66 = uVar68 >> 0x20;
          uVar63 = uVar66;
          if (uVar66 == 0) {
            uVar63 = uVar68;
          }
          uVar67 = uVar63 >> 0x10;
          uVar2 = uVar67;
          if (uVar67 == 0) {
            uVar2 = uVar63;
          }
          uVar63 = uVar2 >> 8;
          if (uVar2 < 0x100) {
            uVar63 = uVar2;
          }
          uVar3 = uVar63 >> 4;
          if (uVar63 < 0x10) {
            uVar3 = uVar63;
          }
          uVar4 = uVar3 >> 2;
          if (uVar3 < 4) {
            uVar4 = uVar3;
          }
          uVar50 = (uint)(uVar68 != 0) | (uVar50 - 1) * 0x40 | (uint)(uVar66 != 0) << 5 |
                   (uint)(uVar67 != 0) << 4 | (uint)(0xff < uVar2) << 3 | (uint)(0xf < uVar63) << 2
                   | (uint)(3 < uVar3) << 1;
          if (1 < uVar4) {
            uVar50 = uVar50 + 1;
          }
          if (0x20 < uVar50) {
            func_0x0028f83c(4,0,0x65,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3fd);
            unaff_x27 = plVar72;
code_r0x002fd084:
            uVar107 = func_0x0028edc4();
            auVar19._8_8_ = uVar107;
            auVar19._0_8_ = psVar71;
            func_0x002f7efc(lVar60);
            plVar70 = (long *)0x0;
            lVar60 = 0;
            if (((2 < (uint)unaff_x25) || (((uint)uVar107 & 0xff000000) != 0x4000000)) ||
               (unaff_x25 = (long *)(ulong)((uint)unaff_x25 + 1), plVar72 = unaff_x27,
               ((uint)uVar107 & 0xfff) != 0x8d)) goto code_r0x002fd4a8;
            goto code_r0x002fc85c;
          }
code_r0x002fc954:
          psVar55 = (segment_command *)func_0x0036e31c(0x30);
          if (psVar55 == (segment_command *)0x0) {
LAB_002fd00c:
            psVar71 = auVar19._0_8_;
            psVar59 = (segment_command *)((long)&MACH_HEADER.magic + 3);
            func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
joined_r0x002fd12c:
            plVar70 = (long *)((long)&MACH_HEADER.magic + 1);
            unaff_x27 = plVar72;
            auVar43 = auVar19;
joined_r0x002fd12c:
            if (psVar55 != (segment_command *)0x0) {
              psVar71 = auVar43._0_8_;
              if ((char)psVar55->fileoff == '\0') {
                if (*(long *)(psVar55->segname + 8) == 0) {
                  func_0x0079db4c();
code_r0x002fd4e8:
                  func_0x0079f160();
code_r0x002fd4ec:
                  func_0x0079f138();
code_r0x002fd4f0:
                  func_0x0079f110();
                  goto code_r0x002fd4f4;
                }
                lVar58 = *(long *)(psVar55->segname + 8) + -1;
                *(long *)(psVar55->segname + 8) = lVar58;
                qVar57 = *(qword *)(*(long *)psVar55->segname + lVar58 * 8);
                psVar55->vmsize = qVar57;
                if (qVar57 != 0) goto code_r0x002fd4f8;
              }
              uVar146._0_4_ = psVar55->cmd;
              uVar146._4_4_ = psVar55->cmdsize;
              func_0x00373520(uVar146,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
              func_0x0036e3d8(*(undefined8 *)psVar55->segname);
              func_0x0036e3d8(psVar55);
            }
            if ((int)plVar70 == 0) {
              if (((int)unaff_x28 != 0) && (iVar48 = func_0x002fb278(lVar60), iVar48 == 0)) {
                func_0x002f7efc(lVar60);
                return (long *)0x0;
              }
              lVar58 = *(long *)((long)pqVar47 + -0xb0);
              func_0x002f8cb0(lVar58);
              puVar69 = *(undefined8 **)(lVar58 + 8);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 8) = *(undefined8 *)(lVar60 + 8);
              *(undefined8 *)(lVar60 + 8) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x10);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x10) = *(undefined8 *)(lVar60 + 0x10);
              *(undefined8 *)(lVar60 + 0x10) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x18);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x18) = *(undefined8 *)(lVar60 + 0x18);
              *(undefined8 *)(lVar60 + 0x18) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x20);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x20) = *(undefined8 *)(lVar60 + 0x20);
              *(undefined8 *)(lVar60 + 0x20) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x28);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x28) = *(undefined8 *)(lVar60 + 0x28);
              *(undefined8 *)(lVar60 + 0x28) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x30);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x30) = *(undefined8 *)(lVar60 + 0x30);
              *(undefined8 *)(lVar60 + 0x30) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x38);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x38) = *(undefined8 *)(lVar60 + 0x38);
              *(undefined8 *)(lVar60 + 0x38) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x40);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x40) = *(undefined8 *)(lVar60 + 0x40);
              *(undefined8 *)(lVar60 + 0x40) = 0;
              func_0x002a34e0(*(undefined8 *)(lVar58 + 0x128));
              *(undefined8 *)(lVar58 + 0x128) = *(undefined8 *)(lVar60 + 0x128);
              *(undefined8 *)(lVar60 + 0x128) = 0;
              func_0x002a34e0(*(undefined8 *)(lVar58 + 0x130));
              *(undefined8 *)(lVar58 + 0x130) = *(undefined8 *)(lVar60 + 0x130);
              *(undefined8 *)(lVar60 + 0x130) = 0;
              func_0x002a34e0(*(undefined8 *)(lVar58 + 0x138));
              *(undefined8 *)(lVar58 + 0x138) = *(undefined8 *)(lVar60 + 0x138);
              *(undefined8 *)(lVar60 + 0x138) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x140);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x140) = *(undefined8 *)(lVar60 + 0x140);
              *(undefined8 *)(lVar60 + 0x140) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x148);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x148) = *(undefined8 *)(lVar60 + 0x148);
              *(undefined8 *)(lVar60 + 0x148) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x150);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x150) = *(undefined8 *)(lVar60 + 0x150);
              *(undefined8 *)(lVar60 + 0x150) = 0;
              puVar69 = *(undefined8 **)(lVar58 + 0x158);
              if (puVar69 != (undefined8 *)0x0) {
                uVar50 = *(uint *)((long)puVar69 + 0x14);
                if ((uVar50 >> 1 & 1) == 0) {
                  func_0x0036e3d8(*puVar69);
                  uVar50 = *(uint *)((long)puVar69 + 0x14);
                }
                if ((uVar50 & 1) == 0) {
                  *puVar69 = 0;
                }
                else {
                  func_0x0036e3d8(puVar69);
                }
              }
              *(undefined8 *)(lVar58 + 0x158) = *(undefined8 *)(lVar60 + 0x158);
              *(undefined8 *)(lVar60 + 0x158) = 0;
              *(byte *)(lVar58 + 0x180) =
                   *(byte *)(lVar58 + 0x180) & 0xfe | *(byte *)(lVar60 + 0x180) & 1;
              plVar70 = (long *)((long)&MACH_HEADER.magic + 1);
              goto code_r0x002fd4a8;
            }
            goto code_r0x002fd084;
          }
          psVar55->segname[0] = '\0';
          psVar55->segname[1] = '\0';
          psVar55->segname[2] = '\0';
          psVar55->segname[3] = '\0';
          psVar55->segname[4] = '\0';
          psVar55->segname[5] = '\0';
          psVar55->segname[6] = '\0';
          psVar55->segname[7] = '\0';
          psVar55->segname[8] = '\0';
          psVar55->segname[9] = '\0';
          psVar55->segname[10] = '\0';
          psVar55->segname[0xb] = '\0';
          psVar55->segname[0xc] = '\0';
          psVar55->segname[0xd] = '\0';
          psVar55->segname[0xe] = '\0';
          psVar55->segname[0xf] = '\0';
          psVar55->vmaddr = 0;
          if ((char)psVar55->fileoff == '\0') {
            qVar57 = psVar55->vmsize;
            lVar58 = func_0x0036e48c(0,0x100);
            if (lVar58 == 0) {
              *(undefined2 *)&psVar55->fileoff = 0x101;
            }
            else {
              psVar55->vmaddr = 0x20;
              *(qword *)(lVar58 + *(long *)(psVar55->segname + 8) * 8) = qVar57;
              *(long *)psVar55->segname = lVar58;
              *(long *)(psVar55->segname + 8) = *(long *)(psVar55->segname + 8) + 1;
            }
          }
          lVar58 = func_0x0029e340(psVar55);
          uVar107 = func_0x0029e340(psVar55);
          *(undefined8 *)((long)pqVar47 + -0x70) = uVar107;
          uVar63 = func_0x0029e340(psVar55);
          auVar42._8_8_ = uVar63;
          auVar42._0_8_ = lVar58;
          auVar41._8_8_ = uVar63;
          auVar41._0_8_ = lVar58;
          auVar40._8_8_ = uVar63;
          auVar40._0_8_ = lVar58;
          auVar39._8_8_ = uVar63;
          auVar39._0_8_ = lVar58;
          auVar38._8_8_ = uVar63;
          auVar38._0_8_ = lVar58;
          auVar37._8_8_ = uVar63;
          auVar37._0_8_ = lVar58;
          auVar36._8_8_ = uVar63;
          auVar36._0_8_ = lVar58;
          auVar26._8_8_ = uVar63;
          auVar26._0_8_ = lVar58;
          auVar25._8_8_ = uVar63;
          auVar25._0_8_ = lVar58;
          auVar24._8_8_ = uVar63;
          auVar24._0_8_ = lVar58;
          auVar23._8_8_ = uVar63;
          auVar23._0_8_ = lVar58;
          auVar22._8_8_ = uVar63;
          auVar22._0_8_ = lVar58;
          auVar21._8_8_ = uVar63;
          auVar21._0_8_ = lVar58;
          auVar20._8_8_ = uVar63;
          auVar20._0_8_ = lVar58;
          auVar19._8_8_ = uVar63;
          auVar19._0_8_ = lVar58;
          unaff_x24 = (segment_command *)func_0x0029e340(psVar55);
          plVar70 = (long *)func_0x0029e340(psVar55);
          unaff_x27 = (long *)func_0x0029e340(psVar55);
          *(long *)((long)pqVar47 + -0x78) = lVar58;
          if (((((lVar58 == 0) || (auVar19 = auVar20, *(long *)((long)pqVar47 + -0x70) == 0)) ||
               (auVar19 = auVar21, uVar63 == 0)) ||
              ((auVar19 = auVar22, unaff_x24 == (segment_command *)0x0 ||
               (auVar19 = auVar23, plVar70 == (long *)0x0)))) ||
             (plVar72 = unaff_x27, auVar19 = auVar24, unaff_x27 == (long *)0x0)) goto LAB_002fd00c;
          lVar58 = *(long *)((long)pqVar47 + -0x88);
          if ((int)plVar70[1] <= (int)lVar58) {
            iVar48 = func_0x0029afb8(plVar70,*(undefined8 *)((long)pqVar47 + -0x98));
            auVar19 = auVar25;
            if (iVar48 == 0) goto LAB_002fd00c;
            iVar48 = (int)plVar70[1];
            lVar58 = *(long *)((long)pqVar47 + -0x88);
            if (iVar48 <= (int)lVar58) {
              _bzero(*plVar70 + (long)iVar48 * 8,(ulong)(uint)((int)lVar58 - iVar48) * 8 + 8);
              lVar58 = *(long *)((long)pqVar47 + -0x88);
            }
            *(int *)(plVar70 + 1) = (int)*(undefined8 *)((long)pqVar47 + -0x98);
          }
          *(ulong *)(*plVar70 + lVar58 * 8) = *(ulong *)(*plVar70 + lVar58 * 8) | 0x10000000;
          lVar58 = *(long *)((long)pqVar47 + -0x90);
          if ((int)unaff_x27[1] <= (int)lVar58) {
            iVar48 = func_0x0029afb8(unaff_x27,*(undefined8 *)((long)pqVar47 + -0xa0));
            auVar19 = auVar26;
            if (iVar48 == 0) goto LAB_002fd00c;
            iVar48 = (int)unaff_x27[1];
            lVar58 = *(long *)((long)pqVar47 + -0x90);
            if (iVar48 <= (int)lVar58) {
              _bzero(*unaff_x27 + (long)iVar48 * 8,(ulong)(uint)((int)lVar58 - iVar48) * 8 + 8);
              lVar58 = *(long *)((long)pqVar47 + -0x90);
            }
            *(int *)(unaff_x27 + 1) = (int)*(undefined8 *)((long)pqVar47 + -0xa0);
          }
          *(ulong *)(*unaff_x27 + lVar58 * 8) = *(ulong *)(*unaff_x27 + lVar58 * 8) | 1;
          if (*(long *)(lVar60 + 8) == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 8) = 0;
              auVar19 = auVar42;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 8) = lVar58;
            lVar58 = *(long *)(lVar60 + 0x18);
          }
          else {
            lVar58 = *(long *)(lVar60 + 0x18);
          }
          if (lVar58 == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 0x18) = 0;
              auVar19 = auVar41;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 0x18) = lVar58;
            lVar58 = *(long *)(lVar60 + 0x10);
          }
          else {
            lVar58 = *(long *)(lVar60 + 0x10);
          }
          if (lVar58 == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 0x10) = 0;
              auVar19 = auVar40;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 0x10) = lVar58;
            lVar58 = *(long *)(lVar60 + 0x20);
          }
          else {
            lVar58 = *(long *)(lVar60 + 0x20);
          }
          if (lVar58 == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 0x20) = 0;
              auVar19 = auVar39;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 0x20) = lVar58;
            lVar58 = *(long *)(lVar60 + 0x28);
          }
          else {
            lVar58 = *(long *)(lVar60 + 0x28);
          }
          if (lVar58 == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 0x28) = 0;
              auVar19 = auVar38;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 0x28) = lVar58;
            lVar58 = *(long *)(lVar60 + 0x30);
          }
          else {
            lVar58 = *(long *)(lVar60 + 0x30);
          }
          if (lVar58 == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 0x30) = 0;
              auVar19 = auVar37;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 0x30) = lVar58;
            lVar58 = *(long *)(lVar60 + 0x38);
          }
          else {
            lVar58 = *(long *)(lVar60 + 0x38);
          }
          if (lVar58 == 0) {
            lVar58 = func_0x0036e31c(0x18);
            if (lVar58 == 0) {
              *(undefined8 *)(lVar60 + 0x38) = 0;
              auVar19 = auVar36;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar58 + 0x14) = 1;
            *(long *)(lVar60 + 0x38) = lVar58;
            psVar71 = *(segment_command **)(lVar60 + 0x10);
            if (psVar71 != psVar56) goto code_r0x002fcb2c;
LAB_002fcc64:
            psVar59 = &segment_command_00000020;
            iVar48 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo);
          }
          else {
            psVar71 = *(segment_command **)(lVar60 + 0x10);
            if (psVar71 == psVar56) goto LAB_002fcc64;
code_r0x002fcb2c:
            auVar19._0_8_ = psVar71;
            iVar48 = func_0x0029afb8(psVar71,(long)*(int *)psVar56->segname);
            if (iVar48 == 0) goto LAB_002fd00c;
            uVar49 = 0;
            if (*(int *)psVar56->segname != 0) {
              uVar143._0_4_ = psVar56->cmd;
              uVar143._4_4_ = psVar56->cmdsize;
              uVar142._0_4_ = psVar71->cmd;
              uVar142._4_4_ = psVar71->cmdsize;
              _memcpy(uVar142,uVar143,(long)*(int *)psVar56->segname << 3);
              uVar49 = *(undefined4 *)psVar56->segname;
            }
            *(undefined4 *)psVar71->segname = uVar49;
            *(undefined4 *)(psVar71->segname + 8) = *(undefined4 *)(psVar56->segname + 8);
            psVar59 = &segment_command_00000020;
            iVar48 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo);
          }
          auVar19._0_8_ = psVar71;
          if (iVar48 == 0) goto LAB_002fd00c;
          auVar43._8_8_ = uVar63;
          auVar43._0_8_ = psVar71;
          auVar35._8_8_ = uVar63;
          auVar35._0_8_ = psVar71;
          iVar48 = func_0x0029bf0c(unaff_x24);
          if (iVar48 != 0x800) goto code_r0x002fd4e8;
          if (*(uint *)((long)pqVar47 + -0xa8) < 0x1000) {
            psVar59 = (segment_command *)(ulong)*(uint *)((long)pqVar47 + -0xb4);
            iVar48 = func_0x0029f130(unaff_x24,unaff_x24);
            auVar19 = auVar43;
            if (iVar48 == 0) goto LAB_002fd00c;
          }
          else if (*(uint *)((long)pqVar47 + -0xa8) != 0x1000) {
            iVar48 = func_0x0029b0e4(unaff_x24,1);
            if (iVar48 != 0) {
              psVar59 = (segment_command *)(ulong)*(uint *)((long)pqVar47 + -0xb8);
              iVar48 = func_0x0029ed38(unaff_x24,unaff_x24);
              auVar19 = auVar35;
              if (iVar48 != 0) goto code_r0x002fccfc;
            }
            goto LAB_002fd00c;
          }
code_r0x002fccfc:
          *(ulong *)((long)pqVar47 + -0xc0) = uVar63;
          iVar48 = func_0x0029bf0c(unaff_x24);
          *(int *)((long)pqVar47 + -0xc4) = (int)unaff_x28;
          if (*(int *)((long)pqVar47 + -0xa4) != iVar48) goto code_r0x002fd4ec;
code_r0x002fcd40:
          do {
            auVar34._8_8_ = uVar63;
            auVar34._0_8_ = psVar71;
            auVar33._8_8_ = uVar63;
            auVar33._0_8_ = psVar71;
            auVar29._8_8_ = uVar63;
            auVar29._0_8_ = psVar71;
            auVar28._8_8_ = uVar63;
            auVar28._0_8_ = psVar71;
            auVar27._8_8_ = uVar63;
            auVar27._0_8_ = psVar71;
            auVar19._8_8_ = uVar63;
            auVar19._0_8_ = psVar71;
            iVar48 = func_0x0031de90(*(undefined8 *)(lVar60 + 0x20),
                                     *(undefined4 *)((long)pqVar47 + -0xa4),
                                     *(undefined8 *)(lVar60 + 0x10),0,unaff_x24,plVar70,psVar55,
                                     *(undefined8 *)((long)pqVar47 + -0x80));
            if (iVar48 == 0) goto LAB_002fd00c;
            if (*(long *)((long)pqVar47 + -0x80) != 0) {
              cVar5 = **(char **)((long)pqVar47 + -0x80);
              if (cVar5 == '\x01') {
                iVar48 = (**(code **)(*(char **)((long)pqVar47 + -0x80) + 0x10))(3,0);
                auVar19 = auVar34;
                if (iVar48 == 0) goto LAB_002fd00c;
              }
              else {
                auVar19 = auVar27;
                if (cVar5 != '\x02') goto LAB_002fd00c;
                (**(code **)(*(long *)((long)pqVar47 + -0x80) + 0x10))(3,0);
              }
            }
            iVar48 = func_0x0031de90(*(undefined8 *)(lVar60 + 0x28),
                                     *(undefined4 *)((long)pqVar47 + -0xa4),
                                     *(undefined8 *)(lVar60 + 0x10),*(undefined8 *)(lVar60 + 0x20),
                                     unaff_x24,plVar70,psVar55,
                                     *(undefined8 *)((long)pqVar47 + -0x80));
            auVar19 = auVar28;
            if (iVar48 == 0) goto LAB_002fd00c;
            if (*(long *)((long)pqVar47 + -0x80) != 0) {
              cVar5 = **(char **)((long)pqVar47 + -0x80);
              if (cVar5 == '\x01') {
                iVar48 = (**(code **)(*(char **)((long)pqVar47 + -0x80) + 0x10))(3,1);
                auVar19 = auVar33;
                if (iVar48 == 0) goto LAB_002fd00c;
              }
              else {
                auVar19 = auVar29;
                if (cVar5 != '\x02') goto LAB_002fd00c;
                (**(code **)(*(long *)((long)pqVar47 + -0x80) + 0x10))(3,1);
              }
            }
            psVar71 = *(segment_command **)(lVar60 + 0x20);
            psVar59 = *(segment_command **)(lVar60 + 0x28);
            if ((psVar71 == (segment_command *)0x0) || (psVar59 == (segment_command *)0x0)) {
              if (psVar71 != (segment_command *)0x0) goto code_r0x002fce74;
              psVar59 = (segment_command *)0x0;
            }
            else {
              iVar48 = *(int *)(psVar71->segname + 8);
              if (iVar48 == *(int *)(psVar59->segname + 8)) {
                uVar144._0_4_ = psVar71->cmd;
                uVar144._4_4_ = psVar71->cmdsize;
                uVar145._0_4_ = psVar59->cmd;
                uVar145._4_4_ = psVar59->cmdsize;
                iVar52 = func_0x0029d99c(uVar144,(long)*(int *)psVar71->segname,uVar145,
                                         (long)*(int *)psVar59->segname);
                iVar51 = -iVar52;
                if (iVar48 == 0) {
                  iVar51 = iVar52;
                }
                if (-1 < iVar51) {
code_r0x002fce7c:
                  psVar59 = psVar71;
                  goto code_r0x002fce80;
                }
              }
              else if (iVar48 == 0) goto code_r0x002fce7c;
code_r0x002fce74:
              *(segment_command **)(lVar60 + 0x20) = psVar59;
              *(segment_command **)(lVar60 + 0x28) = psVar71;
            }
code_r0x002fce80:
            func_0x00373e9c(0xa29210,&DAT_0029be70);
            iVar48 = func_0x0029b864(*(undefined8 *)((long)pqVar47 + -0x70),psVar59,0xa398c0);
            uVar63 = *(ulong *)((long)pqVar47 + -0xc0);
            if (iVar48 == 0) {
code_r0x002fd008:
              auVar19._8_8_ = uVar63;
              auVar19._0_8_ = psVar71;
              unaff_x28 = (qword)*(uint *)((long)pqVar47 + -0xc4);
              goto LAB_002fd00c;
            }
            psVar71 = *(segment_command **)(lVar60 + 0x28);
            func_0x00373e9c(0xa29210,&DAT_0029be70);
            iVar48 = func_0x0029b864(uVar63,psVar71,0xa398c0);
            if ((iVar48 == 0) ||
               (iVar48 = func_0x002a7f48(*(undefined8 *)((long)pqVar47 + -0x78),
                                         *(undefined8 *)((long)pqVar47 + -0x70),uVar63,psVar55),
               iVar48 == 0)) goto code_r0x002fd008;
            psVar59 = *(segment_command **)(lVar60 + 0x10);
            iVar48 = func_0x002a5b4c(*(undefined8 *)(lVar60 + 0x18),
                                     (undefined1 *)((long)pqVar47 + -100),psVar59,
                                     *(undefined8 *)((long)pqVar47 + -0x78),psVar55);
            if (iVar48 == 0) goto code_r0x002fd008;
            puVar69 = *(undefined8 **)(lVar60 + 0x18);
            unaff_x28 = (qword)*(uint *)((long)pqVar47 + -0xc4);
            if (puVar69 == (undefined8 *)0x0) break;
            uVar50 = *(uint *)(puVar69 + 2);
            uVar63 = (ulong)uVar50;
            if (uVar50 != *(uint *)(unaff_x27 + 2)) {
              if (uVar50 == 0) break;
              goto code_r0x002fcd40;
            }
            psVar59 = (segment_command *)*unaff_x27;
            iVar51 = func_0x0029d99c(*puVar69,(long)*(int *)(puVar69 + 1),psVar59,
                                     (long)(int)unaff_x27[1]);
            iVar48 = -iVar51;
            if (uVar50 == 0) {
              iVar48 = iVar51;
            }
          } while (iVar48 < 1);
          auVar43._8_8_ = uVar63;
          auVar43._0_8_ = psVar71;
          uVar53 = func_0x0029bf0c(*(undefined8 *)((long)pqVar47 + -0x70));
          uVar50 = *(uint *)((long)pqVar47 + -0xa4);
          plVar70 = (long *)(ulong)uVar50;
          if (uVar53 != uVar50) goto code_r0x002fd4f0;
          uVar107 = *(undefined8 *)((long)pqVar47 + -0xc0);
          auVar43._8_8_ = uVar107;
          auVar46._8_8_ = uVar107;
          auVar46._0_8_ = psVar71;
          auVar45._8_8_ = uVar107;
          auVar45._0_8_ = psVar71;
          auVar44._8_8_ = uVar107;
          auVar44._0_8_ = psVar71;
          auVar32._8_8_ = uVar107;
          auVar32._0_8_ = psVar71;
          auVar31._8_8_ = uVar107;
          auVar31._0_8_ = psVar71;
          auVar30._8_8_ = uVar107;
          auVar30._0_8_ = psVar71;
          auVar19._8_8_ = uVar107;
          auVar19._0_8_ = psVar71;
          uVar53 = func_0x0029bf0c(uVar107);
          if (uVar53 == uVar50) {
            iVar48 = func_0x002a80fc(*(undefined8 *)(lVar60 + 8),*(undefined8 *)(lVar60 + 0x20),
                                     *(undefined8 *)(lVar60 + 0x28),psVar55);
            if ((iVar48 == 0) ||
               (iVar48 = func_0x0029f764(0,*(undefined8 *)(lVar60 + 0x30),
                                         *(undefined8 *)(lVar60 + 0x18),
                                         *(undefined8 *)((long)pqVar47 + -0x70),
                                         *(undefined4 *)((long)pqVar47 + -0xa4),psVar55),
               auVar19 = auVar30, iVar48 == 0)) goto LAB_002fd00c;
            psVar59 = *(segment_command **)(lVar60 + 0x18);
            iVar48 = func_0x0029f764(0,*(undefined8 *)(lVar60 + 0x38),psVar59,uVar107,
                                     *(undefined4 *)((long)pqVar47 + -0xa4),psVar55);
            auVar19 = auVar31;
            if (iVar48 == 0) goto LAB_002fd00c;
            plVar70 = *(long **)(lVar60 + 8);
            uVar50 = *(uint *)(plVar70 + 1);
            uVar63 = (ulong)uVar50;
            lVar58 = uVar63 * 8;
            do {
              lVar58 = lVar58 + -8;
              iVar48 = (int)uVar63;
              uVar63 = (ulong)(iVar48 - 1);
              if (iVar48 < 1) {
                *(uint *)(plVar70 + 1) = uVar50 & (int)uVar50 >> 0x1f;
                if (-1 < (int)uVar50) {
                  *(undefined4 *)(plVar70 + 2) = 0;
                }
                goto code_r0x002fd0d4;
              }
            } while (*(long *)(*plVar70 + lVar58) == 0);
            *(int *)(plVar70 + 1) = iVar48;
code_r0x002fd0d4:
            iVar48 = func_0x0029bf0c();
            if (iVar48 != *(int *)((long)pqVar47 + -0xa8)) {
              psVar59 = (segment_command *)((long)&segment_command_00000020.vmsize + 4);
              func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
              auVar19 = auVar46;
              goto joined_r0x002fd12c;
            }
            iVar48 = func_0x002fbc24(lVar60,psVar55);
            auVar19 = auVar32;
            if (iVar48 == 0) goto LAB_002fd00c;
            iVar48 = func_0x002f77a0(lVar60);
            if (iVar48 == 0) {
              psVar59 = (segment_command *)(section_00000068.segname + 4);
              func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
              auVar19 = auVar45;
              goto joined_r0x002fd12c;
            }
            plVar70 = (long *)0x0;
            auVar43 = auVar44;
            goto joined_r0x002fd12c;
          }
code_r0x002fd4f4:
          func_0x0079f0e8();
code_r0x002fd4f8:
          auVar151 = func_0x0079db28();
          *(segment_command **)((long)pqVar47 + -0x110) = unaff_x24;
          *(segment_command **)((long)pqVar47 + -0x108) = psVar56;
          *(undefined1 (*) [16])((long)pqVar47 + -0x100) = auVar43;
          *(long *)((long)pqVar47 + -0xf0) = lVar60;
          *(long **)((long)pqVar47 + -0xe8) = plVar70;
          *(undefined1 **)((long)pqVar47 + -0xe0) = (undefined1 *)((long)pqVar47 + -0x10);
          *(undefined **)((long)pqVar47 + -0xd8) = &_aws_lc_0_24_0_RSA_generate_key_fips;
          puVar54 = (undefined1 *)((long)pqVar47 + -0xe0);
          if ((auVar151._8_4_ < 0x800) || ((auVar151._8_8_ & 0x7f) != 0)) {
            func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
            return (long *)0x0;
          }
          psVar56 = (segment_command *)func_0x0036e31c(0x18);
          if (psVar56 == (segment_command *)0x0) {
            return (long *)0x0;
          }
          psVar56->segname[0xc] = '\x01';
          psVar56->segname[0xd] = '\0';
          psVar56->segname[0xe] = '\0';
          psVar56->segname[0xf] = '\0';
          if (*(int *)(psVar56->segname + 4) == 0) {
            plVar72 = (long *)func_0x0036e358(1,8);
            if (plVar72 == (long *)0x0) {
              uVar50 = *(uint *)(psVar56->segname + 0xc);
              if ((uVar50 >> 1 & 1) == 0) {
                uVar147._0_4_ = psVar56->cmd;
                uVar147._4_4_ = psVar56->cmdsize;
                func_0x0036e3d8(uVar147);
                uVar50 = *(uint *)(psVar56->segname + 0xc);
              }
              if ((uVar50 & 1) == 0) {
                psVar56->cmd = 0;
                psVar56->cmdsize = 0;
                return (long *)0x0;
              }
              func_0x0036e3d8(psVar56);
              return (long *)0x0;
            }
            if (*(int *)psVar56->segname != 0) {
              uVar148._0_4_ = psVar56->cmd;
              uVar148._4_4_ = psVar56->cmdsize;
              _memcpy(plVar72,uVar148,(long)*(int *)psVar56->segname << 3);
            }
            uVar149._0_4_ = psVar56->cmd;
            uVar149._4_4_ = psVar56->cmdsize;
            func_0x0036e3d8(uVar149);
            *(long **)psVar56 = plVar72;
            psVar56->segname[4] = '\x01';
            psVar56->segname[5] = '\0';
            psVar56->segname[6] = '\0';
            psVar56->segname[7] = '\0';
          }
          else {
            plVar72 = *(long **)psVar56;
          }
          psVar56->segname[8] = '\0';
          psVar56->segname[9] = '\0';
          psVar56->segname[10] = '\0';
          psVar56->segname[0xb] = '\0';
          *plVar72 = (long)&UNK_00010001;
          psVar56->segname[0] = '\x01';
          psVar56->segname[1] = '\0';
          psVar56->segname[2] = '\0';
          psVar56->segname[3] = '\0';
          qVar57 = 1;
          puVar73 = &UNK_002fd5f8;
          pqVar47 = (qword *)((long)pqVar47 + -0x110);
          param_5 = psVar56;
          psVar71 = psVar59;
          auVar19 = auVar151;
        }
        func_0x0028f0e4();
        lVar60 = func_0x002f8ac4(0);
        if (lVar60 == 0) {
code_r0x002fd15c:
          plVar70 = (long *)0x0;
          lVar60 = 0;
        }
        else {
          func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
          uVar50 = func_0x0028edc4();
          func_0x002f7efc(lVar60);
          if ((uVar50 & 0xff000fff) == 0x400008d) {
            func_0x0028f0e4();
            lVar60 = func_0x002f8ac4(0);
            if (lVar60 == 0) goto code_r0x002fd15c;
            func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
            uVar50 = func_0x0028edc4();
            func_0x002f7efc(lVar60);
            if ((uVar50 & 0xff000fff) == 0x400008d) {
              func_0x0028f0e4();
              lVar60 = func_0x002f8ac4(0);
              if (lVar60 == 0) goto code_r0x002fd15c;
              func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
              uVar50 = func_0x0028edc4();
              func_0x002f7efc(lVar60);
              if ((uVar50 & 0xff000fff) == 0x400008d) {
                func_0x0028f0e4();
                lVar60 = func_0x002f8ac4(0);
                if (lVar60 == 0) goto code_r0x002fd15c;
                func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
                func_0x0028edc4();
                func_0x002f7efc(lVar60);
              }
            }
          }
          lVar60 = 0;
          plVar70 = (long *)0x0;
        }
code_r0x002fd4a8:
        func_0x002f7efc(lVar60);
        return plVar70;
      }
      if ((int)psVar71->fileoff != 0) goto code_r0x002fc268;
      unaff_x20 = (segment_command *)&psVar71->vmaddr;
      lVar60 = (long)(int)*(uint *)(unaff_x28 + 0x20);
      uVar50 = (uint)psVar71->vmsize;
      if (*(uint *)(unaff_x28 + 0x20) < uVar50) {
        uVar63 = (int)uVar50 - lVar60;
        if (uVar63 < 8) {
          uVar68 = 0;
          lVar58 = lVar60;
code_r0x002fc360:
          lVar60 = (int)uVar50 - lVar58;
          puVar62 = (ulong *)(*(qword *)unaff_x20 + lVar58 * 8);
          do {
            uVar68 = *puVar62 | uVar68;
            lVar60 = lVar60 + -1;
            puVar62 = puVar62 + 1;
          } while (lVar60 != 0);
        }
        else {
          uVar66 = uVar63 & 0xfffffffffffffff8;
          lVar58 = uVar66 + lVar60;
          bVar74 = 0;
          bVar75 = 0;
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
          bVar93 = 0;
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
          uVar107 = 0;
          uVar116 = 0;
          uVar125 = 0;
          uVar134 = 0;
          puVar69 = (undefined8 *)(*(qword *)unaff_x20 + lVar60 * 8 + 0x20);
          uVar68 = uVar66;
          do {
            uVar143 = puVar69[-3];
            uVar142 = puVar69[-4];
            uVar145 = puVar69[-1];
            uVar144 = puVar69[-2];
            uVar147 = puVar69[1];
            uVar146 = *puVar69;
            uVar149 = puVar69[3];
            uVar148 = puVar69[2];
            bVar74 = (byte)uVar142 | bVar74;
            bVar75 = (byte)((ulong)uVar142 >> 8) | bVar75;
            bVar76 = (byte)((ulong)uVar142 >> 0x10) | bVar76;
            bVar77 = (byte)((ulong)uVar142 >> 0x18) | bVar77;
            bVar78 = (byte)((ulong)uVar142 >> 0x20) | bVar78;
            bVar79 = (byte)((ulong)uVar142 >> 0x28) | bVar79;
            bVar80 = (byte)((ulong)uVar142 >> 0x30) | bVar80;
            bVar81 = (byte)((ulong)uVar142 >> 0x38) | bVar81;
            bVar82 = (byte)uVar143 | bVar82;
            bVar83 = (byte)((ulong)uVar143 >> 8) | bVar83;
            bVar84 = (byte)((ulong)uVar143 >> 0x10) | bVar84;
            bVar85 = (byte)((ulong)uVar143 >> 0x18) | bVar85;
            bVar86 = (byte)((ulong)uVar143 >> 0x20) | bVar86;
            bVar87 = (byte)((ulong)uVar143 >> 0x28) | bVar87;
            bVar88 = (byte)((ulong)uVar143 >> 0x30) | bVar88;
            bVar89 = (byte)((ulong)uVar143 >> 0x38) | bVar89;
            bVar90 = (byte)uVar144 | bVar90;
            bVar91 = (byte)((ulong)uVar144 >> 8) | bVar91;
            bVar92 = (byte)((ulong)uVar144 >> 0x10) | bVar92;
            bVar93 = (byte)((ulong)uVar144 >> 0x18) | bVar93;
            bVar94 = (byte)((ulong)uVar144 >> 0x20) | bVar94;
            bVar95 = (byte)((ulong)uVar144 >> 0x28) | bVar95;
            bVar96 = (byte)((ulong)uVar144 >> 0x30) | bVar96;
            bVar97 = (byte)((ulong)uVar144 >> 0x38) | bVar97;
            bVar98 = (byte)uVar145 | bVar98;
            bVar99 = (byte)((ulong)uVar145 >> 8) | bVar99;
            bVar100 = (byte)((ulong)uVar145 >> 0x10) | bVar100;
            bVar101 = (byte)((ulong)uVar145 >> 0x18) | bVar101;
            bVar102 = (byte)((ulong)uVar145 >> 0x20) | bVar102;
            bVar103 = (byte)((ulong)uVar145 >> 0x28) | bVar103;
            bVar104 = (byte)((ulong)uVar145 >> 0x30) | bVar104;
            bVar105 = (byte)((ulong)uVar145 >> 0x38) | bVar105;
            bVar106 = (byte)uVar146 | (byte)uVar107;
            bVar108 = (byte)((ulong)uVar146 >> 8) | (byte)((ulong)uVar107 >> 8);
            bVar109 = (byte)((ulong)uVar146 >> 0x10) | (byte)((ulong)uVar107 >> 0x10);
            bVar110 = (byte)((ulong)uVar146 >> 0x18) | (byte)((ulong)uVar107 >> 0x18);
            bVar111 = (byte)((ulong)uVar146 >> 0x20) | (byte)((ulong)uVar107 >> 0x20);
            bVar112 = (byte)((ulong)uVar146 >> 0x28) | (byte)((ulong)uVar107 >> 0x28);
            bVar113 = (byte)((ulong)uVar146 >> 0x30) | (byte)((ulong)uVar107 >> 0x30);
            bVar114 = (byte)((ulong)uVar146 >> 0x38) | (byte)((ulong)uVar107 >> 0x38);
            uVar107 = CONCAT17(bVar114,CONCAT16(bVar113,CONCAT15(bVar112,CONCAT14(bVar111,CONCAT13(
                                                  bVar110,CONCAT12(bVar109,CONCAT11(bVar108,bVar106)
                                                                  ))))));
            bVar115 = (byte)uVar147 | (byte)uVar116;
            bVar117 = (byte)((ulong)uVar147 >> 8) | (byte)((ulong)uVar116 >> 8);
            bVar118 = (byte)((ulong)uVar147 >> 0x10) | (byte)((ulong)uVar116 >> 0x10);
            bVar119 = (byte)((ulong)uVar147 >> 0x18) | (byte)((ulong)uVar116 >> 0x18);
            bVar120 = (byte)((ulong)uVar147 >> 0x20) | (byte)((ulong)uVar116 >> 0x20);
            bVar121 = (byte)((ulong)uVar147 >> 0x28) | (byte)((ulong)uVar116 >> 0x28);
            bVar122 = (byte)((ulong)uVar147 >> 0x30) | (byte)((ulong)uVar116 >> 0x30);
            bVar123 = (byte)((ulong)uVar147 >> 0x38) | (byte)((ulong)uVar116 >> 0x38);
            uVar116 = CONCAT17(bVar123,CONCAT16(bVar122,CONCAT15(bVar121,CONCAT14(bVar120,CONCAT13(
                                                  bVar119,CONCAT12(bVar118,CONCAT11(bVar117,bVar115)
                                                                  ))))));
            bVar124 = (byte)uVar148 | (byte)uVar125;
            bVar126 = (byte)((ulong)uVar148 >> 8) | (byte)((ulong)uVar125 >> 8);
            bVar127 = (byte)((ulong)uVar148 >> 0x10) | (byte)((ulong)uVar125 >> 0x10);
            bVar128 = (byte)((ulong)uVar148 >> 0x18) | (byte)((ulong)uVar125 >> 0x18);
            bVar129 = (byte)((ulong)uVar148 >> 0x20) | (byte)((ulong)uVar125 >> 0x20);
            bVar130 = (byte)((ulong)uVar148 >> 0x28) | (byte)((ulong)uVar125 >> 0x28);
            bVar131 = (byte)((ulong)uVar148 >> 0x30) | (byte)((ulong)uVar125 >> 0x30);
            bVar132 = (byte)((ulong)uVar148 >> 0x38) | (byte)((ulong)uVar125 >> 0x38);
            uVar125 = CONCAT17(bVar132,CONCAT16(bVar131,CONCAT15(bVar130,CONCAT14(bVar129,CONCAT13(
                                                  bVar128,CONCAT12(bVar127,CONCAT11(bVar126,bVar124)
                                                                  ))))));
            bVar133 = (byte)uVar149 | (byte)uVar134;
            bVar135 = (byte)((ulong)uVar149 >> 8) | (byte)((ulong)uVar134 >> 8);
            bVar136 = (byte)((ulong)uVar149 >> 0x10) | (byte)((ulong)uVar134 >> 0x10);
            bVar137 = (byte)((ulong)uVar149 >> 0x18) | (byte)((ulong)uVar134 >> 0x18);
            bVar138 = (byte)((ulong)uVar149 >> 0x20) | (byte)((ulong)uVar134 >> 0x20);
            bVar139 = (byte)((ulong)uVar149 >> 0x28) | (byte)((ulong)uVar134 >> 0x28);
            bVar140 = (byte)((ulong)uVar149 >> 0x30) | (byte)((ulong)uVar134 >> 0x30);
            bVar141 = (byte)((ulong)uVar149 >> 0x38) | (byte)((ulong)uVar134 >> 0x38);
            uVar134 = CONCAT17(bVar141,CONCAT16(bVar140,CONCAT15(bVar139,CONCAT14(bVar138,CONCAT13(
                                                  bVar137,CONCAT12(bVar136,CONCAT11(bVar135,bVar133)
                                                                  ))))));
            uVar68 = uVar68 - 8;
            puVar69 = puVar69 + 8;
          } while (uVar68 != 0);
          bVar124 = bVar124 | bVar106 | bVar90 | bVar74;
          bVar126 = bVar126 | bVar108 | bVar91 | bVar75;
          bVar127 = bVar127 | bVar109 | bVar92 | bVar76;
          bVar128 = bVar128 | bVar110 | bVar93 | bVar77;
          bVar129 = bVar129 | bVar111 | bVar94 | bVar78;
          bVar130 = bVar130 | bVar112 | bVar95 | bVar79;
          bVar131 = bVar131 | bVar113 | bVar96 | bVar80;
          bVar132 = bVar132 | bVar114 | bVar97 | bVar81;
          bVar133 = bVar133 | bVar115 | bVar98 | bVar82;
          bVar135 = bVar135 | bVar117 | bVar99 | bVar83;
          bVar136 = bVar136 | bVar118 | bVar100 | bVar84;
          bVar137 = bVar137 | bVar119 | bVar101 | bVar85;
          bVar138 = bVar138 | bVar120 | bVar102 | bVar86;
          bVar139 = bVar139 | bVar121 | bVar103 | bVar87;
          bVar140 = bVar140 | bVar122 | bVar104 | bVar88;
          bVar141 = bVar141 | bVar123 | bVar105 | bVar89;
          auVar150[1] = bVar126;
          auVar150[0] = bVar124;
          auVar150[2] = bVar127;
          auVar150[3] = bVar128;
          auVar150[4] = bVar129;
          auVar150[5] = bVar130;
          auVar150[6] = bVar131;
          auVar150[7] = bVar132;
          auVar150[8] = bVar133;
          auVar150[9] = bVar135;
          auVar150[10] = bVar136;
          auVar150[0xb] = bVar137;
          auVar150[0xc] = bVar138;
          auVar150[0xd] = bVar139;
          auVar150[0xe] = bVar140;
          auVar150[0xf] = bVar141;
          auVar10[1] = bVar126;
          auVar10[0] = bVar124;
          auVar10[2] = bVar127;
          auVar10[3] = bVar128;
          auVar10[4] = bVar129;
          auVar10[5] = bVar130;
          auVar10[6] = bVar131;
          auVar10[7] = bVar132;
          auVar10[8] = bVar133;
          auVar10[9] = bVar135;
          auVar10[10] = bVar136;
          auVar10[0xb] = bVar137;
          auVar10[0xc] = bVar138;
          auVar10[0xd] = bVar139;
          auVar10[0xe] = bVar140;
          auVar10[0xf] = bVar141;
          auVar150 = NEON_ext(auVar150,auVar10,8,1);
          uVar68 = CONCAT17(bVar132 | auVar150[7],
                            CONCAT16(bVar131 | auVar150[6],
                                     CONCAT15(bVar130 | auVar150[5],
                                              CONCAT14(bVar129 | auVar150[4],
                                                       CONCAT13(bVar128 | auVar150[3],
                                                                CONCAT12(bVar127 | auVar150[2],
                                                                         CONCAT11(bVar126 | auVar150
                                                  [1],bVar124 | auVar150[0])))))));
          if (uVar63 != uVar66) goto code_r0x002fc360;
        }
        if (uVar68 != 0) goto code_r0x002fc268;
      }
      plVar70 = (long *)func_0x002a3384(unaff_x24,psVar55,unaff_x28,param_5);
      if ((int)plVar70 == 0) goto code_r0x002fc288;
      plVar70 = (long *)func_0x002a3110(unaff_x24,unaff_x24,unaff_x28,unaff_x28,param_5);
      auVar151 = auVar16;
      if ((int)plVar70 == 0) goto code_r0x002fc288;
      psVar71 = unaff_x20;
      if (*(int *)(unaff_x28 + 0x28) != 0) goto code_r0x002fc268;
      lVar60 = *(long *)(param_4[4].segname + 8);
      auVar17._8_8_ = lVar60;
      auVar17._0_8_ = plVar72;
      auVar151._8_8_ = lVar60;
      lVar58 = (long)(int)*(uint *)(lVar60 + 0x20);
      uVar50 = *(uint *)(unaff_x28 + 0x20);
      if (uVar50 <= *(uint *)(lVar60 + 0x20)) goto code_r0x002fc470;
      lVar61 = *(long *)(unaff_x28 + 0x18);
      uVar63 = (int)uVar50 - lVar58;
      if (uVar63 < 8) {
        uVar68 = 0;
        lVar64 = lVar58;
code_r0x002fc454:
        lVar58 = (int)uVar50 - lVar64;
        puVar62 = (ulong *)(lVar61 + lVar64 * 8);
        do {
          uVar68 = *puVar62 | uVar68;
          lVar58 = lVar58 + -1;
          puVar62 = puVar62 + 1;
        } while (lVar58 != 0);
      }
      else {
        uVar66 = uVar63 & 0xfffffffffffffff8;
        lVar64 = uVar66 + lVar58;
        bVar74 = 0;
        bVar75 = 0;
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
        bVar93 = 0;
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
        uVar107 = 0;
        uVar116 = 0;
        uVar125 = 0;
        uVar134 = 0;
        puVar69 = (undefined8 *)(lVar61 + lVar58 * 8 + 0x20);
        uVar68 = uVar66;
        do {
          uVar143 = puVar69[-3];
          uVar142 = puVar69[-4];
          uVar145 = puVar69[-1];
          uVar144 = puVar69[-2];
          uVar147 = puVar69[1];
          uVar146 = *puVar69;
          uVar149 = puVar69[3];
          uVar148 = puVar69[2];
          bVar74 = (byte)uVar142 | bVar74;
          bVar75 = (byte)((ulong)uVar142 >> 8) | bVar75;
          bVar76 = (byte)((ulong)uVar142 >> 0x10) | bVar76;
          bVar77 = (byte)((ulong)uVar142 >> 0x18) | bVar77;
          bVar78 = (byte)((ulong)uVar142 >> 0x20) | bVar78;
          bVar79 = (byte)((ulong)uVar142 >> 0x28) | bVar79;
          bVar80 = (byte)((ulong)uVar142 >> 0x30) | bVar80;
          bVar81 = (byte)((ulong)uVar142 >> 0x38) | bVar81;
          bVar82 = (byte)uVar143 | bVar82;
          bVar83 = (byte)((ulong)uVar143 >> 8) | bVar83;
          bVar84 = (byte)((ulong)uVar143 >> 0x10) | bVar84;
          bVar85 = (byte)((ulong)uVar143 >> 0x18) | bVar85;
          bVar86 = (byte)((ulong)uVar143 >> 0x20) | bVar86;
          bVar87 = (byte)((ulong)uVar143 >> 0x28) | bVar87;
          bVar88 = (byte)((ulong)uVar143 >> 0x30) | bVar88;
          bVar89 = (byte)((ulong)uVar143 >> 0x38) | bVar89;
          bVar90 = (byte)uVar144 | bVar90;
          bVar91 = (byte)((ulong)uVar144 >> 8) | bVar91;
          bVar92 = (byte)((ulong)uVar144 >> 0x10) | bVar92;
          bVar93 = (byte)((ulong)uVar144 >> 0x18) | bVar93;
          bVar94 = (byte)((ulong)uVar144 >> 0x20) | bVar94;
          bVar95 = (byte)((ulong)uVar144 >> 0x28) | bVar95;
          bVar96 = (byte)((ulong)uVar144 >> 0x30) | bVar96;
          bVar97 = (byte)((ulong)uVar144 >> 0x38) | bVar97;
          bVar98 = (byte)uVar145 | bVar98;
          bVar99 = (byte)((ulong)uVar145 >> 8) | bVar99;
          bVar100 = (byte)((ulong)uVar145 >> 0x10) | bVar100;
          bVar101 = (byte)((ulong)uVar145 >> 0x18) | bVar101;
          bVar102 = (byte)((ulong)uVar145 >> 0x20) | bVar102;
          bVar103 = (byte)((ulong)uVar145 >> 0x28) | bVar103;
          bVar104 = (byte)((ulong)uVar145 >> 0x30) | bVar104;
          bVar105 = (byte)((ulong)uVar145 >> 0x38) | bVar105;
          bVar106 = (byte)uVar146 | (byte)uVar107;
          bVar108 = (byte)((ulong)uVar146 >> 8) | (byte)((ulong)uVar107 >> 8);
          bVar109 = (byte)((ulong)uVar146 >> 0x10) | (byte)((ulong)uVar107 >> 0x10);
          bVar110 = (byte)((ulong)uVar146 >> 0x18) | (byte)((ulong)uVar107 >> 0x18);
          bVar111 = (byte)((ulong)uVar146 >> 0x20) | (byte)((ulong)uVar107 >> 0x20);
          bVar112 = (byte)((ulong)uVar146 >> 0x28) | (byte)((ulong)uVar107 >> 0x28);
          bVar113 = (byte)((ulong)uVar146 >> 0x30) | (byte)((ulong)uVar107 >> 0x30);
          bVar114 = (byte)((ulong)uVar146 >> 0x38) | (byte)((ulong)uVar107 >> 0x38);
          uVar107 = CONCAT17(bVar114,CONCAT16(bVar113,CONCAT15(bVar112,CONCAT14(bVar111,CONCAT13(
                                                  bVar110,CONCAT12(bVar109,CONCAT11(bVar108,bVar106)
                                                                  ))))));
          bVar115 = (byte)uVar147 | (byte)uVar116;
          bVar117 = (byte)((ulong)uVar147 >> 8) | (byte)((ulong)uVar116 >> 8);
          bVar118 = (byte)((ulong)uVar147 >> 0x10) | (byte)((ulong)uVar116 >> 0x10);
          bVar119 = (byte)((ulong)uVar147 >> 0x18) | (byte)((ulong)uVar116 >> 0x18);
          bVar120 = (byte)((ulong)uVar147 >> 0x20) | (byte)((ulong)uVar116 >> 0x20);
          bVar121 = (byte)((ulong)uVar147 >> 0x28) | (byte)((ulong)uVar116 >> 0x28);
          bVar122 = (byte)((ulong)uVar147 >> 0x30) | (byte)((ulong)uVar116 >> 0x30);
          bVar123 = (byte)((ulong)uVar147 >> 0x38) | (byte)((ulong)uVar116 >> 0x38);
          uVar116 = CONCAT17(bVar123,CONCAT16(bVar122,CONCAT15(bVar121,CONCAT14(bVar120,CONCAT13(
                                                  bVar119,CONCAT12(bVar118,CONCAT11(bVar117,bVar115)
                                                                  ))))));
          bVar124 = (byte)uVar148 | (byte)uVar125;
          bVar126 = (byte)((ulong)uVar148 >> 8) | (byte)((ulong)uVar125 >> 8);
          bVar127 = (byte)((ulong)uVar148 >> 0x10) | (byte)((ulong)uVar125 >> 0x10);
          bVar128 = (byte)((ulong)uVar148 >> 0x18) | (byte)((ulong)uVar125 >> 0x18);
          bVar129 = (byte)((ulong)uVar148 >> 0x20) | (byte)((ulong)uVar125 >> 0x20);
          bVar130 = (byte)((ulong)uVar148 >> 0x28) | (byte)((ulong)uVar125 >> 0x28);
          bVar131 = (byte)((ulong)uVar148 >> 0x30) | (byte)((ulong)uVar125 >> 0x30);
          bVar132 = (byte)((ulong)uVar148 >> 0x38) | (byte)((ulong)uVar125 >> 0x38);
          uVar125 = CONCAT17(bVar132,CONCAT16(bVar131,CONCAT15(bVar130,CONCAT14(bVar129,CONCAT13(
                                                  bVar128,CONCAT12(bVar127,CONCAT11(bVar126,bVar124)
                                                                  ))))));
          bVar133 = (byte)uVar149 | (byte)uVar134;
          bVar135 = (byte)((ulong)uVar149 >> 8) | (byte)((ulong)uVar134 >> 8);
          bVar136 = (byte)((ulong)uVar149 >> 0x10) | (byte)((ulong)uVar134 >> 0x10);
          bVar137 = (byte)((ulong)uVar149 >> 0x18) | (byte)((ulong)uVar134 >> 0x18);
          bVar138 = (byte)((ulong)uVar149 >> 0x20) | (byte)((ulong)uVar134 >> 0x20);
          bVar139 = (byte)((ulong)uVar149 >> 0x28) | (byte)((ulong)uVar134 >> 0x28);
          bVar140 = (byte)((ulong)uVar149 >> 0x30) | (byte)((ulong)uVar134 >> 0x30);
          bVar141 = (byte)((ulong)uVar149 >> 0x38) | (byte)((ulong)uVar134 >> 0x38);
          uVar134 = CONCAT17(bVar141,CONCAT16(bVar140,CONCAT15(bVar139,CONCAT14(bVar138,CONCAT13(
                                                  bVar137,CONCAT12(bVar136,CONCAT11(bVar135,bVar133)
                                                                  ))))));
          uVar68 = uVar68 - 8;
          puVar69 = puVar69 + 8;
        } while (uVar68 != 0);
        bVar124 = bVar124 | bVar106 | bVar90 | bVar74;
        bVar126 = bVar126 | bVar108 | bVar91 | bVar75;
        bVar127 = bVar127 | bVar109 | bVar92 | bVar76;
        bVar128 = bVar128 | bVar110 | bVar93 | bVar77;
        bVar129 = bVar129 | bVar111 | bVar94 | bVar78;
        bVar130 = bVar130 | bVar112 | bVar95 | bVar79;
        bVar131 = bVar131 | bVar113 | bVar96 | bVar80;
        bVar132 = bVar132 | bVar114 | bVar97 | bVar81;
        bVar133 = bVar133 | bVar115 | bVar98 | bVar82;
        bVar135 = bVar135 | bVar117 | bVar99 | bVar83;
        bVar136 = bVar136 | bVar118 | bVar100 | bVar84;
        bVar137 = bVar137 | bVar119 | bVar101 | bVar85;
        bVar138 = bVar138 | bVar120 | bVar102 | bVar86;
        bVar139 = bVar139 | bVar121 | bVar103 | bVar87;
        bVar140 = bVar140 | bVar122 | bVar104 | bVar88;
        bVar141 = bVar141 | bVar123 | bVar105 | bVar89;
        auVar8[1] = bVar126;
        auVar8[0] = bVar124;
        auVar8[2] = bVar127;
        auVar8[3] = bVar128;
        auVar8[4] = bVar129;
        auVar8[5] = bVar130;
        auVar8[6] = bVar131;
        auVar8[7] = bVar132;
        auVar8[8] = bVar133;
        auVar8[9] = bVar135;
        auVar8[10] = bVar136;
        auVar8[0xb] = bVar137;
        auVar8[0xc] = bVar138;
        auVar8[0xd] = bVar139;
        auVar8[0xe] = bVar140;
        auVar8[0xf] = bVar141;
        auVar9[1] = bVar126;
        auVar9[0] = bVar124;
        auVar9[2] = bVar127;
        auVar9[3] = bVar128;
        auVar9[4] = bVar129;
        auVar9[5] = bVar130;
        auVar9[6] = bVar131;
        auVar9[7] = bVar132;
        auVar9[8] = bVar133;
        auVar9[9] = bVar135;
        auVar9[10] = bVar136;
        auVar9[0xb] = bVar137;
        auVar9[0xc] = bVar138;
        auVar9[0xd] = bVar139;
        auVar9[0xe] = bVar140;
        auVar9[0xf] = bVar141;
        auVar150 = NEON_ext(auVar8,auVar9,8,1);
        uVar68 = CONCAT17(bVar132 | auVar150[7],
                          CONCAT16(bVar131 | auVar150[6],
                                   CONCAT15(bVar130 | auVar150[5],
                                            CONCAT14(bVar129 | auVar150[4],
                                                     CONCAT13(bVar128 | auVar150[3],
                                                              CONCAT12(bVar127 | auVar150[2],
                                                                       CONCAT11(bVar126 | auVar150[1
                                                  ],bVar124 | auVar150[0])))))));
        if (uVar63 != uVar66) goto code_r0x002fc454;
      }
      if (uVar68 != 0) goto code_r0x002fc268;
code_r0x002fc470:
      plStack_70 = (long *)(unaff_x28 + 0x18);
      plVar70 = (long *)func_0x002a3384(unaff_x27,psVar55,lVar60,param_5);
      if ((int)plVar70 == 0) goto code_r0x002fc288;
      plVar70 = (long *)func_0x002a3110(unaff_x27,unaff_x27,lVar60,lVar60,param_5);
      auVar151 = auVar17;
      if ((int)plVar70 == 0) goto code_r0x002fc288;
      qStack_80 = param_4[4].fileoff;
      uStack_78 = *(undefined8 *)(param_4[4].segname + 8);
      uVar107 = func_0x002a42a0(unaff_x22,unaff_x24,param_4[4].filesize,plStack_70,param_5,
                                param_4[4].vmaddr);
      auVar151._8_8_ = uVar107;
      auVar16._8_8_ = uVar107;
      uVar50 = func_0x002a42a0(psStack_68,unaff_x27,qStack_80,unaff_x20,param_5,uStack_78);
      if ((uVar50 & (uint)uVar107) == 0) goto code_r0x002fc284;
      if (*(int *)(unaff_x28 + 0x28) != 0) goto code_r0x002fc268;
      lVar61 = *(long *)(param_4[4].segname + 8);
      auVar18._8_8_ = lVar61;
      auVar18._0_8_ = plVar72;
      auVar16._8_8_ = lVar61;
      auVar151._8_8_ = lVar61;
      lVar60 = (long)(int)*(uint *)(lVar61 + 0x20);
      lVar58 = (long)(int)*(uint *)(unaff_x28 + 0x20);
      if (*(uint *)(unaff_x28 + 0x20) <= *(uint *)(lVar61 + 0x20)) goto code_r0x002fc5cc;
      lVar61 = *plStack_70;
      uVar63 = lVar58 - lVar60;
      lVar64 = lVar60;
      if (7 < uVar63) goto code_r0x002fc54c;
      uVar68 = 0;
      goto code_r0x002fc5b0;
    }
  }
  func_0x0079f048();
code_r0x002fc544:
  plVar70 = (long *)func_0x0079f070();
  param_5 = unaff_x19;
  param_4 = unaff_x21;
  do {
    func_0x0079db4c(plVar70);
    lVar58 = extraout_x8;
    lVar61 = extraout_x9;
    uVar63 = extraout_x11;
    lVar64 = extraout_x14;
code_r0x002fc54c:
    uVar66 = uVar63 & 0xfffffffffffffff8;
    lVar60 = uVar66 + lVar64;
    bVar74 = 0;
    bVar75 = 0;
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
    bVar93 = 0;
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
    uVar107 = 0;
    uVar116 = 0;
    uVar125 = 0;
    uVar134 = 0;
    puVar69 = (undefined8 *)(lVar61 + lVar64 * 8 + 0x20);
    uVar68 = uVar66;
    do {
      uVar143 = puVar69[-3];
      uVar142 = puVar69[-4];
      uVar145 = puVar69[-1];
      uVar144 = puVar69[-2];
      uVar147 = puVar69[1];
      uVar146 = *puVar69;
      uVar149 = puVar69[3];
      uVar148 = puVar69[2];
      bVar74 = (byte)uVar142 | bVar74;
      bVar75 = (byte)((ulong)uVar142 >> 8) | bVar75;
      bVar76 = (byte)((ulong)uVar142 >> 0x10) | bVar76;
      bVar77 = (byte)((ulong)uVar142 >> 0x18) | bVar77;
      bVar78 = (byte)((ulong)uVar142 >> 0x20) | bVar78;
      bVar79 = (byte)((ulong)uVar142 >> 0x28) | bVar79;
      bVar80 = (byte)((ulong)uVar142 >> 0x30) | bVar80;
      bVar81 = (byte)((ulong)uVar142 >> 0x38) | bVar81;
      bVar82 = (byte)uVar143 | bVar82;
      bVar83 = (byte)((ulong)uVar143 >> 8) | bVar83;
      bVar84 = (byte)((ulong)uVar143 >> 0x10) | bVar84;
      bVar85 = (byte)((ulong)uVar143 >> 0x18) | bVar85;
      bVar86 = (byte)((ulong)uVar143 >> 0x20) | bVar86;
      bVar87 = (byte)((ulong)uVar143 >> 0x28) | bVar87;
      bVar88 = (byte)((ulong)uVar143 >> 0x30) | bVar88;
      bVar89 = (byte)((ulong)uVar143 >> 0x38) | bVar89;
      bVar90 = (byte)uVar144 | bVar90;
      bVar91 = (byte)((ulong)uVar144 >> 8) | bVar91;
      bVar92 = (byte)((ulong)uVar144 >> 0x10) | bVar92;
      bVar93 = (byte)((ulong)uVar144 >> 0x18) | bVar93;
      bVar94 = (byte)((ulong)uVar144 >> 0x20) | bVar94;
      bVar95 = (byte)((ulong)uVar144 >> 0x28) | bVar95;
      bVar96 = (byte)((ulong)uVar144 >> 0x30) | bVar96;
      bVar97 = (byte)((ulong)uVar144 >> 0x38) | bVar97;
      bVar98 = (byte)uVar145 | bVar98;
      bVar99 = (byte)((ulong)uVar145 >> 8) | bVar99;
      bVar100 = (byte)((ulong)uVar145 >> 0x10) | bVar100;
      bVar101 = (byte)((ulong)uVar145 >> 0x18) | bVar101;
      bVar102 = (byte)((ulong)uVar145 >> 0x20) | bVar102;
      bVar103 = (byte)((ulong)uVar145 >> 0x28) | bVar103;
      bVar104 = (byte)((ulong)uVar145 >> 0x30) | bVar104;
      bVar105 = (byte)((ulong)uVar145 >> 0x38) | bVar105;
      bVar106 = (byte)uVar146 | (byte)uVar107;
      bVar108 = (byte)((ulong)uVar146 >> 8) | (byte)((ulong)uVar107 >> 8);
      bVar109 = (byte)((ulong)uVar146 >> 0x10) | (byte)((ulong)uVar107 >> 0x10);
      bVar110 = (byte)((ulong)uVar146 >> 0x18) | (byte)((ulong)uVar107 >> 0x18);
      bVar111 = (byte)((ulong)uVar146 >> 0x20) | (byte)((ulong)uVar107 >> 0x20);
      bVar112 = (byte)((ulong)uVar146 >> 0x28) | (byte)((ulong)uVar107 >> 0x28);
      bVar113 = (byte)((ulong)uVar146 >> 0x30) | (byte)((ulong)uVar107 >> 0x30);
      bVar114 = (byte)((ulong)uVar146 >> 0x38) | (byte)((ulong)uVar107 >> 0x38);
      uVar107 = CONCAT17(bVar114,CONCAT16(bVar113,CONCAT15(bVar112,CONCAT14(bVar111,CONCAT13(bVar110
                                                  ,CONCAT12(bVar109,CONCAT11(bVar108,bVar106)))))));
      bVar115 = (byte)uVar147 | (byte)uVar116;
      bVar117 = (byte)((ulong)uVar147 >> 8) | (byte)((ulong)uVar116 >> 8);
      bVar118 = (byte)((ulong)uVar147 >> 0x10) | (byte)((ulong)uVar116 >> 0x10);
      bVar119 = (byte)((ulong)uVar147 >> 0x18) | (byte)((ulong)uVar116 >> 0x18);
      bVar120 = (byte)((ulong)uVar147 >> 0x20) | (byte)((ulong)uVar116 >> 0x20);
      bVar121 = (byte)((ulong)uVar147 >> 0x28) | (byte)((ulong)uVar116 >> 0x28);
      bVar122 = (byte)((ulong)uVar147 >> 0x30) | (byte)((ulong)uVar116 >> 0x30);
      bVar123 = (byte)((ulong)uVar147 >> 0x38) | (byte)((ulong)uVar116 >> 0x38);
      uVar116 = CONCAT17(bVar123,CONCAT16(bVar122,CONCAT15(bVar121,CONCAT14(bVar120,CONCAT13(bVar119
                                                  ,CONCAT12(bVar118,CONCAT11(bVar117,bVar115)))))));
      bVar124 = (byte)uVar148 | (byte)uVar125;
      bVar126 = (byte)((ulong)uVar148 >> 8) | (byte)((ulong)uVar125 >> 8);
      bVar127 = (byte)((ulong)uVar148 >> 0x10) | (byte)((ulong)uVar125 >> 0x10);
      bVar128 = (byte)((ulong)uVar148 >> 0x18) | (byte)((ulong)uVar125 >> 0x18);
      bVar129 = (byte)((ulong)uVar148 >> 0x20) | (byte)((ulong)uVar125 >> 0x20);
      bVar130 = (byte)((ulong)uVar148 >> 0x28) | (byte)((ulong)uVar125 >> 0x28);
      bVar131 = (byte)((ulong)uVar148 >> 0x30) | (byte)((ulong)uVar125 >> 0x30);
      bVar132 = (byte)((ulong)uVar148 >> 0x38) | (byte)((ulong)uVar125 >> 0x38);
      uVar125 = CONCAT17(bVar132,CONCAT16(bVar131,CONCAT15(bVar130,CONCAT14(bVar129,CONCAT13(bVar128
                                                  ,CONCAT12(bVar127,CONCAT11(bVar126,bVar124)))))));
      bVar133 = (byte)uVar149 | (byte)uVar134;
      bVar135 = (byte)((ulong)uVar149 >> 8) | (byte)((ulong)uVar134 >> 8);
      bVar136 = (byte)((ulong)uVar149 >> 0x10) | (byte)((ulong)uVar134 >> 0x10);
      bVar137 = (byte)((ulong)uVar149 >> 0x18) | (byte)((ulong)uVar134 >> 0x18);
      bVar138 = (byte)((ulong)uVar149 >> 0x20) | (byte)((ulong)uVar134 >> 0x20);
      bVar139 = (byte)((ulong)uVar149 >> 0x28) | (byte)((ulong)uVar134 >> 0x28);
      bVar140 = (byte)((ulong)uVar149 >> 0x30) | (byte)((ulong)uVar134 >> 0x30);
      bVar141 = (byte)((ulong)uVar149 >> 0x38) | (byte)((ulong)uVar134 >> 0x38);
      uVar134 = CONCAT17(bVar141,CONCAT16(bVar140,CONCAT15(bVar139,CONCAT14(bVar138,CONCAT13(bVar137
                                                  ,CONCAT12(bVar136,CONCAT11(bVar135,bVar133)))))));
      uVar68 = uVar68 - 8;
      puVar69 = puVar69 + 8;
    } while (uVar68 != 0);
    bVar124 = bVar124 | bVar106 | bVar90 | bVar74;
    bVar126 = bVar126 | bVar108 | bVar91 | bVar75;
    bVar127 = bVar127 | bVar109 | bVar92 | bVar76;
    bVar128 = bVar128 | bVar110 | bVar93 | bVar77;
    bVar129 = bVar129 | bVar111 | bVar94 | bVar78;
    bVar130 = bVar130 | bVar112 | bVar95 | bVar79;
    bVar131 = bVar131 | bVar113 | bVar96 | bVar80;
    bVar132 = bVar132 | bVar114 | bVar97 | bVar81;
    bVar133 = bVar133 | bVar115 | bVar98 | bVar82;
    bVar135 = bVar135 | bVar117 | bVar99 | bVar83;
    bVar136 = bVar136 | bVar118 | bVar100 | bVar84;
    bVar137 = bVar137 | bVar119 | bVar101 | bVar85;
    bVar138 = bVar138 | bVar120 | bVar102 | bVar86;
    bVar139 = bVar139 | bVar121 | bVar103 | bVar87;
    bVar140 = bVar140 | bVar122 | bVar104 | bVar88;
    bVar141 = bVar141 | bVar123 | bVar105 | bVar89;
    auVar6[1] = bVar126;
    auVar6[0] = bVar124;
    auVar6[2] = bVar127;
    auVar6[3] = bVar128;
    auVar6[4] = bVar129;
    auVar6[5] = bVar130;
    auVar6[6] = bVar131;
    auVar6[7] = bVar132;
    auVar6[8] = bVar133;
    auVar6[9] = bVar135;
    auVar6[10] = bVar136;
    auVar6[0xb] = bVar137;
    auVar6[0xc] = bVar138;
    auVar6[0xd] = bVar139;
    auVar6[0xe] = bVar140;
    auVar6[0xf] = bVar141;
    auVar7[1] = bVar126;
    auVar7[0] = bVar124;
    auVar7[2] = bVar127;
    auVar7[3] = bVar128;
    auVar7[4] = bVar129;
    auVar7[5] = bVar130;
    auVar7[6] = bVar131;
    auVar7[7] = bVar132;
    auVar7[8] = bVar133;
    auVar7[9] = bVar135;
    auVar7[10] = bVar136;
    auVar7[0xb] = bVar137;
    auVar7[0xc] = bVar138;
    auVar7[0xd] = bVar139;
    auVar7[0xe] = bVar140;
    auVar7[0xf] = bVar141;
    auVar150 = NEON_ext(auVar6,auVar7,8,1);
    uVar68 = CONCAT17(bVar132 | auVar150[7],
                      CONCAT16(bVar131 | auVar150[6],
                               CONCAT15(bVar130 | auVar150[5],
                                        CONCAT14(bVar129 | auVar150[4],
                                                 CONCAT13(bVar128 | auVar150[3],
                                                          CONCAT12(bVar127 | auVar150[2],
                                                                   CONCAT11(bVar126 | auVar150[1],
                                                                            bVar124 | auVar150[0])))
                                                ))));
    auVar16 = auVar151;
    if (uVar63 != uVar66) {
code_r0x002fc5b0:
      lVar58 = lVar58 - lVar60;
      puVar62 = (ulong *)(lVar61 + lVar60 * 8);
      do {
        uVar68 = *puVar62 | uVar68;
        lVar58 = lVar58 + -1;
        puVar62 = puVar62 + 1;
      } while (lVar58 != 0);
    }
    psVar71 = unaff_x20;
    auVar18 = auVar16;
    if (uVar68 == 0) {
code_r0x002fc5cc:
      uVar107 = auVar18._8_8_;
      plVar72 = auVar18._0_8_;
      plVar70 = (long *)func_0x002a3384(unaff_x24,unaff_x22,uVar107,param_5);
      auVar151 = auVar18;
      if ((int)plVar70 != 0) {
        plVar70 = (long *)func_0x002a3110(unaff_x24,unaff_x24,uVar107,uVar107,param_5);
        psVar55 = psStack_68;
        auVar15._8_8_ = psStack_68;
        auVar15._0_8_ = plVar72;
        auVar14._8_8_ = psStack_68;
        auVar14._0_8_ = plVar72;
        auVar13._8_8_ = psStack_68;
        auVar13._0_8_ = plVar72;
        auVar12._8_8_ = psStack_68;
        auVar12._0_8_ = plVar72;
        auVar11._8_8_ = psStack_68;
        auVar11._0_8_ = plVar72;
        if ((((int)plVar70 != 0) &&
            (plVar70 = (long *)func_0x002a0344(psStack_68,psStack_68,unaff_x24,unaff_x20,param_5),
            auVar151 = auVar11, (int)plVar70 != 0)) &&
           ((uVar134._0_4_ = param_4[4].maxprot, uVar134._4_4_ = param_4[4].initprot,
            plVar70 = (long *)func_0x002a3110(psVar55,psVar55,uVar134,
                                              *(undefined8 *)(param_4[4].segname + 8),param_5),
            auVar151 = auVar12, (int)plVar70 != 0 &&
            ((psVar59 = param_5, plVar70 = (long *)func_0x002a80fc(psVar55,psVar55,plStack_70),
             auVar151 = auVar13, (int)plVar70 != 0 &&
             (psVar56 = unaff_x22, plVar70 = (long *)func_0x0029aefc(psVar55,psVar55),
             auVar151 = auVar14, (int)plVar70 != 0)))))) {
          iVar48 = func_0x0029db84(psStack_68,plVar72);
          psVar71 = unaff_x20;
          if (-1 < iVar48) goto code_r0x002fc6a4;
          uVar49 = func_0x0029bfd4(plVar72);
          unaff_x20 = psStack_68;
          func_0x0029cb94(psStack_68,uVar49);
          plVar70 = (long *)func_0x0029c3cc(unaff_x20,(long)(int)unaff_x25[4]);
          auVar151 = auVar15;
        }
      }
    }
    else {
code_r0x002fc268:
      func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x2a9);
      unaff_x20 = psVar71;
      auVar151 = auVar16;
code_r0x002fc284:
      plVar70 = (long *)0x0;
    }
code_r0x002fc288:
    if ((char)param_5->fileoff != '\0') {
      return plVar70;
    }
    if (*(long *)(param_5->segname + 8) != 0) {
      lVar60 = *(long *)(param_5->segname + 8) + -1;
      *(long *)(param_5->segname + 8) = lVar60;
      param_5->vmsize = *(qword *)(*(long *)param_5->segname + lVar60 * 8);
      return plVar70;
    }
  } while( true );
}

