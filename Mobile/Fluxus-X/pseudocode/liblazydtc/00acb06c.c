/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acb06c
 */

void RC2_encrypt(ulong *data,RC2_KEY *key)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  int iVar10;
  int iVar11;
  uint uVar12;
  uint uVar13;
  ulong uVar14;
  ulong uVar15;
  uint uVar16;
  uint *puVar17;
  
  iVar11 = 3;
  uVar16 = (uint)*data & 0xffff;
  uVar15 = *data >> 0x10;
  uVar12 = (uint)data[1] & 0xffff;
  uVar14 = data[1] >> 0x10;
  iVar10 = 5;
  puVar17 = key->data;
  while( true ) {
    do {
      uVar13 = (uint)uVar14;
      puVar1 = puVar17 + 4;
      uVar16 = (uVar13 & uVar12) + uVar16 + ((uint)uVar15 & (uVar13 ^ 0xffffffff)) + *puVar17;
      iVar10 = iVar10 + -1;
      uVar6 = uVar16 >> 0xf & 1;
      uVar3 = (uVar16 & 0xffff) << 1;
      uVar16 = uVar6 | uVar3;
      uVar2 = puVar17[1] + (uint)uVar15 + (uVar16 & uVar13) + (uVar12 & (uVar16 ^ 0xffffffff));
      uVar7 = uVar2 >> 0xe & 3;
      uVar4 = (uVar2 & 0xffff) << 2;
      uVar2 = uVar7 | uVar4;
      uVar15 = (ulong)uVar2;
      uVar12 = puVar17[2] + uVar12 + (uVar2 & uVar16) + (uVar13 & (uVar2 ^ 0xffffffff));
      uVar8 = uVar12 >> 0xd & 7;
      uVar5 = (uVar12 & 0xffff) << 3;
      uVar12 = uVar8 | uVar5;
      uVar13 = puVar17[3] + uVar13 + (uVar12 & uVar2) + (uVar16 & (uVar12 ^ 0xffffffff));
      uVar9 = uVar13 >> 0xb & 0x1f;
      uVar13 = (uVar13 & 0xffff) << 5;
      uVar14 = (ulong)(uVar9 | uVar13);
      puVar17 = puVar1;
    } while (iVar10 != 0);
    iVar11 = iVar11 + -1;
    if (iVar11 == 0) break;
    uVar16 = key->data[uVar9 | uVar13 & 0x20] + uVar16;
    uVar2 = key->data[uVar16 & 0x3f] + uVar2;
    uVar15 = (ulong)uVar2;
    uVar12 = key->data[uVar2 & 0x3f] + uVar12;
    iVar10 = 5;
    if (iVar11 == 2) {
      iVar10 = 6;
    }
    uVar14 = (ulong)(key->data[uVar12 & 0x3f] + (uVar9 | uVar13));
  }
  *data = (ulong)(uVar6 | uVar3 & 0xffff | (uVar7 | uVar4 & 0xffff) << 0x10);
  data[1] = (ulong)(uVar8 | uVar5 & 0xffff | (uVar9 | uVar13 & 0xffe0) << 0x10);
  return;
}

