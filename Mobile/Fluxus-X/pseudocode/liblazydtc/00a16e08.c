/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a16e08
 */

void DES_ncbc_encrypt(uchar *input,uchar *output,long length,DES_key_schedule *schedule,
                     DES_cblock *ivec,int enc)

{
  long lVar1;
  uint *puVar2;
  byte *pbVar3;
  uchar *puVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  ulong uVar10;
  uchar *puVar11;
  uint local_68;
  uint local_64;
  
  local_68 = *(uint *)*ivec;
  local_64 = *(uint *)(*ivec + 4);
  uVar7 = local_68;
  uVar9 = local_64;
  if (enc == 0) {
    if (7 < length) {
      uVar10 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar10 = ~length;
      }
      uVar10 = uVar10 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar10 + 8;
      puVar2 = (uint *)(input + lVar1);
      lVar5 = length + 8;
      puVar4 = output;
      uVar6 = local_68;
      uVar8 = local_64;
      do {
        uVar7 = *(uint *)input;
        uVar9 = *(uint *)((long)input + 4);
        local_68 = uVar7;
        local_64 = uVar9;
        DES_encrypt1(&local_68,schedule,0);
        lVar5 = lVar5 + -8;
        input = (uchar *)((long)input + 8);
        local_68 = local_68 ^ uVar6;
        local_64 = local_64 ^ uVar8;
        *puVar4 = (uchar)local_68;
        puVar4[1] = (uchar)(local_68 >> 8);
        puVar4[4] = (uchar)local_64;
        puVar4[2] = (uchar)(local_68 >> 0x10);
        puVar4[3] = (uchar)(local_68 >> 0x18);
        puVar4[5] = (uchar)(local_64 >> 8);
        puVar4[6] = (uchar)(local_64 >> 0x10);
        puVar4[7] = (uchar)(local_64 >> 0x18);
        puVar4 = puVar4 + 8;
        uVar6 = uVar7;
        uVar8 = uVar9;
      } while (0xf < lVar5);
      length = (length + -8) - uVar10;
      output = output + lVar1;
      input = (uchar *)puVar2;
    }
    if (length != 0) {
      uVar6 = *(uint *)input;
      uVar8 = *(uint *)((long)input + 4);
      local_68 = uVar6;
      local_64 = uVar8;
      DES_encrypt1(&local_68,schedule,0);
      if (length - 1U < 7) {
        local_68 = local_68 ^ uVar7;
        local_64 = local_64 ^ uVar9;
        puVar4 = output + length;
        switch(length) {
        case 7:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_64 >> 0x10);
        case 6:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_64 >> 8);
        case 5:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)local_64;
        case 4:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_68 >> 0x18);
        case 3:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_68 >> 0x10);
        case 2:
          puVar4 = puVar4 + -1;
          *puVar4 = (uchar)(local_68 >> 8);
        case 1:
          puVar4[-1] = (uchar)local_68;
        }
      }
      goto LAB_00a17128;
    }
  }
  else {
    puVar4 = input;
    if (7 < length) {
      uVar10 = 0xfffffffffffffff0;
      if (-0x10 < ~length) {
        uVar10 = ~length;
      }
      uVar10 = uVar10 + length + 8 & 0xfffffffffffffff8;
      lVar1 = uVar10 + 8;
      puVar4 = input + lVar1;
      lVar5 = length + 8;
      puVar11 = output;
      do {
        local_68 = *(uint *)input ^ local_68;
        local_64 = *(uint *)((long)input + 4) ^ local_64;
        DES_encrypt1(&local_68,schedule,1);
        lVar5 = lVar5 + -8;
        puVar11[1] = (uchar)(local_68 >> 8);
        *puVar11 = (uchar)local_68;
        puVar11[2] = (uchar)(local_68 >> 0x10);
        puVar11[3] = (uchar)(local_68 >> 0x18);
        puVar11[5] = (uchar)(local_64 >> 8);
        puVar11[6] = (uchar)(local_64 >> 0x10);
        puVar11[4] = (uchar)local_64;
        puVar11[7] = (uchar)(local_64 >> 0x18);
        puVar11 = puVar11 + 8;
        input = (uchar *)((long)input + 8);
      } while (0xf < lVar5);
      output = output + lVar1;
      length = (length + -8) - uVar10;
      uVar7 = local_68;
      uVar9 = local_64;
    }
    if (length != 0) {
      local_68 = 0;
      if (length - 1U < 7) {
        pbVar3 = puVar4 + length;
        local_64 = 0;
        switch(length) {
        case 7:
          pbVar3 = pbVar3 + -1;
          local_68 = (uint)*pbVar3 << 0x10;
        case 6:
          pbVar3 = pbVar3 + -1;
          local_68 = local_68 | (uint)*pbVar3 << 8;
        case 5:
          pbVar3 = pbVar3 + -1;
          local_68 = local_68 | *pbVar3;
        case 4:
          local_64 = local_68;
          pbVar3 = pbVar3 + -1;
          local_68 = (uint)*pbVar3 << 0x18;
        case 3:
          pbVar3 = pbVar3 + -1;
          local_68 = local_68 | (uint)*pbVar3 << 0x10;
        case 2:
          pbVar3 = pbVar3 + -1;
          local_68 = local_68 | (uint)*pbVar3 << 8;
        case 1:
          local_68 = local_68 | pbVar3[-1];
        }
      }
      else {
        local_64 = 0;
      }
      local_68 = local_68 ^ uVar7;
      local_64 = local_64 ^ uVar9;
      DES_encrypt1(&local_68,schedule,1);
      output[1] = (uchar)(local_68 >> 8);
      output[3] = (uchar)(local_68 >> 0x18);
      output[5] = (uchar)(local_64 >> 8);
      output[6] = (uchar)(local_64 >> 0x10);
      *output = (uchar)local_68;
      output[2] = (uchar)(local_68 >> 0x10);
      output[4] = (uchar)local_64;
      output[7] = (uchar)(local_64 >> 0x18);
      uVar6 = local_68;
      uVar8 = local_64;
      goto LAB_00a17128;
    }
  }
  uVar6 = uVar7;
  uVar8 = uVar9;
LAB_00a17128:
  (*ivec)[0] = (uchar)uVar6;
  (*ivec)[4] = (uchar)uVar8;
  (*ivec)[1] = (uchar)(uVar6 >> 8);
  (*ivec)[2] = (uchar)(uVar6 >> 0x10);
  (*ivec)[3] = (uchar)(uVar6 >> 0x18);
  (*ivec)[5] = (uchar)(uVar8 >> 8);
  (*ivec)[6] = (uchar)(uVar8 >> 0x10);
  (*ivec)[7] = (uchar)(uVar8 >> 0x18);
  return;
}

