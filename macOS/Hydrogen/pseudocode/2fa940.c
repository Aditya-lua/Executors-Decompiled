
ulong FUN_002fa940(undefined8 param_1,undefined8 param_2,char *param_3,char *param_4,
                  undefined8 param_5)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  undefined1 *puVar13;
  int iVar14;
  char *pcVar15;
  ulong uVar16;
  undefined8 uVar17;
  code *UNRECOVERED_JUMPTABLE;
  uint uVar18;
  long lVar19;
  long *extraout_x8;
  ulong *puVar20;
  long *plVar21;
  ulong uVar22;
  long extraout_x9;
  long *plVar23;
  long lVar24;
  long extraout_x10;
  long lVar25;
  ulong uVar26;
  uint uVar27;
  ulong uVar28;
  ulong extraout_x12;
  undefined8 *puVar29;
  long extraout_x15;
  long lVar30;
  undefined8 unaff_x19;
  char *unaff_x20;
  char *pcVar31;
  char *unaff_x21;
  undefined8 unaff_x22;
  char *pcVar32;
  char *unaff_x23;
  long lVar33;
  char *unaff_x25;
  char *unaff_x26;
  ulong unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  undefined1 auVar51 [16];
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  undefined8 uVar76;
  byte bVar83;
  byte bVar84;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  undefined8 uVar85;
  byte bVar92;
  byte bVar93;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  byte bVar100;
  undefined8 uVar94;
  byte bVar101;
  undefined8 uVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined8 uVar105;
  undefined8 uVar106;
  undefined8 uVar107;
  undefined8 uVar108;
  undefined8 uVar109;
  undefined1 auVar110 [16];
  
  auVar110._8_8_ = unaff_x22;
  auVar110._0_8_ = unaff_x19;
code_r0x002fa940:
  func_0x0028f83c(param_1,param_2,param_3,param_4,param_5);
  puVar8 = (undefined1 *)register0x00000008;
LAB_002fa870:
  lVar33 = 0;
  puVar9 = puVar8;
  pcVar31 = unaff_x21;
  pcVar32 = unaff_x23;
  pcVar15 = unaff_x26;
code_r0x002fa874:
  if (unaff_x20[0x28] == '\0') {
    puVar10 = puVar9;
    unaff_x21 = pcVar31;
    unaff_x23 = pcVar32;
    unaff_x26 = pcVar15;
    if (*(long *)(unaff_x20 + 0x10) == 0) goto code_r0x002faa28;
    lVar19 = *(long *)(unaff_x20 + 0x10) + -1;
    *(long *)(unaff_x20 + 0x10) = lVar19;
    lVar19 = *(long *)(*(long *)(unaff_x20 + 8) + lVar19 * 8);
    *(long *)(unaff_x20 + 0x20) = lVar19;
    puVar13 = puVar9;
    unaff_x26 = param_3;
    unaff_x21 = param_4;
    if (lVar19 != 0) {
      do {
        uVar76 = auVar110._8_8_;
        uVar17 = auVar110._0_8_;
        auVar110 = func_0x0079db28();
        auVar110._0_8_ = auVar110._0_8_;
        if ((*auVar110._0_8_ != 0) &&
           (UNRECOVERED_JUMPTABLE = *(code **)(*auVar110._0_8_ + 0x48),
           UNRECOVERED_JUMPTABLE != (code *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x002fac94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar16 = (*UNRECOVERED_JUMPTABLE)();
          return uVar16;
        }
        puVar10 = puVar13 + -0x70;
        register0x00000008 = (BADSPACEBASE *)(puVar13 + -0x70);
        puVar12 = puVar13 + -0x70;
        puVar11 = puVar13 + -0x70;
        puVar8 = puVar13 + -0x70;
        *(undefined8 *)(puVar13 + -0x60) = unaff_x28;
        *(ulong *)(puVar13 + -0x58) = unaff_x27;
        *(char **)(puVar13 + -0x50) = pcVar15;
        *(char **)(puVar13 + -0x48) = unaff_x25;
        *(long *)(puVar13 + -0x40) = lVar33;
        *(char **)(puVar13 + -0x38) = pcVar32;
        *(undefined8 *)(puVar13 + -0x30) = uVar76;
        *(char **)(puVar13 + -0x28) = pcVar31;
        *(char **)(puVar13 + -0x20) = unaff_x20;
        *(undefined8 *)(puVar13 + -0x18) = uVar17;
        *(undefined1 **)(puVar13 + -0x10) = unaff_x29;
        *(undefined **)(puVar13 + -8) = &_aws_lc_0_24_0_rsa_private_transform;
        unaff_x29 = puVar13 + -0x10;
        if ((auVar110._0_8_[1] == 0) || (auVar110._0_8_[3] == 0)) {
          func_0x0028f83c(4,0,0x90,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x219);
          return 0;
        }
        *(undefined8 *)(puVar13 + -0x68) = 0;
        param_3 = unaff_x26;
        param_4 = unaff_x21;
        unaff_x20 = (char *)func_0x0036e31c(0x30);
        if (unaff_x20 == (char *)0x0) {
          return 0;
        }
        unaff_x20[8] = '\0';
        unaff_x20[9] = '\0';
        unaff_x20[10] = '\0';
        unaff_x20[0xb] = '\0';
        unaff_x20[0xc] = '\0';
        unaff_x20[0xd] = '\0';
        unaff_x20[0xe] = '\0';
        unaff_x20[0xf] = '\0';
        unaff_x20[0x10] = '\0';
        unaff_x20[0x11] = '\0';
        unaff_x20[0x12] = '\0';
        unaff_x20[0x13] = '\0';
        unaff_x20[0x14] = '\0';
        unaff_x20[0x15] = '\0';
        unaff_x20[0x16] = '\0';
        unaff_x20[0x17] = '\0';
        unaff_x20[0x18] = '\0';
        unaff_x20[0x19] = '\0';
        unaff_x20[0x1a] = '\0';
        unaff_x20[0x1b] = '\0';
        unaff_x20[0x1c] = '\0';
        unaff_x20[0x1d] = '\0';
        unaff_x20[0x1e] = '\0';
        unaff_x20[0x1f] = '\0';
        if (unaff_x20[0x28] == '\0') {
          pcVar32 = *(char **)(unaff_x20 + 0x20);
          lVar33 = func_0x0036e48c(0,0x100);
          if (lVar33 == 0) {
            unaff_x20[0x28] = '\x01';
            unaff_x20[0x29] = '\x01';
          }
          else {
            unaff_x20[0x18] = ' ';
            unaff_x20[0x19] = '\0';
            unaff_x20[0x1a] = '\0';
            unaff_x20[0x1b] = '\0';
            unaff_x20[0x1c] = '\0';
            unaff_x20[0x1d] = '\0';
            unaff_x20[0x1e] = '\0';
            unaff_x20[0x1f] = '\0';
            *(char **)(lVar33 + *(long *)(unaff_x20 + 0x10) * 8) = pcVar32;
            *(long *)(unaff_x20 + 8) = lVar33;
            *(long *)(unaff_x20 + 0x10) = *(long *)(unaff_x20 + 0x10) + 1;
          }
        }
        unaff_x25 = (char *)func_0x0029e340(unaff_x20);
        unaff_x23 = (char *)func_0x0029e340(unaff_x20);
        lVar33 = 0;
        unaff_x27 = 0;
        puVar9 = puVar13 + -0x70;
        pcVar31 = unaff_x21;
        pcVar15 = unaff_x26;
        if ((unaff_x25 == (char *)0x0) ||
           (puVar9 = puVar13 + -0x70, pcVar32 = unaff_x23, unaff_x23 == (char *)0x0))
        goto code_r0x002fa874;
        plVar21 = (long *)auVar110._0_8_[1];
        uVar4 = *(uint *)(plVar21 + 1);
        uVar16 = (ulong)uVar4;
        uVar18 = uVar4 & (int)uVar4 >> 0x1f;
        lVar19 = uVar16 * 8;
        do {
          lVar19 = lVar19 + -8;
          uVar27 = (uint)uVar16;
          uVar16 = (ulong)(uVar27 - 1);
          if ((int)uVar27 < 1) {
            if (-1 < (int)uVar4) {
              uVar18 = 0;
              goto code_r0x002fa80c;
            }
            lVar25 = *plVar21;
            goto code_r0x002fa784;
          }
          lVar25 = *plVar21;
        } while (*(long *)(lVar25 + lVar19) == 0);
        uVar18 = uVar27;
code_r0x002fa784:
        uVar22 = *(ulong *)(lVar25 + (long)(int)(uVar18 - 1) * 8);
        uVar26 = uVar22 >> 0x20;
        uVar16 = uVar26;
        if (uVar26 == 0) {
          uVar16 = uVar22;
        }
        uVar28 = uVar16 >> 0x10;
        uVar1 = uVar28;
        if (uVar28 == 0) {
          uVar1 = uVar16;
        }
        uVar16 = uVar1 >> 8;
        if (uVar1 < 0x100) {
          uVar16 = uVar1;
        }
        uVar2 = uVar16 >> 4;
        if (uVar16 < 0x10) {
          uVar2 = uVar16;
        }
        uVar3 = uVar2 >> 2;
        if (uVar2 < 4) {
          uVar3 = uVar2;
        }
        uVar18 = (uint)(uVar22 != 0) | (uVar18 - 1) * 0x40 | (uint)(uVar26 != 0) << 5 |
                 (uint)(uVar28 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar16) << 2 |
                 (uint)(3 < uVar2) << 1;
        if (1 < uVar3) {
          uVar18 = uVar18 + 1;
        }
        uVar18 = uVar18 + 7 >> 3;
code_r0x002fa80c:
        if ((char *)(ulong)uVar18 == unaff_x21) {
          param_3 = unaff_x25;
          lVar33 = func_0x0029c764(unaff_x26,unaff_x21);
          if (lVar33 != 0) {
            iVar14 = func_0x0029d99c(*(undefined8 *)unaff_x25,(long)*(int *)(unaff_x25 + 8),
                                     *(undefined8 *)auVar110._0_8_[1],
                                     (long)*(int *)((undefined8 *)auVar110._0_8_[1] + 1));
            if (iVar14 < 0) {
              iVar14 = func_0x002fbc24(auVar110._0_8_,unaff_x20);
              if (iVar14 != 0) {
                uVar18 = *(uint *)((long)auVar110._0_8_ + 0x5c) & 0x48;
                unaff_x27 = (ulong)uVar18;
                if ((auVar110._0_8_[2] != 0) || (uVar18 != 0)) {
                  if (uVar18 == 0) {
                    lVar33 = func_0x002fbe28(auVar110._0_8_,puVar13 + -0x68);
                    if (lVar33 == 0) {
                      uVar17 = 0x255;
                      goto code_r0x002faba4;
                    }
                    param_3 = (char *)auVar110._0_8_[2];
                    param_4 = (char *)auVar110._0_8_[0x25];
                    iVar14 = func_0x002f6420(unaff_x25,lVar33,param_3,param_4,unaff_x20);
                    puVar9 = puVar13 + -0x70;
                    if (iVar14 == 0) goto code_r0x002faba8;
                  }
                  else {
                    lVar33 = 0;
                  }
                  plVar21 = (long *)auVar110._0_8_[4];
                  puVar8 = puVar13 + -0x70;
                  if (((((plVar21 != (long *)0x0) &&
                        (plVar23 = (long *)auVar110._0_8_[5], puVar8 = puVar13 + -0x70,
                        plVar23 != (long *)0x0)) &&
                       (puVar8 = puVar13 + -0x70, auVar110._0_8_[2] != 0)) &&
                      ((puVar8 = puVar13 + -0x70, auVar110._0_8_[6] != 0 &&
                       (puVar8 = puVar13 + -0x70, auVar110._0_8_[7] != 0)))) &&
                     ((puVar8 = puVar13 + -0x70, auVar110._0_8_[8] != 0 &&
                      (puVar8 = puVar13 + -0x70, (int)plVar23[2] == 0)))) {
                    lVar19 = (long)(int)*(uint *)(auVar110._0_8_[0x26] + 0x20);
                    lVar25 = (long)(int)*(uint *)(plVar23 + 1);
                    if (*(uint *)(auVar110._0_8_[0x26] + 0x20) < *(uint *)(plVar23 + 1)) {
                      lVar24 = *plVar23;
                      uVar16 = lVar25 - lVar19;
                      puVar10 = puVar13 + -0x70;
                      lVar30 = lVar19;
                      if (7 < uVar16) goto code_r0x002faa2c;
                      uVar22 = 0;
                      puVar10 = puVar13 + -0x70;
                      goto code_r0x002faa90;
                    }
                    goto code_r0x002faaac;
                  }
                  goto code_r0x002faab4;
                }
                param_4 = "/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c";
                param_1 = 4;
                param_2 = 0;
                param_3 = section_00000068.segname + 10;
                param_5 = 0x24e;
                goto code_r0x002fa940;
              }
              param_3 = (char *)((long)&segment_command_00000020.vmsize + 4);
              uVar17 = 0x23e;
            }
            else {
              param_3 = section_00000068.sectname + 0xb;
              uVar17 = 0x239;
            }
            param_4 = "/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c";
            func_0x0028f83c(4,0,param_3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",uVar17);
          }
          unaff_x27 = 0;
          goto LAB_002fa870;
        }
        func_0x0079ee90();
code_r0x002faa28:
        func_0x0079db4c();
        plVar21 = extraout_x8;
        lVar25 = extraout_x9;
        lVar24 = extraout_x10;
        uVar16 = extraout_x12;
        lVar30 = extraout_x15;
code_r0x002faa2c:
        uVar26 = uVar16 & 0xfffffffffffffff8;
        lVar19 = uVar26 + lVar30;
        bVar34 = 0;
        bVar35 = 0;
        bVar36 = 0;
        bVar37 = 0;
        bVar38 = 0;
        bVar39 = 0;
        bVar40 = 0;
        bVar41 = 0;
        bVar42 = 0;
        bVar43 = 0;
        bVar44 = 0;
        bVar45 = 0;
        bVar46 = 0;
        bVar47 = 0;
        bVar48 = 0;
        bVar49 = 0;
        bVar50 = 0;
        bVar52 = 0;
        bVar53 = 0;
        bVar54 = 0;
        bVar55 = 0;
        bVar56 = 0;
        bVar57 = 0;
        bVar58 = 0;
        bVar59 = 0;
        bVar60 = 0;
        bVar61 = 0;
        bVar62 = 0;
        bVar63 = 0;
        bVar64 = 0;
        bVar65 = 0;
        bVar66 = 0;
        uVar17 = 0;
        uVar76 = 0;
        uVar85 = 0;
        uVar94 = 0;
        puVar29 = (undefined8 *)(lVar24 + lVar30 * 8 + 0x20);
        uVar22 = uVar26;
        do {
          uVar103 = puVar29[-3];
          uVar102 = puVar29[-4];
          uVar105 = puVar29[-1];
          uVar104 = puVar29[-2];
          uVar107 = puVar29[1];
          uVar106 = *puVar29;
          uVar109 = puVar29[3];
          uVar108 = puVar29[2];
          bVar34 = (byte)uVar102 | bVar34;
          bVar35 = (byte)((ulong)uVar102 >> 8) | bVar35;
          bVar36 = (byte)((ulong)uVar102 >> 0x10) | bVar36;
          bVar37 = (byte)((ulong)uVar102 >> 0x18) | bVar37;
          bVar38 = (byte)((ulong)uVar102 >> 0x20) | bVar38;
          bVar39 = (byte)((ulong)uVar102 >> 0x28) | bVar39;
          bVar40 = (byte)((ulong)uVar102 >> 0x30) | bVar40;
          bVar41 = (byte)((ulong)uVar102 >> 0x38) | bVar41;
          bVar42 = (byte)uVar103 | bVar42;
          bVar43 = (byte)((ulong)uVar103 >> 8) | bVar43;
          bVar44 = (byte)((ulong)uVar103 >> 0x10) | bVar44;
          bVar45 = (byte)((ulong)uVar103 >> 0x18) | bVar45;
          bVar46 = (byte)((ulong)uVar103 >> 0x20) | bVar46;
          bVar47 = (byte)((ulong)uVar103 >> 0x28) | bVar47;
          bVar48 = (byte)((ulong)uVar103 >> 0x30) | bVar48;
          bVar49 = (byte)((ulong)uVar103 >> 0x38) | bVar49;
          bVar50 = (byte)uVar104 | bVar50;
          bVar52 = (byte)((ulong)uVar104 >> 8) | bVar52;
          bVar53 = (byte)((ulong)uVar104 >> 0x10) | bVar53;
          bVar54 = (byte)((ulong)uVar104 >> 0x18) | bVar54;
          bVar55 = (byte)((ulong)uVar104 >> 0x20) | bVar55;
          bVar56 = (byte)((ulong)uVar104 >> 0x28) | bVar56;
          bVar57 = (byte)((ulong)uVar104 >> 0x30) | bVar57;
          bVar58 = (byte)((ulong)uVar104 >> 0x38) | bVar58;
          bVar59 = (byte)uVar105 | bVar59;
          bVar60 = (byte)((ulong)uVar105 >> 8) | bVar60;
          bVar61 = (byte)((ulong)uVar105 >> 0x10) | bVar61;
          bVar62 = (byte)((ulong)uVar105 >> 0x18) | bVar62;
          bVar63 = (byte)((ulong)uVar105 >> 0x20) | bVar63;
          bVar64 = (byte)((ulong)uVar105 >> 0x28) | bVar64;
          bVar65 = (byte)((ulong)uVar105 >> 0x30) | bVar65;
          bVar66 = (byte)((ulong)uVar105 >> 0x38) | bVar66;
          bVar67 = (byte)uVar106 | (byte)uVar17;
          bVar68 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar17 >> 8);
          bVar69 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar17 >> 0x10);
          bVar70 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar17 >> 0x18);
          bVar71 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar17 >> 0x20);
          bVar72 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar17 >> 0x28);
          bVar73 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar17 >> 0x30);
          bVar74 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar17 >> 0x38);
          uVar17 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))));
          bVar75 = (byte)uVar107 | (byte)uVar76;
          bVar77 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar76 >> 8);
          bVar78 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
          bVar79 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
          bVar80 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
          bVar81 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
          bVar82 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
          bVar83 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
          uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79,
                                                  CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))));
          bVar84 = (byte)uVar108 | (byte)uVar85;
          bVar86 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar85 >> 8);
          bVar87 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar85 >> 0x10);
          bVar88 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar85 >> 0x18);
          bVar89 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar85 >> 0x20);
          bVar90 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar85 >> 0x28);
          bVar91 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar85 >> 0x30);
          bVar92 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar85 >> 0x38);
          uVar85 = CONCAT17(bVar92,CONCAT16(bVar91,CONCAT15(bVar90,CONCAT14(bVar89,CONCAT13(bVar88,
                                                  CONCAT12(bVar87,CONCAT11(bVar86,bVar84)))))));
          bVar93 = (byte)uVar109 | (byte)uVar94;
          bVar95 = (byte)((ulong)uVar109 >> 8) | (byte)((ulong)uVar94 >> 8);
          bVar96 = (byte)((ulong)uVar109 >> 0x10) | (byte)((ulong)uVar94 >> 0x10);
          bVar97 = (byte)((ulong)uVar109 >> 0x18) | (byte)((ulong)uVar94 >> 0x18);
          bVar98 = (byte)((ulong)uVar109 >> 0x20) | (byte)((ulong)uVar94 >> 0x20);
          bVar99 = (byte)((ulong)uVar109 >> 0x28) | (byte)((ulong)uVar94 >> 0x28);
          bVar100 = (byte)((ulong)uVar109 >> 0x30) | (byte)((ulong)uVar94 >> 0x30);
          bVar101 = (byte)((ulong)uVar109 >> 0x38) | (byte)((ulong)uVar94 >> 0x38);
          uVar94 = CONCAT17(bVar101,CONCAT16(bVar100,CONCAT15(bVar99,CONCAT14(bVar98,CONCAT13(bVar97
                                                  ,CONCAT12(bVar96,CONCAT11(bVar95,bVar93)))))));
          uVar22 = uVar22 - 8;
          puVar29 = puVar29 + 8;
        } while (uVar22 != 0);
        bVar84 = bVar84 | bVar67 | bVar50 | bVar34;
        bVar86 = bVar86 | bVar68 | bVar52 | bVar35;
        bVar87 = bVar87 | bVar69 | bVar53 | bVar36;
        bVar88 = bVar88 | bVar70 | bVar54 | bVar37;
        bVar89 = bVar89 | bVar71 | bVar55 | bVar38;
        bVar90 = bVar90 | bVar72 | bVar56 | bVar39;
        bVar91 = bVar91 | bVar73 | bVar57 | bVar40;
        bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
        bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
        bVar95 = bVar95 | bVar77 | bVar60 | bVar43;
        bVar96 = bVar96 | bVar78 | bVar61 | bVar44;
        bVar97 = bVar97 | bVar79 | bVar62 | bVar45;
        bVar98 = bVar98 | bVar80 | bVar63 | bVar46;
        bVar99 = bVar99 | bVar81 | bVar64 | bVar47;
        bVar100 = bVar100 | bVar82 | bVar65 | bVar48;
        bVar101 = bVar101 | bVar83 | bVar66 | bVar49;
        auVar51[1] = bVar86;
        auVar51[0] = bVar84;
        auVar51[2] = bVar87;
        auVar51[3] = bVar88;
        auVar51[4] = bVar89;
        auVar51[5] = bVar90;
        auVar51[6] = bVar91;
        auVar51[7] = bVar92;
        auVar51[8] = bVar93;
        auVar51[9] = bVar95;
        auVar51[10] = bVar96;
        auVar51[0xb] = bVar97;
        auVar51[0xc] = bVar98;
        auVar51[0xd] = bVar99;
        auVar51[0xe] = bVar100;
        auVar51[0xf] = bVar101;
        auVar7[1] = bVar86;
        auVar7[0] = bVar84;
        auVar7[2] = bVar87;
        auVar7[3] = bVar88;
        auVar7[4] = bVar89;
        auVar7[5] = bVar90;
        auVar7[6] = bVar91;
        auVar7[7] = bVar92;
        auVar7[8] = bVar93;
        auVar7[9] = bVar95;
        auVar7[10] = bVar96;
        auVar7[0xb] = bVar97;
        auVar7[0xc] = bVar98;
        auVar7[0xd] = bVar99;
        auVar7[0xe] = bVar100;
        auVar7[0xf] = bVar101;
        auVar51 = NEON_ext(auVar51,auVar7,8,1);
        uVar22 = CONCAT17(bVar92 | auVar51[7],
                          CONCAT16(bVar91 | auVar51[6],
                                   CONCAT15(bVar90 | auVar51[5],
                                            CONCAT14(bVar89 | auVar51[4],
                                                     CONCAT13(bVar88 | auVar51[3],
                                                              CONCAT12(bVar87 | auVar51[2],
                                                                       CONCAT11(bVar86 | auVar51[1],
                                                                                bVar84 | auVar51[0])
                                                                      ))))));
        puVar11 = puVar10;
        if (uVar16 != uVar26) {
code_r0x002faa90:
          lVar25 = lVar25 - lVar19;
          puVar20 = (ulong *)(lVar24 + lVar19 * 8);
          do {
            uVar22 = *puVar20 | uVar22;
            lVar25 = lVar25 + -1;
            puVar11 = puVar10;
            puVar20 = puVar20 + 1;
          } while (lVar25 != 0);
        }
        puVar8 = puVar11;
        if (uVar22 == 0) {
code_r0x002faaac:
          param_3 = auVar110._0_8_;
          puVar8 = puVar11;
          if ((int)plVar21[2] != 0) goto code_r0x002faab4;
          lVar19 = (long)(int)*(uint *)(*(long *)(param_3 + 0x138) + 0x20);
          uVar18 = *(uint *)(plVar21 + 1);
          if (*(uint *)(*(long *)(param_3 + 0x138) + 0x20) < uVar18) {
            uVar16 = (int)uVar18 - lVar19;
            if (uVar16 < 8) {
              uVar22 = 0;
              lVar25 = lVar19;
code_r0x002fac44:
              lVar19 = (int)uVar18 - lVar25;
              puVar20 = (ulong *)(*plVar21 + lVar25 * 8);
              do {
                uVar22 = *puVar20 | uVar22;
                lVar19 = lVar19 + -1;
                puVar20 = puVar20 + 1;
              } while (lVar19 != 0);
            }
            else {
              uVar26 = uVar16 & 0xfffffffffffffff8;
              lVar25 = uVar26 + lVar19;
              bVar34 = 0;
              bVar35 = 0;
              bVar36 = 0;
              bVar37 = 0;
              bVar38 = 0;
              bVar39 = 0;
              bVar40 = 0;
              bVar41 = 0;
              bVar42 = 0;
              bVar43 = 0;
              bVar44 = 0;
              bVar45 = 0;
              bVar46 = 0;
              bVar47 = 0;
              bVar48 = 0;
              bVar49 = 0;
              bVar50 = 0;
              bVar52 = 0;
              bVar53 = 0;
              bVar54 = 0;
              bVar55 = 0;
              bVar56 = 0;
              bVar57 = 0;
              bVar58 = 0;
              bVar59 = 0;
              bVar60 = 0;
              bVar61 = 0;
              bVar62 = 0;
              bVar63 = 0;
              bVar64 = 0;
              bVar65 = 0;
              bVar66 = 0;
              uVar17 = 0;
              uVar76 = 0;
              uVar85 = 0;
              uVar94 = 0;
              puVar29 = (undefined8 *)(*plVar21 + lVar19 * 8 + 0x20);
              uVar22 = uVar26;
              do {
                uVar103 = puVar29[-3];
                uVar102 = puVar29[-4];
                uVar105 = puVar29[-1];
                uVar104 = puVar29[-2];
                uVar107 = puVar29[1];
                uVar106 = *puVar29;
                uVar109 = puVar29[3];
                uVar108 = puVar29[2];
                bVar34 = (byte)uVar102 | bVar34;
                bVar35 = (byte)((ulong)uVar102 >> 8) | bVar35;
                bVar36 = (byte)((ulong)uVar102 >> 0x10) | bVar36;
                bVar37 = (byte)((ulong)uVar102 >> 0x18) | bVar37;
                bVar38 = (byte)((ulong)uVar102 >> 0x20) | bVar38;
                bVar39 = (byte)((ulong)uVar102 >> 0x28) | bVar39;
                bVar40 = (byte)((ulong)uVar102 >> 0x30) | bVar40;
                bVar41 = (byte)((ulong)uVar102 >> 0x38) | bVar41;
                bVar42 = (byte)uVar103 | bVar42;
                bVar43 = (byte)((ulong)uVar103 >> 8) | bVar43;
                bVar44 = (byte)((ulong)uVar103 >> 0x10) | bVar44;
                bVar45 = (byte)((ulong)uVar103 >> 0x18) | bVar45;
                bVar46 = (byte)((ulong)uVar103 >> 0x20) | bVar46;
                bVar47 = (byte)((ulong)uVar103 >> 0x28) | bVar47;
                bVar48 = (byte)((ulong)uVar103 >> 0x30) | bVar48;
                bVar49 = (byte)((ulong)uVar103 >> 0x38) | bVar49;
                bVar50 = (byte)uVar104 | bVar50;
                bVar52 = (byte)((ulong)uVar104 >> 8) | bVar52;
                bVar53 = (byte)((ulong)uVar104 >> 0x10) | bVar53;
                bVar54 = (byte)((ulong)uVar104 >> 0x18) | bVar54;
                bVar55 = (byte)((ulong)uVar104 >> 0x20) | bVar55;
                bVar56 = (byte)((ulong)uVar104 >> 0x28) | bVar56;
                bVar57 = (byte)((ulong)uVar104 >> 0x30) | bVar57;
                bVar58 = (byte)((ulong)uVar104 >> 0x38) | bVar58;
                bVar59 = (byte)uVar105 | bVar59;
                bVar60 = (byte)((ulong)uVar105 >> 8) | bVar60;
                bVar61 = (byte)((ulong)uVar105 >> 0x10) | bVar61;
                bVar62 = (byte)((ulong)uVar105 >> 0x18) | bVar62;
                bVar63 = (byte)((ulong)uVar105 >> 0x20) | bVar63;
                bVar64 = (byte)((ulong)uVar105 >> 0x28) | bVar64;
                bVar65 = (byte)((ulong)uVar105 >> 0x30) | bVar65;
                bVar66 = (byte)((ulong)uVar105 >> 0x38) | bVar66;
                bVar67 = (byte)uVar106 | (byte)uVar17;
                bVar68 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar17 >> 8);
                bVar69 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar17 >> 0x10);
                bVar70 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar17 >> 0x18);
                bVar71 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar17 >> 0x20);
                bVar72 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar17 >> 0x28);
                bVar73 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar17 >> 0x30);
                bVar74 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar17 >> 0x38);
                uVar17 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(
                                                  bVar70,CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))
                                                 ));
                bVar75 = (byte)uVar107 | (byte)uVar76;
                bVar77 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar76 >> 8);
                bVar78 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
                bVar79 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
                bVar80 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
                bVar81 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
                bVar82 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
                bVar83 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
                uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(
                                                  bVar79,CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))
                                                 ));
                bVar84 = (byte)uVar108 | (byte)uVar85;
                bVar86 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar85 >> 8);
                bVar87 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar85 >> 0x10);
                bVar88 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar85 >> 0x18);
                bVar89 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar85 >> 0x20);
                bVar90 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar85 >> 0x28);
                bVar91 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar85 >> 0x30);
                bVar92 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar85 >> 0x38);
                uVar85 = CONCAT17(bVar92,CONCAT16(bVar91,CONCAT15(bVar90,CONCAT14(bVar89,CONCAT13(
                                                  bVar88,CONCAT12(bVar87,CONCAT11(bVar86,bVar84)))))
                                                 ));
                bVar93 = (byte)uVar109 | (byte)uVar94;
                bVar95 = (byte)((ulong)uVar109 >> 8) | (byte)((ulong)uVar94 >> 8);
                bVar96 = (byte)((ulong)uVar109 >> 0x10) | (byte)((ulong)uVar94 >> 0x10);
                bVar97 = (byte)((ulong)uVar109 >> 0x18) | (byte)((ulong)uVar94 >> 0x18);
                bVar98 = (byte)((ulong)uVar109 >> 0x20) | (byte)((ulong)uVar94 >> 0x20);
                bVar99 = (byte)((ulong)uVar109 >> 0x28) | (byte)((ulong)uVar94 >> 0x28);
                bVar100 = (byte)((ulong)uVar109 >> 0x30) | (byte)((ulong)uVar94 >> 0x30);
                bVar101 = (byte)((ulong)uVar109 >> 0x38) | (byte)((ulong)uVar94 >> 0x38);
                uVar94 = CONCAT17(bVar101,CONCAT16(bVar100,CONCAT15(bVar99,CONCAT14(bVar98,CONCAT13(
                                                  bVar97,CONCAT12(bVar96,CONCAT11(bVar95,bVar93)))))
                                                  ));
                uVar22 = uVar22 - 8;
                puVar29 = puVar29 + 8;
              } while (uVar22 != 0);
              bVar84 = bVar84 | bVar67 | bVar50 | bVar34;
              bVar86 = bVar86 | bVar68 | bVar52 | bVar35;
              bVar87 = bVar87 | bVar69 | bVar53 | bVar36;
              bVar88 = bVar88 | bVar70 | bVar54 | bVar37;
              bVar89 = bVar89 | bVar71 | bVar55 | bVar38;
              bVar90 = bVar90 | bVar72 | bVar56 | bVar39;
              bVar91 = bVar91 | bVar73 | bVar57 | bVar40;
              bVar92 = bVar92 | bVar74 | bVar58 | bVar41;
              bVar93 = bVar93 | bVar75 | bVar59 | bVar42;
              bVar95 = bVar95 | bVar77 | bVar60 | bVar43;
              bVar96 = bVar96 | bVar78 | bVar61 | bVar44;
              bVar97 = bVar97 | bVar79 | bVar62 | bVar45;
              bVar98 = bVar98 | bVar80 | bVar63 | bVar46;
              bVar99 = bVar99 | bVar81 | bVar64 | bVar47;
              bVar100 = bVar100 | bVar82 | bVar65 | bVar48;
              bVar101 = bVar101 | bVar83 | bVar66 | bVar49;
              auVar5[1] = bVar86;
              auVar5[0] = bVar84;
              auVar5[2] = bVar87;
              auVar5[3] = bVar88;
              auVar5[4] = bVar89;
              auVar5[5] = bVar90;
              auVar5[6] = bVar91;
              auVar5[7] = bVar92;
              auVar5[8] = bVar93;
              auVar5[9] = bVar95;
              auVar5[10] = bVar96;
              auVar5[0xb] = bVar97;
              auVar5[0xc] = bVar98;
              auVar5[0xd] = bVar99;
              auVar5[0xe] = bVar100;
              auVar5[0xf] = bVar101;
              auVar6[1] = bVar86;
              auVar6[0] = bVar84;
              auVar6[2] = bVar87;
              auVar6[3] = bVar88;
              auVar6[4] = bVar89;
              auVar6[5] = bVar90;
              auVar6[6] = bVar91;
              auVar6[7] = bVar92;
              auVar6[8] = bVar93;
              auVar6[9] = bVar95;
              auVar6[10] = bVar96;
              auVar6[0xb] = bVar97;
              auVar6[0xc] = bVar98;
              auVar6[0xd] = bVar99;
              auVar6[0xe] = bVar100;
              auVar6[0xf] = bVar101;
              auVar51 = NEON_ext(auVar5,auVar6,8,1);
              uVar22 = CONCAT17(bVar92 | auVar51[7],
                                CONCAT16(bVar91 | auVar51[6],
                                         CONCAT15(bVar90 | auVar51[5],
                                                  CONCAT14(bVar89 | auVar51[4],
                                                           CONCAT13(bVar88 | auVar51[3],
                                                                    CONCAT12(bVar87 | auVar51[2],
                                                                             CONCAT11(bVar86 | 
                                                  auVar51[1],bVar84 | auVar51[0])))))));
              if (uVar16 != uVar26) goto code_r0x002fac44;
            }
            if (uVar22 != 0) goto code_r0x002faab4;
          }
          param_4 = unaff_x20;
          iVar14 = func_0x002fc108(unaff_x23,unaff_x25);
          puVar9 = puVar11;
          pcVar31 = unaff_x21;
          pcVar32 = unaff_x23;
        }
        else {
code_r0x002faab4:
          lVar19 = auVar110._0_8_;
          param_3 = *(char **)(lVar19 + 0x140);
          param_4 = *(char **)(lVar19 + 8);
          iVar14 = func_0x002a42a0(unaff_x23,unaff_x25,param_3,param_4,unaff_x20,
                                   *(undefined8 *)(lVar19 + 0x128));
          puVar9 = puVar8;
          pcVar31 = unaff_x21;
          pcVar32 = unaff_x23;
        }
        pcVar15 = unaff_x26;
        if (iVar14 == 0) goto code_r0x002faba8;
        lVar19 = auVar110._0_8_;
        puVar12 = puVar9;
        unaff_x21 = pcVar31;
        unaff_x23 = pcVar32;
        if (*(long *)(lVar19 + 0x10) != 0) {
          pcVar15 = (char *)func_0x0029e340(unaff_x20);
          if (pcVar15 != (char *)0x0) {
            param_4 = *(char **)(lVar19 + 8);
            param_3 = *(char **)(lVar19 + 0x10);
            iVar14 = func_0x002a27b4(pcVar15,pcVar32,param_3,param_4,unaff_x20,
                                     *(undefined8 *)(lVar19 + 0x128));
            unaff_x26 = pcVar15;
            if ((iVar14 != 0) && (iVar14 = func_0x0029df9c(pcVar15,unaff_x25), iVar14 != 0))
            goto code_r0x002fab14;
          }
          uVar17 = 0x27c;
          goto code_r0x002faba4;
        }
code_r0x002fab14:
        unaff_x26 = param_3;
        if ((int)unaff_x27 == 0) {
          param_4 = *(char **)(lVar19 + 0x128);
          param_3 = *(char **)(lVar33 + 8);
          iVar14 = func_0x002a3110(pcVar32,pcVar32,param_3,param_4,unaff_x20);
          unaff_x26 = param_3;
          if (iVar14 == 0) goto code_r0x002faba8;
        }
        if (*(int *)(pcVar32 + 8) == *(int *)(*(long *)(lVar19 + 0x128) + 0x20))
        goto code_r0x002fab48;
        func_0x0079ee68();
        puVar13 = puVar9;
        unaff_x21 = param_4;
      } while( true );
    }
  }
  func_0x00373520(*(undefined8 *)unaff_x20,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
  func_0x0036e3d8(*(undefined8 *)(unaff_x20 + 8));
  func_0x0036e3d8(unaff_x20);
  if (lVar33 != 0) {
    lVar19 = *(long *)(puVar9 + 8);
    if (lVar19 == 0x400) {
      func_0x002f636c(lVar33);
    }
    else {
      lVar33 = auVar110._0_8_ + 0x60;
      func_0x00373dd4(lVar33);
      *(undefined1 *)(*(long *)(auVar110._0_8_ + 0x170) + lVar19) = 0;
      func_0x00373e0c(lVar33);
    }
  }
  return unaff_x27;
code_r0x002fab48:
  func_0x0029cb94(pcVar32,pcVar31);
  param_3 = pcVar32;
  iVar14 = func_0x0029d578(auVar110._8_8_,pcVar31);
  if (iVar14 == 0) {
    uVar17 = 0x28e;
    unaff_x26 = pcVar15;
code_r0x002faba4:
    param_4 = "/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c";
    param_3 = (char *)((long)&segment_command_00000020.vmsize + 4);
    func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",uVar17);
    puVar9 = puVar12;
    pcVar31 = unaff_x21;
    pcVar32 = unaff_x23;
    pcVar15 = unaff_x26;
code_r0x002faba8:
    unaff_x27 = 0;
  }
  else {
    unaff_x27 = 1;
  }
  goto code_r0x002fa874;
}

