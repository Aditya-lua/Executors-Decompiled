/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18f9c
 */

DH * d2i_DHparams(DH **a,uchar **pp,long length)

{
  DH *pDVar1;
  
  pDVar1 = (DH *)ASN1_item_d2i((ASN1_VALUE **)a,pp,length,(ASN1_ITEM *)&DAT_00c59f10);
  return pDVar1;
}

