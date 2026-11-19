/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca5f0
 */

undefined4 FUN_009ca5f0(ulong *param_1,ulong *param_2)

{
  long lVar1;
  undefined4 uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar4 = (*param_1 & 0xff00ff00ff00ff00) >> 8 | (*param_1 & 0xff00ff00ff00ff) << 8;
  uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
  uVar3 = uVar4 >> 0x20 | uVar4 << 0x20;
  uVar4 = (*param_2 & 0xff00ff00ff00ff00) >> 8 | (*param_2 & 0xff00ff00ff00ff) << 8;
  uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
  uVar4 = uVar4 >> 0x20 | uVar4 << 0x20;
  lVar1 = uVar3 - uVar4;
  if ((uVar4 <= uVar3 && lVar1 != 0) && (lVar1 < 0)) {
    return 0x80;
  }
  if ((uVar3 < uVar4) && (0 < lVar1)) {
    return 0xffffff80;
  }
  if (0x80 < lVar1) {
    return 0x80;
  }
  uVar2 = (undefined4)lVar1;
  if (lVar1 < -0x7f) {
    uVar2 = 0xffffff80;
  }
  return uVar2;
}

