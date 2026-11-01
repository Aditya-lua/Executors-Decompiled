
/* WARNING: Possible PIC construction at 0x00245a9c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00245ab8: Changing call to branch */

void FUN_00245a20(long param_1)

{
  long lVar1;
  bool in_CY;
  long *plVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  long lVar4;
  ulong unaff_x22;
  undefined8 *puVar5;
  long unaff_x23;
  ulong uVar6;
  long lVar7;
  
  lVar1 = 0;
  if (in_CY) {
    lVar1 = unaff_x20;
  }
  lVar3 = param_1 - lVar1;
  uVar6 = unaff_x20 - lVar3;
  lVar4 = 0;
  if (uVar6 <= unaff_x22) {
    lVar4 = unaff_x22 - uVar6;
  }
  lVar7 = unaff_x20;
  if (unaff_x22 <= uVar6) {
    lVar7 = lVar3 + unaff_x22;
  }
  lVar7 = lVar7 - lVar3;
  if (lVar7 != 0) {
    puVar5 = (undefined8 *)(unaff_x23 + lVar1 * -0x20 + param_1 * 0x20 + 0x10);
    do {
      if (puVar5[-1] != 0) {
        func_0x00187bd4(*puVar5,puVar5[-1],1);
      }
      puVar5 = puVar5 + 4;
      lVar7 = lVar7 + -1;
    } while (lVar7 != 0);
  }
  if (uVar6 < unaff_x22) {
    puVar5 = (undefined8 *)(unaff_x23 + 0x10);
    do {
      if (puVar5[-1] != 0) {
        func_0x00187bd4(*puVar5,puVar5[-1],1);
      }
      puVar5 = puVar5 + 4;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
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
      plVar2 = unaff_x19 + 0x32;
    }
    else {
      func_0x00252db4(unaff_x19 + 0x13);
      plVar2 = unaff_x19 + 0x1c;
    }
  }
  else {
    plVar2 = unaff_x19 + 1;
  }
  *(undefined1 *)plVar2 = 0;
  *(undefined1 *)((long)plVar2 + 1) = 0;
  *(undefined1 *)((long)plVar2 + 2) = 0;
  *(undefined1 *)((long)plVar2 + 3) = 0;
  *(undefined1 *)((long)plVar2 + 4) = 0;
  *(undefined1 *)((long)plVar2 + 5) = 0;
  *(undefined1 *)((long)plVar2 + 6) = 0;
  *(undefined1 *)((long)plVar2 + 7) = 0;
  *(undefined1 *)(plVar2 + 1) = 0;
  *(undefined1 *)((long)plVar2 + 9) = 0;
  *(undefined1 *)((long)plVar2 + 10) = 0;
  *(undefined1 *)((long)plVar2 + 0xb) = 0;
  *(undefined1 *)((long)plVar2 + 0xc) = 0;
  *(undefined1 *)((long)plVar2 + 0xd) = 0;
  *(undefined1 *)((long)plVar2 + 0xe) = 0;
  *(undefined1 *)((long)plVar2 + 0xf) = 0;
  *(undefined1 *)(plVar2 + 2) = 0;
  *(undefined1 *)((long)plVar2 + 0x11) = 0;
  *(undefined1 *)((long)plVar2 + 0x12) = 0;
  *(undefined1 *)((long)plVar2 + 0x13) = 0;
  *(undefined1 *)((long)plVar2 + 0x14) = 0;
  *(undefined1 *)((long)plVar2 + 0x15) = 0;
  *(undefined1 *)((long)plVar2 + 0x16) = 0;
  *(undefined1 *)((long)plVar2 + 0x17) = 0;
  *(undefined1 *)(plVar2 + 3) = 0;
  *(undefined1 *)((long)plVar2 + 0x19) = 0;
  *(undefined1 *)((long)plVar2 + 0x1a) = 0;
  *(undefined1 *)((long)plVar2 + 0x1b) = 0;
  *(undefined1 *)((long)plVar2 + 0x1c) = 0;
  *(undefined1 *)((long)plVar2 + 0x1d) = 0;
  *(undefined1 *)((long)plVar2 + 0x1e) = 0;
  *(undefined1 *)((long)plVar2 + 0x1f) = 0;
  *(undefined1 *)(plVar2 + 4) = 0;
  *(undefined1 *)((long)plVar2 + 0x21) = 0;
  *(undefined1 *)((long)plVar2 + 0x22) = 0;
  *(undefined1 *)((long)plVar2 + 0x23) = 0;
  *(undefined1 *)((long)plVar2 + 0x24) = 0;
  *(undefined1 *)((long)plVar2 + 0x25) = 0;
  *(undefined1 *)((long)plVar2 + 0x26) = 0;
  *(undefined1 *)((long)plVar2 + 0x27) = 0;
  *(undefined1 *)(plVar2 + 5) = 0;
  *(undefined1 *)((long)plVar2 + 0x29) = 0;
  *(undefined1 *)((long)plVar2 + 0x2a) = 0;
  *(undefined1 *)((long)plVar2 + 0x2b) = 0;
  *(undefined1 *)((long)plVar2 + 0x2c) = 0;
  *(undefined1 *)((long)plVar2 + 0x2d) = 0;
  *(undefined1 *)((long)plVar2 + 0x2e) = 0;
  *(undefined1 *)((long)plVar2 + 0x2f) = 0;
  *(undefined1 *)(plVar2 + 6) = 0;
  *(undefined1 *)((long)plVar2 + 0x31) = 0;
  *(undefined1 *)((long)plVar2 + 0x32) = 0;
  *(undefined1 *)((long)plVar2 + 0x33) = 0;
  *(undefined1 *)((long)plVar2 + 0x34) = 0;
  *(undefined1 *)((long)plVar2 + 0x35) = 0;
  *(undefined1 *)((long)plVar2 + 0x36) = 0;
  *(undefined1 *)((long)plVar2 + 0x37) = 0;
  *(undefined1 *)(plVar2 + 7) = 0;
  *(undefined1 *)((long)plVar2 + 0x39) = 0;
  *(undefined1 *)((long)plVar2 + 0x3a) = 0;
  *(undefined1 *)((long)plVar2 + 0x3b) = 0;
  *(undefined1 *)((long)plVar2 + 0x3c) = 0;
  *(undefined1 *)((long)plVar2 + 0x3d) = 0;
  *(undefined1 *)((long)plVar2 + 0x3e) = 0;
  *(undefined1 *)((long)plVar2 + 0x3f) = 0;
  return;
}

