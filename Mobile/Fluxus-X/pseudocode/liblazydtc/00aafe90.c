/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafe90
 */

int OCSP_resp_find(OCSP_BASICRESP *bs,OCSP_CERTID *id,int last)

{
  int iVar1;
  undefined8 *puVar2;
  int iVar3;
  OCSP_RESPDATA *pOVar4;
  
  if (bs != (OCSP_BASICRESP *)0x0) {
    pOVar4 = bs[1].tbsResponseData;
    iVar3 = 0;
    if (-1 < last) {
      iVar3 = last + 1;
    }
    for (; iVar1 = OPENSSL_sk_num(pOVar4), iVar3 < iVar1; iVar3 = iVar3 + 1) {
      puVar2 = (undefined8 *)OPENSSL_sk_value(pOVar4,iVar3);
      iVar1 = OCSP_id_cmp(id,(OCSP_CERTID *)*puVar2);
      if (iVar1 == 0) {
        return iVar3;
      }
    }
  }
  return -1;
}

