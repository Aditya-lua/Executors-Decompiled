/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ade9c
 */

undefined4 * ssl_cert_lookup_by_idx(ulong param_1)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)0x0;
  if (param_1 < 9) {
    puVar1 = &DAT_0074b35c + param_1 * 2;
  }
  return puVar1;
}

