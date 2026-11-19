/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafdb8
 */

OCSP_SINGLERESP * OCSP_resp_get0(OCSP_BASICRESP *bs,int idx)

{
  OCSP_SINGLERESP *pOVar1;
  
  pOVar1 = (OCSP_SINGLERESP *)0x0;
  if (bs != (OCSP_BASICRESP *)0x0) {
    pOVar1 = (OCSP_SINGLERESP *)OPENSSL_sk_value(bs[1].tbsResponseData,idx);
  }
  return pOVar1;
}

