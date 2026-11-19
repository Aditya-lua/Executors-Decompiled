/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4a570
 */

void FUN_00b4a570(undefined8 *param_1)

{
  undefined8 uVar1;
  
  uVar1 = *param_1;
  ossl_prov_digest_reset(param_1 + 1);
  CRYPTO_clear_free(param_1[4],param_1[5],"providers/implementations/kdfs/x942kdf.c",0x160);
  CRYPTO_clear_free(param_1[6],param_1[7],"providers/implementations/kdfs/x942kdf.c",0x161);
  CRYPTO_clear_free(param_1[8],param_1[0xc],"providers/implementations/kdfs/x942kdf.c",0x162);
  CRYPTO_clear_free(param_1[9],param_1[0xd],"providers/implementations/kdfs/x942kdf.c",0x163);
  CRYPTO_clear_free(param_1[10],param_1[0xe],"providers/implementations/kdfs/x942kdf.c",0x164);
  CRYPTO_clear_free(param_1[0xb],param_1[0xf],"providers/implementations/kdfs/x942kdf.c",0x165);
  memset(param_1 + 1,0,0x98);
  *param_1 = uVar1;
  *(undefined4 *)(param_1 + 0x13) = 1;
  return;
}

