/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59f5c
 */

undefined8 FUN_00b59f5c(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  
  uVar4 = *(undefined8 *)(param_1 + 0xf8);
  lVar2 = OSSL_PARAM_locate(param_2,"digest");
  if (lVar2 == 0) {
LAB_00b59fb0:
    uVar4 = ossl_drbg_get_ctx_params(param_1,param_2);
    return uVar4;
  }
  lVar3 = ossl_prov_digest_md(uVar4);
  if (lVar3 != 0) {
    uVar4 = EVP_MD_get0_name();
    iVar1 = OSSL_PARAM_set_utf8_string(lVar2,uVar4);
    if (iVar1 != 0) goto LAB_00b59fb0;
  }
  return 0;
}

