/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2c78
 */

undefined8 ZSTD_DCtx_getParameter(long param_1,int param_2,int *param_3)

{
  int iVar1;
  
  if (param_2 < 0x3ea) {
    if (param_2 == 100) {
      iVar1 = 0x1f - (int)LZCOUNT(*(undefined4 *)(param_1 + 0x7638));
    }
    else if (param_2 == 1000) {
      iVar1 = *(int *)(param_1 + 0x7598);
    }
    else {
      if (param_2 != 0x3e9) {
        return 0xffffffffffffffd8;
      }
      iVar1 = *(int *)(param_1 + 0x7670);
    }
  }
  else if (param_2 < 0x3ec) {
    if (param_2 == 0x3ea) {
      iVar1 = *(int *)(param_1 + 0x759c);
    }
    else {
      if (param_2 != 0x3eb) {
        return 0xffffffffffffffd8;
      }
      iVar1 = *(int *)(param_1 + 0x7610);
    }
  }
  else if (param_2 == 0x3ec) {
    iVar1 = *(int *)(param_1 + 0x7614);
  }
  else {
    if (param_2 != 0x3ed) {
      return 0xffffffffffffffd8;
    }
    iVar1 = *(int *)(param_1 + 0x7618);
  }
  *param_3 = iVar1;
  return 0;
}

