
undefined8 FUN_007398f0(long param_1)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  char *pcVar6;
  undefined1 *puVar7;
  long *plVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  long *plVar12;
  ulong unaff_x20;
  long unaff_x21;
  int unaff_w22;
  long unaff_x24;
  uint unaff_w25;
  long unaff_x26;
  long unaff_x28;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  do {
    uVar4 = _strlen(param_1);
    uVar5 = _strlen();
    if (uVar4 <= uVar5) {
      lVar11 = (unaff_x24 + uVar5) - uVar4;
      iVar3 = func_0x0077e76c(unaff_x21,lVar11,uVar4);
      if (iVar3 != 0) {
        if (uVar5 == uVar4) goto code_r0x00739960;
        if (*(char *)(lVar11 + -1) == '.') goto code_r0x00739960;
      }
    }
    do {
      uVar1 = unaff_w25;
      if ((*(byte *)(unaff_x28 + 0x74) & 1) == 0) {
        uVar1 = 1;
      }
      if (uVar1 != 1) goto code_r0x007398b0;
      iVar3 = func_0x0077e6f8();
      if (iVar3 == 0) goto code_r0x007398b0;
code_r0x00739960:
      do {
        lVar11 = *(long *)(unaff_x28 + 0x58);
        if ((lVar11 == 0) || (uVar4 = _strlen(lVar11), uVar4 == 1)) goto code_r0x00739894;
        pcVar6 = (char *)(*pcRam0000000000a2b600)(in_stack_00000010);
        if (pcVar6 != (char *)0x0) {
          puVar7 = (undefined1 *)_strchr(pcVar6,0x3f);
          if (puVar7 != (undefined1 *)0x0) {
            *puVar7 = 0;
          }
          if (*pcVar6 != '/') {
            (*pcRam0000000000a2b5f0)(pcVar6);
            pcVar6 = (char *)func_0x0077e93c("/",1);
            if (pcVar6 == (char *)0x0) goto code_r0x007398b0;
          }
          uVar5 = _strlen(pcVar6);
          if ((uVar5 < uVar4) || (iVar3 = _strncmp(lVar11,pcVar6,uVar4), iVar3 != 0)) {
            (*pcRam0000000000a2b5f0)(pcVar6);
          }
          else {
            if (uVar4 == uVar5) {
              (*pcRam0000000000a2b5f0)(pcVar6);
            }
            else {
              cVar2 = pcVar6[uVar4];
              (*pcRam0000000000a2b5f0)(pcVar6);
              if (cVar2 != '/') goto code_r0x007398b0;
            }
code_r0x00739894:
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
                func_0x0073cab8(in_stack_00000008,"Included max number of cookies (%zu) in request!"
                               );
              }
code_r0x00739a50:
              plVar8 = (long *)(*pcRam0000000000a2b5e8)(unaff_x20 << 3);
              if (plVar8 == (long *)0x0) {
                func_0x0075e680(in_stack_00000018,0);
                uVar10 = 2;
              }
              else {
                lVar11 = func_0x00740a58(in_stack_00000018);
                if (lVar11 != 0) {
                  plVar12 = plVar8;
                  do {
                    lVar9 = func_0x00156654(lVar11);
                    *plVar12 = lVar9;
                    lVar11 = func_0x006f4058(lVar11);
                    plVar12 = plVar12 + 1;
                  } while (lVar11 != 0);
                }
                _qsort(plVar8,unaff_x20,8,&DAT_00739b68);
                func_0x0075e680(in_stack_00000018,0);
                if (unaff_x20 != 0) {
                  plVar12 = plVar8;
                  do {
                    func_0x0075e474(in_stack_00000018,*plVar12,*plVar12 + 0x20);
                    unaff_x20 = unaff_x20 - 1;
                    plVar12 = plVar12 + 1;
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
code_r0x007398b0:
        do {
          unaff_x26 = func_0x006f4058(unaff_x26);
          if (unaff_x26 == 0) {
            if (unaff_x20 == 0) goto code_r0x00739af8;
            goto code_r0x00739a50;
          }
          unaff_x28 = func_0x00156654(unaff_x26);
        } while (((*(byte *)(unaff_x28 + 0x74) >> 1 & 1) != 0) && (unaff_w22 == 0));
        param_1 = *(long *)(unaff_x28 + 0x60);
      } while (param_1 == 0);
      uVar1 = unaff_w25;
      if ((*(byte *)(unaff_x28 + 0x74) & 1) == 0) {
        uVar1 = 1;
      }
    } while ((uVar1 & 1) != 0);
    unaff_x21 = param_1;
  } while( true );
}

