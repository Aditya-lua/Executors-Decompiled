
undefined8 FUN_00021940(void)

{
  int iVar1;
  long *plVar2;
  undefined1 uStack0000000000000008;
  
  plVar2 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  (**(code **)(*plVar2 + 0x38))(plVar2,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  plVar2 = (long *)func_0x006e33ec();
  if ((plVar2 != (long *)0x0) && (*plVar2 != 0)) {
    func_0x006e3c4c();
    func_0x006e3ee0();
    iVar1 = func_0x006e21f8();
    if (iVar1 == 6) {
      func_0x006e3c4c();
      func_0x006e383c();
      func_0x006e477c();
    }
    func_0x006e1d54();
  }
  return 0;
}

