
undefined8 FUN_00038dac(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long unaff_x29;
  double dVar7;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000028;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  dVar7 = (double)func_0x006e29f0(param_1,param_2,0);
  iVar3 = func_0x006e21f8();
  if (iVar3 == 7) {
    func_0x006e2154();
  }
  else {
    iVar3 = func_0x006ecb14();
    if (iVar3 == 0) {
      func_0x006e644c();
      goto LAB_00038f64;
    }
  }
  plVar4 = (long *)func_0x006e1710();
  if (*(char *)(*plVar4 + 3) == '\0') {
    if (((int)dVar7 < 1) || ((uint)*(byte *)(*plVar4 + 4) < (uint)(int)dVar7)) {
      func_0x006e644c();
    }
    else {
      func_0x006e2154();
      func_0x006e5a00();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 0;
      }
      ___stack_chk_fail();
      func_0x0000a968(&uStack0000000000000028,"expected function or number, got ");
      func_0x006e21f8();
      uVar5 = func_0x006e22ac();
      func_0x0000a968(&uStack0000000000000010,uVar5);
      uVar1 = in_stack_00000018;
      puVar6 = uStack0000000000000010;
      if (-1 < (char)in_stack_00000020._7_1_) {
        uVar1 = (ulong)in_stack_00000020._7_1_;
        puVar6 = &uStack0000000000000010;
      }
      puVar6 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                         (&uStack0000000000000028,puVar6,uVar1);
      in_stack_00000048 = puVar6[1];
      in_stack_00000040 = *puVar6;
      in_stack_00000050 = puVar6[2];
      puVar6[1] = 0;
      puVar6[2] = 0;
      *puVar6 = 0;
      func_0x006e63b0();
    }
  }
  else {
    func_0x006e644c();
  }
LAB_00038f64:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x38f68);
  (*pcVar2)();
}

