
/* WARNING: Possible PIC construction at 0x002b99b4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba1fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba260: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba2a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba304: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba344: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba3a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba3e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba414: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba430: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba44c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba468: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba484: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba4a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba4c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba574: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba5b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002ba5ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002ba5b4) */
/* WARNING: Removing unreachable block (ram,0x002ba578) */
/* WARNING: Removing unreachable block (ram,0x002ba4c4) */
/* WARNING: Removing unreachable block (ram,0x002ba4a4) */
/* WARNING: Removing unreachable block (ram,0x002ba488) */
/* WARNING: Removing unreachable block (ram,0x002ba46c) */
/* WARNING: Removing unreachable block (ram,0x002ba450) */
/* WARNING: Removing unreachable block (ram,0x002ba434) */
/* WARNING: Removing unreachable block (ram,0x002ba418) */
/* WARNING: Removing unreachable block (ram,0x002ba3ec) */
/* WARNING: Removing unreachable block (ram,0x002ba3ac) */
/* WARNING: Removing unreachable block (ram,0x002ba348) */
/* WARNING: Removing unreachable block (ram,0x002ba308) */
/* WARNING: Removing unreachable block (ram,0x002ba2a4) */
/* WARNING: Removing unreachable block (ram,0x002ba264) */
/* WARNING: Removing unreachable block (ram,0x002ba200) */
/* WARNING: Removing unreachable block (ram,0x002b99b8) */
/* WARNING: Removing unreachable block (ram,0x002b99a8) */
/* WARNING: Removing unreachable block (ram,0x002b9a1c) */
/* WARNING: Removing unreachable block (ram,0x002b9a54) */
/* WARNING: Removing unreachable block (ram,0x002b9a34) */
/* WARNING: Removing unreachable block (ram,0x002ba5f0) */
/* WARNING: Removing unreachable block (ram,0x002ba67c) */
/* WARNING: Removing unreachable block (ram,0x002ba6dc) */
/* WARNING: Removing unreachable block (ram,0x002ba530) */
/* WARNING: Removing unreachable block (ram,0x002ba740) */
/* WARNING: Removing unreachable block (ram,0x002ba758) */

void FUN_002b99b0(ulong *param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  long lVar2;
  undefined1 *puVar3;
  long *plVar4;
  ulong uVar5;
  ushort *puVar6;
  ulong uVar7;
  long lVar8;
  uint uVar9;
  ulong *puVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  long lVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  long lVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  long lVar35;
  long lVar36;
  undefined *puVar37;
  ulong *puVar38;
  long *plVar39;
  undefined1 *puVar40;
  ulong uVar41;
  long lVar42;
  long lVar43;
  ulong *unaff_x24;
  undefined1 *unaff_x25;
  ulong uVar44;
  long lVar45;
  ulong unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  long lVar46;
  undefined1 *puVar47;
  undefined *puVar48;
  long lVar49;
  undefined1 auVar50 [16];
  undefined1 auStack_d0 [128];
  undefined1 auStack_6 [6];
  
  puVar47 = auStack_6 + -10;
  plVar39 = (long *)0x1a666666666664;
  uVar9 = (uint)param_3;
  uVar9 = uVar9 + (uVar9 & (int)uVar9 >> 0x1f) * -2;
  puVar40 = (undefined1 *)(ulong)uVar9;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *param_1 = 1;
  param_1[6] = 0;
  param_1[5] = 0;
  param_1[8] = 0;
  param_1[7] = 0;
  param_1[9] = 0;
  param_1[4] = 0;
  param_1[5] = 1;
  param_1[0xb] = 0;
  param_1[10] = 0;
  param_1[0xd] = 0;
  param_1[0xc] = 0;
  param_1[0xe] = 0;
  lVar12 = (long)(int)unaff_x26 * 0x3c0;
  puVar37 = &UNK_00832670 + lVar12;
  func_0x002b9090(param_1,puVar37,((uVar9 ^ 1) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_008326e8 + lVar12,((uVar9 ^ 2) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_00832760 + lVar12,((uVar9 ^ 3) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_008327d8 + lVar12,((uVar9 ^ 4) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_00832850 + lVar12,((uVar9 ^ 5) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_008328c8 + lVar12,((uVar9 ^ 6) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_00832940 + lVar12,((uVar9 ^ 7) & 0xff) - 1 >> 0x1f);
  puVar10 = (ulong *)(ulong)(((uVar9 ^ 8) & 0xff) - 1 >> 0x1f);
  func_0x002b9090(param_1,&UNK_008329b8 + lVar12);
  uVar20 = param_1[10];
  if ((((uVar20 < 0x1a666666666665) && (uVar22 = param_1[0xb], uVar22 < 0x1a666666666665)) &&
      (uVar24 = param_1[0xc], uVar24 < 0x1a666666666665)) &&
     ((uVar26 = param_1[0xd], uVar26 < 0x1a666666666665 &&
      (uVar27 = param_1[0xe], uVar27 < 0x1a666666666665)))) {
    uVar28 = uVar22 + (uVar20 >> 0x33);
    uVar29 = uVar24 + (uVar28 >> 0x33);
    uVar31 = uVar26 + (uVar29 >> 0x33);
    uVar32 = uVar27 + (uVar31 >> 0x33);
    uVar33 = (uVar20 & 0x7ffffffffffff) + (uVar32 >> 0x33) * 0x13;
    uVar28 = (uVar28 & 0x7ffffffffffff) + (uVar33 >> 0x33);
    uVar5 = (param_3 << 0x20) >> 0x27;
    uVar15 = (param_1[5] ^ *param_1) & uVar5;
    uVar44 = (param_1[6] ^ param_1[1]) & uVar5;
    *param_1 = uVar15 ^ *param_1;
    param_1[1] = uVar44 ^ param_1[1];
    uVar7 = (param_1[7] ^ param_1[2]) & uVar5;
    uVar41 = (param_1[8] ^ param_1[3]) & uVar5;
    param_1[2] = uVar7 ^ param_1[2];
    param_1[3] = uVar41 ^ param_1[3];
    uVar16 = (param_1[9] ^ param_1[4]) & uVar5;
    param_1[4] = uVar16 ^ param_1[4];
    param_1[5] = uVar15 ^ param_1[5];
    param_1[6] = uVar44 ^ param_1[6];
    param_1[7] = uVar7 ^ param_1[7];
    param_1[8] = uVar41 ^ param_1[8];
    param_1[9] = uVar16 ^ param_1[9];
    param_1[10] = 0xfffffffffffda - (uVar33 & 0x7ffffffffffff) & uVar5 |
                  uVar20 & (uVar5 ^ 0xffffffffffffffff);
    param_1[0xb] = 0xffffffffffffe - (uVar28 & 0x7ffffffffffff) & uVar5 |
                   uVar22 & (uVar5 ^ 0xffffffffffffffff);
    param_1[0xc] = 0xffffffffffffe - ((uVar29 & 0x7ffffffffffff) + (uVar28 >> 0x33)) & uVar5 |
                   uVar24 & (uVar5 ^ 0xffffffffffffffff);
    param_1[0xd] = 0xffffffffffffe - (uVar31 & 0x7ffffffffffff) & uVar5 |
                   uVar26 & (uVar5 ^ 0xffffffffffffffff);
    param_1[0xe] = 0xffffffffffffe - (uVar32 & 0x7ffffffffffff) & uVar5 |
                   uVar27 & (uVar5 ^ 0xffffffffffffffff);
    return;
  }
  puVar48 = &SUB_002b9d20;
  auVar50 = func_0x0079e580();
  puVar3 = auStack_d0 + 0x80;
  do {
    lVar12 = auVar50._8_8_;
    plVar4 = auVar50._0_8_;
    *(ulong *)(puVar3 + -0x60) = unaff_x28;
    *(ulong *)(puVar3 + -0x58) = unaff_x27;
    *(ulong *)(puVar3 + -0x50) = unaff_x26;
    *(undefined1 **)(puVar3 + -0x48) = unaff_x25;
    *(ulong **)(puVar3 + -0x40) = unaff_x24;
    *(undefined1 **)(puVar3 + -0x38) = puVar40;
    *(long **)(puVar3 + -0x30) = plVar39;
    *(undefined **)(puVar3 + -0x28) = puVar37;
    *(long *)(puVar3 + -0x20) = param_3;
    *(ulong **)(puVar3 + -0x18) = param_1;
    *(undefined1 **)(puVar3 + -0x10) = puVar47;
    *(undefined **)(puVar3 + -8) = puVar48;
    func_0x002b7fd4(puVar3 + -0x90);
    puVar38 = (ulong *)(lVar12 + 0x28);
    func_0x002b7fd4(puVar3 + -0xb8,puVar38);
    func_0x002b7fd4(puVar3 + -0xe0,lVar12 + 0x50);
    uVar20 = *(ulong *)(puVar3 + -0xe0);
    if (((uVar20 < 0x8cccccccccccd) &&
        (unaff_x25 = *(undefined1 **)(puVar3 + -0xd8), unaff_x25 < (undefined1 *)0x8cccccccccccd))
       && ((unaff_x26 = *(ulong *)(puVar3 + -0xd0), unaff_x26 < 0x8cccccccccccd &&
           ((unaff_x27 = *(ulong *)(puVar3 + -200), unaff_x27 < 0x8cccccccccccd &&
            (unaff_x28 = *(ulong *)(puVar3 + -0xc0), unaff_x28 < 0x8cccccccccccd)))))) {
      plVar39 = plVar4 + 5;
      puVar10 = puVar38;
      func_0x002b828c(plVar39,lVar12);
      func_0x002bb648(puVar3 + -0x108,plVar39);
      uVar22 = *(ulong *)(puVar3 + -0xb8);
      if ((((0x8cccccccccccc < uVar22) ||
           (uVar24 = *(ulong *)(puVar3 + -0xb0), 0x8cccccccccccc < uVar24)) ||
          (uVar26 = *(ulong *)(puVar3 + -0xa8), 0x8cccccccccccc < uVar26)) ||
         ((uVar27 = *(ulong *)(puVar3 + -0xa0), 0x8cccccccccccc < uVar27 ||
          (uVar28 = *(ulong *)(puVar3 + -0x98), 0x8cccccccccccc < uVar28)))) goto code_r0x002ba038;
      uVar29 = *(ulong *)(puVar3 + -0x90);
      unaff_x24 = puVar10;
      if (((0x8cccccccccccc < uVar29) ||
          (uVar31 = *(ulong *)(puVar3 + -0x88), 0x8cccccccccccc < uVar31)) ||
         ((uVar32 = *(ulong *)(puVar3 + -0x80), 0x8cccccccccccc < uVar32 ||
          ((uVar5 = *(ulong *)(puVar3 + -0x78), 0x8cccccccccccc < uVar5 ||
           (uVar7 = *(ulong *)(puVar3 + -0x70), 0x8cccccccccccc < uVar7)))))) goto code_r0x002ba03c;
      uVar15 = uVar29 + uVar22;
      unaff_x24 = (ulong *)(uVar31 + uVar24);
      plVar4[5] = uVar15;
      plVar4[6] = (long)unaff_x24;
      plVar4[7] = uVar32 + uVar26;
      plVar4[8] = uVar5 + uVar27;
      uVar29 = (uVar22 + 0xfffffffffffda) - uVar29;
      lVar30 = (uVar24 - uVar31) + 0xffffffffffffe;
      lVar49 = (uVar26 - uVar32) + 0xffffffffffffe;
      lVar42 = (uVar27 - uVar5) + 0xffffffffffffe;
      plVar4[9] = uVar7 + uVar28;
      plVar4[10] = uVar29;
      lVar18 = (uVar28 - uVar7) + 0xffffffffffffe;
      plVar4[0xb] = lVar30;
      plVar4[0xc] = lVar49;
      plVar4[0xd] = lVar42;
      plVar4[0xe] = lVar18;
      if ((((*(ulong *)(puVar3 + -0x108) < 0x8cccccccccccd) &&
           (uVar22 = *(ulong *)(puVar3 + -0x100), uVar22 < 0x8cccccccccccd)) &&
          (uVar24 = *(ulong *)(puVar3 + -0xf8), uVar24 < 0x8cccccccccccd)) &&
         ((uVar31 = *(ulong *)(puVar3 + -0xf0), uVar31 < 0x8cccccccccccd &&
          (uVar16 = *(ulong *)(puVar3 + -0xe8), uVar16 < 0x8cccccccccccd)))) {
        puVar37 = (undefined *)((long)unaff_x24 + (uVar15 >> 0x33));
        uVar26 = uVar32 + uVar26 + ((ulong)puVar37 >> 0x33);
        uVar27 = uVar5 + uVar27 + (uVar26 >> 0x33);
        uVar28 = uVar7 + uVar28 + (uVar27 >> 0x33);
        uVar34 = (uVar15 & 0x7ffffffffffff) + (uVar28 >> 0x33) * 0x13;
        uVar32 = ((ulong)puVar37 & 0x7ffffffffffff) + (uVar34 >> 0x33);
        uVar5 = (long)unaff_x25 * 2 + (uVar20 >> 0x32);
        uVar7 = unaff_x26 * 2 + (uVar5 >> 0x33);
        uVar15 = unaff_x27 * 2 + (uVar7 >> 0x33);
        uVar33 = unaff_x28 * 2 + (uVar15 >> 0x33);
        uVar13 = (uVar20 & 0x3ffffffffffff) * 2 + (uVar33 >> 0x33) * 0x13;
        uVar20 = (uVar5 & 0x7ffffffffffff) + (uVar13 >> 0x33);
        uVar5 = lVar30 + (uVar29 >> 0x33);
        uVar41 = lVar49 + (uVar5 >> 0x33);
        uVar44 = lVar42 + (uVar41 >> 0x33);
        uVar1 = lVar18 + (uVar44 >> 0x33);
        uVar23 = (uVar29 & 0x7ffffffffffff) + (uVar1 >> 0x33) * 0x13;
        uVar29 = (uVar5 & 0x7ffffffffffff) + (uVar23 >> 0x33);
        *plVar4 = (*(ulong *)(puVar3 + -0x108) - (uVar34 & 0x7ffffffffffff)) + 0xfffffffffffda;
        plVar4[1] = (uVar22 - (uVar32 & 0x7ffffffffffff)) + 0xffffffffffffe;
        plVar4[2] = (uVar24 - ((uVar26 & 0x7ffffffffffff) + (uVar32 >> 0x33))) + 0xffffffffffffe;
        plVar4[3] = (uVar31 - (uVar27 & 0x7ffffffffffff)) + 0xffffffffffffe;
        plVar4[4] = (uVar16 - (uVar28 & 0x7ffffffffffff)) + 0xffffffffffffe;
        plVar4[0xf] = ((uVar13 & 0x7ffffffffffff) + 0xfffffffffffda) - (uVar23 & 0x7ffffffffffff);
        plVar4[0x10] = ((uVar20 & 0x7ffffffffffff) - (uVar29 & 0x7ffffffffffff)) + 0xffffffffffffe;
        plVar4[0x11] = (((uVar7 & 0x7ffffffffffff) + (uVar20 >> 0x33)) -
                       ((uVar41 & 0x7ffffffffffff) + (uVar29 >> 0x33))) + 0xffffffffffffe;
        plVar4[0x12] = ((uVar15 & 0x7ffffffffffff) - (uVar44 & 0x7ffffffffffff)) + 0xffffffffffffe;
        plVar4[0x13] = ((uVar33 & 0x7ffffffffffff) - (uVar1 & 0x7ffffffffffff)) + 0xffffffffffffe;
        return;
      }
    }
    else {
      func_0x0079e4ec();
code_r0x002ba038:
      func_0x0079e4ec();
      unaff_x24 = puVar10;
code_r0x002ba03c:
      func_0x0079e55c();
    }
    auVar50 = func_0x0079e4a4();
    param_3 = auVar50._0_8_;
    *(ulong *)(puVar3 + -0x170) = unaff_x28;
    *(ulong *)(puVar3 + -0x168) = unaff_x27;
    *(ulong *)(puVar3 + -0x160) = unaff_x26;
    *(undefined1 **)(puVar3 + -0x158) = unaff_x25;
    *(undefined8 *)(puVar3 + -0x150) = 0x8cccccccccccc;
    *(ulong *)(puVar3 + -0x148) = uVar20;
    *(long **)(puVar3 + -0x140) = plVar39;
    *(ulong **)(puVar3 + -0x138) = puVar38;
    *(long *)(puVar3 + -0x130) = lVar12;
    *(long **)(puVar3 + -0x128) = plVar4;
    *(undefined1 **)(puVar3 + -0x120) = puVar3 + -0x10;
    *(undefined **)(puVar3 + -0x118) = &_aws_lc_0_24_0_x25519_ge_scalarmult;
    puVar47 = puVar3 + -0x120;
    *(long *)(puVar3 + -0x1138) = auVar50._8_8_;
    *(undefined8 *)(puVar3 + -0x188) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    *(undefined8 *)(puVar3 + -0xf38) = 0;
    *(undefined8 *)(puVar3 + -0xf40) = 0;
    *(undefined8 *)(puVar3 + -0xf28) = 0;
    *(undefined8 *)(puVar3 + -0xf30) = 0;
    *(undefined8 *)(puVar3 + -0xf10) = 0;
    *(undefined8 *)(puVar3 + -0xf18) = 0;
    *(undefined8 *)(puVar3 + -0xf00) = 0;
    *(undefined8 *)(puVar3 + -0xf08) = 0;
    *(undefined8 *)(puVar3 + -0xf48) = 1;
    *(undefined8 *)(puVar3 + -0xf20) = 1;
    *(undefined8 *)(puVar3 + -0xee8) = 0;
    *(undefined8 *)(puVar3 + -0xef0) = 0;
    *(undefined8 *)(puVar3 + -0xed8) = 0;
    *(undefined8 *)(puVar3 + -0xee0) = 0;
    *(undefined8 *)(puVar3 + -0xec8) = 0;
    *(undefined8 *)(puVar3 + -0xed0) = 0;
    *(undefined8 *)(puVar3 + -0xeb8) = 0;
    *(undefined8 *)(puVar3 + -0xec0) = 0;
    *(undefined8 *)(puVar3 + -0xef8) = 1;
    *(undefined8 *)(puVar3 + -0xeb0) = 0;
    puVar38 = unaff_x24 + 5;
    puVar10 = (ulong *)0x8cccccccccccc;
    if ((((0x8cccccccccccc < *puVar38) ||
         ((uVar22 = unaff_x24[6], puVar10 = unaff_x24, 0x8cccccccccccc < uVar22 ||
          (uVar24 = unaff_x24[7], 0x8cccccccccccc < uVar24)))) ||
        (uVar26 = unaff_x24[8], 0x8cccccccccccc < uVar26)) ||
       (uVar27 = unaff_x24[9], 0x8cccccccccccc < uVar27)) {
      func_0x0079e4ec();
code_r0x002ba77c:
      func_0x0079e55c();
      auVar50 = ___stack_chk_fail();
      lVar49 = auVar50._8_8_;
      plVar4 = auVar50._0_8_;
      *(ulong *)(puVar3 + -0x11b0) = unaff_x26;
      *(undefined1 **)(puVar3 + -0x11a8) = unaff_x25;
      *(ulong **)(puVar3 + -0x11a0) = puVar10;
      *(ulong *)(puVar3 + -0x1198) = uVar20;
      *(long **)(puVar3 + -0x1190) = plVar39;
      *(ulong **)(puVar3 + -0x1188) = puVar38;
      *(long *)(puVar3 + -0x1180) = lVar12;
      *(undefined1 **)(puVar3 + -0x1178) = puVar3 + -0xf48;
      *(undefined1 **)(puVar3 + -0x1170) = puVar47;
      *(undefined8 *)(puVar3 + -0x1168) = 0x2ba784;
      func_0x003074c0(puVar3 + -0x1250,lVar49,lVar49 + 0x78);
      lVar12 = lVar49 + 0x28;
      lVar30 = lVar49 + 0x50;
      func_0x003074c0(puVar3 + -0x1228,lVar12,lVar30);
      plVar39 = (long *)(puVar3 + -0x1200);
      func_0x003074c0(plVar39,lVar30,lVar49 + 0x78);
      puVar47 = puVar3 + -0x11d8;
      func_0x003074c0(puVar47,lVar49,lVar12);
      uVar20 = *(ulong *)(puVar3 + -0x1228);
      if (((uVar20 < 0x8cccccccccccd) &&
          ((uVar22 = *(ulong *)(puVar3 + -0x1220), uVar22 < 0x8cccccccccccd &&
           (uVar24 = *(ulong *)(puVar3 + -0x1218), uVar24 < 0x8cccccccccccd)))) &&
         ((uVar26 = *(ulong *)(puVar3 + -0x1210), uVar26 < 0x8cccccccccccd &&
          (uVar27 = *(ulong *)(puVar3 + -0x1208), uVar27 < 0x8cccccccccccd)))) {
        uVar28 = *(ulong *)(puVar3 + -0x1250);
        if ((((uVar28 < 0x8cccccccccccd) &&
             (uVar29 = *(ulong *)(puVar3 + -0x1248), uVar29 < 0x8cccccccccccd)) &&
            (uVar31 = *(ulong *)(puVar3 + -0x1240), uVar31 < 0x8cccccccccccd)) &&
           ((uVar32 = *(ulong *)(puVar3 + -0x1238), uVar32 < 0x8cccccccccccd &&
            (uVar5 = *(ulong *)(puVar3 + -0x1230), uVar5 < 0x8cccccccccccd)))) {
          *plVar4 = uVar28 + uVar20;
          plVar4[1] = uVar29 + uVar22;
          plVar4[2] = uVar31 + uVar24;
          plVar4[3] = uVar32 + uVar26;
          plVar4[4] = uVar5 + uVar27;
          plVar4[5] = (uVar20 - uVar28) + 0xfffffffffffda;
          plVar4[6] = (uVar22 - uVar29) + 0xffffffffffffe;
          plVar4[7] = (uVar24 - uVar31) + 0xffffffffffffe;
          plVar4[8] = (uVar26 - uVar32) + 0xffffffffffffe;
          plVar4[9] = (uVar27 - uVar5) + 0xffffffffffffe;
          lVar12 = *plVar39;
          lVar49 = *(long *)(puVar3 + -0x11e8);
          lVar30 = *(long *)(puVar3 + -0x11f0);
          plVar4[0xb] = *(long *)(puVar3 + -0x11f8);
          plVar4[10] = lVar12;
          plVar4[0xd] = lVar49;
          plVar4[0xc] = lVar30;
          plVar4[0xe] = *(long *)(puVar3 + -0x11e0);
          func_0x003074c0(plVar4 + 0xf,puVar47,&UNK_00831170);
          return;
        }
      }
      else {
        func_0x0079e4ec();
      }
      puVar6 = (ushort *)func_0x0079e55c();
      *(ulong *)(puVar3 + -0x12a0) = unaff_x28;
      *(ulong *)(puVar3 + -0x1298) = unaff_x27;
      *(undefined1 **)(puVar3 + -0x1290) = puVar3 + -0x1250;
      *(undefined8 *)(puVar3 + -0x1288) = 0x8cccccccccccc;
      *(long *)(puVar3 + -0x1280) = lVar30;
      *(long *)(puVar3 + -0x1278) = lVar12;
      *(long *)(puVar3 + -0x1270) = lVar49;
      *(undefined1 **)(puVar3 + -0x1268) = puVar47;
      *(long **)(puVar3 + -0x1260) = plVar39;
      *(long **)(puVar3 + -0x1258) = plVar4;
      uVar26 = (ulong)((*(uint *)(puVar6 + 0x16) >> 0x18 | (uint)(byte)puVar6[0x18] << 8 |
                       (uint)*(byte *)((long)puVar6 + 0x31) << 0x10) >> 2) & 0x1fffff;
      uVar31 = (ulong)(*(uint *)((long)puVar6 + 0x31) >> 7) & 0x1fffff;
      uVar28 = (ulong)(*(uint *)(puVar6 + 0x1a) >> 4) & 0x1fffff;
      uVar27 = (ulong)((*(uint *)(puVar6 + 0x1a) >> 0x18 | (uint)(byte)puVar6[0x1c] << 8 |
                       (uint)*(byte *)((long)puVar6 + 0x39) << 0x10) >> 1) & 0x1fffff;
      lVar8 = ((ulong)(*(uint *)((long)puVar6 + 0xf) >> 6) & 0x1fffff) + uVar26 * 0xa2c13;
      lVar46 = ((ulong)*(ushort *)((long)puVar6 + 0x15) |
               ((ulong)*(byte *)((long)puVar6 + 0x17) & 0x1f) << 0x10) + uVar31 * 0x72d18 +
               uVar28 * 0xa2c13 + uVar26 * 0x9fb67;
      uVar20 = lVar8 + 0x100000;
      lVar12 = (((ulong)(*(uint *)((long)puVar6 + 0xf) >> 0x18) |
                 (ulong)*(byte *)((long)puVar6 + 0x13) << 8 | (ulong)(byte)puVar6[10] << 0x10) >> 3)
               + uVar31 * 0xa2c13 + uVar26 * 0x72d18 + (uVar20 >> 0x15);
      uVar22 = lVar46 + 0x100000;
      lVar30 = ((ulong)(*(uint *)((long)puVar6 + 0x17) >> 5) & 0x1fffff) + uVar31 * 0x9fb67 +
               uVar28 * 0x72d18 + (long)(int)uVar26 * -0xf39ad + uVar27 * 0xa2c13 + (uVar22 >> 0x15)
      ;
      uVar9 = *(uint *)(puVar6 + 0x1e) >> 3;
      lVar36 = ((ulong)puVar6[0x15] | ((ulong)(byte)puVar6[0x16] & 0x1f) << 0x10) +
               (long)(int)uVar9 * -0xa6f7d;
      uVar29 = (ulong)(*(uint *)((long)puVar6 + 0x39) >> 6) & 0x1fffff;
      lVar35 = ((ulong)(*(uint *)(puVar6 + 0x12) >> 6) & 0x1fffff) + (long)(int)uVar9 * -0xf39ad +
               uVar29 * 0x215d1 + (long)(int)uVar27 * -0xa6f7d;
      lVar17 = ((ulong)(*(uint *)((long)puVar6 + 0x1f) >> 4) & 0x1fffff) +
               (long)(int)uVar31 * -0xa6f7d + uVar28 * 0x215d1 + (ulong)uVar9 * 0x72d18 +
               uVar29 * 0x9fb67 + (long)(int)uVar27 * -0xf39ad;
      lVar45 = ((ulong)((*(uint *)((long)puVar6 + 0x17) >> 0x18 |
                         (uint)*(byte *)((long)puVar6 + 0x1b) << 8 | (uint)(byte)puVar6[0xe] << 0x10
                        ) >> 2) & 0x1fffff) + (long)(int)uVar31 * -0xf39ad + uVar28 * 0x9fb67 +
               uVar26 * 0x215d1 + uVar29 * 0xa2c13 + uVar27 * 0x72d18;
      uVar24 = lVar45 + 0x100000;
      lVar49 = ((ulong)(*(uint *)(puVar6 + 0xe) >> 7) & 0x1fffff) + uVar31 * 0x215d1 +
               (long)(int)uVar28 * -0xf39ad + (long)(int)uVar26 * -0xa6f7d + (ulong)uVar9 * 0xa2c13
               + uVar29 * 0x72d18 + uVar27 * 0x9fb67 + ((long)uVar24 >> 0x15);
      uVar26 = lVar17 + 0x100000;
      lVar42 = ((ulong)((*(uint *)((long)puVar6 + 0x1f) >> 0x18 |
                         (uint)*(byte *)((long)puVar6 + 0x23) << 8 |
                        (uint)(byte)puVar6[0x12] << 0x10) >> 1) & 0x1fffff) +
               (long)(int)uVar28 * -0xa6f7d + (ulong)uVar9 * 0x9fb67 + (long)(int)uVar29 * -0xf39ad
               + uVar27 * 0x215d1 + ((long)uVar26 >> 0x15);
      uVar27 = lVar35 + 0x100000;
      lVar18 = (((ulong)(*(uint *)(puVar6 + 0x12) >> 0x18) | (ulong)(byte)puVar6[0x14] << 8 |
                (ulong)*(byte *)((long)puVar6 + 0x29) << 0x10) >> 3) + (ulong)uVar9 * 0x215d1 +
               (long)(int)uVar29 * -0xa6f7d + ((long)uVar27 >> 0x15);
      uVar28 = lVar36 + 0x100000;
      lVar2 = ((ulong)(*(uint *)(puVar6 + 0x16) >> 5) & 0x1fffff) + ((long)uVar28 >> 0x15);
      uVar29 = lVar12 + 0x100000;
      uVar31 = lVar49 + 0x100000;
      lVar17 = (lVar17 - (uVar26 & 0xffffffffffe00000)) + ((long)uVar31 >> 0x15);
      uVar26 = lVar42 + 0x100000;
      lVar35 = (lVar35 - (uVar27 & 0xffffffffffe00000)) + ((long)uVar26 >> 0x15);
      lVar42 = lVar42 - (uVar26 & 0xffffffffffe00000);
      uVar26 = lVar18 + 0x100000;
      lVar36 = (lVar36 - (uVar28 & 0xffffffffffe00000)) + ((long)uVar26 >> 0x15);
      lVar18 = lVar18 - (uVar26 & 0xffffffffffe00000);
      lVar19 = (lVar46 - (uVar22 & 0xfffffe00000)) + (uVar29 >> 0x15) + lVar2 * -0xf39ad +
               lVar36 * 0x215d1 + lVar18 * -0xa6f7d;
      lVar14 = (lVar8 - (uVar20 & 0x7ffffe00000)) + lVar2 * 0x72d18 + lVar36 * 0x9fb67 +
               lVar18 * -0xf39ad + lVar35 * 0x215d1 + lVar42 * -0xa6f7d;
      uVar20 = lVar30 + 0x100000;
      lVar8 = ((lVar45 + lVar2 * -0xa6f7d) - (uVar24 & 0xffffffffffe00000)) + ((long)uVar20 >> 0x15)
      ;
      lVar43 = ((ulong)*puVar6 | ((ulong)(byte)puVar6[1] & 0x1f) << 0x10) + lVar17 * 0xa2c13;
      lVar25 = ((ulong)((*(uint *)(puVar6 + 1) >> 0x18 | (uint)(byte)puVar6[3] << 8 |
                        (uint)*(byte *)((long)puVar6 + 7) << 0x10) >> 2) & 0x1fffff) +
               lVar35 * 0xa2c13 + lVar42 * 0x72d18 + lVar17 * 0x9fb67;
      lVar21 = ((ulong)(*(uint *)(puVar6 + 5) >> 4) & 0x1fffff) + lVar36 * 0xa2c13 +
               lVar18 * 0x72d18 + lVar35 * 0x9fb67 + lVar42 * -0xf39ad + lVar17 * 0x215d1;
      uVar22 = lVar43 + 0x100000;
      lVar45 = ((ulong)(*(uint *)(puVar6 + 1) >> 5) & 0x1fffff) + lVar42 * 0xa2c13 +
               lVar17 * 0x72d18 + ((long)uVar22 >> 0x15);
      uVar24 = lVar14 + 0x100000;
      lVar12 = (lVar12 - (uVar29 & 0x7fffffffffe00000)) + lVar2 * 0x9fb67 + lVar36 * -0xf39ad +
               lVar18 * 0x215d1 + lVar35 * -0xa6f7d + ((long)uVar24 >> 0x15);
      uVar26 = lVar19 + 0x100000;
      lVar30 = ((lVar30 + lVar2 * 0x215d1) - (uVar20 & 0xffffffffffe00000)) + lVar36 * -0xa6f7d +
               ((long)uVar26 >> 0x15);
      uVar20 = lVar8 + 0x100000;
      lVar49 = (lVar49 - (uVar31 & 0xffffffffffe00000)) + ((long)uVar20 >> 0x15);
      uVar27 = lVar45 + 0x100000;
      uVar28 = lVar12 + 0x100000;
      uVar29 = lVar30 + 0x100000;
      uVar31 = lVar49 + 0x100000;
      lVar11 = (long)uVar31 >> 0x15;
      uVar32 = lVar25 + 0x100000;
      lVar46 = ((ulong)(*(uint *)((long)puVar6 + 7) >> 7) & 0x1fffff) + lVar18 * 0xa2c13 +
               lVar35 * 0x72d18 + lVar42 * 0x9fb67 + lVar17 * -0xf39ad + ((long)uVar32 >> 0x15);
      uVar5 = lVar46 + 0x100000;
      uVar7 = lVar21 + 0x100000;
      lVar42 = ((ulong)((*(uint *)(puVar6 + 5) >> 0x18 | (uint)(byte)puVar6[7] << 8 |
                        (uint)*(byte *)((long)puVar6 + 0xf) << 0x10) >> 1) & 0x1fffff) +
               lVar2 * 0xa2c13 + lVar36 * 0x72d18 + lVar18 * 0x9fb67 + lVar35 * -0xf39ad +
               lVar42 * 0x215d1 + lVar17 * -0xa6f7d + ((long)uVar7 >> 0x15);
      uVar16 = (lVar43 - (uVar22 & 0xffffffffffe00000)) + lVar11 * 0xa2c13;
      uVar22 = lVar42 + 0x100000;
      uVar15 = ((lVar45 + lVar11 * 0x72d18) - (uVar27 & 0xffffffffffe00000)) +
               ((long)uVar16 >> 0x15);
      uVar27 = ((lVar25 + lVar11 * 0x9fb67) - (uVar32 & 0xffffffffffe00000)) +
               ((long)uVar27 >> 0x15) + ((long)uVar15 >> 0x15);
      uVar32 = ((lVar46 + lVar11 * -0xf39ad) - (uVar5 & 0xffffffffffe00000)) +
               ((long)uVar27 >> 0x15);
      uVar5 = ((lVar21 + lVar11 * 0x215d1) - (uVar7 & 0xffffffffffe00000)) + ((long)uVar5 >> 0x15) +
              ((long)uVar32 >> 0x15);
      uVar7 = ((lVar42 + lVar11 * -0xa6f7d) - (uVar22 & 0xffffffffffe00000)) + ((long)uVar5 >> 0x15)
      ;
      uVar22 = (lVar14 - (uVar24 & 0xffffffffffe00000)) + ((long)uVar22 >> 0x15) +
               ((long)uVar7 >> 0x15);
      uVar24 = (lVar12 - (uVar28 & 0xffffffffffe00000)) + ((long)uVar22 >> 0x15);
      uVar26 = (lVar19 - (uVar26 & 0xffffffffffe00000)) + ((long)uVar28 >> 0x15) +
               ((long)uVar24 >> 0x15);
      uVar28 = (lVar30 - (uVar29 & 0xffffffffffe00000)) + ((long)uVar26 >> 0x15);
      uVar20 = (lVar8 - (uVar20 & 0xffffffffffe00000)) + ((long)uVar29 >> 0x15) +
               ((long)uVar28 >> 0x15);
      uVar29 = (lVar49 - (uVar31 & 0xffffffffffe00000)) + ((long)uVar20 >> 0x15);
      lVar12 = (long)uVar29 >> 0x15;
      lVar30 = (uVar16 & 0x1fffff) + lVar12 * 0xa2c13;
      *(char *)((long)puVar6 + 1) = (char)((ulong)lVar30 >> 8);
      uVar31 = (uVar15 & 0x1fffff) + lVar12 * 0x72d18 + (lVar30 >> 0x15);
      *(char *)puVar6 = (char)lVar30;
      *(byte *)(puVar6 + 1) = (byte)((ulong)lVar30 >> 0x10) & 0x1f | (byte)((uint)uVar31 << 5);
      *(char *)((long)puVar6 + 3) = (char)(uVar31 >> 3);
      *(char *)(puVar6 + 2) = (char)(uVar31 >> 0xb);
      uVar27 = (uVar27 & 0x1fffff) + lVar12 * 0x9fb67 + ((long)uVar31 >> 0x15);
      *(byte *)((long)puVar6 + 5) = (byte)((uint)uVar31 >> 0x13) & 3 | (byte)((uint)uVar27 << 2);
      *(char *)(puVar6 + 3) = (char)(uVar27 >> 6);
      uVar31 = (uVar32 & 0x1fffff) + lVar12 * -0xf39ad + ((long)uVar27 >> 0x15);
      *(byte *)((long)puVar6 + 7) = (byte)((uint)uVar27 >> 0xe) & 0x7f | (byte)((uint)uVar31 << 7);
      *(char *)(puVar6 + 4) = (char)(uVar31 >> 1);
      *(char *)((long)puVar6 + 9) = (char)(uVar31 >> 9);
      uVar27 = (uVar5 & 0x1fffff) + lVar12 * 0x215d1 + ((long)uVar31 >> 0x15);
      *(byte *)(puVar6 + 5) = (byte)((uint)uVar31 >> 0x11) & 0xf | (byte)((uint)uVar27 << 4);
      *(char *)((long)puVar6 + 0xb) = (char)(uVar27 >> 4);
      *(char *)(puVar6 + 6) = (char)(uVar27 >> 0xc);
      uVar31 = (uVar7 & 0x1fffff) + lVar12 * -0xa6f7d + ((long)uVar27 >> 0x15);
      *(byte *)((long)puVar6 + 0xd) = (byte)((uint)uVar27 >> 0x14) & 1 | (byte)((uint)uVar31 << 1);
      *(char *)(puVar6 + 7) = (char)(uVar31 >> 7);
      uVar22 = (uVar22 & 0x1fffff) + ((long)uVar31 >> 0x15);
      *(byte *)((long)puVar6 + 0xf) = (byte)((uint)uVar31 >> 0xf) & 0x3f | (byte)((uint)uVar22 << 6)
      ;
      *(char *)(puVar6 + 8) = (char)(uVar22 >> 2);
      *(char *)((long)puVar6 + 0x11) = (char)(uVar22 >> 10);
      uVar24 = (uVar24 & 0x1fffff) + ((long)uVar22 >> 0x15);
      *(byte *)(puVar6 + 9) = (byte)((uint)uVar22 >> 0x12) & 7 | (byte)((int)uVar24 << 3);
      *(char *)((long)puVar6 + 0x13) = (char)(uVar24 >> 5);
      lVar12 = (uVar26 & 0x1fffff) + ((long)uVar24 >> 0x15);
      *(char *)(puVar6 + 10) = (char)(uVar24 >> 0xd);
      *(char *)(puVar6 + 0xb) = (char)((ulong)lVar12 >> 8);
      uVar22 = (uVar28 & 0x1fffff) + (lVar12 >> 0x15);
      *(char *)((long)puVar6 + 0x15) = (char)lVar12;
      *(byte *)((long)puVar6 + 0x17) =
           (byte)((ulong)lVar12 >> 0x10) & 0x1f | (byte)((uint)uVar22 << 5);
      *(char *)(puVar6 + 0xc) = (char)(uVar22 >> 3);
      *(char *)((long)puVar6 + 0x19) = (char)(uVar22 >> 0xb);
      uVar20 = (uVar20 & 0x1fffff) + ((long)uVar22 >> 0x15);
      *(byte *)(puVar6 + 0xd) = (byte)((uint)uVar22 >> 0x13) & 3 | (byte)((uint)uVar20 << 2);
      *(char *)((long)puVar6 + 0x1b) = (char)(uVar20 >> 6);
      uVar22 = (uVar29 & 0x1fffff) + ((long)uVar20 >> 0x15);
      *(byte *)(puVar6 + 0xe) = (byte)((uint)uVar20 >> 0xe) & 0x7f | (byte)((int)uVar22 << 7);
      *(char *)((long)puVar6 + 0x1d) = (char)(uVar22 >> 1);
      *(char *)(puVar6 + 0xf) = (char)(uVar22 >> 9);
      *(char *)((long)puVar6 + 0x1f) = (char)(uVar22 >> 0x11);
      return;
    }
    if ((((0x8cccccccccccc < *unaff_x24) || (uVar28 = unaff_x24[1], 0x8cccccccccccc < uVar28)) ||
        (uVar29 = unaff_x24[2], 0x8cccccccccccc < uVar29)) ||
       ((uVar31 = unaff_x24[3], 0x8cccccccccccc < uVar31 ||
        (uVar32 = unaff_x24[4], lVar12 = param_3, 0x8cccccccccccc < uVar32))))
    goto code_r0x002ba77c;
    *(ulong *)(puVar3 + -0xea8) = *unaff_x24 + *puVar38;
    *(ulong *)(puVar3 + -0xea0) = uVar28 + uVar22;
    *(ulong *)(puVar3 + -0xe98) = uVar29 + uVar24;
    *(ulong *)(puVar3 + -0xe90) = uVar31 + uVar26;
    *(ulong *)(puVar3 + -0xe88) = uVar32 + uVar27;
    func_0x002b81b4(puVar3 + -0xe80,puVar38,unaff_x24);
    uVar20 = unaff_x24[10];
    uVar24 = unaff_x24[0xd];
    uVar22 = unaff_x24[0xc];
    *(ulong *)(puVar3 + -0xe50) = unaff_x24[0xb];
    *(ulong *)(puVar3 + -0xe58) = uVar20;
    *(ulong *)(puVar3 + -0xe40) = uVar24;
    *(ulong *)(puVar3 + -0xe48) = uVar22;
    *(ulong *)(puVar3 + -0xe38) = unaff_x24[0xe];
    unaff_x25 = puVar3 + -0xf48;
    puVar10 = (ulong *)&UNK_00831170;
    func_0x003074c0(puVar3 + -0xe30,unaff_x24 + 0xf);
    uVar20 = *unaff_x24;
    uVar24 = unaff_x24[3];
    uVar22 = unaff_x24[2];
    *(ulong *)(puVar3 + -0x4c8) = unaff_x24[1];
    *(ulong *)(puVar3 + -0x4d0) = uVar20;
    *(ulong *)(puVar3 + -0x4b8) = uVar24;
    *(ulong *)(puVar3 + -0x4c0) = uVar22;
    uVar20 = *puVar38;
    uVar24 = unaff_x24[8];
    uVar22 = unaff_x24[7];
    *(ulong *)(puVar3 + -0x4a0) = unaff_x24[6];
    *(ulong *)(puVar3 + -0x4a8) = uVar20;
    *(ulong *)(puVar3 + -0x490) = uVar24;
    *(ulong *)(puVar3 + -0x498) = uVar22;
    uVar20 = unaff_x24[10];
    uVar24 = unaff_x24[0xd];
    uVar22 = unaff_x24[0xc];
    *(ulong *)(puVar3 + -0x478) = unaff_x24[0xb];
    *(ulong *)(puVar3 + -0x480) = uVar20;
    param_1 = (ulong *)(puVar3 + -0x548);
    uVar20 = unaff_x24[9];
    *(ulong *)(puVar3 + -0x4b0) = unaff_x24[4];
    *(ulong *)(puVar3 + -0x488) = uVar20;
    *(ulong *)(puVar3 + -0x468) = uVar24;
    *(ulong *)(puVar3 + -0x470) = uVar22;
    puVar37 = puVar3 + -0xf70;
    *(ulong *)(puVar3 + -0x460) = unaff_x24[0xe];
    plVar39 = (long *)(puVar3 + -0xfc0);
    puVar40 = puVar3 + -0xf98;
    auVar50._8_8_ = puVar3 + -0x4d0;
    auVar50._0_8_ = puVar3 + -0xfe8;
    puVar48 = &UNK_002ba200;
    puVar3 = puVar3 + -0x1160;
  } while( true );
}

