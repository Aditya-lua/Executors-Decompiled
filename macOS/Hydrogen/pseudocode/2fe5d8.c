
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002fe5d8(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  char *pcVar7;
  undefined8 uVar8;
  undefined1 (*in_x9) [16];
  undefined1 (*pauVar9) [16];
  long *plVar10;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  byte *pbVar18;
  uint uVar19;
  uint uVar20;
  undefined1 (*pauVar21) [16];
  ulong uVar22;
  char *pcVar23;
  char *unaff_x19;
  long *unaff_x20;
  undefined8 *puVar24;
  bool bVar25;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  byte bVar26;
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
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  byte bVar48;
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  byte bVar49;
  undefined8 uVar50;
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
  undefined1 auVar51 [16];
  byte bVar66;
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
  byte bVar82;
  byte bVar83;
  byte bVar85;
  byte bVar86;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  undefined8 uVar84;
  byte bVar91;
  byte bVar92;
  byte bVar94;
  byte bVar95;
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  undefined8 uVar93;
  byte bVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined8 uVar105;
  undefined8 uVar106;
  undefined8 uVar107;
  undefined8 uVar108;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined4 in_stack_00000d20;
  undefined4 in_stack_00000d24;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  char acStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  uVar12 = param_1 - 0x20;
  if (uVar12 < 0x40) {
    bVar26 = 0;
    uVar13 = 0;
LAB_002fe6a8:
    auVar51 = ZEXT116(bVar26);
    lVar14 = (uVar13 + 0x20) - param_1;
    puVar24 = (undefined8 *)(in_x9[2] + uVar13);
    do {
      uVar50 = *puVar24;
      auVar51._0_8_ =
           CONCAT17((byte)((ulong)uVar50 >> 0x38) | auVar51[7],
                    CONCAT16((byte)((ulong)uVar50 >> 0x30) | auVar51[6],
                             CONCAT15((byte)((ulong)uVar50 >> 0x28) | auVar51[5],
                                      CONCAT14((byte)((ulong)uVar50 >> 0x20) | auVar51[4],
                                               CONCAT13((byte)((ulong)uVar50 >> 0x18) | auVar51[3],
                                                        CONCAT12((byte)((ulong)uVar50 >> 0x10) |
                                                                 auVar51[2],
                                                                 CONCAT11((byte)((ulong)uVar50 >> 8)
                                                                          | auVar51[1],
                                                                          (byte)uVar50 | auVar51[0])
                                                                ))))));
      auVar51._8_8_ = 0;
      lVar14 = lVar14 + 8;
      puVar24 = puVar24 + 1;
    } while (lVar14 != 0);
    uVar15 = auVar51._0_8_ | auVar51._0_8_ >> 0x20;
    uVar15 = uVar15 | uVar15 >> 0x10;
    uVar19 = (uint)uVar15 | (uint)(uVar15 >> 8);
  }
  else {
    uVar13 = uVar12 & 0xffffffffffffffc0;
    pauVar9 = in_x9 + 5;
    bVar26 = 0;
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
    uVar50 = 0;
    uVar8 = 0;
    uVar84 = 0;
    uVar93 = 0;
    uVar15 = uVar13;
    do {
      uVar102 = *(undefined8 *)(pauVar9[-3] + 8);
      uVar101 = *(undefined8 *)pauVar9[-3];
      uVar104 = *(undefined8 *)(pauVar9[-2] + 8);
      uVar103 = *(undefined8 *)pauVar9[-2];
      uVar106 = *(undefined8 *)(pauVar9[-1] + 8);
      uVar105 = *(undefined8 *)pauVar9[-1];
      uVar108 = *(undefined8 *)(*pauVar9 + 8);
      uVar107 = *(undefined8 *)*pauVar9;
      bVar26 = (byte)uVar101 | bVar26;
      bVar34 = (byte)((ulong)uVar101 >> 8) | bVar34;
      bVar35 = (byte)((ulong)uVar101 >> 0x10) | bVar35;
      bVar36 = (byte)((ulong)uVar101 >> 0x18) | bVar36;
      bVar37 = (byte)((ulong)uVar101 >> 0x20) | bVar37;
      bVar38 = (byte)((ulong)uVar101 >> 0x28) | bVar38;
      bVar39 = (byte)((ulong)uVar101 >> 0x30) | bVar39;
      bVar40 = (byte)((ulong)uVar101 >> 0x38) | bVar40;
      bVar41 = (byte)uVar102 | bVar41;
      bVar42 = (byte)((ulong)uVar102 >> 8) | bVar42;
      bVar43 = (byte)((ulong)uVar102 >> 0x10) | bVar43;
      bVar44 = (byte)((ulong)uVar102 >> 0x18) | bVar44;
      bVar45 = (byte)((ulong)uVar102 >> 0x20) | bVar45;
      bVar46 = (byte)((ulong)uVar102 >> 0x28) | bVar46;
      bVar47 = (byte)((ulong)uVar102 >> 0x30) | bVar47;
      bVar48 = (byte)((ulong)uVar102 >> 0x38) | bVar48;
      bVar49 = (byte)uVar103 | bVar49;
      bVar52 = (byte)((ulong)uVar103 >> 8) | bVar52;
      bVar53 = (byte)((ulong)uVar103 >> 0x10) | bVar53;
      bVar54 = (byte)((ulong)uVar103 >> 0x18) | bVar54;
      bVar55 = (byte)((ulong)uVar103 >> 0x20) | bVar55;
      bVar56 = (byte)((ulong)uVar103 >> 0x28) | bVar56;
      bVar57 = (byte)((ulong)uVar103 >> 0x30) | bVar57;
      bVar58 = (byte)((ulong)uVar103 >> 0x38) | bVar58;
      bVar59 = (byte)uVar104 | bVar59;
      bVar60 = (byte)((ulong)uVar104 >> 8) | bVar60;
      bVar61 = (byte)((ulong)uVar104 >> 0x10) | bVar61;
      bVar62 = (byte)((ulong)uVar104 >> 0x18) | bVar62;
      bVar63 = (byte)((ulong)uVar104 >> 0x20) | bVar63;
      bVar64 = (byte)((ulong)uVar104 >> 0x28) | bVar64;
      bVar65 = (byte)((ulong)uVar104 >> 0x30) | bVar65;
      bVar66 = (byte)((ulong)uVar104 >> 0x38) | bVar66;
      bVar67 = (byte)uVar105 | (byte)uVar50;
      bVar68 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar50 >> 8);
      bVar69 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
      bVar70 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
      bVar71 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
      bVar72 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
      bVar73 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
      bVar74 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
      uVar50 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))));
      bVar75 = (byte)uVar106 | (byte)uVar8;
      bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar8 >> 8);
      bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
      bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
      bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
      bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
      bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
      bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
      uVar8 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar75)))))));
      bVar83 = (byte)uVar107 | (byte)uVar84;
      bVar85 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar84 >> 8);
      bVar86 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar84 >> 0x10);
      bVar87 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar84 >> 0x18);
      bVar88 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar84 >> 0x20);
      bVar89 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar84 >> 0x28);
      bVar90 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar84 >> 0x30);
      bVar91 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar84 >> 0x38);
      uVar84 = CONCAT17(bVar91,CONCAT16(bVar90,CONCAT15(bVar89,CONCAT14(bVar88,CONCAT13(bVar87,
                                                  CONCAT12(bVar86,CONCAT11(bVar85,bVar83)))))));
      bVar92 = (byte)uVar108 | (byte)uVar93;
      bVar94 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar93 >> 8);
      bVar95 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
      bVar96 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
      bVar97 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
      bVar98 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
      bVar99 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
      bVar100 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
      uVar93 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(bVar96,
                                                  CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))));
      pauVar9 = pauVar9 + 4;
      uVar15 = uVar15 - 0x40;
    } while (uVar15 != 0);
    auVar33[0] = bVar83 | bVar67 | bVar49 | bVar26;
    auVar33[1] = bVar85 | bVar68 | bVar52 | bVar34;
    auVar33[2] = bVar86 | bVar69 | bVar53 | bVar35;
    auVar33[3] = bVar87 | bVar70 | bVar54 | bVar36;
    auVar33[4] = bVar88 | bVar71 | bVar55 | bVar37;
    auVar33[5] = bVar89 | bVar72 | bVar56 | bVar38;
    auVar33[6] = bVar90 | bVar73 | bVar57 | bVar39;
    auVar33[7] = bVar91 | bVar74 | bVar58 | bVar40;
    auVar33[8] = bVar92 | bVar75 | bVar59 | bVar41;
    auVar33[9] = bVar94 | bVar76 | bVar60 | bVar42;
    auVar33[10] = bVar95 | bVar77 | bVar61 | bVar43;
    auVar33[0xb] = bVar96 | bVar78 | bVar62 | bVar44;
    auVar33[0xc] = bVar97 | bVar79 | bVar63 | bVar45;
    auVar33[0xd] = bVar98 | bVar80 | bVar64 | bVar46;
    auVar33[0xe] = bVar99 | bVar81 | bVar65 | bVar47;
    auVar33[0xf] = bVar100 | bVar82 | bVar66 | bVar48;
    auVar51 = NEON_ext(auVar33,auVar33,8,1);
    uVar15 = CONCAT17(auVar33[7] | auVar51[7],
                      CONCAT16(auVar33[6] | auVar51[6],
                               CONCAT15(auVar33[5] | auVar51[5],
                                        CONCAT14(auVar33[4] | auVar51[4],
                                                 CONCAT13(auVar33[3] | auVar51[3],
                                                          CONCAT12(auVar33[2] | auVar51[2],
                                                                   CONCAT11(auVar33[1] | auVar51[1],
                                                                            auVar33[0] | auVar51[0])
                                                                  ))))));
    uVar15 = uVar15 | uVar15 >> 0x20;
    uVar15 = uVar15 | uVar15 >> 0x10;
    uVar19 = (uint)uVar15 | (uint)(uVar15 >> 8);
    bVar26 = (byte)uVar19;
    if (uVar12 != uVar13) {
      if ((uVar12 & 0x38) != 0) goto LAB_002fe6a8;
      lVar14 = (param_1 - uVar13) + -0x20;
      pbVar18 = *in_x9 + (uVar13 | 0x20);
      do {
        uVar19 = *pbVar18 | uVar19;
        lVar14 = lVar14 + -1;
        pbVar18 = pbVar18 + 1;
      } while (lVar14 != 0);
    }
  }
  if ((uVar19 & 0xff) == 0) {
    if (uVar12 < 0x40) {
      bVar26 = 0;
      uVar13 = 0;
LAB_002fe774:
      auVar28 = ZEXT116(bVar26);
      lVar14 = (uVar13 + 0x20) - param_1;
      puVar24 = (undefined8 *)(in_x9[2] + uVar13);
      do {
        uVar50 = *puVar24;
        auVar28._0_8_ =
             CONCAT17((byte)((ulong)uVar50 >> 0x38) | auVar28[7],
                      CONCAT16((byte)((ulong)uVar50 >> 0x30) | auVar28[6],
                               CONCAT15((byte)((ulong)uVar50 >> 0x28) | auVar28[5],
                                        CONCAT14((byte)((ulong)uVar50 >> 0x20) | auVar28[4],
                                                 CONCAT13((byte)((ulong)uVar50 >> 0x18) | auVar28[3]
                                                          ,CONCAT12((byte)((ulong)uVar50 >> 0x10) |
                                                                    auVar28[2],
                                                                    CONCAT11((byte)((ulong)uVar50 >>
                                                                                   8) | auVar28[1],
                                                                             (byte)uVar50 |
                                                                             auVar28[0])))))));
        auVar28._8_8_ = 0;
        lVar14 = lVar14 + 8;
        puVar24 = puVar24 + 1;
      } while (lVar14 != 0);
      uVar12 = auVar28._0_8_ | auVar28._0_8_ >> 0x20;
      uVar12 = uVar12 | uVar12 >> 0x10;
      uVar19 = (uint)uVar12 | (uint)(uVar12 >> 8);
    }
    else {
      uVar13 = uVar12 & 0xffffffffffffffc0;
      pauVar9 = in_x9 + 5;
      bVar26 = 0;
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
      uVar50 = 0;
      uVar8 = 0;
      uVar84 = 0;
      uVar93 = 0;
      uVar15 = uVar13;
      do {
        uVar102 = *(undefined8 *)(pauVar9[-3] + 8);
        uVar101 = *(undefined8 *)pauVar9[-3];
        uVar104 = *(undefined8 *)(pauVar9[-2] + 8);
        uVar103 = *(undefined8 *)pauVar9[-2];
        uVar106 = *(undefined8 *)(pauVar9[-1] + 8);
        uVar105 = *(undefined8 *)pauVar9[-1];
        uVar108 = *(undefined8 *)(*pauVar9 + 8);
        uVar107 = *(undefined8 *)*pauVar9;
        bVar26 = (byte)uVar101 | bVar26;
        bVar34 = (byte)((ulong)uVar101 >> 8) | bVar34;
        bVar35 = (byte)((ulong)uVar101 >> 0x10) | bVar35;
        bVar36 = (byte)((ulong)uVar101 >> 0x18) | bVar36;
        bVar37 = (byte)((ulong)uVar101 >> 0x20) | bVar37;
        bVar38 = (byte)((ulong)uVar101 >> 0x28) | bVar38;
        bVar39 = (byte)((ulong)uVar101 >> 0x30) | bVar39;
        bVar40 = (byte)((ulong)uVar101 >> 0x38) | bVar40;
        bVar41 = (byte)uVar102 | bVar41;
        bVar42 = (byte)((ulong)uVar102 >> 8) | bVar42;
        bVar43 = (byte)((ulong)uVar102 >> 0x10) | bVar43;
        bVar44 = (byte)((ulong)uVar102 >> 0x18) | bVar44;
        bVar45 = (byte)((ulong)uVar102 >> 0x20) | bVar45;
        bVar46 = (byte)((ulong)uVar102 >> 0x28) | bVar46;
        bVar47 = (byte)((ulong)uVar102 >> 0x30) | bVar47;
        bVar48 = (byte)((ulong)uVar102 >> 0x38) | bVar48;
        bVar49 = (byte)uVar103 | bVar49;
        bVar52 = (byte)((ulong)uVar103 >> 8) | bVar52;
        bVar53 = (byte)((ulong)uVar103 >> 0x10) | bVar53;
        bVar54 = (byte)((ulong)uVar103 >> 0x18) | bVar54;
        bVar55 = (byte)((ulong)uVar103 >> 0x20) | bVar55;
        bVar56 = (byte)((ulong)uVar103 >> 0x28) | bVar56;
        bVar57 = (byte)((ulong)uVar103 >> 0x30) | bVar57;
        bVar58 = (byte)((ulong)uVar103 >> 0x38) | bVar58;
        bVar59 = (byte)uVar104 | bVar59;
        bVar60 = (byte)((ulong)uVar104 >> 8) | bVar60;
        bVar61 = (byte)((ulong)uVar104 >> 0x10) | bVar61;
        bVar62 = (byte)((ulong)uVar104 >> 0x18) | bVar62;
        bVar63 = (byte)((ulong)uVar104 >> 0x20) | bVar63;
        bVar64 = (byte)((ulong)uVar104 >> 0x28) | bVar64;
        bVar65 = (byte)((ulong)uVar104 >> 0x30) | bVar65;
        bVar66 = (byte)((ulong)uVar104 >> 0x38) | bVar66;
        bVar67 = (byte)uVar105 | (byte)uVar50;
        bVar68 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar50 >> 8);
        bVar69 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
        bVar70 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
        bVar71 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
        bVar72 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
        bVar73 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
        bVar74 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
        uVar50 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))));
        bVar75 = (byte)uVar106 | (byte)uVar8;
        bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar8 >> 8);
        bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
        bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
        bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
        bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
        bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
        bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
        uVar8 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar75)))))));
        bVar83 = (byte)uVar107 | (byte)uVar84;
        bVar85 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar84 >> 8);
        bVar86 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar84 >> 0x10);
        bVar87 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar84 >> 0x18);
        bVar88 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar84 >> 0x20);
        bVar89 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar84 >> 0x28);
        bVar90 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar84 >> 0x30);
        bVar91 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar84 >> 0x38);
        uVar84 = CONCAT17(bVar91,CONCAT16(bVar90,CONCAT15(bVar89,CONCAT14(bVar88,CONCAT13(bVar87,
                                                  CONCAT12(bVar86,CONCAT11(bVar85,bVar83)))))));
        bVar92 = (byte)uVar108 | (byte)uVar93;
        bVar94 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar93 >> 8);
        bVar95 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
        bVar96 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
        bVar97 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
        bVar98 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
        bVar99 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
        bVar100 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
        uVar93 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(bVar96,
                                                  CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))));
        pauVar9 = pauVar9 + 4;
        uVar15 = uVar15 - 0x40;
      } while (uVar15 != 0);
      auVar27[0] = bVar83 | bVar67 | bVar49 | bVar26;
      auVar27[1] = bVar85 | bVar68 | bVar52 | bVar34;
      auVar27[2] = bVar86 | bVar69 | bVar53 | bVar35;
      auVar27[3] = bVar87 | bVar70 | bVar54 | bVar36;
      auVar27[4] = bVar88 | bVar71 | bVar55 | bVar37;
      auVar27[5] = bVar89 | bVar72 | bVar56 | bVar38;
      auVar27[6] = bVar90 | bVar73 | bVar57 | bVar39;
      auVar27[7] = bVar91 | bVar74 | bVar58 | bVar40;
      auVar27[8] = bVar92 | bVar75 | bVar59 | bVar41;
      auVar27[9] = bVar94 | bVar76 | bVar60 | bVar42;
      auVar27[10] = bVar95 | bVar77 | bVar61 | bVar43;
      auVar27[0xb] = bVar96 | bVar78 | bVar62 | bVar44;
      auVar27[0xc] = bVar97 | bVar79 | bVar63 | bVar45;
      auVar27[0xd] = bVar98 | bVar80 | bVar64 | bVar46;
      auVar27[0xe] = bVar99 | bVar81 | bVar65 | bVar47;
      auVar27[0xf] = bVar100 | bVar82 | bVar66 | bVar48;
      auVar33 = NEON_ext(auVar27,auVar27,8,1);
      uVar15 = CONCAT17(auVar27[7] | auVar33[7],
                        CONCAT16(auVar27[6] | auVar33[6],
                                 CONCAT15(auVar27[5] | auVar33[5],
                                          CONCAT14(auVar27[4] | auVar33[4],
                                                   CONCAT13(auVar27[3] | auVar33[3],
                                                            CONCAT12(auVar27[2] | auVar33[2],
                                                                     CONCAT11(auVar27[1] |
                                                                              auVar33[1],
                                                                              auVar27[0] |
                                                                              auVar33[0])))))));
      uVar15 = uVar15 | uVar15 >> 0x20;
      uVar15 = uVar15 | uVar15 >> 0x10;
      uVar19 = (uint)uVar15 | (uint)(uVar15 >> 8);
      bVar26 = (byte)uVar19;
      if (uVar12 != uVar13) {
        if ((uVar12 & 0x38) != 0) goto LAB_002fe774;
        lVar14 = (param_1 - uVar13) + -0x20;
        pbVar18 = *in_x9 + (uVar13 | 0x20);
        do {
          uVar19 = *pbVar18 | uVar19;
          lVar14 = lVar14 + -1;
          pbVar18 = pbVar18 + 1;
        } while (lVar14 != 0);
      }
    }
    if ((uVar19 & 0xff) != 0) {
      func_0x0079dae0();
      goto LAB_002ff884;
    }
    uVar12 = param_1;
    if (0x1f < param_1) {
      uVar12 = 0x20;
    }
    if (uVar12 != 0) {
      if ((acStack_7ffffffe + (0x8000135e - uVar12) < *in_x9 + uVar12) &&
         (in_x9 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000135e))) {
        uVar15 = 0;
LAB_002fe7f0:
        lVar14 = uVar12 - uVar15;
        pcVar7 = *in_x9 + uVar15;
        pcVar23 = acStack_7ffffffe + (0x8000135d - uVar15);
        do {
          *pcVar23 = *pcVar7;
          lVar14 = lVar14 + -1;
          pcVar7 = pcVar7 + 1;
          pcVar23 = pcVar23 + -1;
        } while (lVar14 != 0);
      }
      else {
        if (uVar12 < 0x10) {
          uVar15 = 0;
        }
        else {
          uVar15 = uVar12 & 0x30;
          auVar33 = NEON_rev64(*in_x9,1);
          auVar33 = NEON_ext(auVar33,auVar33,8,1);
          unaff_x25[0x67] = auVar33._8_8_;
          unaff_x25[0x66] = auVar33._0_8_;
          if (uVar15 != 0x10) {
            auVar33 = NEON_rev64(in_x9[1],1);
            auVar33 = NEON_ext(auVar33,auVar33,8,1);
            unaff_x25[0x65] = auVar33._8_8_;
            unaff_x25[100] = auVar33._0_8_;
          }
          if (uVar12 == uVar15) goto LAB_002fe890;
          if (((uint)uVar12 >> 3 & 1) == 0) goto LAB_002fe7f0;
        }
        lVar14 = uVar12 - uVar15;
        puVar24 = (undefined8 *)(*in_x9 + uVar15);
        pcVar7 = acStack_7ffffffe + (0x80001356 - uVar15);
        do {
          uVar50 = NEON_rev64(*puVar24,1);
          *(undefined8 *)pcVar7 = uVar50;
          lVar14 = lVar14 + -8;
          puVar24 = puVar24 + 1;
          pcVar7 = pcVar7 + -8;
        } while (lVar14 != 0);
      }
    }
LAB_002fe890:
    if (param_1 < 0x20) {
      ___memset_chk(acStack_7ffffffe + 0x8000133e,0,0x20 - uVar12,0x40);
    }
    pauVar9 = *(undefined1 (**) [16])unaff_x20[1];
    lVar14 = (long)*(int *)((undefined8 *)unaff_x20[1] + 1);
    uVar12 = lVar14 * 8;
    if (0x20 < uVar12) {
      uVar15 = uVar12 - 0x20;
      if (uVar15 < 0x40) {
        bVar26 = 0;
        uVar16 = 0;
LAB_002fe95c:
        auVar30 = ZEXT116(bVar26);
        lVar17 = uVar16 + 0x20 + lVar14 * -8;
        puVar24 = (undefined8 *)(pauVar9[2] + uVar16);
        do {
          uVar50 = *puVar24;
          auVar30._0_8_ =
               CONCAT17((byte)((ulong)uVar50 >> 0x38) | auVar30[7],
                        CONCAT16((byte)((ulong)uVar50 >> 0x30) | auVar30[6],
                                 CONCAT15((byte)((ulong)uVar50 >> 0x28) | auVar30[5],
                                          CONCAT14((byte)((ulong)uVar50 >> 0x20) | auVar30[4],
                                                   CONCAT13((byte)((ulong)uVar50 >> 0x18) |
                                                            auVar30[3],
                                                            CONCAT12((byte)((ulong)uVar50 >> 0x10) |
                                                                     auVar30[2],
                                                                     CONCAT11((byte)((ulong)uVar50
                                                                                    >> 8) |
                                                                              auVar30[1],
                                                                              (byte)uVar50 |
                                                                              auVar30[0])))))));
          auVar30._8_8_ = 0;
          lVar17 = lVar17 + 8;
          puVar24 = puVar24 + 1;
        } while (lVar17 != 0);
        uVar13 = auVar30._0_8_ | auVar30._0_8_ >> 0x20;
        uVar13 = uVar13 | uVar13 >> 0x10;
        uVar19 = (uint)uVar13 | (uint)(uVar13 >> 8);
      }
      else {
        uVar16 = uVar15 & 0xffffffffffffffc0;
        pauVar21 = pauVar9 + 5;
        bVar26 = 0;
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
        uVar50 = 0;
        uVar8 = 0;
        uVar84 = 0;
        uVar93 = 0;
        uVar13 = uVar16;
        do {
          uVar102 = *(undefined8 *)(pauVar21[-3] + 8);
          uVar101 = *(undefined8 *)pauVar21[-3];
          uVar104 = *(undefined8 *)(pauVar21[-2] + 8);
          uVar103 = *(undefined8 *)pauVar21[-2];
          uVar106 = *(undefined8 *)(pauVar21[-1] + 8);
          uVar105 = *(undefined8 *)pauVar21[-1];
          uVar108 = *(undefined8 *)(*pauVar21 + 8);
          uVar107 = *(undefined8 *)*pauVar21;
          bVar26 = (byte)uVar101 | bVar26;
          bVar34 = (byte)((ulong)uVar101 >> 8) | bVar34;
          bVar35 = (byte)((ulong)uVar101 >> 0x10) | bVar35;
          bVar36 = (byte)((ulong)uVar101 >> 0x18) | bVar36;
          bVar37 = (byte)((ulong)uVar101 >> 0x20) | bVar37;
          bVar38 = (byte)((ulong)uVar101 >> 0x28) | bVar38;
          bVar39 = (byte)((ulong)uVar101 >> 0x30) | bVar39;
          bVar40 = (byte)((ulong)uVar101 >> 0x38) | bVar40;
          bVar41 = (byte)uVar102 | bVar41;
          bVar42 = (byte)((ulong)uVar102 >> 8) | bVar42;
          bVar43 = (byte)((ulong)uVar102 >> 0x10) | bVar43;
          bVar44 = (byte)((ulong)uVar102 >> 0x18) | bVar44;
          bVar45 = (byte)((ulong)uVar102 >> 0x20) | bVar45;
          bVar46 = (byte)((ulong)uVar102 >> 0x28) | bVar46;
          bVar47 = (byte)((ulong)uVar102 >> 0x30) | bVar47;
          bVar48 = (byte)((ulong)uVar102 >> 0x38) | bVar48;
          bVar49 = (byte)uVar103 | bVar49;
          bVar52 = (byte)((ulong)uVar103 >> 8) | bVar52;
          bVar53 = (byte)((ulong)uVar103 >> 0x10) | bVar53;
          bVar54 = (byte)((ulong)uVar103 >> 0x18) | bVar54;
          bVar55 = (byte)((ulong)uVar103 >> 0x20) | bVar55;
          bVar56 = (byte)((ulong)uVar103 >> 0x28) | bVar56;
          bVar57 = (byte)((ulong)uVar103 >> 0x30) | bVar57;
          bVar58 = (byte)((ulong)uVar103 >> 0x38) | bVar58;
          bVar59 = (byte)uVar104 | bVar59;
          bVar60 = (byte)((ulong)uVar104 >> 8) | bVar60;
          bVar61 = (byte)((ulong)uVar104 >> 0x10) | bVar61;
          bVar62 = (byte)((ulong)uVar104 >> 0x18) | bVar62;
          bVar63 = (byte)((ulong)uVar104 >> 0x20) | bVar63;
          bVar64 = (byte)((ulong)uVar104 >> 0x28) | bVar64;
          bVar65 = (byte)((ulong)uVar104 >> 0x30) | bVar65;
          bVar66 = (byte)((ulong)uVar104 >> 0x38) | bVar66;
          bVar67 = (byte)uVar105 | (byte)uVar50;
          bVar68 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar50 >> 8);
          bVar69 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
          bVar70 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
          bVar71 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
          bVar72 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
          bVar73 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
          bVar74 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
          uVar50 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))));
          bVar75 = (byte)uVar106 | (byte)uVar8;
          bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar8 >> 8);
          bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
          bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
          bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
          bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
          bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
          bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
          uVar8 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar75)))))));
          bVar83 = (byte)uVar107 | (byte)uVar84;
          bVar85 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar84 >> 8);
          bVar86 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar84 >> 0x10);
          bVar87 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar84 >> 0x18);
          bVar88 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar84 >> 0x20);
          bVar89 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar84 >> 0x28);
          bVar90 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar84 >> 0x30);
          bVar91 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar84 >> 0x38);
          uVar84 = CONCAT17(bVar91,CONCAT16(bVar90,CONCAT15(bVar89,CONCAT14(bVar88,CONCAT13(bVar87,
                                                  CONCAT12(bVar86,CONCAT11(bVar85,bVar83)))))));
          bVar92 = (byte)uVar108 | (byte)uVar93;
          bVar94 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar93 >> 8);
          bVar95 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
          bVar96 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
          bVar97 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
          bVar98 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
          bVar99 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
          bVar100 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
          uVar93 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(bVar96,
                                                  CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))));
          pauVar21 = pauVar21 + 4;
          uVar13 = uVar13 - 0x40;
        } while (uVar13 != 0);
        auVar29[0] = bVar83 | bVar67 | bVar49 | bVar26;
        auVar29[1] = bVar85 | bVar68 | bVar52 | bVar34;
        auVar29[2] = bVar86 | bVar69 | bVar53 | bVar35;
        auVar29[3] = bVar87 | bVar70 | bVar54 | bVar36;
        auVar29[4] = bVar88 | bVar71 | bVar55 | bVar37;
        auVar29[5] = bVar89 | bVar72 | bVar56 | bVar38;
        auVar29[6] = bVar90 | bVar73 | bVar57 | bVar39;
        auVar29[7] = bVar91 | bVar74 | bVar58 | bVar40;
        auVar29[8] = bVar92 | bVar75 | bVar59 | bVar41;
        auVar29[9] = bVar94 | bVar76 | bVar60 | bVar42;
        auVar29[10] = bVar95 | bVar77 | bVar61 | bVar43;
        auVar29[0xb] = bVar96 | bVar78 | bVar62 | bVar44;
        auVar29[0xc] = bVar97 | bVar79 | bVar63 | bVar45;
        auVar29[0xd] = bVar98 | bVar80 | bVar64 | bVar46;
        auVar29[0xe] = bVar99 | bVar81 | bVar65 | bVar47;
        auVar29[0xf] = bVar100 | bVar82 | bVar66 | bVar48;
        auVar33 = NEON_ext(auVar29,auVar29,8,1);
        uVar13 = CONCAT17(auVar29[7] | auVar33[7],
                          CONCAT16(auVar29[6] | auVar33[6],
                                   CONCAT15(auVar29[5] | auVar33[5],
                                            CONCAT14(auVar29[4] | auVar33[4],
                                                     CONCAT13(auVar29[3] | auVar33[3],
                                                              CONCAT12(auVar29[2] | auVar33[2],
                                                                       CONCAT11(auVar29[1] |
                                                                                auVar33[1],
                                                                                auVar29[0] |
                                                                                auVar33[0])))))));
        uVar13 = uVar13 | uVar13 >> 0x20;
        uVar13 = uVar13 | uVar13 >> 0x10;
        uVar19 = (uint)uVar13 | (uint)(uVar13 >> 8);
        bVar26 = (byte)uVar19;
        if (uVar15 != uVar16) {
          if ((uVar15 & 0x38) != 0) goto LAB_002fe95c;
          lVar17 = (uVar12 - uVar16) + -0x20;
          pbVar18 = *pauVar9 + (uVar16 | 0x20);
          do {
            uVar19 = *pbVar18 | uVar19;
            lVar17 = lVar17 + -1;
            pbVar18 = pbVar18 + 1;
          } while (lVar17 != 0);
        }
      }
      if ((uVar19 & 0xff) != 0) goto LAB_002fec40;
      if (uVar15 < 0x40) {
        bVar26 = 0;
        uVar16 = 0;
LAB_002fea28:
        auVar32 = ZEXT116(bVar26);
        lVar14 = uVar16 + 0x20 + lVar14 * -8;
        puVar24 = (undefined8 *)(pauVar9[2] + uVar16);
        do {
          uVar50 = *puVar24;
          auVar32._0_8_ =
               CONCAT17((byte)((ulong)uVar50 >> 0x38) | auVar32[7],
                        CONCAT16((byte)((ulong)uVar50 >> 0x30) | auVar32[6],
                                 CONCAT15((byte)((ulong)uVar50 >> 0x28) | auVar32[5],
                                          CONCAT14((byte)((ulong)uVar50 >> 0x20) | auVar32[4],
                                                   CONCAT13((byte)((ulong)uVar50 >> 0x18) |
                                                            auVar32[3],
                                                            CONCAT12((byte)((ulong)uVar50 >> 0x10) |
                                                                     auVar32[2],
                                                                     CONCAT11((byte)((ulong)uVar50
                                                                                    >> 8) |
                                                                              auVar32[1],
                                                                              (byte)uVar50 |
                                                                              auVar32[0])))))));
          auVar32._8_8_ = 0;
          lVar14 = lVar14 + 8;
          puVar24 = puVar24 + 1;
        } while (lVar14 != 0);
        uVar15 = auVar32._0_8_ | auVar32._0_8_ >> 0x20;
        uVar15 = uVar15 | uVar15 >> 0x10;
        uVar19 = (uint)uVar15 | (uint)(uVar15 >> 8);
      }
      else {
        uVar16 = uVar15 & 0xffffffffffffffc0;
        pauVar21 = pauVar9 + 5;
        bVar26 = 0;
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
        uVar50 = 0;
        uVar8 = 0;
        uVar84 = 0;
        uVar93 = 0;
        uVar13 = uVar16;
        do {
          uVar102 = *(undefined8 *)(pauVar21[-3] + 8);
          uVar101 = *(undefined8 *)pauVar21[-3];
          uVar104 = *(undefined8 *)(pauVar21[-2] + 8);
          uVar103 = *(undefined8 *)pauVar21[-2];
          uVar106 = *(undefined8 *)(pauVar21[-1] + 8);
          uVar105 = *(undefined8 *)pauVar21[-1];
          uVar108 = *(undefined8 *)(*pauVar21 + 8);
          uVar107 = *(undefined8 *)*pauVar21;
          bVar26 = (byte)uVar101 | bVar26;
          bVar34 = (byte)((ulong)uVar101 >> 8) | bVar34;
          bVar35 = (byte)((ulong)uVar101 >> 0x10) | bVar35;
          bVar36 = (byte)((ulong)uVar101 >> 0x18) | bVar36;
          bVar37 = (byte)((ulong)uVar101 >> 0x20) | bVar37;
          bVar38 = (byte)((ulong)uVar101 >> 0x28) | bVar38;
          bVar39 = (byte)((ulong)uVar101 >> 0x30) | bVar39;
          bVar40 = (byte)((ulong)uVar101 >> 0x38) | bVar40;
          bVar41 = (byte)uVar102 | bVar41;
          bVar42 = (byte)((ulong)uVar102 >> 8) | bVar42;
          bVar43 = (byte)((ulong)uVar102 >> 0x10) | bVar43;
          bVar44 = (byte)((ulong)uVar102 >> 0x18) | bVar44;
          bVar45 = (byte)((ulong)uVar102 >> 0x20) | bVar45;
          bVar46 = (byte)((ulong)uVar102 >> 0x28) | bVar46;
          bVar47 = (byte)((ulong)uVar102 >> 0x30) | bVar47;
          bVar48 = (byte)((ulong)uVar102 >> 0x38) | bVar48;
          bVar49 = (byte)uVar103 | bVar49;
          bVar52 = (byte)((ulong)uVar103 >> 8) | bVar52;
          bVar53 = (byte)((ulong)uVar103 >> 0x10) | bVar53;
          bVar54 = (byte)((ulong)uVar103 >> 0x18) | bVar54;
          bVar55 = (byte)((ulong)uVar103 >> 0x20) | bVar55;
          bVar56 = (byte)((ulong)uVar103 >> 0x28) | bVar56;
          bVar57 = (byte)((ulong)uVar103 >> 0x30) | bVar57;
          bVar58 = (byte)((ulong)uVar103 >> 0x38) | bVar58;
          bVar59 = (byte)uVar104 | bVar59;
          bVar60 = (byte)((ulong)uVar104 >> 8) | bVar60;
          bVar61 = (byte)((ulong)uVar104 >> 0x10) | bVar61;
          bVar62 = (byte)((ulong)uVar104 >> 0x18) | bVar62;
          bVar63 = (byte)((ulong)uVar104 >> 0x20) | bVar63;
          bVar64 = (byte)((ulong)uVar104 >> 0x28) | bVar64;
          bVar65 = (byte)((ulong)uVar104 >> 0x30) | bVar65;
          bVar66 = (byte)((ulong)uVar104 >> 0x38) | bVar66;
          bVar67 = (byte)uVar105 | (byte)uVar50;
          bVar68 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar50 >> 8);
          bVar69 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar50 >> 0x10);
          bVar70 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar50 >> 0x18);
          bVar71 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar50 >> 0x20);
          bVar72 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar50 >> 0x28);
          bVar73 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar50 >> 0x30);
          bVar74 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar50 >> 0x38);
          uVar50 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))));
          bVar75 = (byte)uVar106 | (byte)uVar8;
          bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar8 >> 8);
          bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
          bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
          bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
          bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
          bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
          bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
          uVar8 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar75)))))));
          bVar83 = (byte)uVar107 | (byte)uVar84;
          bVar85 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar84 >> 8);
          bVar86 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar84 >> 0x10);
          bVar87 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar84 >> 0x18);
          bVar88 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar84 >> 0x20);
          bVar89 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar84 >> 0x28);
          bVar90 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar84 >> 0x30);
          bVar91 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar84 >> 0x38);
          uVar84 = CONCAT17(bVar91,CONCAT16(bVar90,CONCAT15(bVar89,CONCAT14(bVar88,CONCAT13(bVar87,
                                                  CONCAT12(bVar86,CONCAT11(bVar85,bVar83)))))));
          bVar92 = (byte)uVar108 | (byte)uVar93;
          bVar94 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar93 >> 8);
          bVar95 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar93 >> 0x10);
          bVar96 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar93 >> 0x18);
          bVar97 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar93 >> 0x20);
          bVar98 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar93 >> 0x28);
          bVar99 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar93 >> 0x30);
          bVar100 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar93 >> 0x38);
          uVar93 = CONCAT17(bVar100,CONCAT16(bVar99,CONCAT15(bVar98,CONCAT14(bVar97,CONCAT13(bVar96,
                                                  CONCAT12(bVar95,CONCAT11(bVar94,bVar92)))))));
          pauVar21 = pauVar21 + 4;
          uVar13 = uVar13 - 0x40;
        } while (uVar13 != 0);
        auVar31[0] = bVar83 | bVar67 | bVar49 | bVar26;
        auVar31[1] = bVar85 | bVar68 | bVar52 | bVar34;
        auVar31[2] = bVar86 | bVar69 | bVar53 | bVar35;
        auVar31[3] = bVar87 | bVar70 | bVar54 | bVar36;
        auVar31[4] = bVar88 | bVar71 | bVar55 | bVar37;
        auVar31[5] = bVar89 | bVar72 | bVar56 | bVar38;
        auVar31[6] = bVar90 | bVar73 | bVar57 | bVar39;
        auVar31[7] = bVar91 | bVar74 | bVar58 | bVar40;
        auVar31[8] = bVar92 | bVar75 | bVar59 | bVar41;
        auVar31[9] = bVar94 | bVar76 | bVar60 | bVar42;
        auVar31[10] = bVar95 | bVar77 | bVar61 | bVar43;
        auVar31[0xb] = bVar96 | bVar78 | bVar62 | bVar44;
        auVar31[0xc] = bVar97 | bVar79 | bVar63 | bVar45;
        auVar31[0xd] = bVar98 | bVar80 | bVar64 | bVar46;
        auVar31[0xe] = bVar99 | bVar81 | bVar65 | bVar47;
        auVar31[0xf] = bVar100 | bVar82 | bVar66 | bVar48;
        auVar33 = NEON_ext(auVar31,auVar31,8,1);
        uVar13 = CONCAT17(auVar31[7] | auVar33[7],
                          CONCAT16(auVar31[6] | auVar33[6],
                                   CONCAT15(auVar31[5] | auVar33[5],
                                            CONCAT14(auVar31[4] | auVar33[4],
                                                     CONCAT13(auVar31[3] | auVar33[3],
                                                              CONCAT12(auVar31[2] | auVar33[2],
                                                                       CONCAT11(auVar31[1] |
                                                                                auVar33[1],
                                                                                auVar31[0] |
                                                                                auVar33[0])))))));
        uVar13 = uVar13 | uVar13 >> 0x20;
        uVar13 = uVar13 | uVar13 >> 0x10;
        uVar19 = (uint)uVar13 | (uint)(uVar13 >> 8);
        bVar26 = (byte)uVar19;
        if (uVar15 != uVar16) {
          if ((uVar15 & 0x38) != 0) goto LAB_002fea28;
          lVar14 = (uVar12 - uVar16) + -0x20;
          pbVar18 = *pauVar9 + (uVar16 | 0x20);
          do {
            uVar19 = *pbVar18 | uVar19;
            lVar14 = lVar14 + -1;
            pbVar18 = pbVar18 + 1;
          } while (lVar14 != 0);
        }
      }
      if ((uVar19 & 0xff) != 0) {
LAB_002ff884:
        func_0x0079dae0();
        goto code_r0x002ff888;
      }
    }
    uVar15 = uVar12;
    if (0x1f < uVar12) {
      uVar15 = 0x20;
    }
    if (uVar15 != 0) {
      if ((acStack_7ffffffe + (0x8000137e - uVar15) < *pauVar9 + uVar15) &&
         (pauVar9 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000137e))) {
        uVar13 = 0;
LAB_002feaa4:
        lVar14 = uVar15 - uVar13;
        pcVar7 = *pauVar9 + uVar13;
        pcVar23 = acStack_7ffffffe + (0x8000137d - uVar13);
        do {
          *pcVar23 = *pcVar7;
          lVar14 = lVar14 + -1;
          pcVar7 = pcVar7 + 1;
          pcVar23 = pcVar23 + -1;
        } while (lVar14 != 0);
      }
      else {
        if (uVar15 < 0x10) {
          uVar13 = 0;
        }
        else {
          uVar13 = uVar15 & 0x30;
          auVar33 = NEON_rev64(*pauVar9,1);
          auVar33 = NEON_ext(auVar33,auVar33,8,1);
          unaff_x25[0x6b] = auVar33._8_8_;
          unaff_x25[0x6a] = auVar33._0_8_;
          if (uVar13 != 0x10) {
            auVar33 = NEON_rev64(pauVar9[1],1);
            auVar33 = NEON_ext(auVar33,auVar33,8,1);
            unaff_x25[0x69] = auVar33._8_8_;
            unaff_x25[0x68] = auVar33._0_8_;
          }
          if (uVar15 == uVar13) goto LAB_002feb44;
          if (((uint)uVar15 >> 3 & 1) == 0) goto LAB_002feaa4;
        }
        lVar14 = uVar15 - uVar13;
        puVar24 = (undefined8 *)(*pauVar9 + uVar13);
        pcVar7 = acStack_7ffffffe + (0x80001376 - uVar13);
        do {
          uVar50 = NEON_rev64(*puVar24,1);
          *(undefined8 *)pcVar7 = uVar50;
          lVar14 = lVar14 + -8;
          puVar24 = puVar24 + 1;
          pcVar7 = pcVar7 + -8;
        } while (lVar14 != 0);
      }
    }
LAB_002feb44:
    if (uVar12 < 0x20) {
      ___memset_chk(acStack_7ffffffe + 0x8000135e,0,0x20 - uVar15,0x20);
    }
    iVar4 = func_0x002fd75c(&UNK_00878915,acStack_7ffffffe + 0x8000133e,0x40,"ECDSA-sign signature")
    ;
    if (iVar4 == 0) goto LAB_002fec40;
    func_0x002c398c();
    unaff_x20 = (long *)func_0x0036e274(0x10);
    if (unaff_x20 == (long *)0x0) goto code_r0x002fec7c;
    lVar14 = func_0x0036e31c(0x18);
    if (lVar14 != 0) {
      *(undefined4 *)(lVar14 + 0x14) = 1;
    }
    *unaff_x20 = lVar14;
    lVar14 = func_0x0036e31c(0x18);
    if (lVar14 == 0) {
      unaff_x20[1] = 0;
code_r0x002fec70:
      func_0x002c398c(unaff_x20);
      unaff_x20 = (long *)0x0;
code_r0x002fec7c:
      func_0x002c398c(unaff_x20);
      unaff_x20 = (long *)0x0;
    }
    else {
      *(undefined4 *)(lVar14 + 0x14) = 1;
      unaff_x20[1] = lVar14;
      puVar24 = (undefined8 *)*unaff_x20;
      if (puVar24 == (undefined8 *)0x0) goto code_r0x002fec70;
      if (*(uint *)((long)puVar24 + 0xc) < 4) {
        if ((*(byte *)((long)puVar24 + 0x14) >> 1 & 1) == 0) {
          puVar5 = (undefined8 *)func_0x0036e358(4,8,lVar14);
          if (puVar5 != (undefined8 *)0x0) {
            if (*(int *)(puVar24 + 1) != 0) {
              _memcpy(puVar5,*puVar24,(long)*(int *)(puVar24 + 1) << 3);
            }
            func_0x0036e3d8(*puVar24);
            *puVar24 = puVar5;
            *(undefined4 *)((long)puVar24 + 0xc) = 4;
            lVar14 = unaff_x20[1];
            goto code_r0x002fecc4;
          }
        }
        else {
          func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
        }
        goto code_r0x002fec7c;
      }
      puVar5 = (undefined8 *)*puVar24;
code_r0x002fecc4:
      *(undefined4 *)(puVar24 + 1) = 4;
      *(undefined4 *)(puVar24 + 2) = 0;
      uVar84 = _UNK_0082ff28;
      uVar8 = _UNK_0082ff20;
      uVar50 = _UNK_0082ff10;
      puVar5[1] = _UNK_0082ff18;
      *puVar5 = uVar50;
      puVar5[3] = uVar84;
      puVar5[2] = uVar8;
      lVar14 = func_0x0029c764(&UNK_00878995,0x20,lVar14);
      if (lVar14 == 0) goto code_r0x002fec7c;
      func_0x00373e9c(0xa296c8,&DAT_002c21e4);
      in_stack_00000d20 = 0x40;
      iVar4 = func_0x002c0d58(&UNK_00878955,0x20,acStack_7ffffffe + 0x8000069e,
                              acStack_7ffffffe + 0x80000d1e,0xa3a728,0);
      if ((iVar4 != 0) &&
         (iVar4 = func_0x002c3b08(acStack_7ffffffe + 0x8000069e,0x40,unaff_x20), iVar4 != 0)) {
        func_0x00373e9c(0xa29738,&DAT_002c54ec);
        puVar24 = (undefined8 *)func_0x0036e274(0xe0);
        if (puVar24 != (undefined8 *)0x0) {
          uVar50 = func_0x002c6ae8(0xa3b640);
          *puVar24 = uVar50;
          puVar24[2] = 0;
          puVar24[1] = 0;
          puVar24[4] = 0;
          puVar24[3] = 0;
          puVar24[6] = 0;
          puVar24[5] = 0;
          puVar24[8] = 0;
          puVar24[7] = 0;
          puVar24[9] = 0;
          puVar24[0xb] = 0;
          puVar24[10] = 0;
          puVar24[0xd] = 0;
          puVar24[0xc] = 0;
          puVar24[0xf] = 0;
          puVar24[0xe] = 0;
          puVar24[0x11] = 0;
          puVar24[0x10] = 0;
          puVar24[0x12] = 0;
          puVar24[0x14] = 0;
          puVar24[0x13] = 0;
          puVar24[0x16] = 0;
          puVar24[0x15] = 0;
          puVar24[0x18] = 0;
          puVar24[0x17] = 0;
          puVar24[0x1a] = 0;
          puVar24[0x19] = 0;
          puVar24[0x1b] = 0;
        }
        puVar5 = (undefined8 *)func_0x0036e274(0xe0);
        if (puVar5 != (undefined8 *)0x0) {
          uVar50 = func_0x002c6ae8(0xa3b640);
          *puVar5 = uVar50;
          puVar5[2] = 0;
          puVar5[1] = 0;
          puVar5[4] = 0;
          puVar5[3] = 0;
          puVar5[6] = 0;
          puVar5[5] = 0;
          puVar5[8] = 0;
          puVar5[7] = 0;
          puVar5[9] = 0;
          puVar5[0xb] = 0;
          puVar5[10] = 0;
          puVar5[0xd] = 0;
          puVar5[0xc] = 0;
          puVar5[0xf] = 0;
          puVar5[0xe] = 0;
          puVar5[0x11] = 0;
          puVar5[0x10] = 0;
          puVar5[0x12] = 0;
          puVar5[0x14] = 0;
          puVar5[0x13] = 0;
          puVar5[0x16] = 0;
          puVar5[0x15] = 0;
          puVar5[0x18] = 0;
          puVar5[0x17] = 0;
          puVar5[0x1a] = 0;
          puVar5[0x19] = 0;
          puVar5[0x1b] = 0;
        }
        puVar6 = (undefined8 *)func_0x0036e31c(0x18);
        if (((((puVar6 == (undefined8 *)0x0) ||
              (*(undefined4 *)((long)puVar6 + 0x14) = 1, puVar24 == (undefined8 *)0x0)) ||
             (puVar5 == (undefined8 *)0x0)) ||
            ((iVar4 = func_0x002d2dc0(0xa3b640,puVar24,&UNK_008789b5,0x41,0), iVar4 == 0 ||
             (lVar14 = func_0x0029c764(&UNK_008789f6,0x20,puVar6), lVar14 == 0)))) ||
           ((iVar4 = func_0x002c98a8(0xa3b640,puVar5,0,puVar24,puVar6,0), iVar4 == 0 ||
            ((lVar14 = func_0x002cb544(0xa3b640,puVar5,4,acStack_7ffffffe + 0x8000165e,0x41),
             lVar14 == 0 ||
             (iVar4 = func_0x002fd75c(&UNK_00878a16,acStack_7ffffffe + 0x8000165e,0x41,
                                      "Z Computation Result"), iVar4 == 0)))))) {
          _fwrite("Z-computation KAT failed.\n",0x1a,1,*unaff_x24);
          func_0x002c3420();
          unaff_x19 = (char *)0x0;
          pcVar7 = (char *)0x0;
          if (puVar24 != (undefined8 *)0x0) goto code_r0x002fefa8;
        }
        else {
          func_0x002c3420();
          pcVar7 = (char *)((long)&MACH_HEADER.magic + 1);
code_r0x002fefa8:
          unaff_x19 = pcVar7;
          func_0x002c6434(*puVar24);
          func_0x0036e3d8(puVar24);
        }
        if (puVar5 != (undefined8 *)0x0) {
          func_0x002c6434(*puVar5);
          func_0x0036e3d8(puVar5);
        }
        if (puVar6 != (undefined8 *)0x0) {
          uVar19 = *(uint *)((long)puVar6 + 0x14);
          if ((uVar19 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar6);
            uVar19 = *(uint *)((long)puVar6 + 0x14);
          }
          if ((uVar19 & 1) == 0) {
            *puVar6 = 0;
          }
          else {
            func_0x0036e3d8(puVar6);
          }
        }
        func_0x002c398c(unaff_x20);
        if ((int)unaff_x19 != 0) {
          unaff_x19 = (char *)func_0x0036e31c(0x18);
          if (unaff_x19 != (char *)0x0) {
            *(undefined4 *)(unaff_x19 + 0x14) = 1;
            func_0x0036e3d8(*(undefined8 *)unaff_x19);
            *(undefined **)unaff_x19 = &UNK_00878ab8;
            *(qword *)(unaff_x19 + 8) = 0x2000000020;
            *(undefined4 *)(unaff_x19 + 0x10) = 0;
            *(uint *)(unaff_x19 + 0x14) = *(uint *)(unaff_x19 + 0x14) | 2;
          }
          unaff_x20 = (long *)func_0x002c0f98(&UNK_00831198,0x20);
          if (unaff_x20 == (long *)0x0) goto code_r0x002ff104;
          puVar24 = (undefined8 *)func_0x0036e31c(0x18);
          if (puVar24 == (undefined8 *)0x0) goto code_r0x002ff0fc;
          *(undefined4 *)((long)puVar24 + 0x14) = 1;
          func_0x0036e3d8(*puVar24);
          *puVar24 = &UNK_00878eb8;
          puVar24[1] = 0x400000004;
          *(undefined4 *)(puVar24 + 2) = 0;
          *(uint *)((long)puVar24 + 0x14) = *(uint *)((long)puVar24 + 0x14) | 2;
          puVar5 = (undefined8 *)unaff_x20[4];
          if (puVar5 != (undefined8 *)0x0) {
            uVar19 = *(uint *)((long)puVar5 + 0x14);
            if ((uVar19 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar5);
              uVar19 = *(uint *)((long)puVar5 + 0x14);
            }
            if ((uVar19 & 1) == 0) {
              *puVar5 = 0;
            }
            else {
              func_0x0036e3d8(puVar5);
            }
          }
          unaff_x20[4] = (long)puVar24;
          if (unaff_x19 == (char *)0x0) goto code_r0x002ff108;
          plVar10 = (long *)*unaff_x20;
          uVar3 = *(uint *)(plVar10 + 1);
          uVar12 = (ulong)uVar3;
          uVar19 = uVar3 & (int)uVar3 >> 0x1f;
          lVar14 = uVar12 * 8;
          do {
            lVar14 = lVar14 + -8;
            uVar20 = (uint)uVar12;
            uVar12 = (ulong)(uVar20 - 1);
            if ((int)uVar20 < 1) {
              if (-1 < (int)uVar3) goto code_r0x002ff108;
              lVar17 = *plVar10;
              goto code_r0x002ff66c;
            }
            lVar17 = *plVar10;
          } while (*(long *)(lVar17 + lVar14) == 0);
          uVar19 = uVar20;
code_r0x002ff66c:
          uVar15 = *(ulong *)(lVar17 + (long)(int)(uVar19 - 1) * 8);
          uVar13 = uVar15 >> 0x20;
          uVar12 = uVar13;
          if (uVar13 == 0) {
            uVar12 = uVar15;
          }
          uVar22 = uVar12 >> 0x10;
          uVar16 = uVar22;
          if (uVar22 == 0) {
            uVar16 = uVar12;
          }
          uVar12 = uVar16 >> 8;
          if (uVar16 < 0x100) {
            uVar12 = uVar16;
          }
          uVar1 = uVar12 >> 4;
          if (uVar12 < 0x10) {
            uVar1 = uVar12;
          }
          uVar2 = uVar1 >> 2;
          if (uVar1 < 4) {
            uVar2 = uVar1;
          }
          uVar19 = (uint)(uVar15 != 0) | (uVar19 - 1) * 0x40 | (uint)(uVar13 != 0) << 5 |
                   (uint)(uVar22 != 0) << 4 | (uint)(0xff < uVar16) << 3 | (uint)(0xf < uVar12) << 2
                   | (uint)(3 < uVar1) << 1;
          if (1 < uVar2) {
            uVar19 = uVar19 + 1;
          }
          if ((uVar19 + 7 & 0xfffffff8) != 0x800) goto code_r0x002ff108;
          iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000165e,unaff_x19,unaff_x20);
          if (iVar4 != 0x100) goto code_r0x002ff108;
          iVar4 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH");
          if (iVar4 == 0) goto code_r0x002ff108;
          puVar24 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
          plVar10 = (long *)func_0x0036e31c(0x108);
          if (plVar10 != (long *)0x0) {
            func_0x00373d98(plVar10 + 6);
            *(undefined4 *)((long)plVar10 + 0x104) = 1;
            lVar14 = func_0x0029c764(&UNK_00878ed8,0x100,0);
            *plVar10 = lVar14;
            if (lVar14 != 0) {
              lVar14 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
              plVar10[2] = lVar14;
              if (lVar14 != 0) {
                lVar14 = func_0x0029c764(&UNK_00878ff4,0x100,0);
                plVar10[1] = lVar14;
                if (lVar14 != 0) {
                  lVar14 = func_0x0029c764(&UNK_008790f4,0x1c,0);
                  plVar10[4] = lVar14;
                  if (lVar14 != 0) {
                    lVar14 = func_0x0029c764(&UNK_00879110,0x100,0);
                    plVar10[3] = lVar14;
                    if (lVar14 != 0) {
                      if (puVar24 != (undefined8 *)0x0) {
                        plVar11 = (long *)*plVar10;
                        uVar3 = *(uint *)(plVar11 + 1);
                        uVar12 = (ulong)uVar3;
                        uVar19 = uVar3 & (int)uVar3 >> 0x1f;
                        lVar14 = uVar12 * 8;
                        do {
                          lVar14 = lVar14 + -8;
                          uVar20 = (uint)uVar12;
                          uVar12 = (ulong)(uVar20 - 1);
                          if ((int)uVar20 < 1) {
                            if (-1 < (int)uVar3) goto code_r0x002ff860;
                            lVar17 = *plVar11;
                            goto code_r0x002ff904;
                          }
                          lVar17 = *plVar11;
                        } while (*(long *)(lVar17 + lVar14) == 0);
                        uVar19 = uVar20;
code_r0x002ff904:
                        uVar15 = *(ulong *)(lVar17 + (long)(int)(uVar19 - 1) * 8);
                        uVar13 = uVar15 >> 0x20;
                        uVar12 = uVar13;
                        if (uVar13 == 0) {
                          uVar12 = uVar15;
                        }
                        uVar22 = uVar12 >> 0x10;
                        uVar16 = uVar22;
                        if (uVar22 == 0) {
                          uVar16 = uVar12;
                        }
                        uVar12 = uVar16 >> 8;
                        if (uVar16 < 0x100) {
                          uVar12 = uVar16;
                        }
                        uVar1 = uVar12 >> 4;
                        if (uVar12 < 0x10) {
                          uVar1 = uVar12;
                        }
                        uVar2 = uVar1 >> 2;
                        if (uVar1 < 4) {
                          uVar2 = uVar1;
                        }
                        uVar19 = (uint)(uVar15 != 0) | (uVar19 - 1) * 0x40 |
                                 (uint)(uVar13 != 0) << 5 | (uint)(uVar22 != 0) << 4 |
                                 (uint)(0xff < uVar16) << 3 | (uint)(0xf < uVar12) << 2 |
                                 (uint)(3 < uVar1) << 1;
                        if (1 < uVar2) {
                          uVar19 = uVar19 + 1;
                        }
                        if ((((uVar19 + 7 & 0xfffffff8) == 0x800) &&
                            (iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar24,plVar10),
                            iVar4 == 0x100)) &&
                           (iVar4 = func_0x002fd75c(&UNK_00878db8,acStack_7ffffffe + 0x8000069e,
                                                    0x100,"FFC DH FB"), iVar4 != 0)) {
                          bVar25 = false;
                          goto code_r0x002ff12c;
                        }
                      }
                      goto code_r0x002ff860;
                    }
                  }
                }
              }
            }
          }
          func_0x002bf97c(plVar10);
          plVar10 = (long *)0x0;
code_r0x002ff860:
          bVar25 = true;
          _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
          goto code_r0x002ff12c;
        }
        goto code_r0x002fdd0c;
      }
    }
    uVar8 = *unaff_x24;
    pcVar7 = "ECDSA-verify KAT failed.\n";
    uVar50 = 0x19;
  }
  else {
LAB_002fec40:
    uVar8 = *unaff_x24;
    pcVar7 = "ECDSA-sign KAT failed.\n";
    uVar50 = 0x17;
  }
  _fwrite(pcVar7,uVar50,1,uVar8);
  func_0x002c3420();
  func_0x002c398c(unaff_x20);
code_r0x002fdd0c:
  do {
    uVar50 = 0;
    while( true ) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return;
      }
      ___stack_chk_fail(uVar50);
code_r0x002ff0fc:
      func_0x002bf97c(unaff_x20);
code_r0x002ff104:
      unaff_x20 = (long *)0x0;
code_r0x002ff108:
      bVar25 = true;
      _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
      puVar24 = (undefined8 *)0x0;
      plVar10 = (long *)0x0;
code_r0x002ff12c:
      func_0x002bf97c(unaff_x20);
      if (unaff_x19 != (char *)0x0) {
        uVar19 = *(uint *)(unaff_x19 + 0x14);
        if ((uVar19 >> 1 & 1) == 0) {
          func_0x0036e3d8(*(undefined8 *)unaff_x19);
          uVar19 = *(uint *)(unaff_x19 + 0x14);
        }
        if ((uVar19 & 1) == 0) {
          unaff_x19[0] = '\0';
          unaff_x19[1] = '\0';
          unaff_x19[2] = '\0';
          unaff_x19[3] = '\0';
          unaff_x19[4] = '\0';
          unaff_x19[5] = '\0';
          unaff_x19[6] = '\0';
          unaff_x19[7] = '\0';
        }
        else {
          func_0x0036e3d8(unaff_x19);
        }
      }
      func_0x002bf97c(plVar10);
      if (puVar24 != (undefined8 *)0x0) {
        uVar19 = *(uint *)((long)puVar24 + 0x14);
        if ((uVar19 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar24);
          uVar19 = *(uint *)((long)puVar24 + 0x14);
        }
        if ((uVar19 & 1) == 0) {
          *puVar24 = 0;
        }
        else {
          func_0x0036e3d8(puVar24);
        }
      }
      if (bVar25) break;
      unaff_x20 = (long *)(acStack_7ffffffe + 0x8000165e);
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar8 = _UNK_007fc2c8;
      uVar50 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar50;
      uVar93 = _UNK_0082fd28;
      uVar84 = _UNK_0082fd20;
      unaff_x25[0x1a7] = _UNK_0082fd28;
      unaff_x25[0x1a6] = uVar84;
      uVar102 = _UNK_0082fd38;
      uVar101 = _UNK_0082fd30;
      unaff_x25[0x1a9] = _UNK_0082fd38;
      unaff_x25[0x1a8] = uVar101;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      uVar104 = _UNK_0082fd48;
      uVar103 = _UNK_0082fd40;
      unaff_x25[0x1ad] = _UNK_0082fd48;
      unaff_x25[0x1ac] = uVar103;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      unaff_x19 = &UNK_00879210;
      func_0x002e0668(unaff_x29 + -0xb0,acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,
                      &UNK_00879210);
      _memcpy(acStack_7ffffffe + 0x8000195e,acStack_7ffffffe + 0x8000133e,800);
      func_0x002eafd4(acStack_7ffffffe + 0x8000133e,800,acStack_7ffffffe + 0x80001c7e);
      uVar107 = _UNK_00879248;
      uVar106 = _UNK_00879240;
      uVar105 = _UNK_00879230;
      unaff_x25[0x191] = _UNK_00879238;
      unaff_x25[400] = uVar105;
      unaff_x25[0x193] = uVar107;
      unaff_x25[0x192] = uVar106;
      iVar4 = func_0x002fd75c(&UNK_00879570,acStack_7ffffffe + 0x8000165e,0x660,
                              "ML-KEM keyGen decaps");
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_00879250,acStack_7ffffffe + 0x8000133e,800,
                                  "ML-KEM keyGen encaps"), iVar4 == 0)) break;
      _memcpy(acStack_7ffffffe + 0x8000101e,&UNK_00879bd0,800);
      _bzero(acStack_7ffffffe + 0x80000d1e,0x300);
      unaff_x25[0x1a5] = uVar8;
      unaff_x25[0x1a4] = uVar50;
      unaff_x25[0x1a7] = uVar93;
      unaff_x25[0x1a6] = uVar84;
      unaff_x25[0x1a9] = uVar102;
      unaff_x25[0x1a8] = uVar101;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar104;
      unaff_x25[0x1ac] = uVar103;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      uVar107 = _UNK_00879f08;
      uVar106 = _UNK_00879f00;
      uVar105 = _UNK_00879ef0;
      unaff_x25[0x19d] = _UNK_00879ef8;
      unaff_x25[0x19c] = uVar105;
      unaff_x25[0x19f] = uVar107;
      unaff_x25[0x19e] = uVar106;
      func_0x002eafd4(acStack_7ffffffe + 0x8000101e,800,unaff_x29 + -0xd0);
      unaff_x19 = acStack_7ffffffe + 0x80001cbe;
      func_0x002e345c(unaff_x29 + -0xf0,0x40,acStack_7ffffffe + 0x80001cbe);
      func_0x002e5194(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000d1e,unaff_x29 + -0xf0,
                      acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80001cde);
      uVar105 = unaff_x25[0x194];
      unaff_x26[0xcd] = unaff_x25[0x195];
      unaff_x26[0xcc] = uVar105;
      auVar33 = *(undefined1 (*) [16])(unaff_x25 + 0x196);
      unaff_x26[0xcf] = auVar33._8_8_;
      unaff_x26[0xce] = auVar33._0_8_;
      func_0x0036e464(unaff_x29 + -0xf0,0x40);
      func_0x0036e464(acStack_7ffffffe + 0x80001cbe,0x40);
      iVar4 = func_0x002fd75c(&UNK_00879f10,acStack_7ffffffe + 0x80000d1e,0x300,
                              "ML-KEM encapsulate ciphertext");
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_0087a210,acStack_7ffffffe + 0x80000cfe,0x20,
                                  "ML-KEM encapsulate shared secret"), iVar4 == 0)) break;
      _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
      unaff_x19 = section_000002e8.segname + 8;
      _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
      _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
      unaff_x25[0x1a5] = uVar8;
      unaff_x25[0x1a4] = uVar50;
      unaff_x25[0x1a7] = uVar93;
      unaff_x25[0x1a6] = uVar84;
      unaff_x25[0x1a9] = uVar102;
      unaff_x25[0x1a8] = uVar101;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar104;
      unaff_x25[0x1ac] = uVar103;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar4 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                              acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000069e);
      if ((iVar4 != 0) ||
         (iVar4 = func_0x002fd75c(&UNK_0087ab90,acStack_7ffffffe + 0x80000cfe,0x20,
                                  "ML-KEM decapsulate non-rejection"), iVar4 == 0)) break;
      unaff_x25[0x1a5] = uVar8;
      unaff_x25[0x1a4] = uVar50;
      unaff_x25[0x1a7] = uVar93;
      unaff_x25[0x1a6] = uVar84;
      unaff_x25[0x1a9] = uVar102;
      unaff_x25[0x1a8] = uVar101;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar104;
      unaff_x25[0x1ac] = uVar103;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar4 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                              &uStack00000000000000a0,acStack_7ffffffe + 0x8000069e);
      if (iVar4 != 0) break;
      uVar50 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar104 = _UNK_0087afa8;
      uVar103 = _UNK_0087afa0;
      uVar102 = _UNK_0087af90;
      uVar101 = _UNK_0087af08;
      uVar93 = _UNK_0087af00;
      uVar84 = _UNK_0087aef8;
      uVar8 = _UNK_0087aef0;
      if ((int)uVar50 != 0) {
        in_stack_000000a8 = _UNK_0087aef8;
        uStack00000000000000a0 = _UNK_0087aef0;
        in_stack_000000b8 = _UNK_0087af08;
        in_stack_000000b0 = _UNK_0087af00;
        unaff_x25[0xd1] = _UNK_0087af98;
        unaff_x25[0xd0] = uVar102;
        unaff_x25[0xd3] = uVar104;
        unaff_x25[0xd2] = uVar103;
        uVar103 = _UNK_0087afc8;
        uVar102 = _UNK_0087afc0;
        uVar50 = _UNK_0087afb0;
        unaff_x25[0xd5] = _UNK_0087afb8;
        unaff_x25[0xd4] = uVar50;
        unaff_x25[0xd7] = uVar103;
        unaff_x25[0xd6] = uVar102;
        uVar103 = _UNK_0087af68;
        uVar102 = _UNK_0087af60;
        uVar50 = _UNK_0087af50;
        unaff_x25[0xc9] = _UNK_0087af58;
        unaff_x25[200] = uVar50;
        unaff_x25[0xcb] = uVar103;
        unaff_x25[0xca] = uVar102;
        uVar103 = _UNK_0087af88;
        uVar102 = _UNK_0087af80;
        uVar50 = _UNK_0087af70;
        unaff_x25[0xcd] = _UNK_0087af78;
        unaff_x25[0xcc] = uVar50;
        unaff_x25[0xcf] = uVar103;
        unaff_x25[0xce] = uVar102;
        uVar103 = _UNK_0087aee8;
        uVar102 = _UNK_0087aee0;
        uVar50 = _UNK_0087aed0;
        unaff_x26[1] = _UNK_0087aed8;
        *unaff_x26 = uVar50;
        unaff_x26[3] = uVar103;
        unaff_x26[2] = uVar102;
        unaff_x26[5] = uVar84;
        unaff_x26[4] = uVar8;
        unaff_x26[7] = uVar101;
        unaff_x26[6] = uVar93;
        unaff_x25[0x69] = 0;
        unaff_x25[0x68] = 0;
        unaff_x25[0x6b] = 0;
        unaff_x25[0x6a] = 0;
        unaff_x25[0x65] = 0;
        unaff_x25[100] = 0;
        unaff_x25[0x67] = 0;
        unaff_x25[0x66] = 0;
        func_0x002b64bc(acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,0x80,
                        acStack_7ffffffe + 0x8000069e);
        iVar4 = func_0x002fd75c(&UNK_0087af10,acStack_7ffffffe + 0x8000133e,0x40,"ED25519 sign");
        if (iVar4 == 0) goto code_r0x002ff888;
        unaff_x25[1] = unaff_x25[0x65];
        *unaff_x25 = unaff_x25[100];
        unaff_x25[3] = unaff_x25[0x67];
        unaff_x25[2] = unaff_x25[0x66];
        auVar51 = *(undefined1 (*) [16])(unaff_x25 + 0x68);
        auVar33 = *(undefined1 (*) [16])(unaff_x25 + 0x6a);
        unaff_x26[0xd3] = auVar33._8_8_;
        unaff_x26[0xd2] = auVar33._0_8_;
        unaff_x26[0xd1] = auVar51._8_8_;
        unaff_x26[0xd0] = auVar51._0_8_;
        if ((((0x1f < *(byte *)((long)unaff_x25 + 0x35f)) ||
             (0x1000000000000000 < in_stack_00000d38)) ||
            ((in_stack_00000d38 >> 0x3c != 0 &&
             (((in_stack_00000d30 != 0 || (0x14def9dea2f79cd6 < in_stack_00000d28)) ||
              ((in_stack_00000d28 == 0x14def9dea2f79cd6 &&
               (0x5812631a5cf5d3ec < CONCAT44(in_stack_00000d24,in_stack_00000d20))))))))) ||
           ((iVar4 = func_0x002b6a60(acStack_7ffffffe + 0x8000039e,&uStack00000000000000a0,
                                     acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80000d1e,
                                     acStack_7ffffffe + 0x8000165e,0x80), iVar4 == 0 ||
            (iVar4 = func_0x0036e62c(acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000101e,
                                     0x20), iVar4 != 0)))) {
          uVar8 = *unaff_x24;
          pcVar7 = "ED25519 verify failed.\n";
          uVar50 = 0x17;
          goto code_r0x002ff8f0;
        }
        uVar50 = 1;
      }
    }
  } while( true );
code_r0x002ff888:
  uVar8 = *unaff_x24;
  pcVar7 = "ED25519 sign failed.\n";
  uVar50 = 0x15;
code_r0x002ff8f0:
  _fwrite(pcVar7,uVar50,1,uVar8);
  goto code_r0x002fdd0c;
}

