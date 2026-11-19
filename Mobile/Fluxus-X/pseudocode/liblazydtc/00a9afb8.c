/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9afb8
 */

void FUN_00a9afb8(long param_1,uint param_2,long param_3)

{
  byte bVar1;
  ulong uVar2;
  ulong uVar3;
  
  if (((int)param_2 < 0) || (DAT_00d22130 <= (int)param_2)) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: list >= 0 && list < sh.freelist_size","crypto/mem_sec.c",0x16e);
  }
  uVar3 = DAT_00d22120 >> ((ulong)param_2 & 0x3f);
  if ((uVar3 - 1 & param_1 - DAT_00d22118) != 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: ((ptr - sh.arena) & ((sh.arena_size >> list) - 1)) == 0",
                "crypto/mem_sec.c",0x16f);
  }
  uVar2 = 0;
  if (uVar3 != 0) {
    uVar2 = (ulong)(param_1 - DAT_00d22118) / uVar3;
  }
  uVar2 = uVar2 + (1L << ((ulong)param_2 & 0x3f));
  if ((uVar2 == 0) || (DAT_00d22150 <= uVar2)) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: bit > 0 && bit < sh.bittable_size","crypto/mem_sec.c",0x171);
  }
  bVar1 = *(byte *)(param_3 + (uVar2 >> 3));
  uVar3 = 1L << (uVar2 & 7);
  if ((uVar3 & bVar1) != 0) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: !TESTBIT(table, bit)","crypto/mem_sec.c",0x172);
  }
  *(byte *)(param_3 + (uVar2 >> 3)) = bVar1 | (byte)uVar3;
  return;
}

