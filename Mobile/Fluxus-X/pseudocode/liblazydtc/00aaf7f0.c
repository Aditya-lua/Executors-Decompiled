/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf7f0
 */

int i2d_OCSP_RESPBYTES(OCSP_RESPBYTES *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7a010);
  return iVar1;
}

