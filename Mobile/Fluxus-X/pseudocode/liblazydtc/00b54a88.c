/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54a88
 */

undefined8 FUN_00b54a88(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  uint uVar3;
  int local_28;
  int local_24;
  
  uVar1 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 == 0) {
    return 1;
  }
  uVar1 = ossl_prov_digest_load_from_params(param_1 + 2,param_2,uVar1);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"digest-noinit");
  local_28 = 0;
  if (lVar2 == 0) {
    uVar3 = 0;
  }
  else {
    uVar1 = OSSL_PARAM_get_int(lVar2,&local_28);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    uVar3 = 0;
    if (local_28 != 0) {
      uVar3 = 0x100;
    }
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"digest-oneshot");
  local_24 = 0;
  if (lVar2 == 0) {
LAB_00b54b30:
    if (uVar3 == 0) goto LAB_00b54b40;
  }
  else {
    uVar1 = OSSL_PARAM_get_int(lVar2,&local_24);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    if (local_24 == 0) goto LAB_00b54b30;
    uVar3 = uVar3 | 1;
  }
  HMAC_CTX_set_flags((HMAC_CTX *)param_1[1],(long)(int)uVar3);
LAB_00b54b40:
  lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
  if (lVar2 != 0) {
    if (*(int *)(lVar2 + 8) != 5) {
      return 0;
    }
    uVar1 = FUN_00b54bac(param_1,*(undefined8 *)(lVar2 + 0x10),*(undefined8 *)(lVar2 + 0x18));
    if ((int)uVar1 == 0) {
      return uVar1;
    }
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"tls-data-size");
  if ((lVar2 == 0) || (uVar1 = OSSL_PARAM_get_size_t(lVar2,param_1 + 7), (int)uVar1 != 0)) {
    return 1;
  }
  return uVar1;
}

