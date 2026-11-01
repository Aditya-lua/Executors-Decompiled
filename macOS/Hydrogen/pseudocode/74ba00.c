
undefined8 FUN_0074ba00(long param_1)

{
  int iVar1;
  long lVar2;
  char cVar3;
  byte bVar4;
  long unaff_x19;
  char *pcVar5;
  long unaff_x22;
  byte bVar6;
  long unaff_x23;
  long in_stack_00000000;
  char *in_stack_00000008;
  
  if ((((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) || (param_1 != 0)) {
    bVar4 = *(byte *)(unaff_x22 + 0x4fa);
    bVar6 = bVar4 & 0xf7;
    *(byte *)(unaff_x22 + 0x4fa) = bVar6;
    cVar3 = *(char *)(unaff_x19 + 0x6bc);
    if (cVar3 == '\x02') goto LAB_0074ba64;
LAB_0074ba80:
    bVar4 = bVar6;
    if ((*(byte *)(unaff_x22 + 0x398) >> 6 & 1) == 0) {
      pcVar5 = "";
    }
    else {
      pcVar5 = *(char **)(unaff_x22 + 0x4b8);
      if (pcVar5 == (char *)0x0) goto LAB_0074bae4;
    }
    if (cVar3 == '\x02') {
      in_stack_00000000 = 0;
    }
    else {
      lVar2 = 0;
      if (param_1 != 0) {
        lVar2 = _strlen();
      }
      in_stack_00000000 = in_stack_00000000 - lVar2;
    }
    lVar2 = _strlen(pcVar5);
    if (((lVar2 != in_stack_00000000) || (in_stack_00000008 == (char *)0x0)) ||
       (iVar1 = _strncmp(in_stack_00000008,pcVar5,in_stack_00000000), iVar1 != 0))
    goto LAB_0074bae4;
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
      bVar4 = *(byte *)(unaff_x22 + 0x4fa);
    }
  }
  else {
    if (*(int *)(unaff_x23 + 0x10) == 0) {
      func_0x0073c9e4();
      (*pcRam0000000000a2b5f0)(in_stack_00000008);
      return 3;
    }
    param_1 = 0;
    bVar4 = *(byte *)(unaff_x22 + 0x4fa);
    bVar6 = bVar4 & 0xf7;
    *(byte *)(unaff_x22 + 0x4fa) = bVar6;
    cVar3 = *(char *)(unaff_x19 + 0x6bc);
    if (cVar3 != '\x02') goto LAB_0074ba80;
LAB_0074ba64:
    if (*in_stack_00000008 != '/') goto LAB_0074ba80;
  }
  *(byte *)(unaff_x22 + 0x4fa) = bVar4 | 8;
LAB_0074bae4:
  (*pcRam0000000000a2b5f0)(in_stack_00000008);
  return 0;
}

