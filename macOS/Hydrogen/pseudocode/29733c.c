
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_0029733c(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long *plVar1;
  int iVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined4 uVar21;
  undefined4 uVar22;
  undefined4 uVar23;
  undefined1 *puVar24;
  undefined1 *puVar25;
  undefined8 uVar26;
  ulong *puVar27;
  undefined1 (*pauVar28) [16];
  uint uVar29;
  undefined8 *puVar30;
  undefined8 *puVar31;
  undefined1 (*pauVar32) [16];
  ulong uVar33;
  ulong in_x9;
  ulong uVar34;
  ulong uVar35;
  ulong in_x10;
  ulong uVar36;
  ulong in_x11;
  ulong uVar37;
  ulong in_x12;
  long extraout_x12;
  ulong uVar38;
  ulong in_x13;
  ulong uVar39;
  ulong in_x14;
  undefined8 *unaff_x19;
  long lVar40;
  long unaff_x20;
  undefined1 (*unaff_x21) [16];
  undefined1 *unaff_x22;
  undefined *unaff_x23;
  undefined1 (*pauVar41) [16];
  undefined1 (*unaff_x24) [16];
  byte *pbVar42;
  byte *unaff_x25;
  undefined8 *unaff_x26;
  long *unaff_x27;
  long *unaff_x28;
  undefined1 *unaff_x29;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  long lVar48;
  byte bVar52;
  undefined1 auVar43 [16];
  byte bVar53;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  long lVar59;
  undefined1 auVar54 [16];
  undefined8 uVar64;
  undefined1 auVar63 [16];
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined1 auVar69 [12];
  
  while( true ) {
    pauVar32 = unaff_x21;
    uVar34 = (in_x9 >> 0x24 & 0xf000 | in_x9 >> 0x34) ^ in_x10 >> 4 ^
             (in_x12 >> 0x20 | in_x14 << 0x20);
    uVar34 = uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34;
    *(ulong *)*pauVar32 = param_1;
    *(ulong *)(*pauVar32 + 8) = uVar34;
    uVar34 = uVar34 >> 0x30 ^ in_x14 >> 0x20;
    *(ulong *)*unaff_x24 = in_x13 ^ in_x11;
    *(ulong *)(*unaff_x24 + 8) = (uint)((int)uVar34 << 0x10) ^ uVar34;
    unaff_x20 = unaff_x20 + 2;
    auVar43 = *pauVar32;
    unaff_x19[3] = auVar43._8_8_;
    unaff_x19[2] = auVar43._0_8_;
    unaff_x19 = unaff_x19 + 6;
    puVar24 = (undefined1 *)register0x00000008;
    puVar30 = param_4;
    pauVar41 = unaff_x24;
    if (unaff_x20 == 8) break;
LAB_002970cc:
    uVar34 = *(ulong *)*unaff_x24;
    uVar33 = *(ulong *)(*unaff_x24 + 8);
    uVar35 = uVar34 >> 1 & 0x5555555555555555;
    uVar36 = uVar34 ^ uVar35 << 1;
    uVar37 = uVar33 >> 1 & 0x5555555555555555;
    uVar38 = uVar33 ^ uVar37 << 1;
    uVar39 = uVar36 >> 2 & 0x3333333333333333;
    uVar34 = uVar34 >> 3 & 0x1111111111111111;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x40) = uVar36 ^ uVar39 << 2;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x40) + 8) = uVar35 ^ uVar34 << 2;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x50) = uVar39;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x50) + 8) = uVar34;
    uVar34 = uVar38 >> 2 & 0x3333333333333333;
    uVar33 = uVar33 >> 3 & 0x1111111111111111;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x60) = uVar38 ^ uVar34 << 2;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x60) + 8) = uVar37 ^ uVar33 << 2;
    unaff_x26 = (undefined8 *)(unaff_x22 + 0x30);
    unaff_x27 = (long *)(unaff_x22 + 0x28);
    unaff_x28 = (long *)(unaff_x22 + 0x38);
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x70) = uVar34;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x70) + 8) = uVar33;
    func_0x00301ca0((undefined1 (*) [16])((long)register0x00000008 + 0x40));
    uVar26 = *(undefined8 *)(unaff_x22 + 0x20);
    uVar64 = *unaff_x26;
    unaff_x25 = unaff_x23 + unaff_x20;
    lVar48 = *unaff_x27 * 2;
    uVar33 = *(long *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x40) + 8) * 2 &
             0x2222222222222222;
    uVar34 = *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x40) & 0x1111111111111111;
    lVar40 = *unaff_x28 * 2;
    uVar35 = *(long *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x50) + 8) * 2 &
             0x2222222222222222;
    uVar36 = *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x50) & 0x1111111111111111;
    auVar63._0_8_ =
         CONCAT17((char)(uVar35 >> 0x38),
                  CONCAT16((byte)(uVar35 >> 0x30) | (byte)(uVar36 >> 0x30),
                           CONCAT15((byte)(uVar35 >> 0x28) | (byte)(uVar36 >> 0x28),
                                    CONCAT14((byte)(uVar35 >> 0x20) | (byte)(uVar36 >> 0x20),
                                             CONCAT13((byte)(uVar35 >> 0x18) |
                                                      (byte)(uVar36 >> 0x18),
                                                      CONCAT12((byte)(uVar35 >> 0x10) |
                                                               (byte)(uVar36 >> 0x10),
                                                               CONCAT11((byte)(uVar35 >> 8) |
                                                                        (byte)(uVar36 >> 8),
                                                                        (byte)uVar35 | (byte)uVar36)
                                                              ))))));
    auVar63[8] = (byte)lVar40 & 0x22 | (byte)uVar64 & 0x11;
    auVar63[9] = (byte)((ulong)lVar40 >> 8) & 0x22 | (byte)((ulong)uVar64 >> 8) & 0x11;
    auVar63[10] = (byte)((ulong)lVar40 >> 0x10) & 0x22 | (byte)((ulong)uVar64 >> 0x10) & 0x11;
    auVar63[0xb] = (byte)((ulong)lVar40 >> 0x18) & 0x22 | (byte)((ulong)uVar64 >> 0x18) & 0x11;
    auVar63[0xc] = (byte)((ulong)lVar40 >> 0x20) & 0x22 | (byte)((ulong)uVar64 >> 0x20) & 0x11;
    auVar63[0xd] = (byte)((ulong)lVar40 >> 0x28) & 0x22 | (byte)((ulong)uVar64 >> 0x28) & 0x11;
    auVar63[0xe] = (byte)((ulong)lVar40 >> 0x30) & 0x22 | (byte)((ulong)uVar64 >> 0x30) & 0x11;
    auVar63[0xf] = (byte)((ulong)lVar40 >> 0x38) & 0x22 | (byte)((ulong)uVar64 >> 0x38) & 0x11;
    lVar40 = auVar63._0_8_ << 2;
    lVar59 = auVar63._8_8_ << 2;
    auVar54._0_8_ =
         CONCAT17((char)((ulong)lVar40 >> 0x38),
                  CONCAT16((byte)((ulong)lVar40 >> 0x30) |
                           (byte)(uVar34 >> 0x30) | (byte)(uVar33 >> 0x30),
                           CONCAT15((byte)((ulong)lVar40 >> 0x28) |
                                    (byte)(uVar34 >> 0x28) | (byte)(uVar33 >> 0x28),
                                    CONCAT14((byte)((ulong)lVar40 >> 0x20) |
                                             (byte)(uVar34 >> 0x20) | (byte)(uVar33 >> 0x20),
                                             CONCAT13((byte)((ulong)lVar40 >> 0x18) |
                                                      (byte)(uVar34 >> 0x18) |
                                                      (byte)(uVar33 >> 0x18),
                                                      CONCAT12((byte)((ulong)lVar40 >> 0x10) |
                                                               (byte)(uVar34 >> 0x10) |
                                                               (byte)(uVar33 >> 0x10),
                                                               CONCAT11((byte)((ulong)lVar40 >> 8) |
                                                                        (byte)(uVar34 >> 8) |
                                                                        (byte)(uVar33 >> 8),
                                                                        (byte)lVar40 |
                                                                        (byte)uVar34 | (byte)uVar33)
                                                              ))))));
    auVar54[8] = (byte)lVar59 | (byte)uVar26 & 0x11 | (byte)lVar48 & 0x22;
    auVar54[9] = (byte)((ulong)lVar59 >> 8) |
                 (byte)((ulong)uVar26 >> 8) & 0x11 | (byte)((ulong)lVar48 >> 8) & 0x22;
    auVar54[10] = (byte)((ulong)lVar59 >> 0x10) |
                  (byte)((ulong)uVar26 >> 0x10) & 0x11 | (byte)((ulong)lVar48 >> 0x10) & 0x22;
    auVar54[0xb] = (byte)((ulong)lVar59 >> 0x18) |
                   (byte)((ulong)uVar26 >> 0x18) & 0x11 | (byte)((ulong)lVar48 >> 0x18) & 0x22;
    auVar54[0xc] = (byte)((ulong)lVar59 >> 0x20) |
                   (byte)((ulong)uVar26 >> 0x20) & 0x11 | (byte)((ulong)lVar48 >> 0x20) & 0x22;
    auVar54[0xd] = (byte)((ulong)lVar59 >> 0x28) |
                   (byte)((ulong)uVar26 >> 0x28) & 0x11 | (byte)((ulong)lVar48 >> 0x28) & 0x22;
    auVar54[0xe] = (byte)((ulong)lVar59 >> 0x30) |
                   (byte)((ulong)uVar26 >> 0x30) & 0x11 | (byte)((ulong)lVar48 >> 0x30) & 0x22;
    auVar54[0xf] = (byte)((ulong)lVar59 >> 0x38) |
                   (byte)((ulong)uVar26 >> 0x38) & 0x11 | (byte)((ulong)lVar48 >> 0x38) & 0x22;
    uVar34 = auVar54._0_8_ >> 4;
    uVar33 = auVar54._8_8_ >> 4;
    bVar3 = (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[0];
    bVar4 = (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[1];
    bVar5 = (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[8];
    bVar6 = (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[9];
    lVar40 = auVar54._0_8_ << 0xc;
    lVar48 = auVar54._8_8_ << 0xc;
    bVar7 = (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[1];
    bVar8 = (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[9];
    bVar44 = (byte)(uVar34 >> 0x10) & (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[2] |
             (byte)((ulong)lVar40 >> 0x10) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[2];
    bVar45 = (byte)(uVar34 >> 0x18) & (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[3] |
             (byte)((ulong)lVar40 >> 0x18) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[3];
    bVar49 = (byte)((auVar54._9_7_ >> 4) >> 8) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[10] |
             (byte)((ulong)lVar48 >> 0x10) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[10];
    bVar50 = (byte)((auVar54._10_6_ >> 4) >> 8) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[0xb] |
             (byte)((ulong)lVar48 >> 0x18) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[0xb];
    bVar9 = (*pauVar32)[4];
    bVar10 = (*pauVar32)[5];
    bVar11 = (*pauVar32)[6];
    bVar12 = (*pauVar32)[7];
    bVar13 = (*pauVar32)[0xc];
    bVar14 = (*pauVar32)[0xd];
    bVar15 = (*pauVar32)[0xe];
    bVar16 = (*pauVar32)[0xf];
    auVar43 = *unaff_x24;
    bVar53 = auVar43[0];
    bVar55 = auVar43[1];
    bVar56 = auVar43[2];
    bVar57 = auVar43[3];
    bVar65 = (*pauVar32)[0] ^ *unaff_x25 & (byte)unaff_d8 | auVar43[4];
    bVar66 = (*pauVar32)[1] | auVar43[5];
    bVar58 = auVar43[8];
    bVar60 = auVar43[9];
    bVar61 = auVar43[10];
    bVar62 = auVar43[0xb];
    bVar67 = (*pauVar32)[8] ^ *unaff_x25 >> 4 | auVar43[0xc];
    bVar68 = (*pauVar32)[9] | auVar43[0xd];
    bVar46 = ((*pauVar32)[2] | auVar43[6]) ^
             ((byte)(uVar34 >> 0x20) & (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[4]
             | (byte)((ulong)lVar40 >> 0x20) &
               (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[4]) ^ bVar65 ^ bVar44;
    bVar47 = ((*pauVar32)[3] | auVar43[7]) ^
             ((byte)(uVar34 >> 0x28) & (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[5]
             | (byte)((ulong)lVar40 >> 0x28) &
               (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[5]) ^ bVar66 ^ bVar45;
    bVar51 = ((*pauVar32)[10] | auVar43[0xe]) ^
             ((byte)((auVar54._11_5_ >> 4) >> 8) &
              (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[0xc] |
             (byte)((ulong)lVar48 >> 0x20) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[0xc]) ^ bVar67 ^ bVar49;
    bVar52 = ((*pauVar32)[0xb] | auVar43[0xf]) ^
             ((byte)((auVar54._12_4_ >> 4) >> 8) &
              (*(undefined1 (*) [16])((long)register0x00000008 + 0x30))[0xd] |
             (byte)((ulong)lVar48 >> 0x28) &
             (*(undefined1 (*) [16])((long)register0x00000008 + 0x20))[0xd]) ^ bVar68 ^ bVar50;
    (*unaff_x24)[8] = bVar58;
    (*unaff_x24)[9] = bVar60;
    (*unaff_x24)[10] = bVar61 ^ (byte)uVar33 & bVar5;
    (*unaff_x24)[0xb] = bVar62 ^ ((byte)(uVar33 >> 8) & bVar6 | (byte)((ulong)lVar48 >> 8) & bVar8);
    (*unaff_x24)[0xc] = bVar67 ^ bVar49;
    (*unaff_x24)[0xd] = bVar68 ^ bVar50;
    (*unaff_x24)[0xe] = bVar51;
    (*unaff_x24)[0xf] = bVar52;
    (*unaff_x24)[0] = bVar53;
    (*unaff_x24)[1] = bVar55;
    (*unaff_x24)[2] = bVar56 ^ (byte)uVar34 & bVar3;
    (*unaff_x24)[3] = bVar57 ^ ((byte)(uVar34 >> 8) & bVar4 | (byte)((ulong)lVar40 >> 8) & bVar7);
    (*unaff_x24)[4] = bVar65 ^ bVar44;
    (*unaff_x24)[5] = bVar66 ^ bVar45;
    (*unaff_x24)[6] = bVar46;
    (*unaff_x24)[7] = bVar47;
    auVar43[0] = bVar46 ^ bVar9;
    auVar43[1] = bVar47 ^ bVar10;
    auVar43[2] = bVar11;
    auVar43[3] = bVar12;
    auVar43[4] = bVar53;
    auVar43[5] = bVar55;
    auVar43[6] = bVar56;
    auVar43[7] = bVar57;
    auVar43[8] = bVar51 ^ bVar13;
    auVar43[9] = bVar52 ^ bVar14;
    auVar43[10] = bVar15;
    auVar43[0xb] = bVar16;
    auVar43[0xc] = bVar58;
    auVar43[0xd] = bVar60;
    auVar43[0xe] = bVar61;
    auVar43[0xf] = bVar62;
    auVar54 = NEON_ushl(auVar43,*(undefined1 (*) [16])((long)register0x00000008 + 0x10),8);
    auVar63 = NEON_ushl(auVar43,*(undefined1 (*) [16])register0x00000008,8);
    (*pauVar32)[8] = auVar54[8] ^ auVar63[8] ^ auVar43[8];
    (*pauVar32)[9] = auVar54[9] ^ auVar63[9] ^ auVar43[9];
    (*pauVar32)[10] = auVar54[10] ^ auVar63[10] ^ bVar15;
    (*pauVar32)[0xb] = auVar54[0xb] ^ auVar63[0xb] ^ bVar16;
    (*pauVar32)[0xc] = auVar54[0xc] ^ auVar63[0xc] ^ bVar58;
    (*pauVar32)[0xd] = auVar54[0xd] ^ auVar63[0xd] ^ bVar60;
    (*pauVar32)[0xe] = auVar54[0xe] ^ auVar63[0xe] ^ auVar43[8] ^ bVar61;
    (*pauVar32)[0xf] = auVar54[0xf] ^ auVar63[0xf] ^ auVar43[9] ^ bVar62;
    (*pauVar32)[0] = auVar54[0] ^ auVar63[0] ^ auVar43[0];
    (*pauVar32)[1] = auVar54[1] ^ auVar63[1] ^ auVar43[1];
    (*pauVar32)[2] = auVar54[2] ^ auVar63[2] ^ bVar11;
    (*pauVar32)[3] = auVar54[3] ^ auVar63[3] ^ bVar12;
    (*pauVar32)[4] = auVar54[4] ^ auVar63[4] ^ bVar53;
    (*pauVar32)[5] = auVar54[5] ^ auVar63[5] ^ bVar55;
    (*pauVar32)[6] = auVar54[6] ^ auVar63[6] ^ auVar43[0] ^ bVar56;
    (*pauVar32)[7] = auVar54[7] ^ auVar63[7] ^ auVar43[1] ^ bVar57;
    uVar26 = *(undefined8 *)*unaff_x24;
    unaff_x19[-1] = *(undefined8 *)(*unaff_x24 + 8);
    unaff_x19[-2] = uVar26;
    auVar43 = *pauVar32;
    unaff_x19[1] = auVar43._8_8_;
    *unaff_x19 = auVar43._0_8_;
    uVar34 = *(ulong *)*pauVar32;
    uVar33 = *(ulong *)(*pauVar32 + 8);
    uVar35 = uVar34 >> 1 & 0x5555555555555555;
    uVar36 = uVar34 ^ uVar35 << 1;
    uVar37 = uVar33 >> 1 & 0x5555555555555555;
    uVar38 = uVar33 ^ uVar37 << 1;
    uVar39 = uVar36 >> 2 & 0x3333333333333333;
    uVar34 = uVar34 >> 3 & 0x1111111111111111;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x40) = uVar36 ^ uVar39 << 2;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x40) + 8) = uVar35 ^ uVar34 << 2;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x50) = uVar39;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x50) + 8) = uVar34;
    uVar34 = uVar38 >> 2 & 0x3333333333333333;
    uVar33 = uVar33 >> 3 & 0x1111111111111111;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x60) = uVar38 ^ uVar34 << 2;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x60) + 8) = uVar37 ^ uVar33 << 2;
    *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x70) = uVar34;
    *(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x70) + 8) = uVar33;
    func_0x00301ca0((undefined1 (*) [16])((long)register0x00000008 + 0x40));
    uVar34 = *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x40) & 0x1111111111111111
             | (*(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x40) + 8) &
               0x1111111111111111) << 1 |
             ((*(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x50) + 8) &
              0x1111111111111111) << 1 |
             *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x50) & 0x1111111111111111)
             << 2;
    in_x9 = *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x60) & 0x1111111111111111 |
            (*(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x60) + 8) &
            0x1111111111111111) << 1 |
            ((*(ulong *)(*(undefined1 (*) [16])((long)register0x00000008 + 0x70) + 8) &
             0x1111111111111111) << 1 |
            *(ulong *)*(undefined1 (*) [16])((long)register0x00000008 + 0x70) & 0x1111111111111111)
            << 2;
    in_x10 = (ulong)unaff_x25[1];
    in_x12 = *(ulong *)(*unaff_x24 + 8);
    in_x14 = *(ulong *)(*pauVar32 + 8);
    param_1 = (uVar34 >> 0x24 & 0xf000 | uVar34 >> 0x34) ^
              in_x10 & 0xf ^ (*(ulong *)*unaff_x24 >> 0x20 | *(ulong *)*pauVar32 << 0x20);
    param_1 = param_1 << 0x10 ^ param_1 << 0x20 ^ param_1 << 0x30 ^ param_1;
    in_x11 = param_1 >> 0x30 ^ *(ulong *)*pauVar32 >> 0x20;
    in_x13 = (ulong)(uint)((int)in_x11 << 0x10);
    unaff_x21 = unaff_x24;
    unaff_x24 = pauVar32;
  }
code_r0x002973a0:
  do {
    uVar26 = 0;
    puVar25 = puVar24;
    param_4 = puVar30;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
      return 0;
    }
    while( true ) {
      auVar69 = ___stack_chk_fail(uVar26);
      uVar29 = auVar69._8_4_;
      puVar27 = auVar69._0_8_;
      if (((uVar29 != 0x80) && (uVar29 != 0x100)) && (uVar29 != 0xc0)) {
        return 0xfffffffe;
      }
      if ((uRam0000000000a334f8 >> 2 & 1) != 0) {
        *(undefined1 **)(puVar25 + -0x10) = unaff_x29;
        *(undefined8 *)(puVar25 + -8) = 0x297400;
        lVar40 = func_0x003784e0();
        if (lVar40 == 0) {
          puVar31 = param_4 + -0x1e;
          puVar30 = puVar31 + extraout_x12 * 2;
          uVar17 = *(undefined4 *)((long)param_4 + -0xec);
          uVar18 = *(undefined4 *)(param_4 + -0x1d);
          uVar19 = *(undefined4 *)((long)param_4 + -0xe4);
          uVar20 = *(undefined4 *)puVar30;
          uVar21 = *(undefined4 *)((long)puVar30 + 4);
          uVar22 = *(undefined4 *)(puVar30 + 1);
          uVar23 = *(undefined4 *)((long)puVar30 + 0xc);
          *(undefined4 *)puVar30 = *(undefined4 *)puVar31;
          *(undefined4 *)((long)puVar30 + 4) = uVar17;
          *(undefined4 *)(puVar30 + 1) = uVar18;
          *(undefined4 *)((long)puVar30 + 0xc) = uVar19;
          *(undefined4 *)puVar31 = uVar20;
          *(undefined4 *)((long)param_4 + -0xec) = uVar21;
          *(undefined4 *)(param_4 + -0x1d) = uVar22;
          *(undefined4 *)((long)param_4 + -0xe4) = uVar23;
          pauVar32 = (undefined1 (*) [16])(param_4 + -0x1c);
          pauVar41 = (undefined1 (*) [16])(puVar30 + -2);
          do {
            pauVar28 = pauVar41;
            auVar43 = NEON_aesimc(*pauVar32,*pauVar32);
            auVar54 = NEON_aesimc(*pauVar28,*pauVar28);
            *(int *)*pauVar28 = auVar43._0_4_;
            *(int *)((long)*pauVar28 + 4) = auVar43._4_4_;
            *(int *)((long)*pauVar28 + 8) = auVar43._8_4_;
            *(int *)((long)*pauVar28 + 0xc) = auVar43._12_4_;
            pauVar41 = pauVar28 + -1;
            *(int *)*pauVar32 = auVar54._0_4_;
            *(int *)((long)*pauVar32 + 4) = auVar54._4_4_;
            *(int *)((long)*pauVar32 + 8) = auVar54._8_4_;
            *(int *)((long)*pauVar32 + 0xc) = auVar54._12_4_;
            pauVar32 = pauVar32 + 1;
          } while (pauVar32 < pauVar41);
          auVar43 = NEON_aesimc(*pauVar32,*pauVar32);
          *(int *)*pauVar41 = auVar43._0_4_;
          *(int *)((long)pauVar28[-1] + 4) = auVar43._4_4_;
          *(int *)((long)pauVar28[-1] + 8) = auVar43._8_4_;
          *(int *)((long)pauVar28[-1] + 0xc) = auVar43._12_4_;
          lVar40 = 0;
        }
        return lVar40;
      }
      if ((uRam0000000000a334f8 & 1) != 0) {
        *(undefined1 **)(puVar25 + -0x10) = unaff_x29;
        *(undefined8 *)(puVar25 + -8) = 0x297400;
        *(undefined8 *)(puVar25 + -0x20) = unaff_d8;
        *(undefined8 *)(puVar25 + -0x18) = unaff_d9;
        iVar2 = (uVar29 >> 5) + 5;
        *(int *)(param_4 + 0x1e) = iVar2;
        lVar40 = func_0x0038a370(uVar29 >> 1 & 0x20 ^ 0x20,puVar27,uVar29,
                                 (long)param_4 + (ulong)(uint)(iVar2 * 0x10) + 0x10,1);
        return lVar40;
      }
      register0x00000008 = (BADSPACEBASE *)(puVar25 + -0x120);
      puVar24 = puVar25 + -0x120;
      *(undefined8 *)(puVar25 + -0x70) = unaff_d9;
      *(undefined8 *)(puVar25 + -0x68) = unaff_d8;
      *(long **)(puVar25 + -0x60) = unaff_x28;
      *(long **)(puVar25 + -0x58) = unaff_x27;
      *(undefined8 **)(puVar25 + -0x50) = unaff_x26;
      *(byte **)(puVar25 + -0x48) = unaff_x25;
      *(undefined1 (**) [16])(puVar25 + -0x40) = pauVar41;
      *(undefined **)(puVar25 + -0x38) = unaff_x23;
      *(undefined1 **)(puVar25 + -0x30) = unaff_x22;
      *(undefined1 (**) [16])(puVar25 + -0x28) = unaff_x24;
      *(long *)(puVar25 + -0x20) = unaff_x20;
      *(undefined8 **)(puVar25 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar25 + -0x10) = unaff_x29;
      *(undefined8 *)(puVar25 + -8) = 0x297400;
      unaff_x29 = puVar25 + -0x10;
      *(undefined8 *)(puVar25 + -0x80) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
      unaff_x19 = param_4;
      if (uVar29 == 0x100) break;
      if (uVar29 == 0xc0) {
        unaff_x20 = 0;
        *(undefined4 *)(param_4 + 0x1e) = 0xc;
        uVar34 = *puVar27;
        *(ulong *)(puVar25 + -0x88) = puVar27[1];
        *(ulong *)(puVar25 + -0x90) = uVar34;
        uVar34 = *(ulong *)(puVar25 + -0x90);
        uVar33 = *(ulong *)(puVar25 + -0x88);
        uVar35 = (uVar34 ^ uVar34 >> 4) & 0xf000f000f000f0;
        uVar34 = uVar34 ^ uVar35 << 4;
        uVar35 = uVar34 ^ uVar35;
        uVar34 = (uVar34 ^ uVar35 >> 8) & 0xff000000ff00;
        uVar35 = uVar35 ^ uVar34 << 8;
        uVar34 = uVar35 ^ uVar34;
        uVar35 = (ulong)((uint)(uVar34 >> 0x10) ^ (uint)uVar35) & 0xffff0000;
        uVar36 = (uVar33 ^ uVar33 >> 4) & 0xf000f000f000f0;
        uVar33 = uVar33 ^ uVar36 << 4;
        uVar36 = uVar33 ^ uVar36;
        uVar33 = (uVar33 ^ uVar36 >> 8) & 0xff000000ff00;
        uVar36 = uVar36 ^ uVar33 << 8;
        uVar33 = uVar36 ^ uVar33;
        uVar36 = (ulong)((uint)(uVar33 >> 0x10) ^ (uint)uVar36) & 0xffff0000;
        *(ulong *)(puVar25 + -0x90) =
             uVar35 ^ uVar34 & 0xffffffff | (ulong)((uint)uVar36 ^ (uint)uVar33) << 0x20;
        *(ulong *)(puVar25 + -0x88) =
             uVar33 & 0xffffffff00000000 ^ uVar36 << 0x10 | (uVar34 ^ uVar35 << 0x10) >> 0x20;
        uVar26 = *(undefined8 *)(puVar25 + -0x90);
        unaff_x19 = param_4 + 4;
        param_4[1] = *(undefined8 *)(puVar25 + -0x88);
        *param_4 = uVar26;
        uVar34 = puVar27[2];
        uVar33 = (uVar34 ^ uVar34 >> 4) & 0xf000f000f000f0;
        uVar34 = uVar34 ^ uVar33 << 4;
        uVar33 = uVar34 ^ uVar33;
        uVar34 = (uVar34 ^ uVar33 >> 8) & 0xff000000ff00;
        uVar33 = uVar33 ^ uVar34 << 8;
        uVar34 = uVar33 ^ uVar34;
        uVar33 = (ulong)((uint)(uVar34 >> 0x10) ^ (uint)uVar33) & 0xffff0000;
        *(ulong *)(puVar25 + -0xa0) = uVar33 ^ uVar34 & 0xffffffff;
        *(ulong *)(puVar25 + -0x98) = (uVar34 ^ uVar33 << 0x10) >> 0x20;
        unaff_x24 = (undefined1 (*) [16])(puVar25 + -0xa0);
        pauVar32 = (undefined1 (*) [16])(puVar25 + -0x90);
        unaff_x22 = puVar25 + -0xe0;
        unaff_x23 = &UNK_00831e38;
        *(undefined8 *)(puVar25 + -0xf8) = 0xf0000000;
        *(undefined8 *)(puVar25 + -0x100) = 0xf0000000;
        *(undefined8 *)(puVar25 + -0xe8) = 0xfff0000;
        *(undefined8 *)(puVar25 + -0xf0) = 0xfff0000;
        unaff_d8 = 0xf0000000f;
        *(undefined8 *)(puVar25 + -0x108) = _UNK_0082f958;
        *(undefined8 *)(puVar25 + -0x110) = _UNK_0082f950;
        *(undefined8 *)(puVar25 + -0x118) = _UNK_0082f968;
        *(undefined8 *)(puVar25 + -0x120) = _UNK_0082f960;
        goto LAB_002970cc;
      }
      if (uVar29 == 0x80) goto code_r0x00296ae4;
      uVar26 = 1;
      plVar1 = (long *)(puVar25 + -0x80);
      puVar25 = puVar25 + -0x120;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *plVar1) {
        return 1;
      }
    }
    unaff_x20 = 0;
    *(undefined4 *)(param_4 + 0x1e) = 0xe;
    uVar34 = *puVar27;
    uVar33 = puVar27[1];
    uVar35 = (uVar34 ^ uVar34 >> 4) & 0xf000f000f000f0;
    uVar34 = uVar34 ^ uVar35 << 4;
    uVar35 = uVar34 ^ uVar35;
    uVar34 = (uVar34 ^ uVar35 >> 8) & 0xff000000ff00;
    uVar35 = uVar35 ^ uVar34 << 8;
    uVar34 = uVar35 ^ uVar34;
    uVar35 = (ulong)((uint)(uVar34 >> 0x10) ^ (uint)uVar35) & 0xffff0000;
    uVar36 = (uVar33 ^ uVar33 >> 4) & 0xf000f000f000f0;
    uVar33 = uVar33 ^ uVar36 << 4;
    uVar36 = uVar33 ^ uVar36;
    uVar33 = (uVar33 ^ uVar36 >> 8) & 0xff000000ff00;
    uVar36 = uVar36 ^ uVar33 << 8;
    uVar33 = uVar36 ^ uVar33;
    uVar36 = (ulong)((uint)(uVar33 >> 0x10) ^ (uint)uVar36) & 0xffff0000;
    unaff_x24 = (undefined1 (*) [16])
                (uVar35 ^ uVar34 & 0xffffffff | (ulong)((uint)uVar36 ^ (uint)uVar33) << 0x20);
    unaff_x22 = (undefined1 *)
                (uVar33 & 0xffffffff00000000 ^ uVar36 << 0x10 | (uVar34 ^ uVar35 << 0x10) >> 0x20);
    *param_4 = unaff_x24;
    param_4[1] = unaff_x22;
    uVar34 = puVar27[2];
    uVar33 = puVar27[3];
    uVar35 = (uVar34 ^ uVar34 >> 4) & 0xf000f000f000f0;
    uVar34 = uVar34 ^ uVar35 << 4;
    uVar35 = uVar34 ^ uVar35;
    uVar34 = (uVar34 ^ uVar35 >> 8) & 0xff000000ff00;
    uVar35 = uVar35 ^ uVar34 << 8;
    uVar34 = uVar35 ^ uVar34;
    uVar35 = (ulong)((uint)(uVar34 >> 0x10) ^ (uint)uVar35) & 0xffff0000;
    uVar36 = (uVar33 ^ uVar33 >> 4) & 0xf000f000f000f0;
    uVar33 = uVar33 ^ uVar36 << 4;
    uVar36 = uVar33 ^ uVar36;
    uVar33 = (uVar33 ^ uVar36 >> 8) & 0xff000000ff00;
    uVar36 = uVar36 ^ uVar33 << 8;
    uVar33 = uVar36 ^ uVar33;
    uVar36 = (ulong)((uint)(uVar33 >> 0x10) ^ (uint)uVar36) & 0xffff0000;
    unaff_x23 = (undefined *)
                (uVar35 ^ uVar34 & 0xffffffff | (ulong)((uint)uVar36 ^ (uint)uVar33) << 0x20);
    pauVar41 = (undefined1 (*) [16])
               (uVar33 & 0xffffffff00000000 ^ uVar36 << 0x10 | (uVar34 ^ uVar35 << 0x10) >> 0x20);
    param_4[2] = unaff_x23;
    param_4[3] = pauVar41;
    unaff_x26 = (undefined8 *)0x2222000000000000;
    unaff_x27 = (long *)0x1111000000000000;
    puVar30 = param_4;
    pbVar42 = &UNK_00831e38;
    while( true ) {
      uVar34 = (ulong)unaff_x23 >> 1 & 0x5555555555555555;
      uVar33 = (ulong)unaff_x23 ^ uVar34 << 1;
      uVar35 = (ulong)pauVar41 >> 1 & 0x5555555555555555;
      uVar36 = (ulong)pauVar41 ^ uVar35 << 1;
      uVar37 = uVar33 >> 2 & 0x3333333333333333;
      uVar38 = (ulong)unaff_x23 >> 3 & 0x1111111111111111;
      *(ulong *)(puVar25 + -0xe0) = uVar33 ^ uVar37 << 2;
      *(ulong *)(puVar25 + -0xd8) = uVar34 ^ uVar38 << 2;
      *(ulong *)(puVar25 + -0xd0) = uVar37;
      *(ulong *)(puVar25 + -200) = uVar38;
      uVar34 = uVar36 >> 2 & 0x3333333333333333;
      uVar33 = (ulong)pauVar41 >> 3 & 0x1111111111111111;
      *(ulong *)(puVar25 + -0xc0) = uVar36 ^ uVar34 << 2;
      *(ulong *)(puVar25 + -0xb8) = uVar35 ^ uVar33 << 2;
      *(ulong *)(puVar25 + -0xb0) = uVar34;
      *(ulong *)(puVar25 + -0xa8) = uVar33;
      func_0x00301ca0(puVar25 + -0xe0);
      uVar34 = *(ulong *)(puVar25 + -0xe0) & 0x1111111111111111 |
               (*(ulong *)(puVar25 + -0xd8) & 0x1111111111111111) << 1 |
               ((*(ulong *)(puVar25 + -200) & 0x1111111111111111) << 1 |
               *(ulong *)(puVar25 + -0xd0) & 0x1111111111111111) << 2;
      unaff_x25 = pbVar42 + 1;
      uVar33 = *(ulong *)(puVar25 + -0xc0) & 0x1111111111111111 |
               (*(ulong *)(puVar25 + -0xb8) & 0x1111111111111111) << 1 |
               ((*(ulong *)(puVar25 + -0xa8) & 0x1111111111111111) << 1 |
               *(ulong *)(puVar25 + -0xb0) & 0x1111111111111111) << 2;
      uVar34 = (uVar34 >> 0x24 & 0xf000 | uVar34 >> 0x34) ^ (ulong)unaff_x24 ^ (ulong)*pbVar42 & 0xf
      ;
      unaff_x24 = (undefined1 (*) [16])(uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34);
      uVar34 = (ulong)unaff_x22 ^ (ulong)(*pbVar42 >> 4) ^
               (uVar33 >> 0x24 & 0xf000 | uVar33 >> 0x34);
      unaff_x22 = (undefined1 *)(uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34);
      unaff_x28 = (long *)((long)param_4 + unaff_x20);
      unaff_x28[4] = (long)unaff_x24;
      unaff_x28[5] = (long)unaff_x22;
      if (unaff_x20 == 0xc0) break;
      uVar34 = (ulong)unaff_x24 >> 1 & 0x5555555555555555;
      uVar33 = (ulong)unaff_x24 ^ uVar34 << 1;
      uVar35 = (ulong)unaff_x22 >> 1 & 0x5555555555555555;
      uVar36 = (ulong)unaff_x22 ^ uVar35 << 1;
      uVar37 = uVar33 >> 2 & 0x3333333333333333;
      uVar38 = (ulong)unaff_x24 >> 3 & 0x1111111111111111;
      *(ulong *)(puVar25 + -0xe0) = uVar33 ^ uVar37 << 2;
      *(ulong *)(puVar25 + -0xd8) = uVar34 ^ uVar38 << 2;
      *(ulong *)(puVar25 + -0xd0) = uVar37;
      *(ulong *)(puVar25 + -200) = uVar38;
      uVar34 = uVar36 >> 2 & 0x3333333333333333;
      uVar33 = (ulong)unaff_x22 >> 3 & 0x1111111111111111;
      *(ulong *)(puVar25 + -0xc0) = uVar36 ^ uVar34 << 2;
      *(ulong *)(puVar25 + -0xb8) = uVar35 ^ uVar33 << 2;
      *(ulong *)(puVar25 + -0xb0) = uVar34;
      *(ulong *)(puVar25 + -0xa8) = uVar33;
      func_0x00301ca0(puVar25 + -0xe0);
      uVar34 = (ulong)unaff_x23 ^
               (*(ulong *)(puVar25 + -0xe0) & 0x1111000000000000 |
                (*(ulong *)(puVar25 + -0xd8) & 0x1111000000000000) << 1 |
               ((*(ulong *)(puVar25 + -200) & 0x1111000000000000) << 1 |
               *(ulong *)(puVar25 + -0xd0) & 0x1111000000000000) << 2) >> 0x30;
      unaff_x23 = (undefined *)(uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34);
      uVar34 = (ulong)pauVar41 ^
               (*(ulong *)(puVar25 + -0xc0) & 0x1111000000000000 |
                (*(ulong *)(puVar25 + -0xb8) & 0x1111000000000000) << 1 |
               ((*(ulong *)(puVar25 + -0xa8) & 0x1111000000000000) << 1 |
               *(ulong *)(puVar25 + -0xb0) & 0x1111000000000000) << 2) >> 0x30;
      pauVar41 = (undefined1 (*) [16])(uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34);
      unaff_x28[6] = (long)unaff_x23;
      unaff_x28[7] = (long)pauVar41;
      unaff_x20 = unaff_x20 + 0x20;
      pbVar42 = unaff_x25;
    }
  } while( true );
code_r0x00296ae4:
  lVar40 = 0;
  *(undefined4 *)(param_4 + 0x1e) = 10;
  uVar34 = *puVar27;
  uVar33 = puVar27[1];
  uVar35 = (uVar34 ^ uVar34 >> 4) & 0xf000f000f000f0;
  uVar34 = uVar34 ^ uVar35 << 4;
  uVar35 = uVar34 ^ uVar35;
  uVar34 = (uVar34 ^ uVar35 >> 8) & 0xff000000ff00;
  uVar35 = uVar35 ^ uVar34 << 8;
  uVar34 = uVar35 ^ uVar34;
  uVar35 = (ulong)((uint)(uVar34 >> 0x10) ^ (uint)uVar35) & 0xffff0000;
  uVar36 = (uVar33 ^ uVar33 >> 4) & 0xf000f000f000f0;
  uVar33 = uVar33 ^ uVar36 << 4;
  uVar36 = uVar33 ^ uVar36;
  uVar33 = (uVar33 ^ uVar36 >> 8) & 0xff000000ff00;
  uVar36 = uVar36 ^ uVar33 << 8;
  uVar33 = uVar36 ^ uVar33;
  uVar36 = (ulong)((uint)(uVar33 >> 0x10) ^ (uint)uVar36) & 0xffff0000;
  unaff_x24 = (undefined1 (*) [16])
              (uVar35 ^ uVar34 & 0xffffffff | (ulong)((uint)uVar36 ^ (uint)uVar33) << 0x20);
  unaff_x22 = (undefined1 *)
              (uVar33 & 0xffffffff00000000 ^ uVar36 << 0x10 | (uVar34 ^ uVar35 << 0x10) >> 0x20);
  unaff_x19 = param_4 + 3;
  *param_4 = unaff_x24;
  param_4[1] = unaff_x22;
  unaff_x23 = &UNK_00831e38;
  do {
    uVar34 = (ulong)unaff_x24 >> 1 & 0x5555555555555555;
    uVar33 = (ulong)unaff_x24 ^ uVar34 << 1;
    uVar35 = (ulong)unaff_x22 >> 1 & 0x5555555555555555;
    uVar36 = (ulong)unaff_x22 ^ uVar35 << 1;
    uVar37 = uVar33 >> 2 & 0x3333333333333333;
    uVar38 = (ulong)unaff_x24 >> 3 & 0x1111111111111111;
    *(ulong *)(puVar25 + -0xe0) = uVar33 ^ uVar37 << 2;
    *(ulong *)(puVar25 + -0xd8) = uVar34 ^ uVar38 << 2;
    *(ulong *)(puVar25 + -0xd0) = uVar37;
    *(ulong *)(puVar25 + -200) = uVar38;
    uVar34 = uVar36 >> 2 & 0x3333333333333333;
    uVar33 = (ulong)unaff_x22 >> 3 & 0x1111111111111111;
    *(ulong *)(puVar25 + -0xc0) = uVar36 ^ uVar34 << 2;
    *(ulong *)(puVar25 + -0xb8) = uVar35 ^ uVar33 << 2;
    *(ulong *)(puVar25 + -0xb0) = uVar34;
    *(ulong *)(puVar25 + -0xa8) = uVar33;
    func_0x00301ca0(puVar25 + -0xe0);
    uVar34 = *(ulong *)(puVar25 + -0xe0) & 0x1111111111111111 |
             (*(ulong *)(puVar25 + -0xd8) & 0x1111111111111111) << 1 |
             ((*(ulong *)(puVar25 + -200) & 0x1111111111111111) << 1 |
             *(ulong *)(puVar25 + -0xd0) & 0x1111111111111111) << 2;
    uVar33 = *(ulong *)(puVar25 + -0xc0) & 0x1111111111111111 |
             (*(ulong *)(puVar25 + -0xb8) & 0x1111111111111111) << 1 |
             ((*(ulong *)(puVar25 + -0xa8) & 0x1111111111111111) << 1 |
             *(ulong *)(puVar25 + -0xb0) & 0x1111111111111111) << 2;
    uVar34 = (uVar34 >> 0x24 & 0xf000 | uVar34 >> 0x34) ^
             (ulong)(byte)(&UNK_00831e38)[lVar40] & 0xf ^ (ulong)unaff_x24;
    unaff_x24 = (undefined1 (*) [16])(uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34);
    uVar34 = (uVar33 >> 0x24 & 0xf000 | uVar33 >> 0x34) ^
             (ulong)((byte)(&UNK_00831e38)[lVar40] >> 4) ^ (ulong)unaff_x22;
    unaff_x22 = (undefined1 *)(uVar34 << 0x10 ^ uVar34 << 0x20 ^ uVar34 << 0x30 ^ uVar34);
    unaff_x19[-1] = unaff_x24;
    *unaff_x19 = unaff_x22;
    lVar40 = lVar40 + 1;
    unaff_x19 = unaff_x19 + 2;
  } while (lVar40 != 10);
  unaff_x20 = 10;
  puVar24 = puVar25 + -0x120;
  puVar30 = param_4;
  goto code_r0x002973a0;
}

