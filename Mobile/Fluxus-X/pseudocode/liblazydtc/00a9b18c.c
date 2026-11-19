/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b18c
 */

uint FUN_00a9b18c(long param_1,uint param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  
  if (((int)param_2 < 0) || (DAT_00d22130 <= (int)param_2)) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: list >= 0 && list < sh.freelist_size","crypto/mem_sec.c",0x157);
  }
  uVar2 = DAT_00d22120 >> ((ulong)param_2 & 0x3f);
  if ((uVar2 - 1 & param_1 - DAT_00d22118) != 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: ((ptr - sh.arena) & ((sh.arena_size >> list) - 1)) == 0",
                "crypto/mem_sec.c",0x158);
  }
  uVar1 = 0;
  if (uVar2 != 0) {
    uVar1 = (ulong)(param_1 - DAT_00d22118) / uVar2;
  }
  uVar1 = uVar1 + (1L << ((ulong)param_2 & 0x3f));
  if ((uVar1 == 0) || (DAT_00d22150 <= uVar1)) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: bit > 0 && bit < sh.bittable_size","crypto/mem_sec.c",0x15a);
  }
  return 1 << (uVar1 & 7) & (uint)*(byte *)(param_3 + (uVar1 >> 3));
}

