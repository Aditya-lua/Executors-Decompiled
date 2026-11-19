/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17188
 */

void DES_ede3_cbc_encrypt
               (uchar *input,uchar *output,long length,DES_key_schedule *ks1,DES_key_schedule *ks2,
               DES_key_schedule *ks3,DES_cblock *ivec,int enc)

{
  long lVar1;
  byte *pbVar2;
  uchar *puVar3;
  uchar *puVar4;
  uint *puVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  uint local_68;
  uint uStack_64;
  
  uVar8 = *(uint *)*ivec;
  uVar10 = *(uint *)(*ivec + 4);
  if (enc == 0) {
    puVar5 = (uint *)input;
    if (7 < length) {
      uVar11 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar11 = ~length;
      }
      uVar11 = uVar11 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar11 + 8;
      puVar5 = (uint *)(input + lVar1);
      lVar6 = length + 8;
      puVar3 = output;
      uVar7 = uVar8;
      uVar9 = uVar10;
      do {
        uVar8 = *(uint *)input;
        uVar10 = *(uint *)((long)input + 4);
        local_68 = uVar8;
        uStack_64 = uVar10;
        DES_decrypt3(&local_68,ks1,ks2,ks3);
        lVar6 = lVar6 + -8;
        local_68 = local_68 ^ uVar7;
        uStack_64 = uStack_64 ^ uVar9;
        *puVar3 = (uchar)local_68;
        puVar3[4] = (uchar)uStack_64;
        puVar3[1] = (uchar)(local_68 >> 8);
        puVar3[2] = (uchar)(local_68 >> 0x10);
        puVar3[3] = (uchar)(local_68 >> 0x18);
        puVar3[5] = (uchar)(uStack_64 >> 8);
        puVar3[6] = (uchar)(uStack_64 >> 0x10);
        puVar3[7] = (uchar)(uStack_64 >> 0x18);
        puVar3 = puVar3 + 8;
        input = (uchar *)((long)input + 8);
        uVar7 = uVar8;
        uVar9 = uVar10;
      } while (0xf < lVar6);
      length = (length + -8) - uVar11;
      output = output + lVar1;
    }
    if (length != 0) {
      uVar7 = *puVar5;
      uVar9 = puVar5[1];
      local_68 = uVar7;
      uStack_64 = uVar9;
      DES_decrypt3(&local_68,ks1,ks2,ks3);
      if (length - 1U < 7) {
        local_68 = local_68 ^ uVar8;
        uStack_64 = uStack_64 ^ uVar10;
        puVar3 = output + length;
        switch(length) {
        case 7:
          puVar3 = puVar3 + -1;
          *puVar3 = (uchar)(uStack_64 >> 0x10);
        case 6:
          puVar3 = puVar3 + -1;
          *puVar3 = (uchar)(uStack_64 >> 8);
        case 5:
          puVar3 = puVar3 + -1;
          *puVar3 = (uchar)uStack_64;
        case 4:
          puVar3 = puVar3 + -1;
          *puVar3 = (uchar)(local_68 >> 0x18);
        case 3:
          puVar3 = puVar3 + -1;
          *puVar3 = (uchar)(local_68 >> 0x10);
        case 2:
          puVar3 = puVar3 + -1;
          *puVar3 = (uchar)(local_68 >> 8);
        case 1:
          puVar3[-1] = (uchar)local_68;
        }
      }
      goto LAB_00a174b4;
    }
  }
  else {
    puVar3 = input;
    local_68 = uVar8;
    uStack_64 = uVar10;
    if (7 < length) {
      uVar11 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar11 = ~length;
      }
      uVar11 = uVar11 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar11 + 8;
      puVar3 = input + lVar1;
      lVar6 = length + 8;
      puVar4 = output;
      do {
        local_68 = *(uint *)input ^ local_68;
        uStack_64 = *(uint *)((long)input + 4) ^ uStack_64;
        DES_encrypt3(&local_68,ks1,ks2,ks3);
        lVar6 = lVar6 + -8;
        puVar4[1] = (uchar)(local_68 >> 8);
        puVar4[2] = (uchar)(local_68 >> 0x10);
        puVar4[3] = (uchar)(local_68 >> 0x18);
        puVar4[5] = (uchar)(uStack_64 >> 8);
        puVar4[6] = (uchar)(uStack_64 >> 0x10);
        *puVar4 = (uchar)local_68;
        puVar4[4] = (uchar)uStack_64;
        puVar4[7] = (uchar)(uStack_64 >> 0x18);
        puVar4 = puVar4 + 8;
        input = (uchar *)((long)input + 8);
      } while (0xf < lVar6);
      length = (length + -8) - uVar11;
      output = output + lVar1;
    }
    uVar8 = local_68;
    uVar10 = uStack_64;
    if (length != 0) {
      uVar8 = 0;
      if (length - 1U < 7) {
        pbVar2 = puVar3 + length;
        uVar10 = 0;
        switch(length) {
        case 7:
          pbVar2 = pbVar2 + -1;
          uVar8 = (uint)*pbVar2 << 0x10;
        case 6:
          pbVar2 = pbVar2 + -1;
          uVar8 = uVar8 | (uint)*pbVar2 << 8;
        case 5:
          pbVar2 = pbVar2 + -1;
          uVar8 = uVar8 | *pbVar2;
        case 4:
          uVar10 = uVar8;
          pbVar2 = pbVar2 + -1;
          uVar8 = (uint)*pbVar2 << 0x18;
        case 3:
          pbVar2 = pbVar2 + -1;
          uVar8 = uVar8 | (uint)*pbVar2 << 0x10;
        case 2:
          pbVar2 = pbVar2 + -1;
          uVar8 = uVar8 | (uint)*pbVar2 << 8;
        case 1:
          uVar8 = uVar8 | pbVar2[-1];
        }
      }
      else {
        uVar10 = 0;
      }
      local_68 = uVar8 ^ local_68;
      uStack_64 = uVar10 ^ uStack_64;
      DES_encrypt3(&local_68,ks1,ks2,ks3);
      output[1] = (uchar)(local_68 >> 8);
      output[2] = (uchar)(local_68 >> 0x10);
      output[3] = (uchar)(local_68 >> 0x18);
      output[5] = (uchar)(uStack_64 >> 8);
      output[6] = (uchar)(uStack_64 >> 0x10);
      *output = (uchar)local_68;
      output[4] = (uchar)uStack_64;
      output[7] = (uchar)(uStack_64 >> 0x18);
      uVar7 = local_68;
      uVar9 = uStack_64;
      goto LAB_00a174b4;
    }
  }
  uVar7 = uVar8;
  uVar9 = uVar10;
LAB_00a174b4:
  (*ivec)[0] = (uchar)uVar7;
  (*ivec)[4] = (uchar)uVar9;
  (*ivec)[1] = (uchar)(uVar7 >> 8);
  (*ivec)[2] = (uchar)(uVar7 >> 0x10);
  (*ivec)[3] = (uchar)(uVar7 >> 0x18);
  (*ivec)[5] = (uchar)(uVar9 >> 8);
  (*ivec)[6] = (uchar)(uVar9 >> 0x10);
  (*ivec)[7] = (uchar)(uVar9 >> 0x18);
  return;
}

