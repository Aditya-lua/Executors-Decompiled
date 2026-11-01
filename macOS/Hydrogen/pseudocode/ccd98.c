
void FUN_000ccd98(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  uint uVar2;
  char cVar3;
  byte bVar4;
  bool bVar5;
  byte bVar6;
  long in_x11;
  long in_x14;
  long lVar7;
  long unaff_x20;
  long unaff_x29;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000198;
  long in_stack_000001b8;
  
  if (*(float *)(unaff_x20 + 0x204) <= *(float *)(unaff_x20 + 0x1fc)) {
    if ((*(char *)(unaff_x20 + 0xdc) < '\x01') && (*(char *)(unaff_x20 + 0xdd) < '\x01')) {
      *(undefined1 *)(unaff_x20 + 0xe4) = 1;
    }
    else {
      *(undefined1 *)(unaff_x20 + 0xe5) = 1;
    }
  }
  if (in_x14 != 0) {
    if (*(char *)(in_x14 + 0xc1) == '\0') {
      if ('\0' < *(char *)(in_x14 + 0xe4)) {
        *(undefined1 *)(unaff_x20 + 0xe4) = 1;
      }
      if (*(char *)(in_x14 + 0xe5) < '\x01') goto LAB_000cce08;
    }
    else {
      *(undefined1 *)(unaff_x20 + 0xe4) = 1;
    }
    *(undefined1 *)(unaff_x20 + 0xe5) = 1;
  }
LAB_000cce08:
  if (*(float *)(&UNK_000038e8 + in_x11) <= 0.0) {
    *(undefined1 *)(unaff_x20 + 0xe4) = 1;
    *(undefined1 *)(unaff_x20 + 0xc5) = 1;
    cVar3 = *(char *)(unaff_x20 + 0xe7);
joined_r0x000cce60:
    bVar4 = 1;
    bVar6 = 1;
  }
  else {
    if (('\0' < *(char *)(unaff_x20 + 0xe4)) || ('\0' < *(char *)(unaff_x20 + 0xe5))) {
      *(undefined1 *)(unaff_x20 + 0xc5) = 1;
      cVar3 = *(char *)(unaff_x20 + 0xe7);
      goto joined_r0x000cce60;
    }
    bVar6 = 0;
    bVar4 = 0;
    *(bool *)(unaff_x20 + 0xc5) = '\0' < *(char *)(unaff_x20 + 0xe6);
    cVar3 = *(char *)(unaff_x20 + 0xe7);
  }
  if ('\0' < cVar3) {
    *(char *)(unaff_x20 + 0xe7) = cVar3 + -1;
    *(uint *)(unaff_x20 + 0x14) = *(uint *)(unaff_x20 + 0x14) | 0x30200;
    bVar4 = bVar6;
  }
  if ((((*(char *)(unaff_x20 + 0xc1) == '\0') &&
       ((bool)(*(char *)(unaff_x20 + 0xbe) != '\0' & (bVar4 ^ 1)))) ||
      ('\0' < *(char *)(unaff_x20 + 0xdc))) || ('\0' < *(char *)(unaff_x20 + 0xdd))) {
    bVar5 = false;
  }
  else {
    bVar5 = *(char *)(unaff_x20 + 0xe5) < '\x01';
  }
  *(bool *)(unaff_x20 + 0xc3) = bVar5;
  if (*(char *)(unaff_x20 + 0xc6) == '\0') {
    uVar2 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar2 = in_stack_00000198._4_4_;
    }
    if (((uVar2 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) == (int)*(char *)(param_1 + 0x7c))))) {
      if ('\0' < *(char *)(unaff_x20 + 0xdc)) {
        *(char *)(unaff_x20 + 0xdc) = *(char *)(unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)(unaff_x20 + 0xdd) < '\x01') {
        bVar5 = false;
      }
      else {
        bVar5 = false;
        *(char *)(unaff_x20 + 0xdd) = *(char *)(unaff_x20 + 0xdd) + '\x01';
      }
      goto LAB_000cced0;
    }
  }
  bVar5 = *(char *)(unaff_x20 + 0xc3) == '\0';
LAB_000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar5);
  auVar9 = __Unwind_Resume();
  lVar7 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar7 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar7 + 0x2a8),auVar9._0_8_,auVar9._8_8_,param_4);
  lVar1 = *(long *)(*(long *)(lVar7 + 0x2a8) + 0x60) +
          (long)*(int *)(*(long *)(lVar7 + 0x2a8) + 0x58) * 0x10;
  uVar8 = *(undefined8 *)(lVar1 + -0x10);
  *(undefined8 *)(lVar7 + 0x250) = *(undefined8 *)(lVar1 + -8);
  *(undefined8 *)(lVar7 + 0x248) = uVar8;
  return;
}

