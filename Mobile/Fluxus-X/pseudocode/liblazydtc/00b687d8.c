/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b687d8
 */

undefined8 ossl_cipher_hw_chunked_cfb128(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  undefined4 local_44;
  
  if (param_4 != 0) {
    local_44 = *(undefined4 *)(param_1 + 0xa0);
    uVar2 = param_4;
    if (param_4 >> 0x1e != 0) {
      uVar2 = 0x40000000;
    }
    do {
      CRYPTO_cfb128_encrypt
                (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,&local_44,
                 *(byte *)(param_1 + 0x6c) >> 1 & 1,*(undefined8 *)(param_1 + 0x30));
      param_4 = param_4 - uVar2;
      param_3 = param_3 + uVar2;
      param_2 = param_2 + uVar2;
      uVar1 = param_4;
      if (uVar2 <= param_4) {
        uVar1 = uVar2;
      }
      *(undefined4 *)(param_1 + 0xa0) = local_44;
      uVar2 = uVar1;
    } while (param_4 != 0);
  }
  return 1;
}

