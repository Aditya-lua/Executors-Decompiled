/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad934
 */

void OBJ_NAME_cleanup(int type)

{
  undefined8 uVar1;
  
  if (DAT_00d22178 != 0) {
    DAT_00d22180 = type;
    uVar1 = OPENSSL_LH_get_down_load(DAT_00d22178);
    OPENSSL_LH_set_down_load(DAT_00d22178,0);
    OPENSSL_LH_doall(DAT_00d22178,&LAB_00aad9e4);
    if (-1 < type) {
      OPENSSL_LH_set_down_load(DAT_00d22178,uVar1);
      return;
    }
    OPENSSL_LH_free(DAT_00d22178);
    OPENSSL_sk_pop_free(DAT_00d22170,&LAB_00aada10);
    CRYPTO_THREAD_lock_free(DAT_00d22168);
    DAT_00d22178 = 0;
    DAT_00d22170 = 0;
    DAT_00d22168 = 0;
  }
  return;
}

