/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b731bc
 */

void mbedtls_ct_memmove_left(byte *param_1,long param_2,long param_3)

{
  long lVar1;
  byte bVar2;
  byte *pbVar3;
  byte bVar4;
  long lVar5;
  long lVar6;
  
  if (param_2 != 0) {
    lVar5 = 0;
    lVar6 = param_2 + -1;
    do {
      bVar4 = (byte)((ulong)(param_2 - param_3) >> 0x38);
      bVar2 = bVar4 ^ (byte)((ulong)lVar5 >> 0x38);
      bVar2 = (char)((byte)((ulong)(lVar5 - (param_2 - param_3)) >> 0x38) & (bVar2 ^ 0xff) |
                    bVar2 & bVar4) >> 7;
      pbVar3 = param_1;
      for (lVar1 = lVar6; lVar1 != 0; lVar1 = lVar1 + -1) {
        *pbVar3 = *pbVar3 & bVar2 | ~bVar2 & pbVar3[1];
        pbVar3 = pbVar3 + 1;
      }
      lVar5 = lVar5 + 1;
      param_1[lVar6] = param_1[lVar6] & bVar2;
    } while (lVar5 != param_2);
  }
  return;
}

