
/* WARNING: Removing unreachable block (ram,0x002535a0) */
/* WARNING: Removing unreachable block (ram,0x002535ac) */
/* WARNING: Removing unreachable block (ram,0x002535b4) */
/* WARNING: Removing unreachable block (ram,0x002535c4) */
/* WARNING: Removing unreachable block (ram,0x002535cc) */
/* WARNING: Removing unreachable block (ram,0x002535dc) */
/* WARNING: Removing unreachable block (ram,0x002535e4) */
/* WARNING: Removing unreachable block (ram,0x002535f0) */
/* WARNING: Removing unreachable block (ram,0x002535f4) */
/* WARNING: Removing unreachable block (ram,0x002535f8) */
/* WARNING: Removing unreachable block (ram,0x00253638) */
/* WARNING: Removing unreachable block (ram,0x00253658) */
/* WARNING: Removing unreachable block (ram,0x0025360c) */

void FUN_00253464(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x21;
  long unaff_x24;
  undefined1 uStack0000000000000008;
  long in_stack_00000388;
  undefined8 in_stack_00000390;
  undefined8 in_stack_00000398;
  undefined8 in_stack_000003a0;
  undefined8 in_stack_000003a8;
  undefined8 in_stack_000003b0;
  undefined8 in_stack_000003b8;
  undefined8 in_stack_00000a80;
  undefined8 in_stack_00000a88;
  undefined8 in_stack_00000a90;
  undefined8 in_stack_00000a98;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x001da3f8(auStack_7ffffffe + 0x80000386,auStack_7ffffffe + 0x80000a9e,
                  auStack_7ffffffe + 0x8000071e,param_3,auStack_7ffffffe + 0x8000036e);
  if (in_stack_00000388 == unaff_x24) {
    _memcpy(auStack_7ffffffe + 0x8000071e,&uStack0000000000000008,0x340);
    _memcpy(auStack_7ffffffe + 0x80000a9e,&uStack0000000000000008,0x340);
    lVar2 = func_0x00187bd0(0x280,8);
    if (lVar2 == 0) {
      func_0x007a1f00(8,0x280,&UNK_009c29a8);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x253674);
      (*pcVar1)();
    }
    unaff_x21[0x70] = 0;
    unaff_x21[0x6f] = 0;
    unaff_x21[0x77] = in_stack_00000a98;
    unaff_x21[0x72] = in_stack_00000390;
    unaff_x21[0x71] = unaff_x24;
    unaff_x21[0x74] = in_stack_00000a80;
    unaff_x21[0x73] = in_stack_00000398;
    unaff_x21[0x76] = in_stack_00000a90;
    unaff_x21[0x75] = in_stack_00000a88;
    _memcpy(auStack_7ffffffe + 0x80000386,auStack_7ffffffe + 0x8000071e,0x340);
    _memcpy();
    unaff_x21[0x6d] = 0x10;
    unaff_x21[0x6e] = lVar2;
    *(undefined1 *)(unaff_x21 + 0x78) = 0;
  }
  else {
    unaff_x21[5] = in_stack_000003a8;
    unaff_x21[4] = in_stack_000003a0;
    unaff_x21[7] = in_stack_000003b8;
    unaff_x21[6] = in_stack_000003b0;
    unaff_x21[2] = in_stack_00000390;
    unaff_x21[3] = in_stack_00000398;
    *unaff_x21 = 2;
    unaff_x21[1] = in_stack_00000388;
    func_0x00245ec4(&uStack0000000000000008);
  }
  return;
}

