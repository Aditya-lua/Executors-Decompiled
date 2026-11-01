
long * FUN_0007cfc8(void)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x23;
  undefined1 auVar5 [12];
  long in_stack_000000b8;
  long *in_stack_000000d0;
  undefined1 uStack00000000000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  
  auVar5 = __Unwind_Resume();
  uVar1 = auVar5._0_8_;
  if ((auVar5._8_4_ != 0) && (uVar1 = func_0x0001753c(uVar1), in_stack_000000e0 != 0)) {
    in_stack_000000e8 = in_stack_000000e0;
    __ZdlPv();
    uVar1 = __Unwind_Resume(uVar1);
    if (in_stack_000000d0 == unaff_x23) {
      (**(code **)(in_stack_000000b8 + 0x20))();
      in_stack_000000d0 = (long *)__Unwind_Resume(uVar1);
    }
    if (in_stack_000000d0 != (long *)0x0) goto LAB_0007d030;
  }
  in_stack_000000d0 = (long *)__Unwind_Resume(uVar1);
LAB_0007d030:
  (**(code **)(*in_stack_000000d0 + 0x28))();
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00084f3c(&uStack00000000000000d8);
  plVar2 = (long *)__Unwind_Resume(uVar1);
  if (*(char *)((long)plVar2 + 0x8f) < '\0') {
    __ZdlPv(plVar2[0xf]);
    lVar3 = plVar2[0xc];
  }
  else {
    lVar3 = plVar2[0xc];
  }
  if (lVar3 != 0) {
    plVar2[0xd] = lVar3;
    __ZdlPv();
  }
  plVar4 = (long *)plVar2[3];
  if (plVar4 == plVar2) {
    lVar3 = 4;
    plVar4 = plVar2;
  }
  else {
    if (plVar4 == (long *)0x0) {
      return plVar2;
    }
    lVar3 = 5;
  }
  (**(code **)(*plVar4 + lVar3 * 8))();
  return plVar2;
}

