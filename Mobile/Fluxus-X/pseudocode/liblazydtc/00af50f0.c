/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af50f0
 */

int OTHERNAME_cmp(OTHERNAME *a,OTHERNAME *b)

{
  int iVar1;
  
  iVar1 = -1;
  if (((a == (OTHERNAME *)0x0) || (b == (OTHERNAME *)0x0)) ||
     (iVar1 = OBJ_cmp(a->type_id,b->type_id), iVar1 != 0)) {
    return iVar1;
  }
  iVar1 = ASN1_TYPE_cmp(a->value,b->value);
  return iVar1;
}

