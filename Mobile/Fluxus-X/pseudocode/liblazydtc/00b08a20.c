/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08a20
 */

int X509_ATTRIBUTE_count(X509_ATTRIBUTE *attr)

{
  int iVar1;
  
  if (attr == (X509_ATTRIBUTE *)0x0) {
    return 0;
  }
  iVar1 = OPENSSL_sk_num(*(undefined8 *)&attr->single);
  return iVar1;
}

