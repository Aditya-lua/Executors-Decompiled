
void FUN_007143a8(void)

{
  long lVar1;
  undefined8 uVar2;
  long extraout_x8;
  undefined8 extraout_x9;
  long *in_stack_00000048;
  long in_stack_00000050;
  undefined8 *puStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  do {
    __Unwind_Resume();
    *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
    lVar1 = *in_stack_00000048 + in_stack_00000050 * 8;
  } while (lVar1 == in_stack_00000048[1]);
  in_stack_00000048[1] = lVar1;
  lVar1 = __Unwind_Resume();
  uStack_28 = *(undefined8 *)(lVar1 + 0x8c);
  uStack_30 = *(undefined8 *)(lVar1 + 0x84);
  func_0x00710d48();
  if (*(int *)(*(long *)(lVar1 + 0x150) + -4) == 0) {
    uStack_40 = 0;
    uStack_38 = 0;
    uVar2 = func_0x00704c24(*(undefined8 *)(lVar1 + 0xd8),0x20);
    func_0x00706fc0(uVar2,&uStack_30);
    puStack_50 = (undefined8 *)func_0x00704c24(*(undefined8 *)(lVar1 + 0xd8),8);
    *puStack_50 = uVar2;
    uStack_48 = 1;
    func_0x00716770(lVar1,&uStack_30,&uStack_40,&puStack_50,"break statement must be inside a loop")
    ;
    return;
  }
  uVar2 = func_0x00704c24(*(undefined8 *)(lVar1 + 0xd8),0x20);
  func_0x00706fc0(uVar2,&uStack_30);
  return;
}

