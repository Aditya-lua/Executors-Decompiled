/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9a1b8
 */

long * CRYPTO_secure_malloc(ulong param_1,char *param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  
  if ((DAT_00d220f0 & 1) == 0) {
    plVar11 = CRYPTO_malloc((int)param_1,param_2,param_3);
    return plVar11;
  }
  iVar2 = CRYPTO_THREAD_write_lock(DAT_00d220f8);
  if (iVar2 == 0) {
    return (long *)0x0;
  }
  if (param_1 <= DAT_00d22120) {
    uVar3 = DAT_00d22138;
    uVar10 = DAT_00d22130;
    do {
      uVar7 = uVar10;
      bVar1 = uVar3 < param_1;
      uVar3 = uVar3 << 1;
      uVar10 = uVar7 - 1;
    } while (bVar1);
    if (0 < (long)uVar7) {
      uVar3 = uVar10;
      do {
        plVar11 = (long *)DAT_00d22128[uVar3];
        if (plVar11 != (long *)0x0) goto LAB_00a9a2a4;
        bVar1 = 0 < (long)uVar3;
        uVar3 = uVar3 - 1;
      } while (bVar1);
    }
  }
  plVar11 = (long *)0x0;
  uVar3 = 0;
  goto LAB_00a9a248;
LAB_00a9a2a4:
  if (uVar10 == uVar3) {
    plVar11 = (long *)DAT_00d22128[uVar10];
    iVar2 = FUN_00a9b18c(plVar11,uVar10 & 0xffffffff,DAT_00d22140);
    if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: sh_testbit(chunk, list, sh.bittable)","crypto/mem_sec.c",0x299)
      ;
    }
    FUN_00a9afb8(plVar11,uVar10 & 0xffffffff,DAT_00d22148);
    lVar4 = *plVar11;
    if (lVar4 != 0) {
      *(long *)(lVar4 + 8) = plVar11[1];
    }
    *(long *)plVar11[1] = lVar4;
    if (((*plVar11 != 0) &&
        ((plVar5 = *(long **)(*plVar11 + 8), plVar5 < DAT_00d22128 ||
         (DAT_00d22128 + DAT_00d22130 <= plVar5)))) &&
       ((plVar5 < DAT_00d22118 || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= plVar5)))) {
LAB_00a9a5b0:
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: WITHIN_FREELIST(temp2->p_next) || WITHIN_ARENA(temp2->p_next)",
                  "crypto/mem_sec.c",0x196);
    }
    if ((plVar11 < DAT_00d22118) || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= plVar11)) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: WITHIN_ARENA(chunk)","crypto/mem_sec.c",0x29d);
    }
    *plVar11 = 0;
    plVar11[1] = 0;
    if ((plVar11 < DAT_00d22118) || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= plVar11)) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: WITHIN_ARENA(ptr)","crypto/mem_sec.c",0x2d2);
    }
    uVar3 = (long)plVar11 + (DAT_00d22120 - (long)DAT_00d22118);
    uVar10 = DAT_00d22130 - 1;
    if (uVar3 < DAT_00d22138) goto LAB_00a9a590;
    uVar7 = 0;
    if (DAT_00d22138 != 0) {
      uVar7 = uVar3 / DAT_00d22138;
    }
    goto LAB_00a9a568;
  }
  iVar2 = FUN_00a9b18c(plVar11,uVar3 & 0xffffffff,DAT_00d22148);
  if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: !sh_testbit(temp, slist, sh.bitmalloc)","crypto/mem_sec.c",0x27f)
    ;
  }
  FUN_00a9b250(plVar11,uVar3 & 0xffffffff,DAT_00d22140);
  lVar4 = *plVar11;
  if (lVar4 != 0) {
    *(long *)(lVar4 + 8) = plVar11[1];
  }
  *(long *)plVar11[1] = lVar4;
  if (((*plVar11 != 0) &&
      ((plVar5 = *(long **)(*plVar11 + 8), plVar5 < DAT_00d22128 ||
       (DAT_00d22128 + DAT_00d22130 <= plVar5)))) &&
     ((plVar5 < DAT_00d22118 || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= plVar5))))
  goto LAB_00a9a5b0;
  if (plVar11 == (long *)DAT_00d22128[uVar3]) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: temp != sh.freelist[slist]","crypto/mem_sec.c",0x282);
  }
  uVar3 = uVar3 + 1;
  iVar2 = FUN_00a9b18c(plVar11,uVar3 & 0xffffffff,DAT_00d22148);
  if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: !sh_testbit(temp, slist, sh.bitmalloc)","crypto/mem_sec.c",0x288)
    ;
  }
  FUN_00a9afb8(plVar11,uVar3 & 0xffffffff,DAT_00d22140);
  FUN_00a9b0a0(DAT_00d22128 + uVar3,plVar11);
  if ((long *)DAT_00d22128[uVar3] != plVar11) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: sh.freelist[slist] == temp","crypto/mem_sec.c",0x28b);
  }
  plVar11 = (long *)((long)plVar11 + (DAT_00d22120 >> (uVar3 & 0x3f)));
  iVar2 = FUN_00a9b18c(plVar11,uVar3 & 0xffffffff,DAT_00d22148);
  if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: !sh_testbit(temp, slist, sh.bitmalloc)","crypto/mem_sec.c",0x28f)
    ;
  }
  FUN_00a9afb8(plVar11,uVar3 & 0xffffffff,DAT_00d22140);
  FUN_00a9b0a0(DAT_00d22128 + uVar3,plVar11);
  if ((long *)DAT_00d22128[uVar3] != plVar11) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: sh.freelist[slist] == temp","crypto/mem_sec.c",0x292);
  }
  lVar4 = 1L << (uVar3 & 0x3f);
  plVar5 = (long *)(DAT_00d22120 >> (uVar3 & 0x3f));
  uVar6 = DAT_00d22120 >> (uVar3 & 0x3f);
  uVar7 = 0;
  if (uVar6 != 0) {
    uVar7 = (ulong)((long)plVar11 - (long)DAT_00d22118) / uVar6;
  }
  uVar7 = uVar7 + lVar4;
  uVar8 = uVar7 >> 3;
  uVar7 = uVar7 ^ 1;
  uVar9 = 1L << (uVar7 & 7);
  if (((uVar9 & *(byte *)(DAT_00d22140 + uVar8)) != 0) &&
     ((uVar9 & *(byte *)(DAT_00d22148 + uVar8)) == 0)) {
    if ((long *)((long)plVar11 - (long)plVar5) !=
        (long *)((long)DAT_00d22118 + (uVar7 & lVar4 - 1U) * uVar6)) goto LAB_00a9a464;
    goto LAB_00a9a2a4;
  }
  if (plVar11 != plVar5) {
LAB_00a9a464:
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: temp-(sh.arena_size >> slist) == sh_find_my_buddy(temp, slist)",
                "crypto/mem_sec.c",0x294);
  }
  goto LAB_00a9a2a4;
  while( true ) {
    if ((uVar7 & 1) != 0) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: (bit & 1) == 0","crypto/mem_sec.c",0x14c);
    }
    uVar7 = uVar7 >> 1;
    uVar10 = uVar10 - 1;
    if (uVar7 == 0) break;
LAB_00a9a568:
    if ((1L << (uVar7 & 7) & (ulong)*(byte *)(DAT_00d22140 + (uVar7 >> 3))) != 0) break;
  }
LAB_00a9a590:
  iVar2 = FUN_00a9b18c(plVar11,uVar10 & 0xffffffff,DAT_00d22140);
  if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: sh_testbit(ptr, list, sh.bittable)","crypto/mem_sec.c",0x2d6);
  }
  uVar3 = DAT_00d22120 >> (uVar10 & 0x3f);
LAB_00a9a248:
  DAT_00d22100 = DAT_00d22100 + uVar3;
  CRYPTO_THREAD_unlock(DAT_00d220f8);
  return plVar11;
}

