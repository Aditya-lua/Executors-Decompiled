/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fc6c
 */

undefined8 EVP_PKEY_CTX_set_group_name(int *param_1,long param_2)

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
  
  memset(&local_70,0,0x50);
  if ((param_1 == (int *)0x0) || ((*param_1 != 2 && (*param_1 != 4)))) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_lib.c",0x464,"EVP_PKEY_CTX_set_group_name");
    ERR_set_error(6,0x93,0);
    uVar1 = 0xfffffffe;
  }
  else if (param_2 == 0) {
    uVar1 = 0xffffffff;
  }
  else {
    OSSL_PARAM_construct_utf8_string(&local_98,"group",param_2,0);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    uVar1 = EVP_PKEY_CTX_set_params(param_1,&local_70);
  }
  return uVar1;
}

