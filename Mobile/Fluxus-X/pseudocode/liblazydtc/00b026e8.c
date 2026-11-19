/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b026e8
 */

X509_PURPOSE * X509_PURPOSE_get0(int idx)

{
  X509_PURPOSE *pXVar1;
  
  if (idx < 0) {
    return (X509_PURPOSE *)0x0;
  }
  if (idx < 9) {
    return (X509_PURPOSE *)(&DAT_00cc9a28 + (long)idx * 0x30);
  }
  pXVar1 = (X509_PURPOSE *)OPENSSL_sk_value(DAT_00d227e0,idx + -9);
  return pXVar1;
}

