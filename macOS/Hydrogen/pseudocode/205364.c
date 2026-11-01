
void FUN_00205364(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined4 in_w9;
  long *in_x10;
  long in_x11;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  ulong *unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined1 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  lVar2 = *in_x10;
  *in_x10 = lVar2 + in_x11;
  if (-1 < lVar2) {
    uVar6 = *(undefined8 *)(unaff_x28 + -0x68);
    lVar2 = *(long *)(unaff_x28 + -0x70);
    if ((lVar2 == -1) ||
       (lVar3 = *(long *)(lVar2 + 8), *(long *)(lVar2 + 8) = lVar3 + 1, -1 < lVar3)) {
      uVar7 = *(undefined8 *)(unaff_x28 + -0x58);
      lVar3 = *(long *)(unaff_x28 + -0x60);
      if ((lVar3 == -1) ||
         (lVar4 = *(long *)(lVar3 + 8), *(long *)(lVar3 + 8) = lVar4 + 1, -1 < lVar4)) {
        *unaff_x21 = unaff_x22;
        unaff_x21[1] = unaff_x23;
        unaff_x21[0xd] = in_stack_00000018;
        unaff_x21[0xc] = in_stack_00000010;
        unaff_x21[0xf] = in_stack_00000028;
        unaff_x21[0xe] = in_stack_00000020;
        unaff_x21[0x10] = in_stack_00000030;
        unaff_x21[2] = unaff_x22;
        unaff_x21[3] = unaff_x27;
        unaff_x21[4] = in_x10;
        unaff_x21[6] = uVar6;
        unaff_x21[5] = lVar2;
        unaff_x21[8] = uVar7;
        unaff_x21[7] = lVar3;
        unaff_x21[9] = param_1;
        *(undefined4 *)(unaff_x21 + 10) = in_w9;
        unaff_x21[0xb] = unaff_x26;
        *(undefined1 *)(unaff_x21 + 0x11) = in_stack_00000008;
        if ((((unaff_x20 & 1) == 0) && ((*unaff_x25 & 0x7fffffffffffffff) != 0)) &&
           (uVar5 = func_0x007a1140(), (uVar5 & 1) == 0)) {
          *(undefined1 *)(unaff_x19 + 1) = 1;
        }
                    /* WARNING: Could not recover jumptable at 0x007b3b50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__pthread_mutex_unlock_00a252d0)(*unaff_x19);
        return;
      }
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x205470);
  (*pcVar1)();
}

