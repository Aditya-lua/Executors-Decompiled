
/* WARNING: Removing unreachable block (ram,0x0030676c) */
/* WARNING: Removing unreachable block (ram,0x00306770) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_003063b0(void)

{
  byte *pbVar1;
  byte bVar2;
  undefined1 uVar3;
  byte bVar4;
  byte bVar5;
  undefined8 uVar6;
  bool bVar7;
  bool bVar8;
  int iVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  char *pcVar13;
  uint uVar14;
  ulong in_x7;
  byte *pbVar15;
  undefined *puVar16;
  code *pcVar17;
  ulong uVar18;
  undefined *puVar19;
  long lVar20;
  byte *pbVar21;
  ulong uVar22;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong uVar23;
  byte *unaff_x23;
  ulong uVar24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined4 uVar27;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  ulong uVar31;
  undefined1 auVar30 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  ulong uVar39;
  undefined1 auVar38 [16];
  undefined8 uVar40;
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  char cStack0000000000000038;
  long in_stack_00000048;
  
  pcVar13 = &cStack0000000000000038;
  iVar9 = func_0x00306af8();
  if (iVar9 == 0) {
    uVar12 = 0x75;
    unaff_x22 = 0x1a3;
LAB_00306418:
    pcVar13 = "/aws-lc/crypto/fipsmodule/cipher/e_aesccm.c";
    func_0x0028f83c(0x1e,0);
    uVar10 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return 0;
    }
  }
  else {
    uVar12 = (ulong)*(byte *)(unaff_x20 + 0x241);
    iVar9 = func_0x0036e62c(&cStack0000000000000038);
    if (iVar9 != 0) {
      uVar12 = 0x65;
      unaff_x22 = 0x1a8;
      goto LAB_00306418;
    }
    uVar10 = 1;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return 1;
    }
  }
  ___stack_chk_fail(uVar10);
  auVar47 = func_0x0079f444();
  puVar11 = auVar47._0_8_;
  pbVar15 = (byte *)*puVar11;
  uVar14 = (uint)unaff_x22;
  if (pbVar15[2] == uVar14) {
    if (pbVar15[3] != uVar14) goto LAB_00306648;
    if (pbVar15[1] != 0xd) goto LAB_0030664c;
    if (*pbVar15 != uVar12) {
      func_0x0028f83c(0x1e,0,0x66,"/aws-lc/crypto/fipsmodule/cipher/e_aesccm.c",0x148);
      return 0;
    }
    if ((pcVar13 != (char *)0x0) && ((char *)(unaff_x22 & 0xffffffff) != pcVar13)) {
      func_0x0028f83c(0x1e,0,0x74,"/aws-lc/crypto/fipsmodule/cipher/e_aesccm.c",0x151);
      return 0;
    }
    if ((uVar12 < 0x21) && ((1L << (uVar12 & 0x3f) & 0x101010000U) != 0)) {
      uVar3 = (undefined1)unaff_x22;
      if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
        if ((uRam0000000000a334f8 & 1) == 0) {
          func_0x00296a94();
          puVar16 = &_aws_lc_0_24_0_aes_nohw_ctr32_encrypt_blocks;
          puVar19 = &_aws_lc_0_24_0_aes_nohw_encrypt;
          *(undefined1 *)((long)puVar11 + 0x241) = uVar3;
        }
        else {
          func_0x0038a640(auVar47._8_8_,(int)uVar12 << 3,puVar11 + 1);
          puVar16 = &DAT_0038a7c0;
          puVar19 = &DAT_00389e90;
          *(undefined1 *)((long)puVar11 + 0x241) = uVar3;
        }
      }
      else {
        func_0x003784e0(auVar47._8_8_,(int)uVar12 << 3,puVar11 + 1);
        puVar16 = &DAT_00378c40;
        puVar19 = &DAT_00378780;
        *(undefined1 *)((long)puVar11 + 0x241) = uVar3;
      }
      if ((uVar14 - 0x11 < 0xfffffff3) || ((unaff_x22 & 1) != 0)) {
        func_0x0028f83c(0x1e,0,0x44,"/aws-lc/crypto/fipsmodule/cipher/e_aesccm.c",0x15b);
        return 0;
      }
      puVar11[0x20] = puVar19;
      puVar11[0x21] = puVar16;
      *(uint *)(puVar11 + 0x22) = uVar14;
      *(undefined4 *)((long)puVar11 + 0x114) = 2;
      return 1;
    }
  }
  else {
    func_0x0079f4b8();
LAB_00306648:
    func_0x0079f490();
LAB_0030664c:
    func_0x0079f468();
  }
  auVar47 = func_0x0079e398();
  pbVar15 = auVar47._8_8_;
  puVar11 = auVar47._0_8_;
  uVar14 = *(uint *)((long)puVar11 + 0x14);
  uVar24 = (ulong)uVar14;
  if (in_x7 >> ((ulong)(uVar14 << 3) & 0x3f) != 0 && uVar24 < 8 || 0xf - uVar14 != unaff_x22) {
    return 0;
  }
  pcVar17 = (code *)*puVar11;
  uVar27 = *(undefined4 *)(puVar11 + 2);
  pbVar15[8] = 0;
  pbVar15[9] = 0;
  pbVar15[10] = 0;
  pbVar15[0xb] = 0;
  pbVar15[0xc] = 0;
  pbVar15[0xd] = 0;
  pbVar15[0xe] = 0;
  pbVar15[0xf] = 0;
  pbVar15[0] = 0;
  pbVar15[1] = 0;
  pbVar15[2] = 0;
  pbVar15[3] = 0;
  pbVar15[4] = 0;
  pbVar15[5] = 0;
  pbVar15[6] = 0;
  pbVar15[7] = 0;
  pbVar15[0x18] = 0;
  pbVar15[0x19] = 0;
  pbVar15[0x1a] = 0;
  pbVar15[0x1b] = 0;
  pbVar15[0x1c] = 0;
  pbVar15[0x1d] = 0;
  pbVar15[0x1e] = 0;
  pbVar15[0x1f] = 0;
  pbVar15[0x10] = 0;
  pbVar15[0x11] = 0;
  pbVar15[0x12] = 0;
  pbVar15[0x13] = 0;
  pbVar15[0x14] = 0;
  pbVar15[0x15] = 0;
  pbVar15[0x16] = 0;
  pbVar15[0x17] = 0;
  bVar2 = ((byte)uVar27 & 0x3e) * '\x04' - 8 | (char)uVar14 - 1U;
  if (unaff_x21 != 0) {
    bVar2 = bVar2 | 0x40;
  }
  *pbVar15 = bVar2;
  if (unaff_x22 != 0) {
    _memcpy(pbVar15 + 1,pcVar13,unaff_x22);
  }
  uVar6 = _UNK_0082fe18;
  uVar10 = _UNK_0082fe10;
  if (uVar14 == 0) goto LAB_0030687c;
  if (uVar14 - 8 < 9) {
    auVar47._8_8_ = in_x7;
    auVar47._0_8_ = in_x7;
    if (uVar14 == 0x10) {
      auVar44._8_8_ = _UNK_0082ffd8;
      auVar44._0_8_ = _UNK_0082ffd0;
      auVar28 = NEON_ushl(auVar47,auVar44,8);
      auVar32._8_8_ = _UNK_0082ffe8;
      auVar32._0_8_ = _UNK_0082ffe0;
      auVar33 = NEON_ushl(auVar47,auVar32,8);
      auVar35._8_8_ = _UNK_0082fff8;
      auVar35._0_8_ = _UNK_0082fff0;
      auVar36 = NEON_ushl(auVar47,auVar35,8);
      auVar37._8_8_ = _UNK_00830008;
      auVar37._0_8_ = _UNK_00830000;
      auVar47 = NEON_ushl(auVar47,auVar37,8);
      auVar29[0] = auVar33[0];
      auVar29[1] = auVar33[8];
      auVar29[2] = auVar28[0];
      auVar29[3] = auVar28[8];
      auVar29[4] = auVar47[0];
      auVar29[5] = auVar47[8];
      auVar29[6] = auVar36[0];
      auVar29[7] = auVar36[8];
      auVar29._8_8_ = 0;
      auVar47 = NEON_rev64(auVar29,1);
      auVar47 = NEON_ext(auVar47,auVar47,8,1);
      *(long *)(pbVar15 + 8) = auVar47._8_8_;
      *(long *)pbVar15 = auVar47._0_8_;
      goto LAB_0030687c;
    }
    lVar20 = 0;
    uVar18 = uVar24 & 0xfffffff8;
    auVar28[8] = (undefined1)_UNK_007fc2a8;
    auVar28._0_8_ = _UNK_007fc2a0;
    auVar28[9] = (undefined1)((ulong)_UNK_007fc2a8 >> 8);
    auVar28[10] = (undefined1)((ulong)_UNK_007fc2a8 >> 0x10);
    auVar28[0xb] = (undefined1)((ulong)_UNK_007fc2a8 >> 0x18);
    auVar28[0xc] = (undefined1)((ulong)_UNK_007fc2a8 >> 0x20);
    auVar28[0xd] = (undefined1)((ulong)_UNK_007fc2a8 >> 0x28);
    auVar28[0xe] = (undefined1)((ulong)_UNK_007fc2a8 >> 0x30);
    auVar28[0xf] = (undefined1)((ulong)_UNK_007fc2a8 >> 0x38);
    auVar33[8] = (undefined1)_UNK_007fc2b8;
    auVar33._0_8_ = _UNK_007fc2b0;
    auVar33[9] = (undefined1)((ulong)_UNK_007fc2b8 >> 8);
    auVar33[10] = (undefined1)((ulong)_UNK_007fc2b8 >> 0x10);
    auVar33[0xb] = (undefined1)((ulong)_UNK_007fc2b8 >> 0x18);
    auVar33[0xc] = (undefined1)((ulong)_UNK_007fc2b8 >> 0x20);
    auVar33[0xd] = (undefined1)((ulong)_UNK_007fc2b8 >> 0x28);
    auVar33[0xe] = (undefined1)((ulong)_UNK_007fc2b8 >> 0x30);
    auVar33[0xf] = (undefined1)((ulong)_UNK_007fc2b8 >> 0x38);
    auVar36[8] = (undefined1)_UNK_007fc2c8;
    auVar36._0_8_ = _UNK_007fc2c0;
    auVar36[9] = (undefined1)((ulong)_UNK_007fc2c8 >> 8);
    auVar36[10] = (undefined1)((ulong)_UNK_007fc2c8 >> 0x10);
    auVar36[0xb] = (undefined1)((ulong)_UNK_007fc2c8 >> 0x18);
    auVar36[0xc] = (undefined1)((ulong)_UNK_007fc2c8 >> 0x20);
    auVar36[0xd] = (undefined1)((ulong)_UNK_007fc2c8 >> 0x28);
    auVar36[0xe] = (undefined1)((ulong)_UNK_007fc2c8 >> 0x30);
    auVar36[0xf] = (undefined1)((ulong)_UNK_007fc2c8 >> 0x38);
    auVar38[8] = (char)_UNK_007fc2d8;
    auVar38._0_8_ = _UNK_007fc2d0;
    auVar38[9] = (char)((ulong)_UNK_007fc2d8 >> 8);
    auVar38[10] = (char)((ulong)_UNK_007fc2d8 >> 0x10);
    auVar38[0xb] = (char)((ulong)_UNK_007fc2d8 >> 0x18);
    auVar38[0xc] = (char)((ulong)_UNK_007fc2d8 >> 0x20);
    auVar38[0xd] = (char)((ulong)_UNK_007fc2d8 >> 0x28);
    auVar38[0xe] = (char)((ulong)_UNK_007fc2d8 >> 0x30);
    auVar38[0xf] = (char)((ulong)_UNK_007fc2d8 >> 0x38);
    do {
      uVar22 = auVar36._8_8_;
      uVar39 = auVar38._8_8_;
      uVar23 = auVar33._8_8_;
      uVar31 = auVar28._8_8_;
      auVar43._0_8_ = (auVar36._0_8_ & 0x1fffffff) * -8;
      auVar43._8_8_ = (uVar22 & 0x1fffffff) * -8;
      auVar44 = NEON_ushl(auVar47,auVar43,8);
      auVar45._0_8_ = (auVar38._0_8_ & 0x1fffffff) * -8;
      auVar45._8_8_ = (uVar39 & 0x1fffffff) * -8;
      auVar43 = NEON_ushl(auVar47,auVar45,8);
      auVar46._0_8_ = (auVar33._0_8_ & 0x1fffffff) * -8;
      auVar46._8_8_ = (uVar23 & 0x1fffffff) * -8;
      auVar45 = NEON_ushl(auVar47,auVar46,8);
      auVar41._0_8_ = (auVar28._0_8_ & 0x1fffffff) * -8;
      auVar41._8_8_ = (uVar31 & 0x1fffffff) * -8;
      auVar46 = NEON_ushl(auVar47,auVar41,8);
      auVar42._8_8_ = uVar6;
      auVar42._0_8_ = uVar10;
      auVar42 = a64_TBL(ZEXT816(0),auVar43,auVar44,auVar45,auVar46,auVar42);
      uVar40 = NEON_rev64(auVar42._0_8_,1);
      *(undefined8 *)(pbVar15 + ((ulong)((int)lVar20 + 0xf) - 7)) = uVar40;
      auVar33._0_8_ = auVar33._0_8_ + 8;
      auVar33._8_8_ = uVar23 + 8;
      auVar36._0_8_ = auVar36._0_8_ + 8;
      auVar36._8_8_ = uVar22 + 8;
      auVar38._0_8_ = auVar38._0_8_ + 8;
      auVar38._8_8_ = uVar39 + 8;
      auVar28._0_8_ = auVar28._0_8_ + 8;
      auVar28._8_8_ = uVar31 + 8;
      lVar20 = lVar20 + -8;
    } while (-lVar20 != uVar18);
    if (uVar18 == uVar24) goto LAB_0030687c;
  }
  else {
    uVar18 = 0;
  }
  lVar20 = -uVar18;
  uVar18 = 0;
  do {
    pbVar15[(int)lVar20 + 0xf] = (byte)(in_x7 >> (uVar18 & 0x38));
    lVar20 = lVar20 + -1;
    uVar18 = uVar18 + 8;
  } while (-lVar20 != uVar24);
LAB_0030687c:
  pbVar1 = pbVar15 + 0x10;
  (*pcVar17)(pbVar15,pbVar1,uVar12);
  if (unaff_x21 == 0) {
    uVar24 = 1;
  }
  else {
    bVar2 = (byte)(unaff_x21 >> 8);
    if (unaff_x21 >> 8 < 0xff) {
      pbVar15[0x10] = pbVar15[0x10] ^ bVar2;
      pbVar21 = pbVar15 + 0x11;
      uVar18 = 2;
    }
    else {
      pbVar15[0x10] = ~pbVar15[0x10];
      bVar5 = (byte)(unaff_x21 >> 0x10);
      bVar4 = (byte)(unaff_x21 >> 0x18);
      if (unaff_x21 >> 0x20 == 0) {
        pbVar15[0x11] = pbVar15[0x11] ^ 0xfe;
        pbVar15[0x12] = pbVar15[0x12] ^ bVar4;
        pbVar15[0x13] = pbVar15[0x13] ^ bVar5;
        pbVar15[0x14] = pbVar15[0x14] ^ bVar2;
        pbVar21 = pbVar15 + 0x15;
        uVar18 = 6;
      }
      else {
        pbVar15[0x11] = ~pbVar15[0x11];
        auVar25._8_8_ = unaff_x21;
        auVar25._0_8_ = unaff_x21;
        auVar30._8_8_ = _UNK_00830018;
        auVar30._0_8_ = _UNK_00830010;
        auVar28 = NEON_ushl(auVar25,auVar30,8);
        auVar34._8_8_ = _UNK_00830028;
        auVar34._0_8_ = _UNK_00830020;
        auVar47 = NEON_ushl(auVar25,auVar34,8);
        uVar27 = *(undefined4 *)(pbVar15 + 0x12);
        *(uint *)(pbVar15 + 0x12) =
             CONCAT13((byte)((uint)uVar27 >> 0x18) ^ auVar28[8],
                      CONCAT12((byte)((uint)uVar27 >> 0x10) ^ auVar28[0],
                               CONCAT11((byte)((uint)uVar27 >> 8) ^ auVar47[8],
                                        (byte)uVar27 ^ auVar47[0])));
        pbVar15[0x16] = pbVar15[0x16] ^ bVar4;
        pbVar15[0x17] = pbVar15[0x17] ^ bVar5;
        pbVar15[0x18] = pbVar15[0x18] ^ bVar2;
        pbVar21 = pbVar15 + 0x19;
        uVar18 = 10;
      }
    }
    *pbVar21 = *pbVar21 ^ (byte)unaff_x21;
    uVar24 = 1;
    do {
      if (unaff_x21 == 0) {
        (*pcVar17)(pbVar1,pbVar1,uVar12);
        uVar24 = uVar24 + 1;
        break;
      }
      uVar31 = unaff_x21 - 1;
      if (0xf - uVar18 <= unaff_x21 - 1) {
        uVar31 = 0xf - uVar18;
      }
      if ((uVar31 < 0xf) ||
         (pbVar15 + uVar18 + 0x10 < unaff_x23 + uVar31 + 1 &&
          unaff_x23 < pbVar15 + uVar18 + uVar31 + 0x11)) {
LAB_00306a48:
        pbVar21 = unaff_x23;
        do {
          unaff_x23 = pbVar21 + 1;
          pbVar15[uVar18 + 0x10] = pbVar15[uVar18 + 0x10] ^ *pbVar21;
          uVar23 = unaff_x21 - 1;
          bVar7 = uVar23 != 0;
          if (0xe < uVar18) break;
          uVar18 = uVar18 + 1;
          bVar8 = unaff_x21 != 1;
          unaff_x21 = uVar23;
          pbVar21 = unaff_x23;
        } while (bVar8);
      }
      else {
        uVar22 = uVar31 + 1 & 0xfffffffffffffff0;
        pbVar21 = unaff_x23 + uVar22;
        uVar23 = unaff_x21 - uVar22;
        auVar47 = *(undefined1 (*) [16])(pbVar15 + uVar18 + 0x10);
        auVar26._0_8_ =
             CONCAT17(auVar47[7] ^ unaff_x23[7],
                      CONCAT16(auVar47[6] ^ unaff_x23[6],
                               CONCAT15(auVar47[5] ^ unaff_x23[5],
                                        CONCAT14(auVar47[4] ^ unaff_x23[4],
                                                 CONCAT13(auVar47[3] ^ unaff_x23[3],
                                                          CONCAT12(auVar47[2] ^ unaff_x23[2],
                                                                   CONCAT11(auVar47[1] ^
                                                                            unaff_x23[1],
                                                                            auVar47[0] ^ *unaff_x23)
                                                                  ))))));
        auVar26[8] = auVar47[8] ^ unaff_x23[8];
        auVar26[9] = auVar47[9] ^ unaff_x23[9];
        auVar26[10] = auVar47[10] ^ unaff_x23[10];
        auVar26[0xb] = auVar47[0xb] ^ unaff_x23[0xb];
        auVar26[0xc] = auVar47[0xc] ^ unaff_x23[0xc];
        auVar26[0xd] = auVar47[0xd] ^ unaff_x23[0xd];
        auVar26[0xe] = auVar47[0xe] ^ unaff_x23[0xe];
        auVar26[0xf] = auVar47[0xf] ^ unaff_x23[0xf];
        *(long *)(pbVar15 + uVar18 + 0x18) = auVar26._8_8_;
        *(undefined8 *)(pbVar15 + uVar18 + 0x10) = auVar26._0_8_;
        bVar7 = unaff_x21 != 0x10;
        unaff_x23 = pbVar21;
        if (uVar31 + 1 != uVar22) {
          uVar18 = uVar18 + uVar22;
          unaff_x21 = uVar23;
          goto LAB_00306a48;
        }
      }
      (*pcVar17)(pbVar1,pbVar1,uVar12);
      uVar18 = 0;
      uVar24 = uVar24 + 1;
      unaff_x21 = uVar23;
    } while (bVar7);
  }
  if (0xfffffffffffffff0 < in_x7) {
    return 0;
  }
  uVar12 = in_x7 + 0xf >> 3 | 1;
  if (!CARRY8(uVar24,uVar12)) {
    if (uVar24 + uVar12 < 0x2000000000000001) {
      *pbVar15 = *pbVar15 & 7;
      return 1;
    }
    return 0;
  }
  return 0;
}

