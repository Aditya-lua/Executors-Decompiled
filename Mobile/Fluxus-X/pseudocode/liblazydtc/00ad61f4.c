/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad61f4
 */

undefined8
ossl_rsa_padding_check_PKCS1_type_2_TLS
          (undefined8 param_1,long param_2,ulong param_3,byte *param_4,ulong param_5,uint param_6,
          uint param_7)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  byte bVar4;
  uint uVar5;
  long lVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  byte *pbVar12;
  ulong uVar13;
  byte local_70 [48];
  
  if ((param_3 < 0x30) || (param_5 < 0x3b)) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x138,"ossl_rsa_padding_check_PKCS1_type_2_TLS");
    uVar3 = 0x9f;
LAB_00ad62d4:
    ERR_set_error(4,uVar3,0);
    return 0xffffffff;
  }
  iVar2 = RAND_priv_bytes_ex(param_1,local_70,0x30,0);
  if (iVar2 < 1) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x142,"ossl_rsa_padding_check_PKCS1_type_2_TLS");
    uVar3 = 0xc0103;
    goto LAB_00ad62d4;
  }
  uVar9 = param_5 - 0x33;
  uVar5 = (int)((param_4[1] ^ 2) - 1 & *param_4 - 1) >> 0x1f;
  if (uVar9 < 2) {
    uVar7 = 2;
    uVar8 = 2;
  }
  else {
    uVar7 = 2;
    uVar10 = (uint)(param_5 - 0x34);
    uVar8 = 2;
    if (((uVar10 < 0xfffffffe) && (param_5 - 0x34 >> 0x20 == 0)) && (uVar10 < 0xfffffffd)) {
      uVar11 = uVar9 & 0xfffffffffffffffe;
      uVar10 = 0xffffffff;
      uVar7 = uVar11 + 2;
      uVar8 = (int)uVar11 + 2;
      pbVar12 = param_4 + 3;
      uVar13 = uVar11;
      do {
        uVar13 = uVar13 - 2;
        uVar5 = uVar5 & ((int)(pbVar12[-1] - 1) >> 0x1f ^ 0xffffffffU);
        uVar10 = uVar10 & ((int)(*pbVar12 - 1) >> 0x1f ^ 0xffffffffU);
        pbVar12 = pbVar12 + 2;
      } while (uVar13 != 0);
      uVar5 = uVar10 & uVar5;
      bVar4 = (byte)uVar5;
      if (uVar9 == uVar11) goto LAB_00ad6384;
    }
  }
  do {
    uVar8 = uVar8 + 1;
    pbVar12 = param_4 + uVar7;
    uVar7 = (ulong)uVar8;
    uVar5 = uVar5 & ((int)(*pbVar12 - 1) >> 0x1f ^ 0xffffffffU);
    bVar4 = (byte)uVar5;
  } while (uVar7 < param_5 - 0x31);
LAB_00ad6384:
  bVar1 = (byte)((param_6 & 0xff ^ (uint)param_4[param_5 - 0x2f]) - 1 >> 0x18) &
          (byte)((param_6 >> 8 & 0xff ^ (uint)param_4[param_5 - 0x30]) - 1 >> 0x18);
  if (0 < (int)param_7) {
    bVar1 = bVar1 | (byte)((param_7 & 0xff ^ (uint)param_4[param_5 - 0x2f]) - 1 >> 0x18) &
                    (byte)((param_7 >> 8 & 0xff ^ (uint)param_4[param_5 - 0x30]) - 1 >> 0x18);
  }
  bVar4 = bVar4 & (byte)((int)(param_4[param_5 - 0x31] - 1) >> 0x1f) & (char)bVar1 >> 7;
  lVar6 = 0;
  do {
    *(byte *)(param_2 + lVar6) =
         ~bVar4 & local_70[lVar6] | bVar4 & param_4[lVar6 + (param_5 - 0x30)];
    lVar6 = lVar6 + 1;
  } while (lVar6 != 0x30);
  return 0x30;
}

