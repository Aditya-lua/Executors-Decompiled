/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af3e8c
 */

long FUN_00af3e8c(undefined8 param_1,undefined8 param_2,long param_3,char *param_4,char *param_5)

{
  int iVar1;
  size_t sVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  
  sVar2 = strlen(param_5);
  if ((sVar2 < 9) || (iVar1 = strncmp(param_5,"critical,",9), iVar1 != 0)) {
    uVar4 = 0;
  }
  else {
    param_5 = param_5 + 8;
    do {
      param_5 = param_5 + 1;
      iVar1 = ossl_ctype_check(*param_5,8);
    } while (iVar1 != 0);
    uVar4 = 1;
  }
  sVar2 = strlen(param_5);
  if (3 < sVar2) {
    lVar5 = 4;
    iVar1 = strncmp(param_5,"DER:",4);
    if (iVar1 == 0) {
      uVar3 = 1;
LAB_00af4008:
      param_5 = param_5 + lVar5 + -1;
      do {
        param_5 = param_5 + 1;
        iVar1 = ossl_ctype_check(*param_5,8);
      } while (iVar1 != 0);
      lVar5 = FUN_00af4190(param_4,param_5,uVar4,uVar3,param_2);
      return lVar5;
    }
    if (4 < sVar2) {
      lVar5 = 5;
      iVar1 = strncmp(param_5,"ASN1:",5);
      if (iVar1 == 0) {
        uVar3 = 2;
        goto LAB_00af4008;
      }
    }
  }
  iVar1 = OBJ_sn2nid(param_4);
  lVar5 = FUN_00af4350(param_1,param_2,iVar1,uVar4,param_5);
  if (lVar5 == 0) {
    ERR_new();
    if (param_3 == 0) {
      ERR_set_debug("crypto/x509/v3_conf.c",0x34,"X509V3_EXT_nconf_int");
      ERR_set_error(0x22,0x80,"name=%s, value=%s",param_4,param_5);
    }
    else {
      ERR_set_debug("crypto/x509/v3_conf.c",0x30,"X509V3_EXT_nconf_int");
      ERR_set_error(0x22,0x80,"section=%s, name=%s, value=%s",param_3,param_4,param_5);
    }
    lVar5 = 0;
  }
  return lVar5;
}

