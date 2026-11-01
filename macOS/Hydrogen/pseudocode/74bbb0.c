
/* WARNING: Possible PIC construction at 0x0074bc00: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0074bc40: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0074bcfc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0074bc44) */
/* WARNING: Removing unreachable block (ram,0x0074bc04) */
/* WARNING: Removing unreachable block (ram,0x0074bd00) */
/* WARNING: Removing unreachable block (ram,0x0074bd04) */

undefined8 FUN_0074bbb0(long param_1,undefined8 param_2,ulong param_3)

{
  char *pcVar1;
  undefined8 uVar2;
  long *plVar3;
  uint unaff_w19;
  long unaff_x21;
  long unaff_x22;
  char *unaff_x23;
  char *pcVar4;
  long lVar5;
  
  if (((param_3 & 1) == 0) || (*(char *)(*(long *)(param_1 + 0x18) + 0x4c0) != 'A')) {
LAB_0074bd08:
    plVar3 = *(long **)(unaff_x21 + 8);
  }
  else {
    lVar5 = *(long *)(unaff_x21 + 0x10);
    if (unaff_x22 != 0) {
      if (*(char *)(lVar5 + 0x20) != '\0') {
        if (*unaff_x23 != '\n') {
          plVar3 = *(long **)(unaff_x21 + 8);
          goto code_r0x00773be4;
        }
        *(undefined1 *)(lVar5 + 0x20) = 0;
      }
      pcVar1 = (char *)_memchr();
      if (pcVar1 == (char *)0x0) goto LAB_0074bd08;
      if (pcVar1 != unaff_x23) {
        plVar3 = *(long **)(unaff_x21 + 8);
        goto code_r0x00773be4;
      }
      *(undefined1 *)(lVar5 + 0x20) = 1;
      while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
        pcVar4 = pcVar1 + 1;
        if ((*pcVar4 != '\n') &&
           (uVar2 = func_0x00773be4(param_1,*(undefined8 *)(unaff_x21 + 8),unaff_w19 & 0xffffff7f,
                                    &UNK_008cd22e,1), (int)uVar2 != 0)) {
          return uVar2;
        }
        *(undefined1 *)(lVar5 + 0x20) = 0;
        pcVar1 = (char *)_memchr(pcVar4,0xd,unaff_x22);
        if (pcVar1 == (char *)0x0) goto LAB_0074bd08;
        if (pcVar1 != pcVar4) {
          plVar3 = *(long **)(unaff_x21 + 8);
          goto code_r0x00773be4;
        }
        *(undefined1 *)(lVar5 + 0x20) = 1;
      }
    }
    if ((unaff_w19 >> 7 & 1) == 0) {
      return 0;
    }
    if (*(char *)(lVar5 + 0x20) == '\0') {
      plVar3 = *(long **)(unaff_x21 + 8);
    }
    else {
      *(undefined1 *)(lVar5 + 0x20) = 0;
      plVar3 = *(long **)(unaff_x21 + 8);
    }
  }
code_r0x00773be4:
  if (plVar3 == (long *)0x0) {
    return 0x17;
  }
                    /* WARNING: Could not recover jumptable at 0x00773bf0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (**(code **)(*plVar3 + 0x18))(param_1);
  return uVar2;
}

