/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99978
 */

void CRYPTO_get_mem_functions(m **m,r **r,f **f)

{
  if (m != (m **)0x0) {
    *m = (m *)PTR_CRYPTO_malloc_00cc9138;
  }
  if (r != (r **)0x0) {
    *r = (r *)PTR_CRYPTO_realloc_00cc9140;
  }
  if (f != (f **)0x0) {
    *f = (f *)PTR_CRYPTO_free_00cc9148;
  }
  return;
}

