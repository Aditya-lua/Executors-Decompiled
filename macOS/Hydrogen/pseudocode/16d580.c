
/* WARNING: Possible PIC construction at 0x0016d5f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0016d60c: Changing call to branch */

void FUN_0016d580(long param_1)

{
  long *plVar1;
  long in_x9;
  long in_x10;
  long *unaff_x19;
  long unaff_x20;
  long lVar2;
  ulong unaff_x22;
  undefined8 *puVar3;
  long unaff_x23;
  ulong unaff_x24;
  long lVar4;
  
  lVar2 = 0;
  if (unaff_x24 <= unaff_x22) {
    lVar2 = unaff_x22 - unaff_x24;
  }
  lVar4 = unaff_x20;
  if (unaff_x22 <= unaff_x24) {
    lVar4 = in_x10 + unaff_x22;
  }
  lVar4 = lVar4 - in_x10;
  if (lVar4 != 0) {
    puVar3 = (undefined8 *)(unaff_x23 + in_x9 * -0x20 + param_1 * 0x20 + 0x10);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 4;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
  }
  if (unaff_x24 < unaff_x22) {
    puVar3 = (undefined8 *)(unaff_x23 + 0x10);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 4;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  if (unaff_x20 != 0) {
    func_0x00187bd4(unaff_x19[0xb],unaff_x20 << 5,8);
  }
  if (*unaff_x19 == 0) {
    if (*(char *)((long)unaff_x19 + 0x131) == '\x02') {
      if (*(char *)((long)unaff_x19 + 0x1e1) == '\x02') {
        return;
      }
      func_0x00252db4(unaff_x19 + 0x29);
      plVar1 = unaff_x19 + 0x32;
    }
    else {
      func_0x00252db4(unaff_x19 + 0x13);
      plVar1 = unaff_x19 + 0x1c;
    }
  }
  else {
    plVar1 = unaff_x19 + 1;
  }
  *(undefined1 *)plVar1 = 0;
  *(undefined1 *)((long)plVar1 + 1) = 0;
  *(undefined1 *)((long)plVar1 + 2) = 0;
  *(undefined1 *)((long)plVar1 + 3) = 0;
  *(undefined1 *)((long)plVar1 + 4) = 0;
  *(undefined1 *)((long)plVar1 + 5) = 0;
  *(undefined1 *)((long)plVar1 + 6) = 0;
  *(undefined1 *)((long)plVar1 + 7) = 0;
  *(undefined1 *)(plVar1 + 1) = 0;
  *(undefined1 *)((long)plVar1 + 9) = 0;
  *(undefined1 *)((long)plVar1 + 10) = 0;
  *(undefined1 *)((long)plVar1 + 0xb) = 0;
  *(undefined1 *)((long)plVar1 + 0xc) = 0;
  *(undefined1 *)((long)plVar1 + 0xd) = 0;
  *(undefined1 *)((long)plVar1 + 0xe) = 0;
  *(undefined1 *)((long)plVar1 + 0xf) = 0;
  *(undefined1 *)(plVar1 + 2) = 0;
  *(undefined1 *)((long)plVar1 + 0x11) = 0;
  *(undefined1 *)((long)plVar1 + 0x12) = 0;
  *(undefined1 *)((long)plVar1 + 0x13) = 0;
  *(undefined1 *)((long)plVar1 + 0x14) = 0;
  *(undefined1 *)((long)plVar1 + 0x15) = 0;
  *(undefined1 *)((long)plVar1 + 0x16) = 0;
  *(undefined1 *)((long)plVar1 + 0x17) = 0;
  *(undefined1 *)(plVar1 + 3) = 0;
  *(undefined1 *)((long)plVar1 + 0x19) = 0;
  *(undefined1 *)((long)plVar1 + 0x1a) = 0;
  *(undefined1 *)((long)plVar1 + 0x1b) = 0;
  *(undefined1 *)((long)plVar1 + 0x1c) = 0;
  *(undefined1 *)((long)plVar1 + 0x1d) = 0;
  *(undefined1 *)((long)plVar1 + 0x1e) = 0;
  *(undefined1 *)((long)plVar1 + 0x1f) = 0;
  *(undefined1 *)(plVar1 + 4) = 0;
  *(undefined1 *)((long)plVar1 + 0x21) = 0;
  *(undefined1 *)((long)plVar1 + 0x22) = 0;
  *(undefined1 *)((long)plVar1 + 0x23) = 0;
  *(undefined1 *)((long)plVar1 + 0x24) = 0;
  *(undefined1 *)((long)plVar1 + 0x25) = 0;
  *(undefined1 *)((long)plVar1 + 0x26) = 0;
  *(undefined1 *)((long)plVar1 + 0x27) = 0;
  *(undefined1 *)(plVar1 + 5) = 0;
  *(undefined1 *)((long)plVar1 + 0x29) = 0;
  *(undefined1 *)((long)plVar1 + 0x2a) = 0;
  *(undefined1 *)((long)plVar1 + 0x2b) = 0;
  *(undefined1 *)((long)plVar1 + 0x2c) = 0;
  *(undefined1 *)((long)plVar1 + 0x2d) = 0;
  *(undefined1 *)((long)plVar1 + 0x2e) = 0;
  *(undefined1 *)((long)plVar1 + 0x2f) = 0;
  *(undefined1 *)(plVar1 + 6) = 0;
  *(undefined1 *)((long)plVar1 + 0x31) = 0;
  *(undefined1 *)((long)plVar1 + 0x32) = 0;
  *(undefined1 *)((long)plVar1 + 0x33) = 0;
  *(undefined1 *)((long)plVar1 + 0x34) = 0;
  *(undefined1 *)((long)plVar1 + 0x35) = 0;
  *(undefined1 *)((long)plVar1 + 0x36) = 0;
  *(undefined1 *)((long)plVar1 + 0x37) = 0;
  *(undefined1 *)(plVar1 + 7) = 0;
  *(undefined1 *)((long)plVar1 + 0x39) = 0;
  *(undefined1 *)((long)plVar1 + 0x3a) = 0;
  *(undefined1 *)((long)plVar1 + 0x3b) = 0;
  *(undefined1 *)((long)plVar1 + 0x3c) = 0;
  *(undefined1 *)((long)plVar1 + 0x3d) = 0;
  *(undefined1 *)((long)plVar1 + 0x3e) = 0;
  *(undefined1 *)((long)plVar1 + 0x3f) = 0;
  return;
}

