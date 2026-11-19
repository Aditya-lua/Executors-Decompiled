/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acac34
 */

void RC2_cbc_encrypt(uchar *in,uchar *out,long length,RC2_KEY *ks,uchar *iv,int enc)

{
  long lVar1;
  uint *puVar2;
  ulong uVar3;
  ulong uVar4;
  byte *pbVar5;
  uchar *puVar6;
  long lVar7;
  uint uVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  uchar *puVar13;
  ulong local_70;
  ulong local_68;
  
  local_70 = (ulong)*(uint *)iv;
  local_68 = (ulong)*(uint *)(iv + 4);
  uVar12 = local_70;
  uVar11 = local_68;
  if (enc == 0) {
    if (7 < length) {
      uVar12 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar12 = ~length;
      }
      uVar4 = uVar12 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar4 + 8;
      puVar2 = (uint *)(in + lVar1);
      lVar7 = length + 8;
      puVar6 = out;
      uVar3 = local_70;
      uVar10 = local_68;
      do {
        uVar12 = (ulong)*(uint *)in;
        uVar11 = (ulong)*(uint *)((long)in + 4);
        local_70 = uVar12;
        local_68 = uVar11;
        RC2_decrypt(&local_70,ks);
        lVar7 = lVar7 + -8;
        in = (uchar *)((long)in + 8);
        local_70 = local_70 ^ uVar3;
        local_68 = local_68 ^ uVar10;
        *puVar6 = (uchar)local_70;
        puVar6[1] = (uchar)(local_70 >> 8);
        puVar6[4] = (uchar)local_68;
        puVar6[2] = (uchar)(local_70 >> 0x10);
        puVar6[3] = (uchar)(local_70 >> 0x18);
        puVar6[5] = (uchar)(local_68 >> 8);
        puVar6[6] = (uchar)(local_68 >> 0x10);
        puVar6[7] = (uchar)(local_68 >> 0x18);
        puVar6 = puVar6 + 8;
        uVar3 = uVar12;
        uVar10 = uVar11;
      } while (0xf < lVar7);
      length = (length + -8) - uVar4;
      out = out + lVar1;
      in = (uchar *)puVar2;
    }
    if (length != 0) {
      uVar8 = *(uint *)in;
      local_70 = (ulong)uVar8;
      uVar9 = *(uint *)((long)in + 4);
      local_68 = (ulong)uVar9;
      RC2_decrypt(&local_70,ks);
      if (length - 1U < 7) {
        local_70 = local_70 ^ uVar12;
        local_68 = local_68 ^ uVar11;
        puVar6 = out + length;
        switch(length) {
        case 7:
          puVar6 = puVar6 + -1;
          *puVar6 = (uchar)(local_68 >> 0x10);
        case 6:
          puVar6 = puVar6 + -1;
          *puVar6 = (uchar)(local_68 >> 8);
        case 5:
          puVar6 = puVar6 + -1;
          *puVar6 = (uchar)local_68;
        case 4:
          puVar6 = puVar6 + -1;
          *puVar6 = (uchar)(local_70 >> 0x18);
        case 3:
          puVar6 = puVar6 + -1;
          *puVar6 = (uchar)(local_70 >> 0x10);
        case 2:
          puVar6 = puVar6 + -1;
          *puVar6 = (uchar)(local_70 >> 8);
        case 1:
          puVar6[-1] = (uchar)local_70;
        }
      }
      goto LAB_00acb00c;
    }
  }
  else {
    puVar6 = in;
    if (7 < length) {
      uVar12 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar12 = ~length;
      }
      uVar12 = uVar12 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar12 + 8;
      puVar6 = in + lVar1;
      lVar7 = length + 8;
      puVar13 = out;
      do {
        local_70 = *(uint *)in ^ local_70;
        local_68 = *(uint *)((long)in + 4) ^ local_68;
        RC2_encrypt(&local_70,ks);
        lVar7 = lVar7 + -8;
        in = (uchar *)((long)in + 8);
        puVar13[1] = (uchar)(local_70 >> 8);
        *puVar13 = (uchar)local_70;
        puVar13[2] = (uchar)(local_70 >> 0x10);
        puVar13[3] = (uchar)(local_70 >> 0x18);
        puVar13[5] = (uchar)(local_68 >> 8);
        puVar13[6] = (uchar)(local_68 >> 0x10);
        puVar13[4] = (uchar)local_68;
        puVar13[7] = (uchar)(local_68 >> 0x18);
        puVar13 = puVar13 + 8;
      } while (0xf < lVar7);
      length = (length + -8) - uVar12;
      out = out + lVar1;
      uVar12 = local_70;
      uVar11 = local_68;
    }
    if (length != 0) {
      local_70 = 0;
      if (length - 1U < 7) {
        pbVar5 = puVar6 + length;
        local_68 = 0;
        uVar3 = local_70;
        switch(length) {
        case 7:
          pbVar5 = pbVar5 + -1;
          local_70 = (ulong)*pbVar5 << 0x10;
        case 6:
          pbVar5 = pbVar5 + -1;
          local_70 = local_70 | (ulong)*pbVar5 << 8;
        case 5:
          pbVar5 = pbVar5 + -1;
          uVar3 = local_70 | *pbVar5;
        case 4:
          pbVar5 = pbVar5 + -1;
          local_70 = (ulong)*pbVar5 << 0x18;
          local_68 = uVar3;
        case 3:
          pbVar5 = pbVar5 + -1;
          local_70 = local_70 | (ulong)*pbVar5 << 0x10;
        case 2:
          pbVar5 = pbVar5 + -1;
          local_70 = local_70 | (ulong)*pbVar5 << 8;
        case 1:
          local_70 = local_70 | pbVar5[-1];
        }
      }
      else {
        local_68 = 0;
      }
      local_70 = local_70 ^ uVar12;
      local_68 = local_68 ^ uVar11;
      RC2_encrypt(&local_70,ks);
      uVar8 = (uint)local_70;
      uVar9 = (uint)local_68;
      out[1] = (uchar)(local_70 >> 8);
      out[3] = (uchar)(local_70 >> 0x18);
      out[5] = (uchar)(local_68 >> 8);
      out[6] = (uchar)(local_68 >> 0x10);
      *out = (uchar)local_70;
      out[2] = (uchar)(local_70 >> 0x10);
      out[4] = (uchar)local_68;
      out[7] = (uchar)(local_68 >> 0x18);
      goto LAB_00acb00c;
    }
  }
  uVar9 = (uint)uVar11;
  uVar8 = (uint)uVar12;
LAB_00acb00c:
  *iv = (uchar)uVar8;
  iv[4] = (uchar)uVar9;
  iv[1] = (uchar)(uVar8 >> 8);
  iv[2] = (uchar)(uVar8 >> 0x10);
  iv[3] = (uchar)(uVar8 >> 0x18);
  iv[5] = (uchar)(uVar9 >> 8);
  iv[6] = (uchar)(uVar9 >> 0x10);
  iv[7] = (uchar)(uVar9 >> 0x18);
  return;
}

