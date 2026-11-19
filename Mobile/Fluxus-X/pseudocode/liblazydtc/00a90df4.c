/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a90df4
 */

void CAST_set_key(CAST_KEY *key,int len,uchar *data)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  byte bVar12;
  uint uVar13;
  ulong uVar14;
  long lVar15;
  uint uVar16;
  uint uVar17;
  int iVar18;
  uint uVar19;
  ulong uVar20;
  ulong uVar21;
  byte *pbVar22;
  uint *puVar23;
  uint uVar24;
  uint uVar25;
  uint uVar26;
  ulong uVar27;
  uint uVar28;
  uint uVar29;
  ulong uVar30;
  uint uVar31;
  ulong uVar32;
  uint uVar33;
  uint uVar34;
  long lVar35;
  long lVar36;
  long lVar37;
  uint local_134;
  ulong local_130;
  uint local_120 [32];
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 local_80;
  ulong uStack_78;
  undefined8 local_70;
  undefined8 local_68;
  
  iVar18 = len;
  if (0xf < len) {
    iVar18 = 0x10;
  }
  uStack_78 = 0;
  local_80 = 0;
  local_68 = 0;
  local_70 = 0;
  uStack_98 = 0;
  local_a0 = 0;
  local_88 = 0;
  local_90 = 0;
  if (len < 1) {
    local_130 = 0;
    local_80._4_4_ = 0;
    uStack_78._0_4_ = 0;
    uVar14 = 0;
    local_68._0_4_ = 0;
    local_70._0_4_ = 0;
    uVar20 = 0;
    local_68._4_4_ = 0;
    uVar16 = 0;
    local_70._4_4_ = 0;
    uVar19 = 0;
    uVar26 = 0;
    uVar28 = 0;
    uVar17 = 0;
    local_88._4_4_ = 0;
    uVar25 = 0;
    uVar31 = 0;
    uVar29 = 0;
    uStack_98._4_4_ = 0;
    uVar24 = 0;
    uVar34 = 0;
    uVar33 = 0;
    goto LAB_00a90f44;
  }
  uVar20 = (ulong)iVar18;
  uVar14 = uVar20;
  if ((long)uVar20 < 2) {
    uVar14 = 1;
  }
  uVar21 = 0;
  if (uVar14 < 2) {
LAB_00a90e80:
    do {
      local_120[uVar21 + 0x20] = (uint)data[uVar21];
      uVar21 = uVar21 + 1;
    } while ((long)uVar21 < (long)uVar20);
  }
  else {
    uVar21 = uVar14 & 0x7ffffffffffffffe;
    puVar23 = (uint *)((ulong)&local_a0 | 4);
    pbVar22 = data + 1;
    uVar27 = uVar21;
    do {
      bVar12 = *pbVar22;
      uVar27 = uVar27 - 2;
      puVar23[-1] = (uint)pbVar22[-1];
      *puVar23 = (uint)bVar12;
      puVar23 = puVar23 + 2;
      pbVar22 = pbVar22 + 2;
    } while (uVar27 != 0);
    if (uVar14 != uVar21) goto LAB_00a90e80;
  }
  uVar14 = local_80 & 0xffffffff;
  local_130 = uStack_78 >> 0x20;
  uVar20 = (ulong)local_70._4_4_;
  uVar33 = (int)local_a0 << 0x18;
  uVar34 = local_a0._4_4_ << 0x10;
  uVar24 = (int)uStack_98 << 8;
  uVar29 = (int)local_90 << 0x18;
  uVar31 = local_90._4_4_ << 0x10;
  uVar25 = (int)local_88 << 8;
  uVar17 = (int)local_80 << 0x18;
  uVar28 = local_80._4_4_ << 0x10;
  uVar26 = (uint)uStack_78 << 8;
  uVar19 = (uint)local_70 << 0x18;
  local_70._4_4_ = local_70._4_4_ << 0x10;
  uVar16 = (uint)local_68 << 8;
LAB_00a90f44:
  local_134 = uVar31 | uVar29 | uVar25 | local_88._4_4_;
  uVar31 = (&CAST_S_table5)[local_68._4_4_];
  uVar29 = (&CAST_S_table6)[uVar14];
  uVar33 = uVar34 | uVar33 | uVar24 | uStack_98._4_4_;
  uVar34 = uVar28 | uVar17 | uVar26 | (uint)local_130;
  local_68._4_4_ = local_70._4_4_ | uVar19 | uVar16 | local_68._4_4_;
  key->short_key = (uint)(iVar18 < 0xb);
  lVar36 = 0;
  do {
    uVar29 = *(uint *)(CAST_S_table4 + uVar20 * 4) ^ uVar33 ^ uVar31 ^
             (&CAST_S_table6)[(uint)local_70] ^ *(uint *)(CAST_S_table7 + (ulong)(uint)local_68 * 4)
             ^ uVar29;
    uVar14 = (ulong)(uVar29 >> 8 & 0xff);
    lVar35 = (ulong)(uVar29 >> 0x18) * 4;
    uVar20 = (ulong)(uVar29 >> 0x10 & 0xff);
    lVar15 = uVar14 * 4;
    uVar21 = (ulong)(uVar29 & 0xff);
    uVar25 = (&CAST_S_table6)[uVar20];
    uVar17 = *(uint *)(CAST_S_table7 + lVar15);
    uVar33 = *(uint *)(CAST_S_table4 + lVar35) ^ uVar34 ^ (&CAST_S_table5)[uVar14] ^ uVar25 ^
             *(uint *)(CAST_S_table7 + uVar21 * 4) ^
             *(uint *)(CAST_S_table7 + (ulong)(uint)uStack_78 * 4);
    uVar14 = (ulong)(uVar33 >> 8 & 0xff);
    uVar32 = (ulong)(uVar33 >> 0x10 & 0xff);
    uVar27 = (ulong)(uVar33 & 0xff);
    uVar28 = (&CAST_S_table5)[uVar14];
    uVar26 = (&CAST_S_table6)[uVar32];
    uVar19 = *(uint *)(CAST_S_table7 + (ulong)(uVar33 >> 0x18) * 4);
    uVar34 = uVar26 ^ uVar28 ^ local_68._4_4_ ^ *(uint *)(CAST_S_table4 + uVar27 * 4) ^ uVar19 ^
             *(uint *)(CAST_S_table4 + (ulong)local_80._4_4_ * 4);
    uVar16 = *(uint *)(CAST_S_table7 + lVar35);
    uVar13 = uVar34 >> 0x10 & 0xff;
    uVar2 = *(uint *)(CAST_S_table4 + (ulong)(uVar34 >> 8 & 0xff) * 4);
    lVar37 = (ulong)(uVar34 >> 0x18) * 4;
    uVar3 = (&CAST_S_table5)[uVar34 & 0xff];
    uVar24 = *(uint *)(CAST_S_table7 + uVar14 * 4) ^ uVar34 ^ *(uint *)(CAST_S_table4 + uVar32 * 4)
             ^ (&CAST_S_table5)[uVar27] ^ (&CAST_S_table6)[uVar33 >> 0x18] ^
             (&CAST_S_table6)[uVar29 >> 0x18];
    uVar32 = (ulong)(uVar24 >> 0x10 & 0xff);
    lVar35 = (ulong)(uVar24 & 0xff) * 4;
    uVar4 = (&CAST_S_table6)[uVar21];
    uVar5 = (&CAST_S_table6)[uVar13];
    uVar6 = *(uint *)(CAST_S_table4 + (ulong)(uVar24 >> 0x18) * 4);
    uVar7 = (&CAST_S_table6)[uVar32];
    uVar31 = *(uint *)(CAST_S_table7 + lVar35);
    uVar8 = *(uint *)(CAST_S_table4 + lVar35);
    uVar9 = (&CAST_S_table6)[uVar24 & 0xff];
    uVar10 = (&CAST_S_table5)[uVar24 >> 8 & 0xff];
    uVar34 = uVar2 ^ local_134 ^ (&CAST_S_table5)[uVar13] ^ (&CAST_S_table6)[uVar34 & 0xff] ^
             *(uint *)(CAST_S_table7 + lVar37) ^ (&CAST_S_table5)[local_130];
    local_120[lVar36] =
         *(uint *)(CAST_S_table4 + lVar37) ^ (&CAST_S_table5)[uVar13] ^ (&CAST_S_table6)[uVar27] ^
         *(uint *)(CAST_S_table7 + uVar14 * 4) ^ *(uint *)(CAST_S_table4 + lVar15);
    local_120[lVar36 + 1] = uVar26 ^ uVar28 ^ uVar19 ^ uVar2 ^ uVar3;
    lVar15 = (ulong)(uVar34 >> 0x18) * 4;
    uVar28 = *(uint *)(CAST_S_table4 + (ulong)(uVar34 >> 8 & 0xff) * 4);
    uVar26 = (&CAST_S_table5)[uVar34 & 0xff];
    uVar19 = *(uint *)(CAST_S_table4 + uVar32 * 4);
    uVar2 = (&CAST_S_table5)[uVar24 >> 0x18];
    uVar31 = uVar17 ^ uVar29 ^ uVar6 ^ uVar10 ^ uVar7 ^ uVar31;
    uVar3 = *(uint *)(CAST_S_table7 + lVar15);
    lVar35 = (ulong)(uVar31 & 0xff) * 4;
    uVar14 = (ulong)(uVar31 >> 0x10 & 0xff);
    uVar6 = *(uint *)(CAST_S_table4 + lVar35);
    uVar7 = (&CAST_S_table5)[uVar31 >> 8 & 0xff];
    uVar13 = (&CAST_S_table6)[uVar14];
    uVar11 = *(uint *)(CAST_S_table7 + (ulong)(uVar31 >> 0x18) * 4);
    uVar29 = *(uint *)(CAST_S_table4 + uVar20 * 4);
    local_120[lVar36 + 2] =
         (&CAST_S_table5)[uVar34 >> 0x10 & 0xff] ^ *(uint *)(CAST_S_table4 + lVar15) ^ uVar4 ^
         uVar17 ^ uVar5;
    local_120[lVar36 + 3] = uVar28 ^ uVar25 ^ uVar26 ^ uVar16 ^ uVar3;
    uVar26 = *(uint *)(CAST_S_table4 + uVar14 * 4);
    uVar16 = (&CAST_S_table5)[uVar31 >> 0x18];
    uVar29 = uVar6 ^ uVar33 ^ uVar7 ^ uVar13 ^ uVar11 ^ uVar29;
    uVar3 = *(uint *)(CAST_S_table7 + lVar35);
    uVar20 = (ulong)(uVar29 & 0xff);
    uVar27 = (ulong)(uVar29 >> 8 & 0xff);
    uVar14 = (ulong)(uVar29 >> 0x10 & 0xff);
    lVar37 = uVar27 * 4;
    lVar15 = uVar14 * 4;
    uVar4 = *(uint *)(CAST_S_table7 + uVar20 * 4);
    uVar28 = (&CAST_S_table5)[uVar20];
    lVar35 = (ulong)(uVar29 >> 0x18) * 4;
    uVar25 = (&CAST_S_table6)[uVar29 >> 0x18];
    uVar5 = (&CAST_S_table6)[uVar27];
    uVar13 = *(uint *)(CAST_S_table4 + lVar35);
    uVar17 = *(uint *)(CAST_S_table4 + lVar15);
    uVar33 = *(uint *)(CAST_S_table4 + lVar37) ^ uVar34 ^ (&CAST_S_table5)[uVar14] ^
             (&CAST_S_table6)[uVar20] ^ *(uint *)(CAST_S_table7 + lVar35) ^ (&CAST_S_table5)[uVar21]
    ;
    local_120[lVar36 + 6] = uVar7 ^ uVar6 ^ uVar25 ^ *(uint *)(CAST_S_table7 + lVar15) ^ uVar9;
    local_120[lVar36 + 7] = uVar16 ^ uVar26 ^ uVar5 ^ uVar4 ^ uVar3;
    uVar14 = (ulong)(uVar33 >> 0x10 & 0xff);
    lVar15 = uVar14 * 4;
    uVar20 = (ulong)(uVar33 >> 8 & 0xff);
    uVar26 = (&CAST_S_table5)[uVar14];
    uVar16 = *(uint *)(CAST_S_table7 + (ulong)(uVar33 & 0xff) * 4);
    uVar3 = (&CAST_S_table6)[uVar20];
    uVar34 = *(uint *)(CAST_S_table7 + lVar37);
    uVar25 = *(uint *)(CAST_S_table4 + lVar15) ^ uVar24 ^ (&CAST_S_table5)[uVar33 & 0xff] ^
             (&CAST_S_table6)[uVar33 >> 0x18] ^ *(uint *)(CAST_S_table7 + uVar20 * 4) ^ uVar25;
    local_120[lVar36 + 4] =
         uVar8 ^ uVar10 ^ (&CAST_S_table6)[uVar33 >> 0x18] ^ *(uint *)(CAST_S_table7 + lVar15) ^
         uVar13;
    local_120[lVar36 + 5] = uVar2 ^ uVar19 ^ uVar3 ^ uVar16 ^ uVar26;
    uVar14 = (ulong)(uVar25 >> 0x18);
    uVar27 = (ulong)(uVar25 >> 8 & 0xff);
    uVar20 = (ulong)(uVar25 >> 0x10 & 0xff);
    lVar15 = (ulong)(uVar25 & 0xff) * 4;
    uVar24 = (&CAST_S_table5)[uVar27];
    uVar26 = *(uint *)(CAST_S_table4 + lVar15);
    uVar19 = *(uint *)(CAST_S_table4 + uVar20 * 4);
    uVar16 = (&CAST_S_table5)[uVar14];
    uVar34 = *(uint *)(CAST_S_table4 + uVar14 * 4) ^ uVar29 ^ uVar24 ^ (&CAST_S_table6)[uVar20] ^
             *(uint *)(CAST_S_table7 + lVar15) ^ uVar34;
    uVar20 = (ulong)(uVar34 >> 8 & 0xff);
    uVar21 = (ulong)(uVar34 >> 0x10 & 0xff);
    uVar32 = (ulong)(uVar34 >> 0x18);
    uVar29 = *(uint *)(CAST_S_table4 + uVar21 * 4);
    uVar2 = *(uint *)(CAST_S_table7 + uVar20 * 4);
    uVar3 = (&CAST_S_table5)[uVar32];
    uVar17 = (&CAST_S_table5)[uVar20] ^ *(uint *)(CAST_S_table4 + (ulong)(uVar34 & 0xff) * 4) ^
             uVar33 ^ (&CAST_S_table6)[uVar21] ^ *(uint *)(CAST_S_table7 + uVar32 * 4) ^ uVar17;
    uVar21 = (ulong)(uVar17 >> 8 & 0xff);
    uVar30 = (ulong)(uVar17 >> 0x10 & 0xff);
    lVar15 = uVar30 * 4;
    local_134 = *(uint *)(CAST_S_table7 + uVar27 * 4);
    uVar4 = (&CAST_S_table6)[uVar21];
    uVar33 = uVar2 ^ uVar29 ^ uVar17 ^ (&CAST_S_table5)[uVar34 & 0xff] ^ (&CAST_S_table6)[uVar32] ^
             (&CAST_S_table6)[uVar14];
    uVar14 = (ulong)(uVar33 >> 8 & 0xff);
    lVar35 = (ulong)(uVar33 >> 0x18) * 4;
    uVar5 = *(uint *)(CAST_S_table7 + (ulong)(uVar17 & 0xff) * 4);
    uVar6 = *(uint *)(CAST_S_table4 + lVar35);
    uVar7 = *(uint *)(CAST_S_table4 + lVar15);
    uVar8 = (&CAST_S_table6)[uVar33 >> 0x10 & 0xff];
    uVar9 = (&CAST_S_table5)[uVar14];
    lVar37 = (ulong)(uVar33 & 0xff) * 4;
    uVar10 = *(uint *)(CAST_S_table7 + lVar37);
    uVar28 = *(uint *)(CAST_S_table4 + uVar21 * 4) ^ uVar31 ^ (&CAST_S_table5)[uVar30] ^
             (&CAST_S_table6)[uVar17 & 0xff] ^
             *(uint *)(CAST_S_table7 + (ulong)(uVar17 >> 0x18) * 4) ^ uVar28;
    local_120[lVar36 + 10] =
         (&CAST_S_table5)[uVar20] ^ *(uint *)(CAST_S_table4 + (ulong)(uVar34 & 0xff) * 4) ^
         (&CAST_S_table6)[uVar17 >> 0x18] ^ *(uint *)(CAST_S_table7 + lVar15) ^
         (&CAST_S_table6)[uVar27];
    local_120[lVar36 + 0xb] = uVar2 ^ uVar29 ^ uVar3 ^ uVar4 ^ uVar5;
    uVar29 = (&CAST_S_table6)[uVar28 >> 8 & 0xff];
    uVar31 = *(uint *)(CAST_S_table7 + (ulong)(uVar28 & 0xff) * 4);
    local_134 = uVar6 ^ uVar25 ^ uVar9 ^ uVar8 ^ uVar10 ^ local_134;
    uVar17 = (&CAST_S_table5)[uVar28 >> 0x18];
    uVar21 = (ulong)(local_134 & 0xff);
    uVar27 = (ulong)(local_134 >> 8 & 0xff);
    uVar2 = (&CAST_S_table6)[local_134 >> 0x10 & 0xff];
    uVar3 = *(uint *)(CAST_S_table7 + (ulong)(local_134 >> 0x18) * 4);
    local_120[lVar36 + 8] =
         uVar26 ^ uVar24 ^ (&CAST_S_table6)[uVar28 >> 0x18] ^
         *(uint *)(CAST_S_table7 + (ulong)(uVar28 >> 0x10 & 0xff) * 4) ^ uVar7;
    local_120[lVar36 + 9] = uVar16 ^ uVar19 ^ uVar29 ^ uVar31 ^ uVar17;
    uVar34 = uVar3 ^ uVar2 ^ uVar34 ^ uVar19 ^ *(uint *)(CAST_S_table4 + uVar21 * 4) ^
             (&CAST_S_table5)[uVar27];
    uStack_78._0_4_ = uVar34 >> 8 & 0xff;
    uVar24 = *(uint *)(CAST_S_table4 + (ulong)(uint)uStack_78 * 4);
    local_130 = (ulong)(uVar34 & 0xff);
    local_80._4_4_ = uVar34 >> 0x10 & 0xff;
    uVar29 = (&CAST_S_table5)[local_130];
    lVar15 = (ulong)(uVar34 >> 0x18) * 4;
    uVar31 = (&CAST_S_table5)[uVar21];
    local_68._4_4_ =
         uVar24 ^ uVar28 ^ (&CAST_S_table5)[local_80._4_4_] ^ (&CAST_S_table6)[local_130] ^
         *(uint *)(CAST_S_table7 + lVar15) ^ (&CAST_S_table5)[uVar25 & 0xff];
    uVar20 = (ulong)(local_68._4_4_ >> 0x10 & 0xff);
    local_70._0_4_ = local_68._4_4_ >> 0x18;
    local_120[lVar36 + 0xc] =
         *(uint *)(CAST_S_table4 + lVar15) ^ (&CAST_S_table5)[local_80._4_4_] ^
         (&CAST_S_table6)[uVar21] ^ *(uint *)(CAST_S_table7 + uVar27 * 4) ^
         *(uint *)(CAST_S_table4 + lVar37);
    local_120[lVar36 + 0xd] = uVar3 ^ uVar2 ^ uVar24 ^ uVar29 ^ uVar31;
    local_68._0_4_ = local_68._4_4_ >> 8 & 0xff;
    uVar24 = *(uint *)(CAST_S_table4 + (ulong)(uint)local_68 * 4);
    uVar31 = (&CAST_S_table5)[local_68._4_4_ & 0xff];
    uVar25 = *(uint *)(CAST_S_table7 + lVar35);
    uVar29 = (&CAST_S_table6)[uVar34 >> 0x18];
    uVar17 = *(uint *)(CAST_S_table7 + uVar20 * 4);
    local_120[lVar36 + 0xe] =
         (&CAST_S_table5)[uVar20] ^ *(uint *)(CAST_S_table4 + (ulong)(uint)local_70 * 4) ^
         (&CAST_S_table6)[uVar33 & 0xff] ^ *(uint *)(CAST_S_table7 + uVar14 * 4) ^ uVar29;
    local_120[lVar36 + 0xf] = uVar24 ^ uVar8 ^ uVar31 ^ uVar25 ^ uVar17;
    bVar1 = lVar36 == 0;
    lVar36 = 0x10;
  } while (bVar1);
  key->data[0] = local_120[0];
  key->data[1] = (uint)((char)local_120[0x10] + 0x10U & 0x1f);
  key->data[2] = local_120[1];
  key->data[3] = (uint)((char)local_120[0x11] + 0x10U & 0x1f);
  key->data[4] = local_120[2];
  key->data[5] = (uint)((char)local_120[0x12] + 0x10U & 0x1f);
  key->data[6] = local_120[3];
  key->data[7] = (uint)((char)local_120[0x13] + 0x10U & 0x1f);
  key->data[8] = local_120[4];
  key->data[9] = (uint)((char)local_120[0x14] + 0x10U & 0x1f);
  key->data[10] = local_120[5];
  key->data[0xb] = (uint)((char)local_120[0x15] + 0x10U & 0x1f);
  key->data[0xc] = local_120[6];
  key->data[0xd] = (uint)((char)local_120[0x16] + 0x10U & 0x1f);
  key->data[0xe] = local_120[7];
  key->data[0xf] = (uint)((char)local_120[0x17] + 0x10U & 0x1f);
  key->data[0x10] = local_120[8];
  key->data[0x11] = (uint)((char)local_120[0x18] + 0x10U & 0x1f);
  key->data[0x12] = local_120[9];
  key->data[0x13] = (uint)((char)local_120[0x19] + 0x10U & 0x1f);
  key->data[0x14] = local_120[10];
  key->data[0x15] = (uint)((char)local_120[0x1a] + 0x10U & 0x1f);
  key->data[0x16] = local_120[0xb];
  key->data[0x17] = (uint)((char)local_120[0x1b] + 0x10U & 0x1f);
  key->data[0x18] = local_120[0xc];
  key->data[0x19] = (uint)((char)local_120[0x1c] + 0x10U & 0x1f);
  key->data[0x1a] = local_120[0xd];
  key->data[0x1b] = (uint)((char)local_120[0x1d] + 0x10U & 0x1f);
  key->data[0x1c] = local_120[0xe];
  key->data[0x1d] = (uint)((char)local_120[0x1e] + 0x10U & 0x1f);
  key->data[0x1e] = local_120[0xf];
  key->data[0x1f] = (uint)((char)local_120[0x1f] + 0x10U & 0x1f);
  return;
}

