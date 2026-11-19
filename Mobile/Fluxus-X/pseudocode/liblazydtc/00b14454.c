/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14454
 */

int X509_VERIFY_PARAM_set_purpose(X509_VERIFY_PARAM *param,int purpose)

{
  int iVar1;
  
  iVar1 = X509_PURPOSE_set(&param->purpose,purpose);
  return iVar1;
}

