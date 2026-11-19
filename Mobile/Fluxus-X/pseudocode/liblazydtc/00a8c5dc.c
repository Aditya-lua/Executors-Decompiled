/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8c5dc
 */

undefined8 ossl_aria_set_encrypt_key(byte *param_1,int param_2,uint *param_3)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  uint uVar32;
  uint uVar33;
  uint uVar34;
  uint uVar35;
  uint uVar36;
  uint uVar37;
  uint uVar38;
  undefined8 uVar39;
  uint uVar40;
  uint uVar41;
  uint uVar42;
  uint uVar43;
  
  iVar5 = param_2 + 0x11f;
  if (-1 < param_2 + 0x100) {
    iVar5 = param_2 + 0x100;
  }
  uVar39 = 0xffffffff;
  if ((param_1 != (byte *)0x0) && (param_3 != (uint *)0x0)) {
    uVar38 = param_2 - 0x80;
    if ((uVar38 == 0) || ((param_2 == 0x100 || (param_2 == 0xc0)))) {
      param_3[0x44] = iVar5 >> 5;
      bVar24 = *param_1;
      bVar25 = param_1[4];
      bVar26 = param_1[8];
      bVar27 = param_1[0xc];
      uVar10 = param_2 - 0x41;
      if (-1 < (int)uVar38) {
        uVar10 = uVar38;
      }
      bVar28 = param_1[3];
      bVar29 = param_1[7];
      bVar30 = param_1[0xb];
      bVar31 = param_1[0xf];
      lVar1 = (long)((int)uVar10 >> 6) * 0x10;
      uVar38 = (uint)bVar25 << 0x18 | (uint)param_1[5] << 0x10;
      uVar2 = (uint)bVar26 << 0x18 | (uint)param_1[9] << 0x10;
      uVar3 = (uint)bVar24 << 0x18 | (uint)param_1[1] << 0x10;
      uVar4 = (uint)bVar27 << 0x18 | (uint)param_1[0xd] << 0x10;
      uVar32 = uVar38 | (uint)param_1[6] << 8 | (uint)bVar29;
      uVar33 = uVar2 | (uint)param_1[10] << 8 | (uint)bVar30;
      uVar34 = uVar4 | (uint)param_1[0xe] << 8 | (uint)bVar31;
      uVar35 = uVar3 | (uint)param_1[2] << 8 | (uint)bVar28;
      uVar6 = *(uint *)(&DAT_0076a4d4 + lVar1) ^ uVar32;
      uVar7 = *(uint *)(&DAT_0076a4d8 + lVar1) ^ uVar33;
      uVar8 = *(uint *)(&DAT_0076a4dc + lVar1) ^ uVar34;
      uVar9 = *(uint *)(&DAT_0076a4d0 + lVar1) ^ uVar35;
      uVar42 = *(uint *)(&DAT_007698d0 + (ulong)(uVar7 >> 0x10 & 0xff) * 4) ^
               *(uint *)(&DAT_007694d0 + (ulong)(uVar7 >> 0x18) * 4) ^
               *(uint *)(&DAT_00769cd0 + (ulong)(uVar7 >> 8 & 0xff) * 4) ^
               *(uint *)(&DAT_0076a0d0 + (ulong)(uVar7 & 0xff) * 4);
      uVar40 = *(uint *)(&DAT_007698d0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
               *(uint *)(&DAT_007694d0 + (ulong)(uVar8 >> 0x18) * 4) ^
               *(uint *)(&DAT_00769cd0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
               *(uint *)(&DAT_0076a0d0 + (ulong)(uVar8 & 0xff) * 4);
      uVar8 = *(uint *)(&DAT_007698d0 + (ulong)(uVar9 >> 0x10 & 0xff) * 4) ^
              *(uint *)(&DAT_007694d0 + (ulong)(uVar9 >> 0x18) * 4) ^
              *(uint *)(&DAT_00769cd0 + (ulong)(uVar9 >> 8 & 0xff) * 4) ^
              *(uint *)(&DAT_0076a0d0 + (ulong)(uVar9 & 0xff) * 4);
      uVar6 = *(uint *)(&DAT_007698d0 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
              *(uint *)(&DAT_007694d0 + (ulong)(uVar6 >> 0x18) * 4) ^
              *(uint *)(&DAT_00769cd0 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
              *(uint *)(&DAT_0076a0d0 + (ulong)(uVar6 & 0xff) * 4) ^ uVar42;
      uVar42 = uVar40 ^ uVar42;
      uVar7 = uVar6 ^ uVar8;
      uVar8 = uVar42 ^ uVar8;
      uVar40 = uVar40 ^ uVar6;
      uVar42 = uVar42 ^ uVar7;
      uVar9 = uVar42 >> 0x10 | uVar42 << 0x10;
      uVar6 = (uVar40 & 0xff00ff00) >> 8 | (uVar40 & 0xff00ff) << 8;
      uVar36 = uVar6 >> 0x10 | uVar6 << 0x10;
      uVar6 = ((uVar8 & 0xff00ff) << 8 | uVar8 >> 8 & 0xff00ff) ^ uVar9;
      uVar9 = uVar9 ^ uVar36;
      uVar8 = uVar6 ^ uVar7;
      uVar40 = 0;
      uVar42 = 0;
      uVar41 = 0;
      uVar43 = 0;
      if (0x80 < param_2) {
        uVar40 = (*(uint *)(param_1 + 0x10) & 0xff00ff00) >> 8 |
                 (*(uint *)(param_1 + 0x10) & 0xff00ff) << 8;
        uVar40 = uVar40 >> 0x10 | uVar40 << 0x10;
        uVar42 = (*(uint *)(param_1 + 0x14) & 0xff00ff00) >> 8 |
                 (*(uint *)(param_1 + 0x14) & 0xff00ff) << 8;
        uVar42 = uVar42 >> 0x10 | uVar42 << 0x10;
        if (param_2 < 0xc1) {
          uVar41 = 0;
          uVar43 = 0;
        }
        else {
          uVar41 = (*(uint *)(param_1 + 0x18) & 0xff00ff00) >> 8 |
                   (*(uint *)(param_1 + 0x18) & 0xff00ff) << 8;
          uVar41 = uVar41 >> 0x10 | uVar41 << 0x10;
          uVar43 = (*(uint *)(param_1 + 0x1c) & 0xff00ff00) >> 8 |
                   (*(uint *)(param_1 + 0x1c) & 0xff00ff) << 8;
          uVar43 = uVar43 >> 0x10 | uVar43 << 0x10;
        }
      }
      lVar1 = ((long)((ulong)uVar10 << 0x20) >> 0x26) * 0x10;
      uVar40 = uVar40 ^ uVar8;
      uVar42 = uVar9 ^ uVar7 ^ uVar42;
      uVar41 = uVar8 ^ uVar9 ^ uVar41;
      uVar43 = uVar6 ^ uVar36 ^ uVar43;
      uVar10 = *(uint *)(&DAT_0076a4e0 + lVar1);
      uVar6 = *(uint *)(&DAT_0076a4e4 + lVar1);
      uVar7 = *(uint *)(&DAT_0076a4e8 + lVar1);
      uVar8 = *(uint *)(&DAT_0076a4ec + lVar1);
      param_3[1] = uVar32 ^ uVar40 << 0xd ^ uVar42 >> 0x13;
      param_3[2] = uVar33 ^ uVar42 << 0xd ^ uVar41 >> 0x13;
      param_3[3] = uVar34 ^ uVar41 << 0xd ^ uVar43 >> 0x13;
      param_3[0x10] = uVar35 ^ uVar40 >> 0x1f ^ uVar43 << 1;
      *param_3 = uVar35 ^ uVar40 >> 0x13 ^ uVar43 << 0xd;
      param_3[0x11] = uVar32 ^ uVar40 << 1 ^ uVar42 >> 0x1f;
      param_3[0x12] = uVar33 ^ uVar42 << 1 ^ uVar41 >> 0x1f;
      param_3[0x20] = uVar35 ^ uVar42 << 0x1d ^ uVar41 >> 3;
      param_3[0x21] = uVar32 ^ uVar41 << 0x1d ^ uVar43 >> 3;
      param_3[0x22] = uVar33 ^ uVar40 >> 3 ^ uVar43 << 0x1d;
      param_3[0x23] = uVar34 ^ uVar40 << 0x1d ^ uVar42 >> 3;
      uVar10 = uVar10 ^ uVar40;
      uVar6 = uVar6 ^ uVar42;
      param_3[0x13] = uVar34 ^ uVar41 << 1 ^ uVar43 >> 0x1f;
      param_3[0x30] = uVar35 ^ uVar40 << 0x1f ^ uVar42 >> 1;
      param_3[0x31] = uVar32 ^ uVar42 << 0x1f ^ uVar41 >> 1;
      uVar7 = uVar7 ^ uVar41;
      uVar8 = uVar8 ^ uVar43;
      uVar36 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar7 >> 0x10 & 0xff) * 4) ^
               *(uint *)(&DAT_00769cd0 + (ulong)(uVar7 >> 0x18) * 4) ^
               *(uint *)(&DAT_007694d0 + (ulong)(uVar7 >> 8 & 0xff) * 4) ^
               *(uint *)(&DAT_007698d0 + (ulong)(uVar7 & 0xff) * 4);
      uVar8 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
              *(uint *)(&DAT_00769cd0 + (ulong)(uVar8 >> 0x18) * 4) ^
              *(uint *)(&DAT_007694d0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
              *(uint *)(&DAT_007698d0 + (ulong)(uVar8 & 0xff) * 4);
      uVar7 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
              *(uint *)(&DAT_00769cd0 + (ulong)(uVar10 >> 0x18) * 4) ^
              *(uint *)(&DAT_007694d0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
              *(uint *)(&DAT_007698d0 + (ulong)(uVar10 & 0xff) * 4);
      uVar10 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
               *(uint *)(&DAT_00769cd0 + (ulong)(uVar6 >> 0x18) * 4) ^
               *(uint *)(&DAT_007694d0 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
               *(uint *)(&DAT_007698d0 + (ulong)(uVar6 & 0xff) * 4) ^ uVar36;
      uVar36 = uVar8 ^ uVar36;
      uVar6 = uVar10 ^ uVar7;
      uVar7 = uVar36 ^ uVar7;
      uVar8 = uVar8 ^ uVar10;
      uVar36 = uVar36 ^ uVar6;
      uVar10 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
      uVar37 = uVar6 >> 0x10 | uVar6 << 0x10;
      uVar10 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ uVar36;
      uVar11 = *(uint *)(&DAT_0076a4f0 + lVar1);
      uVar9 = (uVar8 & 0xff00ff) << 8 | uVar8 >> 8 & 0xff00ff;
      uVar6 = uVar10 ^ uVar37;
      uVar36 = uVar9 ^ uVar36;
      uVar7 = uVar6 ^ uVar35;
      uVar12 = *(uint *)(&DAT_0076a4f8 + lVar1);
      uVar13 = *(uint *)(&DAT_0076a4fc + lVar1);
      uVar8 = uVar37 ^ uVar32 ^ uVar36;
      uVar9 = uVar10 ^ uVar34 ^ uVar9;
      uVar36 = uVar6 ^ uVar33 ^ uVar36;
      uVar10 = uVar8 ^ *(uint *)(&DAT_0076a4f4 + lVar1);
      param_3[4] = uVar40 ^ uVar7 >> 0x13 ^ uVar9 << 0xd;
      uVar11 = uVar7 ^ uVar11;
      param_3[5] = uVar42 ^ uVar7 << 0xd ^ uVar8 >> 0x13;
      uVar13 = uVar9 ^ uVar13;
      uVar12 = uVar36 ^ uVar12;
      param_3[0x14] = uVar40 ^ uVar7 >> 0x1f ^ uVar9 << 1;
      param_3[0x15] = uVar42 ^ uVar7 << 1 ^ uVar8 >> 0x1f;
      param_3[0x26] = uVar41 ^ uVar7 >> 3 ^ uVar9 << 0x1d;
      uVar14 = *(uint *)(&DAT_007694d0 + (ulong)(uVar11 >> 0x18) * 4);
      uVar15 = *(uint *)(&DAT_007694d0 + (ulong)(uVar10 >> 0x18) * 4);
      param_3[0x27] = uVar43 ^ uVar7 << 0x1d ^ uVar8 >> 3;
      uVar16 = *(uint *)(&DAT_007694d0 + (ulong)(uVar13 >> 0x18) * 4);
      uVar17 = *(uint *)(&DAT_007694d0 + (ulong)(uVar12 >> 0x18) * 4);
      uVar18 = *(uint *)(&DAT_007698d0 + (ulong)(uVar11 >> 0x10 & 0xff) * 4);
      uVar19 = *(uint *)(&DAT_007698d0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4);
      uVar20 = *(uint *)(&DAT_007698d0 + (ulong)(uVar13 >> 0x10 & 0xff) * 4);
      uVar21 = *(uint *)(&DAT_007698d0 + (ulong)(uVar12 >> 0x10 & 0xff) * 4);
      uVar37 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar11 & 0xff) * 4);
      uVar22 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar10 & 0xff) * 4);
      uVar6 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar13 & 0xff) * 4);
      uVar23 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar12 & 0xff) * 4);
      uVar11 = *(uint *)(&DAT_00769cd0 + (ulong)(uVar11 >> 8 & 0xff) * 4);
      uVar10 = *(uint *)(&DAT_00769cd0 + (ulong)(uVar10 >> 8 & 0xff) * 4);
      uVar13 = *(uint *)(&DAT_00769cd0 + (ulong)(uVar13 >> 8 & 0xff) * 4);
      uVar12 = *(uint *)(&DAT_00769cd0 + (ulong)(uVar12 >> 8 & 0xff) * 4);
      param_3[6] = uVar41 ^ uVar36 >> 0x13 ^ uVar8 << 0xd;
      param_3[7] = uVar43 ^ uVar9 >> 0x13 ^ uVar36 << 0xd;
      param_3[0x16] = uVar41 ^ uVar36 >> 0x1f ^ uVar8 << 1;
      param_3[0x17] = uVar43 ^ uVar9 >> 0x1f ^ uVar36 << 1;
      param_3[0x24] = uVar40 ^ uVar36 >> 3 ^ uVar8 << 0x1d;
      param_3[0x25] = uVar42 ^ uVar9 >> 3 ^ uVar36 << 0x1d;
      uVar37 = uVar18 ^ uVar14 ^ uVar11 ^ uVar37;
      uVar6 = uVar20 ^ uVar16 ^ uVar13 ^ uVar6;
      uVar23 = uVar21 ^ uVar17 ^ uVar12 ^ uVar23;
      uVar10 = uVar19 ^ uVar15 ^ uVar10 ^ uVar22 ^ uVar23;
      uVar23 = uVar6 ^ uVar23;
      uVar6 = uVar6 ^ uVar10;
      uVar10 = uVar10 ^ uVar37;
      uVar37 = uVar23 ^ uVar37;
      uVar23 = uVar23 ^ uVar10;
      uVar6 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
      uVar12 = uVar6 >> 0x10 | uVar6 << 0x10;
      uVar6 = uVar23 >> 0x10 | uVar23 << 0x10;
      uVar11 = ((uVar37 & 0xff00ff) << 8 | uVar37 >> 8 & 0xff00ff) ^ uVar6;
      uVar6 = uVar6 ^ uVar12;
      uVar13 = uVar11 ^ uVar10;
      uVar10 = uVar10 ^ uVar42 ^ uVar6;
      uVar11 = uVar12 ^ uVar43 ^ uVar11;
      uVar6 = uVar6 ^ uVar41 ^ uVar13;
      uVar13 = uVar13 ^ uVar40;
      param_3[0xf] = (uint)(CONCAT44(uVar33,uVar4) >> 0x13) ^ uVar11;
      param_3[10] = uVar36 ^ uVar10 << 0xd ^ uVar6 >> 0x13;
      uVar39 = 0;
      param_3[0x1a] = uVar36 ^ uVar10 << 1 ^ uVar6 >> 0x1f;
      param_3[0x1c] = ((uint)(bVar24 >> 7) | uVar34 << 1) ^ uVar13;
      param_3[0x1d] = ((uint)(bVar25 >> 7) | uVar35 << 1) ^ uVar10;
      param_3[0xb] = uVar9 ^ uVar11 >> 0x13 ^ uVar6 << 0xd;
      param_3[0xc] = (uint)(CONCAT44(uVar34,uVar3) >> 0x13) ^ uVar13;
      param_3[0xd] = (uint)(CONCAT44(uVar35,uVar38) >> 0x13) ^ uVar10;
      param_3[0xe] = (uint)(CONCAT44(uVar32,uVar2) >> 0x13) ^ uVar6;
      param_3[0x1b] = uVar9 ^ uVar11 >> 0x1f ^ uVar6 << 1;
      param_3[0x1e] = ((uint)(bVar26 >> 7) | uVar32 << 1) ^ uVar6;
      param_3[0x1f] = ((uint)(bVar27 >> 7) | uVar33 << 1) ^ uVar11;
      param_3[0x28] = uVar7 ^ uVar10 << 0x1d ^ uVar6 >> 3;
      param_3[0x29] = uVar8 ^ uVar11 >> 3 ^ uVar6 << 0x1d;
      param_3[0x2c] = (uint)(CONCAT14(bVar29,uVar33) >> 3) ^ uVar13;
      param_3[0x2d] = (uint)(CONCAT14(bVar30,uVar34) >> 3) ^ uVar10;
      param_3[0x2e] = (uint)(CONCAT14(bVar31,uVar35) >> 3) ^ uVar6;
      param_3[0x2f] = (uint)(CONCAT14(bVar28,uVar32) >> 3) ^ uVar11;
      param_3[8] = uVar7 ^ uVar13 >> 0x13 ^ uVar11 << 0xd;
      param_3[9] = uVar8 ^ uVar10 >> 0x13 ^ uVar13 << 0xd;
      param_3[0x18] = uVar7 ^ uVar13 >> 0x1f ^ uVar11 << 1;
      param_3[0x19] = uVar8 ^ uVar10 >> 0x1f ^ uVar13 << 1;
      param_3[0x2a] = uVar36 ^ uVar13 >> 3 ^ uVar11 << 0x1d;
      param_3[0x2b] = uVar9 ^ uVar10 >> 3 ^ uVar13 << 0x1d;
      param_3[0x32] = uVar33 ^ uVar41 << 0x1f ^ uVar43 >> 1;
      param_3[0x33] = uVar34 ^ uVar40 >> 1 ^ uVar43 << 0x1f;
      if (0x80 < param_2) {
        param_3[0x34] = uVar40 ^ uVar7 << 0x1f ^ uVar8 >> 1;
        param_3[0x35] = uVar42 ^ uVar36 >> 1 ^ uVar8 << 0x1f;
        uVar39 = 0;
        param_3[0x36] = uVar41 ^ uVar9 >> 1 ^ uVar36 << 0x1f;
        param_3[0x37] = uVar43 ^ uVar7 >> 1 ^ uVar9 << 0x1f;
        param_3[0x38] = uVar7 ^ uVar10 >> 1 ^ uVar13 << 0x1f;
        param_3[0x39] = uVar8 ^ uVar10 << 0x1f ^ uVar6 >> 1;
        param_3[0x3a] = uVar36 ^ uVar11 >> 1 ^ uVar6 << 0x1f;
        param_3[0x3b] = uVar9 ^ uVar13 >> 1 ^ uVar11 << 0x1f;
        if (0xc0 < param_2) {
          uVar39 = 0;
          param_3[0x3c] = (uint)(CONCAT14(bVar28,uVar32) >> 1) ^ uVar13;
          param_3[0x3d] = (uint)(CONCAT14(bVar29,uVar33) >> 1) ^ uVar10;
          param_3[0x3e] = (uint)(CONCAT14(bVar30,uVar34) >> 1) ^ uVar6;
          param_3[0x3f] = (uint)(CONCAT14(bVar31,uVar35) >> 1) ^ uVar11;
          param_3[0x40] = uVar35 ^ uVar40 << 0x13 ^ uVar42 >> 0xd;
          param_3[0x41] = uVar32 ^ uVar42 << 0x13 ^ uVar41 >> 0xd;
          param_3[0x42] = uVar33 ^ uVar41 << 0x13 ^ uVar43 >> 0xd;
          param_3[0x43] = uVar34 ^ uVar40 >> 0xd ^ uVar43 << 0x13;
        }
      }
    }
    else {
      uVar39 = 0xfffffffe;
    }
  }
  return uVar39;
}

