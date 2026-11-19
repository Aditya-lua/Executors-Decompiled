/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60880
 */

int EVP_PKEY_add1_attr(EVP_PKEY *key,X509_ATTRIBUTE *attr)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr((stack_st_X509_ATTRIBUTE **)&key[1].references,attr);
  return (int)(psVar1 != (stack_st_X509_ATTRIBUTE *)0x0);
}

