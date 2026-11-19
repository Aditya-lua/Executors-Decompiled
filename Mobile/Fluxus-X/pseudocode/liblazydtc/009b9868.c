/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9868
 */

bool SSL_CTX_set0_tmp_dh_pkey(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  
  uVar1 = EVP_PKEY_get_security_bits(param_2);
  iVar2 = ssl_ctx_security(param_1,0x40007,uVar1,0,param_2);
  if (iVar2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x17a7,"SSL_CTX_set0_tmp_dh_pkey");
    ERR_set_error(0x14,0x18a,0);
  }
  else {
    EVP_PKEY_free(*(EVP_PKEY **)(*(long *)(param_1 + 0x158) + 8));
    *(undefined8 *)(*(long *)(param_1 + 0x158) + 8) = param_2;
  }
  return iVar2 != 0;
}

