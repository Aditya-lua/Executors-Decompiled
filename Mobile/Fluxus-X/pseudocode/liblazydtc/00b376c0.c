/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b376c0
 */

undefined8 FUN_00b376c0(undefined8 *param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 local_48;
  long local_38;
  
  uVar2 = ossl_prov_ctx_get0_libctx(*param_1);
  lVar3 = OSSL_PARAM_locate_const(param_2,"cipher");
  lVar4 = OSSL_PARAM_locate_const(param_2,"properties");
  lVar5 = OSSL_PARAM_locate_const(param_2,"save-parameters");
  if (lVar3 != 0) {
    local_38 = 0;
    local_48 = 0;
    iVar1 = OSSL_PARAM_get_utf8_string_ptr(lVar3,&local_38);
    if ((iVar1 == 0) ||
       ((lVar4 != 0 && (iVar1 = OSSL_PARAM_get_utf8_string_ptr(lVar4,&local_48), iVar1 == 0)))) {
      return 0;
    }
    EVP_CIPHER_free(param_1[2]);
    param_1[2] = 0;
    *(uint *)((long)param_1 + 0xc) = (uint)(local_38 != 0);
    if (local_38 != 0) {
      lVar3 = EVP_CIPHER_fetch(uVar2,local_38,local_48);
      param_1[2] = lVar3;
      if (lVar3 == 0) {
        return 0;
      }
    }
  }
  if ((lVar5 == 0) || (uVar2 = OSSL_PARAM_get_int(lVar5,param_1 + 1), (int)uVar2 != 0)) {
    uVar2 = 1;
  }
  return uVar2;
}

