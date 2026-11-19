/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa0cb4
 */

undefined8 ossl_pw_set_passphrase(int *param_1,long param_2,long param_3)

{
  undefined4 uVar1;
  void *pvVar2;
  
  if ((param_1 == (int *)0x0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/passphrase.c",0x26,"ossl_pw_set_passphrase");
    uVar1 = 0xc0102;
  }
  else {
    if (*param_1 == 1) {
      CRYPTO_clear_free(*(undefined8 *)(param_1 + 2),*(undefined8 *)(param_1 + 4),
                        "crypto/passphrase.c",0x15);
    }
    CRYPTO_clear_free(*(undefined8 *)(param_1 + 8),*(undefined8 *)(param_1 + 10),
                      "crypto/passphrase.c",0x1d);
    param_1[6] = 0;
    param_1[7] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[2] = 0;
    param_1[3] = 0;
    param_1[0] = 0;
    param_1[1] = 0;
    *param_1 = 1;
    if (param_3 == 0) {
      pvVar2 = CRYPTO_malloc(1,"crypto/passphrase.c",0x2d);
      *(void **)(param_1 + 2) = pvVar2;
    }
    else {
      pvVar2 = (void *)CRYPTO_memdup(param_2,param_3,"crypto/passphrase.c",0x2c);
      *(void **)(param_1 + 2) = pvVar2;
    }
    if (pvVar2 != (void *)0x0) {
      *(long *)(param_1 + 4) = param_3;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/passphrase.c",0x2f,"ossl_pw_set_passphrase");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0xf,uVar1,0);
  return 0;
}

