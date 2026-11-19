/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8dc94
 */

void BF_cbc_encrypt(uchar *in,uchar *out,long length,BF_KEY *schedule,uchar *ivec,int enc)

{
  long lVar1;
  uint uVar2;
  byte *pbVar3;
  uchar *puVar4;
  uchar *puVar5;
  uint *puVar6;
  long lVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  uint local_68;
  uint uStack_64;
  
  uVar2 = (*(uint *)ivec & 0xff00ff00) >> 8 | (*(uint *)ivec & 0xff00ff) << 8;
  uVar2 = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar9 = (*(uint *)(ivec + 4) & 0xff00ff00) >> 8 | (*(uint *)(ivec + 4) & 0xff00ff) << 8;
  uVar9 = uVar9 >> 0x10 | uVar9 << 0x10;
  if (enc == 0) {
    puVar6 = (uint *)in;
    if (7 < length) {
      uVar11 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar11 = ~length;
      }
      uVar11 = uVar11 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar11 + 8;
      puVar6 = (uint *)(in + lVar1);
      lVar7 = length + 8;
      puVar4 = out;
      uVar10 = uVar2;
      uVar8 = uVar9;
      do {
        uVar2 = (*(uint *)in & 0xff00ff00) >> 8 | (*(uint *)in & 0xff00ff) << 8;
        uVar2 = uVar2 >> 0x10 | uVar2 << 0x10;
        uVar9 = (*(uint *)((long)in + 4) & 0xff00ff00) >> 8 |
                (*(uint *)((long)in + 4) & 0xff00ff) << 8;
        uVar9 = uVar9 >> 0x10 | uVar9 << 0x10;
        local_68 = uVar2;
        uStack_64 = uVar9;
        BF_decrypt(&local_68,schedule);
        lVar7 = lVar7 + -8;
        local_68 = local_68 ^ uVar10;
        uStack_64 = uStack_64 ^ uVar8;
        *puVar4 = (uchar)(local_68 >> 0x18);
        puVar4[3] = (uchar)local_68;
        puVar4[1] = (uchar)(local_68 >> 0x10);
        puVar4[2] = (uchar)(local_68 >> 8);
        puVar4[7] = (uchar)uStack_64;
        puVar4[4] = (uchar)(uStack_64 >> 0x18);
        puVar4[5] = (uchar)(uStack_64 >> 0x10);
        puVar4[6] = (uchar)(uStack_64 >> 8);
        puVar4 = puVar4 + 8;
        in = (uchar *)((long)in + 8);
        uVar10 = uVar2;
        uVar8 = uVar9;
      } while (0xf < lVar7);
      length = (length + -8) - uVar11;
      out = out + lVar1;
    }
    if (length != 0) {
      uVar10 = (*puVar6 & 0xff00ff00) >> 8 | (*puVar6 & 0xff00ff) << 8;
      uVar10 = uVar10 >> 0x10 | uVar10 << 0x10;
      uVar8 = (puVar6[1] & 0xff00ff00) >> 8 | (puVar6[1] & 0xff00ff) << 8;
      uVar8 = uVar8 >> 0x10 | uVar8 << 0x10;
      local_68 = uVar10;
      uStack_64 = uVar8;
      BF_decrypt(&local_68,schedule);
      if (length - 1U < 7) {
        local_68 = local_68 ^ uVar2;
        uStack_64 = uStack_64 ^ uVar9;
        puVar4 = out + length;
        switch(length) {
        case 7:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(uStack_64 >> 8);
        case 6:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(uStack_64 >> 0x10);
        case 5:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(uStack_64 >> 0x18);
        case 4:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)local_68;
        case 3:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_68 >> 8);
        case 2:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_68 >> 0x10);
        case 1:
          puVar4[-1] = (uchar)(local_68 >> 0x18);
        }
      }
      goto LAB_00a8dfac;
    }
  }
  else {
    puVar4 = in;
    local_68 = uVar2;
    uStack_64 = uVar9;
    if (7 < length) {
      uVar11 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar11 = ~length;
      }
      uVar11 = uVar11 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar11 + 8;
      puVar4 = in + lVar1;
      lVar7 = length + 8;
      puVar5 = out;
      do {
        uVar2 = (*(uint *)in & 0xff00ff00) >> 8 | (*(uint *)in & 0xff00ff) << 8;
        uVar9 = (*(uint *)((long)in + 4) & 0xff00ff00) >> 8 |
                (*(uint *)((long)in + 4) & 0xff00ff) << 8;
        local_68 = (uVar2 >> 0x10 | uVar2 << 0x10) ^ local_68;
        uStack_64 = (uVar9 >> 0x10 | uVar9 << 0x10) ^ uStack_64;
        BF_encrypt(&local_68,schedule);
        lVar7 = lVar7 + -8;
        *puVar5 = (uchar)(local_68 >> 0x18);
        puVar5[1] = (uchar)(local_68 >> 0x10);
        puVar5[2] = (uchar)(local_68 >> 8);
        puVar5[4] = (uchar)(uStack_64 >> 0x18);
        puVar5[5] = (uchar)(uStack_64 >> 0x10);
        puVar5[3] = (uchar)local_68;
        puVar5[7] = (uchar)uStack_64;
        puVar5[6] = (uchar)(uStack_64 >> 8);
        puVar5 = puVar5 + 8;
        in = (uchar *)((long)in + 8);
      } while (0xf < lVar7);
      out = out + lVar1;
      length = (length + -8) - uVar11;
    }
    uVar2 = local_68;
    uVar9 = uStack_64;
    if (length != 0) {
      uVar2 = 0;
      if (length - 1U < 7) {
        pbVar3 = puVar4 + length;
        uVar9 = 0;
        switch(length) {
        case 7:
          pbVar3 = pbVar3 + -1;
          uVar2 = (uint)*pbVar3 << 8;
        case 6:
          pbVar3 = pbVar3 + -1;
          uVar2 = uVar2 | (uint)*pbVar3 << 0x10;
        case 5:
          pbVar3 = pbVar3 + -1;
          uVar2 = uVar2 | (uint)*pbVar3 << 0x18;
        case 4:
          uVar9 = uVar2;
          pbVar3 = pbVar3 + -1;
          uVar2 = (uint)*pbVar3;
        case 3:
          pbVar3 = pbVar3 + -1;
          uVar2 = uVar2 | (uint)*pbVar3 << 8;
        case 2:
          pbVar3 = pbVar3 + -1;
          uVar2 = uVar2 | (uint)*pbVar3 << 0x10;
        case 1:
          uVar2 = uVar2 | (uint)pbVar3[-1] << 0x18;
        }
      }
      else {
        uVar9 = 0;
      }
      local_68 = uVar2 ^ local_68;
      uStack_64 = uVar9 ^ uStack_64;
      BF_encrypt(&local_68,schedule);
      *out = (uchar)(local_68 >> 0x18);
      out[1] = (uchar)(local_68 >> 0x10);
      out[2] = (uchar)(local_68 >> 8);
      out[4] = (uchar)(uStack_64 >> 0x18);
      out[5] = (uchar)(uStack_64 >> 0x10);
      out[3] = (uchar)local_68;
      out[6] = (uchar)(uStack_64 >> 8);
      out[7] = (uchar)uStack_64;
      uVar10 = local_68;
      uVar8 = uStack_64;
      goto LAB_00a8dfac;
    }
  }
  uVar10 = uVar2;
  uVar8 = uVar9;
LAB_00a8dfac:
  ivec[3] = (uchar)uVar10;
  *ivec = (uchar)(uVar10 >> 0x18);
  ivec[1] = (uchar)(uVar10 >> 0x10);
  ivec[2] = (uchar)(uVar10 >> 8);
  ivec[4] = (uchar)(uVar8 >> 0x18);
  ivec[5] = (uchar)(uVar8 >> 0x10);
  ivec[6] = (uchar)(uVar8 >> 8);
  ivec[7] = (uchar)uVar8;
  return;
}

