/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a10638
 */

ASN1_STRING_TABLE * ASN1_STRING_TABLE_get(int nid)

{
  int iVar1;
  ASN1_STRING_TABLE *pAVar2;
  int local_48 [10];
  
  OPENSSL_init_crypto(0x40,0);
  local_48[0] = nid;
  if ((DAT_00d21958 == 0) || (iVar1 = OPENSSL_sk_find(DAT_00d21958,local_48), iVar1 < 0)) {
    pAVar2 = OBJ_bsearch_(local_48,&DAT_00752178,0x1c,0x28,(cmp *)&LAB_00a108e8);
  }
  else {
    pAVar2 = (ASN1_STRING_TABLE *)OPENSSL_sk_value(DAT_00d21958,iVar1);
  }
  return pAVar2;
}

