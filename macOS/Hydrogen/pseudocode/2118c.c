
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0002118c(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  code *pcVar9;
  undefined8 uVar10;
  long *plVar11;
  long *plVar12;
  long lVar13;
  long lVar14;
  undefined8 *puVar15;
  undefined4 *puVar16;
  ulong uVar17;
  int iVar18;
  ulong uVar19;
  undefined8 unaff_x24;
  int iStack000000000000002c;
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
  
  uVar10 = func_0x00086db4(param_1,"[LOG] ",6);
  uVar10 = func_0x00086db4(uVar10,"consoleerror",0xc);
  uVar10 = func_0x00086db4(uVar10," @ ",3);
  uVar10 = func_0x00086db4(uVar10,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar10 = func_0x00086db4(uVar10,":",1);
  plVar11 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar10,0x7d);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000060,(long)plVar11 + *(long *)(*plVar11 + -0x18))
  ;
  plVar12 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&uStack0000000000000060,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar10 = (**(code **)(*plVar12 + 0x38))(plVar12,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000060);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar11,uVar10);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar11);
  iStack000000000000002c = func_0x006e1e34();
  uStack0000000000000048 = (undefined8 *)__Znwm(0x28);
  uVar8 = _UNK_0080354c;
  uVar7 = _UNK_00803544;
  uVar10 = _UNK_00803534;
  _uStack0000000000000058 = _UNK_007fc168;
  in_stack_00000050 = _UNK_007fc160;
  uStack0000000000000048[1] = _UNK_0080353c;
  *uStack0000000000000048 = uVar10;
  uStack0000000000000048[3] = uVar8;
  uStack0000000000000048[2] = uVar7;
  *(undefined4 *)(uStack0000000000000048 + 4) = 0;
  if (1 < iStack000000000000002c) {
    iVar18 = 1;
code_r0x000212c4:
    do {
      lVar13 = func_0x006e778c(unaff_x24,iVar18,0);
      plVar11 = (long *)__Znwm(0x28);
      __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar11,0);
      plVar11[3] = (long)&UNK_0010ffff;
      *(undefined4 *)(plVar11 + 4) = 0;
      *plVar11 = (long)&UNK_009b2bc0;
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
      in_stack_00000100 = 0;
      in_stack_000000f8 = 0;
      in_stack_00000110 = 0;
      in_stack_00000108 = 0;
      in_stack_00000118 = 0;
      in_stack_00000090 = plVar11;
      lVar14 = _strlen(lVar13);
      func_0x00023504(&uStack0000000000000030,&uStack0000000000000060,lVar13,lVar13 + lVar14);
      uVar3 = in_stack_00000038;
      puVar6 = uStack0000000000000030;
      if (-1 < (char)in_stack_00000040._7_1_) {
        uVar3 = (ulong)in_stack_00000040._7_1_;
        puVar6 = &uStack0000000000000030;
      }
      uVar17 = (_uStack0000000000000058 & 0x7fffffffffffffff) - 1;
      uVar2 = in_stack_00000050;
      if (-1 < (long)_uStack0000000000000058) {
        uVar17 = 4;
        uVar2 = _uStack0000000000000058 >> 0x38;
      }
      if (uVar17 - uVar2 < uVar3) {
        uVar1 = uVar2 + uVar3;
        if (0x3ffffffffffffff6 - uVar17 < uVar1 - uVar17) {
          func_0x0001748c(&uStack0000000000000048);
          goto LAB_0002160c;
        }
        puVar5 = uStack0000000000000048;
        if (-1 < (long)_uStack0000000000000058) {
          puVar5 = &uStack0000000000000048;
        }
        if (uVar17 < 0x1ffffffffffffff3) {
          uVar4 = uVar1;
          if (uVar1 <= uVar17 * 2) {
            uVar4 = uVar17 * 2;
          }
          if (uVar4 < 5) {
            uVar19 = 5;
          }
          else {
            uVar19 = (uVar4 & 0xfffffffffffffffe) + 2;
            if ((uVar4 | 1) != 5) {
              uVar19 = uVar4 | 1;
            }
            uVar19 = uVar19 + 1;
            if (uVar19 >> 0x3e != 0) {
              func_0x00017514();
              goto LAB_0002160c;
            }
          }
        }
        else {
          uVar19 = 0x3ffffffffffffff7;
        }
        puVar15 = (undefined8 *)__Znwm(uVar19 << 2);
        if (uVar2 != 0) {
          _memmove(puVar15,puVar5,uVar2 << 2);
        }
        _memcpy((long)puVar15 + uVar2 * 4,puVar6,uVar3 << 2);
        if (uVar17 != 4) {
          __ZdlPv(puVar5);
        }
        _uStack0000000000000058 = uVar19 | 0x8000000000000000;
        puVar16 = (undefined4 *)((long)puVar15 + uVar1 * 4);
        uStack0000000000000048 = puVar15;
        in_stack_00000050 = uVar1;
code_r0x000214b8:
        *puVar16 = 0;
      }
      else if (uVar3 != 0) {
        puVar5 = uStack0000000000000048;
        if (-1 < (long)_uStack0000000000000058) {
          puVar5 = &uStack0000000000000048;
        }
        _memmove((long)puVar5 + uVar2 * 4,puVar6,uVar3 << 2);
        uVar2 = uVar2 + uVar3;
        if ((long)_uStack0000000000000058 < 0) {
          in_stack_00000050 = uVar2;
        }
        else {
          _uStack0000000000000058 =
               CONCAT17((char)uVar2,uStack0000000000000058) & 0x7fffffffffffffff;
        }
        puVar16 = (undefined4 *)((long)puVar5 + uVar2 * 4);
        goto code_r0x000214b8;
      }
      if ((char)in_stack_00000040._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000090 != (long *)0x0) {
        (**(code **)(*in_stack_00000090 + 8))();
      }
      if (in_stack_00000088 < 0) {
        __ZdlPv(in_stack_00000078);
        if (in_stack_00000070 < 0) goto code_r0x000214e8;
code_r0x000212b4:
        iVar18 = iVar18 + 1;
        if (iStack000000000000002c == iVar18) break;
        goto code_r0x000212c4;
      }
      if (-1 < in_stack_00000070) goto code_r0x000212b4;
code_r0x000214e8:
      __ZdlPv(uStack0000000000000060);
      iVar18 = iVar18 + 1;
    } while (iStack000000000000002c != iVar18);
  }
  _wprintf(&UNK_008034c0);
  plVar11 = (long *)__Znwm(0x28);
  __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar11,0);
  plVar11[3] = (long)&UNK_0010ffff;
  *(undefined4 *)(plVar11 + 4) = 0;
  *plVar11 = (long)&UNK_009b2bc0;
  puVar6 = uStack0000000000000048;
  if (-1 < (long)_uStack0000000000000058) {
    puVar6 = &uStack0000000000000048;
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
  uVar3 = in_stack_00000050;
  if (-1 < (long)_uStack0000000000000058) {
    uVar3 = _uStack0000000000000058 >> 0x38;
  }
  in_stack_00000100 = 0;
  in_stack_000000f8 = 0;
  in_stack_00000110 = 0;
  in_stack_00000108 = 0;
  in_stack_00000118 = 0;
  in_stack_00000090 = plVar11;
  func_0x00023f98(&uStack0000000000000030,&uStack0000000000000060,puVar6,(long)puVar6 + uVar3 * 4);
  func_0x006eceb0(unaff_x24,"%s");
LAB_0002160c:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x21610);
  (*pcVar9)();
}

