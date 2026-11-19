/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e79c
 */

X509_REQ * X509_REQ_dup(X509_REQ *req)

{
  X509_REQ *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c827b0,req);
  return pXVar1;
}

