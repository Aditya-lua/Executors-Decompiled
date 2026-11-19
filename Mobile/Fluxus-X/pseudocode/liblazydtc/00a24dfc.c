/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a24dfc
 */

ASN1_VALUE * EC_GROUP_get_ecpkparameters(EC_GROUP *param_1,ASN1_VALUE *param_2)

{
  int iVar1;
  ASN1_OBJECT *a;
  long lVar2;
  
  if (param_2 == (ASN1_VALUE *)0x0) {
    param_2 = ASN1_item_new((ASN1_ITEM *)&DAT_00c5ade8);
    if (param_2 == (ASN1_VALUE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x1dd,"EC_GROUP_get_ecpkparameters");
      ERR_set_error(0x10,0xc0100,0);
      return (ASN1_VALUE *)0x0;
    }
  }
  else if (*(int *)param_2 == 1) {
    if (*(ASN1_VALUE **)(param_2 + 8) != (ASN1_VALUE *)0x0) {
      ASN1_item_free(*(ASN1_VALUE **)(param_2 + 8),(ASN1_ITEM *)&DAT_00c5acc0);
    }
  }
  else if (*(int *)param_2 == 0) {
    ASN1_OBJECT_free(*(ASN1_OBJECT **)(param_2 + 8));
  }
  iVar1 = EC_GROUP_get_asn1_flag(param_1);
  if (iVar1 == 1) {
    iVar1 = EC_GROUP_get_curve_name(param_1);
    if (iVar1 != 0) {
      a = OBJ_nid2obj(iVar1);
      if ((a != (ASN1_OBJECT *)0x0) && (lVar2 = OBJ_length(a), lVar2 != 0)) {
        *(undefined4 *)param_2 = 0;
        *(ASN1_OBJECT **)(param_2 + 8) = a;
        return param_2;
      }
      ASN1_OBJECT_free(a);
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x1f2,"EC_GROUP_get_ecpkparameters");
      ERR_set_error(0x10,0xa7,0);
    }
  }
  else {
    *(undefined4 *)param_2 = 1;
    lVar2 = EC_GROUP_get_ecparameters(param_1,0);
    *(long *)(param_2 + 8) = lVar2;
    if (lVar2 != 0) {
      return param_2;
    }
  }
  ASN1_item_free(param_2,(ASN1_ITEM *)&DAT_00c5ade8);
  return (ASN1_VALUE *)0x0;
}

