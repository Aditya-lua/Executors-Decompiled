
void FUN_0002a474(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  int unaff_w20;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  
  uVar2 = func_0x00086db4();
  uVar2 = func_0x00086db4(uVar2," @ ",3);
  uVar2 = func_0x00086db4(uVar2,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar2 = func_0x00086db4(uVar2,":",1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x93);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000018,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000018,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000018);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  if (unaff_w20 == 0) {
    func_0x006e1e34();
    return;
  }
  func_0x006e2ce4();
  func_0x0000a968();
  func_0x0002a898(&uStack0000000000000018);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  func_0x006e3964();
  func_0x006e52d0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x2a588);
  (*pcVar1)();
}

