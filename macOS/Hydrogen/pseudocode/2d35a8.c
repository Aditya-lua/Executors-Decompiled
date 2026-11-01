
undefined8 FUN_002d35a8(void)

{
  char cVar1;
  undefined1 auVar2 [16];
  int iVar3;
  uint uVar4;
  long lVar5;
  uint uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar12;
  long *unaff_x23;
  long *unaff_x24;
  long unaff_x27;
  long unaff_x29;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar31;
  byte bVar32;
  byte bVar33;
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
  undefined1 auVar30 [16];
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  undefined8 uVar55;
  byte bVar62;
  byte bVar63;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  undefined8 uVar64;
  byte bVar71;
  byte bVar72;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  undefined8 uVar73;
  byte bVar80;
  undefined8 uVar81;
  undefined8 uVar82;
  undefined8 uVar83;
  undefined8 uVar84;
  undefined8 uVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  undefined8 uVar88;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000026;
  
  lVar5 = func_0x0029c764(&uStack0000000000000026);
  if (lVar5 == 0) {
LAB_002d38ac:
    uVar12 = 0;
    cVar1 = *(char *)(unaff_x19 + 0x28);
joined_r0x002d38b4:
    if (cVar1 != '\0') goto LAB_002d38d4;
LAB_002d38b8:
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar5 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar5;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar5 * 8);
      goto LAB_002d38d4;
    }
code_r0x002d3970:
    func_0x0079db4c();
  }
  else {
    if (unaff_x27 != 0) {
      (**(code **)(*unaff_x23 + 0x68))();
      lVar5 = func_0x0029c764(&uStack0000000000000026,in_stack_00000018);
      if (lVar5 == 0) goto LAB_002d38ac;
    }
    iVar3 = func_0x002a09b0();
    if ((iVar3 == 0) || (iVar3 = func_0x002a06a4(), iVar3 == 0)) goto LAB_002d38ac;
    if ((int)unaff_x23[0x42] != 0) {
      iVar3 = func_0x0029fda4();
      if (((iVar3 != 0) && (iVar3 = func_0x0029fda4(), iVar3 != 0)) &&
         (iVar3 = func_0x002a0344(), iVar3 != 0)) goto LAB_002d36d4;
      goto LAB_002d38ac;
    }
    iVar3 = func_0x002a06a4();
    if ((iVar3 == 0) || (iVar3 = func_0x0029fda4(), iVar3 == 0)) goto LAB_002d38ac;
LAB_002d36d4:
    iVar3 = func_0x0029fda4();
    if (iVar3 == 0) goto LAB_002d38ac;
    lVar5 = func_0x002b0878(unaff_x24);
    if (lVar5 != 0) {
      uVar4 = *(uint *)(unaff_x24 + 1);
      if ((int)uVar4 < 1) {
        uVar6 = 0;
      }
      else {
        uVar6 = *(uint *)*unaff_x24 & 1;
      }
      if (uVar6 != in_stack_00000010._4_4_) {
        if (uVar4 != 0) {
          uVar8 = (ulong)(int)uVar4;
          if (uVar4 < 8) {
            uVar9 = 0;
            uVar10 = 0;
LAB_002d383c:
            lVar5 = uVar8 - uVar9;
            puVar7 = (ulong *)(*unaff_x24 + uVar9 * 8);
            do {
              uVar10 = *puVar7 | uVar10;
              lVar5 = lVar5 + -1;
              puVar7 = puVar7 + 1;
            } while (lVar5 != 0);
          }
          else {
            uVar9 = uVar8 & 0xfffffffffffffff8;
            bVar13 = 0;
            bVar14 = 0;
            bVar15 = 0;
            bVar16 = 0;
            bVar17 = 0;
            bVar18 = 0;
            bVar19 = 0;
            bVar20 = 0;
            bVar21 = 0;
            bVar22 = 0;
            bVar23 = 0;
            bVar24 = 0;
            bVar25 = 0;
            bVar26 = 0;
            bVar27 = 0;
            bVar28 = 0;
            bVar29 = 0;
            bVar31 = 0;
            bVar32 = 0;
            bVar33 = 0;
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
            uVar12 = 0;
            uVar55 = 0;
            uVar64 = 0;
            uVar73 = 0;
            puVar11 = (undefined8 *)(*unaff_x24 + 0x20);
            uVar10 = uVar9;
            do {
              uVar82 = puVar11[-3];
              uVar81 = puVar11[-4];
              uVar84 = puVar11[-1];
              uVar83 = puVar11[-2];
              uVar86 = puVar11[1];
              uVar85 = *puVar11;
              uVar88 = puVar11[3];
              uVar87 = puVar11[2];
              bVar13 = (byte)uVar81 | bVar13;
              bVar14 = (byte)((ulong)uVar81 >> 8) | bVar14;
              bVar15 = (byte)((ulong)uVar81 >> 0x10) | bVar15;
              bVar16 = (byte)((ulong)uVar81 >> 0x18) | bVar16;
              bVar17 = (byte)((ulong)uVar81 >> 0x20) | bVar17;
              bVar18 = (byte)((ulong)uVar81 >> 0x28) | bVar18;
              bVar19 = (byte)((ulong)uVar81 >> 0x30) | bVar19;
              bVar20 = (byte)((ulong)uVar81 >> 0x38) | bVar20;
              bVar21 = (byte)uVar82 | bVar21;
              bVar22 = (byte)((ulong)uVar82 >> 8) | bVar22;
              bVar23 = (byte)((ulong)uVar82 >> 0x10) | bVar23;
              bVar24 = (byte)((ulong)uVar82 >> 0x18) | bVar24;
              bVar25 = (byte)((ulong)uVar82 >> 0x20) | bVar25;
              bVar26 = (byte)((ulong)uVar82 >> 0x28) | bVar26;
              bVar27 = (byte)((ulong)uVar82 >> 0x30) | bVar27;
              bVar28 = (byte)((ulong)uVar82 >> 0x38) | bVar28;
              bVar29 = (byte)uVar83 | bVar29;
              bVar31 = (byte)((ulong)uVar83 >> 8) | bVar31;
              bVar32 = (byte)((ulong)uVar83 >> 0x10) | bVar32;
              bVar33 = (byte)((ulong)uVar83 >> 0x18) | bVar33;
              bVar34 = (byte)((ulong)uVar83 >> 0x20) | bVar34;
              bVar35 = (byte)((ulong)uVar83 >> 0x28) | bVar35;
              bVar36 = (byte)((ulong)uVar83 >> 0x30) | bVar36;
              bVar37 = (byte)((ulong)uVar83 >> 0x38) | bVar37;
              bVar38 = (byte)uVar84 | bVar38;
              bVar39 = (byte)((ulong)uVar84 >> 8) | bVar39;
              bVar40 = (byte)((ulong)uVar84 >> 0x10) | bVar40;
              bVar41 = (byte)((ulong)uVar84 >> 0x18) | bVar41;
              bVar42 = (byte)((ulong)uVar84 >> 0x20) | bVar42;
              bVar43 = (byte)((ulong)uVar84 >> 0x28) | bVar43;
              bVar44 = (byte)((ulong)uVar84 >> 0x30) | bVar44;
              bVar45 = (byte)((ulong)uVar84 >> 0x38) | bVar45;
              bVar46 = (byte)uVar85 | (byte)uVar12;
              bVar47 = (byte)((ulong)uVar85 >> 8) | (byte)((ulong)uVar12 >> 8);
              bVar48 = (byte)((ulong)uVar85 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
              bVar49 = (byte)((ulong)uVar85 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
              bVar50 = (byte)((ulong)uVar85 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
              bVar51 = (byte)((ulong)uVar85 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
              bVar52 = (byte)((ulong)uVar85 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
              bVar53 = (byte)((ulong)uVar85 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
              uVar12 = CONCAT17(bVar53,CONCAT16(bVar52,CONCAT15(bVar51,CONCAT14(bVar50,CONCAT13(
                                                  bVar49,CONCAT12(bVar48,CONCAT11(bVar47,bVar46)))))
                                               ));
              bVar54 = (byte)uVar86 | (byte)uVar55;
              bVar56 = (byte)((ulong)uVar86 >> 8) | (byte)((ulong)uVar55 >> 8);
              bVar57 = (byte)((ulong)uVar86 >> 0x10) | (byte)((ulong)uVar55 >> 0x10);
              bVar58 = (byte)((ulong)uVar86 >> 0x18) | (byte)((ulong)uVar55 >> 0x18);
              bVar59 = (byte)((ulong)uVar86 >> 0x20) | (byte)((ulong)uVar55 >> 0x20);
              bVar60 = (byte)((ulong)uVar86 >> 0x28) | (byte)((ulong)uVar55 >> 0x28);
              bVar61 = (byte)((ulong)uVar86 >> 0x30) | (byte)((ulong)uVar55 >> 0x30);
              bVar62 = (byte)((ulong)uVar86 >> 0x38) | (byte)((ulong)uVar55 >> 0x38);
              uVar55 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,CONCAT13(
                                                  bVar58,CONCAT12(bVar57,CONCAT11(bVar56,bVar54)))))
                                               ));
              bVar63 = (byte)uVar87 | (byte)uVar64;
              bVar65 = (byte)((ulong)uVar87 >> 8) | (byte)((ulong)uVar64 >> 8);
              bVar66 = (byte)((ulong)uVar87 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
              bVar67 = (byte)((ulong)uVar87 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
              bVar68 = (byte)((ulong)uVar87 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
              bVar69 = (byte)((ulong)uVar87 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
              bVar70 = (byte)((ulong)uVar87 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
              bVar71 = (byte)((ulong)uVar87 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
              uVar64 = CONCAT17(bVar71,CONCAT16(bVar70,CONCAT15(bVar69,CONCAT14(bVar68,CONCAT13(
                                                  bVar67,CONCAT12(bVar66,CONCAT11(bVar65,bVar63)))))
                                               ));
              bVar72 = (byte)uVar88 | (byte)uVar73;
              bVar74 = (byte)((ulong)uVar88 >> 8) | (byte)((ulong)uVar73 >> 8);
              bVar75 = (byte)((ulong)uVar88 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
              bVar76 = (byte)((ulong)uVar88 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
              bVar77 = (byte)((ulong)uVar88 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
              bVar78 = (byte)((ulong)uVar88 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
              bVar79 = (byte)((ulong)uVar88 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
              bVar80 = (byte)((ulong)uVar88 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
              uVar73 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(
                                                  bVar76,CONCAT12(bVar75,CONCAT11(bVar74,bVar72)))))
                                               ));
              uVar10 = uVar10 - 8;
              puVar11 = puVar11 + 8;
            } while (uVar10 != 0);
            bVar63 = bVar63 | bVar46 | bVar29 | bVar13;
            bVar65 = bVar65 | bVar47 | bVar31 | bVar14;
            bVar66 = bVar66 | bVar48 | bVar32 | bVar15;
            bVar67 = bVar67 | bVar49 | bVar33 | bVar16;
            bVar68 = bVar68 | bVar50 | bVar34 | bVar17;
            bVar69 = bVar69 | bVar51 | bVar35 | bVar18;
            bVar70 = bVar70 | bVar52 | bVar36 | bVar19;
            bVar71 = bVar71 | bVar53 | bVar37 | bVar20;
            bVar72 = bVar72 | bVar54 | bVar38 | bVar21;
            bVar74 = bVar74 | bVar56 | bVar39 | bVar22;
            bVar75 = bVar75 | bVar57 | bVar40 | bVar23;
            bVar76 = bVar76 | bVar58 | bVar41 | bVar24;
            bVar77 = bVar77 | bVar59 | bVar42 | bVar25;
            bVar78 = bVar78 | bVar60 | bVar43 | bVar26;
            bVar79 = bVar79 | bVar61 | bVar44 | bVar27;
            bVar80 = bVar80 | bVar62 | bVar45 | bVar28;
            auVar30[1] = bVar65;
            auVar30[0] = bVar63;
            auVar30[2] = bVar66;
            auVar30[3] = bVar67;
            auVar30[4] = bVar68;
            auVar30[5] = bVar69;
            auVar30[6] = bVar70;
            auVar30[7] = bVar71;
            auVar30[8] = bVar72;
            auVar30[9] = bVar74;
            auVar30[10] = bVar75;
            auVar30[0xb] = bVar76;
            auVar30[0xc] = bVar77;
            auVar30[0xd] = bVar78;
            auVar30[0xe] = bVar79;
            auVar30[0xf] = bVar80;
            auVar2[1] = bVar65;
            auVar2[0] = bVar63;
            auVar2[2] = bVar66;
            auVar2[3] = bVar67;
            auVar2[4] = bVar68;
            auVar2[5] = bVar69;
            auVar2[6] = bVar70;
            auVar2[7] = bVar71;
            auVar2[8] = bVar72;
            auVar2[9] = bVar74;
            auVar2[10] = bVar75;
            auVar2[0xb] = bVar76;
            auVar2[0xc] = bVar77;
            auVar2[0xd] = bVar78;
            auVar2[0xe] = bVar79;
            auVar2[0xf] = bVar80;
            auVar30 = NEON_ext(auVar30,auVar2,8,1);
            uVar10 = CONCAT17(bVar71 | auVar30[7],
                              CONCAT16(bVar70 | auVar30[6],
                                       CONCAT15(bVar69 | auVar30[5],
                                                CONCAT14(bVar68 | auVar30[4],
                                                         CONCAT13(bVar67 | auVar30[3],
                                                                  CONCAT12(bVar66 | auVar30[2],
                                                                           CONCAT11(bVar65 | auVar30
                                                  [1],bVar63 | auVar30[0])))))));
            if (uVar9 != uVar8) goto LAB_002d383c;
          }
          if (uVar10 != 0) {
            iVar3 = func_0x0029ad98(unaff_x24,unaff_x23 + 0x28,unaff_x24);
            if (iVar3 == 0) goto LAB_002d38ac;
            uVar4 = *(uint *)(unaff_x24 + 1);
            goto joined_r0x002d3878;
          }
        }
        func_0x0028f83c(0xf,0,0x6c,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x180);
        cVar1 = *(char *)(unaff_x19 + 0x28);
        goto joined_r0x002d3964;
      }
joined_r0x002d3878:
      if ((int)uVar4 < 1) {
        uVar4 = 0;
      }
      else {
        uVar4 = *(uint *)*unaff_x24 & 1;
      }
      if (uVar4 != in_stack_00000010._4_4_) {
        func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x188);
        cVar1 = *(char *)(unaff_x19 + 0x28);
        goto joined_r0x002d3964;
      }
      uVar12 = func_0x002c8d10();
      cVar1 = *(char *)(unaff_x19 + 0x28);
      goto joined_r0x002d38b4;
    }
    uVar4 = func_0x0028ef5c();
    if ((uVar4 & 0xff000fff) == 0x300006e) {
      func_0x0028f0e4();
      func_0x0028f83c(0xf,0,0x6b,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x177);
      cVar1 = *(char *)(unaff_x19 + 0x28);
    }
    else {
      func_0x0028f83c(0xf,0,3,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x179);
      cVar1 = *(char *)(unaff_x19 + 0x28);
    }
joined_r0x002d3964:
    uVar12 = 0;
    if (cVar1 == '\0') goto LAB_002d38b8;
LAB_002d38d4:
    if (unaff_x20 != (undefined8 *)0x0) {
      if ((unaff_x20[4] != 0) && (*(char *)(unaff_x20 + 5) == '\0')) {
        func_0x0079db28();
        goto code_r0x002d3970;
      }
      func_0x00373520(*unaff_x20,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(unaff_x20[1]);
      func_0x0036e3d8();
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return uVar12;
    }
  }
  ___stack_chk_fail();
  func_0x00373e9c(0xa29548,&DAT_002d39a4);
  return 0xa3ab08;
}

