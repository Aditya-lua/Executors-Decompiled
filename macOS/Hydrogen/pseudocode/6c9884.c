
void FUN_006c9884(ulong param_1)

{
  undefined4 uVar1;
  code *pcVar2;
  undefined1 uVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  int unaff_w21;
  int unaff_w22;
  undefined8 uVar9;
  uint unaff_w24;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  long in_stack_00000040;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000070;
  
code_r0x006c9884:
  if (unaff_x20 < param_1) {
    do {
      uVar5 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + unaff_x20 * 8);
      if ((unaff_x19[0x22] != 0) && (uVar5 != unaff_x19[0x23])) {
        uVar6 = 0;
        uVar7 = uVar5 >> 4 ^ uVar5 >> 9;
        do {
          uVar7 = uVar7 & unaff_x19[0x21] - 1;
          uVar8 = *(ulong *)(unaff_x19[0x20] + uVar7 * 0x20);
          if (uVar8 == uVar5) {
            if (*(int *)(unaff_x19[0x20] + uVar7 * 0x20 + 8) == 5) {
              unaff_w21 = unaff_w21 + 1;
              unaff_x20 = unaff_x20 + 1;
              goto code_r0x006c9884;
            }
            break;
          }
          uVar6 = uVar6 + 1;
          uVar7 = uVar6 + uVar7;
        } while (uVar8 != unaff_x19[0x23] && uVar6 <= unaff_x19[0x21] - 1);
      }
      uVar1 = *(undefined4 *)((long)unaff_x19 + 0x484);
      *(uint *)((long)unaff_x19 + 0x484) = ((unaff_w22 - unaff_w21) + (int)unaff_x20 & 0xffU) + 1;
      func_0x006c6028();
      *(undefined4 *)((long)unaff_x19 + 0x484) = uVar1;
      param_1 = *(ulong *)(in_stack_00000040 + 0x38);
      unaff_x20 = unaff_x20 + 1;
    } while (unaff_x20 < param_1);
  }
  uVar4 = func_0x006b1354(*unaff_x19,"format",6);
  if ((int)uVar4 < 0) {
    func_0x006bc388(in_stack_00000040 + 0xc,"Exceeded constant limit; simplify the code to compile")
    ;
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
    (*pcVar2)();
  }
  uVar9 = *unaff_x19;
  uVar3 = func_0x006b401c("format",6);
  func_0x006b1ccc(uVar9,0x14,unaff_w24 & 0xff,unaff_w24 & 0xff,uVar3);
  func_0x006b24c4(*unaff_x19,uVar4);
  func_0x006b1ccc(*unaff_x19,0x15,unaff_w24 & 0xff,
                  (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2U & 0xff,2);
  func_0x006b1ccc(*unaff_x19,6,in_stack_00000018._4_4_,unaff_w24 & 0xff,0);
  *(uint *)((long)unaff_x19 + 0x484) = unaff_w24;
  if (in_stack_00000058 != 0) {
    __ZdaPv();
  }
  if (in_stack_00000070 < 0) {
    __ZdlPv(in_stack_00000060);
  }
  return;
}

