/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7280
 */

ASN1_VALUE * ASN1_item_new(ASN1_ITEM *it)

{
  int iVar1;
  ASN1_VALUE *local_18;
  
  local_18 = (ASN1_VALUE *)0x0;
  iVar1 = FUN_009f7310(&local_18,it,0,0,0);
  if (iVar1 < 1) {
    local_18 = (ASN1_VALUE *)0x0;
  }
  return local_18;
}

