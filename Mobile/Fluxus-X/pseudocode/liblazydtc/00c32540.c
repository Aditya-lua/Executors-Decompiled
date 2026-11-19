/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32540
 */

int OCSP_basic_verify(OCSP_BASICRESP *bs,stack_st_X509 *certs,X509_STORE *st,ulong flags)

{
  int iVar1;
  
  iVar1 = OCSP_basic_verify(bs,certs,st,flags);
  return iVar1;
}

