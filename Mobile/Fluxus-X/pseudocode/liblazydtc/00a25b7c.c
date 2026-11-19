/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a25b7c
 */

EC_KEY * d2i_ECPrivateKey(EC_KEY **key,uchar **in,long len)

{
  int iVar1;
  ASN1_VALUE *val;
  long lVar2;
  undefined8 uVar3;
  EC_POINT *pEVar4;
  EC_KEY *key_00;
  ASN1_STRING *x;
  uchar *local_48;
  
  local_48 = *in;
  val = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_48,len,(ASN1_ITEM *)&DAT_00c5b2e0);
  if (val == (ASN1_VALUE *)0x0) {
    return (EC_KEY *)0x0;
  }
  if (((key == (EC_KEY **)0x0) || (key_00 = *key, key_00 == (EC_KEY *)0x0)) &&
     (key_00 = EC_KEY_new(), key_00 == (EC_KEY *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x3b4,"d2i_ECPrivateKey");
    uVar3 = 0xc0100;
  }
  else {
    if (*(long *)(val + 0x10) == 0) {
      if (*(EC_GROUP **)(key_00 + 0x18) == (EC_GROUP *)0x0) goto LAB_00a25cd0;
LAB_00a25c14:
      *(undefined4 *)(key_00 + 0x10) = *(undefined4 *)val;
      x = *(ASN1_STRING **)(val + 8);
      if (x == (ASN1_STRING *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x3cf,"d2i_ECPrivateKey");
        uVar3 = 0x7d;
        goto LAB_00a25d4c;
      }
      uVar3 = ASN1_STRING_get0_data(x);
      iVar1 = ASN1_STRING_length(x);
      iVar1 = EC_KEY_oct2priv(key_00,uVar3,(long)iVar1);
      if (iVar1 == 0) goto LAB_00a25d54;
      iVar1 = EC_GROUP_get_curve_name(*(EC_GROUP **)(key_00 + 0x18));
      if (iVar1 == 0x494) {
        EC_KEY_set_flags(key_00,4);
      }
      EC_POINT_clear_free(*(EC_POINT **)(key_00 + 0x20));
      pEVar4 = EC_POINT_new(*(EC_GROUP **)(key_00 + 0x18));
      *(EC_POINT **)(key_00 + 0x20) = pEVar4;
      if (pEVar4 == (EC_POINT *)0x0) {
        ERR_new();
        uVar3 = 0x3d9;
      }
      else {
        if (*(long *)(val + 0x18) == 0) {
          if ((*(code **)(**(long **)(key_00 + 0x18) + 0x158) == (code *)0x0) ||
             (iVar1 = (**(code **)(**(long **)(key_00 + 0x18) + 0x158))(key_00), iVar1 == 0))
          goto LAB_00a25d54;
          *(uint *)(key_00 + 0x30) = *(uint *)(key_00 + 0x30) | 2;
LAB_00a25de0:
          if (key != (EC_KEY **)0x0) {
            *key = key_00;
          }
          ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5b2e0);
          *in = local_48;
          *(long *)(key_00 + 0x68) = *(long *)(key_00 + 0x68) + 1;
          return key_00;
        }
        uVar3 = ASN1_STRING_get0_data();
        iVar1 = ASN1_STRING_length(*(ASN1_STRING **)(val + 0x18));
        iVar1 = EC_KEY_oct2key(key_00,uVar3,(long)iVar1,0);
        if (iVar1 != 0) goto LAB_00a25de0;
        ERR_new();
        uVar3 = 0x3e4;
      }
    }
    else {
      EC_GROUP_free(*(EC_GROUP **)(key_00 + 0x18));
      lVar2 = EC_GROUP_new_from_ecpkparameters(*(undefined8 *)(val + 0x10));
      *(long *)(key_00 + 0x18) = lVar2;
      if (lVar2 != 0) {
        if (**(int **)(val + 0x10) == 1) {
          *(undefined4 *)(lVar2 + 0x28) = 1;
        }
        goto LAB_00a25c14;
      }
LAB_00a25cd0:
      ERR_new();
      uVar3 = 0x3c3;
    }
    ERR_set_debug("crypto/ec/ec_asn1.c",uVar3,"d2i_ECPrivateKey");
    uVar3 = 0x80010;
  }
LAB_00a25d4c:
  ERR_set_error(0x10,uVar3,0);
LAB_00a25d54:
  if ((key == (EC_KEY **)0x0) || (*key != key_00)) {
    EC_KEY_free(key_00);
  }
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5b2e0);
  return (EC_KEY *)0x0;
}

