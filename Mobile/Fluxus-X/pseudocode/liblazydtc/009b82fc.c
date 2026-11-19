/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b82fc
 */

undefined8 SSL_CTX_set_ct_validation_callback(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((param_2 == 0) || (iVar1 = SSL_CTX_has_client_custom_ext(param_1,0x12), iVar1 == 0)) {
    uVar2 = 1;
    *(long *)(param_1 + 0x1d0) = param_2;
    *(undefined8 *)(param_1 + 0x1d8) = param_3;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x1455,"SSL_CTX_set_ct_validation_callback");
    ERR_set_error(0x14,0xce,0);
    uVar2 = 0;
  }
  return uVar2;
}

