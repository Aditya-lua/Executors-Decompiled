/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c428
 */

int X509_REQ_get_attr_count(X509_REQ *req)

{
  int iVar1;
  
  iVar1 = X509at_get_attr_count(req[1].signature);
  return iVar1;
}

