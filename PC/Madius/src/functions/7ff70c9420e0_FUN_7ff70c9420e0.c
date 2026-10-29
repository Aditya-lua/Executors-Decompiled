/* 7ff70c9420e0 FUN_7ff70c9420e0 */

void FUN_7ff70c9420e0(longlong param_1)

{
  if ((*(longlong *)(param_1 + 0xe8) != 0) &&
     ((*(byte *)(*(longlong *)(param_1 + 0xe8) + 4) & 0x10) != 0)) {
    FUN_7ff70c959890(param_1,4);
    return;
  }
  return;
}


