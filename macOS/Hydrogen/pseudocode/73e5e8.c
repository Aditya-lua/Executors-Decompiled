
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0073e5e8(void)

{
  byte bVar1;
  char cVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  undefined1 *puVar6;
  char *pcVar7;
  undefined8 uVar8;
  long unaff_x19;
  char *pcVar9;
  char *pcVar10;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  iVar4 = func_0x0077e76c(in_stack_00000018,"/MATCH:",7);
  if (((iVar4 == 0) && (iVar4 = func_0x0077e76c(in_stack_00000018,"/M:",3), iVar4 == 0)) &&
     (iVar4 = func_0x0077e76c(in_stack_00000018,"/FIND:",6), iVar4 == 0)) {
    iVar4 = func_0x0077e76c(in_stack_00000018,"/DEFINE:",8);
    if (((iVar4 == 0) && (iVar4 = func_0x0077e76c(in_stack_00000018,"/D:",3), iVar4 == 0)) &&
       (iVar4 = func_0x0077e76c(in_stack_00000018,"/LOOKUP:",8), iVar4 == 0)) {
      pcVar9 = (char *)_strchr(in_stack_00000018,0x2f);
      if (pcVar9 == (char *)0x0) {
        lVar5 = 0;
        uVar8 = 0;
      }
      else {
        do {
          while( true ) {
            pcVar9 = pcVar9 + 1;
            if (*pcVar9 != ':') break;
            *pcVar9 = ' ';
          }
        } while (*pcVar9 != '\0');
        uVar8 = func_0x0073eae4();
        if ((int)uVar8 == 0) {
          func_0x00783e98();
        }
        else {
          func_0x0073c9e4();
        }
        lVar5 = 0;
      }
      goto code_r0x0073e93c;
    }
    lVar5 = _strchr(in_stack_00000018,0x3a);
    if (lVar5 == 0) {
code_r0x0073e8ac:
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      pcVar9 = "default";
    }
    else {
      pcVar9 = (char *)(lVar5 + 1);
      puVar6 = (undefined1 *)_strchr(pcVar9,0x3a);
      if (puVar6 != (undefined1 *)0x0) {
        *puVar6 = 0;
        puVar6 = (undefined1 *)_strchr(puVar6 + 1,0x3a);
        if (puVar6 != (undefined1 *)0x0) {
          *puVar6 = 0;
        }
      }
      if (*pcVar9 == '\0') goto code_r0x0073e8ac;
    }
    lVar5 = func_0x0073ea0c(pcVar9);
    if (lVar5 == 0) goto code_r0x0073e938;
    uVar8 = func_0x0073eae4();
    iVar4 = (int)uVar8;
  }
  else {
    lVar5 = _strchr(in_stack_00000018,0x3a);
    if (lVar5 == 0) {
      pcVar9 = (char *)0x0;
      cVar2 = *(char *)(unaff_x19 + 0xa1d);
joined_r0x0073e6a8:
      if ((cVar2 < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      pcVar10 = "default";
    }
    else {
      pcVar10 = (char *)(lVar5 + 1);
      puVar6 = (undefined1 *)_strchr(pcVar10,0x3a);
      if (puVar6 == (undefined1 *)0x0) {
        pcVar9 = (char *)0x0;
        bVar1 = *pcVar10;
      }
      else {
        *puVar6 = 0;
        pcVar7 = (char *)_strchr(puVar6 + 1,0x3a);
        pcVar9 = pcVar7;
        if (pcVar7 != (char *)0x0) {
          pcVar9 = pcVar7 + 1;
          *pcVar7 = '\0';
          puVar6 = (undefined1 *)_strchr(pcVar9,0x3a);
          if (puVar6 != (undefined1 *)0x0) {
            *puVar6 = 0;
          }
        }
        bVar1 = *pcVar10;
      }
      if (bVar1 == 0) {
        cVar2 = *(char *)(unaff_x19 + 0xa1d);
        goto joined_r0x0073e6a8;
      }
    }
    if ((pcVar9 == (char *)0x0) || (*pcVar9 == '\0')) {
      func_0x0074066c(&uStack0000000000000020,&UNK_00002710);
      bVar1 = *pcVar10;
    }
    else {
      func_0x0074066c(&uStack0000000000000020,&UNK_00002710);
      bVar1 = *pcVar10;
    }
    while (bVar1 != 0) {
      if (((((bVar1 - 0x7f & 0xff) < 0xa2) ||
           ((uVar3 = bVar1 - 0x22, uVar3 < 0x3b &&
            ((1L << ((ulong)uVar3 & 0x3f) & 0x400000000000021U) != 0)))) &&
          (iVar4 = func_0x0074075c(&uStack0000000000000020,"\\",1), iVar4 != 0)) ||
         (iVar4 = func_0x0074075c(&uStack0000000000000020,pcVar10,1), iVar4 != 0)) {
        lVar5 = 0;
        uVar8 = 0x1b;
        goto code_r0x0073e93c;
      }
      pcVar10 = pcVar10 + 1;
      bVar1 = *pcVar10;
    }
    lVar5 = func_0x00740a58(&uStack0000000000000020);
    if (lVar5 == 0) {
code_r0x0073e938:
      uVar8 = 0x1b;
      goto code_r0x0073e93c;
    }
    uVar8 = func_0x0073eae4();
    iVar4 = (int)uVar8;
  }
  if (iVar4 == 0) {
    func_0x00783e98();
  }
  else {
    func_0x0073c9e4();
  }
code_r0x0073e93c:
  (*pcRam0000000000a2b5f0)(lVar5);
  (*pcRam0000000000a2b5f0)(in_stack_00000018);
  return uVar8;
}

