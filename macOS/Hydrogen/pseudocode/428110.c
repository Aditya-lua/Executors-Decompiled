
void FUN_00428110(long param_1)

{
  ulong uVar1;
  ulong unaff_x19;
  long lVar2;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  param_1 = param_1 * 0x38;
  lVar2 = in_stack_00000008;
  do {
    _uStack0000000000000020 = lVar2 + 0x20;
    func_0x0043af4c(1,lVar2,&uStack0000000000000020,&UNK_009db458);
    lVar2 = lVar2 + 0x38;
    param_1 = param_1 + -0x38;
  } while (param_1 != 0);
  in_stack_00000028 = in_stack_00000008;
  _uStack0000000000000020 = in_stack_00000000;
  in_stack_00000038 = in_stack_00000018;
  in_stack_00000030 = in_stack_00000010;
  if ((((unaff_x19 & 1) == 0) && ((*(ulong *)(unaff_x23 + 0x548) & 0x7fffffffffffffff) != 0)) &&
     (uVar1 = func_0x007a1140(), (uVar1 & 1) == 0)) {
    *(undefined1 *)(unaff_x24 + 0xfb0) = 1;
  }
  _pthread_mutex_unlock(uRam0000000000a3bfa8);
  unaff_x22[1] = in_stack_00000028;
  *unaff_x22 = _uStack0000000000000020;
  unaff_x22[3] = in_stack_00000038;
  unaff_x22[2] = in_stack_00000030;
  return;
}

