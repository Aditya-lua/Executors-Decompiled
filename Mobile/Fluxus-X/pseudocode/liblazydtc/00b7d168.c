/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d168
 */

long mbedtls_asn1_find_named_data(long param_1,void *param_2,size_t param_3)

{
  int iVar1;
  
  while ((param_1 != 0 &&
         ((*(size_t *)(param_1 + 8) != param_3 ||
          (iVar1 = memcmp(*(void **)(param_1 + 0x10),param_2,param_3), iVar1 != 0))))) {
    param_1 = *(long *)(param_1 + 0x30);
  }
  return param_1;
}

