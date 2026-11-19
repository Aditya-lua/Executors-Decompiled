/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baca04
 */

undefined8 mbedtls_internal_sha256_process(long param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  uint *puVar14;
  int *piVar15;
  int local_160;
  int iStack_15c;
  uint local_158 [64];
  uint local_58;
  uint uStack_54;
  uint uStack_50;
  uint uStack_4c;
  uint local_48;
  uint uStack_44;
  uint uStack_40;
  uint uStack_3c;
  long local_38;
  
  lVar12 = tpidr_el0;
  uVar13 = 0;
  puVar14 = local_158 + 3;
  local_38 = *(long *)(lVar12 + 0x28);
  uStack_40 = (uint)*(undefined8 *)(param_1 + 0x60);
  uStack_3c = (uint)((ulong)*(undefined8 *)(param_1 + 0x60) >> 0x20);
  local_48 = (uint)*(undefined8 *)(param_1 + 0x58);
  uStack_44 = (uint)((ulong)*(undefined8 *)(param_1 + 0x58) >> 0x20);
  uStack_50 = (uint)*(undefined8 *)(param_1 + 0x50);
  uStack_4c = (uint)((ulong)*(undefined8 *)(param_1 + 0x50) >> 0x20);
  local_58 = (uint)*(undefined8 *)(param_1 + 0x48);
  uStack_54 = (uint)((ulong)*(undefined8 *)(param_1 + 0x48) >> 0x20);
  uVar9 = (*param_2 & 0xff00ff00) >> 8 | (*param_2 & 0xff00ff) << 8;
  local_158[0] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[1] & 0xff00ff00) >> 8 | (param_2[1] & 0xff00ff) << 8;
  local_158[1] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[2] & 0xff00ff00) >> 8 | (param_2[2] & 0xff00ff) << 8;
  local_158[2] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[3] & 0xff00ff00) >> 8 | (param_2[3] & 0xff00ff) << 8;
  local_158[3] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[4] & 0xff00ff00) >> 8 | (param_2[4] & 0xff00ff) << 8;
  local_158[4] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[5] & 0xff00ff00) >> 8 | (param_2[5] & 0xff00ff) << 8;
  local_158[5] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[6] & 0xff00ff00) >> 8 | (param_2[6] & 0xff00ff) << 8;
  local_158[6] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[7] & 0xff00ff00) >> 8 | (param_2[7] & 0xff00ff) << 8;
  local_158[7] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[8] & 0xff00ff00) >> 8 | (param_2[8] & 0xff00ff) << 8;
  local_158[8] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[9] & 0xff00ff00) >> 8 | (param_2[9] & 0xff00ff) << 8;
  local_158[9] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[10] & 0xff00ff00) >> 8 | (param_2[10] & 0xff00ff) << 8;
  local_158[10] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[0xb] & 0xff00ff00) >> 8 | (param_2[0xb] & 0xff00ff) << 8;
  local_158[0xb] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[0xc] & 0xff00ff00) >> 8 | (param_2[0xc] & 0xff00ff) << 8;
  local_158[0xc] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[0xd] & 0xff00ff00) >> 8 | (param_2[0xd] & 0xff00ff) << 8;
  local_158[0xd] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[0xf] & 0xff00ff00) >> 8 | (param_2[0xf] & 0xff00ff) << 8;
  local_158[0xf] = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (param_2[0xe] & 0xff00ff00) >> 8 | (param_2[0xe] & 0xff00ff) << 8;
  local_158[0xe] = uVar9 >> 0x10 | uVar9 << 0x10;
  piVar15 = &DAT_007884f0;
  do {
    iVar4 = piVar15[-4] + uStack_3c +
            ((local_48 >> 6 | local_48 << 0x1a) ^ (local_48 >> 0xb | local_48 << 0x15) ^
            (local_48 >> 0x19 | local_48 << 7)) + puVar14[-3] +
            ((uStack_44 ^ uStack_40) & local_48 ^ uStack_40);
    uStack_4c = uStack_4c + iVar4;
    uStack_3c = ((local_58 >> 2 | local_58 << 0x1e) ^ (local_58 >> 0xd | local_58 << 0x13) ^
                (local_58 >> 0x16 | local_58 << 10)) +
                (uStack_50 & (uStack_54 | local_58) | uStack_54 & local_58) + iVar4;
    iVar4 = (uStack_4c & (uStack_44 ^ local_48) ^ uStack_44) + uStack_40 + piVar15[-3] + puVar14[-2]
            + ((uStack_4c >> 6 | uStack_4c * 0x4000000) ^ (uStack_4c >> 0xb | uStack_4c * 0x200000)
              ^ (uStack_4c >> 0x19 | uStack_4c * 0x80));
    uStack_50 = iVar4 + uStack_50;
    uStack_40 = iVar4 + ((uStack_3c >> 2 | uStack_3c * 0x40000000) ^
                         (uStack_3c >> 0xd | uStack_3c * 0x80000) ^
                        (uStack_3c >> 0x16 | uStack_3c * 0x400)) +
                        ((uStack_3c | local_58) & uStack_54 | uStack_3c & local_58);
    iVar4 = piVar15[-2] + uStack_44 + puVar14[-1] + (uStack_50 & (uStack_4c ^ local_48) ^ local_48)
            + ((uStack_50 >> 6 | uStack_50 * 0x4000000) ^ (uStack_50 >> 0xb | uStack_50 * 0x200000)
              ^ (uStack_50 >> 0x19 | uStack_50 * 0x80));
    uStack_54 = iVar4 + uStack_54;
    uStack_44 = iVar4 + ((uStack_40 >> 2 | uStack_40 * 0x40000000) ^
                         (uStack_40 >> 0xd | uStack_40 * 0x80000) ^
                        (uStack_40 >> 0x16 | uStack_40 * 0x400)) +
                        ((uStack_40 | uStack_3c) & local_58 | uStack_40 & uStack_3c);
    iVar4 = piVar15[-1] + local_48 + *puVar14 + (uStack_54 & (uStack_50 ^ uStack_4c) ^ uStack_4c) +
            ((uStack_54 >> 6 | uStack_54 * 0x4000000) ^ (uStack_54 >> 0xb | uStack_54 * 0x200000) ^
            (uStack_54 >> 0x19 | uStack_54 * 0x80));
    local_58 = iVar4 + local_58;
    local_48 = iVar4 + ((uStack_44 >> 2 | uStack_44 * 0x40000000) ^
                        (uStack_44 >> 0xd | uStack_44 * 0x80000) ^
                       (uStack_44 >> 0x16 | uStack_44 * 0x400)) +
                       ((uStack_44 | uStack_40) & uStack_3c | uStack_44 & uStack_40);
    iVar4 = *piVar15 + uStack_4c + puVar14[1] + (local_58 & (uStack_54 ^ uStack_50) ^ uStack_50) +
            ((local_58 >> 6 | local_58 * 0x4000000) ^ (local_58 >> 0xb | local_58 * 0x200000) ^
            (local_58 >> 0x19 | local_58 * 0x80));
    uStack_3c = iVar4 + uStack_3c;
    uStack_4c = iVar4 + ((local_48 >> 2 | local_48 * 0x40000000) ^
                         (local_48 >> 0xd | local_48 * 0x80000) ^
                        (local_48 >> 0x16 | local_48 * 0x400)) +
                        ((local_48 | uStack_44) & uStack_40 | local_48 & uStack_44);
    uVar13 = uVar13 + 8;
    iVar4 = piVar15[1] + uStack_50 + puVar14[2] + (uStack_3c & (local_58 ^ uStack_54) ^ uStack_54) +
            ((uStack_3c >> 6 | uStack_3c * 0x4000000) ^ (uStack_3c >> 0xb | uStack_3c * 0x200000) ^
            (uStack_3c >> 0x19 | uStack_3c * 0x80));
    uStack_40 = iVar4 + uStack_40;
    uStack_50 = iVar4 + ((uStack_4c >> 2 | uStack_4c * 0x40000000) ^
                         (uStack_4c >> 0xd | uStack_4c * 0x80000) ^
                        (uStack_4c >> 0x16 | uStack_4c * 0x400)) +
                        ((uStack_4c | local_48) & uStack_44 | uStack_4c & local_48);
    iVar4 = piVar15[2] + uStack_54 + puVar14[3] + (uStack_40 & (uStack_3c ^ local_58) ^ local_58) +
            ((uStack_40 >> 6 | uStack_40 * 0x4000000) ^ (uStack_40 >> 0xb | uStack_40 * 0x200000) ^
            (uStack_40 >> 0x19 | uStack_40 * 0x80));
    uStack_44 = iVar4 + uStack_44;
    uStack_54 = iVar4 + ((uStack_50 >> 2 | uStack_50 * 0x40000000) ^
                         (uStack_50 >> 0xd | uStack_50 * 0x80000) ^
                        (uStack_50 >> 0x16 | uStack_50 * 0x400)) +
                        ((uStack_50 | uStack_4c) & local_48 | uStack_50 & uStack_4c);
    iVar4 = piVar15[3] + local_58 + puVar14[4] + (uStack_44 & (uStack_40 ^ uStack_3c) ^ uStack_3c) +
            ((uStack_44 >> 6 | uStack_44 * 0x4000000) ^ (uStack_44 >> 0xb | uStack_44 * 0x200000) ^
            (uStack_44 >> 0x19 | uStack_44 * 0x80));
    piVar15 = piVar15 + 8;
    local_48 = iVar4 + local_48;
    local_58 = iVar4 + ((uStack_54 >> 2 | uStack_54 * 0x40000000) ^
                        (uStack_54 >> 0xd | uStack_54 * 0x80000) ^
                       (uStack_54 >> 0x16 | uStack_54 * 0x400)) +
                       ((uStack_54 | uStack_50) & uStack_4c | uStack_54 & uStack_50);
    puVar14 = puVar14 + 8;
  } while (uVar13 < 0x10);
  piVar15 = &DAT_0078853c;
  puVar14 = local_158 + 0xb;
  uVar13 = 0x18;
  while( true ) {
    uVar10 = local_48 >> 6;
    uVar11 = local_48 << 0x1a;
    uVar8 = puVar14[3];
    uVar6 = puVar14[-10];
    uVar9 = local_48 >> 0xb;
    uVar2 = local_48 << 0x15;
    uVar1 = local_48 >> 0x19;
    uVar3 = local_48 << 7;
    uVar5 = (uStack_44 ^ uStack_40) & local_48 ^ uStack_40;
    iVar4 = piVar15[-7];
    iVar7 = piVar15[-6];
    uVar6 = puVar14[-0xb] + puVar14[-2] +
            ((uVar8 >> 0x13 | uVar8 << 0xd) ^ uVar8 >> 10 ^ (uVar8 >> 0x11 | uVar8 << 0xf)) +
            ((uVar6 >> 0x12 | uVar6 << 0xe) ^ uVar6 >> 3 ^ (uVar6 >> 7 | uVar6 << 0x19));
    puVar14[5] = uVar6;
    iVar4 = iVar4 + uStack_3c + ((uVar10 | uVar11) ^ (uVar9 | uVar2) ^ (uVar1 | uVar3)) + uVar5 +
            uVar6;
    uVar9 = uStack_4c + iVar4;
    uStack_3c = ((local_58 >> 2 | local_58 << 0x1e) ^ (local_58 >> 0xd | local_58 << 0x13) ^
                (local_58 >> 0x16 | local_58 << 10)) +
                (uStack_50 & (uStack_54 | local_58) | uStack_54 & local_58) + iVar4;
    uStack_4c = uVar9;
    uVar3 = puVar14[4];
    uVar1 = puVar14[-9];
    uVar2 = (local_48 ^ uStack_44) & uVar9 ^ uStack_44;
    uVar1 = puVar14[-10] + puVar14[-1] +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[6] = uVar1;
    iVar4 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
            (uVar9 >> 0x19 | uVar9 * 0x80)) + uStack_40 + iVar7 + uVar2 + uVar1;
    uVar9 = uStack_50 + iVar4;
    uStack_50 = uVar9;
    uStack_40 = ((uStack_3c >> 2 | uStack_3c << 0x1e) ^ (uStack_3c >> 0xd | uStack_3c << 0x13) ^
                (uStack_3c >> 0x16 | uStack_3c << 10)) +
                (uStack_54 & (local_58 | uStack_3c) | local_58 & uStack_3c) + iVar4;
    uVar1 = puVar14[-8];
    uVar3 = puVar14[5];
    iVar4 = piVar15[-5];
    iVar7 = piVar15[-4];
    uVar2 = (uStack_4c ^ local_48) & uVar9 ^ local_48;
    uVar1 = puVar14[-9] + *puVar14 +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[7] = uVar1;
    iVar4 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
            (uVar9 >> 0x19 | uVar9 * 0x80)) + uStack_44 + iVar4 + uVar2 + uVar1;
    uVar9 = uStack_54 + iVar4;
    uStack_44 = ((uStack_40 >> 2 | uStack_40 << 0x1e) ^ (uStack_40 >> 0xd | uStack_40 << 0x13) ^
                (uStack_40 >> 0x16 | uStack_40 << 10)) +
                (local_58 & (uStack_3c | uStack_40) | uStack_3c & uStack_40) + iVar4;
    uStack_54 = uVar9;
    uVar3 = puVar14[6];
    uVar1 = puVar14[-7];
    uVar2 = (uStack_50 ^ uStack_4c) & uVar9 ^ uStack_4c;
    uVar1 = puVar14[-8] + puVar14[1] +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[8] = uVar1;
    iVar4 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
            (uVar9 >> 0x19 | uVar9 * 0x80)) + local_48 + iVar7 + uVar2 + uVar1;
    uVar9 = local_58 + iVar4;
    local_58 = uVar9;
    local_48 = ((uStack_44 >> 2 | uStack_44 << 0x1e) ^ (uStack_44 >> 0xd | uStack_44 << 0x13) ^
               (uStack_44 >> 0x16 | uStack_44 << 10)) +
               (uStack_3c & (uStack_40 | uStack_44) | uStack_40 & uStack_44) + iVar4;
    uVar1 = puVar14[-6];
    uVar3 = puVar14[7];
    iVar4 = piVar15[-3];
    iVar7 = piVar15[-2];
    uVar2 = (uStack_54 ^ uStack_50) & uVar9 ^ uStack_50;
    uVar1 = puVar14[-7] + puVar14[2] +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[9] = uVar1;
    iVar4 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
            (uVar9 >> 0x19 | uVar9 * 0x80)) + uStack_4c + iVar4 + uVar2 + uVar1;
    uVar9 = uStack_3c + iVar4;
    uStack_4c = ((local_48 >> 2 | local_48 << 0x1e) ^ (local_48 >> 0xd | local_48 << 0x13) ^
                (local_48 >> 0x16 | local_48 << 10)) +
                (uStack_40 & (uStack_44 | local_48) | uStack_44 & local_48) + iVar4;
    uStack_3c = uVar9;
    uVar3 = puVar14[8];
    uVar1 = puVar14[-5];
    uVar2 = (local_58 ^ uStack_54) & uVar9 ^ uStack_54;
    uVar1 = puVar14[-6] + puVar14[3] +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[10] = uVar1;
    iVar4 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
            (uVar9 >> 0x19 | uVar9 * 0x80)) + uStack_50 + iVar7 + uVar2 + uVar1;
    uVar9 = uStack_40 + iVar4;
    uStack_50 = ((uStack_4c >> 2 | uStack_4c << 0x1e) ^ (uStack_4c >> 0xd | uStack_4c << 0x13) ^
                (uStack_4c >> 0x16 | uStack_4c << 10)) +
                (uStack_44 & (local_48 | uStack_4c) | local_48 & uStack_4c) + iVar4;
    uStack_40 = uVar9;
    uVar1 = puVar14[-4];
    uVar3 = puVar14[9];
    iVar4 = piVar15[-1];
    uVar2 = (uStack_3c ^ local_58) & uVar9 ^ local_58;
    uVar1 = puVar14[-5] + puVar14[4] +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[0xb] = uVar1;
    iVar4 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
            (uVar9 >> 0x19 | uVar9 * 0x80)) + uStack_54 + iVar4 + uVar2 + uVar1;
    uVar9 = uStack_44 + iVar4;
    uStack_54 = ((uStack_50 >> 2 | uStack_50 << 0x1e) ^ (uStack_50 >> 0xd | uStack_50 << 0x13) ^
                (uStack_50 >> 0x16 | uStack_50 << 10)) +
                (local_48 & (uStack_4c | uStack_50) | uStack_4c & uStack_50) + iVar4;
    uStack_44 = uVar9;
    uVar1 = puVar14[-3];
    uVar3 = puVar14[10];
    iVar4 = *piVar15;
    uVar2 = (uStack_40 ^ uStack_3c) & uVar9 ^ uStack_3c;
    uVar1 = puVar14[-4] + puVar14[5] +
            ((uVar3 >> 0x13 | uVar3 << 0xd) ^ uVar3 >> 10 ^ (uVar3 >> 0x11 | uVar3 << 0xf)) +
            ((uVar1 >> 0x12 | uVar1 << 0xe) ^ uVar1 >> 3 ^ (uVar1 >> 7 | uVar1 << 0x19));
    puVar14[0xc] = uVar1;
    local_160 = ((uVar9 >> 6 | uVar9 * 0x4000000) ^ (uVar9 >> 0xb | uVar9 * 0x200000) ^
                (uVar9 >> 0x19 | uVar9 * 0x80)) + local_58 + iVar4 + uVar2 + uVar1;
    iStack_15c = ((uStack_54 >> 2 | uStack_54 << 0x1e) ^ (uStack_54 >> 0xd | uStack_54 << 0x13) ^
                 (uStack_54 >> 0x16 | uStack_54 << 10)) +
                 (uStack_4c & (uStack_50 | uStack_54) | uStack_50 & uStack_54);
    local_48 = local_48 + local_160;
    local_58 = iStack_15c + local_160;
    if (0x3f < uVar13) break;
    uVar13 = uVar13 + 8;
    piVar15 = piVar15 + 8;
    puVar14 = puVar14 + 8;
  }
  *(int *)(param_1 + 0x48) = *(int *)(param_1 + 0x48) + iStack_15c + local_160;
  *(ulong *)(param_1 + 0x4c) =
       CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 0x4c) >> 0x20) + uStack_50,
                (int)*(undefined8 *)(param_1 + 0x4c) + uStack_54);
  *(uint *)(param_1 + 0x54) = *(int *)(param_1 + 0x54) + uStack_4c;
  *(uint *)(param_1 + 0x58) = *(int *)(param_1 + 0x58) + local_48;
  *(ulong *)(param_1 + 0x5c) =
       CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 0x5c) >> 0x20) + uStack_40,
                (int)*(undefined8 *)(param_1 + 0x5c) + uStack_44);
  *(uint *)(param_1 + 100) = *(int *)(param_1 + 100) + uStack_3c;
  mbedtls_platform_zeroize(&local_160,0x128);
  if (*(long *)(lVar12 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

