/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14874
 */

X509_VERIFY_PARAM * X509_VERIFY_PARAM_lookup(char *name)

{
  int iVar1;
  X509_VERIFY_PARAM *pXVar2;
  char *local_90 [14];
  
  local_90[0] = name;
  if ((DAT_00d227f0 == 0) || (iVar1 = OPENSSL_sk_find(DAT_00d227f0,local_90), iVar1 < 0)) {
    pXVar2 = OBJ_bsearch_(local_90,&PTR_s_default_00c81c08,5,0x70,(cmp *)&LAB_00b14914);
  }
  else {
    pXVar2 = (X509_VERIFY_PARAM *)OPENSSL_sk_value(DAT_00d227f0,iVar1);
  }
  return pXVar2;
}

