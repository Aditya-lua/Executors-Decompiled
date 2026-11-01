
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0042ca48(undefined1 param_1)

{
  code *pcVar1;
  long lVar2;
  int iVar3;
  long *plVar4;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined1 uStack000000000000000f;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 *in_stack_00000030;
  undefined1 *in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  
  _uStack0000000000000010 = unaff_x19[2];
  uStack000000000000000f = param_1;
  _uStack0000000000000018 = func_0x0042d564(*unaff_x19,unaff_x19[1]);
  uStack0000000000000028 = &uStack0000000000000010;
  in_stack_00000030 = &uStack0000000000000018;
  in_stack_00000038 = &uStack000000000000000f;
  _uStack0000000000000040 = func_0x0041de60(0);
  lVar2 = uStack0000000000000040._8_8_;
  if (((uStack0000000000000040 & 1) == 0) && (lVar2 != 0)) {
    in_stack_00000050 = lVar2;
    if (*(long *)(lVar2 + 0x10) == 0) {
      func_0x007a0ec8(lVar2 + 0x10);
    }
    iVar3 = _pthread_mutex_lock();
    if (iVar3 != 0) {
      func_0x007a1368();
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x42cb64);
      (*pcVar1)();
    }
    if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
        0x7fffffffffffffff) != 0) {
      func_0x007a1140();
    }
    func_0x0042cba8(&uStack0000000000000028,lVar2 + 0x20,&UNK_009db138);
    func_0x0043e538();
    auVar5 = func_0x0041de60(lVar2);
    plVar4 = auVar5._8_8_;
    *(undefined1 (*) [16])(unaff_x29 + -0x38) = auVar5;
    if ((auVar5._0_8_ & 1) == 0) {
      *(undefined8 *)(unaff_x29 + -0x48) = 1;
      *(long **)(unaff_x29 + -0x40) = plVar4;
      if (plVar4 != (long *)0x0) {
        lVar2 = *plVar4;
        *plVar4 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          DataMemoryBarrier(2,1);
          func_0x00403ba4(unaff_x29 + -0x40);
        }
      }
    }
    else {
      func_0x003f63a0(unaff_x29 + -0x38);
    }
  }
  else {
    func_0x003f63a0(&uStack0000000000000040);
    func_0x0042cba8(&uStack0000000000000028,unaff_x29 + -0x21,&UNK_009db188);
  }
  return;
}

