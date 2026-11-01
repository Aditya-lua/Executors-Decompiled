
/* WARNING: Possible PIC construction at 0x00171be0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00171bfc: Changing call to branch */

void FUN_00171b34(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  long *unaff_x19;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  
  uVar9 = unaff_x19[0xd];
  uVar7 = unaff_x19[10];
  if (uVar9 != 0) {
    lVar3 = unaff_x19[0xb];
    uVar4 = unaff_x19[0xc];
    uVar1 = 0;
    if (uVar7 <= uVar4) {
      uVar1 = uVar7;
    }
    lVar6 = uVar4 - uVar1;
    uVar11 = uVar7 - lVar6;
    lVar8 = 0;
    if (uVar11 <= uVar9) {
      lVar8 = uVar9 - uVar11;
    }
    uVar2 = uVar7;
    if (uVar9 <= uVar11) {
      uVar2 = lVar6 + uVar9;
    }
    lVar6 = uVar2 - lVar6;
    if (lVar6 != 0) {
      puVar10 = (undefined8 *)(lVar3 + uVar1 * -0x20 + uVar4 * 0x20 + 0x10);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 4;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    if (uVar11 < uVar9) {
      puVar10 = (undefined8 *)(lVar3 + 0x10);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 4;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
  }
  if (uVar7 != 0) {
    func_0x00187bd4(unaff_x19[0xb],uVar7 << 5,8);
  }
  if (*unaff_x19 == 0) {
    if (*(char *)((long)unaff_x19 + 0x131) == '\x02') {
      if (*(char *)((long)unaff_x19 + 0x1e1) == '\x02') {
        return;
      }
      func_0x00252db4(unaff_x19 + 0x29);
      plVar5 = unaff_x19 + 0x32;
    }
    else {
      func_0x00252db4(unaff_x19 + 0x13);
      plVar5 = unaff_x19 + 0x1c;
    }
  }
  else {
    plVar5 = unaff_x19 + 1;
  }
  *(undefined1 *)plVar5 = 0;
  *(undefined1 *)((long)plVar5 + 1) = 0;
  *(undefined1 *)((long)plVar5 + 2) = 0;
  *(undefined1 *)((long)plVar5 + 3) = 0;
  *(undefined1 *)((long)plVar5 + 4) = 0;
  *(undefined1 *)((long)plVar5 + 5) = 0;
  *(undefined1 *)((long)plVar5 + 6) = 0;
  *(undefined1 *)((long)plVar5 + 7) = 0;
  *(undefined1 *)(plVar5 + 1) = 0;
  *(undefined1 *)((long)plVar5 + 9) = 0;
  *(undefined1 *)((long)plVar5 + 10) = 0;
  *(undefined1 *)((long)plVar5 + 0xb) = 0;
  *(undefined1 *)((long)plVar5 + 0xc) = 0;
  *(undefined1 *)((long)plVar5 + 0xd) = 0;
  *(undefined1 *)((long)plVar5 + 0xe) = 0;
  *(undefined1 *)((long)plVar5 + 0xf) = 0;
  *(undefined1 *)(plVar5 + 2) = 0;
  *(undefined1 *)((long)plVar5 + 0x11) = 0;
  *(undefined1 *)((long)plVar5 + 0x12) = 0;
  *(undefined1 *)((long)plVar5 + 0x13) = 0;
  *(undefined1 *)((long)plVar5 + 0x14) = 0;
  *(undefined1 *)((long)plVar5 + 0x15) = 0;
  *(undefined1 *)((long)plVar5 + 0x16) = 0;
  *(undefined1 *)((long)plVar5 + 0x17) = 0;
  *(undefined1 *)(plVar5 + 3) = 0;
  *(undefined1 *)((long)plVar5 + 0x19) = 0;
  *(undefined1 *)((long)plVar5 + 0x1a) = 0;
  *(undefined1 *)((long)plVar5 + 0x1b) = 0;
  *(undefined1 *)((long)plVar5 + 0x1c) = 0;
  *(undefined1 *)((long)plVar5 + 0x1d) = 0;
  *(undefined1 *)((long)plVar5 + 0x1e) = 0;
  *(undefined1 *)((long)plVar5 + 0x1f) = 0;
  *(undefined1 *)(plVar5 + 4) = 0;
  *(undefined1 *)((long)plVar5 + 0x21) = 0;
  *(undefined1 *)((long)plVar5 + 0x22) = 0;
  *(undefined1 *)((long)plVar5 + 0x23) = 0;
  *(undefined1 *)((long)plVar5 + 0x24) = 0;
  *(undefined1 *)((long)plVar5 + 0x25) = 0;
  *(undefined1 *)((long)plVar5 + 0x26) = 0;
  *(undefined1 *)((long)plVar5 + 0x27) = 0;
  *(undefined1 *)(plVar5 + 5) = 0;
  *(undefined1 *)((long)plVar5 + 0x29) = 0;
  *(undefined1 *)((long)plVar5 + 0x2a) = 0;
  *(undefined1 *)((long)plVar5 + 0x2b) = 0;
  *(undefined1 *)((long)plVar5 + 0x2c) = 0;
  *(undefined1 *)((long)plVar5 + 0x2d) = 0;
  *(undefined1 *)((long)plVar5 + 0x2e) = 0;
  *(undefined1 *)((long)plVar5 + 0x2f) = 0;
  *(undefined1 *)(plVar5 + 6) = 0;
  *(undefined1 *)((long)plVar5 + 0x31) = 0;
  *(undefined1 *)((long)plVar5 + 0x32) = 0;
  *(undefined1 *)((long)plVar5 + 0x33) = 0;
  *(undefined1 *)((long)plVar5 + 0x34) = 0;
  *(undefined1 *)((long)plVar5 + 0x35) = 0;
  *(undefined1 *)((long)plVar5 + 0x36) = 0;
  *(undefined1 *)((long)plVar5 + 0x37) = 0;
  *(undefined1 *)(plVar5 + 7) = 0;
  *(undefined1 *)((long)plVar5 + 0x39) = 0;
  *(undefined1 *)((long)plVar5 + 0x3a) = 0;
  *(undefined1 *)((long)plVar5 + 0x3b) = 0;
  *(undefined1 *)((long)plVar5 + 0x3c) = 0;
  *(undefined1 *)((long)plVar5 + 0x3d) = 0;
  *(undefined1 *)((long)plVar5 + 0x3e) = 0;
  *(undefined1 *)((long)plVar5 + 0x3f) = 0;
  return;
}

