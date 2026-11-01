
/* WARNING: Removing unreachable block (ram,0x0004c940) */

undefined8 FUN_0004c860(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  undefined8 *puVar5;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  ulong unaff_x23;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
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
    _memmove(param_1,param_2,unaff_x21);
    param_1 = unaff_x22;
    do {
      *(undefined2 *)((long)param_1 + unaff_x21) = 0x2f;
      uVar1 = unaff_x25[1];
      puVar5 = (undefined8 *)*unaff_x25;
      if (-1 < (char)*(byte *)((long)unaff_x25 + 0x17)) {
        uVar1 = (ulong)*(byte *)((long)unaff_x25 + 0x17);
        puVar5 = unaff_x25;
      }
      puVar5 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                         (&uStack0000000000000008,puVar5,uVar1);
      in_stack_00000028 = puVar5[1];
      in_stack_00000020 = *puVar5;
      in_stack_00000030 = puVar5[2];
      puVar5[1] = 0;
      puVar5[2] = 0;
      *puVar5 = 0;
      func_0x006e3964();
      if (in_stack_00000030 < 0) {
        __ZdlPv(in_stack_00000020);
      }
      if ((long)in_stack_00000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      func_0x006e4860();
      bVar3 = in_stack_00000068._7_1_;
      unaff_x25 = unaff_x25 + 3;
      if (unaff_x25 == unaff_x26) {
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
      unaff_x21 = in_stack_00000060;
      if (-1 < (char)in_stack_00000068._7_1_) {
        unaff_x21 = (ulong)in_stack_00000068._7_1_;
      }
      uVar1 = unaff_x21 + 1;
      if (unaff_x23 < uVar1) {
        func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x4c998);
        (*pcVar4)();
      }
      if (0x16 < uVar1) {
        uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar2 = uVar1 | 7;
        }
        param_1 = (undefined8 *)__Znwm(uVar2 + 1);
        in_stack_00000018 = uVar2 + 1 | 0x8000000000000000;
        unaff_x23 = 0x7ffffffffffffff7;
        uStack0000000000000008 = param_1;
        in_stack_00000010 = uVar1;
        break;
      }
      in_stack_00000010 = 0;
      uStack0000000000000008 = (undefined8 *)0x0;
      param_1 = &uStack0000000000000008;
      in_stack_00000018 = uVar1 << 0x38;
    } while (unaff_x21 == 0);
    param_2 = uStack0000000000000058;
    if (-1 < (char)bVar3) {
      param_2 = &uStack0000000000000058;
    }
    unaff_x22 = param_1;
  } while( true );
}

