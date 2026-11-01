
/* WARNING: Removing unreachable block (ram,0x0004c940) */

undefined8 FUN_0004c74c(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  byte bVar6;
  undefined8 *puVar7;
  code *pcVar8;
  undefined8 *puVar9;
  long unaff_x20;
  long unaff_x22;
  ulong unaff_x23;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 *in_stack_00000048;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000060;
  undefined8 in_stack_00000068;
  
  if (unaff_x20 != 0) {
    _memmove();
  }
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  func_0x0004f3d0(&uStack0000000000000040);
  func_0x006e4118();
  puVar7 = in_stack_00000048;
  puVar2 = uStack0000000000000040;
  bVar6 = in_stack_00000068._7_1_;
  do {
    in_stack_00000068._7_1_ = bVar6;
    if (puVar2 == puVar7) {
      if (uStack0000000000000040 != (undefined8 *)0x0) {
        for (; in_stack_00000048 != uStack0000000000000040;
            in_stack_00000048 = in_stack_00000048 + -3) {
        }
        in_stack_00000048 = uStack0000000000000040;
        __ZdlPv(uStack0000000000000040);
      }
      if ((char)in_stack_00000068._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000058);
      }
      return 1;
    }
    uVar5 = in_stack_00000060;
    if (-1 < (char)bVar6) {
      uVar5 = (ulong)bVar6;
    }
    uVar1 = uVar5 + 1;
    if (unaff_x23 < uVar1) {
      func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x4c998);
      (*pcVar8)();
    }
    if (uVar1 < 0x17) {
      in_stack_00000010 = 0;
      uStack0000000000000008 = (undefined8 *)0x0;
      puVar9 = &uStack0000000000000008;
      in_stack_00000018 = uVar1 << 0x38;
      if (uVar5 != 0) goto code_r0x0004c84c;
    }
    else {
      uVar3 = (uVar1 & 0xfffffffffffffff8) + 8;
      if ((uVar1 | 7) != 0x17) {
        uVar3 = uVar1 | 7;
      }
      puVar9 = (undefined8 *)__Znwm(uVar3 + 1);
      in_stack_00000018 = uVar3 + 1 | 0x8000000000000000;
      unaff_x23 = 0x7ffffffffffffff7;
      uStack0000000000000008 = puVar9;
      in_stack_00000010 = uVar1;
code_r0x0004c84c:
      puVar4 = uStack0000000000000058;
      if (-1 < (char)bVar6) {
        puVar4 = &uStack0000000000000058;
      }
      _memmove(puVar9,puVar4,uVar5);
    }
    *(undefined2 *)((long)puVar9 + uVar5) = 0x2f;
    uVar5 = puVar2[1];
    puVar9 = (undefined8 *)*puVar2;
    if (-1 < (char)*(byte *)((long)puVar2 + 0x17)) {
      uVar5 = (ulong)*(byte *)((long)puVar2 + 0x17);
      puVar9 = puVar2;
    }
    puVar9 = (undefined8 *)
             __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                       (&uStack0000000000000008,puVar9,uVar5);
    in_stack_00000028 = puVar9[1];
    in_stack_00000020 = *puVar9;
    in_stack_00000030 = puVar9[2];
    puVar9[1] = 0;
    puVar9[2] = 0;
    *puVar9 = 0;
    func_0x006e3964();
    if (in_stack_00000030 < 0) {
      __ZdlPv(in_stack_00000020);
    }
    if ((long)in_stack_00000018 < 0) {
      __ZdlPv(uStack0000000000000008);
    }
    func_0x006e4860();
    puVar2 = puVar2 + 3;
    bVar6 = in_stack_00000068._7_1_;
  } while( true );
}

