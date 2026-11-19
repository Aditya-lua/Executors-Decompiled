/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76e78
 */

undefined8 EVP_PKEY_CTX_set_kem_op(int *param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  if ((param_1 == (int *)0x0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x4f3,"EVP_PKEY_CTX_set_kem_op");
    ERR_set_error(6,0xde,0);
    uVar1 = 0;
  }
  else if ((*param_1 == 0x1000) || (*param_1 == 0x2000)) {
    OSSL_PARAM_construct_utf8_string(&local_98,"operation",param_2,0);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    OSSL_PARAM_construct_end(&local_98);
    local_28 = local_78;
    uStack_30 = uStack_80;
    local_38 = local_88;
    uStack_40 = uStack_90;
    local_48 = local_98;
    uVar1 = EVP_PKEY_CTX_set_params(param_1,&local_70);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x4f7,"EVP_PKEY_CTX_set_kem_op");
    ERR_set_error(6,0x93,0);
    uVar1 = 0xfffffffe;
  }
  return uVar1;
}

