/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a768c4
 */

void EVP_PKEY_CTX_set1_hkdf_key(long param_1,undefined8 param_2,undefined4 param_3)

{
  FUN_00a766c4(param_1,*(long *)(param_1 + 0x30) == 0,&DAT_002c567e,0x800,0x1005,param_2,param_3);
  return;
}

