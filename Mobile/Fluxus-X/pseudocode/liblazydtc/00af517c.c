/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af517c
 */

int GENERAL_NAME_set0_othername(GENERAL_NAME *gen,ASN1_OBJECT *oid,ASN1_TYPE *value)

{
  OTHERNAME *pOVar1;
  
  pOVar1 = (OTHERNAME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e288);
  if (pOVar1 != (OTHERNAME *)0x0) {
    ASN1_TYPE_free(pOVar1->value);
    pOVar1->type_id = oid;
    pOVar1->value = value;
    (gen->d).otherName = pOVar1;
    gen->type = 0;
  }
  return (int)(pOVar1 != (OTHERNAME *)0x0);
}

