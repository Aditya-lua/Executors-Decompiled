/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa0f78
 */

undefined8 ossl_pw_set_ui_method(int *param_1,long param_2,undefined8 param_3)

{
  int *piVar1;
  undefined8 uVar2;
  
  if ((param_1 == (int *)0x0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/passphrase.c",0x56,"ossl_pw_set_ui_method");
    ERR_set_error(0xf,0xc0102,0);
    uVar2 = 0;
  }
  else {
    if (*param_1 == 1) {
      CRYPTO_clear_free(*(undefined8 *)(param_1 + 2),*(undefined8 *)(param_1 + 4),
                        "crypto/passphrase.c",0x15);
    }
    CRYPTO_clear_free(*(undefined8 *)(param_1 + 8),*(undefined8 *)(param_1 + 10),
                      "crypto/passphrase.c",0x1d);
    uVar2 = 1;
    param_1[0] = 0;
    param_1[1] = 0;
    *(long *)(param_1 + 2) = param_2;
    piVar1 = param_1 + 4;
    param_1[6] = 0;
    param_1[7] = 0;
    piVar1[0] = 0;
    piVar1[1] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[8] = 0;
    param_1[9] = 0;
    *param_1 = 4;
    *(undefined8 *)piVar1 = param_3;
  }
  return uVar2;
}

