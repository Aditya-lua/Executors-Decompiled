/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4930
 */

undefined1
SSL_read_early_data(SSL *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  int iVar1;
  undefined8 uVar2;
  _func_3149 *p_Var3;
  
  if (param_1->server == 0) {
    ERR_new();
    uVar2 = 0x78a;
    goto LAB_009b4a88;
  }
  iVar1 = *(int *)((long)&param_1->s3 + 4);
  if (iVar1 != 10) {
    if (iVar1 != 8) {
      if (iVar1 != 0) {
        ERR_new();
        uVar2 = 0x7b6;
LAB_009b4a88:
        ERR_set_debug("ssl/ssl_lib.c",uVar2,"SSL_read_early_data");
        ERR_set_error(0x14,0xc0101,0);
        return false;
      }
      iVar1 = SSL_in_before(param_1);
      if (iVar1 == 0) {
        ERR_new();
        uVar2 = 0x791;
        goto LAB_009b4a88;
      }
    }
    p_Var3 = param_1->handshake_func;
    *(undefined4 *)((long)&param_1->s3 + 4) = 9;
    if (p_Var3 == (_func_3149 *)0x0) {
      param_1->server = 1;
      param_1->shutdown = 0;
      ossl_statem_clear(param_1);
      param_1->handshake_func = (_func_3149 *)param_1->method->ssl_connect;
      FUN_009b1b60(param_1);
    }
    iVar1 = SSL_do_handshake(param_1);
    if (iVar1 < 1) {
      *(undefined4 *)((long)&param_1->s3 + 4) = 8;
      return false;
    }
  }
  if (param_1[4].packet_length == 2) {
    *(undefined4 *)((long)&param_1->s3 + 4) = 0xb;
    iVar1 = ssl_read_internal(param_1,param_2,param_3,param_4);
    if ((0 < iVar1) || (*(int *)((long)&param_1->s3 + 4) != 0xc)) {
      *(undefined4 *)((long)&param_1->s3 + 4) = 10;
      return 0 < iVar1;
    }
  }
  else {
    *(undefined4 *)((long)&param_1->s3 + 4) = 0xc;
  }
  *param_4 = 0;
  return 2;
}

