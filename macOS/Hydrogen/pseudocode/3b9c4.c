
undefined8 FUN_0003b9c4(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 *unaff_x23;
  long unaff_x29;
  undefined1 auVar9 [12];
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  long *in_stack_00000048;
  undefined4 uStack_38;
  undefined4 uStack_34;
  
  func_0x005edf2c(param_1,0);
  *unaff_x23 = &UNK_009f9e90;
  unaff_x23[1] = &UNK_009fa020;
  unaff_x23[3] = &uStack0000000000000010;
  func_0x0004004c();
  func_0x0003f450(&uStack0000000000000030);
  uStack0000000000000030 = &UNK_00a0c238;
  in_stack_00000038 = &UNK_00a0c3e0;
  if (in_stack_00000048 != (long *)0x0) {
    (**(code **)(*in_stack_00000048 + 8))();
  }
  func_0x006e38d8();
  if (in_stack_00000020._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000010);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return 1;
  }
  uVar3 = ___stack_chk_fail();
  if (in_stack_00000020._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000010);
    auVar9 = __Unwind_Resume(uVar3);
    uVar3 = auVar9._0_8_;
    if (auVar9._8_4_ != 0) {
      uVar3 = func_0x0001753c(uVar3);
    }
  }
  uVar3 = __Unwind_Resume(uVar3);
  uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar4 = func_0x00086db4(uVar4,"lz4compress",0xb);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/crypt.h",0x2c);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x27b);
  __ZNKSt3__18ios_base6getlocEv(&uStack_38,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&uStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  uVar4 = func_0x006e67c8(uVar3,1,&uStack_38);
  if (CONCAT44(uStack_34,uStack_38) == 0) {
    func_0x006e38d8(uVar3,"",0);
    return 1;
  }
  uVar7 = func_0x000970d8();
  if ((int)uVar7 < 1) {
    func_0x006e644c(uVar3,
                    "LZ4_compressBound failed or returned non-positive size for input length %zu");
  }
  else {
    uVar8 = __Znam(uVar7 & 0xffffffff);
    iVar2 = func_0x0009abec(uVar4,uVar8,uStack_38,uVar7);
    if (0 < iVar2) {
      func_0x006e38d8(uVar3,uVar8,iVar2);
      __ZdaPv(uVar8);
      return 1;
    }
  }
  func_0x006e644c(uVar3,"LZ4 compression failed (return code: %d)");
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3bd14);
  (*pcVar1)();
}

