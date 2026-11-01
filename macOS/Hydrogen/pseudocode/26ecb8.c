
void FUN_0026ecb8(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x25;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined1 uStack0000000000000048;
  undefined1 uStack0000000000000058;
  
  _uStack0000000000000058 = param_1;
  func_0x0025dfe8(&uStack0000000000000010,&uStack0000000000000048,&uStack0000000000000058);
  lVar2 = in_stack_00000020;
  lVar1 = in_stack_00000018;
  if (uStack0000000000000010 == unaff_x21) {
    auVar5 = (**(code **)(unaff_x25 + 0x28))();
    if ((auVar5._8_8_ == lVar2) && (iVar3 = _memcmp(auVar5._0_8_,lVar1,lVar2), iVar3 == 0)) {
      uVar4 = (**(code **)(unaff_x25 + 0x20))();
      if ((uVar4 & 1) == 0) {
        *unaff_x19 = unaff_x21;
      }
      else {
        *unaff_x19 = -0x7ffffffffffffff1;
      }
    }
    else {
      *unaff_x19 = unaff_x21 + -1;
    }
  }
  else {
    unaff_x19[6] = in_stack_00000040;
    unaff_x19[5] = in_stack_00000038;
    *unaff_x19 = uStack0000000000000010;
    unaff_x19[1] = in_stack_00000018;
    unaff_x19[2] = in_stack_00000020;
    unaff_x19[3] = in_stack_00000028;
    unaff_x19[4] = in_stack_00000030;
  }
  return;
}

