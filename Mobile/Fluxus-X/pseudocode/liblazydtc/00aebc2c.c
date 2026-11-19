/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aebc2c
 */

long * OSSL_STORE_LOADER_new(long param_1,long param_2)

{
  long *plVar1;
  undefined8 uVar2;
  
  if (param_2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_register.c",0x2a,"OSSL_STORE_LOADER_new");
    uVar2 = 0x6a;
  }
  else {
    plVar1 = (long *)CRYPTO_zalloc(0xd0,"crypto/store/store_register.c",0x2e);
    if (plVar1 != (long *)0x0) {
      *plVar1 = param_2;
      plVar1[1] = param_1;
      return plVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/store/store_register.c",0x2f,"OSSL_STORE_LOADER_new");
    uVar2 = 0xc0100;
  }
  ERR_set_error(0x2c,uVar2,0);
  return (long *)0x0;
}

