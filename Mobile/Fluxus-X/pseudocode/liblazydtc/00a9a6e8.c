/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9a6e8
 */

void CRYPTO_secure_free(void *param_1)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  
  if (param_1 != (void *)0x0) {
    if (((DAT_00d220f0 != '\x01') || (param_1 < DAT_00d22118)) ||
       ((void *)((long)DAT_00d22118 + DAT_00d22120) <= param_1)) {
      CRYPTO_free(param_1);
      return;
    }
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d220f8);
    if (iVar1 != 0) {
      if ((param_1 < DAT_00d22118) || ((void *)((long)DAT_00d22118 + DAT_00d22120) <= param_1)) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: WITHIN_ARENA(ptr)","crypto/mem_sec.c",0x2d2);
      }
      uVar2 = (long)param_1 + (DAT_00d22120 - (long)DAT_00d22118);
      uVar4 = DAT_00d22130 - 1;
      if (DAT_00d22138 <= uVar2) {
        uVar3 = 0;
        if (DAT_00d22138 != 0) {
          uVar3 = uVar2 / DAT_00d22138;
        }
        do {
          if ((1L << (uVar3 & 7) & (ulong)*(byte *)(DAT_00d22140 + (uVar3 >> 3))) != 0) break;
          if ((uVar3 & 1) != 0) {
                    /* WARNING: Subroutine does not return */
            OPENSSL_die("assertion failed: (bit & 1) == 0","crypto/mem_sec.c",0x14c);
          }
          uVar3 = uVar3 >> 1;
          uVar4 = uVar4 - 1;
        } while (uVar3 != 0);
      }
      iVar1 = FUN_00a9b18c(param_1,uVar4 & 0xffffffff,DAT_00d22140);
      if (iVar1 == 0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: sh_testbit(ptr, list, sh.bittable)","crypto/mem_sec.c",0x2d6)
        ;
      }
      uVar2 = DAT_00d22120 >> (uVar4 & 0x3f);
      OPENSSL_cleanse(param_1,uVar2);
      DAT_00d22100 = DAT_00d22100 - uVar2;
      FUN_00a9a8b4(param_1);
      CRYPTO_THREAD_unlock(DAT_00d220f8);
      return;
    }
  }
  return;
}

