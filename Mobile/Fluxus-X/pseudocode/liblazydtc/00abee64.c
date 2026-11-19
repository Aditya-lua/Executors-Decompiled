/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abee64
 */

bool PKCS7_type_is_other(long param_1)

{
  int iVar1;
  
  iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
  return 5 < iVar1 - 0x15U;
}

