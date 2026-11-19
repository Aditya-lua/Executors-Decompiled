/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7f78
 */

long RAND_get0_primary(undefined8 param_1)

{
  char *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  
  puVar3 = (undefined8 *)ossl_lib_ctx_get_data(param_1,5,&DAT_00c7ca38);
  if ((puVar3 == (undefined8 *)0x0) || (iVar2 = CRYPTO_THREAD_read_lock(*puVar3), iVar2 == 0)) {
    return 0;
  }
  lVar5 = puVar3[2];
  CRYPTO_THREAD_unlock(*puVar3);
  if (lVar5 != 0) {
    return lVar5;
  }
  iVar2 = CRYPTO_THREAD_write_lock(*puVar3);
  if (iVar2 == 0) {
    return 0;
  }
  lVar5 = puVar3[2];
  if (lVar5 != 0) goto LAB_00ac7fd4;
  lVar5 = puVar3[1];
  if (lVar5 == 0) {
    ERR_set_mark();
    lVar5 = ossl_lib_ctx_get_data(param_1,5,&DAT_00c7ca38);
    if (lVar5 == 0) {
LAB_00ac80dc:
      lVar4 = 0;
    }
    else {
      pcVar1 = "SEED-SRC";
      if (*(char **)(lVar5 + 0x40) != (char *)0x0) {
        pcVar1 = *(char **)(lVar5 + 0x40);
      }
      lVar5 = EVP_RAND_fetch(param_1,pcVar1,*(undefined8 *)(lVar5 + 0x48));
      if (lVar5 == 0) {
        ERR_new();
        ERR_set_debug("crypto/rand/rand_lib.c",0x220,"rand_new_seed");
        ERR_set_error(0x24,0x90,0);
        goto LAB_00ac80dc;
      }
      lVar4 = EVP_RAND_CTX_new(lVar5,0);
      EVP_RAND_free(lVar5);
      if (lVar4 == 0) {
        ERR_new();
        ERR_set_debug("crypto/rand/rand_lib.c",0x226,"rand_new_seed");
        ERR_set_error(0x24,0x8f,0);
      }
      else {
        iVar2 = EVP_RAND_instantiate(lVar4,0,0,0,0,0);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/rand/rand_lib.c",0x22a,"rand_new_seed");
          ERR_set_error(0x24,0x6c,0);
          EVP_RAND_CTX_free(lVar4);
          goto LAB_00ac80dc;
        }
      }
    }
    puVar3[1] = lVar4;
    ERR_pop_to_mark();
    lVar5 = puVar3[1];
  }
  lVar5 = FUN_00ac871c(param_1,lVar5,0x100,0xe10);
  puVar3[2] = lVar5;
  if ((lVar5 != 0) && (iVar2 = EVP_RAND_enable_locking(lVar5), iVar2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/rand/rand_lib.c",0x295,"RAND_get0_primary");
    ERR_set_error(6,0xd4,0);
    EVP_RAND_CTX_free(lVar5);
    lVar5 = 0;
    puVar3[2] = 0;
  }
LAB_00ac7fd4:
  CRYPTO_THREAD_unlock(*puVar3);
  return lVar5;
}

