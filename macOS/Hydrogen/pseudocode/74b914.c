
undefined8 FUN_0074b914(char *param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  char cVar4;
  byte bVar5;
  long unaff_x19;
  char *unaff_x20;
  char *pcVar6;
  long unaff_x22;
  byte bVar7;
  long unaff_x23;
  long in_stack_00000000;
  char *in_stack_00000008;
  
  do {
    param_2 = param_2 + 1;
    while( true ) {
      param_1 = param_1 + 1;
      if (*param_1 == '/') break;
      if (*param_1 == '\0') {
        if (param_2 != 0) {
          lVar2 = (*pcRam0000000000a2b608)(param_2,8);
          *(long *)(unaff_x22 + 0x4a8) = lVar2;
          if (lVar2 == 0) goto LAB_0074b9c0;
          lVar2 = _strchr();
          if (lVar2 != 0) goto LAB_0074b984;
        }
        if (unaff_x20 == (char *)0x0) goto LAB_0074ba2c;
        goto LAB_0074b9e0;
      }
    }
  } while( true );
LAB_0074b984:
  do {
    if (lVar2 - (long)unaff_x20 == 0) {
      if (*(int *)(unaff_x22 + 0x4e0) == 0) {
        lVar3 = func_0x0077e93c(unaff_x20,1);
        if (lVar3 != 0) goto LAB_0074b998;
LAB_0074b9c0:
        (*pcRam0000000000a2b5f0)(in_stack_00000008);
        return 0x1b;
      }
    }
    else {
      lVar3 = func_0x0077e93c(unaff_x20,lVar2 - (long)unaff_x20);
      if (lVar3 == 0) goto LAB_0074b9c0;
LAB_0074b998:
      iVar1 = *(int *)(unaff_x22 + 0x4e0);
      *(int *)(unaff_x22 + 0x4e0) = iVar1 + 1;
      *(long *)(*(long *)(unaff_x22 + 0x4a8) + (long)iVar1 * 8) = lVar3;
    }
    unaff_x20 = (char *)(lVar2 + 1);
    lVar2 = _strchr(unaff_x20,0x2f);
  } while (lVar2 != 0);
LAB_0074b9e0:
  if (*unaff_x20 == '\0') {
LAB_0074ba2c:
    lVar2 = 0;
    *(undefined8 *)(unaff_x22 + 0x4a0) = 0;
    if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) goto code_r0x0074ba10;
code_r0x0074ba40:
    if (*(int *)(unaff_x23 + 0x10) == 0) {
      func_0x0073c9e4();
      (*pcRam0000000000a2b5f0)(in_stack_00000008);
      return 3;
    }
    lVar2 = 0;
    bVar5 = *(byte *)(unaff_x22 + 0x4fa);
    bVar7 = bVar5 & 0xf7;
    *(byte *)(unaff_x22 + 0x4fa) = bVar7;
    cVar4 = *(char *)(unaff_x19 + 0x6bc);
    if (cVar4 == '\x02') goto code_r0x0074ba64;
code_r0x0074ba80:
    bVar5 = bVar7;
    if ((*(byte *)(unaff_x22 + 0x398) >> 6 & 1) == 0) {
      pcVar6 = "";
    }
    else {
      pcVar6 = *(char **)(unaff_x22 + 0x4b8);
      if (pcVar6 == (char *)0x0) goto code_r0x0074bae4;
    }
    if (cVar4 == '\x02') {
      in_stack_00000000 = 0;
    }
    else {
      lVar3 = 0;
      if (lVar2 != 0) {
        lVar3 = _strlen();
      }
      in_stack_00000000 = in_stack_00000000 - lVar3;
    }
    lVar2 = _strlen(pcVar6);
    if (((lVar2 != in_stack_00000000) || (in_stack_00000008 == (char *)0x0)) ||
       (iVar1 = _strncmp(in_stack_00000008,pcVar6,in_stack_00000000), iVar1 != 0))
    goto code_r0x0074bae4;
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
      bVar5 = *(byte *)(unaff_x22 + 0x4fa);
    }
  }
  else {
    lVar2 = (*pcRam0000000000a2b600)(unaff_x20);
    *(long *)(unaff_x22 + 0x4a0) = lVar2;
    if ((((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) != 0) && (lVar2 == 0)) goto code_r0x0074ba40;
code_r0x0074ba10:
    bVar5 = *(byte *)(unaff_x22 + 0x4fa);
    bVar7 = bVar5 & 0xf7;
    *(byte *)(unaff_x22 + 0x4fa) = bVar7;
    cVar4 = *(char *)(unaff_x19 + 0x6bc);
    if (cVar4 != '\x02') goto code_r0x0074ba80;
code_r0x0074ba64:
    if (*in_stack_00000008 != '/') goto code_r0x0074ba80;
  }
  *(byte *)(unaff_x22 + 0x4fa) = bVar5 | 8;
code_r0x0074bae4:
  (*pcRam0000000000a2b5f0)(in_stack_00000008);
  return 0;
}

