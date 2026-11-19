/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01a04
 */

BIGNUM * bn_expand2(BIGNUM *a,int words)

{
  ulong uVar1;
  ulong *__dest;
  undefined8 uVar2;
  
  if (a->dmax < words) {
    if (words < 0x800000) {
      if (((uint)a->flags >> 1 & 1) == 0) {
        uVar1 = -(ulong)((uint)words >> 0x1f) & 0xfffffff800000000 | (ulong)(uint)words << 3;
        if (((uint)a->flags >> 3 & 1) == 0) {
          __dest = (ulong *)CRYPTO_zalloc(uVar1,"crypto/bn/bn_lib.c",0x119);
        }
        else {
          __dest = (ulong *)CRYPTO_secure_zalloc(uVar1,"crypto/bn/bn_lib.c",0x117);
        }
        if (__dest != (ulong *)0x0) {
          if (0 < a->top) {
            memcpy(__dest,a->d,(long)a->top << 3);
          }
          if (a->d != (ulong *)0x0) {
            if (((byte)a->flags >> 3 & 1) == 0) {
              CRYPTO_clear_free();
            }
            else {
              CRYPTO_secure_clear_free(a->d,(long)a->dmax << 3,"crypto/bn/bn_lib.c",0xcd);
            }
          }
          a->d = __dest;
          a->dmax = words;
          return a;
        }
        ERR_new();
        ERR_set_debug("crypto/bn/bn_lib.c",0x11b,"bn_expand_internal");
        uVar2 = 0xc0100;
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/bn/bn_lib.c",0x113,"bn_expand_internal");
        uVar2 = 0x69;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_lib.c",0x10f,"bn_expand_internal");
      uVar2 = 0x72;
    }
    ERR_set_error(3,uVar2,0);
    a = (BIGNUM *)0x0;
  }
  return a;
}

