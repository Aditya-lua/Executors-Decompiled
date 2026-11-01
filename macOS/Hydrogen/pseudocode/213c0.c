
void FUN_000213c0(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  long *plVar6;
  undefined4 *puVar7;
  ulong unaff_x19;
  int unaff_w21;
  undefined8 *unaff_x22;
  ulong uVar8;
  ulong unaff_x25;
  ulong unaff_x26;
  undefined8 *unaff_x27;
  ulong unaff_x28;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000050;
  undefined7 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  long *in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  
code_r0x000213c0:
  if ((param_1 & 0xffffffffffff | 0x1fff000000000000) < unaff_x28) {
    uVar8 = 0x3ffffffffffffff7;
  }
  else {
    uVar1 = unaff_x19;
    if (unaff_x19 <= unaff_x28 * 2) {
      uVar1 = unaff_x28 * 2;
    }
    if (uVar1 < 5) {
      uVar8 = 5;
    }
    else {
      uVar8 = (uVar1 & 0xfffffffffffffffe) + 2;
      if ((uVar1 | 1) != 5) {
        uVar8 = uVar1 | 1;
      }
      uVar8 = uVar8 + 1;
      if (uVar8 >> 0x3e != 0) {
        func_0x00017514();
code_r0x0002160c:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x21610);
        (*pcVar2)();
      }
    }
  }
  puVar5 = (undefined8 *)__Znwm(uVar8 << 2);
  if (unaff_x26 != 0) {
    _memmove(puVar5,in_stack_00000018,unaff_x26 << 2);
  }
  _memcpy((long)puVar5 + unaff_x26 * 4,unaff_x22,unaff_x25 << 2);
  if (unaff_x28 != 4) {
    __ZdlPv(in_stack_00000018);
  }
  _uStack0000000000000058 = uVar8 | 0x8000000000000000;
  puVar7 = (undefined4 *)((long)puVar5 + unaff_x19 * 4);
  uStack0000000000000048 = puVar5;
  in_stack_00000050 = unaff_x19;
  do {
    *puVar7 = 0;
    do {
      if ((char)in_stack_00000040._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000090 != (long *)0x0) {
        (**(code **)(*in_stack_00000090 + 8))();
      }
      if (in_stack_00000088 < 0) {
        __ZdlPv(in_stack_00000078);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
      }
      if (in_stack_00000028._4_4_ == unaff_w21 + 1) {
        _wprintf(&UNK_008034c0);
        plVar6 = (long *)__Znwm(0x28);
        __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar6,0);
        plVar6[3] = (long)&UNK_0010ffff;
        *(undefined4 *)(plVar6 + 4) = 0;
        *plVar6 = (long)&UNK_009b2bc0;
        puVar5 = uStack0000000000000048;
        if (-1 < (long)_uStack0000000000000058) {
          puVar5 = &uStack0000000000000048;
        }
        in_stack_00000068 = 0;
        uStack0000000000000060 = 0;
        in_stack_00000078 = 0;
        in_stack_00000070 = 0;
        in_stack_00000088 = 0;
        in_stack_00000080 = 0;
        in_stack_000000a0 = 0;
        in_stack_00000098 = 0;
        in_stack_000000b0 = 0;
        in_stack_000000a8 = 0;
        in_stack_000000c0 = 0;
        in_stack_000000b8 = 0;
        in_stack_000000d0 = 0;
        in_stack_000000c8 = 0;
        in_stack_000000e0 = 0;
        in_stack_000000d8 = 0;
        in_stack_000000f0 = 0;
        in_stack_000000e8 = 0;
        uVar8 = in_stack_00000050;
        if (-1 < (long)_uStack0000000000000058) {
          uVar8 = _uStack0000000000000058 >> 0x38;
        }
        in_stack_00000100 = 0;
        in_stack_000000f8 = 0;
        in_stack_00000110 = 0;
        in_stack_00000108 = 0;
        in_stack_00000118 = 0;
        in_stack_00000090 = plVar6;
        func_0x00023f98(&uStack0000000000000030,&uStack0000000000000060,puVar5,
                        (long)puVar5 + uVar8 * 4);
        func_0x006eceb0(in_stack_00000010,"%s");
        goto code_r0x0002160c;
      }
      unaff_w21 = unaff_w21 + 1;
      lVar3 = func_0x006e778c(in_stack_00000010,unaff_w21,0);
      plVar6 = (long *)__Znwm(0x28);
      __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar6,0);
      plVar6[3] = (long)&UNK_0010ffff;
      *(undefined4 *)(plVar6 + 4) = 0;
      *plVar6 = in_stack_00000020;
      in_stack_00000068 = 0;
      uStack0000000000000060 = 0;
      in_stack_00000078 = 0;
      in_stack_00000070 = 0;
      in_stack_00000088 = 0;
      in_stack_00000080 = 0;
      unaff_x27[1] = 0;
      *unaff_x27 = 0;
      unaff_x27[3] = 0;
      unaff_x27[2] = 0;
      unaff_x27[5] = 0;
      unaff_x27[4] = 0;
      unaff_x27[7] = 0;
      unaff_x27[6] = 0;
      unaff_x27[9] = 0;
      unaff_x27[8] = 0;
      unaff_x27[0xb] = 0;
      unaff_x27[10] = 0;
      unaff_x27[0xd] = 0;
      unaff_x27[0xc] = 0;
      unaff_x27[0xf] = 0;
      unaff_x27[0xe] = 0;
      unaff_x27[0x10] = 0;
      in_stack_00000090 = plVar6;
      lVar4 = _strlen(lVar3);
      func_0x00023504(&uStack0000000000000030,&uStack0000000000000060,lVar3,lVar3 + lVar4);
      unaff_x25 = in_stack_00000038;
      unaff_x22 = uStack0000000000000030;
      if (-1 < (char)in_stack_00000040._7_1_) {
        unaff_x25 = (ulong)in_stack_00000040._7_1_;
        unaff_x22 = &uStack0000000000000030;
      }
      unaff_x28 = (_uStack0000000000000058 & 0x7fffffffffffffff) - 1;
      unaff_x26 = in_stack_00000050;
      if (-1 < (long)_uStack0000000000000058) {
        unaff_x28 = 4;
        unaff_x26 = _uStack0000000000000058 >> 0x38;
      }
      if (unaff_x28 - unaff_x26 < unaff_x25) {
        unaff_x19 = unaff_x26 + unaff_x25;
        if (0x3ffffffffffffff6 - unaff_x28 < unaff_x19 - unaff_x28) {
          func_0x0001748c(&uStack0000000000000048);
          goto code_r0x0002160c;
        }
        in_stack_00000018 = uStack0000000000000048;
        if (-1 < (long)_uStack0000000000000058) {
          in_stack_00000018 = &uStack0000000000000048;
        }
        param_1 = 0xfffffffffffffff2;
        goto code_r0x000213c0;
      }
    } while (unaff_x25 == 0);
    puVar5 = uStack0000000000000048;
    if (-1 < (long)_uStack0000000000000058) {
      puVar5 = &uStack0000000000000048;
    }
    _memmove((long)puVar5 + unaff_x26 * 4,unaff_x22,unaff_x25 << 2);
    uVar8 = unaff_x26 + unaff_x25;
    if ((long)_uStack0000000000000058 < 0) {
      in_stack_00000050 = uVar8;
    }
    else {
      _uStack0000000000000058 = CONCAT17((char)uVar8,uStack0000000000000058) & 0x7fffffffffffffff;
    }
    puVar7 = (undefined4 *)((long)puVar5 + uVar8 * 4);
  } while( true );
}

