/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8570
 */

undefined8 SSL_CTX_enable_ct(long param_1,int param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 *puVar3;
  
  if (param_2 == 0) {
    iVar1 = SSL_CTX_has_client_custom_ext(param_1,0x12);
    if (iVar1 == 0) {
      puVar3 = &LAB_009b8630;
LAB_009b861c:
      *(undefined1 **)(param_1 + 0x1d0) = puVar3;
      *(undefined8 *)(param_1 + 0x1d8) = 0;
      return 1;
    }
  }
  else {
    if (param_2 != 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x14cf,"SSL_CTX_enable_ct");
      uVar2 = 0xd4;
      goto LAB_009b8604;
    }
    iVar1 = SSL_CTX_has_client_custom_ext(param_1,0x12);
    if (iVar1 == 0) {
      puVar3 = &LAB_009b8638;
      goto LAB_009b861c;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x1455,"SSL_CTX_set_ct_validation_callback");
  uVar2 = 0xce;
LAB_009b8604:
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

