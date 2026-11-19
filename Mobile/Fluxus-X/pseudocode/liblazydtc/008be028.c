/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be028
 */

long FUN_008be028(long param_1,long *param_2,uint param_3)

{
  int iVar1;
  long lVar2;
  
  iVar1 = *(int *)((long)param_2 + 0xc);
  if (iVar1 < 0xb) {
    if (iVar1 == 6) {
      lVar2 = *(long *)(*param_2 + 0x10);
      goto joined_r0x008be084;
    }
    if (iVar1 == 8) {
      lVar2 = *(long *)(*param_2 + 8);
      goto joined_r0x008be084;
    }
  }
  else {
    if (iVar1 == 0xb) {
      lVar2 = *(long *)(*param_2 + 0x48);
      goto joined_r0x008be084;
    }
    if (iVar1 == 0xc) {
      lVar2 = *(long *)(*(long *)(*param_2 + 0x10) + 0x50);
      goto joined_r0x008be084;
    }
  }
  lVar2 = *(long *)(*(long *)(param_1 + 0x60) + (long)iVar1 * 8 + 0x448);
joined_r0x008be084:
  if (lVar2 == 0) {
    if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008be140 to 008be143 has its CatchHandler @ 008be158 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1f1e0);
    }
    lVar2 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
  }
  else {
    if ((*(byte *)(lVar2 + 7) >> 1 & 1) == 0) {
      lVar2 = FUN_008bb440(lVar2,*(undefined8 *)
                                  (*(long *)(param_1 + 0x60) + (ulong)param_3 * 8 + 0x338));
      return lVar2;
    }
    lVar2 = *(long *)(lVar2 + 0x20) + (long)(int)~param_3 * 0x10;
  }
  return lVar2;
}

