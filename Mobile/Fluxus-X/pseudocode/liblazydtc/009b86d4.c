/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b86d4
 */

undefined8 SSL_enable_ct(long param_1,int param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  
  if (param_2 == 0) {
    iVar1 = SSL_CTX_has_client_custom_ext(*(undefined8 *)(param_1 + 0x9a8),0x12);
    if (iVar1 == 0) {
      lVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x80))(param_1,0x41,1,0);
      if (lVar2 == 0) {
        return 0;
      }
      puVar4 = &LAB_009b8630;
LAB_009b87c8:
      *(undefined8 *)(param_1 + 0xb70) = 0;
      *(undefined1 **)(param_1 + 0xb68) = puVar4;
      return 1;
    }
  }
  else {
    if (param_2 != 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x14dc,"SSL_enable_ct");
      uVar3 = 0xd4;
      goto LAB_009b8788;
    }
    iVar1 = SSL_CTX_has_client_custom_ext(*(undefined8 *)(param_1 + 0x9a8),0x12);
    if (iVar1 == 0) {
      lVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x80))(param_1,0x41,1,0);
      if (lVar2 == 0) {
        return 0;
      }
      puVar4 = &LAB_009b8638;
      goto LAB_009b87c8;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x1439,"SSL_set_ct_validation_callback");
  uVar3 = 0xce;
LAB_009b8788:
  ERR_set_error(0x14,uVar3,0);
  return 0;
}

