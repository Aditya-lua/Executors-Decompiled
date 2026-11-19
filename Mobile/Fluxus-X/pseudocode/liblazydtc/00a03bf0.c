/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03bf0
 */

void BN_CTX_free(BN_CTX *c)

{
  BIGNUM *a;
  
  if (c == (BN_CTX *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)(c + 0x20));
  a = *(BIGNUM **)c;
  *(undefined8 *)(c + 0x20) = 0;
  while (a != (BIGNUM *)0x0) {
    if (a->d != (ulong *)0x0) {
      BN_clear_free(a);
    }
    if (a[1].d != (ulong *)0x0) {
      BN_clear_free(a + 1);
    }
    if (a[2].d != (ulong *)0x0) {
      BN_clear_free(a + 2);
    }
    if (a[3].d != (ulong *)0x0) {
      BN_clear_free(a + 3);
    }
    if (a[4].d != (ulong *)0x0) {
      BN_clear_free(a + 4);
    }
    if (a[5].d != (ulong *)0x0) {
      BN_clear_free(a + 5);
    }
    if (a[6].d != (ulong *)0x0) {
      BN_clear_free(a + 6);
    }
    if (a[7].d != (ulong *)0x0) {
      BN_clear_free(a + 7);
    }
    if (a[8].d != (ulong *)0x0) {
      BN_clear_free(a + 8);
    }
    if (a[9].d != (ulong *)0x0) {
      BN_clear_free(a + 9);
    }
    if (a[10].d != (ulong *)0x0) {
      BN_clear_free(a + 10);
    }
    if (a[0xb].d != (ulong *)0x0) {
      BN_clear_free(a + 0xb);
    }
    if (a[0xc].d != (ulong *)0x0) {
      BN_clear_free(a + 0xc);
    }
    if (a[0xd].d != (ulong *)0x0) {
      BN_clear_free(a + 0xd);
    }
    if (a[0xe].d != (ulong *)0x0) {
      BN_clear_free(a + 0xe);
    }
    if (a[0xf].d != (ulong *)0x0) {
      BN_clear_free(a + 0xf);
    }
    *(undefined8 *)(c + 8) = *(undefined8 *)((long)*(void **)c + 0x188);
    CRYPTO_free(*(void **)c);
    a = *(BIGNUM **)(c + 8);
    *(BIGNUM **)c = a;
  }
  CRYPTO_free(c);
  return;
}

