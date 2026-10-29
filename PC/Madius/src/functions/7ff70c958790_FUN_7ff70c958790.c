/* 7ff70c958790 FUN_7ff70c958790 */

longlong FUN_7ff70c958790(longlong *param_1,longlong *param_2)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar1 = 0x7fffffffffffffff;
  lVar2 = *param_1 - *param_2;
  if (lVar2 < 0x8637bd05af6) {
    if (lVar2 < -0x8637bd05af5) {
      return -0x8000000000000000;
    }
    lVar1 = ((longlong)(int)param_1[1] + lVar2 * 1000000) - (longlong)(int)param_2[1];
  }
  return lVar1;
}


