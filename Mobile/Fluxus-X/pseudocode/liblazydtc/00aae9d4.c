/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aae9d4
 */

int OBJ_txt2nid(char *s)

{
  int iVar1;
  ASN1_OBJECT *o;
  
  o = OBJ_txt2obj(s,0);
  iVar1 = OBJ_obj2nid(o);
  ASN1_OBJECT_free(o);
  return iVar1;
}

