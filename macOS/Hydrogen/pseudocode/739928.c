
undefined8 FUN_00739928(void)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  ulong uVar4;
  char *pcVar5;
  undefined1 *puVar6;
  ulong uVar7;
  long *plVar8;
  long lVar9;
  undefined8 uVar10;
  long unaff_x19;
  long *plVar11;
  ulong unaff_x20;
  long lVar12;
  int unaff_w22;
  ulong unaff_x23;
  long unaff_x24;
  uint unaff_w25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  do {
    if (unaff_x27 == unaff_x23) goto LAB_00739960;
    if (*(char *)(unaff_x19 + -1) == '.') goto LAB_00739960;
    do {
      do {
        do {
          uVar1 = unaff_w25;
          if ((*(byte *)(unaff_x28 + 0x74) & 1) == 0) {
            uVar1 = 1;
          }
          if (uVar1 != 1) goto LAB_007398b0;
          iVar3 = func_0x0077e6f8();
          if (iVar3 == 0) goto LAB_007398b0;
LAB_00739960:
          do {
            lVar12 = *(long *)(unaff_x28 + 0x58);
            if ((lVar12 == 0) || (uVar4 = _strlen(lVar12), uVar4 == 1)) goto LAB_00739894;
            pcVar5 = (char *)(*pcRam0000000000a2b600)(in_stack_00000010);
            if (pcVar5 != (char *)0x0) {
              puVar6 = (undefined1 *)_strchr(pcVar5,0x3f);
              if (puVar6 != (undefined1 *)0x0) {
                *puVar6 = 0;
              }
              if (*pcVar5 != '/') {
                (*pcRam0000000000a2b5f0)(pcVar5);
                pcVar5 = (char *)func_0x0077e93c("/",1);
                if (pcVar5 == (char *)0x0) goto LAB_007398b0;
              }
              uVar7 = _strlen(pcVar5);
              if ((uVar7 < uVar4) || (iVar3 = _strncmp(lVar12,pcVar5,uVar4), iVar3 != 0)) {
                (*pcRam0000000000a2b5f0)(pcVar5);
              }
              else {
                if (uVar4 == uVar7) {
                  (*pcRam0000000000a2b5f0)(pcVar5);
                }
                else {
                  cVar2 = pcVar5[uVar4];
                  (*pcRam0000000000a2b5f0)(pcVar5);
                  if (cVar2 != '/') goto LAB_007398b0;
                }
LAB_00739894:
                func_0x0075e474(in_stack_00000018,unaff_x28,unaff_x28 + 0x20);
                unaff_x20 = unaff_x20 + 1;
                if (0x95 < unaff_x20) {
                  if (((in_stack_00000008 != 0) && (*(char *)(in_stack_00000008 + 0xa1d) < '\0')) &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + in_stack_00000008 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + in_stack_00000008 + 0x18) + 8))))) {
                    func_0x0073cab8(in_stack_00000008,
                                    "Included max number of cookies (%zu) in request!");
                  }
code_r0x00739a50:
                  plVar8 = (long *)(*pcRam0000000000a2b5e8)(unaff_x20 << 3);
                  if (plVar8 == (long *)0x0) {
                    func_0x0075e680(in_stack_00000018,0);
                    uVar10 = 2;
                  }
                  else {
                    lVar12 = func_0x00740a58(in_stack_00000018);
                    if (lVar12 != 0) {
                      plVar11 = plVar8;
                      do {
                        lVar9 = func_0x00156654(lVar12);
                        *plVar11 = lVar9;
                        lVar12 = func_0x006f4058(lVar12);
                        plVar11 = plVar11 + 1;
                      } while (lVar12 != 0);
                    }
                    _qsort(plVar8,unaff_x20,8,&DAT_00739b68);
                    func_0x0075e680(in_stack_00000018,0);
                    if (unaff_x20 != 0) {
                      plVar11 = plVar8;
                      do {
                        func_0x0075e474(in_stack_00000018,*plVar11,*plVar11 + 0x20);
                        unaff_x20 = unaff_x20 - 1;
                        plVar11 = plVar11 + 1;
                      } while (unaff_x20 != 0);
                    }
                    (*pcRam0000000000a2b5f0)(plVar8);
code_r0x00739af8:
                    uVar10 = 0;
                  }
                  return uVar10;
                }
              }
            }
LAB_007398b0:
            do {
              unaff_x26 = func_0x006f4058(unaff_x26);
              if (unaff_x26 == 0) {
                if (unaff_x20 == 0) goto code_r0x00739af8;
                goto code_r0x00739a50;
              }
              unaff_x28 = func_0x00156654(unaff_x26);
            } while (((*(byte *)(unaff_x28 + 0x74) >> 1 & 1) != 0) && (unaff_w22 == 0));
            lVar12 = *(long *)(unaff_x28 + 0x60);
          } while (lVar12 == 0);
          uVar1 = unaff_w25;
          if ((*(byte *)(unaff_x28 + 0x74) & 1) == 0) {
            uVar1 = 1;
          }
        } while ((uVar1 & 1) != 0);
        unaff_x23 = _strlen(lVar12);
        unaff_x27 = _strlen();
      } while (unaff_x27 < unaff_x23);
      unaff_x19 = (unaff_x24 + unaff_x27) - unaff_x23;
      iVar3 = func_0x0077e76c(lVar12,unaff_x19,unaff_x23);
    } while (iVar3 == 0);
  } while( true );
}

