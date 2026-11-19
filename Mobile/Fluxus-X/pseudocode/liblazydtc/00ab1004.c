/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1004
 */

int OCSP_request_add1_nonce(OCSP_REQUEST *req,uchar *val,int len)

{
  int iVar1;
  
  iVar1 = FUN_00ab100c(&req[1].optionalSignature,val,len);
  return iVar1;
}

