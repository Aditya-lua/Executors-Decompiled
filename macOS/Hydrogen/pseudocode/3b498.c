
undefined8 FUN_0003b498(undefined8 param_1)

{
  undefined8 uVar1;
  long *plVar2;
  long *plVar3;
  undefined1 uStack0000000000000008;
  
  uVar1 = func_0x00086db4(param_1,"[LOG] ",6);
  uVar1 = func_0x00086db4(uVar1,"getexecutorname",0xf);
  uVar1 = func_0x00086db4(uVar1," @ ",3);
  uVar1 = func_0x00086db4(uVar1,"/Users/x0rch/hydrogen-m/src/lua/libs/reflection.h",0x31);
  uVar1 = func_0x00086db4(uVar1,":",1);
  plVar2 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar1,0x28);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000008,(long)plVar2 + *(long *)(*plVar2 + -0x18));
  plVar3 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000008,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar1 = (**(code **)(*plVar3 + 0x38))(plVar3,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar2,uVar1);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar2);
  func_0x006e3964();
  func_0x006e3964();
  return 2;
}

