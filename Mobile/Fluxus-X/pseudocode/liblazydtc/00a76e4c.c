/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76e4c
 */

void EVP_PKEY_CTX_set_mac_key(long param_1,undefined8 param_2,undefined4 param_3)

{
  FUN_00a766c4(param_1,*(long *)(param_1 + 0x28) == 0,&DAT_002a3e83,4,6,param_2,param_3);
  return;
}

