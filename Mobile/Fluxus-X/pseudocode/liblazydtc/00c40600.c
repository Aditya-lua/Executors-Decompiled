/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40600
 */

int X509_policy_check(X509_POLICY_TREE **ptree,int *pexplicit_policy,stack_st_X509 *certs,
                     stack_st_ASN1_OBJECT *policy_oids,uint flags)

{
  int iVar1;
  
  iVar1 = X509_policy_check(ptree,pexplicit_policy,certs,policy_oids,flags);
  return iVar1;
}

