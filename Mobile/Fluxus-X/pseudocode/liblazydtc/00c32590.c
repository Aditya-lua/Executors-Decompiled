/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32590
 */

int OCSP_resp_find_status
              (OCSP_BASICRESP *bs,OCSP_CERTID *id,int *status,int *reason,
              ASN1_GENERALIZEDTIME **revtime,ASN1_GENERALIZEDTIME **thisupd,
              ASN1_GENERALIZEDTIME **nextupd)

{
  int iVar1;
  
  iVar1 = OCSP_resp_find_status(bs,id,status,reason,revtime,thisupd,nextupd);
  return iVar1;
}

