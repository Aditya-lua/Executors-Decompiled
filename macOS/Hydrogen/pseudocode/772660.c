
void FUN_00772660(void)

{
  char *pcVar1;
  long unaff_x19;
  
  if (*(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
               unaff_x19) == 0) {
    pcVar1 = "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" + unaff_x19
    ;
    pcVar1[0] = '\x01';
    pcVar1[1] = '\0';
    pcVar1[2] = '\0';
    pcVar1[3] = '\0';
    pcVar1[4] = '\0';
    pcVar1[5] = '\0';
    pcVar1[6] = '\0';
    pcVar1[7] = '\0';
    *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x408) = 0xffffffff;
    return;
  }
  *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x408) = 0xffffffff;
  return;
}

