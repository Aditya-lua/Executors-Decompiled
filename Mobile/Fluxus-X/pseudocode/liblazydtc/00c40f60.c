/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40f60
 */

X509_CERT_AUX * d2i_X509_CERT_AUX(X509_CERT_AUX **a,uchar **in,long len)

{
  X509_CERT_AUX *pXVar1;
  
  pXVar1 = d2i_X509_CERT_AUX(a,in,len);
  return pXVar1;
}

