/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5a994
 */

void FUN_00b5a994(long param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0xf8);
  OPENSSL_cleanse((void *)(lVar1 + 0x28),0x40);
  OPENSSL_cleanse((void *)(lVar1 + 0x68),0x40);
  ossl_prov_drbg_uninstantiate(param_1);
  return;
}

