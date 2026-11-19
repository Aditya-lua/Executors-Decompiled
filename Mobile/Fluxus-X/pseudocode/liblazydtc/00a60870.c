/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60870
 */

X509_ATTRIBUTE * EVP_PKEY_get_attr(EVP_PKEY *key,int loc)

{
  X509_ATTRIBUTE *pXVar1;
  
  pXVar1 = X509at_get_attr(*(stack_st_X509_ATTRIBUTE **)&key[1].references,loc);
  return pXVar1;
}

