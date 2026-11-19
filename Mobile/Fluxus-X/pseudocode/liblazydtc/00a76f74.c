/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76f74
 */

undefined8 evp_pkey_ctx_set1_id_prov(int *param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  long local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  long local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  long local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  
  iVar1 = *param_1;
  if ((((iVar1 - 0x10U < 0x31) && ((1L << ((ulong)(iVar1 - 0x10U) & 0x3f) & 0x1000000010001U) != 0))
      || (iVar1 == 0x80)) || (iVar1 == 0x100)) {
    OSSL_PARAM_construct_octet_string(&local_a8,"distid",param_2,(long)param_3);
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
    if ((*(long *)(param_1 + 8) != 0) &&
       (uVar2 = EVP_PKEY_CTX_settable_params(param_1), local_80 != 0)) {
      plVar4 = &local_58;
      do {
        lVar3 = OSSL_PARAM_locate_const(uVar2);
        if (lVar3 == 0) goto LAB_00a77058;
        lVar3 = *plVar4;
        plVar4 = plVar4 + 5;
      } while (lVar3 != 0);
    }
    uVar2 = EVP_PKEY_CTX_set_params(param_1,&local_80);
    if ((int)uVar2 != -2) {
      return uVar2;
    }
LAB_00a77058:
    ERR_new();
    uVar2 = 0x515;
  }
  else {
    ERR_new();
    uVar2 = 0x506;
  }
  ERR_set_debug("crypto/evp/pmeth_lib.c",uVar2,"evp_pkey_ctx_set1_id_prov");
  ERR_set_error(6,0x93,0);
  return 0xfffffffe;
}

