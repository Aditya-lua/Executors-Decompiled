/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5ab14
 */

undefined8 FUN_00b5ab14(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  
  plVar5 = *(long **)(param_1 + 0xf8);
  lVar2 = OSSL_PARAM_locate(param_2,&DAT_002d42ff);
  if (lVar2 != 0) {
    if (*plVar5 == 0) {
      return 0;
    }
    EVP_MAC_CTX_get0_mac();
    uVar3 = EVP_MAC_get0_name();
    iVar1 = OSSL_PARAM_set_utf8_string(lVar2,uVar3);
    if (iVar1 == 0) {
      return 0;
    }
  }
  lVar2 = OSSL_PARAM_locate(param_2,"digest");
  if (lVar2 == 0) {
LAB_00b5aba0:
    uVar3 = ossl_drbg_get_ctx_params(param_1,param_2);
    return uVar3;
  }
  lVar4 = ossl_prov_digest_md(plVar5 + 1);
  if (lVar4 != 0) {
    uVar3 = EVP_MD_get0_name();
    iVar1 = OSSL_PARAM_set_utf8_string(lVar2,uVar3);
    if (iVar1 != 0) goto LAB_00b5aba0;
  }
  return 0;
}

