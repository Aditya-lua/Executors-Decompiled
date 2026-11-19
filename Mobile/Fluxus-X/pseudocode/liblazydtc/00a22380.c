/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22380
 */

DSO * FUN_00a22380(void)

{
  DSO *dso;
  stack_st_void *psVar1;
  DSO_METHOD *pDVar2;
  char *pcVar3;
  DSO_MERGER_FUNC pDVar4;
  undefined1 auVar5 [16];
  
  pcVar3 = (char *)0x11;
  dso = (DSO *)CRYPTO_zalloc(0x50,"crypto/dso/dso_lib.c");
  if (dso == (DSO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x13,"DSO_new_method");
    ERR_set_error(0x25,0xc0100,0);
    return (DSO *)0x0;
  }
  psVar1 = (stack_st_void *)OPENSSL_sk_new_null();
  dso->meth_data = psVar1;
  if (psVar1 == (stack_st_void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x19,"DSO_new_method");
    ERR_set_error(0x25,0xc0100,0);
  }
  else {
    pDVar2 = DSO_METHOD_openssl();
    dso->meth = pDVar2;
    dso->references = 1;
    auVar5 = CRYPTO_THREAD_lock_new();
    dso[1].meth = auVar5._0_8_;
    if (auVar5._0_8_ != (DSO_METHOD *)0x0) {
      pDVar4 = dso->meth->dso_merger;
      if (pDVar4 == (DSO_MERGER_FUNC)0x0) {
        return dso;
      }
      pcVar3 = (*pDVar4)(dso,auVar5._8_8_,pcVar3);
      if ((int)pcVar3 == 0) {
        DSO_free(dso);
        return (DSO *)0x0;
      }
      return dso;
    }
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x21,"DSO_new_method");
    ERR_set_error(0x25,0xc0100,0);
    OPENSSL_sk_free(dso->meth_data);
  }
  CRYPTO_free(dso);
  return (DSO *)0x0;
}

