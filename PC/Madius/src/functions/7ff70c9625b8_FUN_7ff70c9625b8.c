/* 7ff70c9625b8 FUN_7ff70c9625b8 */

void FUN_7ff70c9625b8(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  longlong lVar1;
  
  for (lVar1 = FUN_7ff70c9632b0(param_1,*param_2,0,param_2[1]); lVar1 != -1;
      lVar1 = FUN_7ff70c9632b0(param_1,*param_2,lVar1 + 1,param_2[1])) {
    FUN_7ff70ca3cde0(param_1,lVar1,param_2[1],*param_3,param_3[1]);
  }
  return;
}


