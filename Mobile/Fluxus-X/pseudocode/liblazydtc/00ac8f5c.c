/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac8f5c
 */

undefined8 RAND_set_seed_source_type(undefined8 param_1,char *param_2,char *param_3)

{
  long lVar1;
  char *pcVar2;
  undefined8 uVar3;
  
  lVar1 = ossl_lib_ctx_get_data(param_1,5,&DAT_00c7ca38);
  if (lVar1 != 0) {
    if (*(long *)(lVar1 + 0x10) == 0) {
      pcVar2 = (char *)0x0;
      if ((param_2 == (char *)0x0) ||
         (pcVar2 = CRYPTO_strdup(param_2,"crypto/rand/rand_lib.c",0x2e6), pcVar2 != (char *)0x0)) {
        CRYPTO_free(*(void **)(lVar1 + 0x40));
        *(char **)(lVar1 + 0x40) = pcVar2;
        pcVar2 = (char *)0x0;
        if ((param_3 == (char *)0x0) ||
           (pcVar2 = CRYPTO_strdup(param_3,"crypto/rand/rand_lib.c",0x2e6), pcVar2 != (char *)0x0))
        {
          CRYPTO_free(*(void **)(lVar1 + 0x48));
          *(char **)(lVar1 + 0x48) = pcVar2;
          return 1;
        }
      }
      ERR_new();
      ERR_set_debug("crypto/rand/rand_lib.c",0x2e8,"random_set_string");
      uVar3 = 0xc0100;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/rand/rand_lib.c",0x34b,"RAND_set_seed_source_type");
      uVar3 = 0x67;
    }
    ERR_set_error(0xf,uVar3,0);
  }
  return 0;
}

