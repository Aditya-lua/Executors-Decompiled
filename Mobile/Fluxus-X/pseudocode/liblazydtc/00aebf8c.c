/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aebf8c
 */

undefined8 OSSL_STORE_register_loader(undefined8 *param_1)

{
  int iVar1;
  long lVar2;
  byte bVar3;
  undefined8 uVar4;
  byte *pbVar5;
  
  pbVar5 = (byte *)*param_1;
  iVar1 = ossl_ctype_check(*pbVar5,3);
  bVar3 = *pbVar5;
  if (iVar1 == 0) {
LAB_00aebdf8:
    if (bVar3 != 0) {
      ERR_new();
      ERR_set_debug("crypto/store/store_register.c",0xb5,"ossl_store_register_loader_int");
      ERR_set_error(0x2c,0x6a,"scheme=%s",*param_1);
      return 0;
    }
  }
  else {
    while (bVar3 != 0) {
      iVar1 = ossl_ctype_check(bVar3,3);
      if ((iVar1 == 0) && (iVar1 = ossl_isdigit(*pbVar5), iVar1 == 0)) {
        bVar3 = *pbVar5;
        if ((0x3f < (ulong)bVar3) || ((1L << ((ulong)bVar3 & 0x3f) & 0x680000000001U) == 0))
        goto LAB_00aebdf8;
      }
      pbVar5 = pbVar5 + 1;
      bVar3 = *pbVar5;
    }
  }
  if ((((param_1[2] == 0) || (param_1[7] == 0)) || (param_1[8] == 0)) ||
     ((param_1[9] == 0 || (param_1[10] == 0)))) {
    ERR_new();
    ERR_set_debug("crypto/store/store_register.c",0xbd,"ossl_store_register_loader_int");
    uVar4 = 0x74;
  }
  else {
    iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22308,FUN_00aebf60);
    if ((iVar1 != 0) && (DAT_00d2230c != 0)) {
      iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22310);
      if (iVar1 == 0) {
        return 0;
      }
      if ((DAT_00d22318 == 0) &&
         (DAT_00d22318 = OPENSSL_LH_new(&LAB_00aec2ec,&LAB_00aec2f4), DAT_00d22318 == 0)) {
        uVar4 = 0;
      }
      else {
        lVar2 = OPENSSL_LH_insert(DAT_00d22318,param_1);
        if (lVar2 == 0) {
          iVar1 = OPENSSL_LH_error(DAT_00d22318);
          uVar4 = 0;
          if (iVar1 != 0) goto LAB_00aebf54;
        }
        uVar4 = 1;
      }
LAB_00aebf54:
      CRYPTO_THREAD_unlock(DAT_00d22310);
      return uVar4;
    }
    ERR_new();
    ERR_set_debug("crypto/store/store_register.c",0xc2,"ossl_store_register_loader_int");
    uVar4 = 0xc0100;
  }
  ERR_set_error(0x2c,uVar4,0);
  return 0;
}

