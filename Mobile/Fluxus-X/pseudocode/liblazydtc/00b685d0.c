/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b685d0
 */

undefined8 ossl_cipher_hw_chunked_cbc(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar5 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar5 + 0x40000000;
    lVar3 = param_3 + lVar2;
    lVar4 = param_2;
    do {
      if (*(code **)(param_1 + 0x38) == (code *)0x0) {
        if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
          CRYPTO_cbc128_decrypt();
        }
        else {
          CRYPTO_cbc128_encrypt
                    (param_3,lVar4,0x40000000,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,
                     *(undefined8 *)(param_1 + 0x30));
        }
      }
      else {
        (**(code **)(param_1 + 0x38))
                  (param_3,lVar4,0x40000000,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,
                   *(byte *)(param_1 + 0x6c) >> 1 & 1);
      }
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      lVar4 = lVar4 + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_2 = param_2 + lVar2;
    param_4 = uVar1 - uVar5;
    param_3 = lVar3;
  }
  if (param_4 != 0) {
    if (*(code **)(param_1 + 0x38) == (code *)0x0) {
      if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
        CRYPTO_cbc128_decrypt();
      }
      else {
        CRYPTO_cbc128_encrypt
                  (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,
                   *(undefined8 *)(param_1 + 0x30));
      }
    }
    else {
      (**(code **)(param_1 + 0x38))
                (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,
                 *(byte *)(param_1 + 0x6c) >> 1 & 1);
    }
  }
  return 1;
}

