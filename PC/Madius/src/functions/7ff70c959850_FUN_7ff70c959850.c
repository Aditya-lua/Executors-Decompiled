/* 7ff70c959850 FUN_7ff70c959850 */

undefined8 FUN_7ff70c959850(longlong param_1,uint param_2)

{
  longlong lVar1;
  
  lVar1 = *(longlong *)(param_1 + 0xe8);
  if (lVar1 != 0) {
    if (((*(uint *)(lVar1 + 4) >> (param_2 & 0x1f) & 1) != 0) &&
       (*(code **)(lVar1 + 0x10) != (code *)0x0)) {
      (**(code **)(lVar1 + 0x10))();
    }
    return 0;
  }
  return 3;
}


