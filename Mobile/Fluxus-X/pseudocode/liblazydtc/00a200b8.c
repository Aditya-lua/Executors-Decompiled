/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a200b8
 */

int i2d_DSAPublicKey(DSA *a,uchar **pp)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,pp,(ASN1_ITEM *)&DAT_00c5aa78);
  return iVar1;
}

