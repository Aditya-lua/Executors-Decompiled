/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2138
 */

undefined8 SSL_set_ct_validation_callback(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  
  if (param_2 != 0) {
    iVar1 = SSL_CTX_has_client_custom_ext(*(undefined8 *)(param_1 + 0x9a8),0x12);
    if (iVar1 != 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x1439,"SSL_set_ct_validation_callback");
      ERR_set_error(0x14,0xce,0);
      return 0;
    }
    lVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x80))(param_1,0x41,1,0);
    if (lVar2 == 0) {
      return 0;
    }
  }
  *(long *)(param_1 + 0xb68) = param_2;
  *(undefined8 *)(param_1 + 0xb70) = param_3;
  return 1;
}

