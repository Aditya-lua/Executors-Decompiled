/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c4188
 */

ulong SSL_get_sigalgs(long param_1,int param_2,undefined4 *param_3,undefined4 *param_4,
                     undefined4 *param_5,undefined1 *param_6,undefined1 *param_7)

{
  ulong uVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  
  lVar3 = *(long *)(param_1 + 0x390);
  uVar1 = 0;
  if ((lVar3 != 0) && (uVar5 = *(ulong *)(param_1 + 0x3a0), uVar5 >> 0x1f == 0)) {
    if (-1 < param_2) {
      if ((int)uVar5 <= param_2) {
        return 0;
      }
      lVar4 = (long)param_2;
      if (param_7 != (undefined1 *)0x0) {
        *param_7 = *(undefined1 *)(lVar3 + lVar4 * 2 + 1);
      }
      if (param_6 != (undefined1 *)0x0) {
        *param_6 = *(undefined1 *)(lVar3 + lVar4 * 2);
      }
      lVar3 = FUN_009c21e4(param_1,*(undefined2 *)(lVar3 + lVar4 * 2));
      if (param_3 != (undefined4 *)0x0) {
        if (lVar3 == 0) {
          uVar2 = 0;
        }
        else {
          uVar2 = *(undefined4 *)(lVar3 + 0x14);
        }
        *param_3 = uVar2;
      }
      if (param_4 != (undefined4 *)0x0) {
        if (lVar3 == 0) {
          uVar2 = 0;
        }
        else {
          uVar2 = *(undefined4 *)(lVar3 + 0xc);
        }
        *param_4 = uVar2;
      }
      if (param_5 != (undefined4 *)0x0) {
        if (lVar3 == 0) {
          uVar2 = 0;
        }
        else {
          uVar2 = *(undefined4 *)(lVar3 + 0x1c);
        }
        *param_5 = uVar2;
      }
    }
    uVar1 = uVar5 & 0xffffffff;
  }
  return uVar1;
}

