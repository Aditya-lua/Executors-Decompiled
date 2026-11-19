/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d13c
 */

void mbedtls_asn1_free_named_data_list_shallow(void *param_1)

{
  void *pvVar1;
  
  while (param_1 != (void *)0x0) {
    pvVar1 = *(void **)((long)param_1 + 0x30);
    free(param_1);
    param_1 = pvVar1;
  }
  return;
}

