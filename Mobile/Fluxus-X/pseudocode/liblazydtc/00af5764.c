/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5764
 */

X509V3_EXT_METHOD * X509V3_EXT_get_nid(int nid)

{
  undefined4 uVar1;
  undefined8 *puVar2;
  X509V3_EXT_METHOD *pXVar3;
  int local_88 [26];
  int *local_18;
  
  local_18 = local_88;
  if (nid < 0) {
    pXVar3 = (X509V3_EXT_METHOD *)0x0;
  }
  else {
    local_88[0] = nid;
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

