/* 7ff70c9632b0 FUN_7ff70c9632b0 */

ulonglong FUN_7ff70c9632b0(undefined8 *param_1,undefined8 param_2,ulonglong param_3,
                          ulonglong param_4)

{
  ulonglong uVar1;
  longlong lVar2;
  ulonglong uVar3;
  
  uVar1 = param_1[2];
  if (0xf < (ulonglong)param_1[3]) {
    param_1 = (undefined8 *)*param_1;
  }
  uVar3 = 0xffffffffffffffff;
  if (param_3 <= uVar1 - param_4 && param_4 <= uVar1) {
    if (param_4 == 0) {
      return param_3;
    }
    lVar2 = thunk_FUN_7ff70caa61d0(param_3 + (longlong)param_1,uVar1 + (longlong)param_1,param_2);
    uVar3 = 0xffffffffffffffff;
    if (lVar2 != uVar1 + (longlong)param_1) {
      uVar3 = lVar2 - (longlong)param_1;
    }
  }
  return uVar3;
}


