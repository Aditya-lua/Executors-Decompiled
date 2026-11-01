
undefined8 FUN_000216e0(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  undefined1 uStack0000000000000060;
  undefined1 auStack_38 [8];
  
  if (in_stack_00000058 < 0) {
    __ZdlPv(in_stack_00000048);
    uVar2 = __Unwind_Resume(param_1);
    __ZNSt3__16localeD1Ev(&uStack0000000000000060);
    param_1 = __Unwind_Resume(uVar2);
  }
  uVar2 = __Unwind_Resume(param_1);
  uVar3 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar3 = func_0x00086db4(uVar3,"replace",7);
  uVar3 = func_0x00086db4(uVar3," @ ",3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x251);
  __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(auStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  plVar4 = (long *)func_0x006e33ec(uVar2,1);
  lVar6 = *plVar4;
  if (lVar6 != 0) {
    func_0x006e3c4c(uVar2,uRam0000000000a27988,0);
    func_0x006e3ee0(uVar2,0xffffd8f0);
    iVar1 = func_0x006e21f8(uVar2,0xffffffff);
    if (iVar1 == 6) {
      func_0x006e3c4c(uVar2,lVar6,0);
      func_0x006e2154(uVar2,2);
      func_0x006e477c(uVar2,0xfffffffd);
    }
    func_0x006e1d54(uVar2,0xfffffffe);
  }
  return 0;
}

