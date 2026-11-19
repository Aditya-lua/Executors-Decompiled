/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99da8
 */

int CRYPTO_secure_malloc_init(ulong param_1,ulong param_2)

{
  size_t __len;
  int iVar1;
  int iVar2;
  long lVar3;
  void *ptr;
  size_t sVar4;
  int *piVar5;
  ulong uVar6;
  int iVar7;
  
  if (((DAT_00d220f0 & 1) == 0) && (DAT_00d220f8 = CRYPTO_THREAD_lock_new(0), DAT_00d220f8 != 0)) {
    memset(&DAT_00d22108,0,0x50);
    if (param_1 == 0) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: size > 0","crypto/mem_sec.c",0x1a8);
    }
    if ((param_1 - 1 & param_1) != 0) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: (size & (size - 1)) == 0","crypto/mem_sec.c",0x1a9);
    }
    if (param_2 < 0x11) {
      param_2 = 0x10;
    }
    else if ((param_2 - 1 & param_2) != 0) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: (minsize & (minsize - 1)) == 0","crypto/mem_sec.c",0x1be);
    }
    uVar6 = 0;
    if (param_2 != 0) {
      uVar6 = param_1 / param_2;
    }
    DAT_00d22150 = uVar6 << 1;
    DAT_00d22120 = param_1;
    DAT_00d22138 = param_2;
    if ((uVar6 & 0x7ffffffffffffffc) == 0) {
      ptr = (void *)0x0;
    }
    else {
      DAT_00d22130 = -1;
      if (DAT_00d22150 == 0) {
        lVar3 = -8;
      }
      else {
        DAT_00d22130 = -1;
        lVar3 = -8;
        uVar6 = DAT_00d22150;
        do {
          DAT_00d22130 = DAT_00d22130 + 1;
          uVar6 = uVar6 >> 1;
          lVar3 = lVar3 + 8;
        } while (uVar6 != 0);
      }
      DAT_00d22128 = (void *)CRYPTO_zalloc(lVar3,"crypto/mem_sec.c",0x1cf);
      if (DAT_00d22128 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: sh.freelist != NULL","crypto/mem_sec.c",0x1d0);
      }
      DAT_00d22140 = (void *)CRYPTO_zalloc(DAT_00d22150 >> 3,"crypto/mem_sec.c",0x1d4);
      if (DAT_00d22140 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: sh.bittable != NULL","crypto/mem_sec.c",0x1d5);
      }
      DAT_00d22148 = (void *)CRYPTO_zalloc(DAT_00d22150 >> 3,"crypto/mem_sec.c",0x1d9);
      if (DAT_00d22148 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: sh.bitmalloc != NULL","crypto/mem_sec.c",0x1da);
      }
      sVar4 = sysconf(0x28);
      __len = 0x1000;
      if (0 < (long)sVar4) {
        __len = sVar4;
      }
      DAT_00d22110 = __len * 2 + DAT_00d22120;
      DAT_00d22108 = mmap((void *)0x0,DAT_00d22110,3,0x22,-1,0);
      if (DAT_00d22108 != (void *)0xffffffffffffffff) {
        DAT_00d22118 = (void *)((long)DAT_00d22108 + __len);
        FUN_00a9afb8(DAT_00d22118,0,DAT_00d22140);
        FUN_00a9b0a0(DAT_00d22128,DAT_00d22118);
        iVar1 = mprotect(DAT_00d22108,__len,0);
        iVar2 = mprotect((void *)((long)DAT_00d22108 + ((__len * 2 + DAT_00d22120) - 1 & -__len)),
                         __len,0);
        iVar7 = 2;
        if (-1 < iVar2) {
          iVar7 = 1 - (iVar1 >> 0x1f);
        }
        lVar3 = syscall(0x11c,DAT_00d22118,DAT_00d22120,1);
        iVar1 = iVar7;
        if (lVar3 < 0) {
          piVar5 = (int *)__errno();
          iVar1 = 2;
          if (*piVar5 == 0x26) {
            iVar2 = mlock(DAT_00d22118,DAT_00d22120);
            iVar1 = 2;
            if (-1 < iVar2) {
              iVar1 = iVar7;
            }
          }
        }
        iVar2 = madvise(DAT_00d22118,DAT_00d22120,0x10);
        iVar7 = 2;
        if (-1 < iVar2) {
          iVar7 = iVar1;
        }
        DAT_00d220f0 = 1;
        return iVar7;
      }
      DAT_00d22108 = (void *)0xffffffffffffffff;
      ptr = DAT_00d22128;
    }
    CRYPTO_free(ptr);
    CRYPTO_free(DAT_00d22140);
    CRYPTO_free(DAT_00d22148);
    if ((DAT_00d22108 != (void *)0xffffffffffffffff) && (DAT_00d22110 != 0)) {
      munmap(DAT_00d22108,DAT_00d22110);
    }
    memset(&DAT_00d22108,0,0x50);
    CRYPTO_THREAD_lock_free(DAT_00d220f8);
    DAT_00d220f8 = 0;
  }
  return 0;
}

