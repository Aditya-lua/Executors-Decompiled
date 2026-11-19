/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f25b4
 */

long FUN_009f25b4(int param_1,long *param_2,undefined8 *param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  long local_68;
  undefined8 uStack_58;
  
  local_68 = 0;
  uStack_58 = param_4;
  if (param_1 == 0) {
    lVar2 = 0;
    uVar6 = *param_3;
    if (param_2 == (long *)0x0) goto LAB_009f2654;
LAB_009f2600:
    lVar5 = *param_2;
    plVar4 = &local_68;
    if (lVar5 != 0) {
      plVar4 = param_2;
    }
    lVar3 = OSSL_DECODER_CTX_new_for_pkey
                      (plVar4,&DAT_002b7291,"type-specific",lVar2,0x87,param_5,param_6);
    *param_2 = lVar5;
    if (lVar3 == 0) goto LAB_009f26a8;
LAB_009f2688:
    iVar1 = OSSL_DECODER_from_data(lVar3,param_3,&uStack_58);
    OSSL_DECODER_CTX_free(lVar3);
    if (iVar1 == 0) goto LAB_009f26a8;
  }
  else {
    lVar2 = evp_pkey_type2name();
    if (lVar2 == 0) {
      return 0;
    }
    uVar6 = *param_3;
    if (param_2 != (long *)0x0) goto LAB_009f2600;
LAB_009f2654:
    plVar4 = &local_68;
    lVar3 = OSSL_DECODER_CTX_new_for_pkey
                      (&local_68,&DAT_002b7291,"type-specific",lVar2,0x87,param_5,param_6);
    if (lVar3 != 0) goto LAB_009f2688;
LAB_009f26a8:
    uVar6 = *param_3;
    if (param_2 == (long *)0x0) {
      lVar3 = OSSL_DECODER_CTX_new_for_pkey
                        (plVar4,&DAT_002b7291,"PrivateKeyInfo",lVar2,0x87,param_5,param_6);
    }
    else {
      lVar5 = *param_2;
      if (lVar5 != 0) {
        plVar4 = param_2;
      }
      lVar3 = OSSL_DECODER_CTX_new_for_pkey
                        (plVar4,&DAT_002b7291,"PrivateKeyInfo",lVar2,0x87,param_5,param_6);
      *param_2 = lVar5;
    }
    if (lVar3 != 0) {
      iVar1 = OSSL_DECODER_from_data(lVar3,param_3,&uStack_58);
      OSSL_DECODER_CTX_free(lVar3);
      if (iVar1 != 0) goto LAB_009f27d8;
    }
    uVar6 = *param_3;
    if (param_2 == (long *)0x0) {
      lVar2 = OSSL_DECODER_CTX_new_for_pkey(plVar4,&DAT_002b7291,0,lVar2,0x87,param_5,param_6);
    }
    else {
      lVar3 = *param_2;
      if (lVar3 != 0) {
        plVar4 = param_2;
      }
      lVar2 = OSSL_DECODER_CTX_new_for_pkey(plVar4,&DAT_002b7291,0,lVar2,0x87,param_5,param_6);
      *param_2 = lVar3;
    }
    if (lVar2 == 0) goto LAB_009f2804;
    iVar1 = OSSL_DECODER_from_data(lVar2,param_3,&uStack_58);
    OSSL_DECODER_CTX_free(lVar2);
    if (iVar1 == 0) goto LAB_009f2804;
  }
LAB_009f27d8:
  if ((*plVar4 != 0) && (iVar1 = evp_keymgmt_util_has(*plVar4,1), iVar1 != 0)) {
    if (param_2 != (long *)0x0) {
      *param_2 = *plVar4;
    }
    return *plVar4;
  }
  *param_3 = uVar6;
LAB_009f2804:
  if (plVar4 != param_2) {
    EVP_PKEY_free((EVP_PKEY *)*plVar4);
  }
  return 0;
}

