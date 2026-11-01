
void FUN_00156680(undefined4 *param_1,long *param_2,long param_3)

{
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  
  param_2[0xe99] = in_x10;
  param_2[0xe9a] = in_x10;
  param_2[0xe9b] = in_x10 + in_x11;
  param_2[0xe98] = in_x10 + in_x11;
  if (in_x9[0xa1] == 0) {
    param_2[0xea6] = 0;
    return;
  }
  *param_2 = param_3 + 0x18;
  param_2[1] = (long)(&UNK_00001828 + param_3);
  param_2[0xea6] = 0x100000001;
  param_2[2] = (long)(
                     "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                     + param_3 + 0x30);
  param_2[3] = (long)(&UNK_00002830 + param_3);
  *param_1 = *in_x9;
  param_1[1] = in_x9[1];
  param_1[2] = in_x9[2];
  return;
}

