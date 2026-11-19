/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b564a8
 */

void FUN_00b564a8(long param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0xf8);
  OPENSSL_cleanse((void *)(lVar1 + 0x34),0x20);
  OPENSSL_cleanse((void *)(lVar1 + 0x54),0x10);
  OPENSSL_cleanse((void *)(lVar1 + 100),0x10);
  OPENSSL_cleanse((void *)(lVar1 + 0x80),0x30);
  *(undefined8 *)(lVar1 + 0x78) = 0;
  ossl_prov_drbg_uninstantiate(param_1);
  return;
}

