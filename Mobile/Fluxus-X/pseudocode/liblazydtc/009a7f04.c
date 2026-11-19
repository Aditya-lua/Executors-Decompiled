/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7f04
 */

void ssl_sort_cipher_list(void)

{
  qsort(&DAT_00cc4e30,5,0x50,(__compar_fn_t)&LAB_009a7f68);
  qsort(&DAT_00cc4fc0,0xa7,0x50,(__compar_fn_t)&LAB_009a7f68);
  qsort(&DAT_00cc83f0,2,0x50,(__compar_fn_t)&LAB_009a7f68);
  return;
}

