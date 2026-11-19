/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30a50
 */

int EC_METHOD_get_field_type(EC_METHOD *meth)

{
  return *(int *)(meth + 4);
}

