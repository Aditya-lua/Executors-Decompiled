/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aceec8
 */

int i2d_RSA_PSS_PARAMS(RSA_PSS_PARAMS *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7cf18);
  return iVar1;
}

