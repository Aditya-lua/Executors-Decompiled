/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c4258
 */

undefined4
SSL_get_shared_sigalgs
          (long param_1,int param_2,undefined4 *param_3,undefined4 *param_4,undefined4 *param_5,
          undefined1 *param_6,undefined1 *param_7)

{
  undefined4 uVar1;
  long lVar2;
  
  uVar1 = 0;
  if ((-1 < param_2) && (*(long *)(param_1 + 0x1da8) != 0)) {
    if (*(ulong *)(param_1 + 0x1db0) >> 0x1f != 0) {
      return 0;
    }
    uVar1 = 0;
    if (param_2 < (int)*(ulong *)(param_1 + 0x1db0)) {
      lVar2 = *(long *)(*(long *)(param_1 + 0x1da8) + (long)param_2 * 8);
      if (param_4 != (undefined4 *)0x0) {
        *param_4 = *(undefined4 *)(lVar2 + 0xc);
      }
      if (param_3 != (undefined4 *)0x0) {
        *param_3 = *(undefined4 *)(lVar2 + 0x14);
      }
      if (param_5 != (undefined4 *)0x0) {
        *param_5 = *(undefined4 *)(lVar2 + 0x1c);
      }
      if (param_6 != (undefined1 *)0x0) {
        *param_6 = *(undefined1 *)(lVar2 + 8);
      }
      if (param_7 != (undefined1 *)0x0) {
        *param_7 = *(undefined1 *)(lVar2 + 9);
      }
      uVar1 = *(undefined4 *)(param_1 + 0x1db0);
    }
  }
  return uVar1;
}

