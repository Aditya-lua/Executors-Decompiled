/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a24044
 */

undefined8 FUN_00a24044(BIO *param_1,EC_KEY *param_2,int param_3,int param_4)

{
  char *pcVar1;
  char *param2;
  bool bVar2;
  point_conversion_form_t pVar3;
  int iVar4;
  EC_GROUP *x;
  EC_POINT *pEVar5;
  BIGNUM *pBVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  void *local_58;
  undefined8 local_48;
  
  local_48 = 0;
  local_58 = (void *)0x0;
  if ((param_2 == (EC_KEY *)0x0) || (x = EC_KEY_get0_group(param_2), x == (EC_GROUP *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_ameth.c",0x124,"do_EC_KEY_print");
    ERR_set_error(0x10,0xc0102,0);
    return 0;
  }
  if (param_4 == 2) {
    bVar2 = false;
    lVar9 = 0;
    lVar8 = 0;
LAB_00a24150:
    iVar4 = BIO_indent(param_1,param_3,0x80);
    if (iVar4 != 0) {
      pcVar1 = "Public-Key";
      if (param_4 != 1) {
        pcVar1 = "ECDSA-Parameters";
      }
      param2 = "Private-Key";
      if (!bVar2) {
        param2 = pcVar1;
      }
      iVar4 = EC_GROUP_order_bits(x);
      iVar4 = BIO_printf(param_1,"%s: (%d bit)\n",param2,iVar4);
      if ((((0 < iVar4) &&
           ((lVar8 == 0 ||
            ((iVar4 = BIO_printf(param_1,"%*spriv:\n",param_3,""), 0 < iVar4 &&
             (iVar4 = ASN1_buf_print(param_1,local_48,lVar8,param_3 + 4), iVar4 != 0)))))) &&
          ((lVar9 == 0 ||
           ((iVar4 = BIO_printf(param_1,"%*spub:\n",param_3,""), 0 < iVar4 &&
            (iVar4 = ASN1_buf_print(param_1,local_58,lVar9,param_3 + 4), iVar4 != 0)))))) &&
         (iVar4 = ECPKParameters_print(param_1,x,param_3), iVar4 != 0)) {
        uVar7 = 1;
        goto LAB_00a24284;
      }
    }
  }
  else {
    pEVar5 = EC_KEY_get0_public_key(param_2);
    if (pEVar5 == (EC_POINT *)0x0) {
      lVar9 = 0;
LAB_00a24114:
      if (param_4 == 0) {
        pBVar6 = EC_KEY_get0_private_key(param_2);
        if (pBVar6 == (BIGNUM *)0x0) {
          lVar8 = 0;
        }
        else {
          lVar8 = EC_KEY_priv2buf(param_2,&local_48);
          if (lVar8 == 0) goto LAB_00a24250;
        }
        bVar2 = true;
      }
      else {
        bVar2 = false;
        lVar8 = 0;
      }
      goto LAB_00a24150;
    }
    pVar3 = EC_KEY_get_conv_form(param_2);
    lVar9 = EC_KEY_key2buf(param_2,pVar3,&local_58,0);
    if (lVar9 != 0) goto LAB_00a24114;
    lVar8 = 0;
  }
LAB_00a24250:
  ERR_new();
  ERR_set_debug("crypto/ec/ec_ameth.c",0x154,"do_EC_KEY_print");
  ERR_set_error(0x10,0x80010,0);
  uVar7 = 0;
LAB_00a24284:
  CRYPTO_clear_free(local_48,lVar8,"crypto/ec/ec_ameth.c",0x155);
  CRYPTO_free(local_58);
  return uVar7;
}

