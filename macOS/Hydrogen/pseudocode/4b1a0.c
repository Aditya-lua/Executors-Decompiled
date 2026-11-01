
void FUN_0004b1a0(void)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 *unaff_x22;
  long unaff_x29;
  undefined1 uStack0000000000000038;
  undefined1 auStack_70 [24];
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  int aiStack_40 [2];
  undefined8 uStack_38;
  
  uVar3 = __Unwind_Resume();
  lVar1 = unaff_x22[0xd];
  uVar4 = unaff_x22[0xb];
  if ((ulong)unaff_x22[0xc] <= (ulong)unaff_x22[0xb]) {
    uVar4 = unaff_x22[0xc];
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  *unaff_x22 = &UNK_00a0c238;
  unaff_x22[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x22[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x22[3] + 8))();
    __ZdlPv();
    __Unwind_Resume(uVar3);
    uVar3 = func_0x0001753c();
    __ZdlPv();
    __ZdlPv();
    uVar3 = __Unwind_Resume(uVar3);
    func_0x0003f6cc();
    func_0x0003f6cc(&uStack0000000000000038);
    *(undefined **)(unaff_x29 + -0x60) = &UNK_009f6820;
    if (*(long **)(unaff_x29 + -0x58) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0x58) + 8))();
    }
    func_0x00040478();
    __Unwind_Resume(uVar3);
    uVar3 = func_0x0001753c();
  }
  __ZdlPv();
  uVar3 = __Unwind_Resume(uVar3);
  aiStack_40[0] = 0;
  uStack_38 = __ZNSt3__115system_categoryEv();
  __ZNSt3__14__fs10filesystem11__canonicalERKNS1_4pathEPNS_10error_codeE
            (&uStack_58,uVar3,aiStack_40);
  if (lRam0000000000a33940 < 0) {
    __ZdlPv(uRam0000000000a33930);
  }
  uRam0000000000a33938 = uStack_50;
  uRam0000000000a33930 = uStack_58;
  lRam0000000000a33940 = uStack_48;
  if (aiStack_40[0] != 0) {
    uVar3 = ___cxa_allocate_exception(0x10);
    __ZNKSt3__110error_code7messageEv(auStack_70,aiStack_40);
    func_0x00049ad4(&uStack_58,"Failed to canonicalize workspace: ",auStack_70);
    __ZNSt13runtime_errorC1ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
              (uVar3,&uStack_58);
    ___cxa_throw(uVar3,PTR___ZTISt13runtime_error_009b0128,PTR___ZNSt13runtime_errorD1Ev_009b0050);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4b36c);
    (*pcVar2)();
  }
  return;
}

