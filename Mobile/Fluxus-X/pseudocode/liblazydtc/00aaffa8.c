/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaffa8
 */

int OCSP_resp_find_status
              (OCSP_BASICRESP *bs,OCSP_CERTID *id,int *status,int *reason,
              ASN1_GENERALIZEDTIME **revtime,ASN1_GENERALIZEDTIME **thisupd,
              ASN1_GENERALIZEDTIME **nextupd)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  ASN1_ENUMERATED *a;
  long lVar5;
  OCSP_RESPDATA *pOVar6;
  
  if (bs != (OCSP_BASICRESP *)0x0) {
    pOVar6 = bs[1].tbsResponseData;
    iVar1 = OPENSSL_sk_num(pOVar6);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(pOVar6,iVar1);
        iVar2 = OCSP_id_cmp(id,(OCSP_CERTID *)*puVar3);
        if (iVar2 == 0) {
          lVar4 = OPENSSL_sk_value(bs[1].tbsResponseData,iVar1);
          if (lVar4 == 0) {
            iVar1 = -1;
          }
          else {
            iVar1 = **(int **)(lVar4 + 8);
            if (iVar1 == 1) {
              puVar3 = *(undefined8 **)(*(int **)(lVar4 + 8) + 2);
              if (revtime != (ASN1_GENERALIZEDTIME **)0x0) {
                *revtime = (ASN1_GENERALIZEDTIME *)*puVar3;
              }
              if (reason != (int *)0x0) {
                a = (ASN1_ENUMERATED *)puVar3[1];
                if (a == (ASN1_ENUMERATED *)0x0) {
                  *reason = -1;
                }
                else {
                  lVar5 = ASN1_ENUMERATED_get(a);
                  *reason = (int)lVar5;
                }
              }
            }
            if (thisupd != (ASN1_GENERALIZEDTIME **)0x0) {
              *thisupd = *(ASN1_GENERALIZEDTIME **)(lVar4 + 0x10);
            }
            if (nextupd != (ASN1_GENERALIZEDTIME **)0x0) {
              *nextupd = *(ASN1_GENERALIZEDTIME **)(lVar4 + 0x18);
            }
          }
          if (status != (int *)0x0) {
            *status = iVar1;
          }
          return 1;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(pOVar6);
      } while (iVar1 < iVar2);
    }
  }
  return 0;
}

