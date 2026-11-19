/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafda4
 */

int OCSP_resp_count(OCSP_BASICRESP *bs)

{
  int iVar1;
  
  if (bs == (OCSP_BASICRESP *)0x0) {
    return -1;
  }
  iVar1 = OPENSSL_sk_num(bs[1].tbsResponseData);
  return iVar1;
}

