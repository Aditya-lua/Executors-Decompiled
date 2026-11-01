
void FUN_006c0c78(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong uVar4;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  
  func_0x006b1ccc();
  func_0x006b2784(*unaff_x19);
  uVar3 = func_0x006b2794(*unaff_x19);
  puVar1 = in_stack_00000008;
  if ((uVar3 & 1) != 0) {
    while( true ) {
      if (puVar1 == in_stack_00000010) {
        if (in_stack_00000008 != (undefined8 *)0x0) {
          __ZdlPv(in_stack_00000008);
        }
        func_0x006bf744();
        uVar4 = unaff_x28 - unaff_x27 >> 4;
        func_0x006cb1e0();
        uVar3 = (long)(unaff_x19[0x9b] - unaff_x19[0x9a]) >> 4;
        if (uVar4 < uVar3 || uVar4 - uVar3 == 0) {
          if (uVar4 < uVar3) {
            unaff_x19[0x9b] = unaff_x19[0x9a] + uVar4 * 0x10;
          }
        }
        else {
          func_0x006cb2a8(unaff_x19 + 0x9a,uVar4 - uVar3);
        }
        unaff_x19[0x9e] = unaff_x19[0x9e] + -0x18;
        *(undefined4 *)((long)unaff_x19 + 0x484) = in_stack_00000000._4_4_;
        return;
      }
      uVar3 = func_0x006b2794(*unaff_x19,*puVar1);
      if ((uVar3 & 1) == 0) break;
      puVar1 = puVar1 + 1;
    }
  }
  func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x6c0d84);
  (*pcVar2)();
}

