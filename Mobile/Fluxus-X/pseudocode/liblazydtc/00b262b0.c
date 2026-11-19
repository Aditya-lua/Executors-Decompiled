/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b262b0
 */

undefined8 ossl_siv128_aad(ulong *param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  uint uVar5;
  uint uVar4;
  uint uVar7;
  uint uVar6;
  uint uVar8;
  int iVar9;
  long lVar10;
  undefined8 uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  long local_48;
  undefined1 local_40 [16];
  
  local_48 = 0x10;
  uVar14 = *param_1;
  uVar3 = param_1[1];
  uVar1 = (uint)(uVar14 >> 0x20);
  uVar1 = uVar1 >> 8 | uVar1 << 0x18;
  uVar2 = (uint)(uVar3 >> 0x20);
  uVar4 = ((uint)uVar14 & 0xff00ff00) >> 8 | ((uint)uVar14 & 0xff00ff) << 8;
  uVar5 = uVar4 >> 0x10 | uVar4 << 0x10;
  uVar12 = (ulong)(uVar2 >> 8 | uVar2 << 0x18) & 0xff00ff00;
  uVar6 = ((uint)uVar3 & 0xff00ff00) >> 8 | ((uint)uVar3 & 0xff00ff) << 8;
  uVar7 = uVar6 >> 0x10 | uVar6 << 0x10;
  uVar13 = (ulong)uVar7 << 0x20;
  uVar8 = ((uint)(uVar14 >> 0x18) & 0xff0000 | (uint)(byte)(uVar14 >> 0x38) | uVar1 & 0x7f00ff00) <<
          1;
  uVar2 = -((uVar4 & 0xffff) >> 0xf) & 0x87 ^
          ((uint)(uVar3 >> 0x18) & 0xff0000 | (uint)(byte)(uVar3 >> 0x38) | (uint)uVar12) << 1;
  uVar8 = (uVar8 & 0xff00ff00) >> 8 | ((uVar6 & 0xffff) >> 0xf | uVar8 & 0xff00ff) << 8;
  uVar2 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
  *param_1 = (ulong)(uVar5 >> 7) & 0xff00 | (ulong)((uVar4 & 0xffff) >> 7) & 0xff |
             ((ulong)uVar5 & 0x7f80) << 9 | CONCAT44(uVar5,uVar1) >> 7 & 0xff000000 |
             (ulong)(uVar8 >> 0x10 | uVar8 << 0x10) << 0x20;
  param_1[1] = (ulong)(uVar7 >> 7) & 0xff00 | (ulong)((uVar6 & 0xffff) >> 7) & 0xff |
               (uVar13 & 0x7f8000000000) >> 0x17 | (uVar12 | uVar13) >> 7 & 0xff000000 |
               (ulong)(uVar2 >> 0x10 | uVar2 << 0x10) << 0x20;
  lVar10 = EVP_MAC_CTX_dup(param_1[6]);
  if ((((lVar10 == 0) || (iVar9 = EVP_MAC_update(lVar10,param_2,param_3), iVar9 == 0)) ||
      (iVar9 = EVP_MAC_final(lVar10,local_40,&local_48,0x10), iVar9 == 0)) || (local_48 != 0x10)) {
    EVP_MAC_CTX_free(lVar10);
    uVar11 = 0;
  }
  else {
    EVP_MAC_CTX_free(lVar10);
    uVar14 = param_1[1];
    uVar13 = *param_1;
    uVar11 = 1;
    param_1[1] = CONCAT17((byte)(uVar14 >> 0x38) ^ local_40[0xf],
                          CONCAT16((byte)(uVar14 >> 0x30) ^ local_40[0xe],
                                   CONCAT15((byte)(uVar14 >> 0x28) ^ local_40[0xd],
                                            CONCAT14((byte)(uVar14 >> 0x20) ^ local_40[0xc],
                                                     CONCAT13((byte)(uVar14 >> 0x18) ^ local_40[0xb]
                                                              ,CONCAT12((byte)(uVar14 >> 0x10) ^
                                                                        local_40[10],
                                                                        CONCAT11((byte)(uVar14 >> 8)
                                                                                 ^ local_40[9],
                                                                                 (byte)uVar14 ^
                                                                                 local_40[8])))))));
    *param_1 = CONCAT17((byte)(uVar13 >> 0x38) ^ local_40[7],
                        CONCAT16((byte)(uVar13 >> 0x30) ^ local_40[6],
                                 CONCAT15((byte)(uVar13 >> 0x28) ^ local_40[5],
                                          CONCAT14((byte)(uVar13 >> 0x20) ^ local_40[4],
                                                   CONCAT13((byte)(uVar13 >> 0x18) ^ local_40[3],
                                                            CONCAT12((byte)(uVar13 >> 0x10) ^
                                                                     local_40[2],
                                                                     CONCAT11((byte)(uVar13 >> 8) ^
                                                                              local_40[1],
                                                                              (byte)uVar13 ^
                                                                              local_40[0])))))));
  }
  return uVar11;
}

