/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc75c
 */

int PKCS12_SAFEBAG_get_nid(undefined8 *param_1)

{
  int iVar1;
  
  iVar1 = OBJ_obj2nid((ASN1_OBJECT *)*param_1);
  return iVar1;
}

