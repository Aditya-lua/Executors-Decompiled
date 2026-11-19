/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e250
 */

uint FUN_00a6e250(int *param_1,BIO *param_2,int param_3,undefined4 param_4,code *param_5,
                 undefined8 param_6)

{
  bool bVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  BIO_METHOD *type;
  BIO *b;
  undefined8 uVar6;
  char *param3;
  
  if (param_3 < 1) {
    bVar1 = false;
    uVar4 = 0;
  }
  else {
    uVar4 = BIO_ctrl(param_2,0x51,0,(void *)0x0);
    lVar5 = BIO_ctrl(param_2,0x50,(long)param_3,(void *)0x0);
    if (lVar5 < 1) {
      type = (BIO_METHOD *)BIO_f_prefix();
      b = BIO_new(type);
      if (b == (BIO *)0x0) {
        return 0;
      }
      param_2 = BIO_push(b,param_2);
      bVar1 = true;
    }
    else {
      bVar1 = false;
    }
    uVar4 = uVar4 & ((long)uVar4 >> 0x3f ^ 0xffffffffffffffffU);
    lVar5 = BIO_ctrl(param_2,0x50,(long)param_3,(void *)0x0);
    if (lVar5 < 1) {
      BIO_ctrl(param_2,0x50,uVar4,(void *)0x0);
      if (bVar1) {
        BIO_pop(param_2);
        BIO_free(param_2);
      }
      return 0;
    }
  }
  uVar6 = OSSL_ENCODER_CTX_new_for_pkey(param_1,param_4,&DAT_002dc0aa,0,0);
  iVar2 = OSSL_ENCODER_CTX_get_num_encoders();
  if (iVar2 == 0) {
    OSSL_ENCODER_CTX_free(uVar6);
  }
  else {
    uVar3 = OSSL_ENCODER_to_bio(uVar6,param_2);
    OSSL_ENCODER_CTX_free(uVar6);
    if (uVar3 != 0xfffffffe) goto LAB_00a6e3f8;
  }
  if (param_5 == (code *)0x0) {
    iVar2 = BIO_indent(param_2,0,0x80);
    if (iVar2 == 0) {
      uVar3 = 0;
    }
    else {
      param3 = OBJ_nid2ln(*param_1);
      iVar2 = BIO_printf(param_2,"%s algorithm \"%s\" unsupported\n","Public Key",param3);
      uVar3 = (uint)(0 < iVar2);
    }
  }
  else {
    uVar3 = (*param_5)(param_2,param_1,0,param_6);
  }
LAB_00a6e3f8:
  BIO_ctrl(param_2,0x50,uVar4,(void *)0x0);
  if (bVar1) {
    BIO_pop(param_2);
    BIO_free(param_2);
  }
  return uVar3;
}

