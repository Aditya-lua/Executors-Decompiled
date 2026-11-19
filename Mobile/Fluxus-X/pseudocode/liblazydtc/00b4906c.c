/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4906c
 */

void FUN_00b4906c(undefined8 *param_1)

{
  undefined8 uVar1;
  
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  uVar1 = *param_1;
  EVP_MAC_CTX_free(param_1[1]);
  ossl_prov_digest_reset(param_1 + 2);
  CRYPTO_clear_free(param_1[5],param_1[6],"providers/implementations/kdfs/sskdf.c",0x132);
  CRYPTO_clear_free(param_1[7],param_1[8],"providers/implementations/kdfs/sskdf.c",0x133);
  CRYPTO_clear_free(param_1[9],param_1[10],"providers/implementations/kdfs/sskdf.c",0x134);
  memset(param_1 + 1,0,0x60);
  *param_1 = uVar1;
  CRYPTO_free(param_1);
  return;
}

