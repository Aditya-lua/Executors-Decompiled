
undefined8 FUN_00021774(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  undefined1 uStack0000000000000008;
  
  uVar2 = func_0x00086db4(param_1,param_2,3);
  uVar2 = func_0x00086db4(uVar2,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar2 = func_0x00086db4(uVar2,":",1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x251);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000008,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000008,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  plVar3 = (long *)func_0x006e33ec();
  if (*plVar3 != 0) {
    func_0x006e3c4c();
    func_0x006e3ee0();
    iVar1 = func_0x006e21f8();
    if (iVar1 == 6) {
      func_0x006e3c4c();
      func_0x006e2154();
      func_0x006e477c();
    }
    func_0x006e1d54();
  }
  return 0;
}

