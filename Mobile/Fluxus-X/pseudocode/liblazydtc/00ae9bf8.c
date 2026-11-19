/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9bf8
 */

ulong OSSL_STORE_find(long *param_1,undefined4 *param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  char *pcVar4;
  uchar *puVar5;
  long lVar6;
  ulong uVar7;
  BIGNUM *a;
  uchar *local_38;
  
  if ((int)param_1[7] != 0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x138,"OSSL_STORE_find");
    uVar3 = 0x75;
    goto LAB_00ae9c38;
  }
  if (param_2 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x13c,"OSSL_STORE_find");
    uVar3 = 0xc0102;
    goto LAB_00ae9c38;
  }
  if (param_1[1] == 0) {
    if (*(code **)(*param_1 + 0x30) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00ae9d28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar7 = (**(code **)(*param_1 + 0x30))(param_1[2],param_2);
      return uVar7;
    }
    ERR_new();
    uVar3 = 0x187;
LAB_00ae9d8c:
    ERR_set_debug("crypto/store/store_lib.c",uVar3,"OSSL_STORE_find");
    uVar3 = 0x76;
LAB_00ae9c38:
    ERR_set_error(0x2c,uVar3,0);
    return 0;
  }
  local_38 = (uchar *)0x0;
  if (*(long *)(param_1[1] + 0xa8) == 0) {
    ERR_new();
    uVar3 = 0x14a;
    goto LAB_00ae9d8c;
  }
  lVar2 = OSSL_PARAM_BLD_new();
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x14f,"OSSL_STORE_find");
    uVar3 = 0xc0100;
    goto LAB_00ae9c38;
  }
  switch(*param_2) {
  case 1:
    iVar1 = i2d_X509_NAME(*(X509_NAME **)(param_2 + 2),&local_38);
    if (0 < iVar1) {
      lVar6 = (long)iVar1;
      pcVar4 = "subject";
      puVar5 = local_38;
LAB_00ae9e30:
      iVar1 = OSSL_PARAM_BLD_push_octet_string(lVar2,pcVar4,puVar5,lVar6);
      goto joined_r0x00ae9e84;
    }
    break;
  case 2:
    iVar1 = i2d_X509_NAME(*(X509_NAME **)(param_2 + 2),&local_38);
    if (iVar1 < 1) break;
    a = ASN1_INTEGER_to_BN(*(ASN1_INTEGER **)(param_2 + 4),(BIGNUM *)0x0);
    if (((a != (BIGNUM *)0x0) &&
        (iVar1 = OSSL_PARAM_BLD_push_octet_string(lVar2,&DAT_002cde11,local_38,(long)iVar1),
        iVar1 != 0)) && (iVar1 = OSSL_PARAM_BLD_push_BN(lVar2,"serial",a), iVar1 != 0))
    goto LAB_00ae9e40;
    goto LAB_00ae9e8c;
  case 3:
    uVar3 = EVP_MD_get0_name(*(undefined8 *)(param_2 + 6));
    iVar1 = OSSL_PARAM_BLD_push_utf8_string(lVar2,"digest",uVar3,0);
    if (iVar1 != 0) {
      lVar6 = *(long *)(param_2 + 10);
      pcVar4 = "fingerprint";
      puVar5 = *(uchar **)(param_2 + 8);
      goto LAB_00ae9e30;
    }
    break;
  case 4:
    iVar1 = OSSL_PARAM_BLD_push_utf8_string
                      (lVar2,"alias",*(undefined8 *)(param_2 + 8),*(undefined8 *)(param_2 + 10));
joined_r0x00ae9e84:
    if (iVar1 != 0) {
      a = (BIGNUM *)0x0;
LAB_00ae9e40:
      uVar3 = OSSL_PARAM_BLD_to_param(lVar2);
      uVar7 = (**(code **)(param_1[1] + 0xa8))(param_1[2],uVar3);
      uVar7 = uVar7 & 0xffffffff;
      OSSL_PARAM_free(uVar3);
      goto LAB_00ae9e90;
    }
  }
  a = (BIGNUM *)0x0;
LAB_00ae9e8c:
  uVar7 = 0;
LAB_00ae9e90:
  OSSL_PARAM_BLD_free(lVar2);
  CRYPTO_free(local_38);
  BN_free(a);
  return uVar7;
}

