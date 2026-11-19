/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009abd00
 */

long * ssl_cert_new(void)

{
  long *ptr;
  long lVar1;
  
  ptr = (long *)CRYPTO_zalloc(0x218,"ssl/ssl_cert.c",0x3f);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x42,"ssl_cert_new");
    ERR_set_error(0x14,0xc0100,0);
  }
  else {
    *ptr = (long)(ptr + 4);
    *(undefined4 *)(ptr + 0x41) = 1;
    ptr[0x3d] = (long)&LAB_009abde8;
    *(undefined4 *)(ptr + 0x3e) = 1;
    ptr[0x3f] = 0;
    lVar1 = CRYPTO_THREAD_lock_new();
    ptr[0x42] = lVar1;
    if (lVar1 == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_cert.c",0x4d,"ssl_cert_new");
      ERR_set_error(0x14,0xc0100,0);
      CRYPTO_free(ptr);
      ptr = (long *)0x0;
    }
  }
  return ptr;
}

