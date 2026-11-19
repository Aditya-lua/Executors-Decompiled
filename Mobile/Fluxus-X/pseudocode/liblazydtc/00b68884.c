/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68884
 */

undefined8 ossl_cipher_hw_chunked_ofb128(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  undefined4 local_68;
  undefined4 local_64;
  
  if (param_4 >> 0x1e != 0) {
    local_68 = *(undefined4 *)(param_1 + 0xa0);
    uVar1 = param_4 - 0x40000000;
    uVar4 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar4 + 0x40000000;
    lVar3 = param_3 + lVar2;
    lVar5 = param_2;
    do {
      CRYPTO_ofb128_encrypt
                (param_3,lVar5,0x40000000,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,&local_68,
                 *(undefined8 *)(param_1 + 0x30));
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      lVar5 = lVar5 + 0x40000000;
      *(undefined4 *)(param_1 + 0xa0) = local_68;
    } while (param_4 >> 0x1e != 0);
    param_4 = uVar1 - uVar4;
    param_2 = param_2 + lVar2;
    param_3 = lVar3;
  }
  if (param_4 != 0) {
    local_64 = *(undefined4 *)(param_1 + 0xa0);
    CRYPTO_ofb128_encrypt
              (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,&local_64,
               *(undefined8 *)(param_1 + 0x30));
    *(undefined4 *)(param_1 + 0xa0) = local_64;
  }
  return 1;
}

