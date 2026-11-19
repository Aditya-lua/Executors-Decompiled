/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14a80
 */

int X509_CRL_get_signature_nid(long param_1)

{
  int iVar1;
  
  iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x58));
  return iVar1;
}

