/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b48a50
 */

void FUN_00b48a50(undefined8 *param_1)

{
  undefined8 uVar1;
  
  uVar1 = *param_1;
  ossl_prov_digest_reset(param_1 + 1);
  CRYPTO_clear_free(param_1[4],param_1[5],"providers/implementations/kdfs/sshkdf.c",0x53);
  CRYPTO_clear_free(param_1[6],param_1[7],"providers/implementations/kdfs/sshkdf.c",0x54);
  CRYPTO_clear_free(param_1[9],param_1[10],"providers/implementations/kdfs/sshkdf.c",0x55);
  memset(param_1 + 1,0,0x50);
  *param_1 = uVar1;
  return;
}

