/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59d28
 */

void FUN_00b59d28(long param_1)

{
  long lVar1;
  
  if ((param_1 != 0) && (lVar1 = *(long *)(param_1 + 0xf8), lVar1 != 0)) {
    EVP_MD_CTX_free(*(undefined8 *)(lVar1 + 0x18));
    ossl_prov_digest_reset(lVar1);
    CRYPTO_secure_clear_free(lVar1,0x178,"providers/implementations/rands/drbg_hash.c",0x1ab);
  }
  ossl_rand_drbg_free(param_1);
  return;
}

