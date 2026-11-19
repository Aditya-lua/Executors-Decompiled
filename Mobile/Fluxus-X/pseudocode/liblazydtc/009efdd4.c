/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efdd4
 */

void * ASN1_TYPE_unpack_sequence(ASN1_ITEM *param_1,int *param_2)

{
  void *pvVar1;
  
  if (((param_2 == (int *)0x0) || (*param_2 != 0x10)) ||
     (*(ASN1_STRING **)(param_2 + 2) == (ASN1_STRING *)0x0)) {
    return (void *)0x0;
  }
  pvVar1 = ASN1_item_unpack(*(ASN1_STRING **)(param_2 + 2),param_1);
  return pvVar1;
}

