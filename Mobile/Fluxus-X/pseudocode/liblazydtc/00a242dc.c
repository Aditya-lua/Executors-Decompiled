/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a242dc
 */

undefined8 FUN_00a242dc(undefined4 *param_1,undefined8 *param_2,EC_KEY *param_3)

{
  int iVar1;
  EC_GROUP *group;
  ASN1_OBJECT *pAVar2;
  long lVar3;
  ASN1_STRING *a;
  undefined8 uVar4;
  undefined4 uVar5;
  
  if ((param_3 == (EC_KEY *)0x0) || (group = EC_KEY_get0_group(param_3), group == (EC_GROUP *)0x0))
  {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_ameth.c",0x23,"eckey_param2type");
    uVar4 = 0x7c;
LAB_00a24364:
    ERR_set_error(0x10,uVar4,0);
    uVar4 = 0;
  }
  else {
    iVar1 = EC_GROUP_get_asn1_flag(group);
    if ((iVar1 == 0) || (iVar1 = EC_GROUP_get_curve_name(group), iVar1 == 0)) {
      a = ASN1_STRING_new();
      if (a == (ASN1_STRING *)0x0) {
        return 0;
      }
      iVar1 = i2d_ECParameters(param_3,&a->data);
      a->length = iVar1;
      if (iVar1 < 1) {
        ASN1_STRING_free(a);
        ERR_new();
        ERR_set_debug("crypto/ec/ec_ameth.c",0x3b,"eckey_param2type");
        uVar4 = 0x80010;
        goto LAB_00a24364;
      }
      uVar5 = 0x10;
      *param_2 = a;
    }
    else {
      pAVar2 = OBJ_nid2obj(iVar1);
      if ((pAVar2 == (ASN1_OBJECT *)0x0) || (lVar3 = OBJ_length(), lVar3 == 0)) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_ameth.c",0x2d,"eckey_param2type");
        uVar4 = 0xa7;
        goto LAB_00a24364;
      }
      *param_2 = pAVar2;
      uVar5 = 6;
    }
    uVar4 = 1;
    *param_1 = uVar5;
  }
  return uVar4;
}

