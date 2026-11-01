
/* WARNING: Possible PIC construction at 0x002d3380: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002d3384) */
/* WARNING: Removing unreachable block (ram,0x002d3394) */

undefined8
thunk_FUN_002d3290(long param_1,long param_2,undefined8 param_3,char *param_4,int param_5,
                  undefined8 *param_6)

{
  long *plVar1;
  char cVar2;
  undefined1 auVar3 [16];
  int iVar4;
  uint uVar5;
  char *pcVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  long *plVar10;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  uint uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 unaff_x19;
  long unaff_x20;
  undefined8 *puVar20;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  int unaff_w24;
  undefined8 unaff_x26;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
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
  byte bVar51;
  byte bVar52;
  byte bVar53;
  undefined1 auVar38 [16];
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
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  undefined8 uVar71;
  byte bVar78;
  byte bVar79;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar86;
  undefined8 uVar80;
  byte bVar87;
  undefined8 uVar88;
  undefined8 uVar89;
  undefined8 uVar90;
  undefined8 uVar91;
  undefined8 uVar92;
  undefined8 uVar93;
  undefined8 uVar94;
  undefined8 uVar95;
  undefined1 auVar96 [16];
  undefined8 uStack_b8;
  undefined1 auStack_aa [66];
  long lStack_68;
  
  auVar96._8_8_ = unaff_x19;
  auVar96._0_8_ = unaff_x20;
  *(undefined8 *)(param_2 + param_1 * 8) = unaff_x26;
  unaff_x22[2] = unaff_x22[2] + 1;
  pcVar6 = (char *)func_0x0029e340();
  if (pcVar6 == (char *)0x0) {
LAB_002d3304:
    unaff_w24 = param_5;
    pcVar6 = param_4;
    if (*(char *)(unaff_x22 + 5) == '\0') {
      if (unaff_x22[2] != 0) {
        lVar7 = unaff_x22[2] + -1;
        unaff_x22[2] = lVar7;
        unaff_x22[4] = *(undefined8 *)(unaff_x22[1] + lVar7 * 8);
        goto LAB_002d332c;
      }
      func_0x0079db4c();
    }
    else {
LAB_002d332c:
      if (unaff_x23 == (undefined8 *)0x0) {
        return 0;
      }
      if ((unaff_x23[4] == 0) || (*(char *)(unaff_x23 + 5) != '\0')) {
        func_0x00373520(*unaff_x23,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
        func_0x0036e3d8(unaff_x23[1]);
        func_0x0036e3d8();
        return 0;
      }
    }
    auVar96 = func_0x0079db28();
    unaff_x22 = param_6;
  }
  else {
    param_4 = pcVar6;
    lVar7 = func_0x0029c764(unaff_x21 + 1);
    if (lVar7 == 0) goto LAB_002d3304;
    iVar4 = func_0x0029d99c(*(undefined8 *)pcVar6,(long)*(int *)(pcVar6 + 8),
                            *(undefined8 *)(unaff_x20 + 0x140),(long)*(int *)(unaff_x20 + 0x148));
    if (-1 < iVar4) {
      param_5 = 0x8dd5e9;
      param_4 = section_00000068.sectname + 5;
      param_6 = (undefined8 *)((long)&section_000000b8.nrelocs + 1);
      func_0x0028f83c(0xf,0);
      goto LAB_002d3304;
    }
  }
  plVar8 = auVar96._0_8_;
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  iVar4 = func_0x002c2908();
  if (iVar4 == 0) {
    if (((*(int *)(pcVar6 + 0x10) != 0) || ((int)plVar8[0x2a] != 0)) ||
       (iVar4 = func_0x0029d99c(*(undefined8 *)pcVar6,(long)*(int *)(pcVar6 + 8),plVar8[0x28],
                                (long)(int)plVar8[0x29]), -1 < iVar4)) {
      uVar12 = 0x6b;
      uVar13 = 0x138;
      goto LAB_002d344c;
    }
    func_0x0028f0e4();
    if (unaff_x22 == (undefined8 *)0x0) {
      unaff_x22 = (undefined8 *)func_0x0036e31c(0x30);
      if (unaff_x22 != (undefined8 *)0x0) {
        unaff_x22[1] = 0;
        unaff_x22[2] = 0;
        unaff_x22[3] = 0;
        puVar20 = unaff_x22;
        goto code_r0x002d34bc;
      }
      goto code_r0x002d3450;
    }
    puVar20 = (undefined8 *)0x0;
code_r0x002d34bc:
    if (*(char *)(unaff_x22 + 5) == '\0') {
      uVar12 = unaff_x22[4];
      uVar15 = unaff_x22[2];
      if (uVar15 == unaff_x22[3]) {
        uVar18 = 0x20;
        if (uVar15 != 0) {
          uVar18 = uVar15 * 3 >> 1;
        }
        if (((uVar18 <= uVar15) || (uVar18 >> 0x3d != 0)) ||
           (lVar7 = func_0x0036e48c(unaff_x22[1],uVar18 << 3), lVar7 == 0)) {
          *(undefined2 *)(unaff_x22 + 5) = 0x101;
          goto code_r0x002d3544;
        }
        unaff_x22[1] = lVar7;
        unaff_x22[3] = uVar18;
        uVar15 = unaff_x22[2];
      }
      else {
        lVar7 = unaff_x22[1];
      }
      *(undefined8 *)(lVar7 + uVar15 * 8) = uVar12;
      unaff_x22[2] = unaff_x22[2] + 1;
    }
code_r0x002d3544:
    uVar12 = func_0x0029e340(unaff_x22);
    uVar13 = func_0x0029e340(unaff_x22);
    lVar7 = func_0x0029e340(unaff_x22);
    lVar9 = func_0x0029e340(unaff_x22);
    plVar10 = (long *)func_0x0029e340(unaff_x22);
    if (plVar10 == (long *)0x0) {
LAB_002d38ac:
      uVar12 = 0;
      cVar2 = *(char *)(unaff_x22 + 5);
joined_r0x002d38b4:
      if (cVar2 != '\0') goto LAB_002d38d4;
LAB_002d38b8:
      if (unaff_x22[2] != 0) {
        lVar7 = unaff_x22[2] + -1;
        unaff_x22[2] = lVar7;
        unaff_x22[4] = *(undefined8 *)(unaff_x22[1] + lVar7 * 8);
        goto LAB_002d38d4;
      }
code_r0x002d3970:
      func_0x0079db4c();
      goto LAB_002d3974;
    }
    if (lVar7 != 0) {
      (**(code **)(*plVar8 + 0x68))(plVar8,auStack_aa,&uStack_b8,plVar8 + 0x2d);
      lVar11 = func_0x0029c764(auStack_aa,uStack_b8,lVar7);
      if (lVar11 == 0) goto LAB_002d38ac;
    }
    if (lVar9 != 0) {
      (**(code **)(*plVar8 + 0x68))(plVar8,auStack_aa,&uStack_b8,plVar8 + 0x36);
      lVar11 = func_0x0029c764(auStack_aa,uStack_b8,lVar9);
      if (lVar11 == 0) goto LAB_002d38ac;
    }
    plVar1 = plVar8 + 0x28;
    iVar4 = func_0x002a09b0(uVar13,pcVar6,plVar1,unaff_x22);
    if ((iVar4 == 0) || (iVar4 = func_0x002a06a4(uVar12,uVar13,pcVar6,plVar1,unaff_x22), iVar4 == 0)
       ) goto LAB_002d38ac;
    if ((int)plVar8[0x42] != 0) {
      iVar4 = func_0x0029fda4(uVar13,pcVar6,pcVar6,plVar1,unaff_x22);
      if (((iVar4 != 0) &&
          (iVar4 = func_0x0029fda4(uVar13,uVar13,pcVar6,plVar1,unaff_x22), iVar4 != 0)) &&
         (iVar4 = func_0x002a0344(uVar12,uVar12,uVar13,plVar1,unaff_x22), iVar4 != 0))
      goto LAB_002d36d4;
      goto LAB_002d38ac;
    }
    iVar4 = func_0x002a06a4(uVar13,lVar7,pcVar6,plVar1,unaff_x22);
    if ((iVar4 == 0) || (iVar4 = func_0x0029fda4(uVar12,uVar12,uVar13,plVar1,unaff_x22), iVar4 == 0)
       ) goto LAB_002d38ac;
LAB_002d36d4:
    iVar4 = func_0x0029fda4(uVar12,uVar12,lVar9,plVar1,unaff_x22);
    if (iVar4 == 0) goto LAB_002d38ac;
    lVar7 = func_0x002b0878(plVar10,uVar12,plVar1,unaff_x22);
    if (lVar7 != 0) {
      uVar5 = *(uint *)(plVar10 + 1);
      if ((int)uVar5 < 1) {
        uVar14 = 0;
      }
      else {
        uVar14 = *(uint *)*plVar10 & 1;
      }
      if (uVar14 != (unaff_w24 != 0)) {
        if (uVar5 != 0) {
          uVar15 = (ulong)(int)uVar5;
          if (uVar5 < 8) {
            uVar17 = 0;
            uVar18 = 0;
LAB_002d383c:
            lVar7 = uVar15 - uVar17;
            puVar16 = (ulong *)(*plVar10 + uVar17 * 8);
            do {
              uVar18 = *puVar16 | uVar18;
              lVar7 = lVar7 + -1;
              puVar16 = puVar16 + 1;
            } while (lVar7 != 0);
          }
          else {
            uVar17 = uVar15 & 0xfffffffffffffff8;
            bVar21 = 0;
            bVar22 = 0;
            bVar23 = 0;
            bVar24 = 0;
            bVar25 = 0;
            bVar26 = 0;
            bVar27 = 0;
            bVar28 = 0;
            bVar29 = 0;
            bVar30 = 0;
            bVar31 = 0;
            bVar32 = 0;
            bVar33 = 0;
            bVar34 = 0;
            bVar35 = 0;
            bVar36 = 0;
            bVar37 = 0;
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
            bVar51 = 0;
            bVar52 = 0;
            bVar53 = 0;
            uVar12 = 0;
            uVar13 = 0;
            uVar71 = 0;
            uVar80 = 0;
            puVar19 = (undefined8 *)(*plVar10 + 0x20);
            uVar18 = uVar17;
            do {
              uVar89 = puVar19[-3];
              uVar88 = puVar19[-4];
              uVar91 = puVar19[-1];
              uVar90 = puVar19[-2];
              uVar93 = puVar19[1];
              uVar92 = *puVar19;
              uVar95 = puVar19[3];
              uVar94 = puVar19[2];
              bVar21 = (byte)uVar88 | bVar21;
              bVar22 = (byte)((ulong)uVar88 >> 8) | bVar22;
              bVar23 = (byte)((ulong)uVar88 >> 0x10) | bVar23;
              bVar24 = (byte)((ulong)uVar88 >> 0x18) | bVar24;
              bVar25 = (byte)((ulong)uVar88 >> 0x20) | bVar25;
              bVar26 = (byte)((ulong)uVar88 >> 0x28) | bVar26;
              bVar27 = (byte)((ulong)uVar88 >> 0x30) | bVar27;
              bVar28 = (byte)((ulong)uVar88 >> 0x38) | bVar28;
              bVar29 = (byte)uVar89 | bVar29;
              bVar30 = (byte)((ulong)uVar89 >> 8) | bVar30;
              bVar31 = (byte)((ulong)uVar89 >> 0x10) | bVar31;
              bVar32 = (byte)((ulong)uVar89 >> 0x18) | bVar32;
              bVar33 = (byte)((ulong)uVar89 >> 0x20) | bVar33;
              bVar34 = (byte)((ulong)uVar89 >> 0x28) | bVar34;
              bVar35 = (byte)((ulong)uVar89 >> 0x30) | bVar35;
              bVar36 = (byte)((ulong)uVar89 >> 0x38) | bVar36;
              bVar37 = (byte)uVar90 | bVar37;
              bVar39 = (byte)((ulong)uVar90 >> 8) | bVar39;
              bVar40 = (byte)((ulong)uVar90 >> 0x10) | bVar40;
              bVar41 = (byte)((ulong)uVar90 >> 0x18) | bVar41;
              bVar42 = (byte)((ulong)uVar90 >> 0x20) | bVar42;
              bVar43 = (byte)((ulong)uVar90 >> 0x28) | bVar43;
              bVar44 = (byte)((ulong)uVar90 >> 0x30) | bVar44;
              bVar45 = (byte)((ulong)uVar90 >> 0x38) | bVar45;
              bVar46 = (byte)uVar91 | bVar46;
              bVar47 = (byte)((ulong)uVar91 >> 8) | bVar47;
              bVar48 = (byte)((ulong)uVar91 >> 0x10) | bVar48;
              bVar49 = (byte)((ulong)uVar91 >> 0x18) | bVar49;
              bVar50 = (byte)((ulong)uVar91 >> 0x20) | bVar50;
              bVar51 = (byte)((ulong)uVar91 >> 0x28) | bVar51;
              bVar52 = (byte)((ulong)uVar91 >> 0x30) | bVar52;
              bVar53 = (byte)((ulong)uVar91 >> 0x38) | bVar53;
              bVar54 = (byte)uVar92 | (byte)uVar12;
              bVar55 = (byte)((ulong)uVar92 >> 8) | (byte)((ulong)uVar12 >> 8);
              bVar56 = (byte)((ulong)uVar92 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
              bVar57 = (byte)((ulong)uVar92 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
              bVar58 = (byte)((ulong)uVar92 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
              bVar59 = (byte)((ulong)uVar92 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
              bVar60 = (byte)((ulong)uVar92 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
              bVar61 = (byte)((ulong)uVar92 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
              uVar12 = CONCAT17(bVar61,CONCAT16(bVar60,CONCAT15(bVar59,CONCAT14(bVar58,CONCAT13(
                                                  bVar57,CONCAT12(bVar56,CONCAT11(bVar55,bVar54)))))
                                               ));
              bVar62 = (byte)uVar93 | (byte)uVar13;
              bVar63 = (byte)((ulong)uVar93 >> 8) | (byte)((ulong)uVar13 >> 8);
              bVar64 = (byte)((ulong)uVar93 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
              bVar65 = (byte)((ulong)uVar93 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
              bVar66 = (byte)((ulong)uVar93 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
              bVar67 = (byte)((ulong)uVar93 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
              bVar68 = (byte)((ulong)uVar93 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
              bVar69 = (byte)((ulong)uVar93 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
              uVar13 = CONCAT17(bVar69,CONCAT16(bVar68,CONCAT15(bVar67,CONCAT14(bVar66,CONCAT13(
                                                  bVar65,CONCAT12(bVar64,CONCAT11(bVar63,bVar62)))))
                                               ));
              bVar70 = (byte)uVar94 | (byte)uVar71;
              bVar72 = (byte)((ulong)uVar94 >> 8) | (byte)((ulong)uVar71 >> 8);
              bVar73 = (byte)((ulong)uVar94 >> 0x10) | (byte)((ulong)uVar71 >> 0x10);
              bVar74 = (byte)((ulong)uVar94 >> 0x18) | (byte)((ulong)uVar71 >> 0x18);
              bVar75 = (byte)((ulong)uVar94 >> 0x20) | (byte)((ulong)uVar71 >> 0x20);
              bVar76 = (byte)((ulong)uVar94 >> 0x28) | (byte)((ulong)uVar71 >> 0x28);
              bVar77 = (byte)((ulong)uVar94 >> 0x30) | (byte)((ulong)uVar71 >> 0x30);
              bVar78 = (byte)((ulong)uVar94 >> 0x38) | (byte)((ulong)uVar71 >> 0x38);
              uVar71 = CONCAT17(bVar78,CONCAT16(bVar77,CONCAT15(bVar76,CONCAT14(bVar75,CONCAT13(
                                                  bVar74,CONCAT12(bVar73,CONCAT11(bVar72,bVar70)))))
                                               ));
              bVar79 = (byte)uVar95 | (byte)uVar80;
              bVar81 = (byte)((ulong)uVar95 >> 8) | (byte)((ulong)uVar80 >> 8);
              bVar82 = (byte)((ulong)uVar95 >> 0x10) | (byte)((ulong)uVar80 >> 0x10);
              bVar83 = (byte)((ulong)uVar95 >> 0x18) | (byte)((ulong)uVar80 >> 0x18);
              bVar84 = (byte)((ulong)uVar95 >> 0x20) | (byte)((ulong)uVar80 >> 0x20);
              bVar85 = (byte)((ulong)uVar95 >> 0x28) | (byte)((ulong)uVar80 >> 0x28);
              bVar86 = (byte)((ulong)uVar95 >> 0x30) | (byte)((ulong)uVar80 >> 0x30);
              bVar87 = (byte)((ulong)uVar95 >> 0x38) | (byte)((ulong)uVar80 >> 0x38);
              uVar80 = CONCAT17(bVar87,CONCAT16(bVar86,CONCAT15(bVar85,CONCAT14(bVar84,CONCAT13(
                                                  bVar83,CONCAT12(bVar82,CONCAT11(bVar81,bVar79)))))
                                               ));
              uVar18 = uVar18 - 8;
              puVar19 = puVar19 + 8;
            } while (uVar18 != 0);
            bVar70 = bVar70 | bVar54 | bVar37 | bVar21;
            bVar72 = bVar72 | bVar55 | bVar39 | bVar22;
            bVar73 = bVar73 | bVar56 | bVar40 | bVar23;
            bVar74 = bVar74 | bVar57 | bVar41 | bVar24;
            bVar75 = bVar75 | bVar58 | bVar42 | bVar25;
            bVar76 = bVar76 | bVar59 | bVar43 | bVar26;
            bVar77 = bVar77 | bVar60 | bVar44 | bVar27;
            bVar78 = bVar78 | bVar61 | bVar45 | bVar28;
            bVar79 = bVar79 | bVar62 | bVar46 | bVar29;
            bVar81 = bVar81 | bVar63 | bVar47 | bVar30;
            bVar82 = bVar82 | bVar64 | bVar48 | bVar31;
            bVar83 = bVar83 | bVar65 | bVar49 | bVar32;
            bVar84 = bVar84 | bVar66 | bVar50 | bVar33;
            bVar85 = bVar85 | bVar67 | bVar51 | bVar34;
            bVar86 = bVar86 | bVar68 | bVar52 | bVar35;
            bVar87 = bVar87 | bVar69 | bVar53 | bVar36;
            auVar38[1] = bVar72;
            auVar38[0] = bVar70;
            auVar38[2] = bVar73;
            auVar38[3] = bVar74;
            auVar38[4] = bVar75;
            auVar38[5] = bVar76;
            auVar38[6] = bVar77;
            auVar38[7] = bVar78;
            auVar38[8] = bVar79;
            auVar38[9] = bVar81;
            auVar38[10] = bVar82;
            auVar38[0xb] = bVar83;
            auVar38[0xc] = bVar84;
            auVar38[0xd] = bVar85;
            auVar38[0xe] = bVar86;
            auVar38[0xf] = bVar87;
            auVar3[1] = bVar72;
            auVar3[0] = bVar70;
            auVar3[2] = bVar73;
            auVar3[3] = bVar74;
            auVar3[4] = bVar75;
            auVar3[5] = bVar76;
            auVar3[6] = bVar77;
            auVar3[7] = bVar78;
            auVar3[8] = bVar79;
            auVar3[9] = bVar81;
            auVar3[10] = bVar82;
            auVar3[0xb] = bVar83;
            auVar3[0xc] = bVar84;
            auVar3[0xd] = bVar85;
            auVar3[0xe] = bVar86;
            auVar3[0xf] = bVar87;
            auVar38 = NEON_ext(auVar38,auVar3,8,1);
            uVar18 = CONCAT17(bVar78 | auVar38[7],
                              CONCAT16(bVar77 | auVar38[6],
                                       CONCAT15(bVar76 | auVar38[5],
                                                CONCAT14(bVar75 | auVar38[4],
                                                         CONCAT13(bVar74 | auVar38[3],
                                                                  CONCAT12(bVar73 | auVar38[2],
                                                                           CONCAT11(bVar72 | auVar38
                                                  [1],bVar70 | auVar38[0])))))));
            if (uVar17 != uVar15) goto LAB_002d383c;
          }
          if (uVar18 != 0) {
            iVar4 = func_0x0029ad98(plVar10,plVar1,plVar10);
            if (iVar4 == 0) goto LAB_002d38ac;
            uVar5 = *(uint *)(plVar10 + 1);
            goto joined_r0x002d3878;
          }
        }
        func_0x0028f83c(0xf,0,0x6c,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x180);
        cVar2 = *(char *)(unaff_x22 + 5);
        goto joined_r0x002d3964;
      }
joined_r0x002d3878:
      if ((int)uVar5 < 1) {
        uVar5 = 0;
      }
      else {
        uVar5 = *(uint *)*plVar10 & 1;
      }
      if (uVar5 != (unaff_w24 != 0)) {
        func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x188);
        cVar2 = *(char *)(unaff_x22 + 5);
        goto joined_r0x002d3964;
      }
      uVar12 = func_0x002c8d10(plVar8,auVar96._8_8_,pcVar6,plVar10);
      cVar2 = *(char *)(unaff_x22 + 5);
      goto joined_r0x002d38b4;
    }
    uVar5 = func_0x0028ef5c();
    if ((uVar5 & 0xff000fff) == 0x300006e) {
      func_0x0028f0e4();
      func_0x0028f83c(0xf,0,0x6b,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x177);
      cVar2 = *(char *)(unaff_x22 + 5);
    }
    else {
      func_0x0028f83c(0xf,0,3,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x179);
      cVar2 = *(char *)(unaff_x22 + 5);
    }
joined_r0x002d3964:
    uVar12 = 0;
    if (cVar2 == '\0') goto LAB_002d38b8;
LAB_002d38d4:
    if (puVar20 != (undefined8 *)0x0) {
      if ((puVar20[4] != 0) && (*(char *)(puVar20 + 5) == '\0')) {
        func_0x0079db28();
        goto code_r0x002d3970;
      }
      func_0x00373520(*puVar20,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(puVar20[1]);
      func_0x0036e3d8(puVar20);
    }
  }
  else {
    uVar12 = 0x6a;
    uVar13 = 0x132;
LAB_002d344c:
    func_0x0028f83c(0xf,0,uVar12,"/aws-lc/crypto/fipsmodule/ec/oct.c",uVar13);
code_r0x002d3450:
    uVar12 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
    return uVar12;
  }
LAB_002d3974:
  ___stack_chk_fail();
  func_0x00373e9c(0xa29548,&DAT_002d39a4);
  return 0xa3ab08;
}

