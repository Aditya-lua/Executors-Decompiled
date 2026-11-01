
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00021c90(void)

{
  long *plVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  ulong uVar6;
  long unaff_x23;
  long lVar7;
  long unaff_x29;
  undefined1 uStack0000000000000015;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  undefined1 uStack00000000000000c9;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  undefined1 uStack00000000000000e8;
  undefined1 uStack0000000000000169;
  ulong in_stack_00000170;
  ulong in_stack_00000178;
  undefined1 *in_stack_00000180;
  long in_stack_00000188;
  long in_stack_00000190;
  undefined1 auStack_38 [8];
  
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  func_0x006e69bc();
  plVar1 = (long *)func_0x006e1710();
  if (*(char *)(*plVar1 + 3) != '\0') {
    uVar3 = func_0x006e644c();
    func_0x00026268(&uStack0000000000000030);
    lVar7 = *(long *)(unaff_x23 + 0x158);
    if (lVar7 == 0) {
      lVar7 = __Unwind_Resume(uVar3);
    }
    *(long *)(unaff_x23 + 0x160) = lVar7;
    __ZdlPv();
    uVar3 = __Unwind_Resume(uVar3);
    uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar4 = func_0x00086db4(uVar4,"getinstlist",0xb);
    uVar4 = func_0x00086db4(uVar4," @ ",3);
    uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
    uVar4 = func_0x00086db4(uVar4,":",1);
    plVar1 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x24a);
    __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar1 + *(long *)(*plVar1 + -0x18));
    plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar4 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
    __ZNSt3__16localeD1Ev(auStack_38);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar1,uVar4);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar1);
    func_0x006e3c4c(uVar3,uRam0000000000a27988,0);
    func_0x006e3ee0(uVar3,0xffffd8f0);
    return 1;
  }
  func_0x000245c0(unaff_x29 + -0x58,*(undefined8 *)(*plVar1 + 0x18));
  func_0x005edf2c(&uStack0000000000000030,1);
  in_stack_00000038 = 0;
  uStack0000000000000040 = 0;
  in_stack_000000d8 = _UNK_007fc178;
  in_stack_000000d0 = _UNK_007fc170;
  uStack00000000000000c9 = 1;
  uStack0000000000000030 = &UNK_009b2c38;
  in_stack_00000178 = _UNK_007fc178;
  in_stack_00000170 = _UNK_007fc170;
  uStack0000000000000169 = 1;
  uStack00000000000000e0 = &uStack0000000000000048;
  in_stack_00000180 = &uStack00000000000000e8;
  func_0x006ad7bc(&uStack00000000000000e8);
  uStack0000000000000030 = &UNK_00a1a200;
  puVar2 = (undefined8 *)__Znwm(0x30);
  puVar2[3] = 0;
  puVar2[2] = 0;
  puVar2[5] = 0;
  puVar2[4] = 0;
  puVar2[1] = 0;
  *puVar2 = 0;
  (*_UNK_00a1a228)(&uStack0000000000000030,in_stack_00000188,in_stack_00000190 - in_stack_00000188);
  (**(code **)(uStack0000000000000030 + 0x38))(&uStack0000000000000030,puVar2);
  uStack0000000000000018 = 0;
  in_stack_00000020 = 0;
  in_stack_00000028 = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (&uStack0000000000000018,0x60);
  lVar7 = 0;
  do {
    _snprintf(&uStack0000000000000015,3,"%02X");
    uVar3 = _strlen(&uStack0000000000000015);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000018,&uStack0000000000000015,uVar3);
    lVar7 = lVar7 + 1;
  } while (lVar7 != 0x30);
  func_0x006e3964();
  if (in_stack_00000028 < 0) {
    __ZdlPv(uStack0000000000000018);
  }
  __ZdlPv(puVar2);
  uVar6 = in_stack_00000170;
  if (in_stack_00000178 <= in_stack_00000170) {
    uVar6 = in_stack_00000178;
  }
  if (in_stack_00000180 == &uStack00000000000000e8) {
    for (; uVar6 != 0; uVar6 = uVar6 - 1) {
      (&uStack00000000000000e0)[uVar6] = 0;
    }
  }
  uVar6 = in_stack_000000d0;
  if (in_stack_000000d8 <= in_stack_000000d0) {
    uVar6 = in_stack_000000d8;
  }
  if (uStack00000000000000e0 == &uStack0000000000000048 && uVar6 != 0) {
    do {
      (&uStack0000000000000040)[uVar6] = 0;
      uVar6 = uVar6 - 1;
    } while (uVar6 != 0);
  }
  if (in_stack_00000188 != 0) {
    in_stack_00000190 = in_stack_00000188;
    __ZdlPv();
  }
  return 1;
}

