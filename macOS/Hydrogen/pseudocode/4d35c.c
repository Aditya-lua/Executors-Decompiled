
undefined8 thunk_FUN_0004d360(undefined8 param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 ***pppuVar8;
  char *pcVar9;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 auStack_78 [2];
  char cStack_61;
  undefined8 ***pppuStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  char acStack_48 [8];
  
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  uVar3 = __Unwind_Resume(param_1);
  uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar4 = func_0x00086db4(uVar4,"delfile",7);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x124);
  __ZNKSt3__18ios_base6getlocEv(&pppuStack_60,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&pppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&pppuStack_60);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  uVar4 = func_0x006e67c8(uVar3,1,0);
  uVar7 = _strlen();
  if (uVar7 < 0x7ffffffffffffff8) {
    if (uVar7 < 0x17) {
      uStack_50 = CONCAT17((char)uVar7,(undefined7)uStack_50);
      pppuVar8 = &pppuStack_60;
      if (uVar7 != 0) goto LAB_0004d4ec;
    }
    else {
      uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
      if ((uVar7 | 7) != 0x17) {
        uVar1 = uVar7 | 7;
      }
      pppuVar8 = (undefined8 ***)__Znwm(uVar1 + 1);
      uStack_50 = uVar1 + 1 | 0x8000000000000000;
      pppuStack_60 = pppuVar8;
      uStack_58 = uVar7;
LAB_0004d4ec:
      _memmove(pppuVar8,uVar4,uVar7);
    }
    *(undefined1 *)((long)pppuVar8 + uVar7) = 0;
    func_0x0004dd60(auStack_78,uVar3,&pppuStack_60,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
    pcVar9 = "File does not exist";
    if ((acStack_48[0] == '\0') || (acStack_48[0] == -1)) goto code_r0x0004d5bc;
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
    if (acStack_48[0] == '\x01') {
      __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_78,0);
      if (cStack_61 < '\0') {
        __ZdlPv(auStack_78[0]);
      }
      if ((long)uStack_50 < 0) {
        __ZdlPv(pppuStack_60);
      }
      return 0;
    }
  }
  else {
    func_0x0001748c(&pppuStack_60);
  }
  pcVar9 = "Not a file";
code_r0x0004d5bc:
  func_0x006e644c(uVar3,pcVar9);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
  (*pcVar2)();
}

