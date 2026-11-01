
undefined8 FUN_00053d90(void)

{
  long *plVar1;
  undefined8 uStack0000000000000008;
  
  plVar1 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  (**(code **)(*plVar1 + 0x38))(plVar1,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  func_0x006e69bc();
  uStack0000000000000008 = 0;
  func_0x006e2ce4();
  func_0x00700e1c();
  return 1;
}

