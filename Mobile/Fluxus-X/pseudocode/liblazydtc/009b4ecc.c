/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4ecc
 */

uint SSL_write_early_data(SSL *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  _func_3149 *p_Var5;
  undefined1 auStack_38 [8];
  
  uVar4 = *(undefined4 *)((long)&param_1->s3 + 4);
  switch(uVar4) {
  case 0:
    if (((param_1->server != 0) || (iVar2 = SSL_in_before(param_1), iVar2 == 0)) ||
       (((*(long *)&param_1[3].sid_ctx_length == 0 ||
         (*(int *)(*(long *)&param_1[3].sid_ctx_length + 0x354) == 0)) &&
        (param_1[3].ex_data.sk == (stack_st_void *)0x0)))) {
      ERR_new();
      uVar3 = 0x88f;
      goto LAB_009b4f90;
    }
switchD_009b4f0c_caseD_1:
    p_Var5 = param_1->handshake_func;
    *(undefined4 *)((long)&param_1->s3 + 4) = 2;
    if (p_Var5 == (_func_3149 *)0x0) {
      param_1->server = 0;
      param_1->shutdown = 0;
      ossl_statem_clear(param_1);
      param_1->handshake_func = (_func_3149 *)param_1->method->ssl_read;
      FUN_009b1b60(param_1);
    }
    iVar2 = SSL_do_handshake(param_1);
    if (iVar2 < 1) {
      uVar4 = 1;
    }
    else {
switchD_009b4f0c_caseD_3:
      uVar1 = *(uint *)&param_1[3].tlsext_debug_arg;
      *(undefined4 *)((long)&param_1->s3 + 4) = 4;
      *(uint *)&param_1[3].tlsext_debug_arg = uVar1 & 0xfffffffe;
      iVar2 = ssl_write_internal(param_1,param_2,param_3,auStack_38);
      *(uint *)&param_1[3].tlsext_debug_arg = *(uint *)&param_1[3].tlsext_debug_arg | uVar1 & 1;
      if (0 < iVar2) {
        *(undefined4 *)((long)&param_1->s3 + 4) = 5;
switchD_009b4f0c_caseD_5:
        iVar2 = statem_flush(param_1);
        if (iVar2 == 1) {
          *param_4 = param_3;
          *(undefined4 *)((long)&param_1->s3 + 4) = 3;
          return 1;
        }
        return 0;
      }
      uVar4 = 3;
    }
    *(undefined4 *)((long)&param_1->s3 + 4) = uVar4;
    return 0;
  case 1:
    goto switchD_009b4f0c_caseD_1;
  default:
    ERR_new();
    uVar3 = 0x8c5;
LAB_009b4f90:
    ERR_set_debug("ssl/ssl_lib.c",uVar3,"SSL_write_early_data");
    ERR_set_error(0x14,0xc0101,0);
    return 0;
  case 3:
    goto switchD_009b4f0c_caseD_3;
  case 5:
    goto switchD_009b4f0c_caseD_5;
  case 10:
  case 0xc:
    *(undefined4 *)((long)&param_1->s3 + 4) = 6;
    uVar1 = ssl_write_internal(param_1,param_2,param_3,param_4);
    if (0 < (int)uVar1) {
      BIO_ctrl(param_1->wbio,0xb,0,(void *)0x0);
    }
    *(undefined4 *)((long)&param_1->s3 + 4) = uVar4;
    return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  }
}

