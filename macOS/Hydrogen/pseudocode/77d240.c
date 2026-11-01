
void FUN_0077d240(void)

{
  ulong uVar1;
  undefined8 uVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  long unaff_x24;
  int *piVar6;
  ulong uVar7;
  char *unaff_x26;
  int unaff_w28;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined4 uStack0000000000000050;
  
  do {
    if (unaff_x24 == 0) {
      func_0x0073c9e4();
      iVar3 = 0x1b;
code_r0x0077de8c:
      if (iVar3 == 0) {
        if (*unaff_x23 == 0x11) {
          *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
          func_0x00784f38();
          uVar2 = 0;
          if (*(long *)(unaff_x20 + 0x10) != 0) {
            (*pcRam0000000000a2b5f0)();
            uVar2 = 0;
            *(undefined8 *)(unaff_x20 + 0x10) = 0;
          }
        }
        else {
          uVar2 = 0;
        }
      }
      else {
        *(int *)(&UNK_00001440 + unaff_x21) = iVar3;
        uVar2 = 0x61;
      }
      *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return;
      }
      auVar8 = ___stack_chk_fail(uVar2);
      lVar4 = auVar8._0_8_;
      *(byte *)(lVar4 + 0x24) = *(byte *)(lVar4 + 0x24) & 0xfe;
      if (*(long *)(lVar4 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        *(undefined8 *)(lVar4 + 0x10) = 0;
      }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(**(long **)(lVar4 + 8) + 0x20))(*(long **)(lVar4 + 8),auVar8._8_8_);
      return;
    }
    if (*(int *)(unaff_x24 + 4) == 2) {
      func_0x0074ef88(unaff_x24,&uStack0000000000000050,0x40);
      lVar4 = *(long *)(unaff_x24 + 0x20);
      *(undefined1 *)(unaff_x23 + 5) = *(undefined1 *)(lVar4 + 4);
      *(undefined1 *)((long)unaff_x23 + 0x15) = *(undefined1 *)(lVar4 + 5);
      *(undefined1 *)((long)unaff_x23 + 0x16) = *(undefined1 *)(lVar4 + 6);
      *(undefined1 *)((long)unaff_x23 + 0x17) = *(undefined1 *)(lVar4 + 7);
      if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x21 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x21 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      func_0x00750010();
      piVar6 = unaff_x23 + 6;
      *(undefined1 *)piVar6 = 0;
      lVar4 = *(long *)(unaff_x23 + 0xa0);
      if (lVar4 != 0) {
        uVar1 = _strlen(lVar4);
        if (0xff < uVar1) {
          func_0x0073c9e4();
          iVar3 = 0xb;
          goto code_r0x0077de8c;
        }
        _memcpy(piVar6,lVar4,uVar1 + 1);
      }
      lVar4 = _strlen(piVar6);
      uVar1 = lVar4 + 9;
      uVar7 = uVar1;
      if (unaff_w28 == 6) {
        unaff_x23[5] = 0x1000000;
        uVar2 = *(undefined8 *)(unaff_x23 + 0x9c);
        lVar4 = _strlen(uVar2);
        if ((0xff < lVar4 + 1U) || (uVar7 = lVar4 + 1U + uVar1, 599 < uVar7)) {
          func_0x0073c9e4();
          iVar3 = 9;
          goto code_r0x0077de8c;
        }
        _strcpy(unaff_x26 + uVar1,uVar2);
      }
      *(char **)(unaff_x23 + 0x9a) = unaff_x26;
      *(ulong *)(unaff_x23 + 2) = uVar7;
      if (*unaff_x23 != 0xe) {
        *unaff_x23 = 0xe;
      }
      lVar4 = func_0x00731184(*(undefined8 *)(unaff_x20 + 8));
      if (lVar4 < 1) {
        if (uStack0000000000000050 == 0x51) {
          lVar5 = *(long *)(unaff_x23 + 2);
          goto joined_r0x0077d4c8;
        }
        if (uStack0000000000000050 == 0) {
LAB_0077df08:
          func_0x0073c9e4();
          iVar3 = 3;
        }
        else {
          func_0x0077e9f4();
          func_0x0073c9e4();
          iVar3 = 0x1d;
        }
        goto code_r0x0077de8c;
      }
      lVar5 = *(long *)(unaff_x23 + 2) - lVar4;
      *(long *)(unaff_x23 + 2) = lVar5;
      *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar4;
joined_r0x0077d4c8:
      if (lVar5 == 0) {
        unaff_x23[2] = 8;
        unaff_x23[3] = 0;
        *(char **)(unaff_x23 + 0x9a) = unaff_x26;
        if (*unaff_x23 != 4) {
          *unaff_x23 = 4;
        }
        lVar4 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
        if (lVar4 < 1) {
          if (uStack0000000000000050 != 0x51) {
            if (uStack0000000000000050 == 0) goto LAB_0077df08;
            func_0x0077e9f4();
            func_0x0073c9e4();
            iVar3 = 0xf;
            goto code_r0x0077de8c;
          }
          lVar5 = *(long *)(unaff_x23 + 2);
        }
        else {
          lVar5 = *(long *)(unaff_x23 + 2) - lVar4;
          *(long *)(unaff_x23 + 2) = lVar5;
          *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar4;
        }
        if (lVar5 == 0) {
          if (*unaff_x23 != 0x11) {
            *unaff_x23 = 0x11;
          }
          if (*unaff_x26 != '\0') {
            func_0x0073c9e4();
            iVar3 = 2;
            goto code_r0x0077de8c;
          }
          switch(*(undefined1 *)((long)unaff_x23 + 0x11)) {
          case 0x5a:
            if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x21 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x21 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            break;
          case 0x5b:
            func_0x0073c9e4();
            iVar3 = 0x1a;
            goto code_r0x0077de8c;
          case 0x5c:
            func_0x0073c9e4();
            iVar3 = 7;
            goto code_r0x0077de8c;
          case 0x5d:
            func_0x0073c9e4();
            iVar3 = 8;
            goto code_r0x0077de8c;
          default:
            func_0x0073c9e4();
            iVar3 = 0x1f;
            goto code_r0x0077de8c;
          }
        }
      }
      iVar3 = 0;
      goto code_r0x0077de8c;
    }
    unaff_x24 = *(long *)(unaff_x24 + 0x28);
  } while( true );
}

