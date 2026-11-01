
undefined8 FUN_00053124(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  undefined8 *puVar5;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  char cStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  uVar2 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar2 = func_0x00086db4(uVar2,"getscriptbytecode_internal",0x1a);
  uVar2 = func_0x00086db4(uVar2," @ ",3);
  uVar2 = func_0x00086db4(uVar2,"/Users/x0rch/hydrogen-m/src/init_env.h",0x26);
  uVar2 = func_0x00086db4(uVar2,":",1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0xa2);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000020,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000020,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  func_0x006e69bc(param_2,1,8);
  puVar5 = (undefined8 *)func_0x006e33ec(param_2,1);
  _cStack0000000000000038 = 0;
  in_stack_00000030 = 0;
  in_stack_00000048 = 0;
  in_stack_00000040 = 0;
  in_stack_00000028 = 0;
  uStack0000000000000020 = 0;
  func_0x000532e4(&uStack0000000000000020,*puVar5);
  if (cStack0000000000000038 == '\0') {
    func_0x006e383c(param_2);
    return 1;
  }
  func_0x00053400(&uStack0000000000000008,in_stack_00000028 + 0x10);
  uVar1 = in_stack_00000010;
  puVar5 = uStack0000000000000008;
  if (-1 < (char)in_stack_00000018._7_1_) {
    uVar1 = (ulong)in_stack_00000018._7_1_;
    puVar5 = &uStack0000000000000008;
  }
  func_0x006e38d8(param_2,puVar5,uVar1);
  if ((char)in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
    return 1;
  }
  return 1;
}

