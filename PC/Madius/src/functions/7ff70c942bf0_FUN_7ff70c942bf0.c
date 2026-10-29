/* 7ff70c942bf0 FUN_7ff70c942bf0 */

undefined8 FUN_7ff70c942bf0(longlong param_1,longlong param_2,ulonglong *param_3)

{
  longlong lVar1;
  ulonglong uVar2;
  
  lVar1 = FUN_7ff70cb12e80(param_2);
  if (lVar1 == 0) {
    uVar2 = 0;
    if (*(int *)(param_1 + 0x6bc) == 0) {
      return 0;
    }
  }
  else {
    uVar2 = lVar1 - (ulonglong)(*(char *)(param_2 + -1 + lVar1) == '.');
    if (*(uint *)(param_1 + 0x6bc) <= uVar2) {
      return 0;
    }
  }
  FUN_7ff70c959390(*(undefined8 *)(param_1 + 0xc40),param_2,uVar2);
  *(undefined1 *)(*(longlong *)(param_1 + 0xc40) + uVar2) = 0;
  if (param_3 != (ulonglong *)0x0) {
    *param_3 = uVar2;
  }
  return *(undefined8 *)(param_1 + 0xc40);
}


