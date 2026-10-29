/* 7ff70c9586d0 FUN_7ff70c9586d0 */

longlong FUN_7ff70c9586d0(longlong *param_1,longlong *param_2)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar1 = 0x7fffffffffffffff;
  lVar2 = *param_1 - *param_2;
  if (lVar2 < 0x20c49ba5e353f7) {
    if (lVar2 < -0x20c49ba5e353f6) {
      return -0x8000000000000000;
    }
    lVar1 = (longlong)(((int)param_1[1] - (int)param_2[1]) / 1000) + lVar2 * 1000;
  }
  return lVar1;
}


