/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9a8b4
 */

void FUN_00a9a8b4(long *param_1)

{
  long *plVar1;
  int iVar2;
  ulong uVar3;
  long *plVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  
  if (param_1 != (long *)0x0) {
    if ((param_1 < DAT_00d22118) || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= param_1)) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: WITHIN_ARENA(ptr)","crypto/mem_sec.c",0x2ac);
    }
    uVar3 = (long)param_1 + (DAT_00d22120 - (long)DAT_00d22118);
    uVar9 = DAT_00d22130 - 1;
    if (DAT_00d22138 <= uVar3) {
      uVar5 = 0;
      if (DAT_00d22138 != 0) {
        uVar5 = uVar3 / DAT_00d22138;
      }
      do {
        if ((1L << (uVar5 & 7) & (ulong)*(byte *)(DAT_00d22140 + (uVar5 >> 3))) != 0) break;
        if ((uVar5 & 1) != 0) {
                    /* WARNING: Subroutine does not return */
          OPENSSL_die("assertion failed: (bit & 1) == 0","crypto/mem_sec.c",0x14c);
        }
        uVar5 = uVar5 >> 1;
        uVar9 = uVar9 - 1;
      } while (uVar5 != 0);
    }
    iVar2 = FUN_00a9b18c(param_1,uVar9 & 0xffffffff,DAT_00d22140);
    if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: sh_testbit(ptr, list, sh.bittable)","crypto/mem_sec.c",0x2b1);
    }
    FUN_00a9b250(param_1,uVar9 & 0xffffffff,DAT_00d22148);
    lVar10 = uVar9 * 8;
    FUN_00a9b0a0(DAT_00d22128 + uVar9,param_1);
    while( true ) {
      lVar10 = lVar10 + -8;
      lVar6 = 1L << (uVar9 & 0x3f);
      uVar5 = DAT_00d22120 >> (uVar9 & 0x3f);
      uVar3 = 0;
      if (uVar5 != 0) {
        uVar3 = (ulong)((long)param_1 - (long)DAT_00d22118) / uVar5;
      }
      uVar7 = uVar3 + lVar6 >> 3;
      uVar3 = uVar3 + lVar6 ^ 1;
      uVar8 = 1L << (uVar3 & 7);
      if (((uVar8 & *(byte *)(DAT_00d22140 + uVar7)) == 0) ||
         ((uVar8 & *(byte *)(DAT_00d22148 + uVar7)) != 0)) break;
      uVar3 = (uVar3 & lVar6 - 1U) * uVar5;
      plVar1 = (long *)((long)DAT_00d22118 + uVar3);
      if (plVar1 == (long *)0x0) {
        return;
      }
      uVar7 = 0;
      if (uVar5 != 0) {
        uVar7 = uVar3 / uVar5;
      }
      uVar8 = uVar7 + lVar6 >> 3;
      uVar3 = uVar7 + lVar6 ^ 1;
      uVar7 = 1L << (uVar3 & 7);
      if (((uVar7 & *(byte *)(DAT_00d22140 + uVar8)) == 0) ||
         ((uVar7 & *(byte *)(DAT_00d22148 + uVar8)) != 0)) {
        if (param_1 != (long *)0x0) goto LAB_00a9abe8;
      }
      else if (param_1 != (long *)((long)DAT_00d22118 + (uVar3 & lVar6 - 1U) * uVar5)) {
LAB_00a9abe8:
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: ptr == sh_find_my_buddy(buddy, list)","crypto/mem_sec.c",
                    0x2b7);
      }
      if (param_1 == (long *)0x0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: ptr != NULL","crypto/mem_sec.c",0x2b8);
      }
      iVar2 = FUN_00a9b18c(param_1,uVar9 & 0xffffffff);
      if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: !sh_testbit(ptr, list, sh.bitmalloc)","crypto/mem_sec.c",
                    0x2b9);
      }
      FUN_00a9b250(param_1,uVar9 & 0xffffffff,DAT_00d22140);
      lVar6 = *param_1;
      if (lVar6 != 0) {
        *(long *)(lVar6 + 8) = param_1[1];
      }
      *(long *)param_1[1] = lVar6;
      if (((*param_1 != 0) &&
          ((plVar4 = *(long **)(*param_1 + 8), plVar4 < DAT_00d22128 ||
           (DAT_00d22128 + DAT_00d22130 <= plVar4)))) &&
         ((plVar4 < DAT_00d22118 || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= plVar4)))) {
LAB_00a9abd0:
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: WITHIN_FREELIST(temp2->p_next) || WITHIN_ARENA(temp2->p_next)"
                    ,"crypto/mem_sec.c",0x196);
      }
      iVar2 = FUN_00a9b18c(param_1,uVar9 & 0xffffffff,DAT_00d22148);
      if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: !sh_testbit(ptr, list, sh.bitmalloc)","crypto/mem_sec.c",700)
        ;
      }
      FUN_00a9b250(plVar1,uVar9 & 0xffffffff,DAT_00d22140);
      lVar6 = *plVar1;
      if (lVar6 != 0) {
        *(long *)(lVar6 + 8) = plVar1[1];
      }
      *(long *)plVar1[1] = lVar6;
      if (((*plVar1 != 0) &&
          ((plVar4 = *(long **)(*plVar1 + 8), plVar4 < DAT_00d22128 ||
           (DAT_00d22128 + DAT_00d22130 <= plVar4)))) &&
         ((plVar4 < DAT_00d22118 || ((long *)((long)DAT_00d22118 + DAT_00d22120) <= plVar4))))
      goto LAB_00a9abd0;
      plVar4 = param_1;
      if (param_1 <= plVar1) {
        plVar4 = plVar1;
      }
      *plVar4 = 0;
      plVar4[1] = 0;
      uVar3 = uVar9 - 1;
      if (param_1 <= plVar1) {
        plVar1 = param_1;
      }
      iVar2 = FUN_00a9b18c(plVar1,uVar3 & 0xffffffff,DAT_00d22148);
      if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: !sh_testbit(ptr, list, sh.bitmalloc)","crypto/mem_sec.c",
                    0x2c7);
      }
      FUN_00a9afb8(plVar1,uVar3 & 0xffffffff,DAT_00d22140);
      FUN_00a9b0a0((long)DAT_00d22128 + lVar10,plVar1);
      lVar6 = uVar9 - 1;
      param_1 = plVar1;
      uVar9 = uVar3;
      if ((long *)DAT_00d22128[lVar6] != plVar1) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: sh.freelist[list] == ptr","crypto/mem_sec.c",0x2ca);
      }
    }
  }
  return;
}

