/* 7ff70c9420b0 FUN_7ff70c9420b0 */

void FUN_7ff70c9420b0(longlong param_1)

{
  if ((*(longlong *)(param_1 + 0xe8) != 0) &&
     ((*(byte *)(*(longlong *)(param_1 + 0xe8) + 4) & 0x10) != 0)) {
    FUN_7ff70c959850(param_1,4,2);
    return;
  }
  return;
}


