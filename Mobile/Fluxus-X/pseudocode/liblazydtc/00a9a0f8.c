/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9a0f8
 */

undefined8 CRYPTO_secure_malloc_done(void)

{
  if (DAT_00d22100 != 0) {
    return 0;
  }
  CRYPTO_free(DAT_00d22128);
  CRYPTO_free(DAT_00d22140);
  CRYPTO_free(DAT_00d22148);
  if ((DAT_00d22108 != (void *)0xffffffffffffffff) && (DAT_00d22110 != 0)) {
    munmap(DAT_00d22108,DAT_00d22110);
  }
  memset(&DAT_00d22108,0,0x50);
  DAT_00d220f0 = 0;
  CRYPTO_THREAD_lock_free(DAT_00d220f8);
  DAT_00d220f8 = 0;
  return 1;
}

