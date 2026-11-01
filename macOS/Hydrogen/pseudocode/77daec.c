
void FUN_0077daec(char *param_1)

{
  byte bVar1;
  char cVar2;
  long lVar3;
  undefined8 uVar4;
  int iVar5;
  long lVar6;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  long unaff_x29;
  undefined1 auVar7 [16];
  char *pcStack0000000000000000;
  char *in_stack_00000038;
  int in_stack_00000050;
  
  pcStack0000000000000000 = param_1;
  func_0x0073c9e4();
  func_0x00750010();
  in_stack_00000038[3] = (char)((uint)unaff_x23[0x9e] >> 8);
  in_stack_00000038[4] = (char)unaff_x23[0x9e];
  *(char **)(unaff_x23 + 0x9a) = in_stack_00000038;
  unaff_x23[2] = 5;
  unaff_x23[3] = 0;
  if (*unaff_x23 != 0xe) {
    *unaff_x23 = 0xe;
  }
  lVar3 = func_0x00731184(*(undefined8 *)(unaff_x20 + 8));
  if (lVar3 < 1) {
    if (in_stack_00000050 == 0x51) {
      lVar6 = *(long *)(unaff_x23 + 2);
      goto joined_r0x0077dca0;
    }
    if (in_stack_00000050 != 0) {
      func_0x0077e9f4();
      pcStack0000000000000000 = "SOCKS5 connect request";
      func_0x0073c9e4();
      iVar5 = 0x1e;
      goto LAB_0077de8c;
    }
LAB_0077df08:
    func_0x0073c9e4();
    iVar5 = 3;
    goto LAB_0077de8c;
  }
  lVar6 = *(long *)(unaff_x23 + 2) - lVar3;
  *(long *)(unaff_x23 + 2) = lVar6;
  *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar3;
joined_r0x0077dca0:
  if (lVar6 == 0) {
    unaff_x23[2] = 10;
    unaff_x23[3] = 0;
    *(char **)(unaff_x23 + 0x9a) = in_stack_00000038;
    if (*unaff_x23 != 0xf) {
      *unaff_x23 = 0xf;
    }
    lVar3 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
    if (lVar3 < 1) {
      if (in_stack_00000050 != 0x51) {
        if (in_stack_00000050 != 0) {
          func_0x0077e9f4();
          pcStack0000000000000000 = "SOCKS5 connect request ack";
          func_0x0073c9e4();
          iVar5 = 0x10;
          goto LAB_0077de8c;
        }
        goto LAB_0077df08;
      }
      lVar6 = *(long *)(unaff_x23 + 2);
    }
    else {
      lVar6 = *(long *)(unaff_x23 + 2) - lVar3;
      *(long *)(unaff_x23 + 2) = lVar6;
      *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar3;
    }
    if (lVar6 == 0) {
      if (*in_stack_00000038 != '\x05') {
        func_0x0073c9e4();
        iVar5 = 2;
        goto LAB_0077de8c;
      }
      bVar1 = *(byte *)((long)unaff_x23 + 0x11);
      if (bVar1 != 0) {
        pcStack0000000000000000 = *(char **)(unaff_x23 + 0x9c);
        func_0x0073c9e4();
        if (bVar1 < 9) {
          iVar5 = *(int *)(&UNK_008ce3dc + (ulong)bVar1 * 4);
        }
        else {
          iVar5 = 0x19;
        }
        goto LAB_0077de8c;
      }
      cVar2 = *(char *)((long)unaff_x23 + 0x13);
      if (cVar2 != '\x01') {
        if (cVar2 == '\x03') {
          if ((ulong)*(byte *)(unaff_x23 + 5) < 4) goto code_r0x0077d0f8;
          lVar3 = (ulong)*(byte *)(unaff_x23 + 5) + 7;
        }
        else {
          if (cVar2 != '\x04') {
            func_0x0073c9e4();
            iVar5 = 1;
            goto LAB_0077de8c;
          }
          lVar3 = 0x16;
        }
        *(long *)(unaff_x23 + 2) = lVar3 + -10;
        *(long *)(unaff_x23 + 0x9a) = (long)unaff_x23 + 0x1a;
        if (*unaff_x23 != 0x10) {
          *unaff_x23 = 0x10;
        }
        lVar3 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
        if (lVar3 < 1) {
          if (in_stack_00000050 != 0x51) {
            if (in_stack_00000050 != 0) {
              func_0x0077e9f4();
              pcStack0000000000000000 = "SOCKS5 connect request address";
              func_0x0073c9e4();
              iVar5 = 0xd;
              goto LAB_0077de8c;
            }
            goto LAB_0077df08;
          }
          lVar6 = *(long *)(unaff_x23 + 2);
        }
        else {
          lVar6 = *(long *)(unaff_x23 + 2) - lVar3;
          *(long *)(unaff_x23 + 2) = lVar6;
          *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar3;
        }
        if (lVar6 != 0) goto LAB_0077de88;
      }
code_r0x0077d0f8:
      if (*unaff_x23 != 0x11) {
        *unaff_x23 = 0x11;
      }
      if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x21 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x21 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
    }
  }
LAB_0077de88:
  iVar5 = 0;
LAB_0077de8c:
  if (iVar5 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar4 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar4 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar4 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = iVar5;
    uVar4 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar7 = ___stack_chk_fail(uVar4);
  lVar3 = auVar7._0_8_;
  *(byte *)(lVar3 + 0x24) = *(byte *)(lVar3 + 0x24) & 0xfe;
  if (*(long *)(lVar3 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar3 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar3 + 8) + 0x20))(*(long **)(lVar3 + 8),auVar7._8_8_);
  return;
}

