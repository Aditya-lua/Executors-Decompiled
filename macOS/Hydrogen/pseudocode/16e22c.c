
/* WARNING: Possible PIC construction at 0x0016d5f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0016d60c: Changing call to branch */

void FUN_0016e22c(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  
  lVar4 = param_1[0xe];
  if (lVar4 == -0x8000000000000000 || lVar4 == 0) {
    uVar8 = param_1[0xd];
    uVar6 = param_1[10];
  }
  else {
    func_0x00187bd4(param_1[0xf],lVar4,1);
    uVar8 = param_1[0xd];
    uVar6 = param_1[10];
  }
  if (uVar8 != 0) {
    lVar4 = param_1[0xb];
    uVar3 = param_1[0xc];
    uVar1 = 0;
    if (uVar6 <= uVar3) {
      uVar1 = uVar6;
    }
    lVar5 = uVar3 - uVar1;
    uVar10 = uVar6 - lVar5;
    lVar7 = 0;
    if (uVar10 <= uVar8) {
      lVar7 = uVar8 - uVar10;
    }
    uVar2 = uVar6;
    if (uVar8 <= uVar10) {
      uVar2 = lVar5 + uVar8;
    }
    lVar5 = uVar2 - lVar5;
    if (lVar5 != 0) {
      puVar9 = (undefined8 *)(lVar4 + uVar1 * -0x20 + uVar3 * 0x20 + 0x10);
      do {
        if (puVar9[-1] != 0) {
          func_0x00187bd4(*puVar9,puVar9[-1],1);
        }
        puVar9 = puVar9 + 4;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
    if (uVar10 < uVar8) {
      puVar9 = (undefined8 *)(lVar4 + 0x10);
      do {
        if (puVar9[-1] != 0) {
          func_0x00187bd4(*puVar9,puVar9[-1],1);
        }
        puVar9 = puVar9 + 4;
        lVar7 = lVar7 + -1;
      } while (lVar7 != 0);
    }
  }
  if (uVar6 != 0) {
    func_0x00187bd4(param_1[0xb],uVar6 << 5,8);
  }
  if (*param_1 == 0) {
    if (*(char *)((long)param_1 + 0x131) == '\x02') {
      if (*(char *)((long)param_1 + 0x1e1) == '\x02') {
        return;
      }
      func_0x00252db4(param_1 + 0x29);
      param_1 = param_1 + 0x32;
    }
    else {
      func_0x00252db4(param_1 + 0x13);
      param_1 = param_1 + 0x1c;
    }
  }
  else {
    param_1 = param_1 + 1;
  }
  *(undefined1 *)param_1 = 0;
  *(undefined1 *)((long)param_1 + 1) = 0;
  *(undefined1 *)((long)param_1 + 2) = 0;
  *(undefined1 *)((long)param_1 + 3) = 0;
  *(undefined1 *)((long)param_1 + 4) = 0;
  *(undefined1 *)((long)param_1 + 5) = 0;
  *(undefined1 *)((long)param_1 + 6) = 0;
  *(undefined1 *)((long)param_1 + 7) = 0;
  *(undefined1 *)(param_1 + 1) = 0;
  *(undefined1 *)((long)param_1 + 9) = 0;
  *(undefined1 *)((long)param_1 + 10) = 0;
  *(undefined1 *)((long)param_1 + 0xb) = 0;
  *(undefined1 *)((long)param_1 + 0xc) = 0;
  *(undefined1 *)((long)param_1 + 0xd) = 0;
  *(undefined1 *)((long)param_1 + 0xe) = 0;
  *(undefined1 *)((long)param_1 + 0xf) = 0;
  *(undefined1 *)(param_1 + 2) = 0;
  *(undefined1 *)((long)param_1 + 0x11) = 0;
  *(undefined1 *)((long)param_1 + 0x12) = 0;
  *(undefined1 *)((long)param_1 + 0x13) = 0;
  *(undefined1 *)((long)param_1 + 0x14) = 0;
  *(undefined1 *)((long)param_1 + 0x15) = 0;
  *(undefined1 *)((long)param_1 + 0x16) = 0;
  *(undefined1 *)((long)param_1 + 0x17) = 0;
  *(undefined1 *)(param_1 + 3) = 0;
  *(undefined1 *)((long)param_1 + 0x19) = 0;
  *(undefined1 *)((long)param_1 + 0x1a) = 0;
  *(undefined1 *)((long)param_1 + 0x1b) = 0;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *(undefined1 *)((long)param_1 + 0x1d) = 0;
  *(undefined1 *)((long)param_1 + 0x1e) = 0;
  *(undefined1 *)((long)param_1 + 0x1f) = 0;
  *(undefined1 *)(param_1 + 4) = 0;
  *(undefined1 *)((long)param_1 + 0x21) = 0;
  *(undefined1 *)((long)param_1 + 0x22) = 0;
  *(undefined1 *)((long)param_1 + 0x23) = 0;
  *(undefined1 *)((long)param_1 + 0x24) = 0;
  *(undefined1 *)((long)param_1 + 0x25) = 0;
  *(undefined1 *)((long)param_1 + 0x26) = 0;
  *(undefined1 *)((long)param_1 + 0x27) = 0;
  *(undefined1 *)(param_1 + 5) = 0;
  *(undefined1 *)((long)param_1 + 0x29) = 0;
  *(undefined1 *)((long)param_1 + 0x2a) = 0;
  *(undefined1 *)((long)param_1 + 0x2b) = 0;
  *(undefined1 *)((long)param_1 + 0x2c) = 0;
  *(undefined1 *)((long)param_1 + 0x2d) = 0;
  *(undefined1 *)((long)param_1 + 0x2e) = 0;
  *(undefined1 *)((long)param_1 + 0x2f) = 0;
  *(undefined1 *)(param_1 + 6) = 0;
  *(undefined1 *)((long)param_1 + 0x31) = 0;
  *(undefined1 *)((long)param_1 + 0x32) = 0;
  *(undefined1 *)((long)param_1 + 0x33) = 0;
  *(undefined1 *)((long)param_1 + 0x34) = 0;
  *(undefined1 *)((long)param_1 + 0x35) = 0;
  *(undefined1 *)((long)param_1 + 0x36) = 0;
  *(undefined1 *)((long)param_1 + 0x37) = 0;
  *(undefined1 *)(param_1 + 7) = 0;
  *(undefined1 *)((long)param_1 + 0x39) = 0;
  *(undefined1 *)((long)param_1 + 0x3a) = 0;
  *(undefined1 *)((long)param_1 + 0x3b) = 0;
  *(undefined1 *)((long)param_1 + 0x3c) = 0;
  *(undefined1 *)((long)param_1 + 0x3d) = 0;
  *(undefined1 *)((long)param_1 + 0x3e) = 0;
  *(undefined1 *)((long)param_1 + 0x3f) = 0;
  return;
}

