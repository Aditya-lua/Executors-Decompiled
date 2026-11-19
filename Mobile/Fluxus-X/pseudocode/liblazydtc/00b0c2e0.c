/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c2e0
 */

X509_ATTRIBUTE * X509_REQ_get_attr(X509_REQ *req,int loc)

{
  X509_ATTRIBUTE *pXVar1;
  
  pXVar1 = X509at_get_attr((stack_st_X509_ATTRIBUTE *)req[1].signature,loc);
  return pXVar1;
}

