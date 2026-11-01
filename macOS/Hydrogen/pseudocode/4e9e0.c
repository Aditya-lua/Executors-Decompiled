
void FUN_0004e9e0(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  long lVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  int iVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long *unaff_x19;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined7 uStack0000000000000068;
  char cStack000000000000006f;
  long in_stack_00000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000090;
  undefined7 uStack0000000000000098;
  undefined1 uStack000000000000009f;
  undefined7 uStack00000000000000a0;
  byte bStack00000000000000a7;
  
  *(undefined8 *)(unaff_x29 + -0x68) = *param_1;
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  __ZNKSt3__14__fs10filesystem4path5beginEv(&uStack0000000000000058,param_3);
  __ZNKSt3__14__fs10filesystem4path3endEv(&uStack0000000000000020);
  while (in_stack_00000070 != in_stack_00000038 || in_stack_00000078 != in_stack_00000040) {
    if (cStack000000000000006f < '\0') {
      func_0x00017634();
    }
    else {
      in_stack_00000000 = uStack0000000000000058;
      in_stack_00000010 = CONCAT17(cStack000000000000006f,uStack0000000000000068);
    }
    uStack0000000000000090 = (undefined8 *)0x0;
    uStack0000000000000098 = 0;
    uStack000000000000009f = 0;
    uStack00000000000000a0 = 0;
    bStack00000000000000a7 = 0;
    func_0x00017184(&uStack0000000000000090,".","");
    iVar5 = __ZNKSt3__14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
                      ();
    if ((char)bStack00000000000000a7 < '\0') {
      __ZdlPv(uStack0000000000000090);
    }
    if (iVar5 != 0) {
      uStack0000000000000090 = (undefined8 *)0x0;
      uStack0000000000000098 = 0;
      uStack000000000000009f = 0;
      uStack00000000000000a0 = 0;
      bStack00000000000000a7 = 0;
      func_0x00017184(&uStack0000000000000090,"..","");
      iVar5 = __ZNKSt3__14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
                        ();
      if ((char)bStack00000000000000a7 < '\0') {
        __ZdlPv(uStack0000000000000090);
      }
      if (iVar5 == 0) {
        auVar8 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv();
        uVar7 = auVar8._8_8_;
        if (0x7ffffffffffffff7 < uVar7) goto code_r0x0004ec7c;
        if (uVar7 < 0x17) {
          bStack00000000000000a7 = auVar8[8];
          puVar6 = &uStack0000000000000090;
          if (uVar7 != 0) goto code_r0x0004eb9c;
        }
        else {
          uVar2 = (uVar7 & 0xfffffffffffffff8) + 8;
          if ((uVar7 | 7) != 0x17) {
            uVar2 = uVar7 | 7;
          }
          lVar1 = uVar2 + 1;
          puVar6 = (undefined8 *)__Znwm(lVar1);
          bStack00000000000000a7 = (byte)((ulong)lVar1 >> 0x38) | 0x80;
          uStack0000000000000098 = auVar8._8_7_;
          uStack000000000000009f = auVar8[0xf];
          uStack00000000000000a0 = (undefined7)lVar1;
          uStack0000000000000090 = puVar6;
code_r0x0004eb9c:
          _memmove(puVar6,auVar8._0_8_,uVar7);
        }
        *(undefined1 *)((long)puVar6 + uVar7) = 0;
        bVar3 = bStack00000000000000a7;
        puVar6 = uStack0000000000000090;
        *(ulong *)(unaff_x29 + -0x78) = CONCAT17(uStack000000000000009f,uStack0000000000000098);
        *(ulong *)(unaff_x29 + -0x71) = CONCAT71(uStack00000000000000a0,uStack000000000000009f);
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          __ZdlPv(*unaff_x19);
        }
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = *(long *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)unaff_x19 + 0xf) = *(undefined8 *)(unaff_x29 + -0x71);
        *(byte *)((long)unaff_x19 + 0x17) = bVar3;
      }
      else {
        func_0x0001754c();
      }
    }
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
    }
    __ZNSt3__14__fs10filesystem4path8iterator11__incrementEv(&uStack0000000000000058);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000020);
  }
  if (cStack000000000000006f < '\0') {
    __ZdlPv(uStack0000000000000058);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return;
    }
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return;
  }
  ___stack_chk_fail();
code_r0x0004ec7c:
  func_0x0001748c(&uStack0000000000000090);
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4ec88);
  (*pcVar4)();
}

