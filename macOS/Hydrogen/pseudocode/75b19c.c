
undefined1 FUN_0075b19c(long param_1)

{
  uint uVar1;
  undefined1 uVar2;
  int iVar3;
  long lVar4;
  int unaff_w23;
  int unaff_w24;
  long *unaff_x26;
  uint unaff_w27;
  uint unaff_w28;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000058;
  undefined4 in_stack_00000060;
  
code_r0x0075b19c:
  if (unaff_w24 != 4) goto LAB_0075b07c;
LAB_0075b1c8:
  do {
    if ((unaff_w23 == 0) || (*(int *)(param_1 + 0x18) == unaff_w23)) {
      if (*(int *)(param_1 + 0x18) != 0) {
        func_0x00764560(&uStack0000000000000058,0xc,"%%%u");
      }
      _inet_ntop();
      func_0x00764560();
      uVar2 = 2;
code_r0x0075b290:
      _freeifaddrs(in_stack_00000010);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return uVar2;
      }
      auVar5 = ___stack_chk_fail();
      lVar4 = (*pcRam0000000000a2b608)(1,0x50);
      *(long *)(auVar5._0_8_ + 0x1b0) = lVar4;
      if (lVar4 == 0) {
        return 0x1b;
      }
      *(ulong *)(auVar5._8_8_ + 0x398) = *(ulong *)(auVar5._8_8_ + 0x398) & 0xfffffffff7ffffff;
      return 0;
    }
LAB_0075b07c:
    do {
      while( true ) {
        uVar2 = true;
        do {
          while( true ) {
            do {
              unaff_x26 = (long *)*unaff_x26;
              if (unaff_x26 == (long *)0x0) goto code_r0x0075b290;
            } while (unaff_x26[3] == 0);
            if (*(char *)(unaff_x26[3] + 1) == '\x1e') break;
            if ((bool)uVar2 == false) {
              iVar3 = func_0x0077e6f8(unaff_x26[1]);
              uVar2 = iVar3 != 0;
            }
          }
          iVar3 = func_0x0077e6f8(unaff_x26[1]);
        } while (iVar3 == 0);
        iVar3 = 0;
        in_stack_00000060 = 0;
        uStack0000000000000058 = 0;
        param_1 = unaff_x26[3];
        if (*(char *)(param_1 + 1) == '\x1e') break;
code_r0x0075b1c0:
        if (iVar3 == unaff_w24) goto LAB_0075b1c8;
      }
      if ((*(byte *)(param_1 + 8) & 0xfe) != 0xfc) {
        uVar1 = *(byte *)(param_1 + 9) & 0xc0 | (uint)*(byte *)(param_1 + 8) << 8;
        if (uVar1 == unaff_w27) {
          iVar3 = 2;
          goto code_r0x0075b1c0;
        }
        if (uVar1 == unaff_w28) {
          if (unaff_w24 == 1) break;
        }
        else {
          if (((uVar1 == 0) &&
              (((((*(char *)(param_1 + 10) == '\0' && *(char *)(param_1 + 0xb) == '\0') &&
                 (*(char *)(param_1 + 0xc) == '\0' && *(char *)(param_1 + 0xd) == '\0')) &&
                ((*(char *)(param_1 + 0xe) == '\0' && *(char *)(param_1 + 0xf) == '\0') &&
                *(char *)(param_1 + 0x10) == '\0')) &&
               (((*(char *)(param_1 + 0x11) == '\0' && *(char *)(param_1 + 0x12) == '\0') &&
                *(char *)(param_1 + 0x13) == '\0') && *(char *)(param_1 + 0x14) == '\0')) &&
               ((*(char *)(param_1 + 0x15) == '\0' && *(char *)(param_1 + 0x16) == '\0') &&
               *(byte *)(param_1 + 9) == 0))) && (*(char *)(param_1 + 0x17) == '\x01'))
          goto code_r0x0075b19c;
          if (unaff_w24 == 0) break;
        }
        goto LAB_0075b07c;
      }
    } while (unaff_w24 != 3);
  } while( true );
}

