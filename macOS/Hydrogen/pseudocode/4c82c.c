
/* WARNING: Removing unreachable block (ram,0x0004c940) */

undefined8 FUN_0004c82c(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  code *pcVar3;
  undefined8 *puVar4;
  ulong unaff_x21;
  ulong unaff_x23;
  int unaff_w24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x27;
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
  
code_r0x0004c82c:
  puVar4 = (undefined8 *)__Znwm(unaff_x23);
  in_stack_00000018 = unaff_x23 | 0x8000000000000000;
  uStack0000000000000008 = puVar4;
  in_stack_00000010 = unaff_x27;
  do {
    puVar2 = uStack0000000000000058;
    if (-1 < unaff_w24) {
      puVar2 = &uStack0000000000000058;
    }
    _memmove(puVar4,puVar2,unaff_x21);
    do {
      *(undefined2 *)((long)puVar4 + unaff_x21) = 0x2f;
      uVar1 = unaff_x25[1];
      puVar4 = (undefined8 *)*unaff_x25;
      if (-1 < (char)*(byte *)((long)unaff_x25 + 0x17)) {
        uVar1 = (ulong)*(byte *)((long)unaff_x25 + 0x17);
        puVar4 = unaff_x25;
      }
      puVar4 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                         (&uStack0000000000000008,puVar4,uVar1);
      in_stack_00000028 = puVar4[1];
      in_stack_00000020 = *puVar4;
      in_stack_00000030 = puVar4[2];
      puVar4[1] = 0;
      puVar4[2] = 0;
      *puVar4 = 0;
      func_0x006e3964();
      if (in_stack_00000030 < 0) {
        __ZdlPv(in_stack_00000020);
      }
      if ((long)in_stack_00000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      func_0x006e4860();
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
      unaff_w24 = (int)(char)in_stack_00000068._7_1_;
      unaff_x21 = in_stack_00000060;
      if (-1 < unaff_w24) {
        unaff_x21 = (ulong)in_stack_00000068._7_1_;
      }
      unaff_x27 = unaff_x21 + 1;
      if (0x7ffffffffffffff7 < unaff_x27) {
        func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x4c998);
        (*pcVar3)();
      }
      if (0x16 < unaff_x27) {
        uVar1 = (unaff_x27 & 0xfffffffffffffff8) + 8;
        if ((unaff_x27 | 7) != 0x17) {
          uVar1 = unaff_x27 | 7;
        }
        unaff_x23 = uVar1 + 1;
        goto code_r0x0004c82c;
      }
      in_stack_00000010 = 0;
      uStack0000000000000008 = (undefined8 *)0x0;
      puVar4 = &uStack0000000000000008;
      in_stack_00000018 = unaff_x27 << 0x38;
    } while (unaff_x21 == 0);
  } while( true );
}

