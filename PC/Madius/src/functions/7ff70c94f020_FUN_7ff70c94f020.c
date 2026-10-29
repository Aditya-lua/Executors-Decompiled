/* 7ff70c94f020 FUN_7ff70c94f020 */

void FUN_7ff70c94f020(longlong param_1,undefined1 param_2)

{
  longlong lVar1;
  
  if ((param_1 != 0) &&
     ((lVar1 = *(longlong *)(param_1 + 0xe0), lVar1 != 0 ||
      (lVar1 = *(longlong *)(param_1 + 0xd8), lVar1 != 0)))) {
    *(undefined1 *)(lVar1 + 0x1b3) = param_2;
  }
  return;
}


