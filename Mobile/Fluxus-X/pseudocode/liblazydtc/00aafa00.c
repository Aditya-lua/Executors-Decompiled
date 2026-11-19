/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafa00
 */

OCSP_SERVICELOC * d2i_OCSP_SERVICELOC(OCSP_SERVICELOC **a,uchar **in,long len)

{
  OCSP_SERVICELOC *pOVar1;
  
  pOVar1 = (OCSP_SERVICELOC *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7a208);
  return pOVar1;
}

