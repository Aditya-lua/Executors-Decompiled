
void FUN_006616c0(long param_1)

{
  undefined8 *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  
  *unaff_x21 = param_1 + 0xf80;
  unaff_x19[4] = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
                 param_1 + 0x30;
  unaff_x19[5] = "/System/Library/Frameworks/SystemConfiguration.framework/Versions/A/SystemConfiguration"
                 + param_1 + 0x40;
  func_0x00630464(unaff_x19 + 0x44);
  unaff_x19[4] = &UNK_009fb7d0;
  unaff_x19[5] = &UNK_009fb8a0;
  *unaff_x19 = &UNK_00a0bc90;
  unaff_x19[1] = &UNK_00a0bd78;
  unaff_x19[2] = &UNK_00a0bdd0;
  unaff_x19[3] = &UNK_009fb720;
  (**(code **)(*unaff_x20 + 0x30))();
  (**(code **)(*unaff_x21 + 0x60))();
  return;
}

