/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2b1c
 */

undefined8 ZSTD_DCtx_setParameter(long param_1,int param_2,uint param_3)

{
  uint uVar1;
  
  if (*(int *)(param_1 + 0x761c) != 0) {
    return 0xffffffffffffffc4;
  }
  if (param_2 < 0x3ea) {
    if (param_2 == 100) {
      uVar1 = 0x1b;
      if (param_3 != 0) {
        uVar1 = param_3;
      }
      if (uVar1 - 0x20 < 0xffffffea) {
        return 0xffffffffffffffd6;
      }
      *(long *)(param_1 + 0x7638) = 1L << ((ulong)uVar1 & 0x3f);
      return 0;
    }
    if (param_2 == 1000) {
      if (param_3 < 2) {
        *(uint *)(param_1 + 0x7598) = param_3;
        return 0;
      }
      return 0xffffffffffffffd6;
    }
    if (param_2 == 0x3e9) {
      if (param_3 < 2) {
        *(uint *)(param_1 + 0x7670) = param_3;
        return 0;
      }
      return 0xffffffffffffffd6;
    }
  }
  else if (param_2 < 0x3ec) {
    if (param_2 == 0x3ea) {
      if (param_3 < 2) {
        *(uint *)(param_1 + 0x759c) = param_3;
        return 0;
      }
      return 0xffffffffffffffd6;
    }
    if (param_2 == 0x3eb) {
      if (1 < param_3) {
        return 0xffffffffffffffd6;
      }
      if (*(long *)(param_1 + 0x75d8) == 0) {
        *(uint *)(param_1 + 0x7610) = param_3;
        return 0;
      }
    }
  }
  else {
    if (param_2 == 0x3ec) {
      if (param_3 < 2) {
        *(uint *)(param_1 + 0x7614) = param_3;
        return 0;
      }
      return 0xffffffffffffffd6;
    }
    if (param_2 == 0x3ed) {
      if ((param_3 == 0) || (0xfffe03fe < param_3 - 0x20001)) {
        *(uint *)(param_1 + 0x7618) = param_3;
        return 0;
      }
      return 0xffffffffffffffd6;
    }
  }
  return 0xffffffffffffffd8;
}

