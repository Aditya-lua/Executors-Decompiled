
undefined8 FUN_00021a14(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  undefined8 uVar6;
  long lVar7;
  undefined1 auStack_38 [8];
  
  uVar2 = __Unwind_Resume();
  uVar3 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar3 = func_0x00086db4(uVar3,"iscached",8);
  uVar3 = func_0x00086db4(uVar3," @ ",3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x214);
  __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(auStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  plVar4 = (long *)func_0x006e33ec(uVar2,1);
  lVar7 = *plVar4;
  uVar3 = 0;
  if (lVar7 != 0) {
    func_0x006e3c4c(uVar2,uRam0000000000a27988,0);
    func_0x006e3ee0(uVar2,0xffffd8f0);
    iVar1 = func_0x006e21f8(uVar2,0xffffffff);
    if (iVar1 == 6) {
      func_0x006e3c4c(uVar2,lVar7,0);
      func_0x006e3ee0(uVar2,0xfffffffe);
      uVar3 = func_0x006e2604(uVar2,1,0xffffffff);
      uVar6 = 0xfffffffd;
    }
    else {
      uVar3 = 0;
      uVar6 = 0xfffffffe;
    }
    func_0x006e1d54(uVar2,uVar6);
  }
  func_0x006e3c24(uVar2,uVar3);
  return 1;
}

