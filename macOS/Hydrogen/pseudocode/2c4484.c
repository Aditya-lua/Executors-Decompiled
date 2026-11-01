
/* WARNING: Possible PIC construction at 0x002c4c4c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002c4c50) */
/* WARNING: Removing unreachable block (ram,0x002c48ec) */
/* WARNING: Type propagation algorithm not settling */

long * FUN_002c4484(undefined8 param_1,ulong param_2,qword *param_3,qword *param_4,
                   undefined8 param_5,undefined8 param_6)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined1 *puVar14;
  bool bVar15;
  int iVar16;
  ulong *puVar17;
  ulong *puVar18;
  long *plVar19;
  qword *pqVar20;
  qword *pqVar21;
  char *pcVar22;
  qword *pqVar23;
  undefined8 uVar24;
  char *pcVar25;
  char *pcVar26;
  undefined8 uVar27;
  int in_w8;
  uint uVar28;
  ulong uVar29;
  ulong uVar30;
  long lVar31;
  undefined1 (*pauVar32) [16];
  uint uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  qword *unaff_x22;
  qword *pqVar36;
  char *unaff_x23;
  qword *unaff_x24;
  char *unaff_x25;
  undefined8 unaff_x26;
  undefined1 *unaff_x29;
  undefined *puVar37;
  undefined1 uVar38;
  byte bVar39;
  undefined1 uVar40;
  byte bVar41;
  undefined1 uVar42;
  byte bVar43;
  undefined1 uVar44;
  byte bVar45;
  undefined1 uVar46;
  byte bVar47;
  undefined1 uVar48;
  byte bVar49;
  undefined1 uVar50;
  byte bVar51;
  undefined1 uVar52;
  byte bVar53;
  undefined1 uVar54;
  byte bVar55;
  undefined1 uVar56;
  byte bVar57;
  undefined1 uVar58;
  byte bVar59;
  undefined1 uVar60;
  byte bVar61;
  undefined1 uVar62;
  byte bVar63;
  undefined1 uVar64;
  byte bVar65;
  undefined1 uVar66;
  byte bVar67;
  undefined1 uVar68;
  byte bVar69;
  byte bVar70;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  long lVar71;
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
  undefined1 uVar103;
  byte bVar104;
  undefined1 uVar105;
  byte bVar106;
  undefined1 uVar107;
  byte bVar108;
  undefined1 uVar109;
  byte bVar110;
  undefined1 uVar111;
  byte bVar112;
  undefined1 uVar113;
  byte bVar114;
  undefined1 uVar115;
  byte bVar116;
  undefined1 uVar117;
  byte bVar118;
  undefined1 uVar119;
  byte bVar120;
  undefined1 uVar121;
  byte bVar122;
  undefined1 uVar123;
  byte bVar124;
  undefined1 uVar125;
  byte bVar126;
  undefined1 uVar127;
  byte bVar128;
  undefined1 uVar129;
  byte bVar130;
  undefined1 uVar131;
  byte bVar132;
  undefined1 uVar133;
  byte bVar134;
  undefined1 uVar135;
  undefined1 uVar136;
  undefined1 uVar137;
  undefined1 uVar138;
  undefined1 uVar139;
  undefined1 uVar140;
  undefined1 uVar141;
  undefined1 uVar142;
  undefined1 uVar143;
  undefined1 uVar144;
  undefined1 uVar145;
  undefined1 uVar146;
  undefined1 uVar147;
  undefined1 uVar148;
  undefined1 uVar149;
  undefined1 uVar150;
  undefined1 auVar151 [16];
  undefined1 auVar152 [16];
  undefined1 auVar153 [16];
  undefined1 auVar154 [16];
  
  auVar151._8_8_ = unaff_x19;
  auVar151._0_8_ = unaff_x20;
  uVar29 = *(ulong *)(*(long *)(unaff_x20 + 0x100) + (long)(in_w8 + -1) * 8);
  uVar34 = uVar29 >> 0x20;
  uVar30 = uVar34;
  if (uVar34 == 0) {
    uVar30 = uVar29;
  }
  uVar35 = uVar30 >> 0x10;
  uVar1 = uVar35;
  if (uVar35 == 0) {
    uVar1 = uVar30;
  }
  uVar30 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar30 = uVar1;
  }
  uVar2 = uVar30 >> 4;
  if (uVar30 < 0x10) {
    uVar2 = uVar30;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar28 = (uint)(uVar29 != 0) | (in_w8 + -1) * 0x40 | (uint)(uVar34 != 0) << 5 |
           (uint)(uVar35 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar30) << 2 |
           (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar28 = uVar28 + 1;
  }
  if ((qword *)(ulong)(uVar28 + 7 >> 3) != param_4) {
    uVar24 = 0x40;
    goto code_r0x002c45e4;
  }
  if ((undefined1 *)(param_2 * 8) < param_4) {
    puVar37 = &DAT_002c46dc;
    auVar152 = _abort();
    auVar153._8_8_ = param_6;
    auVar153._0_8_ = param_5;
    puVar14 = (undefined1 *)register0x00000008;
    do {
      pqVar36 = auVar153._8_8_;
      pcVar26 = auVar153._0_8_;
      auVar154._8_8_ = auVar151._0_8_;
      auVar154._0_8_ = auVar151._8_8_;
      plVar19 = auVar152._0_8_;
      *(undefined8 *)(puVar14 + -0x50) = unaff_x26;
      *(char **)(puVar14 + -0x48) = unaff_x25;
      *(qword **)(puVar14 + -0x40) = unaff_x24;
      *(char **)(puVar14 + -0x38) = unaff_x23;
      *(qword **)(puVar14 + -0x30) = unaff_x22;
      *(long **)(puVar14 + -0x28) = unaff_x21;
      *(undefined1 (*) [16])(puVar14 + -0x20) = auVar151;
      *(undefined1 **)(puVar14 + -0x10) = unaff_x29;
      *(undefined **)(puVar14 + -8) = puVar37;
      pqVar23 = (qword *)(puVar14 + -0x2a0);
      pqVar21 = (qword *)(puVar14 + -0x2a0);
      *(undefined8 *)(puVar14 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
      *auVar152._8_8_ = 0;
      if (*(int *)((long)plVar19 + 0x214) == 0) {
        pqVar23 = param_4;
        func_0x0079e818();
        param_4 = param_3;
        pcVar25 = pcVar26;
        auVar152 = auVar154;
code_r0x002c4bbc:
        auVar153._8_8_ = unaff_x22;
        auVar153._0_8_ = unaff_x23;
        ___stack_chk_fail();
      }
      else {
        uVar4 = *(uint *)(plVar19 + 0x21);
        uVar30 = (ulong)uVar4;
        uVar28 = uVar4 & (int)uVar4 >> 0x1f;
        lVar71 = uVar30 * 8;
        do {
          lVar71 = lVar71 + -8;
          uVar33 = (uint)uVar30;
          uVar30 = (ulong)(uVar33 - 1);
          unaff_x24 = param_3;
          if ((int)uVar33 < 1) {
            if (-1 < (int)uVar4) goto code_r0x002c47f0;
            lVar31 = plVar19[0x20];
            goto code_r0x002c4768;
          }
          lVar31 = plVar19[0x20];
        } while (*(long *)(lVar31 + lVar71) == 0);
        uVar28 = uVar33;
code_r0x002c4768:
        uVar29 = *(ulong *)(lVar31 + (long)(int)(uVar28 - 1) * 8);
        uVar34 = uVar29 >> 0x20;
        uVar30 = uVar34;
        if (uVar34 == 0) {
          uVar30 = uVar29;
        }
        uVar35 = uVar30 >> 0x10;
        uVar1 = uVar35;
        if (uVar35 == 0) {
          uVar1 = uVar30;
        }
        uVar30 = uVar1 >> 8;
        if (uVar1 < 0x100) {
          uVar30 = uVar1;
        }
        uVar2 = uVar30 >> 4;
        if (uVar30 < 0x10) {
          uVar2 = uVar30;
        }
        uVar3 = uVar2 >> 2;
        if (uVar2 < 4) {
          uVar3 = uVar2;
        }
        uVar28 = (uint)(uVar29 != 0) | (uVar28 - 1) * 0x40 | (uint)(uVar34 != 0) << 5 |
                 (uint)(uVar35 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar30) << 2 |
                 (uint)(3 < uVar2) << 1;
        if (1 < uVar3) {
          uVar28 = uVar28 + 1;
        }
        if (uVar28 < 0xa0) {
code_r0x002c47f0:
          pcVar22 = "/aws-lc/crypto/fipsmodule/ecdsa/ecdsa.c";
          uVar24 = 0x1a;
          pqVar20 = (qword *)(section_00000068.sectname + 8);
          pcVar25 = section_000000b8.segname + 0xf;
code_r0x002c4808:
          func_0x0028f83c(uVar24,0,pqVar20,pcVar22,pcVar25);
code_r0x002c480c:
          pqVar21 = pqVar20;
          unaff_x21 = (long *)0x0;
code_r0x002c4810:
          param_4 = pqVar21;
          pqVar23 = (qword *)pcVar22;
          unaff_x22 = pqVar36;
          unaff_x23 = pcVar26;
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar14 + -0x58)) {
            return unaff_x21;
          }
          goto code_r0x002c4bbc;
        }
        if (param_4 == (qword *)0x0) {
          pcVar22 = "/aws-lc/crypto/fipsmodule/ec/ec.c";
          pqVar21 = (qword *)((long)&segment_command_00000020.vmsize + 3);
          pcVar25 = (char *)((long)&section_00000388.flags + 2);
          func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3ca);
          unaff_x21 = (long *)0x0;
          goto code_r0x002c4810;
        }
        pcVar22 = (char *)param_4;
        pcVar25 = pcVar26;
        (**(code **)(*plVar19 + 0x28))(plVar19,puVar14 + -0x1c8,param_4);
        iVar16 = func_0x002c7cd4(plVar19,puVar14 + -0x1c8);
        if (iVar16 == 0) {
          pcVar22 = "/aws-lc/crypto/fipsmodule/ec/ec.c";
          uVar24 = 0xf;
          pqVar20 = (qword *)((long)&segment_command_00000020.vmsize + 4);
          pcVar25 = (char *)((long)&section_00000388.reserved3 + 2);
          goto code_r0x002c4808;
        }
        pqVar20 = (qword *)(puVar14 + -0x1c8);
        iVar16 = func_0x002ca7ac(plVar19,puVar14 + -0x210);
        if (iVar16 == 0) goto code_r0x002c480c;
        uVar28 = *(uint *)(plVar19 + 0x21);
        uVar30 = (ulong)uVar28;
        if ((int)uVar28 < 1) {
code_r0x002c4b1c:
          pqVar21 = pqVar20;
          unaff_x21 = (long *)0x0;
          *auVar152._8_8_ = 1;
          goto code_r0x002c4810;
        }
        if (uVar28 < 8) {
          uVar34 = 0;
          uVar29 = 0;
code_r0x002c4950:
          lVar71 = uVar30 - uVar34;
          puVar18 = (ulong *)(puVar14 + uVar34 * 8 + -0x210);
          do {
            uVar29 = *puVar18 | uVar29;
            lVar71 = lVar71 + -1;
            puVar18 = puVar18 + 1;
          } while (lVar71 != 0);
        }
        else {
          uVar34 = uVar30 & 0xfffffff8;
          bVar39 = 0;
          bVar41 = 0;
          bVar43 = 0;
          bVar45 = 0;
          bVar47 = 0;
          bVar49 = 0;
          bVar51 = 0;
          bVar53 = 0;
          bVar55 = 0;
          bVar57 = 0;
          bVar59 = 0;
          bVar61 = 0;
          bVar63 = 0;
          bVar65 = 0;
          bVar67 = 0;
          bVar69 = 0;
          bVar70 = 0;
          bVar72 = 0;
          bVar73 = 0;
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
          uVar24 = 0;
          uVar27 = 0;
          bVar104 = 0;
          bVar106 = 0;
          bVar108 = 0;
          bVar110 = 0;
          bVar112 = 0;
          bVar114 = 0;
          bVar116 = 0;
          bVar118 = 0;
          bVar120 = 0;
          bVar122 = 0;
          bVar124 = 0;
          bVar126 = 0;
          bVar128 = 0;
          bVar130 = 0;
          bVar132 = 0;
          bVar134 = 0;
          pauVar32 = (undefined1 (*) [16])(puVar14 + -0x1f0);
          uVar29 = uVar34;
          do {
            uVar13 = *(undefined8 *)(pauVar32[-2] + 8);
            uVar11 = *(undefined8 *)pauVar32[-2];
            auVar151 = pauVar32[-1];
            auVar154 = *pauVar32;
            auVar7 = pauVar32[1];
            bVar39 = (byte)uVar11 | bVar39;
            bVar41 = (byte)((ulong)uVar11 >> 8) | bVar41;
            bVar43 = (byte)((ulong)uVar11 >> 0x10) | bVar43;
            bVar45 = (byte)((ulong)uVar11 >> 0x18) | bVar45;
            bVar47 = (byte)((ulong)uVar11 >> 0x20) | bVar47;
            bVar49 = (byte)((ulong)uVar11 >> 0x28) | bVar49;
            bVar51 = (byte)((ulong)uVar11 >> 0x30) | bVar51;
            bVar53 = (byte)((ulong)uVar11 >> 0x38) | bVar53;
            bVar55 = (byte)uVar13 | bVar55;
            bVar57 = (byte)((ulong)uVar13 >> 8) | bVar57;
            bVar59 = (byte)((ulong)uVar13 >> 0x10) | bVar59;
            bVar61 = (byte)((ulong)uVar13 >> 0x18) | bVar61;
            bVar63 = (byte)((ulong)uVar13 >> 0x20) | bVar63;
            bVar65 = (byte)((ulong)uVar13 >> 0x28) | bVar65;
            bVar67 = (byte)((ulong)uVar13 >> 0x30) | bVar67;
            bVar69 = (byte)((ulong)uVar13 >> 0x38) | bVar69;
            bVar70 = auVar151[0] | bVar70;
            bVar72 = auVar151[1] | bVar72;
            bVar73 = auVar151[2] | bVar73;
            bVar74 = auVar151[3] | bVar74;
            bVar75 = auVar151[4] | bVar75;
            bVar76 = auVar151[5] | bVar76;
            bVar77 = auVar151[6] | bVar77;
            bVar78 = auVar151[7] | bVar78;
            bVar79 = auVar151[8] | bVar79;
            bVar80 = auVar151[9] | bVar80;
            bVar81 = auVar151[10] | bVar81;
            bVar82 = auVar151[0xb] | bVar82;
            bVar83 = auVar151[0xc] | bVar83;
            bVar84 = auVar151[0xd] | bVar84;
            bVar85 = auVar151[0xe] | bVar85;
            bVar86 = auVar151[0xf] | bVar86;
            bVar87 = auVar154[0] | (byte)uVar24;
            bVar88 = auVar154[1] | (byte)((ulong)uVar24 >> 8);
            bVar89 = auVar154[2] | (byte)((ulong)uVar24 >> 0x10);
            bVar90 = auVar154[3] | (byte)((ulong)uVar24 >> 0x18);
            bVar91 = auVar154[4] | (byte)((ulong)uVar24 >> 0x20);
            bVar92 = auVar154[5] | (byte)((ulong)uVar24 >> 0x28);
            bVar93 = auVar154[6] | (byte)((ulong)uVar24 >> 0x30);
            bVar94 = auVar154[7] | (byte)((ulong)uVar24 >> 0x38);
            uVar24 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(bVar90
                                                  ,CONCAT12(bVar89,CONCAT11(bVar88,bVar87)))))));
            bVar95 = auVar154[8] | (byte)uVar27;
            bVar96 = auVar154[9] | (byte)((ulong)uVar27 >> 8);
            bVar97 = auVar154[10] | (byte)((ulong)uVar27 >> 0x10);
            bVar98 = auVar154[0xb] | (byte)((ulong)uVar27 >> 0x18);
            bVar99 = auVar154[0xc] | (byte)((ulong)uVar27 >> 0x20);
            bVar100 = auVar154[0xd] | (byte)((ulong)uVar27 >> 0x28);
            bVar101 = auVar154[0xe] | (byte)((ulong)uVar27 >> 0x30);
            bVar102 = auVar154[0xf] | (byte)((ulong)uVar27 >> 0x38);
            uVar27 = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,CONCAT13(
                                                  bVar98,CONCAT12(bVar97,CONCAT11(bVar96,bVar95)))))
                                              ));
            bVar104 = auVar7[0] | bVar104;
            bVar106 = auVar7[1] | bVar106;
            bVar108 = auVar7[2] | bVar108;
            bVar110 = auVar7[3] | bVar110;
            bVar112 = auVar7[4] | bVar112;
            bVar114 = auVar7[5] | bVar114;
            bVar116 = auVar7[6] | bVar116;
            bVar118 = auVar7[7] | bVar118;
            bVar120 = auVar7[8] | bVar120;
            bVar122 = auVar7[9] | bVar122;
            bVar124 = auVar7[10] | bVar124;
            bVar126 = auVar7[0xb] | bVar126;
            bVar128 = auVar7[0xc] | bVar128;
            bVar130 = auVar7[0xd] | bVar130;
            bVar132 = auVar7[0xe] | bVar132;
            bVar134 = auVar7[0xf] | bVar134;
            uVar29 = uVar29 - 8;
            pauVar32 = pauVar32 + 4;
          } while (uVar29 != 0);
          bVar104 = bVar104 | bVar87 | bVar70 | bVar39;
          bVar106 = bVar106 | bVar88 | bVar72 | bVar41;
          bVar108 = bVar108 | bVar89 | bVar73 | bVar43;
          bVar110 = bVar110 | bVar90 | bVar74 | bVar45;
          bVar112 = bVar112 | bVar91 | bVar75 | bVar47;
          bVar114 = bVar114 | bVar92 | bVar76 | bVar49;
          bVar116 = bVar116 | bVar93 | bVar77 | bVar51;
          bVar118 = bVar118 | bVar94 | bVar78 | bVar53;
          bVar120 = bVar120 | bVar95 | bVar79 | bVar55;
          bVar122 = bVar122 | bVar96 | bVar80 | bVar57;
          bVar124 = bVar124 | bVar97 | bVar81 | bVar59;
          bVar126 = bVar126 | bVar98 | bVar82 | bVar61;
          bVar128 = bVar128 | bVar99 | bVar83 | bVar63;
          bVar130 = bVar130 | bVar100 | bVar84 | bVar65;
          bVar132 = bVar132 | bVar101 | bVar85 | bVar67;
          bVar134 = bVar134 | bVar102 | bVar86 | bVar69;
          auVar7[1] = bVar106;
          auVar7[0] = bVar104;
          auVar7[2] = bVar108;
          auVar7[3] = bVar110;
          auVar7[4] = bVar112;
          auVar7[5] = bVar114;
          auVar7[6] = bVar116;
          auVar7[7] = bVar118;
          auVar7[8] = bVar120;
          auVar7[9] = bVar122;
          auVar7[10] = bVar124;
          auVar7[0xb] = bVar126;
          auVar7[0xc] = bVar128;
          auVar7[0xd] = bVar130;
          auVar7[0xe] = bVar132;
          auVar7[0xf] = bVar134;
          auVar8[1] = bVar106;
          auVar8[0] = bVar104;
          auVar8[2] = bVar108;
          auVar8[3] = bVar110;
          auVar8[4] = bVar112;
          auVar8[5] = bVar114;
          auVar8[6] = bVar116;
          auVar8[7] = bVar118;
          auVar8[8] = bVar120;
          auVar8[9] = bVar122;
          auVar8[10] = bVar124;
          auVar8[0xb] = bVar126;
          auVar8[0xc] = bVar128;
          auVar8[0xd] = bVar130;
          auVar8[0xe] = bVar132;
          auVar8[0xf] = bVar134;
          auVar151 = NEON_ext(auVar7,auVar8,8,1);
          uVar29 = CONCAT17(bVar118 | auVar151[7],
                            CONCAT16(bVar116 | auVar151[6],
                                     CONCAT15(bVar114 | auVar151[5],
                                              CONCAT14(bVar112 | auVar151[4],
                                                       CONCAT13(bVar110 | auVar151[3],
                                                                CONCAT12(bVar108 | auVar151[2],
                                                                         CONCAT11(bVar106 | auVar151
                                                  [1],bVar104 | auVar151[0])))))));
          if (uVar34 != uVar30) goto code_r0x002c4950;
        }
        if (uVar29 == 0) goto code_r0x002c4b1c;
        unaff_x25 = (char *)(plVar19 + 0x1d);
        func_0x002a4078(puVar14 + -600,puVar14 + -0x210,*(undefined8 *)unaff_x25,(long)(int)uVar28,
                        unaff_x25);
        pcVar25 = unaff_x25;
        func_0x002a4078(puVar14 + -600,param_3,puVar14 + -600,(long)(int)plVar19[0x21],unaff_x25);
        func_0x002c3ef4(plVar19,puVar14 + -0x2a0,pcVar26,pqVar36);
        func_0x002d4410(plVar19,puVar14 + -600,puVar14 + -600,puVar14 + -0x2a0);
        (**(code **)(*plVar19 + 0x88))(plVar19,puVar14 + -0x2a0);
        uVar28 = *(uint *)(plVar19 + 0x21);
        unaff_x21 = (long *)(long)(int)uVar28;
        if (uVar28 < 10) {
          *(undefined8 *)(puVar14 + -0x78) = 0;
          *(undefined8 *)(puVar14 + -0x80) = 0;
          *(undefined8 *)(puVar14 + -0x68) = 0;
          *(undefined8 *)(puVar14 + -0x70) = 0;
          pqVar36 = (qword *)((long)unaff_x21 << 1);
          auVar153._8_8_ = pqVar36;
          auVar153._0_8_ = pcVar26;
          *(undefined8 *)(puVar14 + -0x98) = 0;
          *(undefined8 *)(puVar14 + -0xa0) = 0;
          *(undefined8 *)(puVar14 + -0x88) = 0;
          *(undefined8 *)(puVar14 + -0x90) = 0;
          *(undefined8 *)(puVar14 + -0xb8) = 0;
          *(undefined8 *)(puVar14 + -0xc0) = 0;
          *(undefined8 *)(puVar14 + -0xa8) = 0;
          *(undefined8 *)(puVar14 + -0xb0) = 0;
          *(undefined8 *)(puVar14 + -0xd8) = 0;
          *(undefined8 *)(puVar14 + -0xe0) = 0;
          *(undefined8 *)(puVar14 + -200) = 0;
          *(undefined8 *)(puVar14 + -0xd0) = 0;
          *(undefined8 *)(puVar14 + -0xe8) = 0;
          *(undefined8 *)(puVar14 + -0xf0) = 0;
          if (uVar28 != 0) {
            ___memcpy_chk(puVar14 + -0xf0,puVar14 + -0x2a0,(long)unaff_x21 << 3,0x90);
          }
          param_4 = (qword *)(puVar14 + -0xf0);
          pqVar23 = pqVar36;
          pcVar25 = unaff_x25;
          iVar16 = func_0x002ab2b0(puVar14 + -0x2a0,unaff_x21,param_4,pqVar36,unaff_x25);
          if (iVar16 != 0) {
            func_0x0036e464(puVar14 + -0xf0,(long)unaff_x21 << 4);
            pcVar22 = (char *)(long)(int)plVar19[0x21];
            pcVar25 = unaff_x25;
            func_0x002a4078(puVar14 + -600,puVar14 + -600,puVar14 + -0x2a0,pcVar22,unaff_x25);
            uVar28 = *(uint *)(plVar19 + 0x21);
            uVar30 = (ulong)uVar28;
            if ((int)uVar28 < 1) {
              bVar15 = true;
            }
            else {
              if (uVar28 < 8) {
                uVar34 = 0;
                uVar29 = 0;
code_r0x002c4af4:
                lVar71 = uVar30 - uVar34;
                puVar18 = (ulong *)(puVar14 + uVar34 * 8 + -600);
                do {
                  uVar29 = *puVar18 | uVar29;
                  lVar71 = lVar71 + -1;
                  puVar18 = puVar18 + 1;
                } while (lVar71 != 0);
              }
              else {
                uVar34 = uVar30 & 0xfffffff8;
                bVar39 = 0;
                bVar41 = 0;
                bVar43 = 0;
                bVar45 = 0;
                bVar47 = 0;
                bVar49 = 0;
                bVar51 = 0;
                bVar53 = 0;
                bVar55 = 0;
                bVar57 = 0;
                bVar59 = 0;
                bVar61 = 0;
                bVar63 = 0;
                bVar65 = 0;
                bVar67 = 0;
                bVar69 = 0;
                bVar70 = 0;
                bVar72 = 0;
                bVar73 = 0;
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
                uVar24 = 0;
                uVar27 = 0;
                bVar104 = 0;
                bVar106 = 0;
                bVar108 = 0;
                bVar110 = 0;
                bVar112 = 0;
                bVar114 = 0;
                bVar116 = 0;
                bVar118 = 0;
                bVar120 = 0;
                bVar122 = 0;
                bVar124 = 0;
                bVar126 = 0;
                bVar128 = 0;
                bVar130 = 0;
                bVar132 = 0;
                bVar134 = 0;
                pauVar32 = (undefined1 (*) [16])(puVar14 + -0x238);
                uVar29 = uVar34;
                do {
                  uVar13 = *(undefined8 *)(pauVar32[-2] + 8);
                  uVar11 = *(undefined8 *)pauVar32[-2];
                  auVar151 = pauVar32[-1];
                  auVar153 = *pauVar32;
                  auVar154 = pauVar32[1];
                  bVar39 = (byte)uVar11 | bVar39;
                  bVar41 = (byte)((ulong)uVar11 >> 8) | bVar41;
                  bVar43 = (byte)((ulong)uVar11 >> 0x10) | bVar43;
                  bVar45 = (byte)((ulong)uVar11 >> 0x18) | bVar45;
                  bVar47 = (byte)((ulong)uVar11 >> 0x20) | bVar47;
                  bVar49 = (byte)((ulong)uVar11 >> 0x28) | bVar49;
                  bVar51 = (byte)((ulong)uVar11 >> 0x30) | bVar51;
                  bVar53 = (byte)((ulong)uVar11 >> 0x38) | bVar53;
                  bVar55 = (byte)uVar13 | bVar55;
                  bVar57 = (byte)((ulong)uVar13 >> 8) | bVar57;
                  bVar59 = (byte)((ulong)uVar13 >> 0x10) | bVar59;
                  bVar61 = (byte)((ulong)uVar13 >> 0x18) | bVar61;
                  bVar63 = (byte)((ulong)uVar13 >> 0x20) | bVar63;
                  bVar65 = (byte)((ulong)uVar13 >> 0x28) | bVar65;
                  bVar67 = (byte)((ulong)uVar13 >> 0x30) | bVar67;
                  bVar69 = (byte)((ulong)uVar13 >> 0x38) | bVar69;
                  bVar70 = auVar151[0] | bVar70;
                  bVar72 = auVar151[1] | bVar72;
                  bVar73 = auVar151[2] | bVar73;
                  bVar74 = auVar151[3] | bVar74;
                  bVar75 = auVar151[4] | bVar75;
                  bVar76 = auVar151[5] | bVar76;
                  bVar77 = auVar151[6] | bVar77;
                  bVar78 = auVar151[7] | bVar78;
                  bVar79 = auVar151[8] | bVar79;
                  bVar80 = auVar151[9] | bVar80;
                  bVar81 = auVar151[10] | bVar81;
                  bVar82 = auVar151[0xb] | bVar82;
                  bVar83 = auVar151[0xc] | bVar83;
                  bVar84 = auVar151[0xd] | bVar84;
                  bVar85 = auVar151[0xe] | bVar85;
                  bVar86 = auVar151[0xf] | bVar86;
                  bVar87 = auVar153[0] | (byte)uVar24;
                  bVar88 = auVar153[1] | (byte)((ulong)uVar24 >> 8);
                  bVar89 = auVar153[2] | (byte)((ulong)uVar24 >> 0x10);
                  bVar90 = auVar153[3] | (byte)((ulong)uVar24 >> 0x18);
                  bVar91 = auVar153[4] | (byte)((ulong)uVar24 >> 0x20);
                  bVar92 = auVar153[5] | (byte)((ulong)uVar24 >> 0x28);
                  bVar93 = auVar153[6] | (byte)((ulong)uVar24 >> 0x30);
                  bVar94 = auVar153[7] | (byte)((ulong)uVar24 >> 0x38);
                  uVar24 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(
                                                  bVar90,CONCAT12(bVar89,CONCAT11(bVar88,bVar87)))))
                                                  ));
                  bVar95 = auVar153[8] | (byte)uVar27;
                  bVar96 = auVar153[9] | (byte)((ulong)uVar27 >> 8);
                  bVar97 = auVar153[10] | (byte)((ulong)uVar27 >> 0x10);
                  bVar98 = auVar153[0xb] | (byte)((ulong)uVar27 >> 0x18);
                  bVar99 = auVar153[0xc] | (byte)((ulong)uVar27 >> 0x20);
                  bVar100 = auVar153[0xd] | (byte)((ulong)uVar27 >> 0x28);
                  bVar101 = auVar153[0xe] | (byte)((ulong)uVar27 >> 0x30);
                  bVar102 = auVar153[0xf] | (byte)((ulong)uVar27 >> 0x38);
                  uVar27 = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,
                                                  CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,
                                                  bVar95)))))));
                  bVar104 = auVar154[0] | bVar104;
                  bVar106 = auVar154[1] | bVar106;
                  bVar108 = auVar154[2] | bVar108;
                  bVar110 = auVar154[3] | bVar110;
                  bVar112 = auVar154[4] | bVar112;
                  bVar114 = auVar154[5] | bVar114;
                  bVar116 = auVar154[6] | bVar116;
                  bVar118 = auVar154[7] | bVar118;
                  bVar120 = auVar154[8] | bVar120;
                  bVar122 = auVar154[9] | bVar122;
                  bVar124 = auVar154[10] | bVar124;
                  bVar126 = auVar154[0xb] | bVar126;
                  bVar128 = auVar154[0xc] | bVar128;
                  bVar130 = auVar154[0xd] | bVar130;
                  bVar132 = auVar154[0xe] | bVar132;
                  bVar134 = auVar154[0xf] | bVar134;
                  uVar29 = uVar29 - 8;
                  pauVar32 = pauVar32 + 4;
                } while (uVar29 != 0);
                bVar104 = bVar104 | bVar87 | bVar70 | bVar39;
                bVar106 = bVar106 | bVar88 | bVar72 | bVar41;
                bVar108 = bVar108 | bVar89 | bVar73 | bVar43;
                bVar110 = bVar110 | bVar90 | bVar74 | bVar45;
                bVar112 = bVar112 | bVar91 | bVar75 | bVar47;
                bVar114 = bVar114 | bVar92 | bVar76 | bVar49;
                bVar116 = bVar116 | bVar93 | bVar77 | bVar51;
                bVar118 = bVar118 | bVar94 | bVar78 | bVar53;
                bVar120 = bVar120 | bVar95 | bVar79 | bVar55;
                bVar122 = bVar122 | bVar96 | bVar80 | bVar57;
                bVar124 = bVar124 | bVar97 | bVar81 | bVar59;
                bVar126 = bVar126 | bVar98 | bVar82 | bVar61;
                bVar128 = bVar128 | bVar99 | bVar83 | bVar63;
                bVar130 = bVar130 | bVar100 | bVar84 | bVar65;
                bVar132 = bVar132 | bVar101 | bVar85 | bVar67;
                bVar134 = bVar134 | bVar102 | bVar86 | bVar69;
                auVar5[1] = bVar106;
                auVar5[0] = bVar104;
                auVar5[2] = bVar108;
                auVar5[3] = bVar110;
                auVar5[4] = bVar112;
                auVar5[5] = bVar114;
                auVar5[6] = bVar116;
                auVar5[7] = bVar118;
                auVar5[8] = bVar120;
                auVar5[9] = bVar122;
                auVar5[10] = bVar124;
                auVar5[0xb] = bVar126;
                auVar5[0xc] = bVar128;
                auVar5[0xd] = bVar130;
                auVar5[0xe] = bVar132;
                auVar5[0xf] = bVar134;
                auVar6[1] = bVar106;
                auVar6[0] = bVar104;
                auVar6[2] = bVar108;
                auVar6[3] = bVar110;
                auVar6[4] = bVar112;
                auVar6[5] = bVar114;
                auVar6[6] = bVar116;
                auVar6[7] = bVar118;
                auVar6[8] = bVar120;
                auVar6[9] = bVar122;
                auVar6[10] = bVar124;
                auVar6[0xb] = bVar126;
                auVar6[0xc] = bVar128;
                auVar6[0xd] = bVar130;
                auVar6[0xe] = bVar132;
                auVar6[0xf] = bVar134;
                auVar151 = NEON_ext(auVar5,auVar6,8,1);
                uVar29 = CONCAT17(bVar118 | auVar151[7],
                                  CONCAT16(bVar116 | auVar151[6],
                                           CONCAT15(bVar114 | auVar151[5],
                                                    CONCAT14(bVar112 | auVar151[4],
                                                             CONCAT13(bVar110 | auVar151[3],
                                                                      CONCAT12(bVar108 | auVar151[2]
                                                                               ,CONCAT11(bVar106 | 
                                                  auVar151[1],bVar104 | auVar151[0])))))));
                if (uVar34 != uVar30) goto code_r0x002c4af4;
              }
              bVar15 = uVar29 == 0;
            }
            pqVar20 = pqVar21;
            if (bVar15) goto code_r0x002c4b1c;
            unaff_x21 = (long *)func_0x0036e274(0x10);
            if (unaff_x21 != (long *)0x0) {
              lVar71 = func_0x0036e31c(0x18);
              if (lVar71 != 0) {
                *(undefined4 *)(lVar71 + 0x14) = 1;
              }
              *unaff_x21 = lVar71;
              lVar71 = func_0x0036e31c(0x18);
              if (lVar71 == 0) {
                unaff_x21[1] = 0;
              }
              else {
                *(undefined4 *)(lVar71 + 0x14) = 1;
                unaff_x21[1] = lVar71;
                if (*unaff_x21 != 0) {
                  pqVar21 = (qword *)(long)(int)plVar19[0x21];
                  iVar16 = func_0x0029c164(*unaff_x21,puVar14 + -0x210);
                  if (iVar16 != 0) {
                    pqVar21 = (qword *)(long)(int)plVar19[0x21];
                    iVar16 = func_0x0029c164(unaff_x21[1],puVar14 + -600);
                    if (iVar16 != 0) goto code_r0x002c4810;
                  }
                  goto code_r0x002c4bac;
                }
              }
              func_0x002c398c(unaff_x21);
              unaff_x21 = (long *)0x0;
            }
code_r0x002c4bac:
            func_0x002c398c(unaff_x21);
            pqVar20 = pqVar21;
            goto code_r0x002c480c;
          }
        }
      }
      unaff_x23 = auVar153._0_8_;
      auVar151 = _abort();
      *(long *)(puVar14 + -0x2d0) = auVar153._8_8_;
      *(long **)(puVar14 + -0x2c8) = unaff_x21;
      *(long *)(puVar14 + -0x2c0) = auVar152._8_8_;
      *(long *)(puVar14 + -0x2b8) = auVar152._0_8_;
      *(undefined1 **)(puVar14 + -0x2b0) = puVar14 + -0x10;
      *(undefined **)(puVar14 + -0x2a8) =
           &_aws_lc_0_24_0_ECDSA_sign_with_nonce_and_leak_private_key_for_testing;
      unaff_x29 = puVar14 + -0x2b0;
      if ((param_4[5] != 0) && (*(long *)(param_4[5] + 0x10) != 0)) {
        uVar24 = 0x67;
        uVar27 = 0x115;
code_r0x002c4c7c:
        func_0x0028f83c(0x1a,0,uVar24,"/aws-lc/crypto/fipsmodule/ecdsa/ecdsa.c",uVar27);
        return (long *)0x0;
      }
      unaff_x21 = (long *)*param_4;
      if ((unaff_x21 == (long *)0x0) || (unaff_x22 = (qword *)param_4[2], unaff_x22 == (qword *)0x0)
         ) {
        uVar24 = 0x43;
        uVar27 = 0x11b;
        goto code_r0x002c4c7c;
      }
      iVar16 = func_0x002c4420(unaff_x21,puVar14 + -0x318,pqVar23,pcVar25);
      if (iVar16 == 0) {
        return (long *)0x0;
      }
      param_3 = unaff_x22 + 3;
      auVar152._8_8_ = puVar14 + -0x31c;
      auVar152._0_8_ = unaff_x21;
      param_4 = (qword *)(puVar14 + -0x318);
      puVar37 = &UNK_002c4c50;
      puVar14 = puVar14 + -800;
      auVar153 = auVar151;
    } while( true );
  }
  puVar18 = unaff_x19;
  pqVar23 = param_4;
  if (&MACH_HEADER.cpusubtype <= param_4) {
    if ((&segment_command_00000020.fileoff <= param_4 + 0xffffffffffffffff) &&
       (((ulong *)((long)param_4 + (long)param_3) <= unaff_x19 ||
        ((undefined1 *)((long)unaff_x19 + ((ulong)param_4 & 0xfffffffffffffff8)) <=
         (undefined1 *)((long)param_3 + ((ulong)param_4 & 7)))))) {
      uVar30 = ((ulong)(param_4 + 0xffffffffffffffff) >> 3) + 1;
      uVar34 = uVar30 & 0x3ffffffffffffff8;
      pqVar23 = param_4 + -uVar34;
      puVar18 = unaff_x19 + uVar34;
      pauVar32 = (undefined1 (*) [16])((long)param_3 + (long)(param_4 + 0xfffffffffffffffc));
      uVar38 = 0;
      uVar40 = 0;
      uVar42 = 0;
      uVar44 = 0;
      uVar46 = 0;
      uVar48 = 0;
      uVar50 = 0;
      uVar52 = 0;
      uVar54 = 0;
      uVar56 = 0;
      uVar58 = 0;
      uVar60 = 0;
      uVar62 = 0;
      uVar64 = 0;
      uVar66 = 0;
      uVar68 = 0;
      lVar71 = 0;
      uVar103 = 0;
      uVar105 = 0;
      uVar107 = 0;
      uVar109 = 0;
      uVar111 = 0;
      uVar113 = 0;
      uVar115 = 0;
      uVar117 = 0;
      uVar119 = 0;
      uVar121 = 0;
      uVar123 = 0;
      uVar125 = 0;
      uVar127 = 0;
      uVar129 = 0;
      uVar131 = 0;
      uVar133 = 0;
      uVar135 = 0;
      uVar136 = 0;
      uVar137 = 0;
      uVar138 = 0;
      uVar139 = 0;
      uVar140 = 0;
      uVar141 = 0;
      uVar142 = 0;
      uVar143 = 0;
      uVar144 = 0;
      uVar145 = 0;
      uVar146 = 0;
      uVar147 = 0;
      uVar148 = 0;
      uVar149 = 0;
      uVar150 = 0;
      puVar17 = unaff_x19 + 4;
      uVar29 = uVar34;
      do {
        auVar151 = NEON_ext(pauVar32[1],pauVar32[1],8,1);
        auVar152 = NEON_ext(*pauVar32,*pauVar32,8,1);
        auVar153 = NEON_ext(pauVar32[-1],pauVar32[-1],8,1);
        auVar154 = NEON_ext(pauVar32[-2],pauVar32[-2],8,1);
        auVar151 = NEON_rev64(auVar151,1);
        auVar152 = NEON_rev64(auVar152,1);
        auVar153 = NEON_rev64(auVar153,1);
        auVar154 = NEON_rev64(auVar154,1);
        puVar17[-3] = auVar151._8_8_;
        puVar17[-4] = auVar151._0_8_;
        puVar17[-1] = auVar152._8_8_;
        puVar17[-2] = auVar152._0_8_;
        puVar17[1] = auVar153._8_8_;
        *puVar17 = auVar153._0_8_;
        puVar17[3] = auVar154._8_8_;
        puVar17[2] = auVar154._0_8_;
        lVar31 = CONCAT17(uVar52,CONCAT16(uVar50,CONCAT15(uVar48,CONCAT14(uVar46,CONCAT13(uVar44,
                                                  CONCAT12(uVar42,CONCAT11(uVar40,uVar38))))))) + -1
        ;
        uVar38 = (undefined1)lVar31;
        uVar40 = (undefined1)((ulong)lVar31 >> 8);
        uVar42 = (undefined1)((ulong)lVar31 >> 0x10);
        uVar44 = (undefined1)((ulong)lVar31 >> 0x18);
        uVar46 = (undefined1)((ulong)lVar31 >> 0x20);
        uVar48 = (undefined1)((ulong)lVar31 >> 0x28);
        uVar50 = (undefined1)((ulong)lVar31 >> 0x30);
        uVar52 = (undefined1)((ulong)lVar31 >> 0x38);
        lVar9 = CONCAT17(uVar68,CONCAT16(uVar66,CONCAT15(uVar64,CONCAT14(uVar62,CONCAT13(uVar60,
                                                  CONCAT12(uVar58,CONCAT11(uVar56,uVar54))))))) + -1
        ;
        uVar54 = (undefined1)lVar9;
        uVar56 = (undefined1)((ulong)lVar9 >> 8);
        uVar58 = (undefined1)((ulong)lVar9 >> 0x10);
        uVar60 = (undefined1)((ulong)lVar9 >> 0x18);
        uVar62 = (undefined1)((ulong)lVar9 >> 0x20);
        uVar64 = (undefined1)((ulong)lVar9 >> 0x28);
        uVar66 = (undefined1)((ulong)lVar9 >> 0x30);
        uVar68 = (undefined1)((ulong)lVar9 >> 0x38);
        lVar9 = CONCAT17(uVar117,CONCAT16(uVar115,CONCAT15(uVar113,CONCAT14(uVar111,CONCAT13(uVar109
                                                  ,CONCAT12(uVar107,CONCAT11(uVar105,uVar103)))))))
                + -1;
        uVar103 = (undefined1)lVar9;
        uVar105 = (undefined1)((ulong)lVar9 >> 8);
        uVar107 = (undefined1)((ulong)lVar9 >> 0x10);
        uVar109 = (undefined1)((ulong)lVar9 >> 0x18);
        uVar111 = (undefined1)((ulong)lVar9 >> 0x20);
        uVar113 = (undefined1)((ulong)lVar9 >> 0x28);
        uVar115 = (undefined1)((ulong)lVar9 >> 0x30);
        uVar117 = (undefined1)((ulong)lVar9 >> 0x38);
        lVar10 = CONCAT17(uVar133,CONCAT16(uVar131,CONCAT15(uVar129,CONCAT14(uVar127,CONCAT13(
                                                  uVar125,CONCAT12(uVar123,CONCAT11(uVar121,uVar119)
                                                                  )))))) + -1;
        uVar119 = (undefined1)lVar10;
        uVar121 = (undefined1)((ulong)lVar10 >> 8);
        uVar123 = (undefined1)((ulong)lVar10 >> 0x10);
        uVar125 = (undefined1)((ulong)lVar10 >> 0x18);
        uVar127 = (undefined1)((ulong)lVar10 >> 0x20);
        uVar129 = (undefined1)((ulong)lVar10 >> 0x28);
        uVar131 = (undefined1)((ulong)lVar10 >> 0x30);
        uVar133 = (undefined1)((ulong)lVar10 >> 0x38);
        lVar71 = lVar71 + -1;
        param_2 = param_2 - 1;
        lVar10 = CONCAT17(uVar142,CONCAT16(uVar141,CONCAT15(uVar140,CONCAT14(uVar139,CONCAT13(
                                                  uVar138,CONCAT12(uVar137,CONCAT11(uVar136,uVar135)
                                                                  )))))) + -1;
        uVar135 = (undefined1)lVar10;
        uVar136 = (undefined1)((ulong)lVar10 >> 8);
        uVar137 = (undefined1)((ulong)lVar10 >> 0x10);
        uVar138 = (undefined1)((ulong)lVar10 >> 0x18);
        uVar139 = (undefined1)((ulong)lVar10 >> 0x20);
        uVar140 = (undefined1)((ulong)lVar10 >> 0x28);
        uVar141 = (undefined1)((ulong)lVar10 >> 0x30);
        uVar142 = (undefined1)((ulong)lVar10 >> 0x38);
        lVar12 = CONCAT17(uVar150,CONCAT16(uVar149,CONCAT15(uVar148,CONCAT14(uVar147,CONCAT13(
                                                  uVar146,CONCAT12(uVar145,CONCAT11(uVar144,uVar143)
                                                                  )))))) + -1;
        uVar143 = (undefined1)lVar12;
        uVar144 = (undefined1)((ulong)lVar12 >> 8);
        uVar145 = (undefined1)((ulong)lVar12 >> 0x10);
        uVar146 = (undefined1)((ulong)lVar12 >> 0x18);
        uVar147 = (undefined1)((ulong)lVar12 >> 0x20);
        uVar148 = (undefined1)((ulong)lVar12 >> 0x28);
        uVar149 = (undefined1)((ulong)lVar12 >> 0x30);
        uVar150 = (undefined1)((ulong)lVar12 >> 0x38);
        pauVar32 = pauVar32 + -4;
        uVar29 = uVar29 - 8;
        puVar17 = puVar17 + 8;
      } while (uVar29 != 0);
      param_2 = lVar71 + CONCAT17(uVar68,CONCAT16(uVar66,CONCAT15(uVar64,CONCAT14(uVar62,CONCAT13(
                                                  uVar60,CONCAT12(uVar58,(short)(CONCAT12(uVar56,
                                                  CONCAT11(uVar54,uVar52)) >> 8))))))) +
                lVar31 + param_2 +
                lVar10 + CONCAT17(uVar133,CONCAT16(uVar131,CONCAT15(uVar129,CONCAT14(uVar127,
                                                  CONCAT13(uVar125,CONCAT12(uVar123,(short)(CONCAT12
                                                  (uVar121,CONCAT11(uVar119,uVar117)) >> 8))))))) +
                lVar9 + (long)(CONCAT18(uVar150,CONCAT17(uVar149,CONCAT16(uVar148,CONCAT15(uVar147,
                                                  CONCAT14(uVar146,CONCAT13(uVar145,CONCAT12(uVar144
                                                  ,CONCAT11(uVar143,uVar142)))))))) >> 8);
      if (uVar30 == uVar34) goto LAB_002c4598;
    }
    puVar17 = puVar18;
    pqVar21 = pqVar23;
    do {
      pqVar23 = pqVar21 + 0xffffffffffffffff;
      uVar30 = (*(ulong *)((long)(param_3 + 0xffffffffffffffff) + (long)pqVar21) &
               0xff00ff00ff00ff00) >> 8 |
               (*(ulong *)((long)(param_3 + 0xffffffffffffffff) + (long)pqVar21) & 0xff00ff00ff00ff)
               << 8;
      uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 | (uVar30 & 0xffff0000ffff) << 0x10;
      puVar18 = puVar17 + 1;
      *puVar17 = uVar30 >> 0x20 | uVar30 << 0x20;
      param_2 = param_2 - 1;
      puVar17 = puVar18;
      pqVar21 = pqVar23;
    } while ((undefined1 *)((long)&MACH_HEADER.cputype + 3) < pqVar23);
  }
LAB_002c4598:
  if (pqVar23 != (qword *)0x0) {
    uVar30 = 0;
    do {
      uVar30 = (ulong)(byte)*param_3 | uVar30 << 8;
      pqVar23 = (qword *)((long)pqVar23 + 0xffffffffffffffff);
      param_3 = (qword *)((long)param_3 + 1);
    } while (pqVar23 != (qword *)0x0);
    *puVar18 = uVar30;
    param_2 = param_2 - 1;
  }
  if ((param_2 & 0x1fffffffffffffff) != 0) {
    _bzero();
  }
  iVar16 = func_0x0029d99c();
  if (iVar16 < 0) {
    return (long *)((long)&MACH_HEADER.magic + 1);
  }
  uVar24 = 0x47;
code_r0x002c45e4:
  func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",uVar24);
  return (long *)0x0;
}

