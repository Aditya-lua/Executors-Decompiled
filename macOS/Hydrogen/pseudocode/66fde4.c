
void FUN_0066fde4(int param_1)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x20;
  long *plVar3;
  long lVar4;
  
  plVar3 = (long *)unaff_x20[0x12];
  if (param_1 != 0) {
    lVar4 = unaff_x20[0x13];
    (**(code **)(*plVar3 + 0x10))(plVar3);
    (**(code **)(*plVar3 + 0x58))(plVar3,lVar4);
    goto code_r0x0066fe84;
  }
  lVar1 = (**(code **)(*plVar3 + 0x10))(plVar3);
  lVar4 = unaff_x20[0x17];
  lVar2 = unaff_x20[0x18];
  if (lVar4 == lVar1) {
code_r0x0066fe68:
    unaff_x20[0x17] = lVar1;
    unaff_x20[0x18] = lVar2;
    unaff_x20[0x16] = -1;
  }
  else {
    if (lVar2 != 0) {
      if (lVar4 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + lVar4) = 0;
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
      }
      func_0x00611644();
    }
    if (lVar1 != 0) {
      lVar2 = func_0x006115d0(lVar1);
      goto code_r0x0066fe68;
    }
    unaff_x20[0x17] = 0;
    unaff_x20[0x18] = 0;
    unaff_x20[0x16] = -1;
  }
  if (unaff_x19 != 0) {
    _memcpy();
  }
code_r0x0066fe84:
  if ((*(byte *)(unaff_x20 + 0x14) >> 2 & 1) == 0) {
    return;
  }
  plVar3 = (long *)(**(code **)(*unaff_x20 + 0x160))();
                    /* WARNING: Could not recover jumptable at 0x0066fed0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar3 + 0x38))();
  return;
}

