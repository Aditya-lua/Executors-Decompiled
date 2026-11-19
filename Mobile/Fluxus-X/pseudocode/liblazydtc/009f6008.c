/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f6008
 */

int ASN1_item_ndef_i2d(ASN1_VALUE *val,uchar **out,ASN1_ITEM *it)

{
  int iVar1;
  
  iVar1 = FUN_009f6010((int)val,out,it,0x800);
  return iVar1;
}

