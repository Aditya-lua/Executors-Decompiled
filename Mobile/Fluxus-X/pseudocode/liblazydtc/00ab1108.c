/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1108
 */

int OCSP_basic_add1_nonce(OCSP_BASICRESP *resp,uchar *val,int len)

{
  int iVar1;
  
  iVar1 = FUN_00ab100c(&resp[1].signatureAlgorithm,val,len);
  return iVar1;
}

