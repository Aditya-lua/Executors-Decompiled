/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99938
 */

int CRYPTO_set_mem_functions(m *m,r *r,f *f)

{
  int iVar1;
  
  iVar1 = 0;
  if ((DAT_00d220e8 & 1) == 0) {
    if (m != (m *)0x0) {
      PTR_CRYPTO_malloc_00cc9138 = m;
    }
    if (r != (r *)0x0) {
      PTR_CRYPTO_realloc_00cc9140 = r;
    }
    if (f != (f *)0x0) {
      PTR_CRYPTO_free_00cc9148 = f;
    }
    iVar1 = 1;
  }
  return iVar1;
}

