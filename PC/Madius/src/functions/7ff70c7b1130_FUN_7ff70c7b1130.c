/* 7ff70c7b1130 FUN_7ff70c7b1130 */

longlong FUN_7ff70c7b1130(undefined8 param_1,undefined8 param_2)

{
  longlong alStack_10 [2];
  
  FUN_7ff70c7b12a0(param_1,alStack_10,param_2);
  if (0xf < *(ulonglong *)(alStack_10[0] + 0x60)) {
    return *(longlong *)(alStack_10[0] + 0x48);
  }
  return alStack_10[0] + 0x48;
}


