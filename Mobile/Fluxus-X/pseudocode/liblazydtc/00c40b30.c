/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40b30
 */

stack_st_X509_EXTENSION * X509_REQ_get_extensions(X509_REQ *req)

{
  stack_st_X509_EXTENSION *psVar1;
  
  psVar1 = X509_REQ_get_extensions(req);
  return psVar1;
}

