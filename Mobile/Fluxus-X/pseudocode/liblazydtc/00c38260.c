/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38260
 */

X509_ALGOR * d2i_X509_ALGOR(X509_ALGOR **a,uchar **in,long len)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = d2i_X509_ALGOR(a,in,len);
  return pXVar1;
}

