/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6e5ec
 */

undefined8 mbedtls_aes_xts_setkey_enc(long param_1,long param_2,uint param_3)

{
  undefined8 uVar1;
  
  if ((param_3 == 0x200) || (param_3 == 0x100)) {
    uVar1 = mbedtls_aes_setkey_enc(param_1 + 0x120,param_2 + (ulong)(param_3 >> 4),param_3 >> 1);
    if ((int)uVar1 == 0) {
      uVar1 = mbedtls_aes_setkey_enc(param_1,param_2,param_3 >> 1);
      return uVar1;
    }
  }
  else {
    uVar1 = 0xffffffe0;
  }
  return uVar1;
}

