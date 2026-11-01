
/* WARNING: Type propagation algorithm not settling */

void FUN_0004e8fc(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  int iVar5;
  long *plVar6;
  undefined8 *******pppppppuVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  undefined8 in_stack_000000a0;
  long in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long in_stack_000000c8;
  undefined8 uStack_130;
  undefined8 uStack_128;
  long lStack_120;
  undefined8 auStack_110 [2];
  char cStack_f9;
  long lStack_f8;
  long lStack_f0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  byte bStack_c1;
  long lStack_c0;
  long lStack_b8;
  undefined8 *******pppppppuStack_a0;
  undefined7 uStack_98;
  undefined1 uStack_91;
  undefined7 uStack_90;
  byte bStack_89;
  undefined7 uStack_88;
  undefined1 uStack_81;
  undefined7 uStack_80;
  long lStack_78;
  
  if (in_stack_000000b0 < 0) {
    __ZdlPv(in_stack_000000a0);
  }
  if (in_stack_000000c8 < 0) {
    __ZdlPv(in_stack_000000b8);
  }
  auVar9 = __Unwind_Resume(param_1);
  plVar6 = auVar9._0_8_;
  lStack_78 = *(long *)PTR____stack_chk_guard_009b01e8;
  *plVar6 = 0;
  plVar6[1] = 0;
  plVar6[2] = 0;
  __ZNKSt3__14__fs10filesystem4path5beginEv(&uStack_d8,auVar9._8_8_);
  __ZNKSt3__14__fs10filesystem4path3endEv(auStack_110,auVar9._8_8_);
  while (lStack_c0 != lStack_f8 || lStack_b8 != lStack_f0) {
    if ((char)bStack_c1 < '\0') {
      func_0x00017634(&uStack_130,uStack_d8,uStack_d0);
    }
    else {
      uStack_128 = uStack_d0;
      uStack_130 = uStack_d8;
      lStack_120 = (ulong)bStack_c1 << 0x38;
    }
    pppppppuStack_a0 = (undefined8 *******)0x0;
    uStack_98 = 0;
    uStack_91 = 0;
    uStack_90 = 0;
    bStack_89 = 0;
    func_0x00017184(&pppppppuStack_a0,".","");
    uVar8 = CONCAT17(uStack_91,uStack_98);
    pppppppuVar7 = pppppppuStack_a0;
    if (-1 < (char)bStack_89) {
      uVar8 = (ulong)bStack_89;
      pppppppuVar7 = &pppppppuStack_a0;
    }
    iVar5 = __ZNKSt3__14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
                      (&uStack_130,pppppppuVar7,uVar8);
    if ((char)bStack_89 < '\0') {
      __ZdlPv(pppppppuStack_a0);
    }
    if (iVar5 != 0) {
      pppppppuStack_a0 = (undefined8 *******)0x0;
      uStack_98 = 0;
      uStack_91 = 0;
      uStack_90 = 0;
      bStack_89 = 0;
      func_0x00017184(&pppppppuStack_a0,"..","");
      uVar8 = CONCAT17(uStack_91,uStack_98);
      pppppppuVar7 = pppppppuStack_a0;
      if (-1 < (char)bStack_89) {
        uVar8 = (ulong)bStack_89;
        pppppppuVar7 = &pppppppuStack_a0;
      }
      iVar5 = __ZNKSt3__14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
                        (&uStack_130,pppppppuVar7,uVar8);
      if ((char)bStack_89 < '\0') {
        __ZdlPv(pppppppuStack_a0);
      }
      if (iVar5 == 0) {
        auVar9 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(plVar6);
        uVar8 = auVar9._8_8_;
        if (0x7ffffffffffffff7 < uVar8) goto code_r0x0004ec7c;
        if (uVar8 < 0x17) {
          bStack_89 = auVar9[8];
          pppppppuVar7 = &pppppppuStack_a0;
          if (uVar8 != 0) goto code_r0x0004eb9c;
        }
        else {
          uVar2 = (uVar8 & 0xfffffffffffffff8) + 8;
          if ((uVar8 | 7) != 0x17) {
            uVar2 = uVar8 | 7;
          }
          lVar1 = uVar2 + 1;
          pppppppuVar7 = (undefined8 *******)__Znwm(lVar1);
          bStack_89 = (byte)((ulong)lVar1 >> 0x38) | 0x80;
          uStack_98 = auVar9._8_7_;
          uStack_91 = auVar9[0xf];
          uStack_90 = (undefined7)lVar1;
          pppppppuStack_a0 = pppppppuVar7;
code_r0x0004eb9c:
          _memmove(pppppppuVar7,auVar9._0_8_,uVar8);
        }
        *(undefined1 *)((long)pppppppuVar7 + uVar8) = 0;
        bVar3 = bStack_89;
        pppppppuVar7 = pppppppuStack_a0;
        uStack_88 = uStack_98;
        uStack_81 = uStack_91;
        uStack_80 = uStack_90;
        if (*(char *)((long)plVar6 + 0x17) < '\0') {
          __ZdlPv(*plVar6);
        }
        *plVar6 = (long)pppppppuVar7;
        plVar6[1] = CONCAT17(uStack_81,uStack_88);
        *(ulong *)((long)plVar6 + 0xf) = CONCAT71(uStack_80,uStack_81);
        *(byte *)((long)plVar6 + 0x17) = bVar3;
      }
      else {
        func_0x0001754c(plVar6,&uStack_130);
      }
    }
    if (lStack_120 < 0) {
      __ZdlPv(uStack_130);
    }
    __ZNSt3__14__fs10filesystem4path8iterator11__incrementEv(&uStack_d8);
  }
  if (cStack_f9 < '\0') {
    __ZdlPv(auStack_110[0]);
  }
  if ((char)bStack_c1 < '\0') {
    __ZdlPv(uStack_d8);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_78) {
      return;
    }
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_78) {
    return;
  }
  ___stack_chk_fail();
code_r0x0004ec7c:
  func_0x0001748c(&pppppppuStack_a0);
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4ec88);
  (*pcVar4)();
}

