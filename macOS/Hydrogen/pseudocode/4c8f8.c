
/* WARNING: Removing unreachable block (ram,0x0004c940) */

undefined8 FUN_0004c8f8(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long *plVar5;
  long *plVar6;
  byte bVar7;
  code *pcVar8;
  undefined8 *puVar9;
  ulong unaff_x23;
  long *unaff_x25;
  long unaff_x26;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000060;
  undefined8 in_stack_00000068;
  
  do {
    __ZdlPv(param_1);
    plVar6 = unaff_x25;
    do {
      if ((long)in_stack_00000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      func_0x006e4860();
      bVar7 = in_stack_00000068._7_1_;
      unaff_x25 = plVar6 + 3;
      if (unaff_x25 == (long *)unaff_x26) {
        if (in_stack_00000040 != 0) {
          for (; in_stack_00000048 != in_stack_00000040;
              in_stack_00000048 = in_stack_00000048 + -0x18) {
          }
          in_stack_00000048 = in_stack_00000040;
          __ZdlPv(in_stack_00000040);
        }
        if ((char)in_stack_00000068._7_1_ < '\0') {
          __ZdlPv(uStack0000000000000058);
        }
        return 1;
      }
      uVar4 = in_stack_00000060;
      if (-1 < (char)in_stack_00000068._7_1_) {
        uVar4 = (ulong)in_stack_00000068._7_1_;
      }
      uVar1 = uVar4 + 1;
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
        if (uVar4 != 0) goto code_r0x0004c84c;
      }
      else {
        uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar2 = uVar1 | 7;
        }
        puVar9 = (undefined8 *)__Znwm(uVar2 + 1);
        in_stack_00000018 = uVar2 + 1 | 0x8000000000000000;
        unaff_x23 = 0x7ffffffffffffff7;
        uStack0000000000000008 = puVar9;
        in_stack_00000010 = uVar1;
code_r0x0004c84c:
        puVar3 = uStack0000000000000058;
        if (-1 < (char)bVar7) {
          puVar3 = &uStack0000000000000058;
        }
        _memmove(puVar9,puVar3,uVar4);
      }
      *(undefined2 *)((long)puVar9 + uVar4) = 0x2f;
      uVar4 = plVar6[4];
      plVar5 = (long *)*unaff_x25;
      if (-1 < (char)*(byte *)((long)plVar6 + 0x2f)) {
        uVar4 = (ulong)*(byte *)((long)plVar6 + 0x2f);
        plVar5 = unaff_x25;
      }
      puVar9 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                         (&uStack0000000000000008,plVar5,uVar4);
      in_stack_00000028 = puVar9[1];
      in_stack_00000020 = *puVar9;
      in_stack_00000030 = puVar9[2];
      puVar9[1] = 0;
      puVar9[2] = 0;
      *puVar9 = 0;
      func_0x006e3964();
      plVar6 = unaff_x25;
    } while (-1 < in_stack_00000030);
    param_1 = in_stack_00000020;
  } while( true );
}

