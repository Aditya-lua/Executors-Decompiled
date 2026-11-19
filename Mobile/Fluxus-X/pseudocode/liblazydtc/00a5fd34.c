/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fd34
 */

undefined4 EVP_PKEY_CTX_get_group_name(int *param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  undefined4 uVar2;
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
  
  memset(&local_80,0,0x50);
  if ((param_1 == (int *)0x0) || ((*param_1 != 2 && (*param_1 != 4)))) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_lib.c",0x478,"EVP_PKEY_CTX_get_group_name");
    ERR_set_error(6,0x93,0);
    uVar2 = 0xfffffffe;
  }
  else {
    uVar2 = 0xffffffff;
    if (param_2 != 0) {
      OSSL_PARAM_construct_utf8_string(&local_a8,"group",param_2,param_3);
      local_60 = local_88;
      uStack_78 = uStack_a0;
      local_80 = local_a8;
      uStack_68 = uStack_90;
      uStack_70 = local_98;
      iVar1 = EVP_PKEY_CTX_get_params(param_1,&local_80);
      uVar2 = 1;
      if (iVar1 == 0) {
        uVar2 = 0xffffffff;
      }
    }
  }
  return uVar2;
}

