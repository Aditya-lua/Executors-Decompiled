
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004135a0(void)

{
  undefined8 uVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  undefined1 uVar5;
  undefined8 *unaff_x19;
  long lVar6;
  uint unaff_w24;
  long unaff_x25;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined1 *in_stack_00000050;
  undefined8 *in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  
  lVar6 = in_stack_00000080;
  uVar5 = 1;
  if (unaff_w24 != 0) {
    uVar5 = 2;
  }
  *(undefined1 *)(unaff_x25 + 0xf58) = uVar5;
  if ((unaff_w24 & 1) == 0) {
    *unaff_x19 = 1;
    return;
  }
  _uStack0000000000000018 = &__ZN3std9backtrace9Backtrace7capture17h33adaef6eaef81bbE;
  if (lRam0000000000a3bfa8 == 0) {
    func_0x007a0ec8(0xa3bfa8);
    iVar2 = _pthread_mutex_lock();
    if (iVar2 != 0) goto LAB_00413820;
LAB_00413728:
    lVar6 = 0xa33000;
    if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
        0x7fffffffffffffff) == 0) {
      uVar3 = 0;
      goto LAB_0041373c;
    }
  }
  else {
    iVar2 = _pthread_mutex_lock();
    if (iVar2 == 0) goto LAB_00413728;
LAB_00413820:
    func_0x007a1368();
  }
  uVar3 = func_0x007a1140();
  uVar3 = uVar3 ^ 1;
LAB_0041373c:
  uStack0000000000000020 = 0;
  in_stack_00000028 = 8;
  in_stack_00000030 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000048 = &uStack0000000000000020;
  in_stack_00000050 = &uStack0000000000000018;
  in_stack_00000058 = &uStack0000000000000038;
  uStack0000000000000060 = &uStack0000000000000048;
  in_stack_00000068 = &UNK_009da0f8;
  __Unwind_Backtrace(&DAT_00438568,&uStack0000000000000060);
  if (in_stack_00000030 == 0) {
    *unaff_x19 = 0;
    if (uStack0000000000000020 != 0) {
      func_0x00187bd4(in_stack_00000028,uStack0000000000000020 * 0x38,8);
    }
  }
  else {
    uVar1 = in_stack_00000040;
    if ((int)uStack0000000000000038 == 0) {
      uVar1 = 0;
    }
    unaff_x19[2] = in_stack_00000028;
    unaff_x19[1] = uStack0000000000000020;
    *unaff_x19 = 2;
    unaff_x19[3] = in_stack_00000030;
    unaff_x19[4] = uVar1;
    unaff_x19[5] = 0;
  }
  if ((((uVar3 & 1) == 0) && ((*(ulong *)(lVar6 + 0x548) & 0x7fffffffffffffff) != 0)) &&
     (uVar4 = func_0x007a1140(), (uVar4 & 1) == 0)) {
    uRam0000000000a3bfb0 = 1;
  }
  _pthread_mutex_unlock(lRam0000000000a3bfa8);
  return;
}

