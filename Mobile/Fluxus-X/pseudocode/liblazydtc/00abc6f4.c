/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc6f4
 */

void PKCS12_get_attr(long param_1,int param_2)

{
  PKCS12_get_attr_gen(*(stack_st_X509_ATTRIBUTE **)(param_1 + 0x10),param_2);
  return;
}

