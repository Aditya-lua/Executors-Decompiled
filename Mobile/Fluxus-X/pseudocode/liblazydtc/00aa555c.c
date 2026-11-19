/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa555c
 */

undefined * OSSL_trace_get_category_name(uint param_1)

{
  undefined *puVar1;
  
  if (0x11 < param_1) {
    return (undefined *)0x0;
  }
  puVar1 = (&PTR_DAT_00c6d938)[(long)(int)param_1 * 2];
  if ((&DAT_00c6d940)[(long)(int)param_1 * 4] != param_1) {
    puVar1 = (undefined *)0x0;
  }
  return puVar1;
}

