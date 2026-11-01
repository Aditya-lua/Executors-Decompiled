
undefined8 FUN_00776284(undefined8 param_1,undefined8 param_2,int param_3)

{
  char *pcVar1;
  long unaff_x19;
  
  if (param_3 == 0x27db) {
    *(undefined8 *)(unaff_x19 + 0x4f8) = param_1;
    pcVar1 = "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
             unaff_x19 + 0x38;
  }
  else if (param_3 == 0x2803) {
    pcVar1 = (char *)(unaff_x19 + 0x500);
  }
  else {
    if (param_3 != 0x27f4) {
      return param_2;
    }
    pcVar1 = (char *)(unaff_x19 + 0x680);
  }
  *(undefined8 *)pcVar1 = param_1;
  return 0;
}

