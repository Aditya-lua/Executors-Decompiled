/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f110
 */

X509 * X509_find_by_subject(stack_st_X509 *sk,X509_NAME *name)

{
  X509 *pXVar1;
  
  pXVar1 = X509_find_by_subject(sk,name);
  return pXVar1;
}

