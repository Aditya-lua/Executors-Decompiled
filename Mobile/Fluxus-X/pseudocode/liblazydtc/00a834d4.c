/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a834d4
 */

void ossl_crypto_cleanup_all_ex_data_int(void)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)ossl_lib_ctx_get_ex_data_global();
  if (puVar1 != (undefined8 *)0x0) {
    OPENSSL_sk_pop_free(puVar1[1],&LAB_00a8362c);
    puVar1[1] = 0;
    OPENSSL_sk_pop_free(puVar1[2],&LAB_00a8362c);
    puVar1[2] = 0;
    OPENSSL_sk_pop_free(puVar1[3],&LAB_00a8362c);
    puVar1[3] = 0;
    OPENSSL_sk_pop_free(puVar1[4],&LAB_00a8362c);
    puVar1[4] = 0;
    OPENSSL_sk_pop_free(puVar1[5],&LAB_00a8362c);
    puVar1[5] = 0;
    OPENSSL_sk_pop_free(puVar1[6],&LAB_00a8362c);
    puVar1[6] = 0;
    OPENSSL_sk_pop_free(puVar1[7],&LAB_00a8362c);
    puVar1[7] = 0;
    OPENSSL_sk_pop_free(puVar1[8],&LAB_00a8362c);
    puVar1[8] = 0;
    OPENSSL_sk_pop_free(puVar1[9],&LAB_00a8362c);
    puVar1[9] = 0;
    OPENSSL_sk_pop_free(puVar1[10],&LAB_00a8362c);
    puVar1[10] = 0;
    OPENSSL_sk_pop_free(puVar1[0xb],&LAB_00a8362c);
    puVar1[0xb] = 0;
    OPENSSL_sk_pop_free(puVar1[0xc],&LAB_00a8362c);
    puVar1[0xc] = 0;
    OPENSSL_sk_pop_free(puVar1[0xd],&LAB_00a8362c);
    puVar1[0xd] = 0;
    OPENSSL_sk_pop_free(puVar1[0xe],&LAB_00a8362c);
    puVar1[0xe] = 0;
    OPENSSL_sk_pop_free(puVar1[0xf],&LAB_00a8362c);
    puVar1[0xf] = 0;
    OPENSSL_sk_pop_free(puVar1[0x10],&LAB_00a8362c);
    puVar1[0x10] = 0;
    OPENSSL_sk_pop_free(puVar1[0x11],&LAB_00a8362c);
    puVar1[0x11] = 0;
    OPENSSL_sk_pop_free(puVar1[0x12],&LAB_00a8362c);
    puVar1[0x12] = 0;
    CRYPTO_THREAD_lock_free(*puVar1);
    *puVar1 = 0;
  }
  return;
}

