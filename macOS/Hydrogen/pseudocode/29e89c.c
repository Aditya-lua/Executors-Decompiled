
undefined8 FUN_0029e89c(long *param_1,undefined8 param_2,ulong param_3)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
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
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  bool bVar21;
  int iVar22;
  int iVar23;
  int iVar24;
  undefined8 uVar25;
  uint uVar26;
  long *plVar27;
  int in_w8;
  ulong *puVar28;
  ulong in_x9;
  long *plVar29;
  ulong *puVar30;
  long lVar31;
  ulong uVar32;
  int iVar33;
  ulong uVar34;
  ulong uVar35;
  ulong uVar36;
  undefined8 *puVar37;
  long lVar38;
  undefined1 (*pauVar39) [16];
  long lVar40;
  undefined8 *puVar41;
  ulong uVar42;
  long unaff_x19;
  long lVar43;
  ulong uVar44;
  long *unaff_x22;
  ulong uVar45;
  long *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong uVar46;
  ulong *puVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
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
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
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
  byte bVar100;
  byte bVar101;
  byte bVar102;
  byte bVar103;
  byte bVar104;
  byte bVar105;
  byte bVar106;
  byte bVar107;
  byte bVar108;
  byte bVar109;
  byte bVar110;
  byte bVar111;
  byte bVar112;
  byte bVar113;
  byte bVar114;
  undefined1 auVar99 [16];
  undefined1 auVar115 [16];
  undefined1 auVar116 [16];
  undefined8 uVar117;
  undefined8 uVar118;
  undefined8 uVar119;
  ulong in_stack_00000028;
  long *in_stack_00000048;
  long *in_stack_00000050;
  undefined8 *in_stack_00000058;
  
  in_stack_00000028 = in_stack_00000028 >> 0x20;
  lVar31 = in_x9 * 8;
  do {
    lVar31 = lVar31 + -8;
    iVar22 = (int)in_x9;
    in_x9 = (ulong)(iVar22 - 1);
    if (iVar22 < 1) goto LAB_0029e8c0;
  } while (*(long *)(*param_1 + lVar31) == 0);
  in_w8 = iVar22;
LAB_0029e8c0:
  *(int *)(param_1 + 1) = in_w8;
  *(undefined4 *)(param_1 + 2) = 0;
  if ((int)unaff_x24[1] + 1 < in_w8) {
    iVar22 = func_0x0029afb8(param_1,(long)(in_w8 + 1));
    if (iVar22 != 0) {
      lVar31 = *in_stack_00000050;
      lVar43 = in_stack_00000050[1];
      *(undefined8 *)(lVar31 + (long)(int)lVar43 * 8) = 0;
      iVar22 = (int)lVar43 + 1;
LAB_0029e940:
      *(int *)(in_stack_00000050 + 1) = iVar22;
      uVar26 = *(uint *)(unaff_x24 + 1);
      uVar32 = (ulong)(int)uVar26;
      iVar33 = iVar22 - uVar26;
      if (uVar26 - 1 == 0) {
        uVar44 = 0;
      }
      else {
        uVar44 = *(ulong *)(*unaff_x24 + (long)(int)(uVar26 - 2) * 8);
      }
      uVar46 = *(ulong *)(*unaff_x24 + (long)(int)(uVar26 - 1) * 8);
      uVar4 = *(uint *)(unaff_x26 + 0x10);
      *(uint *)(unaff_x22 + 2) = *(uint *)(unaff_x25 + 0x10) ^ uVar4;
      iVar23 = func_0x0029afb8();
      if (iVar23 != 0) {
        iVar23 = iVar33 + -1;
        *(int *)(unaff_x22 + 1) = iVar23;
        lVar43 = *unaff_x22;
        iVar24 = func_0x0029afb8(in_stack_00000058);
        if (iVar24 != 0) {
          puVar30 = (ulong *)(lVar43 + (long)iVar23 * 8);
          if ((int)unaff_x22[1] == 0) {
            *(undefined4 *)(unaff_x22 + 2) = 0;
          }
          else {
            puVar30 = puVar30 + -1;
          }
          if (1 < iVar33) {
            iVar24 = 0;
            lVar43 = lVar31 + (long)iVar33 * 8;
            puVar47 = (ulong *)(lVar31 + (long)(iVar22 + -1) * 8);
            do {
              if (*puVar47 == uVar46) {
                uVar45 = 0xffffffffffffffff;
              }
              else {
                uVar36 = puVar47[-1];
                uVar45 = func_0x00479b20(uVar36,*puVar47,uVar46,0);
                uVar36 = uVar36 - uVar46 * uVar45;
                auVar65._8_8_ = 0;
                auVar65._0_8_ = uVar45;
                auVar99._8_8_ = 0;
                auVar99._0_8_ = uVar44;
                uVar35 = SUB168(auVar65 * auVar99,8);
                uVar42 = uVar45 * uVar44;
                if (!CARRY8(uVar36,~uVar35) &&
                    !CARRY8(uVar36 + ~uVar35,(ulong)(uVar42 <= puVar47[-2]))) {
                  do {
                    uVar45 = uVar45 - 1;
                    bVar21 = CARRY8(uVar36,uVar46);
                    uVar36 = uVar36 + uVar46;
                    if (bVar21) break;
                    bVar21 = uVar42 < uVar44;
                    uVar42 = uVar42 - uVar44;
                    uVar35 = uVar35 - bVar21;
                  } while (!CARRY8(uVar36,~uVar35) &&
                           !CARRY8(uVar36 + ~uVar35,(ulong)(uVar42 <= puVar47[-2])));
                }
              }
              plVar27 = (long *)*in_stack_00000058;
              if (uVar26 == 0) {
                uVar36 = 0;
              }
              else {
                puVar28 = (ulong *)*unaff_x24;
                plVar29 = plVar27;
                uVar42 = uVar32;
                if (uVar26 < 4) {
                  uVar35 = 0;
                }
                else {
                  uVar36 = 0;
                  do {
                    auVar115._8_8_ = 0;
                    auVar115._0_8_ = *puVar28;
                    auVar116._8_8_ = 0;
                    auVar116._0_8_ = uVar45;
                    uVar35 = SUB168(auVar115 * auVar116,8);
                    uVar34 = *puVar28 * uVar45;
                    if (CARRY8(uVar34,uVar36)) {
                      uVar35 = uVar35 + 1;
                    }
                    *plVar29 = uVar34 + uVar36;
                    auVar6._8_8_ = 0;
                    auVar6._0_8_ = puVar28[1];
                    auVar10._8_8_ = 0;
                    auVar10._0_8_ = uVar45;
                    uVar36 = SUB168(auVar6 * auVar10,8);
                    uVar34 = puVar28[1] * uVar45;
                    if (CARRY8(uVar34,uVar35)) {
                      uVar36 = uVar36 + 1;
                    }
                    plVar29[1] = uVar34 + uVar35;
                    auVar7._8_8_ = 0;
                    auVar7._0_8_ = puVar28[2];
                    auVar11._8_8_ = 0;
                    auVar11._0_8_ = uVar45;
                    uVar35 = SUB168(auVar7 * auVar11,8);
                    uVar34 = puVar28[2] * uVar45;
                    if (CARRY8(uVar34,uVar36)) {
                      uVar35 = uVar35 + 1;
                    }
                    plVar29[2] = uVar34 + uVar36;
                    auVar8._8_8_ = 0;
                    auVar8._0_8_ = puVar28[3];
                    auVar12._8_8_ = 0;
                    auVar12._0_8_ = uVar45;
                    uVar36 = SUB168(auVar8 * auVar12,8);
                    uVar34 = puVar28[3] * uVar45;
                    if (CARRY8(uVar34,uVar35)) {
                      uVar36 = uVar36 + 1;
                    }
                    plVar29[3] = uVar34 + uVar35;
                    puVar28 = puVar28 + 4;
                    plVar29 = plVar29 + 4;
                    uVar42 = uVar42 - 4;
                  } while (3 < uVar42);
                  uVar35 = uVar36;
                  if (uVar42 == 0) goto code_r0x0029eb6c;
                }
                do {
                  auVar9._8_8_ = 0;
                  auVar9._0_8_ = uVar45;
                  auVar13._8_8_ = 0;
                  auVar13._0_8_ = *puVar28;
                  uVar36 = SUB168(auVar9 * auVar13,8);
                  uVar34 = uVar45 * *puVar28;
                  if (CARRY8(uVar34,uVar35)) {
                    uVar36 = uVar36 + 1;
                  }
                  *plVar29 = uVar34 + uVar35;
                  uVar42 = uVar42 - 1;
                  puVar28 = puVar28 + 1;
                  plVar29 = plVar29 + 1;
                  uVar35 = uVar36;
                } while (uVar42 != 0);
              }
code_r0x0029eb6c:
              plVar27[uVar32] = uVar36;
              lVar43 = lVar43 + -8;
              lVar31 = func_0x00382cc0(lVar43,lVar43,plVar27,uVar32 + 1);
              if (lVar31 != 0) {
                uVar45 = uVar45 - 1;
                lVar31 = func_0x00382c70(lVar43,lVar43,*unaff_x24,uVar32);
                if (lVar31 != 0) {
                  *puVar47 = *puVar47 + 1;
                }
              }
              *puVar30 = uVar45;
              iVar24 = iVar24 + 1;
              puVar47 = puVar47 + -1;
              puVar30 = puVar30 + -1;
            } while (iVar24 != iVar23);
          }
          uVar26 = *(uint *)(in_stack_00000050 + 1);
          uVar32 = (ulong)uVar26;
          lVar31 = uVar32 * 8;
          do {
            lVar31 = lVar31 + -8;
            iVar22 = (int)uVar32;
            uVar32 = (ulong)(iVar22 - 1);
            if (iVar22 < 1) {
              *(uint *)(in_stack_00000050 + 1) = uVar26 & (int)uVar26 >> 0x1f;
              if (-1 < (int)uVar26) {
                *(undefined4 *)(in_stack_00000050 + 2) = 0;
              }
              goto code_r0x0029ec00;
            }
          } while (*(long *)(*in_stack_00000050 + lVar31) == 0);
          *(int *)(in_stack_00000050 + 1) = iVar22;
code_r0x0029ec00:
          if (in_stack_00000048 == (long *)0x0) goto code_r0x0029ece0;
          iVar22 = func_0x0029f130();
          param_3 = in_stack_00000028;
          if (iVar22 == 0) goto LAB_0029ec38;
          uVar26 = *(uint *)(in_stack_00000048 + 1);
          uVar32 = (ulong)(int)uVar26;
          if (uVar26 == 0) goto code_r0x0029ece0;
          if (uVar26 < 8) {
            uVar46 = 0;
            uVar44 = 0;
code_r0x0029ecc0:
            lVar31 = uVar32 - uVar46;
            puVar30 = (ulong *)(*in_stack_00000048 + uVar46 * 8);
            do {
              uVar44 = *puVar30 | uVar44;
              lVar31 = lVar31 + -1;
              puVar30 = puVar30 + 1;
            } while (lVar31 != 0);
          }
          else {
            uVar46 = uVar32 & 0xfffffffffffffff8;
            bVar48 = 0;
            bVar49 = 0;
            bVar50 = 0;
            bVar51 = 0;
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
            bVar67 = 0;
            bVar68 = 0;
            bVar69 = 0;
            bVar70 = 0;
            bVar71 = 0;
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
            bVar100 = 0;
            bVar101 = 0;
            bVar102 = 0;
            bVar103 = 0;
            bVar104 = 0;
            bVar105 = 0;
            bVar106 = 0;
            bVar107 = 0;
            bVar108 = 0;
            bVar109 = 0;
            bVar110 = 0;
            bVar111 = 0;
            bVar112 = 0;
            bVar113 = 0;
            bVar114 = 0;
            puVar41 = (undefined8 *)(*in_stack_00000048 + 0x20);
            uVar44 = uVar46;
            do {
              uVar117 = puVar41[1];
              uVar25 = *puVar41;
              uVar119 = puVar41[3];
              uVar118 = puVar41[2];
              bVar48 = *(byte *)(puVar41 + -4) | bVar48;
              bVar49 = *(byte *)((long)puVar41 + -0x1f) | bVar49;
              bVar50 = *(byte *)((long)puVar41 + -0x1e) | bVar50;
              bVar51 = *(byte *)((long)puVar41 + -0x1d) | bVar51;
              bVar52 = *(byte *)((long)puVar41 + -0x1c) | bVar52;
              bVar53 = *(byte *)((long)puVar41 + -0x1b) | bVar53;
              bVar54 = *(byte *)((long)puVar41 + -0x1a) | bVar54;
              bVar55 = *(byte *)((long)puVar41 + -0x19) | bVar55;
              bVar56 = *(byte *)(puVar41 + -3) | bVar56;
              bVar57 = *(byte *)((long)puVar41 + -0x17) | bVar57;
              bVar58 = *(byte *)((long)puVar41 + -0x16) | bVar58;
              bVar59 = *(byte *)((long)puVar41 + -0x15) | bVar59;
              bVar60 = *(byte *)((long)puVar41 + -0x14) | bVar60;
              bVar61 = *(byte *)((long)puVar41 + -0x13) | bVar61;
              bVar62 = *(byte *)((long)puVar41 + -0x12) | bVar62;
              bVar63 = *(byte *)((long)puVar41 + -0x11) | bVar63;
              bVar64 = *(byte *)(puVar41 + -2) | bVar64;
              bVar67 = *(byte *)((long)puVar41 + -0xf) | bVar67;
              bVar68 = *(byte *)((long)puVar41 + -0xe) | bVar68;
              bVar69 = *(byte *)((long)puVar41 + -0xd) | bVar69;
              bVar70 = *(byte *)((long)puVar41 + -0xc) | bVar70;
              bVar71 = *(byte *)((long)puVar41 + -0xb) | bVar71;
              bVar72 = *(byte *)((long)puVar41 + -10) | bVar72;
              bVar73 = *(byte *)((long)puVar41 + -9) | bVar73;
              bVar74 = *(byte *)(puVar41 + -1) | bVar74;
              bVar75 = *(byte *)((long)puVar41 + -7) | bVar75;
              bVar76 = *(byte *)((long)puVar41 + -6) | bVar76;
              bVar77 = *(byte *)((long)puVar41 + -5) | bVar77;
              bVar78 = *(byte *)((long)puVar41 + -4) | bVar78;
              bVar79 = *(byte *)((long)puVar41 + -3) | bVar79;
              bVar80 = *(byte *)((long)puVar41 + -2) | bVar80;
              bVar81 = *(byte *)((long)puVar41 + -1) | bVar81;
              bVar82 = (byte)uVar25 | bVar82;
              bVar83 = (byte)((ulong)uVar25 >> 8) | bVar83;
              bVar84 = (byte)((ulong)uVar25 >> 0x10) | bVar84;
              bVar85 = (byte)((ulong)uVar25 >> 0x18) | bVar85;
              bVar86 = (byte)((ulong)uVar25 >> 0x20) | bVar86;
              bVar87 = (byte)((ulong)uVar25 >> 0x28) | bVar87;
              bVar88 = (byte)((ulong)uVar25 >> 0x30) | bVar88;
              bVar89 = (byte)((ulong)uVar25 >> 0x38) | bVar89;
              bVar90 = (byte)uVar117 | bVar90;
              bVar91 = (byte)((ulong)uVar117 >> 8) | bVar91;
              bVar92 = (byte)((ulong)uVar117 >> 0x10) | bVar92;
              bVar93 = (byte)((ulong)uVar117 >> 0x18) | bVar93;
              bVar94 = (byte)((ulong)uVar117 >> 0x20) | bVar94;
              bVar95 = (byte)((ulong)uVar117 >> 0x28) | bVar95;
              bVar96 = (byte)((ulong)uVar117 >> 0x30) | bVar96;
              bVar97 = (byte)((ulong)uVar117 >> 0x38) | bVar97;
              bVar98 = (byte)uVar118 | bVar98;
              bVar100 = (byte)((ulong)uVar118 >> 8) | bVar100;
              bVar101 = (byte)((ulong)uVar118 >> 0x10) | bVar101;
              bVar102 = (byte)((ulong)uVar118 >> 0x18) | bVar102;
              bVar103 = (byte)((ulong)uVar118 >> 0x20) | bVar103;
              bVar104 = (byte)((ulong)uVar118 >> 0x28) | bVar104;
              bVar105 = (byte)((ulong)uVar118 >> 0x30) | bVar105;
              bVar106 = (byte)((ulong)uVar118 >> 0x38) | bVar106;
              bVar107 = (byte)uVar119 | bVar107;
              bVar108 = (byte)((ulong)uVar119 >> 8) | bVar108;
              bVar109 = (byte)((ulong)uVar119 >> 0x10) | bVar109;
              bVar110 = (byte)((ulong)uVar119 >> 0x18) | bVar110;
              bVar111 = (byte)((ulong)uVar119 >> 0x20) | bVar111;
              bVar112 = (byte)((ulong)uVar119 >> 0x28) | bVar112;
              bVar113 = (byte)((ulong)uVar119 >> 0x30) | bVar113;
              bVar114 = (byte)((ulong)uVar119 >> 0x38) | bVar114;
              uVar44 = uVar44 - 8;
              puVar41 = puVar41 + 8;
            } while (uVar44 != 0);
            bVar98 = bVar98 | bVar82 | bVar64 | bVar48;
            bVar100 = bVar100 | bVar83 | bVar67 | bVar49;
            bVar101 = bVar101 | bVar84 | bVar68 | bVar50;
            bVar102 = bVar102 | bVar85 | bVar69 | bVar51;
            bVar103 = bVar103 | bVar86 | bVar70 | bVar52;
            bVar104 = bVar104 | bVar87 | bVar71 | bVar53;
            bVar105 = bVar105 | bVar88 | bVar72 | bVar54;
            bVar106 = bVar106 | bVar89 | bVar73 | bVar55;
            bVar107 = bVar107 | bVar90 | bVar74 | bVar56;
            bVar108 = bVar108 | bVar91 | bVar75 | bVar57;
            bVar109 = bVar109 | bVar92 | bVar76 | bVar58;
            bVar110 = bVar110 | bVar93 | bVar77 | bVar59;
            bVar111 = bVar111 | bVar94 | bVar78 | bVar60;
            bVar112 = bVar112 | bVar95 | bVar79 | bVar61;
            bVar113 = bVar113 | bVar96 | bVar80 | bVar62;
            bVar114 = bVar114 | bVar97 | bVar81 | bVar63;
            auVar14[1] = bVar100;
            auVar14[0] = bVar98;
            auVar14[2] = bVar101;
            auVar14[3] = bVar102;
            auVar14[4] = bVar103;
            auVar14[5] = bVar104;
            auVar14[6] = bVar105;
            auVar14[7] = bVar106;
            auVar14[8] = bVar107;
            auVar14[9] = bVar108;
            auVar14[10] = bVar109;
            auVar14[0xb] = bVar110;
            auVar14[0xc] = bVar111;
            auVar14[0xd] = bVar112;
            auVar14[0xe] = bVar113;
            auVar14[0xf] = bVar114;
            auVar15[1] = bVar100;
            auVar15[0] = bVar98;
            auVar15[2] = bVar101;
            auVar15[3] = bVar102;
            auVar15[4] = bVar103;
            auVar15[5] = bVar104;
            auVar15[6] = bVar105;
            auVar15[7] = bVar106;
            auVar15[8] = bVar107;
            auVar15[9] = bVar108;
            auVar15[10] = bVar109;
            auVar15[0xb] = bVar110;
            auVar15[0xc] = bVar111;
            auVar15[0xd] = bVar112;
            auVar15[0xe] = bVar113;
            auVar15[0xf] = bVar114;
            auVar65 = NEON_ext(auVar14,auVar15,8,1);
            uVar44 = CONCAT17(bVar106 | auVar65[7],
                              CONCAT16(bVar105 | auVar65[6],
                                       CONCAT15(bVar104 | auVar65[5],
                                                CONCAT14(bVar103 | auVar65[4],
                                                         CONCAT13(bVar102 | auVar65[3],
                                                                  CONCAT12(bVar101 | auVar65[2],
                                                                           CONCAT11(bVar100 | 
                                                  auVar65[1],bVar98 | auVar65[0])))))));
            if (uVar46 != uVar32) goto code_r0x0029ecc0;
          }
          if (uVar44 != 0) {
            *(uint *)(in_stack_00000048 + 2) = uVar4;
          }
code_r0x0029ece0:
          uVar26 = *(uint *)(unaff_x22 + 1);
          uVar32 = (ulong)uVar26;
          lVar31 = uVar32 * 8;
          do {
            lVar31 = lVar31 + -8;
            iVar22 = (int)uVar32;
            uVar32 = (ulong)(iVar22 - 1);
            if (iVar22 < 1) {
              *(uint *)(unaff_x22 + 1) = uVar26 & (int)uVar26 >> 0x1f;
              if (-1 < (int)uVar26) {
                *(undefined4 *)(unaff_x22 + 2) = 0;
              }
              goto code_r0x0029ed24;
            }
          } while (*(long *)(*unaff_x22 + lVar31) == 0);
          *(int *)(unaff_x22 + 1) = iVar22;
code_r0x0029ed24:
          func_0x0029e4bc();
          return 1;
        }
      }
    }
  }
  else {
    iVar22 = func_0x0029afb8(param_1,(long)(int)unaff_x24[1] + 2);
    if (iVar22 != 0) {
      iVar33 = (int)in_stack_00000050[1];
      iVar22 = (int)unaff_x24[1] + 2;
      lVar31 = *in_stack_00000050;
      if (iVar33 < iVar22) {
        _bzero(lVar31 + (long)iVar33 * 8,(ulong)(((int)unaff_x24[1] - iVar33) + 1) * 8 + 8);
      }
      goto LAB_0029e940;
    }
  }
LAB_0029ec38:
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return 0;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar31 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar31;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar31 * 8);
    return 0;
  }
  auVar65 = func_0x0079db4c();
  puVar30 = auVar65._8_8_;
  plVar27 = auVar65._0_8_;
  uVar26 = (uint)param_3;
  if ((int)uVar26 < 0) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/shift.c",0x49);
    return 0;
  }
  *(int *)(plVar27 + 2) = (int)puVar30[2];
  uVar4 = uVar26 >> 6;
  uVar32 = (ulong)uVar4;
  uVar25 = func_0x0029afb8(plVar27,(long)(int)(uVar4 + (int)puVar30[1] + 1));
  if ((int)uVar25 == 0) {
    return uVar25;
  }
  uVar46 = *puVar30;
  lVar31 = *plVar27;
  uVar2 = (uint)puVar30[1];
  uVar44 = (ulong)uVar2;
  iVar22 = uVar2 + uVar4;
  *(undefined8 *)(lVar31 + (long)iVar22 * 8) = 0;
  uVar3 = uVar26 & 0x3f;
  if ((param_3 & 0x3f) != 0) {
    if (0 < (int)uVar2) {
      uVar5 = 0x40 - uVar3;
      uVar36 = uVar44;
      if (0x25 < uVar2) {
        lVar43 = uVar44 - 1;
        lVar38 = uVar44 * 8;
        uVar42 = (lVar38 + uVar46) - 8;
        if (uVar42 + lVar43 * -8 <= uVar42) {
          lVar40 = (uVar32 + uVar44) * 8;
          uVar42 = lVar31 + lVar40;
          if ((((uVar42 - 8) + lVar43 * -8 <= uVar42 - 8) && (uVar42 + lVar43 * -8 <= uVar42)) &&
             (iVar22 - (int)lVar43 <= iVar22)) {
            uVar45 = lVar31 + lVar40 + 8 + uVar44 * -8;
            uVar35 = lVar31 + uVar32 * 8;
            uVar34 = lVar31 + lVar40 + 8;
            if (((uVar34 <= uVar35 || uVar42 <= uVar45) &&
                (uVar46 + lVar38 <= uVar45 || uVar34 <= uVar46)) &&
               (uVar46 + lVar38 <= uVar35 || uVar42 <= uVar46)) {
              uVar36 = uVar44 & 3;
              pauVar39 = (undefined1 (*) [16])(lVar38 + uVar46 + -0x10);
              puVar41 = (undefined8 *)(lVar40 + lVar31 + -0x10);
              auVar66._0_8_ = -(ulong)uVar5;
              auVar66._8_8_ = -(ulong)uVar5;
              uVar42 = uVar44 & 0xfffffffc;
              iVar33 = iVar22;
              do {
                auVar65 = NEON_ext(*pauVar39,*pauVar39,8,1);
                auVar99 = NEON_ext(pauVar39[-1],pauVar39[-1],8,1);
                auVar115 = NEON_ushl(auVar65,auVar66,8);
                auVar116 = NEON_ushl(auVar99,auVar66,8);
                pbVar1 = (byte *)(lVar31 + (long)iVar33 * 8);
                uVar117 = *(undefined8 *)pbVar1;
                uVar25 = *(undefined8 *)(pbVar1 + -8);
                uVar119 = *(undefined8 *)(pbVar1 + -0x10);
                uVar118 = *(undefined8 *)(pbVar1 + -0x18);
                auVar115 = NEON_ext(auVar115,auVar115,8,1);
                *pbVar1 = (byte)uVar117 | auVar115[8];
                pbVar1[1] = (byte)((ulong)uVar117 >> 8) | auVar115[9];
                pbVar1[2] = (byte)((ulong)uVar117 >> 0x10) | auVar115[10];
                pbVar1[3] = (byte)((ulong)uVar117 >> 0x18) | auVar115[0xb];
                pbVar1[4] = (byte)((ulong)uVar117 >> 0x20) | auVar115[0xc];
                pbVar1[5] = (byte)((ulong)uVar117 >> 0x28) | auVar115[0xd];
                pbVar1[6] = (byte)((ulong)uVar117 >> 0x30) | auVar115[0xe];
                pbVar1[7] = (byte)((ulong)uVar117 >> 0x38) | auVar115[0xf];
                pbVar1[-8] = (byte)uVar25 | auVar115[0];
                pbVar1[-7] = (byte)((ulong)uVar25 >> 8) | auVar115[1];
                pbVar1[-6] = (byte)((ulong)uVar25 >> 0x10) | auVar115[2];
                pbVar1[-5] = (byte)((ulong)uVar25 >> 0x18) | auVar115[3];
                pbVar1[-4] = (byte)((ulong)uVar25 >> 0x20) | auVar115[4];
                pbVar1[-3] = (byte)((ulong)uVar25 >> 0x28) | auVar115[5];
                pbVar1[-2] = (byte)((ulong)uVar25 >> 0x30) | auVar115[6];
                pbVar1[-1] = (byte)((ulong)uVar25 >> 0x38) | auVar115[7];
                auVar115 = NEON_ext(auVar116,auVar116,8,1);
                pbVar1[-0x10] = (byte)uVar119 | auVar115[8];
                pbVar1[-0xf] = (byte)((ulong)uVar119 >> 8) | auVar115[9];
                pbVar1[-0xe] = (byte)((ulong)uVar119 >> 0x10) | auVar115[10];
                pbVar1[-0xd] = (byte)((ulong)uVar119 >> 0x18) | auVar115[0xb];
                pbVar1[-0xc] = (byte)((ulong)uVar119 >> 0x20) | auVar115[0xc];
                pbVar1[-0xb] = (byte)((ulong)uVar119 >> 0x28) | auVar115[0xd];
                pbVar1[-10] = (byte)((ulong)uVar119 >> 0x30) | auVar115[0xe];
                pbVar1[-9] = (byte)((ulong)uVar119 >> 0x38) | auVar115[0xf];
                pbVar1[-0x18] = (byte)uVar118 | auVar115[0];
                pbVar1[-0x17] = (byte)((ulong)uVar118 >> 8) | auVar115[1];
                pbVar1[-0x16] = (byte)((ulong)uVar118 >> 0x10) | auVar115[2];
                pbVar1[-0x15] = (byte)((ulong)uVar118 >> 0x18) | auVar115[3];
                pbVar1[-0x14] = (byte)((ulong)uVar118 >> 0x20) | auVar115[4];
                pbVar1[-0x13] = (byte)((ulong)uVar118 >> 0x28) | auVar115[5];
                pbVar1[-0x12] = (byte)((ulong)uVar118 >> 0x30) | auVar115[6];
                pbVar1[-0x11] = (byte)((ulong)uVar118 >> 0x38) | auVar115[7];
                auVar16._4_4_ = 0;
                auVar16._0_4_ = uVar3;
                auVar16[8] = (char)uVar3;
                auVar16._9_7_ = 0;
                auVar65 = NEON_ushl(auVar65,auVar16,8);
                auVar17._4_4_ = 0;
                auVar17._0_4_ = uVar3;
                auVar17[8] = (char)uVar3;
                auVar17._9_7_ = 0;
                auVar99 = NEON_ushl(auVar99,auVar17,8);
                auVar115 = NEON_ext(auVar65,auVar65,8,1);
                auVar65 = NEON_ext(auVar99,auVar99,8,1);
                puVar41[-1] = auVar65._8_8_;
                puVar41[-2] = auVar65._0_8_;
                puVar41[1] = auVar115._8_8_;
                *puVar41 = auVar115._0_8_;
                pauVar39 = pauVar39 + -2;
                iVar33 = iVar33 + -4;
                puVar41 = puVar41 + -4;
                uVar42 = uVar42 - 4;
              } while (uVar42 != 0);
              if ((uVar44 & 0xfffffffc) == uVar44) goto code_r0x0029ee70;
            }
          }
        }
      }
      do {
        uVar44 = *(ulong *)((uVar46 - 8) + uVar36 * 8);
        uVar2 = uVar4 + (int)uVar36;
        uVar42 = -(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3;
        *(ulong *)(lVar31 + uVar42) = *(ulong *)(lVar31 + uVar42) | uVar44 >> ((ulong)uVar5 & 0x3f);
        *(ulong *)(lVar31 + uVar32 * 8 + -8 + uVar36 * 8) = uVar44 << (ulong)uVar3;
        bVar21 = uVar36 != 0;
        uVar36 = uVar36 - 1;
      } while (bVar21 && uVar36 != 0);
    }
    goto code_r0x0029ee70;
  }
  if ((int)uVar2 < 1) goto code_r0x0029ee70;
  if (uVar2 < 0xe) {
code_r0x0029ee4c:
    uVar36 = uVar44;
  }
  else {
    lVar43 = uVar44 * 8 + uVar46;
    lVar38 = (uVar32 + uVar44) * 8 + lVar31;
    if ((ulong)(lVar43 - lVar38) < 0x40) goto code_r0x0029ee4c;
    uVar36 = uVar44 & 7;
    puVar41 = (undefined8 *)(lVar38 + -0x20);
    puVar37 = (undefined8 *)(lVar43 + -0x20);
    uVar42 = uVar44 & 0xfffffff8;
    do {
      uVar118 = *puVar37;
      uVar117 = puVar37[3];
      uVar25 = puVar37[2];
      uVar19 = puVar37[-4];
      uVar20 = puVar37[-3];
      uVar119 = puVar37[-2];
      uVar18 = puVar37[-1];
      puVar41[1] = puVar37[1];
      *puVar41 = uVar118;
      puVar41[3] = uVar117;
      puVar41[2] = uVar25;
      puVar41[-3] = uVar20;
      puVar41[-4] = uVar19;
      puVar41[-1] = uVar18;
      puVar41[-2] = uVar119;
      puVar41 = puVar41 + -8;
      puVar37 = puVar37 + -8;
      uVar42 = uVar42 - 8;
    } while (uVar42 != 0);
    if ((uVar44 & 0xfffffff8) == uVar44) goto code_r0x0029ee70;
  }
  do {
    *(undefined8 *)(lVar31 + uVar32 * 8 + -8 + uVar36 * 8) =
         *(undefined8 *)((uVar46 - 8) + uVar36 * 8);
    bVar21 = uVar36 != 0;
    uVar36 = uVar36 - 1;
  } while (bVar21 && uVar36 != 0);
code_r0x0029ee70:
  if (0x3f < uVar26) {
    _bzero(lVar31,uVar4 << 3);
    iVar22 = (int)puVar30[1] + uVar4;
  }
  uVar26 = iVar22 + 1;
  lVar31 = (ulong)uVar26 * 8;
  iVar33 = iVar22 + 2;
  do {
    lVar31 = lVar31 + -8;
    iVar33 = iVar33 + -1;
    if (iVar33 < 1) {
      *(uint *)(plVar27 + 1) = uVar26 & (int)uVar26 >> 0x1f;
      if (iVar22 < -1) {
        return 1;
      }
      *(undefined4 *)(plVar27 + 2) = 0;
      return 1;
    }
  } while (*(long *)(*plVar27 + lVar31) == 0);
  *(int *)(plVar27 + 1) = iVar33;
  return 1;
}

