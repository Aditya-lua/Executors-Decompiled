/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b473e0
 */

void FUN_00b473e0(undefined8 *param_1)

{
  undefined8 uVar1;
  
  uVar1 = *param_1;
  ossl_prov_digest_reset(param_1 + 1);
  CRYPTO_free((void *)param_1[6]);
  CRYPTO_clear_free(param_1[4],param_1[5],"providers/implementations/kdfs/pkcs12kdf.c",0x9e);
  memset(param_1 + 1,0,0x48);
  *param_1 = uVar1;
  return;
}

