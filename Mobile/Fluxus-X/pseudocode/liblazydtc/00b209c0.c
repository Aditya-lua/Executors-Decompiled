/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b209c0
 */

undefined8
ossl_prov_macctx_load_from_params
          (long *param_1,undefined8 param_2,long param_3,undefined8 param_4,undefined8 param_5,
          undefined8 param_6)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  
  if (param_3 == 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002d42ff);
    if (lVar2 == 0) {
      param_3 = 0;
    }
    else {
      if (*(int *)(lVar2 + 8) != 4) {
        return 0;
      }
      param_3 = *(long *)(lVar2 + 0x10);
    }
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"properties");
  if (lVar2 == 0) {
    uVar4 = 0;
  }
  else {
    if (*(int *)(lVar2 + 8) != 4) {
      return 0;
    }
    uVar4 = *(undefined8 *)(lVar2 + 0x10);
  }
  if (param_3 == 0) {
    lVar2 = *param_1;
    if (lVar2 == 0) {
      return 1;
    }
  }
  else {
    lVar2 = EVP_MAC_fetch(param_6,param_3,uVar4);
    EVP_MAC_CTX_free(*param_1);
    if (lVar2 == 0) {
      lVar3 = 0;
    }
    else {
      lVar3 = EVP_MAC_CTX_new(lVar2);
    }
    *param_1 = lVar3;
    EVP_MAC_free(lVar2);
    lVar2 = *param_1;
    if (lVar2 == 0) {
      return 0;
    }
  }
  iVar1 = ossl_prov_set_macctx(lVar2,param_2,param_4,param_5,0,uVar4,0,0);
  if (iVar1 == 0) {
    EVP_MAC_CTX_free(*param_1);
    *param_1 = 0;
    return 0;
  }
  return 1;
}

