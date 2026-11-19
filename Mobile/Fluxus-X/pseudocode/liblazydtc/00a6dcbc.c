/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dcbc
 */

undefined8 EVP_PKEY_get0_DH(int *param_1)

{
  undefined8 uVar1;
  
  if ((*param_1 == 0x1c) || (*param_1 == 0x398)) {
    uVar1 = evp_pkey_get_legacy();
    return uVar1;
  }
  ERR_new();
  ERR_set_debug("crypto/evp/p_lib.c",0x3b4,"evp_pkey_get0_DH_int");
  ERR_set_error(6,0x80,0);
  return 0;
}

