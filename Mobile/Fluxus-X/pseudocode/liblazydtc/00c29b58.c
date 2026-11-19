/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29b58
 */

ushort * FUN_00c29b58(long param_1)

{
  ulong uVar1;
  ushort uVar2;
  ushort uVar3;
  ushort *puVar4;
  ulong uVar5;
  ushort *puVar6;
  ulong uVar7;
  ulong uVar8;
  ushort *puVar9;
  
  pthread_mutex_lock((pthread_mutex_t *)&DAT_00d27e68);
  if (DAT_00d27e90 == (ushort *)0x0) {
    DAT_00d27e90 = (ushort *)&DAT_00d27eac;
    DAT_00d27eac = 0x7d0080;
  }
  else if (DAT_00d27e90 == (ushort *)&DAT_00d280a0) goto LAB_00c29c14;
  uVar5 = param_1 + 3U >> 2;
  uVar1 = uVar5 + 1;
  puVar4 = (ushort *)0x0;
  puVar6 = DAT_00d27e90;
  do {
    puVar9 = puVar6 + 2;
    if (((ulong)puVar9 & 0xf) != 0) {
                    /* try { // try from 00c29c9c to 00c29cbb has its CatchHandler @ 00c29cc4 */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/fallback_malloc.cpp",0x92,
                   &DAT_002ab32c);
    }
    uVar2 = puVar6[1];
    uVar8 = (ulong)uVar2;
    uVar7 = (ulong)((uint)uVar2 - (int)uVar1 & 3);
    if (uVar8 <= uVar1) {
      uVar7 = 0;
    }
    if (uVar7 + uVar1 < uVar8) {
      uVar3 = (ushort)(uVar7 + uVar1);
      uVar2 = uVar2 - uVar3;
      puVar4 = puVar6 + (ulong)uVar2 * 2;
      puVar6[1] = uVar2;
      puVar9 = puVar4 + 2;
      *puVar4 = 0;
      puVar4[1] = uVar3;
      if (((ulong)puVar9 & 0xf) != 0) {
                    /* try { // try from 00c29c3c to 00c29c5b has its CatchHandler @ 00c29cbc */
                    /* WARNING: Subroutine does not return */
        FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/fallback_malloc.cpp",0xa7,
                     &DAT_002ab32c);
      }
      goto code_r0x00c29c80;
    }
    if (uVar5 < uVar8) {
      if (puVar4 == (ushort *)0x0) {
        DAT_00d27e90 = (ushort *)(&DAT_00d27ea0 + (ulong)*puVar6 * 4);
        *puVar6 = 0;
      }
      else {
        *puVar4 = *puVar6;
        *puVar6 = 0;
      }
      goto code_r0x00c29c80;
    }
    uVar2 = *puVar6;
    puVar4 = puVar6;
    puVar6 = (ushort *)(&DAT_00d27ea0 + (ulong)uVar2 * 4);
  } while ((ulong)uVar2 != 0x80);
LAB_00c29c14:
  puVar9 = (ushort *)0x0;
code_r0x00c29c80:
  pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d27e68);
  return puVar9;
}

