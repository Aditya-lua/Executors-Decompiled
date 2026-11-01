
void FUN_0077261c(long param_1)

{
  char *pcVar1;
  long lVar2;
  
  func_0x0075216c();
  if (*(long *)((long)&dylib_command_00001108.dylib.current_version + param_1) == 0) {
    *(undefined8 *)((long)&dylib_command_00001108.dylib.current_version + param_1) = 1;
    lVar2 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                     param_1);
  }
  else {
    lVar2 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                     param_1);
  }
  if (lVar2 == 0) {
    pcVar1 = "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" + param_1;
    pcVar1[0] = '\x01';
    pcVar1[1] = '\0';
    pcVar1[2] = '\0';
    pcVar1[3] = '\0';
    pcVar1[4] = '\0';
    pcVar1[5] = '\0';
    pcVar1[6] = '\0';
    pcVar1[7] = '\0';
    *(undefined4 *)(*(long *)(param_1 + 0x18) + 0x408) = 0xffffffff;
    return;
  }
  *(undefined4 *)(*(long *)(param_1 + 0x18) + 0x408) = 0xffffffff;
  return;
}

