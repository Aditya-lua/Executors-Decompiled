/* 7ff70c918d50 Unwind@7ff70c918d50 */

void Unwind_7ff70c918d50(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  code *pcVar2;
  ulonglong uVar3;
  longlong lVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  
  lVar6 = *(longlong *)(param_2 + 0x1d0);
  if (lVar6 != 0) {
    lVar7 = *(longlong *)(param_2 + 0x1d8);
    if (lVar6 != lVar7) {
      do {
        uVar5 = *(ulonglong *)(lVar6 + 0x28);
        if (0xf < uVar5) {
          lVar1 = *(longlong *)(lVar6 + 0x10);
          uVar3 = uVar5 + 1;
          lVar4 = lVar1;
          if (0xfff < uVar3) {
            lVar4 = *(longlong *)(lVar1 + -8);
            if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70c9190d4;
            uVar3 = uVar5 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar4,uVar3);
        }
        *(undefined8 *)(lVar6 + 0x20) = 0;
        *(undefined8 *)(lVar6 + 0x28) = 0xf;
        *(undefined1 *)(lVar6 + 0x10) = 0;
        lVar6 = lVar6 + 0x30;
      } while (lVar6 != lVar7);
      lVar6 = *(longlong *)(param_2 + 0x1d0);
    }
    uVar5 = *(longlong *)(param_2 + 0x1e0) - lVar6;
    lVar7 = lVar6;
    if (0xfff < uVar5) {
      lVar7 = *(longlong *)(lVar6 + -8);
      if (0x1f < (ulonglong)((lVar6 + -8) - lVar7)) goto LAB_7ff70c9190d4;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar5);
    *(undefined8 *)(param_2 + 0x1d0) = 0;
    *(undefined8 *)(param_2 + 0x1d8) = 0;
    *(undefined8 *)(param_2 + 0x1e0) = 0;
  }
  lVar6 = *(longlong *)(param_2 + 0x1a8);
  if (lVar6 != 0) {
    lVar7 = *(longlong *)(param_2 + 0x1b0);
    if (lVar6 != lVar7) {
      do {
        uVar5 = *(ulonglong *)(lVar6 + 0x28);
        if (0xf < uVar5) {
          lVar1 = *(longlong *)(lVar6 + 0x10);
          uVar3 = uVar5 + 1;
          lVar4 = lVar1;
          if (0xfff < uVar3) {
            lVar4 = *(longlong *)(lVar1 + -8);
            if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70c9190d4;
            uVar3 = uVar5 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar4,uVar3);
        }
        *(undefined8 *)(lVar6 + 0x20) = 0;
        *(undefined8 *)(lVar6 + 0x28) = 0xf;
        *(undefined1 *)(lVar6 + 0x10) = 0;
        lVar6 = lVar6 + 0x30;
      } while (lVar6 != lVar7);
      lVar6 = *(longlong *)(param_2 + 0x1a8);
    }
    uVar5 = *(longlong *)(param_2 + 0x1b8) - lVar6;
    lVar7 = lVar6;
    if (0xfff < uVar5) {
      lVar7 = *(longlong *)(lVar6 + -8);
      if (0x1f < (ulonglong)((lVar6 + -8) - lVar7)) goto LAB_7ff70c9190d4;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar5);
    *(undefined8 *)(param_2 + 0x1a8) = 0;
    *(undefined8 *)(param_2 + 0x1b0) = 0;
    *(undefined8 *)(param_2 + 0x1b8) = 0;
  }
  lVar6 = *(longlong *)(param_2 + 0x180);
  if (lVar6 != 0) {
    lVar7 = *(longlong *)(param_2 + 0x188);
    if (lVar6 != lVar7) {
      do {
        uVar5 = *(ulonglong *)(lVar6 + 0x28);
        if (0xf < uVar5) {
          lVar1 = *(longlong *)(lVar6 + 0x10);
          uVar3 = uVar5 + 1;
          lVar4 = lVar1;
          if (0xfff < uVar3) {
            lVar4 = *(longlong *)(lVar1 + -8);
            if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70c9190d4;
            uVar3 = uVar5 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar4,uVar3);
        }
        *(undefined8 *)(lVar6 + 0x20) = 0;
        *(undefined8 *)(lVar6 + 0x28) = 0xf;
        *(undefined1 *)(lVar6 + 0x10) = 0;
        lVar6 = lVar6 + 0x30;
      } while (lVar6 != lVar7);
      lVar6 = *(longlong *)(param_2 + 0x180);
    }
    uVar5 = *(longlong *)(param_2 + 400) - lVar6;
    lVar7 = lVar6;
    if (0xfff < uVar5) {
      lVar7 = *(longlong *)(lVar6 + -8);
      if (0x1f < (ulonglong)((lVar6 + -8) - lVar7)) goto LAB_7ff70c9190d4;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar5);
    *(undefined8 *)(param_2 + 0x180) = 0;
    *(undefined8 *)(param_2 + 0x188) = 0;
    *(undefined8 *)(param_2 + 400) = 0;
  }
  lVar6 = *(longlong *)(param_2 + 0x158);
  if (lVar6 != 0) {
    lVar7 = *(longlong *)(param_2 + 0x160);
    if (lVar6 != lVar7) {
      do {
        uVar5 = *(ulonglong *)(lVar6 + 0x28);
        if (0xf < uVar5) {
          lVar1 = *(longlong *)(lVar6 + 0x10);
          uVar3 = uVar5 + 1;
          lVar4 = lVar1;
          if (0xfff < uVar3) {
            lVar4 = *(longlong *)(lVar1 + -8);
            if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70c9190d4;
            uVar3 = uVar5 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar4,uVar3);
        }
        *(undefined8 *)(lVar6 + 0x20) = 0;
        *(undefined8 *)(lVar6 + 0x28) = 0xf;
        *(undefined1 *)(lVar6 + 0x10) = 0;
        lVar6 = lVar6 + 0x30;
      } while (lVar6 != lVar7);
      lVar6 = *(longlong *)(param_2 + 0x158);
    }
    uVar5 = *(longlong *)(param_2 + 0x168) - lVar6;
    lVar7 = lVar6;
    if (0xfff < uVar5) {
      lVar7 = *(longlong *)(lVar6 + -8);
      if (0x1f < (ulonglong)((lVar6 + -8) - lVar7)) {
LAB_7ff70c9190d4:
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar5);
    *(undefined8 *)(param_2 + 0x158) = 0;
    *(undefined8 *)(param_2 + 0x160) = 0;
    *(undefined8 *)(param_2 + 0x168) = 0;
  }
  *(longlong *)(param_2 + 0x140) = param_2 + 0x1c8;
  *(undefined1 *)(param_2 + 0x236) = 0;
  return;
}


