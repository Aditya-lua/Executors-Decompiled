/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6841c
 */

undefined8 ossl_cipher_hw_generic_cfb1(long param_1,long param_2,long param_3,ulong param_4)

{
  long lVar1;
  long lVar2;
  char cVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  uint uVar6;
  long lVar7;
  ulong uVar8;
  undefined4 local_64;
  
  local_64 = *(undefined4 *)(param_1 + 0xa0);
  cVar3 = *(char *)(param_1 + 0x6c);
  uVar6 = (uint)cVar3;
  if (cVar3 < 0) {
    uVar5 = *(undefined8 *)(param_1 + 0xb0);
    uVar4 = *(undefined8 *)(param_1 + 0x30);
    uVar6 = (uint)(int)cVar3 >> 1;
  }
  else {
    if (param_4 >> 0x3c != 0) {
      param_4 = param_4 + 0xf000000000000000;
      lVar1 = (param_4 & 0xf000000000000000) + 0x1000000000000000;
      lVar2 = param_2 + lVar1;
      lVar7 = param_3;
      for (uVar8 = param_4;
          CRYPTO_cfb128_1_encrypt
                    (lVar7,param_2,0x8000000000000000,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20
                     ,&local_64,uVar6 >> 1 & 1,*(undefined8 *)(param_1 + 0x30)), uVar8 >> 0x3c != 0;
          uVar8 = uVar8 + 0xf000000000000000) {
        uVar6 = (uint)*(byte *)(param_1 + 0x6c);
        lVar7 = lVar7 + 0x1000000000000000;
        param_2 = param_2 + 0x1000000000000000;
      }
      param_3 = param_3 + lVar1;
      param_4 = param_4 - (param_4 & 0xf000000000000000);
      param_2 = lVar2;
    }
    if (param_4 == 0) goto LAB_00b68534;
    uVar5 = *(undefined8 *)(param_1 + 0xb0);
    uVar4 = *(undefined8 *)(param_1 + 0x30);
    param_4 = param_4 << 3;
    uVar6 = (uint)(*(byte *)(param_1 + 0x6c) >> 1);
  }
  CRYPTO_cfb128_1_encrypt(param_3,param_2,param_4,uVar5,param_1 + 0x20,&local_64,uVar6 & 1,uVar4);
LAB_00b68534:
  *(undefined4 *)(param_1 + 0xa0) = local_64;
  return 1;
}

