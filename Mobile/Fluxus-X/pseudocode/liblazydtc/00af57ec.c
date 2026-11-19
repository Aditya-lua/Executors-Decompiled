/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af57ec
 */

X509V3_EXT_METHOD * X509V3_EXT_get(X509_EXTENSION *ext)

{
  undefined4 uVar1;
  ASN1_OBJECT *o;
  undefined8 *puVar2;
  X509V3_EXT_METHOD *pXVar3;
  int local_88 [26];
  int *local_18;
  
  o = X509_EXTENSION_get_object(ext);
  local_88[0] = OBJ_obj2nid(o);
  if ((local_88[0] == 0) || (local_18 = local_88, local_88[0] < 0)) {
    pXVar3 = (X509V3_EXT_METHOD *)0x0;
  }
  else {
    puVar2 = OBJ_bsearch_(&local_18,&PTR_ossl_v3_nscert_00cc95d0,0x31,8,(cmp *)&LAB_00af5dc4);
    if (puVar2 == (undefined8 *)0x0) {
      pXVar3 = (X509V3_EXT_METHOD *)0x0;
      if (DAT_00d227d8 != 0) {
        uVar1 = OPENSSL_sk_find(DAT_00d227d8,local_88);
        pXVar3 = (X509V3_EXT_METHOD *)OPENSSL_sk_value(DAT_00d227d8,uVar1);
      }
    }
    else {
      pXVar3 = (X509V3_EXT_METHOD *)*puVar2;
    }
  }
  return pXVar3;
}

