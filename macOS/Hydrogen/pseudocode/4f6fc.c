
void FUN_0004f6fc(void)

{
  long lVar1;
  long *in_stack_00000038;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000060;
  
  __ZNSt3__119__shared_weak_count14__release_weakEv();
  if (in_stack_00000038 != (long *)0x0) {
    LOAcquire();
    lVar1 = in_stack_00000038[1];
    in_stack_00000038[1] = lVar1 + -1;
    LORelease();
    if (lVar1 == 0) {
      (**(code **)(*in_stack_00000038 + 0x10))(in_stack_00000038);
      __ZNSt3__119__shared_weak_count14__release_weakEv(in_stack_00000038);
    }
  }
  if (in_stack_00000048 != (long *)0x0) {
    LOAcquire();
    lVar1 = in_stack_00000048[1];
    in_stack_00000048[1] = lVar1 + -1;
    LORelease();
    if (lVar1 == 0) {
      (**(code **)(*in_stack_00000048 + 0x10))(in_stack_00000048);
      __ZNSt3__119__shared_weak_count14__release_weakEv(in_stack_00000048);
    }
  }
  if (in_stack_00000060 < 0) {
    __ZdlPv(in_stack_00000050);
  }
  return;
}

