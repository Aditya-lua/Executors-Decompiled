
void FUN_00193c58(void)

{
  long lVar1;
  ulong uVar2;
  long *unaff_x21;
  long lVar3;
  long unaff_x23;
  long lVar4;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  func_0x0079ab9c();
  lVar3 = in_stack_00000028;
  lVar4 = in_stack_00000020;
  _memcpy(in_stack_00000020 + in_stack_00000028);
  lVar3 = lVar3 + unaff_x23;
  in_stack_00000028 = lVar3;
  lVar1 = _CFDataGetBytePtr(uStack0000000000000010);
  if (lVar1 == 0) {
    uVar2 = 0;
    lVar1 = 1;
  }
  else {
    uVar2 = _CFDataGetLength(uStack0000000000000010);
    if ((ulong)(uStack0000000000000018 - lVar3) < uVar2) {
      func_0x0079ab9c(&uStack0000000000000018,lVar3,uVar2,1,1);
      lVar3 = in_stack_00000028;
      lVar4 = in_stack_00000020;
    }
  }
  _memcpy(lVar4 + lVar3,lVar1,uVar2);
  lVar1 = in_stack_00000020;
  lVar4 = uStack0000000000000018;
  in_stack_00000028 = lVar3 + uVar2;
  func_0x0019fb28(&uStack0000000000000010);
  _CFRelease();
  _CFRelease();
  *unaff_x21 = lVar4;
  unaff_x21[2] = lVar3 + uVar2;
  unaff_x21[1] = lVar1;
  return;
}

