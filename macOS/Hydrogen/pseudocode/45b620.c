
void FUN_0045b620(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  undefined1 unaff_w23;
  undefined2 unaff_w24;
  long lVar4;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000048;
  long in_stack_00000058;
  
  _uStack0000000000000030 = param_1;
  while( true ) {
    func_0x0046daac(&uStack0000000000000040,&uStack0000000000000030);
    lVar3 = in_stack_00000058;
    uVar2 = in_stack_00000048;
    lVar1 = uStack0000000000000040;
    if (uStack0000000000000040 == 0) break;
    if ((ulong)(uStack0000000000000018 - unaff_x20) < in_stack_00000048) {
      func_0x007a1e50(&uStack0000000000000018,unaff_x20,in_stack_00000048);
    }
    lVar4 = in_stack_00000020;
    _memcpy(in_stack_00000020 + unaff_x20,lVar1,uVar2);
    unaff_x20 = unaff_x20 + uVar2;
    if (lVar3 != 0) {
      if ((ulong)(uStack0000000000000018 - unaff_x20) < 3) {
        func_0x007a1e50(&uStack0000000000000018,unaff_x20,3);
        lVar4 = in_stack_00000020;
      }
      *(undefined1 *)((undefined2 *)(lVar4 + unaff_x20) + 1) = unaff_w23;
      *(undefined2 *)(lVar4 + unaff_x20) = unaff_w24;
      unaff_x20 = unaff_x20 + 3;
    }
  }
  unaff_x19[1] = in_stack_00000020;
  *unaff_x19 = uStack0000000000000018;
  unaff_x19[2] = unaff_x20;
  return;
}

