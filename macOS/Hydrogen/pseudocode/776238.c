
undefined8 FUN_00776238(undefined8 param_1,undefined8 param_2,int param_3)

{
  int in_w9;
  char *pcVar1;
  long unaff_x19;
  
  if (in_w9 < param_3) {
    if (param_3 < 0x27db) {
      if (param_3 == 0x2778) {
        pcVar1 = (char *)(unaff_x19 + 0x6a8);
      }
      else {
        if (param_3 != 0x27cb) {
          return param_2;
        }
        pcVar1 = (char *)(unaff_x19 + 0xa00);
      }
    }
    else if (param_3 == 0x27db) {
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
  }
  else if (param_3 < 0x2737) {
    if (param_3 == 0x2727) {
      pcVar1 = (char *)(unaff_x19 + 0x328);
    }
    else {
      if (param_3 != 0x272c) {
        return param_2;
      }
      pcVar1 = (char *)(unaff_x19 + 0x6c0);
    }
  }
  else if (param_3 == 0x2737) {
    pcVar1 = (char *)(unaff_x19 + 0x6c8);
  }
  else if (param_3 == 0x2756) {
    pcVar1 = (char *)(unaff_x19 + 0x4f0);
  }
  else {
    if (param_3 != 0x276d) {
      return param_2;
    }
    pcVar1 = (char *)(unaff_x19 + 0x6d0);
  }
  *(undefined8 *)pcVar1 = param_1;
  return 0;
}

