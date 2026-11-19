/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cd9c
 */

X509_TRUST * X509_TRUST_get0(int idx)

{
  X509_TRUST *pXVar1;
  
  if (idx < 0) {
    return (X509_TRUST *)0x0;
  }
  if (idx < 8) {
    return (X509_TRUST *)(&DAT_00cc9bf8 + (long)idx * 0x28);
  }
  pXVar1 = (X509_TRUST *)OPENSSL_sk_value(DAT_00d227e8,idx + -8);
  return pXVar1;
}

