/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68994
 */

undefined8
ossl_digest_default_get_params
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = OSSL_PARAM_locate(param_1,"blocksize");
  if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_size_t(lVar2,param_2), iVar1 != 0)) {
    lVar2 = OSSL_PARAM_locate(param_1,&DAT_002d7e7d);
    if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_size_t(lVar2,param_3), iVar1 != 0)) {
      lVar2 = OSSL_PARAM_locate(param_1,&DAT_002dbfe7);
      if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_4 & 1), iVar1 != 0)) {
        lVar2 = OSSL_PARAM_locate(param_1,"algid-absent");
        if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_4 >> 1 & 1), iVar1 != 0)) {
          return 1;
        }
        ERR_new();
        uVar3 = 0x26;
      }
      else {
        ERR_new();
        uVar3 = 0x20;
      }
    }
    else {
      ERR_new();
      uVar3 = 0x1a;
    }
  }
  else {
    ERR_new();
    uVar3 = 0x15;
  }
  ERR_set_debug("providers/implementations/digests/digestcommon.c",uVar3,
                "ossl_digest_default_get_params");
  ERR_set_error(0x39,0x68,0);
  return 0;
}

