/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad29dc
 */

undefined8 EVP_PKEY_CTX_set0_rsa_oaep_label(int *param_1,undefined1 *param_2,int param_3)

{
  undefined1 *puVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  
  if ((param_1 == (int *)0x0) || ((*param_1 != 0x200 && (*param_1 != 0x400)))) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x454,"EVP_PKEY_CTX_set0_rsa_oaep_label");
    ERR_set_error(6,0x93,0);
    uVar3 = 0xfffffffe;
  }
  else {
    iVar2 = EVP_PKEY_CTX_is_a(param_1,&DAT_002db996);
    if (iVar2 == 0) {
      uVar3 = 0xffffffff;
    }
    else {
      puVar1 = &DAT_002ab32c;
      if (param_3 != 0 || param_2 != (undefined1 *)0x0) {
        puVar1 = param_2;
      }
      OSSL_PARAM_construct_octet_string(&local_a8,"oaep-label",puVar1,(long)param_3);
      local_60 = local_88;
      uStack_78 = uStack_a0;
      local_80 = local_a8;
      uStack_68 = uStack_90;
      uStack_70 = local_98;
      OSSL_PARAM_construct_end(&local_a8);
      local_38 = local_88;
      uStack_40 = uStack_90;
      local_48 = local_98;
      uStack_50 = uStack_a0;
      local_58 = local_a8;
      uVar3 = evp_pkey_ctx_set_params_strict(param_1,&local_80);
      if (0 < (int)uVar3) {
        CRYPTO_free(param_2);
        uVar3 = 1;
      }
    }
  }
  return uVar3;
}

