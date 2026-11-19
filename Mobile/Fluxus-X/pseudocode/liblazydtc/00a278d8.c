/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a278d8
 */

bool ossl_x509_algor_is_sm2(X509_ALGOR *param_1)

{
  bool bVar1;
  int iVar2;
  EC_GROUP *group;
  char **local_38;
  ASN1_OBJECT *local_30;
  int local_24;
  
  local_24 = 0;
  local_30 = (ASN1_OBJECT *)0x0;
  X509_ALGOR_get0((ASN1_OBJECT **)0x0,&local_24,&local_30,param_1);
  if (local_24 == 0x10) {
    local_38 = local_30->ln;
    group = d2i_ECPKParameters((EC_GROUP **)0x0,(uchar **)&local_38,(long)*(int *)&local_30->sn);
    if (group == (EC_GROUP *)0x0) {
      bVar1 = false;
    }
    else {
      iVar2 = EC_GROUP_get_curve_name(group);
      bVar1 = iVar2 == 0x494;
    }
    EC_GROUP_free(group);
  }
  else {
    bVar1 = false;
    if (local_24 == 6) {
      iVar2 = OBJ_obj2nid(local_30);
      bVar1 = iVar2 == 0x494;
    }
  }
  return bVar1;
}

