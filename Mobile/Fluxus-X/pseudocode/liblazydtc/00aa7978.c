/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa7978
 */

void CRYPTO_ccm128_aad(byte *param_1,byte *param_2,ulong param_3)

{
  byte *pbVar1;
  code *pcVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  long lVar6;
  long lVar7;
  byte *pbVar8;
  bool bVar9;
  
  if (param_3 != 0) {
    pcVar2 = *(code **)(param_1 + 0x28);
    pbVar1 = param_1 + 0x10;
    *param_1 = *param_1 | 0x40;
    (*pcVar2)(param_1,pbVar1,*(undefined8 *)(param_1 + 0x30));
    *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + 1;
    bVar3 = (byte)(param_3 >> 8);
    if (param_3 >> 8 < 0xff) {
      lVar6 = 2;
      *pbVar1 = *pbVar1 ^ bVar3;
      lVar7 = 1;
    }
    else {
      *pbVar1 = ~*pbVar1;
      bVar5 = (byte)(param_3 >> 0x10);
      bVar4 = (byte)(param_3 >> 0x18);
      if (param_3 >> 0x20 == 0) {
        param_1[0x11] = param_1[0x11] ^ 0xfe;
        lVar6 = 6;
        param_1[0x12] = param_1[0x12] ^ bVar4;
        lVar7 = 5;
        param_1[0x13] = param_1[0x13] ^ bVar5;
        param_1[0x14] = param_1[0x14] ^ bVar3;
      }
      else {
        param_1[0x11] = ~param_1[0x11];
        param_1[0x12] = param_1[0x12] ^ (byte)(param_3 >> 0x38);
        param_1[0x14] = param_1[0x14] ^ (byte)(param_3 >> 0x28);
        param_1[0x15] = param_1[0x15] ^ (byte)(param_3 >> 0x20);
        param_1[0x13] = param_1[0x13] ^ (byte)(param_3 >> 0x30);
        param_1[0x16] = param_1[0x16] ^ bVar4;
        lVar6 = 10;
        param_1[0x17] = param_1[0x17] ^ bVar5;
        param_1[0x18] = param_1[0x18] ^ bVar3;
        lVar7 = 9;
      }
    }
    pbVar1[lVar7] = pbVar1[lVar7] ^ (byte)param_3;
    do {
      if (param_3 == 0) {
        bVar9 = false;
      }
      else {
        pbVar8 = param_2;
        do {
          param_2 = pbVar8 + 1;
          param_3 = param_3 - 1;
          bVar9 = param_3 != 0;
          param_1[lVar6 + 0x10] = param_1[lVar6 + 0x10] ^ *pbVar8;
          if (param_3 == 0) break;
          lVar6 = lVar6 + 1;
          pbVar8 = param_2;
        } while ((uint)lVar6 < 0x10);
      }
      (*pcVar2)(pbVar1,pbVar1,*(undefined8 *)(param_1 + 0x30));
      lVar6 = 0;
      *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + 1;
    } while (bVar9);
  }
  return;
}

