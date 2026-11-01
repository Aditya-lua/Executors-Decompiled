
void FUN_004764b8(long param_1,uint param_2,undefined8 param_3,undefined8 param_4)

{
  long in_x9;
  long unaff_x29;
  
  if (((param_2 & 0xffff) == 0) || ((param_2 & 0xffff) != 0)) {
    in_x9 = in_x9 + -1;
    *(undefined1 *)(unaff_x29 + -5 + in_x9) =
         *(undefined1 *)(param_1 + (ulong)((param_2 & 0xf) << 1) + 1);
  }
  func_0x00468684(param_4,param_3,1,0,unaff_x29 + -5 + in_x9,5 - in_x9);
  return;
}

