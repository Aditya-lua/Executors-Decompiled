/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7887c
 */

undefined * mbedtls_md_info_from_type(int param_1)

{
  if (param_1 - 3U < 0x11) {
    return (&PTR_LAB_00ca83d0)[(int)(param_1 - 3U)];
  }
  return (undefined *)0x0;
}

