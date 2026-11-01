
void FUN_001ca3d8(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  
  lVar2 = func_0x00187bd0(param_1,1);
  if (lVar2 == 0) {
    func_0x007a1f00();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1ca4bc);
    (*pcVar1)();
  }
  _memcpy(lVar2);
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = unaff_x21;
  unaff_x19[2] = unaff_x20;
  unaff_x19[3] = unaff_x22;
  unaff_x19[4] = lVar2;
  unaff_x19[5] = unaff_x22;
  unaff_x19[6] = 0;
  *(undefined2 *)(unaff_x19 + 7) = 0xb;
  func_0x0027ca20(&uStack0000000000000028);
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(uStack0000000000000028,in_stack_00000030,1);
  }
  func_0x0027c9dc(&uStack0000000000000010);
  if ((uStack0000000000000010 != -0x8000000000000000) && (uStack0000000000000010 != 0)) {
    func_0x00187bd4(in_stack_00000018,uStack0000000000000010,1);
  }
  func_0x002d8de8(in_stack_00000008);
  return;
}

