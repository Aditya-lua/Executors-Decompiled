
undefined8 FUN_00053164(undefined8 param_1)

{
  undefined8 uVar1;
  long *plVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  char cStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  uVar1 = func_0x00086db4(param_1,"/Users/x0rch/hydrogen-m/src/init_env.h",0x26);
  uVar1 = func_0x00086db4(uVar1,":",1);
  plVar2 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar1,0xa2);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000020,(long)plVar2 + *(long *)(*plVar2 + -0x18));
  plVar3 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000020,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar1 = (**(code **)(*plVar3 + 0x38))(plVar3,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar2,uVar1);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar2);
  func_0x006e69bc();
  puVar4 = (undefined8 *)func_0x006e33ec();
  _cStack0000000000000038 = 0;
  in_stack_00000030 = 0;
  in_stack_00000048 = 0;
  in_stack_00000040 = 0;
  in_stack_00000028 = 0;
  uStack0000000000000020 = 0;
  func_0x000532e4(&uStack0000000000000020,*puVar4);
  if (cStack0000000000000038 == '\0') {
    func_0x006e383c();
    return 1;
  }
  func_0x00053400(&uStack0000000000000008,in_stack_00000028 + 0x10);
  func_0x006e38d8();
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
    return 1;
  }
  return 1;
}

