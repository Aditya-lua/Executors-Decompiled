/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15620
 */

int X509_REQ_set_version(X509_REQ *x,long version)

{
  int iVar1;
  
  if (x == (X509_REQ *)0x0) {
    return 0;
  }
  *(undefined4 *)&x->signature = 1;
  iVar1 = ASN1_INTEGER_set(*(ASN1_INTEGER **)&x->references,version);
  return iVar1;
}

