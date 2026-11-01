
long * FUN_0028b164(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long *plVar7;
  long unaff_x29;
  undefined4 *in_stack_00000000;
  ulong *in_stack_00000008;
  long *in_stack_00000010;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a8;
  
  lVar2 = func_0x002a4fe0();
  if (((lVar2 != 0) && (iVar1 = func_0x0029b3b0(in_stack_00000068,2), iVar1 != 0)) &&
     (iVar1 = func_0x002a27b4(in_stack_00000058,in_stack_00000068), iVar1 != 0)) {
    uVar6 = 2;
    do {
      iVar1 = func_0x0029dd44(in_stack_00000058);
      if (iVar1 == 0) {
        iVar1 = func_0x002ac8b0(in_stack_000000a8,3,1);
        if (iVar1 != 0) {
          func_0x0029bc0c(*in_stack_00000010);
          func_0x0029bc0c(in_stack_00000010[1]);
          func_0x0029bc0c(in_stack_00000010[2]);
          lVar4 = func_0x0029bca4(in_stack_00000070);
          *in_stack_00000010 = lVar4;
          lVar4 = func_0x0029bca4(in_stack_00000090);
          in_stack_00000010[1] = lVar4;
          lVar4 = func_0x0029bca4(in_stack_00000058);
          in_stack_00000010[2] = lVar4;
          if (*in_stack_00000010 != 0) {
            plVar7 = (long *)0x0;
            if ((in_stack_00000010[1] != 0) && (lVar4 != 0)) {
              if (in_stack_00000000 != (undefined4 *)0x0) {
                *in_stack_00000000 = in_stack_00000050._4_4_;
              }
              if (in_stack_00000008 != (ulong *)0x0) {
                *in_stack_00000008 = uVar6;
              }
              plVar7 = (long *)((long)&MACH_HEADER.magic + 1);
            }
            goto LAB_0028b208;
          }
        }
        break;
      }
      uVar3 = func_0x0029be44();
      iVar1 = func_0x0029ac7c(in_stack_00000068,in_stack_00000068,uVar3);
      if (iVar1 == 0) break;
      uVar6 = (ulong)((int)uVar6 + 1);
      iVar1 = func_0x002a27b4(in_stack_00000058,in_stack_00000068);
    } while (iVar1 != 0);
  }
  plVar7 = (long *)0x0;
LAB_0028b208:
  func_0x0029e4bc();
  func_0x0029e220();
  func_0x002a34e0(lVar2);
  func_0x0036e464(unaff_x29 + -0x80,0x20);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return plVar7;
  }
  puVar5 = (undefined8 *)___stack_chk_fail();
  plVar7 = (long *)func_0x0036e31c(0x110);
  if (plVar7 != (long *)0x0) {
    *(undefined4 *)(plVar7 + 0x20) = 1;
    func_0x00373d98(plVar7 + 5);
    func_0x0029668c(plVar7 + 0x21);
    lVar2 = func_0x0029bca4(*puVar5);
    *plVar7 = lVar2;
    lVar2 = func_0x0029bca4(puVar5[1]);
    plVar7[1] = lVar2;
    lVar2 = func_0x0029bca4(puVar5[2]);
    plVar7[2] = lVar2;
    if (((*plVar7 == 0) || (plVar7[1] == 0)) || (lVar2 == 0)) {
      func_0x0028a730(plVar7);
      return (long *)0x0;
    }
  }
  return plVar7;
}

