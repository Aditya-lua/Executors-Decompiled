
void FUN_00021484(long param_1,undefined8 *param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  code *pcVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  undefined4 *puVar10;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  int unaff_w21;
  ulong unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x27;
  ulong unaff_x28;
  undefined8 in_stack_00000010;
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
  
code_r0x00021484:
  _memcpy(param_1,param_2,param_3);
  if (unaff_x28 != 4) {
    __ZdlPv(unaff_x20);
  }
  _uStack0000000000000058 = unaff_x23 | 0x8000000000000000;
  puVar10 = (undefined4 *)((long)unaff_x24 + unaff_x19 * 4);
  uStack0000000000000048 = unaff_x24;
  in_stack_00000050 = unaff_x19;
  do {
    *puVar10 = 0;
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
        plVar9 = (long *)__Znwm(0x28);
        __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar9,0);
        plVar9[3] = (long)&UNK_0010ffff;
        *(undefined4 *)(plVar9 + 4) = 0;
        *plVar9 = (long)&UNK_009b2bc0;
        puVar3 = uStack0000000000000048;
        if (-1 < (long)_uStack0000000000000058) {
          puVar3 = &uStack0000000000000048;
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
        uVar5 = in_stack_00000050;
        if (-1 < (long)_uStack0000000000000058) {
          uVar5 = _uStack0000000000000058 >> 0x38;
        }
        in_stack_00000100 = 0;
        in_stack_000000f8 = 0;
        in_stack_00000110 = 0;
        in_stack_00000108 = 0;
        in_stack_00000118 = 0;
        in_stack_00000090 = plVar9;
        func_0x00023f98(&uStack0000000000000030,&uStack0000000000000060,puVar3,
                        (long)puVar3 + uVar5 * 4);
        func_0x006eceb0(in_stack_00000010,"%s");
code_r0x0002160c:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x21610);
        (*pcVar6)();
      }
      unaff_w21 = unaff_w21 + 1;
      lVar7 = func_0x006e778c(in_stack_00000010,unaff_w21,0);
      plVar9 = (long *)__Znwm(0x28);
      __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar9,0);
      plVar9[3] = (long)&UNK_0010ffff;
      *(undefined4 *)(plVar9 + 4) = 0;
      *plVar9 = in_stack_00000020;
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
      in_stack_00000090 = plVar9;
      lVar8 = _strlen(lVar7);
      func_0x00023504(&uStack0000000000000030,&uStack0000000000000060,lVar7,lVar7 + lVar8);
      uVar5 = in_stack_00000038;
      param_2 = uStack0000000000000030;
      if (-1 < (char)in_stack_00000040._7_1_) {
        uVar5 = (ulong)in_stack_00000040._7_1_;
        param_2 = &uStack0000000000000030;
      }
      unaff_x28 = (_uStack0000000000000058 & 0x7fffffffffffffff) - 1;
      uVar1 = in_stack_00000050;
      if (-1 < (long)_uStack0000000000000058) {
        unaff_x28 = 4;
        uVar1 = _uStack0000000000000058 >> 0x38;
      }
      if (unaff_x28 - uVar1 < uVar5) {
        unaff_x19 = uVar1 + uVar5;
        if (0x3ffffffffffffff6 - unaff_x28 < unaff_x19 - unaff_x28) {
          func_0x0001748c(&uStack0000000000000048);
          goto code_r0x0002160c;
        }
        unaff_x20 = uStack0000000000000048;
        if (-1 < (long)_uStack0000000000000058) {
          unaff_x20 = &uStack0000000000000048;
        }
        if (unaff_x28 < 0x1ffffffffffffff3) {
          uVar2 = unaff_x19;
          if (unaff_x19 <= unaff_x28 * 2) {
            uVar2 = unaff_x28 * 2;
          }
          if (uVar2 < 5) {
            unaff_x23 = 5;
          }
          else {
            uVar4 = (uVar2 & 0xfffffffffffffffe) + 2;
            if ((uVar2 | 1) != 5) {
              uVar4 = uVar2 | 1;
            }
            unaff_x23 = uVar4 + 1;
            if (unaff_x23 >> 0x3e != 0) {
              func_0x00017514();
              goto code_r0x0002160c;
            }
          }
        }
        else {
          unaff_x23 = 0x3ffffffffffffff7;
        }
        unaff_x24 = (undefined8 *)__Znwm(unaff_x23 << 2);
        if (uVar1 != 0) {
          _memmove(unaff_x24,unaff_x20,uVar1 << 2);
        }
        param_3 = uVar5 << 2;
        param_1 = (long)unaff_x24 + uVar1 * 4;
        goto code_r0x00021484;
      }
    } while (uVar5 == 0);
    puVar3 = uStack0000000000000048;
    if (-1 < (long)_uStack0000000000000058) {
      puVar3 = &uStack0000000000000048;
    }
    _memmove((long)puVar3 + uVar1 * 4,param_2,uVar5 << 2);
    uVar1 = uVar1 + uVar5;
    if ((long)_uStack0000000000000058 < 0) {
      in_stack_00000050 = uVar1;
    }
    else {
      _uStack0000000000000058 = CONCAT17((char)uVar1,uStack0000000000000058) & 0x7fffffffffffffff;
    }
    puVar10 = (undefined4 *)((long)puVar3 + uVar1 * 4);
  } while( true );
}

