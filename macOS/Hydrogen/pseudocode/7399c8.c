
undefined8 FUN_007399c8(void)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  ulong uVar4;
  undefined1 *puVar5;
  char *pcVar6;
  ulong uVar7;
  long *plVar8;
  undefined8 uVar9;
  long lVar10;
  long *plVar11;
  ulong unaff_x20;
  long lVar12;
  long unaff_x21;
  int unaff_w22;
  long unaff_x24;
  uint unaff_w25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  do {
    pcVar6 = (char *)func_0x0077e93c("/",1);
    if (pcVar6 == (char *)0x0) goto LAB_007398b0;
    do {
      uVar7 = _strlen(pcVar6);
      if ((uVar7 < unaff_x27) || (iVar3 = _strncmp(unaff_x21,pcVar6,unaff_x27), iVar3 != 0)) {
        (*pcRam0000000000a2b5f0)(pcVar6);
      }
      else {
        if (unaff_x27 == uVar7) {
          (*pcRam0000000000a2b5f0)(pcVar6);
          goto LAB_00739894;
        }
        cVar2 = pcVar6[unaff_x27];
        (*pcRam0000000000a2b5f0)(pcVar6);
        if (cVar2 == '/') goto LAB_00739894;
      }
LAB_007398b0:
      do {
        do {
          unaff_x26 = func_0x006f4058(unaff_x26);
          if (unaff_x26 == 0) {
            if (unaff_x20 == 0) goto code_r0x00739af8;
code_r0x00739a50:
            plVar8 = (long *)(*pcRam0000000000a2b5e8)(unaff_x20 << 3);
            if (plVar8 == (long *)0x0) {
              func_0x0075e680(in_stack_00000018,0);
              uVar9 = 2;
            }
            else {
              lVar12 = func_0x00740a58(in_stack_00000018);
              if (lVar12 != 0) {
                plVar11 = plVar8;
                do {
                  lVar10 = func_0x00156654(lVar12);
                  *plVar11 = lVar10;
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
              uVar9 = 0;
            }
            return uVar9;
          }
          unaff_x28 = func_0x00156654(unaff_x26);
        } while (((*(byte *)(unaff_x28 + 0x74) >> 1 & 1) != 0) && (unaff_w22 == 0));
        lVar12 = *(long *)(unaff_x28 + 0x60);
        if (lVar12 != 0) {
          uVar1 = unaff_w25;
          if ((*(byte *)(unaff_x28 + 0x74) & 1) == 0) {
            uVar1 = 1;
          }
          if ((uVar1 & 1) == 0) {
            uVar7 = _strlen(lVar12);
            uVar4 = _strlen();
            if (uVar7 <= uVar4) {
              lVar10 = (unaff_x24 + uVar4) - uVar7;
              iVar3 = func_0x0077e76c(lVar12,lVar10,uVar7);
              if ((iVar3 != 0) && ((uVar4 == uVar7 || (*(char *)(lVar10 + -1) == '.'))))
              goto code_r0x00739960;
            }
          }
          uVar1 = unaff_w25;
          if ((*(byte *)(unaff_x28 + 0x74) & 1) == 0) {
            uVar1 = 1;
          }
          if ((uVar1 != 1) || (iVar3 = func_0x0077e6f8(), iVar3 == 0)) goto LAB_007398b0;
        }
code_r0x00739960:
        unaff_x21 = *(long *)(unaff_x28 + 0x58);
        if ((unaff_x21 == 0) || (unaff_x27 = _strlen(unaff_x21), unaff_x27 == 1)) {
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
              func_0x0073cab8(in_stack_00000008,"Included max number of cookies (%zu) in request!");
            }
            goto code_r0x00739a50;
          }
          goto LAB_007398b0;
        }
        pcVar6 = (char *)(*pcRam0000000000a2b600)(in_stack_00000010);
      } while (pcVar6 == (char *)0x0);
      puVar5 = (undefined1 *)_strchr(pcVar6,0x3f);
      if (puVar5 != (undefined1 *)0x0) {
        *puVar5 = 0;
      }
    } while (*pcVar6 == '/');
    (*pcRam0000000000a2b5f0)(pcVar6);
  } while( true );
}

