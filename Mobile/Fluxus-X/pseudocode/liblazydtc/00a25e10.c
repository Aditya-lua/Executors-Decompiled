/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a25e10
 */

int i2d_ECPrivateKey(EC_KEY *key,uchar **out)

{
  undefined4 uVar1;
  int iVar2;
  ASN1_VALUE *val;
  long lVar3;
  long lVar4;
  ASN1_BIT_STRING *pAVar5;
  ASN1_STRING *str;
  undefined8 uVar6;
  uint uVar7;
  void *local_40;
  void *local_38;
  
  local_40 = (void *)0x0;
  local_38 = (void *)0x0;
  if (((key == (EC_KEY *)0x0) || (*(long *)(key + 0x18) == 0)) ||
     ((((byte)key[0x30] >> 1 & 1) == 0 && (*(long *)(key + 0x20) == 0)))) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x407,"i2d_ECPrivateKey");
    ERR_set_error(0x10,0xc0102,0);
    iVar2 = 0;
    lVar3 = 0;
    val = (ASN1_VALUE *)0x0;
    goto LAB_00a25f8c;
  }
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c5b2e0);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x40c,"i2d_ECPrivateKey");
    ERR_set_error(0x10,0xc0100,0);
    iVar2 = 0;
    lVar3 = 0;
    goto LAB_00a25f8c;
  }
  *(undefined4 *)val = *(undefined4 *)(key + 0x10);
  lVar3 = EC_KEY_priv2buf(key,&local_38);
  if (lVar3 == 0) {
    ERR_new();
    uVar6 = 0x415;
LAB_00a26098:
    ERR_set_debug("crypto/ec/ec_asn1.c",uVar6,"i2d_ECPrivateKey");
    uVar1 = 0x80010;
LAB_00a260a8:
    ERR_set_error(0x10,uVar1,0);
    iVar2 = 0;
  }
  else {
    ASN1_STRING_set0(*(ASN1_STRING **)(val + 8),local_38,(int)lVar3);
    local_38 = (void *)0x0;
    uVar7 = *(uint *)(key + 0x30);
    if ((uVar7 & 1) == 0) {
      lVar4 = EC_GROUP_get_ecpkparameters(*(undefined8 *)(key + 0x18),*(undefined8 *)(val + 0x10));
      *(long *)(val + 0x10) = lVar4;
      if (lVar4 == 0) {
        ERR_new();
        uVar6 = 0x420;
        goto LAB_00a26098;
      }
      uVar7 = *(uint *)(key + 0x30);
    }
    if ((uVar7 >> 1 & 1) == 0) {
      pAVar5 = ASN1_BIT_STRING_new();
      *(ASN1_BIT_STRING **)(val + 0x18) = pAVar5;
      if (pAVar5 == (ASN1_BIT_STRING *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x428,"i2d_ECPrivateKey");
        uVar1 = 0xc0100;
        goto LAB_00a260a8;
      }
      lVar4 = EC_KEY_key2buf(key,*(undefined4 *)(key + 0x34),&local_40,0);
      if (lVar4 == 0) {
        ERR_new();
        uVar6 = 0x42f;
        goto LAB_00a26098;
      }
      str = *(ASN1_STRING **)(val + 0x18);
      str->flags = str->flags & 0xfffffffffffffff0U | 8;
      ASN1_STRING_set0(str,local_40,(int)lVar4);
      local_40 = (void *)0x0;
    }
    iVar2 = ASN1_item_i2d(val,out,(ASN1_ITEM *)&DAT_00c5b2e0);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x43a,"i2d_ECPrivateKey");
      ERR_set_error(0x10,0x80010,0);
    }
  }
LAB_00a25f8c:
  CRYPTO_clear_free(local_38,lVar3,"crypto/ec/ec_asn1.c",0x43f);
  CRYPTO_free(local_40);
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5b2e0);
  return iVar2;
}

