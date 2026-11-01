
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002fe638(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  char *pcVar7;
  undefined1 (*in_x9) [16];
  undefined1 (*pauVar8) [16];
  long *plVar9;
  long *plVar10;
  ulong in_x10;
  ulong in_x11;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  byte *pbVar16;
  uint uVar17;
  uint uVar18;
  undefined8 *in_x12;
  ulong uVar19;
  undefined1 (*pauVar20) [16];
  ulong uVar21;
  char *pcVar22;
  char *unaff_x19;
  long *unaff_x20;
  undefined8 *puVar23;
  bool bVar24;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  byte bVar25;
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
  byte bVar46;
  byte bVar47;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  byte bVar48;
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
  undefined1 auVar49 [16];
  byte bVar65;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  undefined8 uVar66;
  byte bVar73;
  byte bVar74;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  undefined8 uVar75;
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
  
  bVar25 = 0;
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
  bVar46 = 0;
  bVar47 = 0;
  bVar48 = 0;
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
  uVar66 = 0;
  uVar75 = 0;
  uVar84 = 0;
  uVar93 = 0;
  uVar19 = in_x11;
  do {
    uVar102 = in_x12[-5];
    uVar101 = in_x12[-6];
    uVar104 = in_x12[-3];
    uVar103 = in_x12[-4];
    uVar106 = in_x12[-1];
    uVar105 = in_x12[-2];
    uVar108 = in_x12[1];
    uVar107 = *in_x12;
    bVar25 = (byte)uVar101 | bVar25;
    bVar33 = (byte)((ulong)uVar101 >> 8) | bVar33;
    bVar34 = (byte)((ulong)uVar101 >> 0x10) | bVar34;
    bVar35 = (byte)((ulong)uVar101 >> 0x18) | bVar35;
    bVar36 = (byte)((ulong)uVar101 >> 0x20) | bVar36;
    bVar37 = (byte)((ulong)uVar101 >> 0x28) | bVar37;
    bVar38 = (byte)((ulong)uVar101 >> 0x30) | bVar38;
    bVar39 = (byte)((ulong)uVar101 >> 0x38) | bVar39;
    bVar40 = (byte)uVar102 | bVar40;
    bVar41 = (byte)((ulong)uVar102 >> 8) | bVar41;
    bVar42 = (byte)((ulong)uVar102 >> 0x10) | bVar42;
    bVar43 = (byte)((ulong)uVar102 >> 0x18) | bVar43;
    bVar44 = (byte)((ulong)uVar102 >> 0x20) | bVar44;
    bVar45 = (byte)((ulong)uVar102 >> 0x28) | bVar45;
    bVar46 = (byte)((ulong)uVar102 >> 0x30) | bVar46;
    bVar47 = (byte)((ulong)uVar102 >> 0x38) | bVar47;
    bVar48 = (byte)uVar103 | bVar48;
    bVar50 = (byte)((ulong)uVar103 >> 8) | bVar50;
    bVar51 = (byte)((ulong)uVar103 >> 0x10) | bVar51;
    bVar52 = (byte)((ulong)uVar103 >> 0x18) | bVar52;
    bVar53 = (byte)((ulong)uVar103 >> 0x20) | bVar53;
    bVar54 = (byte)((ulong)uVar103 >> 0x28) | bVar54;
    bVar55 = (byte)((ulong)uVar103 >> 0x30) | bVar55;
    bVar56 = (byte)((ulong)uVar103 >> 0x38) | bVar56;
    bVar57 = (byte)uVar104 | bVar57;
    bVar58 = (byte)((ulong)uVar104 >> 8) | bVar58;
    bVar59 = (byte)((ulong)uVar104 >> 0x10) | bVar59;
    bVar60 = (byte)((ulong)uVar104 >> 0x18) | bVar60;
    bVar61 = (byte)((ulong)uVar104 >> 0x20) | bVar61;
    bVar62 = (byte)((ulong)uVar104 >> 0x28) | bVar62;
    bVar63 = (byte)((ulong)uVar104 >> 0x30) | bVar63;
    bVar64 = (byte)((ulong)uVar104 >> 0x38) | bVar64;
    bVar65 = (byte)uVar105 | (byte)uVar66;
    bVar67 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar66 >> 8);
    bVar68 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar66 >> 0x10);
    bVar69 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar66 >> 0x18);
    bVar70 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar66 >> 0x20);
    bVar71 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar66 >> 0x28);
    bVar72 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar66 >> 0x30);
    bVar73 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar66 >> 0x38);
    uVar66 = CONCAT17(bVar73,CONCAT16(bVar72,CONCAT15(bVar71,CONCAT14(bVar70,CONCAT13(bVar69,
                                                  CONCAT12(bVar68,CONCAT11(bVar67,bVar65)))))));
    bVar74 = (byte)uVar106 | (byte)uVar75;
    bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar75 >> 8);
    bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar75 >> 0x10);
    bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar75 >> 0x18);
    bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar75 >> 0x20);
    bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar75 >> 0x28);
    bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar75 >> 0x30);
    bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar75 >> 0x38);
    uVar75 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar74)))))));
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
    in_x12 = in_x12 + 8;
    uVar19 = uVar19 - 0x40;
  } while (uVar19 != 0);
  auVar32[0] = bVar83 | bVar65 | bVar48 | bVar25;
  auVar32[1] = bVar85 | bVar67 | bVar50 | bVar33;
  auVar32[2] = bVar86 | bVar68 | bVar51 | bVar34;
  auVar32[3] = bVar87 | bVar69 | bVar52 | bVar35;
  auVar32[4] = bVar88 | bVar70 | bVar53 | bVar36;
  auVar32[5] = bVar89 | bVar71 | bVar54 | bVar37;
  auVar32[6] = bVar90 | bVar72 | bVar55 | bVar38;
  auVar32[7] = bVar91 | bVar73 | bVar56 | bVar39;
  auVar32[8] = bVar92 | bVar74 | bVar57 | bVar40;
  auVar32[9] = bVar94 | bVar76 | bVar58 | bVar41;
  auVar32[10] = bVar95 | bVar77 | bVar59 | bVar42;
  auVar32[0xb] = bVar96 | bVar78 | bVar60 | bVar43;
  auVar32[0xc] = bVar97 | bVar79 | bVar61 | bVar44;
  auVar32[0xd] = bVar98 | bVar80 | bVar62 | bVar45;
  auVar32[0xe] = bVar99 | bVar81 | bVar63 | bVar46;
  auVar32[0xf] = bVar100 | bVar82 | bVar64 | bVar47;
  auVar49 = NEON_ext(auVar32,auVar32,8,1);
  uVar19 = CONCAT17(auVar32[7] | auVar49[7],
                    CONCAT16(auVar32[6] | auVar49[6],
                             CONCAT15(auVar32[5] | auVar49[5],
                                      CONCAT14(auVar32[4] | auVar49[4],
                                               CONCAT13(auVar32[3] | auVar49[3],
                                                        CONCAT12(auVar32[2] | auVar49[2],
                                                                 CONCAT11(auVar32[1] | auVar49[1],
                                                                          auVar32[0] | auVar49[0])))
                                              ))));
  uVar19 = uVar19 | uVar19 >> 0x20;
  uVar19 = uVar19 | uVar19 >> 0x10;
  uVar17 = (uint)uVar19 | (uint)(uVar19 >> 8);
  if (in_x10 != in_x11) {
    if ((in_x10 & 0x38) == 0) {
      lVar11 = (param_1 - in_x11) + -0x20;
      pbVar16 = *in_x9 + (in_x11 | 0x20);
      do {
        uVar17 = *pbVar16 | uVar17;
        lVar11 = lVar11 + -1;
        pbVar16 = pbVar16 + 1;
      } while (lVar11 != 0);
    }
    else {
      auVar49._1_15_ = SUB1615(ZEXT816(0),1);
      auVar49[0] = (char)uVar17;
      lVar11 = (in_x11 + 0x20) - param_1;
      puVar23 = (undefined8 *)(in_x9[2] + in_x11);
      do {
        uVar66 = *puVar23;
        auVar49._0_8_ =
             CONCAT17((byte)((ulong)uVar66 >> 0x38) | auVar49[7],
                      CONCAT16((byte)((ulong)uVar66 >> 0x30) | auVar49[6],
                               CONCAT15((byte)((ulong)uVar66 >> 0x28) | auVar49[5],
                                        CONCAT14((byte)((ulong)uVar66 >> 0x20) | auVar49[4],
                                                 CONCAT13((byte)((ulong)uVar66 >> 0x18) | auVar49[3]
                                                          ,CONCAT12((byte)((ulong)uVar66 >> 0x10) |
                                                                    auVar49[2],
                                                                    CONCAT11((byte)((ulong)uVar66 >>
                                                                                   8) | auVar49[1],
                                                                             (byte)uVar66 |
                                                                             auVar49[0])))))));
        auVar49._8_8_ = 0;
        lVar11 = lVar11 + 8;
        puVar23 = puVar23 + 1;
      } while (lVar11 != 0);
      uVar19 = auVar49._0_8_ | auVar49._0_8_ >> 0x20;
      uVar19 = uVar19 | uVar19 >> 0x10;
      uVar17 = (uint)uVar19 | (uint)(uVar19 >> 8);
    }
  }
  if ((uVar17 & 0xff) == 0) {
    if (in_x10 < 0x40) {
      bVar25 = 0;
      uVar12 = 0;
LAB_002fe774:
      auVar27 = ZEXT116(bVar25);
      lVar11 = (uVar12 + 0x20) - param_1;
      puVar23 = (undefined8 *)(in_x9[2] + uVar12);
      do {
        uVar66 = *puVar23;
        auVar27._0_8_ =
             CONCAT17((byte)((ulong)uVar66 >> 0x38) | auVar27[7],
                      CONCAT16((byte)((ulong)uVar66 >> 0x30) | auVar27[6],
                               CONCAT15((byte)((ulong)uVar66 >> 0x28) | auVar27[5],
                                        CONCAT14((byte)((ulong)uVar66 >> 0x20) | auVar27[4],
                                                 CONCAT13((byte)((ulong)uVar66 >> 0x18) | auVar27[3]
                                                          ,CONCAT12((byte)((ulong)uVar66 >> 0x10) |
                                                                    auVar27[2],
                                                                    CONCAT11((byte)((ulong)uVar66 >>
                                                                                   8) | auVar27[1],
                                                                             (byte)uVar66 |
                                                                             auVar27[0])))))));
        auVar27._8_8_ = 0;
        lVar11 = lVar11 + 8;
        puVar23 = puVar23 + 1;
      } while (lVar11 != 0);
      uVar19 = auVar27._0_8_ | auVar27._0_8_ >> 0x20;
      uVar19 = uVar19 | uVar19 >> 0x10;
      uVar17 = (uint)uVar19 | (uint)(uVar19 >> 8);
    }
    else {
      uVar12 = in_x10 & 0xffffffffffffffc0;
      pauVar8 = in_x9 + 5;
      bVar25 = 0;
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
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
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
      uVar66 = 0;
      uVar75 = 0;
      uVar84 = 0;
      uVar93 = 0;
      uVar19 = uVar12;
      do {
        uVar102 = *(undefined8 *)(pauVar8[-3] + 8);
        uVar101 = *(undefined8 *)pauVar8[-3];
        uVar104 = *(undefined8 *)(pauVar8[-2] + 8);
        uVar103 = *(undefined8 *)pauVar8[-2];
        uVar106 = *(undefined8 *)(pauVar8[-1] + 8);
        uVar105 = *(undefined8 *)pauVar8[-1];
        uVar108 = *(undefined8 *)(*pauVar8 + 8);
        uVar107 = *(undefined8 *)*pauVar8;
        bVar25 = (byte)uVar101 | bVar25;
        bVar33 = (byte)((ulong)uVar101 >> 8) | bVar33;
        bVar34 = (byte)((ulong)uVar101 >> 0x10) | bVar34;
        bVar35 = (byte)((ulong)uVar101 >> 0x18) | bVar35;
        bVar36 = (byte)((ulong)uVar101 >> 0x20) | bVar36;
        bVar37 = (byte)((ulong)uVar101 >> 0x28) | bVar37;
        bVar38 = (byte)((ulong)uVar101 >> 0x30) | bVar38;
        bVar39 = (byte)((ulong)uVar101 >> 0x38) | bVar39;
        bVar40 = (byte)uVar102 | bVar40;
        bVar41 = (byte)((ulong)uVar102 >> 8) | bVar41;
        bVar42 = (byte)((ulong)uVar102 >> 0x10) | bVar42;
        bVar43 = (byte)((ulong)uVar102 >> 0x18) | bVar43;
        bVar44 = (byte)((ulong)uVar102 >> 0x20) | bVar44;
        bVar45 = (byte)((ulong)uVar102 >> 0x28) | bVar45;
        bVar46 = (byte)((ulong)uVar102 >> 0x30) | bVar46;
        bVar47 = (byte)((ulong)uVar102 >> 0x38) | bVar47;
        bVar48 = (byte)uVar103 | bVar48;
        bVar50 = (byte)((ulong)uVar103 >> 8) | bVar50;
        bVar51 = (byte)((ulong)uVar103 >> 0x10) | bVar51;
        bVar52 = (byte)((ulong)uVar103 >> 0x18) | bVar52;
        bVar53 = (byte)((ulong)uVar103 >> 0x20) | bVar53;
        bVar54 = (byte)((ulong)uVar103 >> 0x28) | bVar54;
        bVar55 = (byte)((ulong)uVar103 >> 0x30) | bVar55;
        bVar56 = (byte)((ulong)uVar103 >> 0x38) | bVar56;
        bVar57 = (byte)uVar104 | bVar57;
        bVar58 = (byte)((ulong)uVar104 >> 8) | bVar58;
        bVar59 = (byte)((ulong)uVar104 >> 0x10) | bVar59;
        bVar60 = (byte)((ulong)uVar104 >> 0x18) | bVar60;
        bVar61 = (byte)((ulong)uVar104 >> 0x20) | bVar61;
        bVar62 = (byte)((ulong)uVar104 >> 0x28) | bVar62;
        bVar63 = (byte)((ulong)uVar104 >> 0x30) | bVar63;
        bVar64 = (byte)((ulong)uVar104 >> 0x38) | bVar64;
        bVar65 = (byte)uVar105 | (byte)uVar66;
        bVar67 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar66 >> 8);
        bVar68 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar66 >> 0x10);
        bVar69 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar66 >> 0x18);
        bVar70 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar66 >> 0x20);
        bVar71 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar66 >> 0x28);
        bVar72 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar66 >> 0x30);
        bVar73 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar66 >> 0x38);
        uVar66 = CONCAT17(bVar73,CONCAT16(bVar72,CONCAT15(bVar71,CONCAT14(bVar70,CONCAT13(bVar69,
                                                  CONCAT12(bVar68,CONCAT11(bVar67,bVar65)))))));
        bVar74 = (byte)uVar106 | (byte)uVar75;
        bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar75 >> 8);
        bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar75 >> 0x10);
        bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar75 >> 0x18);
        bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar75 >> 0x20);
        bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar75 >> 0x28);
        bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar75 >> 0x30);
        bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar75 >> 0x38);
        uVar75 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar74)))))));
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
        pauVar8 = pauVar8 + 4;
        uVar19 = uVar19 - 0x40;
      } while (uVar19 != 0);
      auVar26[0] = bVar83 | bVar65 | bVar48 | bVar25;
      auVar26[1] = bVar85 | bVar67 | bVar50 | bVar33;
      auVar26[2] = bVar86 | bVar68 | bVar51 | bVar34;
      auVar26[3] = bVar87 | bVar69 | bVar52 | bVar35;
      auVar26[4] = bVar88 | bVar70 | bVar53 | bVar36;
      auVar26[5] = bVar89 | bVar71 | bVar54 | bVar37;
      auVar26[6] = bVar90 | bVar72 | bVar55 | bVar38;
      auVar26[7] = bVar91 | bVar73 | bVar56 | bVar39;
      auVar26[8] = bVar92 | bVar74 | bVar57 | bVar40;
      auVar26[9] = bVar94 | bVar76 | bVar58 | bVar41;
      auVar26[10] = bVar95 | bVar77 | bVar59 | bVar42;
      auVar26[0xb] = bVar96 | bVar78 | bVar60 | bVar43;
      auVar26[0xc] = bVar97 | bVar79 | bVar61 | bVar44;
      auVar26[0xd] = bVar98 | bVar80 | bVar62 | bVar45;
      auVar26[0xe] = bVar99 | bVar81 | bVar63 | bVar46;
      auVar26[0xf] = bVar100 | bVar82 | bVar64 | bVar47;
      auVar32 = NEON_ext(auVar26,auVar26,8,1);
      uVar19 = CONCAT17(auVar26[7] | auVar32[7],
                        CONCAT16(auVar26[6] | auVar32[6],
                                 CONCAT15(auVar26[5] | auVar32[5],
                                          CONCAT14(auVar26[4] | auVar32[4],
                                                   CONCAT13(auVar26[3] | auVar32[3],
                                                            CONCAT12(auVar26[2] | auVar32[2],
                                                                     CONCAT11(auVar26[1] |
                                                                              auVar32[1],
                                                                              auVar26[0] |
                                                                              auVar32[0])))))));
      uVar19 = uVar19 | uVar19 >> 0x20;
      uVar19 = uVar19 | uVar19 >> 0x10;
      uVar17 = (uint)uVar19 | (uint)(uVar19 >> 8);
      bVar25 = (byte)uVar17;
      if (in_x10 != uVar12) {
        if ((in_x10 & 0x38) != 0) goto LAB_002fe774;
        lVar11 = (param_1 - uVar12) + -0x20;
        pbVar16 = *in_x9 + (uVar12 | 0x20);
        do {
          uVar17 = *pbVar16 | uVar17;
          lVar11 = lVar11 + -1;
          pbVar16 = pbVar16 + 1;
        } while (lVar11 != 0);
      }
    }
    if ((uVar17 & 0xff) != 0) {
      func_0x0079dae0();
      goto LAB_002ff884;
    }
    uVar19 = param_1;
    if (0x1f < param_1) {
      uVar19 = 0x20;
    }
    if (uVar19 != 0) {
      if ((acStack_7ffffffe + (0x8000135e - uVar19) < *in_x9 + uVar19) &&
         (in_x9 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000135e))) {
        uVar12 = 0;
LAB_002fe7f0:
        lVar11 = uVar19 - uVar12;
        pcVar7 = *in_x9 + uVar12;
        pcVar22 = acStack_7ffffffe + (0x8000135d - uVar12);
        do {
          *pcVar22 = *pcVar7;
          lVar11 = lVar11 + -1;
          pcVar7 = pcVar7 + 1;
          pcVar22 = pcVar22 + -1;
        } while (lVar11 != 0);
      }
      else {
        if (uVar19 < 0x10) {
          uVar12 = 0;
        }
        else {
          uVar12 = uVar19 & 0x30;
          auVar32 = NEON_rev64(*in_x9,1);
          auVar32 = NEON_ext(auVar32,auVar32,8,1);
          unaff_x25[0x67] = auVar32._8_8_;
          unaff_x25[0x66] = auVar32._0_8_;
          if (uVar12 != 0x10) {
            auVar32 = NEON_rev64(in_x9[1],1);
            auVar32 = NEON_ext(auVar32,auVar32,8,1);
            unaff_x25[0x65] = auVar32._8_8_;
            unaff_x25[100] = auVar32._0_8_;
          }
          if (uVar19 == uVar12) goto LAB_002fe890;
          if (((uint)uVar19 >> 3 & 1) == 0) goto LAB_002fe7f0;
        }
        lVar11 = uVar19 - uVar12;
        puVar23 = (undefined8 *)(*in_x9 + uVar12);
        pcVar7 = acStack_7ffffffe + (0x80001356 - uVar12);
        do {
          uVar66 = NEON_rev64(*puVar23,1);
          *(undefined8 *)pcVar7 = uVar66;
          lVar11 = lVar11 + -8;
          puVar23 = puVar23 + 1;
          pcVar7 = pcVar7 + -8;
        } while (lVar11 != 0);
      }
    }
LAB_002fe890:
    if (param_1 < 0x20) {
      ___memset_chk(acStack_7ffffffe + 0x8000133e,0,0x20 - uVar19,0x40);
    }
    pauVar8 = *(undefined1 (**) [16])unaff_x20[1];
    lVar11 = (long)*(int *)((undefined8 *)unaff_x20[1] + 1);
    uVar19 = lVar11 * 8;
    if (0x20 < uVar19) {
      uVar12 = uVar19 - 0x20;
      if (uVar12 < 0x40) {
        bVar25 = 0;
        uVar13 = 0;
LAB_002fe95c:
        auVar29 = ZEXT116(bVar25);
        lVar14 = uVar13 + 0x20 + lVar11 * -8;
        puVar23 = (undefined8 *)(pauVar8[2] + uVar13);
        do {
          uVar66 = *puVar23;
          auVar29._0_8_ =
               CONCAT17((byte)((ulong)uVar66 >> 0x38) | auVar29[7],
                        CONCAT16((byte)((ulong)uVar66 >> 0x30) | auVar29[6],
                                 CONCAT15((byte)((ulong)uVar66 >> 0x28) | auVar29[5],
                                          CONCAT14((byte)((ulong)uVar66 >> 0x20) | auVar29[4],
                                                   CONCAT13((byte)((ulong)uVar66 >> 0x18) |
                                                            auVar29[3],
                                                            CONCAT12((byte)((ulong)uVar66 >> 0x10) |
                                                                     auVar29[2],
                                                                     CONCAT11((byte)((ulong)uVar66
                                                                                    >> 8) |
                                                                              auVar29[1],
                                                                              (byte)uVar66 |
                                                                              auVar29[0])))))));
          auVar29._8_8_ = 0;
          lVar14 = lVar14 + 8;
          puVar23 = puVar23 + 1;
        } while (lVar14 != 0);
        uVar15 = auVar29._0_8_ | auVar29._0_8_ >> 0x20;
        uVar15 = uVar15 | uVar15 >> 0x10;
        uVar17 = (uint)uVar15 | (uint)(uVar15 >> 8);
      }
      else {
        uVar13 = uVar12 & 0xffffffffffffffc0;
        pauVar20 = pauVar8 + 5;
        bVar25 = 0;
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
        bVar46 = 0;
        bVar47 = 0;
        bVar48 = 0;
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
        uVar66 = 0;
        uVar75 = 0;
        uVar84 = 0;
        uVar93 = 0;
        uVar15 = uVar13;
        do {
          uVar102 = *(undefined8 *)(pauVar20[-3] + 8);
          uVar101 = *(undefined8 *)pauVar20[-3];
          uVar104 = *(undefined8 *)(pauVar20[-2] + 8);
          uVar103 = *(undefined8 *)pauVar20[-2];
          uVar106 = *(undefined8 *)(pauVar20[-1] + 8);
          uVar105 = *(undefined8 *)pauVar20[-1];
          uVar108 = *(undefined8 *)(*pauVar20 + 8);
          uVar107 = *(undefined8 *)*pauVar20;
          bVar25 = (byte)uVar101 | bVar25;
          bVar33 = (byte)((ulong)uVar101 >> 8) | bVar33;
          bVar34 = (byte)((ulong)uVar101 >> 0x10) | bVar34;
          bVar35 = (byte)((ulong)uVar101 >> 0x18) | bVar35;
          bVar36 = (byte)((ulong)uVar101 >> 0x20) | bVar36;
          bVar37 = (byte)((ulong)uVar101 >> 0x28) | bVar37;
          bVar38 = (byte)((ulong)uVar101 >> 0x30) | bVar38;
          bVar39 = (byte)((ulong)uVar101 >> 0x38) | bVar39;
          bVar40 = (byte)uVar102 | bVar40;
          bVar41 = (byte)((ulong)uVar102 >> 8) | bVar41;
          bVar42 = (byte)((ulong)uVar102 >> 0x10) | bVar42;
          bVar43 = (byte)((ulong)uVar102 >> 0x18) | bVar43;
          bVar44 = (byte)((ulong)uVar102 >> 0x20) | bVar44;
          bVar45 = (byte)((ulong)uVar102 >> 0x28) | bVar45;
          bVar46 = (byte)((ulong)uVar102 >> 0x30) | bVar46;
          bVar47 = (byte)((ulong)uVar102 >> 0x38) | bVar47;
          bVar48 = (byte)uVar103 | bVar48;
          bVar50 = (byte)((ulong)uVar103 >> 8) | bVar50;
          bVar51 = (byte)((ulong)uVar103 >> 0x10) | bVar51;
          bVar52 = (byte)((ulong)uVar103 >> 0x18) | bVar52;
          bVar53 = (byte)((ulong)uVar103 >> 0x20) | bVar53;
          bVar54 = (byte)((ulong)uVar103 >> 0x28) | bVar54;
          bVar55 = (byte)((ulong)uVar103 >> 0x30) | bVar55;
          bVar56 = (byte)((ulong)uVar103 >> 0x38) | bVar56;
          bVar57 = (byte)uVar104 | bVar57;
          bVar58 = (byte)((ulong)uVar104 >> 8) | bVar58;
          bVar59 = (byte)((ulong)uVar104 >> 0x10) | bVar59;
          bVar60 = (byte)((ulong)uVar104 >> 0x18) | bVar60;
          bVar61 = (byte)((ulong)uVar104 >> 0x20) | bVar61;
          bVar62 = (byte)((ulong)uVar104 >> 0x28) | bVar62;
          bVar63 = (byte)((ulong)uVar104 >> 0x30) | bVar63;
          bVar64 = (byte)((ulong)uVar104 >> 0x38) | bVar64;
          bVar65 = (byte)uVar105 | (byte)uVar66;
          bVar67 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar66 >> 8);
          bVar68 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar66 >> 0x10);
          bVar69 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar66 >> 0x18);
          bVar70 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar66 >> 0x20);
          bVar71 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar66 >> 0x28);
          bVar72 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar66 >> 0x30);
          bVar73 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar66 >> 0x38);
          uVar66 = CONCAT17(bVar73,CONCAT16(bVar72,CONCAT15(bVar71,CONCAT14(bVar70,CONCAT13(bVar69,
                                                  CONCAT12(bVar68,CONCAT11(bVar67,bVar65)))))));
          bVar74 = (byte)uVar106 | (byte)uVar75;
          bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar75 >> 8);
          bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar75 >> 0x10);
          bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar75 >> 0x18);
          bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar75 >> 0x20);
          bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar75 >> 0x28);
          bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar75 >> 0x30);
          bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar75 >> 0x38);
          uVar75 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar74)))))));
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
          pauVar20 = pauVar20 + 4;
          uVar15 = uVar15 - 0x40;
        } while (uVar15 != 0);
        auVar28[0] = bVar83 | bVar65 | bVar48 | bVar25;
        auVar28[1] = bVar85 | bVar67 | bVar50 | bVar33;
        auVar28[2] = bVar86 | bVar68 | bVar51 | bVar34;
        auVar28[3] = bVar87 | bVar69 | bVar52 | bVar35;
        auVar28[4] = bVar88 | bVar70 | bVar53 | bVar36;
        auVar28[5] = bVar89 | bVar71 | bVar54 | bVar37;
        auVar28[6] = bVar90 | bVar72 | bVar55 | bVar38;
        auVar28[7] = bVar91 | bVar73 | bVar56 | bVar39;
        auVar28[8] = bVar92 | bVar74 | bVar57 | bVar40;
        auVar28[9] = bVar94 | bVar76 | bVar58 | bVar41;
        auVar28[10] = bVar95 | bVar77 | bVar59 | bVar42;
        auVar28[0xb] = bVar96 | bVar78 | bVar60 | bVar43;
        auVar28[0xc] = bVar97 | bVar79 | bVar61 | bVar44;
        auVar28[0xd] = bVar98 | bVar80 | bVar62 | bVar45;
        auVar28[0xe] = bVar99 | bVar81 | bVar63 | bVar46;
        auVar28[0xf] = bVar100 | bVar82 | bVar64 | bVar47;
        auVar32 = NEON_ext(auVar28,auVar28,8,1);
        uVar15 = CONCAT17(auVar28[7] | auVar32[7],
                          CONCAT16(auVar28[6] | auVar32[6],
                                   CONCAT15(auVar28[5] | auVar32[5],
                                            CONCAT14(auVar28[4] | auVar32[4],
                                                     CONCAT13(auVar28[3] | auVar32[3],
                                                              CONCAT12(auVar28[2] | auVar32[2],
                                                                       CONCAT11(auVar28[1] |
                                                                                auVar32[1],
                                                                                auVar28[0] |
                                                                                auVar32[0])))))));
        uVar15 = uVar15 | uVar15 >> 0x20;
        uVar15 = uVar15 | uVar15 >> 0x10;
        uVar17 = (uint)uVar15 | (uint)(uVar15 >> 8);
        bVar25 = (byte)uVar17;
        if (uVar12 != uVar13) {
          if ((uVar12 & 0x38) != 0) goto LAB_002fe95c;
          lVar14 = (uVar19 - uVar13) + -0x20;
          pbVar16 = *pauVar8 + (uVar13 | 0x20);
          do {
            uVar17 = *pbVar16 | uVar17;
            lVar14 = lVar14 + -1;
            pbVar16 = pbVar16 + 1;
          } while (lVar14 != 0);
        }
      }
      if ((uVar17 & 0xff) != 0) goto LAB_002fec40;
      if (uVar12 < 0x40) {
        bVar25 = 0;
        uVar13 = 0;
LAB_002fea28:
        auVar31 = ZEXT116(bVar25);
        lVar11 = uVar13 + 0x20 + lVar11 * -8;
        puVar23 = (undefined8 *)(pauVar8[2] + uVar13);
        do {
          uVar66 = *puVar23;
          auVar31._0_8_ =
               CONCAT17((byte)((ulong)uVar66 >> 0x38) | auVar31[7],
                        CONCAT16((byte)((ulong)uVar66 >> 0x30) | auVar31[6],
                                 CONCAT15((byte)((ulong)uVar66 >> 0x28) | auVar31[5],
                                          CONCAT14((byte)((ulong)uVar66 >> 0x20) | auVar31[4],
                                                   CONCAT13((byte)((ulong)uVar66 >> 0x18) |
                                                            auVar31[3],
                                                            CONCAT12((byte)((ulong)uVar66 >> 0x10) |
                                                                     auVar31[2],
                                                                     CONCAT11((byte)((ulong)uVar66
                                                                                    >> 8) |
                                                                              auVar31[1],
                                                                              (byte)uVar66 |
                                                                              auVar31[0])))))));
          auVar31._8_8_ = 0;
          lVar11 = lVar11 + 8;
          puVar23 = puVar23 + 1;
        } while (lVar11 != 0);
        uVar12 = auVar31._0_8_ | auVar31._0_8_ >> 0x20;
        uVar12 = uVar12 | uVar12 >> 0x10;
        uVar17 = (uint)uVar12 | (uint)(uVar12 >> 8);
      }
      else {
        uVar13 = uVar12 & 0xffffffffffffffc0;
        pauVar20 = pauVar8 + 5;
        bVar25 = 0;
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
        bVar46 = 0;
        bVar47 = 0;
        bVar48 = 0;
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
        uVar66 = 0;
        uVar75 = 0;
        uVar84 = 0;
        uVar93 = 0;
        uVar15 = uVar13;
        do {
          uVar102 = *(undefined8 *)(pauVar20[-3] + 8);
          uVar101 = *(undefined8 *)pauVar20[-3];
          uVar104 = *(undefined8 *)(pauVar20[-2] + 8);
          uVar103 = *(undefined8 *)pauVar20[-2];
          uVar106 = *(undefined8 *)(pauVar20[-1] + 8);
          uVar105 = *(undefined8 *)pauVar20[-1];
          uVar108 = *(undefined8 *)(*pauVar20 + 8);
          uVar107 = *(undefined8 *)*pauVar20;
          bVar25 = (byte)uVar101 | bVar25;
          bVar33 = (byte)((ulong)uVar101 >> 8) | bVar33;
          bVar34 = (byte)((ulong)uVar101 >> 0x10) | bVar34;
          bVar35 = (byte)((ulong)uVar101 >> 0x18) | bVar35;
          bVar36 = (byte)((ulong)uVar101 >> 0x20) | bVar36;
          bVar37 = (byte)((ulong)uVar101 >> 0x28) | bVar37;
          bVar38 = (byte)((ulong)uVar101 >> 0x30) | bVar38;
          bVar39 = (byte)((ulong)uVar101 >> 0x38) | bVar39;
          bVar40 = (byte)uVar102 | bVar40;
          bVar41 = (byte)((ulong)uVar102 >> 8) | bVar41;
          bVar42 = (byte)((ulong)uVar102 >> 0x10) | bVar42;
          bVar43 = (byte)((ulong)uVar102 >> 0x18) | bVar43;
          bVar44 = (byte)((ulong)uVar102 >> 0x20) | bVar44;
          bVar45 = (byte)((ulong)uVar102 >> 0x28) | bVar45;
          bVar46 = (byte)((ulong)uVar102 >> 0x30) | bVar46;
          bVar47 = (byte)((ulong)uVar102 >> 0x38) | bVar47;
          bVar48 = (byte)uVar103 | bVar48;
          bVar50 = (byte)((ulong)uVar103 >> 8) | bVar50;
          bVar51 = (byte)((ulong)uVar103 >> 0x10) | bVar51;
          bVar52 = (byte)((ulong)uVar103 >> 0x18) | bVar52;
          bVar53 = (byte)((ulong)uVar103 >> 0x20) | bVar53;
          bVar54 = (byte)((ulong)uVar103 >> 0x28) | bVar54;
          bVar55 = (byte)((ulong)uVar103 >> 0x30) | bVar55;
          bVar56 = (byte)((ulong)uVar103 >> 0x38) | bVar56;
          bVar57 = (byte)uVar104 | bVar57;
          bVar58 = (byte)((ulong)uVar104 >> 8) | bVar58;
          bVar59 = (byte)((ulong)uVar104 >> 0x10) | bVar59;
          bVar60 = (byte)((ulong)uVar104 >> 0x18) | bVar60;
          bVar61 = (byte)((ulong)uVar104 >> 0x20) | bVar61;
          bVar62 = (byte)((ulong)uVar104 >> 0x28) | bVar62;
          bVar63 = (byte)((ulong)uVar104 >> 0x30) | bVar63;
          bVar64 = (byte)((ulong)uVar104 >> 0x38) | bVar64;
          bVar65 = (byte)uVar105 | (byte)uVar66;
          bVar67 = (byte)((ulong)uVar105 >> 8) | (byte)((ulong)uVar66 >> 8);
          bVar68 = (byte)((ulong)uVar105 >> 0x10) | (byte)((ulong)uVar66 >> 0x10);
          bVar69 = (byte)((ulong)uVar105 >> 0x18) | (byte)((ulong)uVar66 >> 0x18);
          bVar70 = (byte)((ulong)uVar105 >> 0x20) | (byte)((ulong)uVar66 >> 0x20);
          bVar71 = (byte)((ulong)uVar105 >> 0x28) | (byte)((ulong)uVar66 >> 0x28);
          bVar72 = (byte)((ulong)uVar105 >> 0x30) | (byte)((ulong)uVar66 >> 0x30);
          bVar73 = (byte)((ulong)uVar105 >> 0x38) | (byte)((ulong)uVar66 >> 0x38);
          uVar66 = CONCAT17(bVar73,CONCAT16(bVar72,CONCAT15(bVar71,CONCAT14(bVar70,CONCAT13(bVar69,
                                                  CONCAT12(bVar68,CONCAT11(bVar67,bVar65)))))));
          bVar74 = (byte)uVar106 | (byte)uVar75;
          bVar76 = (byte)((ulong)uVar106 >> 8) | (byte)((ulong)uVar75 >> 8);
          bVar77 = (byte)((ulong)uVar106 >> 0x10) | (byte)((ulong)uVar75 >> 0x10);
          bVar78 = (byte)((ulong)uVar106 >> 0x18) | (byte)((ulong)uVar75 >> 0x18);
          bVar79 = (byte)((ulong)uVar106 >> 0x20) | (byte)((ulong)uVar75 >> 0x20);
          bVar80 = (byte)((ulong)uVar106 >> 0x28) | (byte)((ulong)uVar75 >> 0x28);
          bVar81 = (byte)((ulong)uVar106 >> 0x30) | (byte)((ulong)uVar75 >> 0x30);
          bVar82 = (byte)((ulong)uVar106 >> 0x38) | (byte)((ulong)uVar75 >> 0x38);
          uVar75 = CONCAT17(bVar82,CONCAT16(bVar81,CONCAT15(bVar80,CONCAT14(bVar79,CONCAT13(bVar78,
                                                  CONCAT12(bVar77,CONCAT11(bVar76,bVar74)))))));
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
          pauVar20 = pauVar20 + 4;
          uVar15 = uVar15 - 0x40;
        } while (uVar15 != 0);
        auVar30[0] = bVar83 | bVar65 | bVar48 | bVar25;
        auVar30[1] = bVar85 | bVar67 | bVar50 | bVar33;
        auVar30[2] = bVar86 | bVar68 | bVar51 | bVar34;
        auVar30[3] = bVar87 | bVar69 | bVar52 | bVar35;
        auVar30[4] = bVar88 | bVar70 | bVar53 | bVar36;
        auVar30[5] = bVar89 | bVar71 | bVar54 | bVar37;
        auVar30[6] = bVar90 | bVar72 | bVar55 | bVar38;
        auVar30[7] = bVar91 | bVar73 | bVar56 | bVar39;
        auVar30[8] = bVar92 | bVar74 | bVar57 | bVar40;
        auVar30[9] = bVar94 | bVar76 | bVar58 | bVar41;
        auVar30[10] = bVar95 | bVar77 | bVar59 | bVar42;
        auVar30[0xb] = bVar96 | bVar78 | bVar60 | bVar43;
        auVar30[0xc] = bVar97 | bVar79 | bVar61 | bVar44;
        auVar30[0xd] = bVar98 | bVar80 | bVar62 | bVar45;
        auVar30[0xe] = bVar99 | bVar81 | bVar63 | bVar46;
        auVar30[0xf] = bVar100 | bVar82 | bVar64 | bVar47;
        auVar32 = NEON_ext(auVar30,auVar30,8,1);
        uVar15 = CONCAT17(auVar30[7] | auVar32[7],
                          CONCAT16(auVar30[6] | auVar32[6],
                                   CONCAT15(auVar30[5] | auVar32[5],
                                            CONCAT14(auVar30[4] | auVar32[4],
                                                     CONCAT13(auVar30[3] | auVar32[3],
                                                              CONCAT12(auVar30[2] | auVar32[2],
                                                                       CONCAT11(auVar30[1] |
                                                                                auVar32[1],
                                                                                auVar30[0] |
                                                                                auVar32[0])))))));
        uVar15 = uVar15 | uVar15 >> 0x20;
        uVar15 = uVar15 | uVar15 >> 0x10;
        uVar17 = (uint)uVar15 | (uint)(uVar15 >> 8);
        bVar25 = (byte)uVar17;
        if (uVar12 != uVar13) {
          if ((uVar12 & 0x38) != 0) goto LAB_002fea28;
          lVar11 = (uVar19 - uVar13) + -0x20;
          pbVar16 = *pauVar8 + (uVar13 | 0x20);
          do {
            uVar17 = *pbVar16 | uVar17;
            lVar11 = lVar11 + -1;
            pbVar16 = pbVar16 + 1;
          } while (lVar11 != 0);
        }
      }
      if ((uVar17 & 0xff) != 0) {
LAB_002ff884:
        func_0x0079dae0();
        goto code_r0x002ff888;
      }
    }
    uVar12 = uVar19;
    if (0x1f < uVar19) {
      uVar12 = 0x20;
    }
    if (uVar12 != 0) {
      if ((acStack_7ffffffe + (0x8000137e - uVar12) < *pauVar8 + uVar12) &&
         (pauVar8 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000137e))) {
        uVar15 = 0;
LAB_002feaa4:
        lVar11 = uVar12 - uVar15;
        pcVar7 = *pauVar8 + uVar15;
        pcVar22 = acStack_7ffffffe + (0x8000137d - uVar15);
        do {
          *pcVar22 = *pcVar7;
          lVar11 = lVar11 + -1;
          pcVar7 = pcVar7 + 1;
          pcVar22 = pcVar22 + -1;
        } while (lVar11 != 0);
      }
      else {
        if (uVar12 < 0x10) {
          uVar15 = 0;
        }
        else {
          uVar15 = uVar12 & 0x30;
          auVar32 = NEON_rev64(*pauVar8,1);
          auVar32 = NEON_ext(auVar32,auVar32,8,1);
          unaff_x25[0x6b] = auVar32._8_8_;
          unaff_x25[0x6a] = auVar32._0_8_;
          if (uVar15 != 0x10) {
            auVar32 = NEON_rev64(pauVar8[1],1);
            auVar32 = NEON_ext(auVar32,auVar32,8,1);
            unaff_x25[0x69] = auVar32._8_8_;
            unaff_x25[0x68] = auVar32._0_8_;
          }
          if (uVar12 == uVar15) goto LAB_002feb44;
          if (((uint)uVar12 >> 3 & 1) == 0) goto LAB_002feaa4;
        }
        lVar11 = uVar12 - uVar15;
        puVar23 = (undefined8 *)(*pauVar8 + uVar15);
        pcVar7 = acStack_7ffffffe + (0x80001376 - uVar15);
        do {
          uVar66 = NEON_rev64(*puVar23,1);
          *(undefined8 *)pcVar7 = uVar66;
          lVar11 = lVar11 + -8;
          puVar23 = puVar23 + 1;
          pcVar7 = pcVar7 + -8;
        } while (lVar11 != 0);
      }
    }
LAB_002feb44:
    if (uVar19 < 0x20) {
      ___memset_chk(acStack_7ffffffe + 0x8000135e,0,0x20 - uVar12,0x20);
    }
    iVar4 = func_0x002fd75c(&UNK_00878915,acStack_7ffffffe + 0x8000133e,0x40,"ECDSA-sign signature")
    ;
    if (iVar4 == 0) goto LAB_002fec40;
    func_0x002c398c();
    unaff_x20 = (long *)func_0x0036e274(0x10);
    if (unaff_x20 == (long *)0x0) goto code_r0x002fec7c;
    lVar11 = func_0x0036e31c(0x18);
    if (lVar11 != 0) {
      *(undefined4 *)(lVar11 + 0x14) = 1;
    }
    *unaff_x20 = lVar11;
    lVar11 = func_0x0036e31c(0x18);
    if (lVar11 == 0) {
      unaff_x20[1] = 0;
code_r0x002fec70:
      func_0x002c398c(unaff_x20);
      unaff_x20 = (long *)0x0;
code_r0x002fec7c:
      func_0x002c398c(unaff_x20);
      unaff_x20 = (long *)0x0;
    }
    else {
      *(undefined4 *)(lVar11 + 0x14) = 1;
      unaff_x20[1] = lVar11;
      puVar23 = (undefined8 *)*unaff_x20;
      if (puVar23 == (undefined8 *)0x0) goto code_r0x002fec70;
      if (*(uint *)((long)puVar23 + 0xc) < 4) {
        if ((*(byte *)((long)puVar23 + 0x14) >> 1 & 1) == 0) {
          puVar5 = (undefined8 *)func_0x0036e358(4,8,lVar11);
          if (puVar5 != (undefined8 *)0x0) {
            if (*(int *)(puVar23 + 1) != 0) {
              _memcpy(puVar5,*puVar23,(long)*(int *)(puVar23 + 1) << 3);
            }
            func_0x0036e3d8(*puVar23);
            *puVar23 = puVar5;
            *(undefined4 *)((long)puVar23 + 0xc) = 4;
            lVar11 = unaff_x20[1];
            goto code_r0x002fecc4;
          }
        }
        else {
          func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
        }
        goto code_r0x002fec7c;
      }
      puVar5 = (undefined8 *)*puVar23;
code_r0x002fecc4:
      *(undefined4 *)(puVar23 + 1) = 4;
      *(undefined4 *)(puVar23 + 2) = 0;
      uVar84 = _UNK_0082ff28;
      uVar75 = _UNK_0082ff20;
      uVar66 = _UNK_0082ff10;
      puVar5[1] = _UNK_0082ff18;
      *puVar5 = uVar66;
      puVar5[3] = uVar84;
      puVar5[2] = uVar75;
      lVar11 = func_0x0029c764(&UNK_00878995,0x20,lVar11);
      if (lVar11 == 0) goto code_r0x002fec7c;
      func_0x00373e9c(0xa296c8,&DAT_002c21e4);
      in_stack_00000d20 = 0x40;
      iVar4 = func_0x002c0d58(&UNK_00878955,0x20,acStack_7ffffffe + 0x8000069e,
                              acStack_7ffffffe + 0x80000d1e,0xa3a728,0);
      if ((iVar4 != 0) &&
         (iVar4 = func_0x002c3b08(acStack_7ffffffe + 0x8000069e,0x40,unaff_x20), iVar4 != 0)) {
        func_0x00373e9c(0xa29738,&DAT_002c54ec);
        puVar23 = (undefined8 *)func_0x0036e274(0xe0);
        if (puVar23 != (undefined8 *)0x0) {
          uVar66 = func_0x002c6ae8(0xa3b640);
          *puVar23 = uVar66;
          puVar23[2] = 0;
          puVar23[1] = 0;
          puVar23[4] = 0;
          puVar23[3] = 0;
          puVar23[6] = 0;
          puVar23[5] = 0;
          puVar23[8] = 0;
          puVar23[7] = 0;
          puVar23[9] = 0;
          puVar23[0xb] = 0;
          puVar23[10] = 0;
          puVar23[0xd] = 0;
          puVar23[0xc] = 0;
          puVar23[0xf] = 0;
          puVar23[0xe] = 0;
          puVar23[0x11] = 0;
          puVar23[0x10] = 0;
          puVar23[0x12] = 0;
          puVar23[0x14] = 0;
          puVar23[0x13] = 0;
          puVar23[0x16] = 0;
          puVar23[0x15] = 0;
          puVar23[0x18] = 0;
          puVar23[0x17] = 0;
          puVar23[0x1a] = 0;
          puVar23[0x19] = 0;
          puVar23[0x1b] = 0;
        }
        puVar5 = (undefined8 *)func_0x0036e274(0xe0);
        if (puVar5 != (undefined8 *)0x0) {
          uVar66 = func_0x002c6ae8(0xa3b640);
          *puVar5 = uVar66;
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
              (*(undefined4 *)((long)puVar6 + 0x14) = 1, puVar23 == (undefined8 *)0x0)) ||
             (puVar5 == (undefined8 *)0x0)) ||
            ((iVar4 = func_0x002d2dc0(0xa3b640,puVar23,&UNK_008789b5,0x41,0), iVar4 == 0 ||
             (lVar11 = func_0x0029c764(&UNK_008789f6,0x20,puVar6), lVar11 == 0)))) ||
           ((iVar4 = func_0x002c98a8(0xa3b640,puVar5,0,puVar23,puVar6,0), iVar4 == 0 ||
            ((lVar11 = func_0x002cb544(0xa3b640,puVar5,4,acStack_7ffffffe + 0x8000165e,0x41),
             lVar11 == 0 ||
             (iVar4 = func_0x002fd75c(&UNK_00878a16,acStack_7ffffffe + 0x8000165e,0x41,
                                      "Z Computation Result"), iVar4 == 0)))))) {
          _fwrite("Z-computation KAT failed.\n",0x1a,1,*unaff_x24);
          func_0x002c3420();
          unaff_x19 = (char *)0x0;
          pcVar7 = (char *)0x0;
          if (puVar23 != (undefined8 *)0x0) goto code_r0x002fefa8;
        }
        else {
          func_0x002c3420();
          pcVar7 = (char *)((long)&MACH_HEADER.magic + 1);
code_r0x002fefa8:
          unaff_x19 = pcVar7;
          func_0x002c6434(*puVar23);
          func_0x0036e3d8(puVar23);
        }
        if (puVar5 != (undefined8 *)0x0) {
          func_0x002c6434(*puVar5);
          func_0x0036e3d8(puVar5);
        }
        if (puVar6 != (undefined8 *)0x0) {
          uVar17 = *(uint *)((long)puVar6 + 0x14);
          if ((uVar17 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar6);
            uVar17 = *(uint *)((long)puVar6 + 0x14);
          }
          if ((uVar17 & 1) == 0) {
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
          puVar23 = (undefined8 *)func_0x0036e31c(0x18);
          if (puVar23 == (undefined8 *)0x0) goto code_r0x002ff0fc;
          *(undefined4 *)((long)puVar23 + 0x14) = 1;
          func_0x0036e3d8(*puVar23);
          *puVar23 = &UNK_00878eb8;
          puVar23[1] = 0x400000004;
          *(undefined4 *)(puVar23 + 2) = 0;
          *(uint *)((long)puVar23 + 0x14) = *(uint *)((long)puVar23 + 0x14) | 2;
          puVar5 = (undefined8 *)unaff_x20[4];
          if (puVar5 != (undefined8 *)0x0) {
            uVar17 = *(uint *)((long)puVar5 + 0x14);
            if ((uVar17 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar5);
              uVar17 = *(uint *)((long)puVar5 + 0x14);
            }
            if ((uVar17 & 1) == 0) {
              *puVar5 = 0;
            }
            else {
              func_0x0036e3d8(puVar5);
            }
          }
          unaff_x20[4] = (long)puVar23;
          if (unaff_x19 == (char *)0x0) goto code_r0x002ff108;
          plVar9 = (long *)*unaff_x20;
          uVar3 = *(uint *)(plVar9 + 1);
          uVar19 = (ulong)uVar3;
          uVar17 = uVar3 & (int)uVar3 >> 0x1f;
          lVar11 = uVar19 * 8;
          do {
            lVar11 = lVar11 + -8;
            uVar18 = (uint)uVar19;
            uVar19 = (ulong)(uVar18 - 1);
            if ((int)uVar18 < 1) {
              if (-1 < (int)uVar3) goto code_r0x002ff108;
              lVar14 = *plVar9;
              goto code_r0x002ff66c;
            }
            lVar14 = *plVar9;
          } while (*(long *)(lVar14 + lVar11) == 0);
          uVar17 = uVar18;
code_r0x002ff66c:
          uVar12 = *(ulong *)(lVar14 + (long)(int)(uVar17 - 1) * 8);
          uVar15 = uVar12 >> 0x20;
          uVar19 = uVar15;
          if (uVar15 == 0) {
            uVar19 = uVar12;
          }
          uVar21 = uVar19 >> 0x10;
          uVar13 = uVar21;
          if (uVar21 == 0) {
            uVar13 = uVar19;
          }
          uVar19 = uVar13 >> 8;
          if (uVar13 < 0x100) {
            uVar19 = uVar13;
          }
          uVar1 = uVar19 >> 4;
          if (uVar19 < 0x10) {
            uVar1 = uVar19;
          }
          uVar2 = uVar1 >> 2;
          if (uVar1 < 4) {
            uVar2 = uVar1;
          }
          uVar17 = (uint)(uVar12 != 0) | (uVar17 - 1) * 0x40 | (uint)(uVar15 != 0) << 5 |
                   (uint)(uVar21 != 0) << 4 | (uint)(0xff < uVar13) << 3 | (uint)(0xf < uVar19) << 2
                   | (uint)(3 < uVar1) << 1;
          if (1 < uVar2) {
            uVar17 = uVar17 + 1;
          }
          if ((uVar17 + 7 & 0xfffffff8) != 0x800) goto code_r0x002ff108;
          iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000165e,unaff_x19,unaff_x20);
          if (iVar4 != 0x100) goto code_r0x002ff108;
          iVar4 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH");
          if (iVar4 == 0) goto code_r0x002ff108;
          puVar23 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
          plVar9 = (long *)func_0x0036e31c(0x108);
          if (plVar9 != (long *)0x0) {
            func_0x00373d98(plVar9 + 6);
            *(undefined4 *)((long)plVar9 + 0x104) = 1;
            lVar11 = func_0x0029c764(&UNK_00878ed8,0x100,0);
            *plVar9 = lVar11;
            if (lVar11 != 0) {
              lVar11 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
              plVar9[2] = lVar11;
              if (lVar11 != 0) {
                lVar11 = func_0x0029c764(&UNK_00878ff4,0x100,0);
                plVar9[1] = lVar11;
                if (lVar11 != 0) {
                  lVar11 = func_0x0029c764(&UNK_008790f4,0x1c,0);
                  plVar9[4] = lVar11;
                  if (lVar11 != 0) {
                    lVar11 = func_0x0029c764(&UNK_00879110,0x100,0);
                    plVar9[3] = lVar11;
                    if (lVar11 != 0) {
                      if (puVar23 != (undefined8 *)0x0) {
                        plVar10 = (long *)*plVar9;
                        uVar3 = *(uint *)(plVar10 + 1);
                        uVar19 = (ulong)uVar3;
                        uVar17 = uVar3 & (int)uVar3 >> 0x1f;
                        lVar11 = uVar19 * 8;
                        do {
                          lVar11 = lVar11 + -8;
                          uVar18 = (uint)uVar19;
                          uVar19 = (ulong)(uVar18 - 1);
                          if ((int)uVar18 < 1) {
                            if (-1 < (int)uVar3) goto code_r0x002ff860;
                            lVar14 = *plVar10;
                            goto code_r0x002ff904;
                          }
                          lVar14 = *plVar10;
                        } while (*(long *)(lVar14 + lVar11) == 0);
                        uVar17 = uVar18;
code_r0x002ff904:
                        uVar12 = *(ulong *)(lVar14 + (long)(int)(uVar17 - 1) * 8);
                        uVar15 = uVar12 >> 0x20;
                        uVar19 = uVar15;
                        if (uVar15 == 0) {
                          uVar19 = uVar12;
                        }
                        uVar21 = uVar19 >> 0x10;
                        uVar13 = uVar21;
                        if (uVar21 == 0) {
                          uVar13 = uVar19;
                        }
                        uVar19 = uVar13 >> 8;
                        if (uVar13 < 0x100) {
                          uVar19 = uVar13;
                        }
                        uVar1 = uVar19 >> 4;
                        if (uVar19 < 0x10) {
                          uVar1 = uVar19;
                        }
                        uVar2 = uVar1 >> 2;
                        if (uVar1 < 4) {
                          uVar2 = uVar1;
                        }
                        uVar17 = (uint)(uVar12 != 0) | (uVar17 - 1) * 0x40 |
                                 (uint)(uVar15 != 0) << 5 | (uint)(uVar21 != 0) << 4 |
                                 (uint)(0xff < uVar13) << 3 | (uint)(0xf < uVar19) << 2 |
                                 (uint)(3 < uVar1) << 1;
                        if (1 < uVar2) {
                          uVar17 = uVar17 + 1;
                        }
                        if ((((uVar17 + 7 & 0xfffffff8) == 0x800) &&
                            (iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar23,plVar9),
                            iVar4 == 0x100)) &&
                           (iVar4 = func_0x002fd75c(&UNK_00878db8,acStack_7ffffffe + 0x8000069e,
                                                    0x100,"FFC DH FB"), iVar4 != 0)) {
                          bVar24 = false;
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
          func_0x002bf97c(plVar9);
          plVar9 = (long *)0x0;
code_r0x002ff860:
          bVar24 = true;
          _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
          goto code_r0x002ff12c;
        }
        goto code_r0x002fdd0c;
      }
    }
    uVar75 = *unaff_x24;
    pcVar7 = "ECDSA-verify KAT failed.\n";
    uVar66 = 0x19;
  }
  else {
LAB_002fec40:
    uVar75 = *unaff_x24;
    pcVar7 = "ECDSA-sign KAT failed.\n";
    uVar66 = 0x17;
  }
  _fwrite(pcVar7,uVar66,1,uVar75);
  func_0x002c3420();
  func_0x002c398c(unaff_x20);
code_r0x002fdd0c:
  do {
    uVar66 = 0;
    while( true ) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return;
      }
      ___stack_chk_fail(uVar66);
code_r0x002ff0fc:
      func_0x002bf97c(unaff_x20);
code_r0x002ff104:
      unaff_x20 = (long *)0x0;
code_r0x002ff108:
      bVar24 = true;
      _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
      puVar23 = (undefined8 *)0x0;
      plVar9 = (long *)0x0;
code_r0x002ff12c:
      func_0x002bf97c(unaff_x20);
      if (unaff_x19 != (char *)0x0) {
        uVar17 = *(uint *)(unaff_x19 + 0x14);
        if ((uVar17 >> 1 & 1) == 0) {
          func_0x0036e3d8(*(undefined8 *)unaff_x19);
          uVar17 = *(uint *)(unaff_x19 + 0x14);
        }
        if ((uVar17 & 1) == 0) {
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
      func_0x002bf97c(plVar9);
      if (puVar23 != (undefined8 *)0x0) {
        uVar17 = *(uint *)((long)puVar23 + 0x14);
        if ((uVar17 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar23);
          uVar17 = *(uint *)((long)puVar23 + 0x14);
        }
        if ((uVar17 & 1) == 0) {
          *puVar23 = 0;
        }
        else {
          func_0x0036e3d8(puVar23);
        }
      }
      if (bVar24) break;
      unaff_x20 = (long *)(acStack_7ffffffe + 0x8000165e);
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar75 = _UNK_007fc2c8;
      uVar66 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar66;
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
      unaff_x25[0x1a5] = uVar75;
      unaff_x25[0x1a4] = uVar66;
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
      auVar32 = *(undefined1 (*) [16])(unaff_x25 + 0x196);
      unaff_x26[0xcf] = auVar32._8_8_;
      unaff_x26[0xce] = auVar32._0_8_;
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
      unaff_x25[0x1a5] = uVar75;
      unaff_x25[0x1a4] = uVar66;
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
      unaff_x25[0x1a5] = uVar75;
      unaff_x25[0x1a4] = uVar66;
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
      uVar66 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar104 = _UNK_0087afa8;
      uVar103 = _UNK_0087afa0;
      uVar102 = _UNK_0087af90;
      uVar101 = _UNK_0087af08;
      uVar93 = _UNK_0087af00;
      uVar84 = _UNK_0087aef8;
      uVar75 = _UNK_0087aef0;
      if ((int)uVar66 != 0) {
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
        uVar66 = _UNK_0087afb0;
        unaff_x25[0xd5] = _UNK_0087afb8;
        unaff_x25[0xd4] = uVar66;
        unaff_x25[0xd7] = uVar103;
        unaff_x25[0xd6] = uVar102;
        uVar103 = _UNK_0087af68;
        uVar102 = _UNK_0087af60;
        uVar66 = _UNK_0087af50;
        unaff_x25[0xc9] = _UNK_0087af58;
        unaff_x25[200] = uVar66;
        unaff_x25[0xcb] = uVar103;
        unaff_x25[0xca] = uVar102;
        uVar103 = _UNK_0087af88;
        uVar102 = _UNK_0087af80;
        uVar66 = _UNK_0087af70;
        unaff_x25[0xcd] = _UNK_0087af78;
        unaff_x25[0xcc] = uVar66;
        unaff_x25[0xcf] = uVar103;
        unaff_x25[0xce] = uVar102;
        uVar103 = _UNK_0087aee8;
        uVar102 = _UNK_0087aee0;
        uVar66 = _UNK_0087aed0;
        unaff_x26[1] = _UNK_0087aed8;
        *unaff_x26 = uVar66;
        unaff_x26[3] = uVar103;
        unaff_x26[2] = uVar102;
        unaff_x26[5] = uVar84;
        unaff_x26[4] = uVar75;
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
        auVar49 = *(undefined1 (*) [16])(unaff_x25 + 0x68);
        auVar32 = *(undefined1 (*) [16])(unaff_x25 + 0x6a);
        unaff_x26[0xd3] = auVar32._8_8_;
        unaff_x26[0xd2] = auVar32._0_8_;
        unaff_x26[0xd1] = auVar49._8_8_;
        unaff_x26[0xd0] = auVar49._0_8_;
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
          uVar75 = *unaff_x24;
          pcVar7 = "ED25519 verify failed.\n";
          uVar66 = 0x17;
          goto code_r0x002ff8f0;
        }
        uVar66 = 1;
      }
    }
  } while( true );
code_r0x002ff888:
  uVar75 = *unaff_x24;
  pcVar7 = "ED25519 sign failed.\n";
  uVar66 = 0x15;
code_r0x002ff8f0:
  _fwrite(pcVar7,uVar66,1,uVar75);
  goto code_r0x002fdd0c;
}

