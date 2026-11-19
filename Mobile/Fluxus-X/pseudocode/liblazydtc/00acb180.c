/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acb180
 */

void RC2_decrypt(ulong *data,RC2_KEY *key)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  ulong uVar10;
  uint uVar11;
  ulong uVar12;
  
  puVar5 = key->data + 0x3f;
  iVar7 = 3;
  uVar8 = (uint)*data & 0xffff;
  uVar12 = *data >> 0x10;
  uVar9 = (uint)data[1] & 0xffff;
  uVar10 = data[1] >> 0x10;
  iVar6 = 5;
  do {
    uVar11 = (uint)uVar12;
    uVar2 = (((uint)uVar10 << 0xb | (uint)uVar10 >> 5) -
            (((uVar9 ^ 0xffff) & uVar8) + (uVar9 & uVar11))) - *puVar5;
    uVar3 = (((uVar9 << 0xd | uVar9 >> 3) - (uVar11 & uVar8)) - puVar5[-1]) -
            (uVar2 & (uVar11 ^ 0xffff));
    uVar1 = uVar2 & 0xffff;
    uVar11 = (((uVar11 << 0xe | uVar11 >> 2) - (uVar2 & uVar8)) - puVar5[-2]) -
             (uVar3 & (uVar8 ^ 0xffff));
    uVar4 = (((uVar8 << 0xf | uVar8 >> 1) - puVar5[-3]) - (uVar3 & uVar2)) -
            (uVar11 & (uVar1 ^ 0xffff));
    uVar9 = uVar3 & 0xffff;
    iVar6 = iVar6 + -1;
    uVar8 = uVar4 & 0xffff;
    if (iVar6 == 0) {
      iVar7 = iVar7 + -1;
      if (iVar7 == 0) {
        *data = (ulong)(uVar8 | uVar11 * 0x10000);
        data[1] = (ulong)(uVar9 | uVar2 * 0x10000);
        return;
      }
      uVar2 = uVar2 - key->data[uVar3 & 0x3f];
      uVar1 = uVar2 & 0xffff;
      iVar6 = 5;
      if (iVar7 == 2) {
        iVar6 = 6;
      }
      uVar9 = uVar3 - key->data[uVar11 & 0x3f] & 0xffff;
      uVar11 = uVar11 - key->data[uVar4 & 0x3f];
      uVar8 = uVar4 - key->data[uVar2 & 0x3f] & 0xffff;
    }
    uVar10 = (ulong)uVar1;
    uVar12 = (ulong)(uVar11 & 0xffff);
    puVar5 = puVar5 + -4;
  } while( true );
}

