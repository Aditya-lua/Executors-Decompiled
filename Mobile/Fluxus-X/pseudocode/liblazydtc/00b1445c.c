/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1445c
 */

int X509_VERIFY_PARAM_set_trust(X509_VERIFY_PARAM *param,int trust)

{
  int iVar1;
  
  iVar1 = X509_TRUST_set(&param->trust,trust);
  return iVar1;
}

