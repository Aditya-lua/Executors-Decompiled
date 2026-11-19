/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36fe0
 */

X509_EXTENSIONS * d2i_X509_EXTENSIONS(X509_EXTENSIONS **a,uchar **in,long len)

{
  X509_EXTENSIONS *pXVar1;
  
  pXVar1 = d2i_X509_EXTENSIONS(a,in,len);
  return pXVar1;
}

