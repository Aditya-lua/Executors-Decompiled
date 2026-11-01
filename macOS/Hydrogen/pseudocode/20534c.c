
void FUN_0020534c(void)

{
  undefined4 uVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined8 uVar7;
  long *plVar8;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  ulong *unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined1 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  _memcpy();
  uVar7 = *(undefined8 *)(unaff_x28 + -0x50);
  uVar1 = *(undefined4 *)(unaff_x28 + -0x48);
  plVar8 = *(long **)(unaff_x28 + -0x78);
  lVar3 = *plVar8;
  *plVar8 = lVar3 + 1;
  if (-1 < lVar3) {
    uVar9 = *(undefined8 *)(unaff_x28 + -0x68);
    lVar3 = *(long *)(unaff_x28 + -0x70);
    if ((lVar3 == -1) ||
       (lVar4 = *(long *)(lVar3 + 8), *(long *)(lVar3 + 8) = lVar4 + 1, -1 < lVar4)) {
      uVar10 = *(undefined8 *)(unaff_x28 + -0x58);
      lVar4 = *(long *)(unaff_x28 + -0x60);
      if ((lVar4 == -1) ||
         (lVar5 = *(long *)(lVar4 + 8), *(long *)(lVar4 + 8) = lVar5 + 1, -1 < lVar5)) {
        *unaff_x21 = unaff_x22;
        unaff_x21[1] = unaff_x23;
        unaff_x21[0xd] = in_stack_00000018;
        unaff_x21[0xc] = in_stack_00000010;
        unaff_x21[0xf] = in_stack_00000028;
        unaff_x21[0xe] = in_stack_00000020;
        unaff_x21[0x10] = in_stack_00000030;
        unaff_x21[2] = unaff_x22;
        unaff_x21[3] = unaff_x27;
        unaff_x21[4] = plVar8;
        unaff_x21[6] = uVar9;
        unaff_x21[5] = lVar3;
        unaff_x21[8] = uVar10;
        unaff_x21[7] = lVar4;
        unaff_x21[9] = uVar7;
        *(undefined4 *)(unaff_x21 + 10) = uVar1;
        unaff_x21[0xb] = unaff_x26;
        *(undefined1 *)(unaff_x21 + 0x11) = in_stack_00000008;
        if ((((unaff_x20 & 1) == 0) && ((*unaff_x25 & 0x7fffffffffffffff) != 0)) &&
           (uVar6 = func_0x007a1140(), (uVar6 & 1) == 0)) {
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
  pcVar2 = (code *)SoftwareBreakpoint(1,0x205470);
  (*pcVar2)();
}

