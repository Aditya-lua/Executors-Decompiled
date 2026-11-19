/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27988
 */

EC_KEY * ossl_ec_key_param_from_x509_algor
                   (X509_ALGOR *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  EC_KEY *pEVar2;
  undefined8 uVar3;
  EC_GROUP *group;
  char **local_40;
  EC_KEY *local_38;
  ASN1_OBJECT *local_30;
  int local_24;
  
  local_24 = 0;
  local_30 = (ASN1_OBJECT *)0x0;
  X509_ALGOR_get0((ASN1_OBJECT **)0x0,&local_24,&local_30,param_1);
  local_38 = (EC_KEY *)EC_KEY_new_ex(param_2,param_3);
  if (local_38 == (EC_KEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_backend.c",0x308,"ossl_ec_key_param_from_x509_algor");
    uVar3 = 0xc0100;
  }
  else {
    if (local_24 == 6) {
      iVar1 = OBJ_obj2nid(local_30);
      group = (EC_GROUP *)EC_GROUP_new_by_curve_name_ex(param_2,param_3,iVar1);
      if (group != (EC_GROUP *)0x0) {
        EC_GROUP_set_asn1_flag(group,1);
        iVar1 = EC_KEY_set_group(local_38,group);
        if (iVar1 != 0) {
          EC_GROUP_free(group);
          return local_38;
        }
      }
      goto LAB_00a27ac8;
    }
    if (local_24 == 0x10) {
      local_40 = local_30->ln;
      pEVar2 = d2i_ECParameters(&local_38,(uchar **)&local_40,(long)*(int *)&local_30->sn);
      if (pEVar2 != (EC_KEY *)0x0) {
        return local_38;
      }
      ERR_new();
      uVar3 = 0x313;
    }
    else {
      ERR_new();
      uVar3 = 0x325;
    }
    ERR_set_debug("crypto/ec/ec_backend.c",uVar3,"ossl_ec_key_param_from_x509_algor");
    uVar3 = 0x8e;
  }
  ERR_set_error(0x10,uVar3,0);
  group = (EC_GROUP *)0x0;
LAB_00a27ac8:
  EC_KEY_free(local_38);
  EC_GROUP_free(group);
  return (EC_KEY *)0x0;
}

