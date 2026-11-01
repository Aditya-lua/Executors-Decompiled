
/* WARNING: Removing unreachable block (ram,0x00054174) */
/* WARNING: Removing unreachable block (ram,0x00054268) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00053eb0(undefined8 param_1,long param_2)

{
  ulong uVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 *puVar6;
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
  ulong in_stack_00000190;
  ulong in_stack_00000198;
  undefined1 uStack_11;
  
  uVar2 = func_0x00086db4(param_1,param_2 + 0x6e2,0x26);
  uVar2 = func_0x00086db4(uVar2,":",1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0xca);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000030,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000030,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000030);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  func_0x006e69bc();
  uVar2 = func_0x006e2ce4();
  uVar5 = _strlen();
  if (0x7ffffffffffffff7 < uVar5) {
    uVar2 = func_0x0001748c(unaff_x29 + -0x58);
    func_0x00026268(&uStack0000000000000030);
    uVar2 = __Unwind_Resume(uVar2);
    uVar2 = func_0x0005429c(&uStack_11,uVar2);
    return uVar2;
  }
  if (uVar5 < 0x17) {
    *(char *)(unaff_x29 + -0x41) = (char)uVar5;
    lVar7 = unaff_x29 + -0x58;
    if (uVar5 == 0) goto code_r0x00053fc0;
  }
  else {
    uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar1 = uVar5 | 7;
    }
    lVar7 = __Znwm(uVar1 + 1);
    in_stack_00000198 = uVar1 + 1 | 0x8000000000000000;
    in_stack_00000188 = lVar7;
    in_stack_00000190 = uVar5;
  }
  _memmove(lVar7,uVar2,uVar5);
code_r0x00053fc0:
  *(undefined1 *)(lVar7 + uVar5) = 0;
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
  puVar6 = (undefined8 *)__Znwm(0x30);
  puVar6[3] = 0;
  puVar6[2] = 0;
  puVar6[5] = 0;
  puVar6[4] = 0;
  puVar6[1] = 0;
  *puVar6 = 0;
  uVar5 = in_stack_00000190;
  lVar7 = in_stack_00000188;
  if (-1 < (char)*(byte *)(unaff_x29 + -0x41)) {
    uVar5 = (ulong)*(byte *)(unaff_x29 + -0x41);
    lVar7 = unaff_x29 + -0x58;
  }
  (*_UNK_00a1a228)(&uStack0000000000000030,lVar7,uVar5);
  (**(code **)(uStack0000000000000030 + 0x38))(&uStack0000000000000030,puVar6);
  uStack0000000000000018 = 0;
  in_stack_00000020 = 0;
  in_stack_00000028 = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (&uStack0000000000000018,0x60);
  lVar7 = 0;
  do {
    _snprintf(&uStack0000000000000015,3,"%02X");
    uVar2 = _strlen(&uStack0000000000000015);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000018,&uStack0000000000000015,uVar2);
    lVar7 = lVar7 + 1;
  } while (lVar7 != 0x30);
  func_0x006e3964();
  if (in_stack_00000028 < 0) {
    __ZdlPv(uStack0000000000000018);
  }
  __ZdlPv(puVar6);
  if (in_stack_00000178 <= in_stack_00000170) {
    in_stack_00000170 = in_stack_00000178;
  }
  uVar5 = in_stack_00000170;
  if (in_stack_00000180 == &uStack00000000000000e8) {
    for (; uVar5 != 0; uVar5 = uVar5 - 1) {
      (&uStack00000000000000e0)[uVar5] = 0;
    }
  }
  if (in_stack_000000d8 <= in_stack_000000d0) {
    in_stack_000000d0 = in_stack_000000d8;
  }
  uVar5 = in_stack_000000d0;
  if (uStack00000000000000e0 == &uStack0000000000000048 && in_stack_000000d0 != 0) {
    do {
      (&uStack0000000000000040)[uVar5] = 0;
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
  }
  return 1;
}

