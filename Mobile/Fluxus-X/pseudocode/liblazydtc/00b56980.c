/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b56980
 */

undefined8 FUN_00b56980(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0xf8);
  lVar2 = OSSL_PARAM_locate(param_2,"use_derivation_function");
  if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,*(undefined4 *)(lVar4 + 0x30)), iVar1 != 0))
  {
    lVar2 = OSSL_PARAM_locate(param_2,"cipher");
    if (lVar2 == 0) {
LAB_00b569f0:
      uVar3 = ossl_drbg_get_ctx_params(param_1,param_2);
      return uVar3;
    }
    if (*(long *)(lVar4 + 0x20) != 0) {
      uVar3 = EVP_CIPHER_get0_name();
      iVar1 = OSSL_PARAM_set_utf8_string(lVar2,uVar3);
      if (iVar1 != 0) goto LAB_00b569f0;
    }
  }
  return 0;
}

