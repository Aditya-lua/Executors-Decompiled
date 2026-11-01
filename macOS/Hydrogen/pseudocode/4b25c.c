
void FUN_0004b25c(long *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 auStack_70 [24];
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  int aiStack_40 [2];
  undefined8 uStack_38;
  
  (**(code **)(*param_1 + 8))();
  func_0x00040478();
  __Unwind_Resume();
  uVar2 = func_0x0001753c();
  __ZdlPv();
  uVar2 = __Unwind_Resume(uVar2);
  aiStack_40[0] = 0;
  uStack_38 = __ZNSt3__115system_categoryEv();
  __ZNSt3__14__fs10filesystem11__canonicalERKNS1_4pathEPNS_10error_codeE
            (&uStack_58,uVar2,aiStack_40);
  if (lRam0000000000a33940 < 0) {
    __ZdlPv(uRam0000000000a33930);
  }
  uRam0000000000a33938 = uStack_50;
  uRam0000000000a33930 = uStack_58;
  lRam0000000000a33940 = uStack_48;
  if (aiStack_40[0] != 0) {
    uVar2 = ___cxa_allocate_exception(0x10);
    __ZNKSt3__110error_code7messageEv(auStack_70,aiStack_40);
    func_0x00049ad4(&uStack_58,"Failed to canonicalize workspace: ",auStack_70);
    __ZNSt13runtime_errorC1ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
              (uVar2,&uStack_58);
    ___cxa_throw(uVar2,PTR___ZTISt13runtime_error_009b0128,PTR___ZNSt13runtime_errorD1Ev_009b0050);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4b36c);
    (*pcVar1)();
  }
  return;
}

