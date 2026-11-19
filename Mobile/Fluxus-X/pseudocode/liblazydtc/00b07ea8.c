/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b07ea8
 */

X509_ATTRIBUTE * X509at_get_attr(stack_st_X509_ATTRIBUTE *x,int loc)

{
  int iVar1;
  X509_ATTRIBUTE *pXVar2;
  
  pXVar2 = (X509_ATTRIBUTE *)0x0;
  if (x != (stack_st_X509_ATTRIBUTE *)0x0) {
    iVar1 = OPENSSL_sk_num();
    if (loc < 0) {
      pXVar2 = (X509_ATTRIBUTE *)0x0;
    }
    else {
      pXVar2 = (X509_ATTRIBUTE *)0x0;
      if (loc < iVar1) {
        pXVar2 = (X509_ATTRIBUTE *)OPENSSL_sk_value(x,loc);
      }
    }
  }
  return pXVar2;
}

