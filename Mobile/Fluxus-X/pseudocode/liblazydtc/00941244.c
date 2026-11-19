/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941244
 */

undefined8 FUN_00941244(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  if ((*(byte *)(param_1 + 0x128) >> 4 & 1) != 0) {
    return 0;
  }
  if ((-1 < *(long *)(param_1 + 0xad0)) && (*(long *)(param_1 + 800) != 0)) {
    if (*(long *)(param_1 + 0xad0) < *(long *)(param_1 + 0x318)) {
      if (*(long *)(param_1 + 0xc40) == 0) {
        *(undefined8 *)(param_1 + 0xc40) = param_2;
        *(undefined8 *)(param_1 + 0xc48) = param_3;
        lVar1 = *(long *)(param_1 + 0x318);
        goto joined_r0x009412d0;
      }
      lVar1 = FUN_00941d54(param_2,param_3,*(long *)(param_1 + 0xc40),
                           *(undefined8 *)(param_1 + 0xc48));
      if (*(long *)(param_1 + 800) * 1000 <= lVar1) {
        FUN_00904b80(param_1,
                     "Operation too slow. Less than %ld bytes/sec transferred the last %ld seconds",
                     *(undefined8 *)(param_1 + 0x318));
        return 0x1c;
      }
    }
    else {
      *(undefined8 *)(param_1 + 0xc40) = 0;
    }
  }
  lVar1 = *(long *)(param_1 + 0x318);
joined_r0x009412d0:
  if (lVar1 != 0) {
    FUN_0092aff8(param_1,1000,9);
  }
  return 0;
}

