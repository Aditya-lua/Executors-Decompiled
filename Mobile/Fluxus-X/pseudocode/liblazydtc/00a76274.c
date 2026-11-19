/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76274
 */

undefined8 EVP_PKEY_CTX_get_signature_md(int *param_1,long *param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined1 auStack_d0 [80];
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  
  memset(auStack_d0,0,0x50);
  if (param_1 != (int *)0x0) {
    iVar1 = *param_1;
    if ((((iVar1 - 0x10U < 0x31) &&
         ((1L << ((ulong)(iVar1 - 0x10U) & 0x3f) & 0x1000000010001U) != 0)) || (iVar1 == 0x80)) ||
       (iVar1 == 0x100)) {
      if (*(long *)(param_1 + 0xc) == 0) {
        iVar1 = ERR_set_mark();
        ERR_new(iVar1);
        ERR_set_debug("crypto/evp/pmeth_lib.c",0x5f6,"evp_pkey_ctx_store_cached_data");
        ERR_set_error(6,0x93,0);
        ERR_pop_to_mark();
        uVar2 = FUN_00a77554(param_1,0xffffffff,0x1f0,0xd,0,param_2);
        return uVar2;
      }
      OSSL_PARAM_construct_utf8_string(&local_f8,"digest",auStack_d0,0x50);
      local_60 = local_d8;
      uStack_68 = uStack_e0;
      local_70 = local_e8;
      uStack_78 = uStack_f0;
      local_80 = local_f8;
      OSSL_PARAM_construct_end(&local_f8);
      local_38 = local_d8;
      uStack_40 = uStack_e0;
      local_48 = local_e8;
      uStack_50 = uStack_f0;
      local_58 = local_f8;
      uVar2 = EVP_PKEY_CTX_get_params(param_1,&local_80);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      lVar3 = evp_get_digestbyname_ex(*(undefined8 *)(param_1 + 2),auStack_d0);
      if (lVar3 == 0) {
        return 0;
      }
      *param_2 = lVar3;
      return 1;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/evp/pmeth_lib.c",0x39b,"EVP_PKEY_CTX_get_signature_md");
  ERR_set_error(6,0x93,0);
  return 0xfffffffe;
}

