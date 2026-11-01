
void FUN_006c9444(long param_1)

{
  uint uVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  char cVar6;
  code *pcVar7;
  undefined1 uVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  long *plVar12;
  long *plVar13;
  undefined8 uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined2 unaff_w21;
  int iVar20;
  char *unaff_x23;
  undefined8 uVar21;
  ulong uVar22;
  undefined8 *puVar23;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  long in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  byte bStack0000000000000077;
  
code_r0x006c9444:
  uVar3 = *(uint *)(param_1 + 0xc);
  uVar22 = (ulong)uVar3;
  lVar11 = _memchr(unaff_x23,0x25,uVar22);
  if (lVar11 == 0) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000060,unaff_x23,uVar22);
  }
  else if (uVar3 != 0) {
    do {
      cVar6 = *unaff_x23;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                (&uStack0000000000000060,(long)cVar6);
      if (cVar6 == '%') {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                  (&uStack0000000000000060,0x25);
      }
      uVar22 = uVar22 - 1;
      unaff_x23 = unaff_x23 + 1;
    } while (uVar22 != 0);
  }
  while( true ) {
    uVar22 = _uStack0000000000000070;
    unaff_x20 = unaff_x20 + 1;
    if (*(ulong *)(in_stack_00000040 + 0x28) <= unaff_x20) break;
    puVar23 = (undefined8 *)(*(long *)(in_stack_00000040 + 0x20) + unaff_x20 * 0x10);
    pcVar2 = (char *)*puVar23;
    lVar11 = puVar23[1];
    lVar9 = _memchr(pcVar2,0x25,lVar11);
    uVar22 = _uStack0000000000000070;
    if (lVar9 == 0) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (&uStack0000000000000060,pcVar2,lVar11);
    }
    else {
      for (; _uStack0000000000000070 = uVar22, lVar11 != 0; lVar11 = lVar11 + -1) {
        cVar6 = *pcVar2;
        bStack0000000000000077 = (byte)(uVar22 >> 0x38);
        if ((long)uVar22 < 0) {
          uVar15 = (uVar22 & 0x7fffffffffffffff) - 1;
          if (in_stack_00000068 != uVar15) goto code_r0x006c92ac;
          if ((uVar22 & 0x7fffffffffffffff) != 0x7ffffffffffffff8) {
            uVar22 = 0x7ffffffffffffff7;
            puVar23 = uStack0000000000000060;
            if (uVar15 < 0x3ffffffffffffff3) goto code_r0x006c9208;
            goto code_r0x006c9238;
          }
code_r0x006c9a84:
          func_0x0001748c(&uStack0000000000000060);
          goto code_r0x006c9ae0;
        }
        if (bStack0000000000000077 == 0x16) {
          uVar15 = 0x16;
          puVar23 = &uStack0000000000000060;
code_r0x006c9208:
          uVar16 = uVar15 * 2;
          if (uVar16 < uVar15 + 1) {
            uVar16 = uVar15 + 1;
          }
          uVar18 = (uVar16 & 0x7ffffffffffffff8) + 8;
          if ((uVar16 | 7) != 0x17) {
            uVar18 = uVar16 | 7;
          }
          uVar22 = 0x17;
          if (0x16 < uVar16) {
            uVar22 = uVar18 + 1;
          }
code_r0x006c9238:
          puVar10 = (undefined8 *)__Znwm(uVar22);
          if ((uVar15 == 0) || (_memmove(puVar10,puVar23,uVar15), uVar15 != 0x16)) {
            __ZdlPv(puVar23);
          }
          in_stack_00000068 = uVar15;
          uStack0000000000000060 = puVar10;
          _uStack0000000000000070 = uVar22 | 0x8000000000000000;
code_r0x006c92ac:
          *(char *)((long)uStack0000000000000060 + in_stack_00000068) = cVar6;
          ((char *)((long)uStack0000000000000060 + in_stack_00000068))[1] = '\0';
          in_stack_00000068 = in_stack_00000068 + 1;
          uVar22 = _uStack0000000000000070;
        }
        else {
          uVar15 = (ulong)bStack0000000000000077;
          uStack0000000000000070 = (undefined7)uVar22;
          _uStack0000000000000070 =
               CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
          *(char *)((long)&uStack0000000000000060 + uVar15) = cVar6;
          *(undefined1 *)((long)&uStack0000000000000060 + uVar15 + 1) = 0;
          uVar22 = _uStack0000000000000070;
        }
        _uStack0000000000000070 = uVar22;
        if (cVar6 == '%') {
          bStack0000000000000077 = (byte)(uVar22 >> 0x38);
          if ((long)uVar22 < 0) {
            uVar15 = (uVar22 & 0x7fffffffffffffff) - 1;
            if (in_stack_00000068 == uVar15) {
              if ((uVar22 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto code_r0x006c9a84;
              uVar22 = 0x7ffffffffffffff7;
              puVar23 = uStack0000000000000060;
              if (uVar15 < 0x3ffffffffffffff3) goto code_r0x006c9324;
              goto code_r0x006c935c;
            }
code_r0x006c93a4:
            uVar15 = in_stack_00000068;
            puVar23 = uStack0000000000000060;
            in_stack_00000068 = in_stack_00000068 + 1;
          }
          else {
            if (bStack0000000000000077 == 0x16) {
              uVar15 = 0x16;
              puVar23 = &uStack0000000000000060;
code_r0x006c9324:
              uVar16 = uVar15 * 2;
              if (uVar16 < uVar15 + 1) {
                uVar16 = uVar15 + 1;
              }
              if (uVar16 < 0x17) {
                uVar22 = 0x17;
              }
              else {
                uVar22 = (uVar16 & 0x7ffffffffffffff8) + 8;
                if ((uVar16 | 7) != 0x17) {
                  uVar22 = uVar16 | 7;
                }
                uVar22 = uVar22 + 1;
              }
code_r0x006c935c:
              puVar10 = (undefined8 *)__Znwm(uVar22);
              if ((uVar15 == 0) || (_memmove(puVar10,puVar23,uVar15), uVar15 != 0x16)) {
                __ZdlPv(puVar23);
              }
              in_stack_00000068 = uVar15;
              uStack0000000000000060 = puVar10;
              _uStack0000000000000070 = uVar22 | 0x8000000000000000;
              goto code_r0x006c93a4;
            }
            uVar15 = (ulong)bStack0000000000000077;
            uStack0000000000000070 = (undefined7)uVar22;
            _uStack0000000000000070 =
                 CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
            puVar23 = &uStack0000000000000060;
          }
          *(undefined2 *)((long)puVar23 + uVar15) = unaff_w21;
        }
        pcVar2 = pcVar2 + 1;
        uVar22 = _uStack0000000000000070;
      }
    }
    if (unaff_x20 < *(ulong *)(in_stack_00000040 + 0x38)) {
      if (unaff_x19[0x22] != 0) {
        uVar22 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + unaff_x20 * 8);
        if (uVar22 != unaff_x19[0x23]) {
          uVar15 = 0;
          uVar16 = uVar22 >> 4 ^ uVar22 >> 9;
          do {
            uVar16 = uVar16 & unaff_x19[0x21] - 1;
            uVar18 = *(ulong *)(unaff_x19[0x20] + uVar16 * 0x20);
            if (uVar18 == uVar22) {
              param_1 = unaff_x19[0x20] + uVar16 * 0x20;
              if (*(int *)(param_1 + 8) == 5) {
                unaff_x23 = *(char **)(param_1 + 0x10);
                goto code_r0x006c9444;
              }
              break;
            }
            uVar15 = uVar15 + 1;
            uVar16 = uVar15 + uVar16;
          } while (uVar18 != unaff_x19[0x23] && uVar15 <= unaff_x19[0x21] - 1);
        }
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (&uStack0000000000000060,"%*",2);
    }
  }
  uVar15 = in_stack_00000068;
  if (-1 < (long)_uStack0000000000000070) {
    uVar15 = _uStack0000000000000070 >> 0x38;
  }
  lVar11 = __Znam(uVar15);
  puVar23 = uStack0000000000000060;
  if (-1 < (long)uVar22) {
    puVar23 = &uStack0000000000000060;
  }
  uStack0000000000000058 = lVar11;
  _memcpy(lVar11,puVar23,uVar15);
  plVar12 = (long *)unaff_x19[0xa7];
  if (plVar12 < (long *)unaff_x19[0xa8]) {
    uStack0000000000000058 = 0;
    plVar13 = plVar12 + 1;
    *plVar12 = lVar11;
  }
  else {
    plVar13 = (long *)func_0x006cb028(unaff_x19 + 0xa6,&uStack0000000000000058);
  }
  unaff_x19[0xa7] = plVar13;
  uVar14 = func_0x006b1354(*unaff_x19,lVar11,uVar15);
  if ((int)(uint)uVar14 < 0) {
    func_0x006bc388(in_stack_00000040 + 0xc,"Exceeded constant limit; simplify the code to compile")
    ;
  }
  else {
    uVar4 = *(uint *)((long)unaff_x19 + 0x484);
    uVar3 = (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2 + uVar4;
    if (uVar3 < 0x100) {
      *(uint *)((long)unaff_x19 + 0x484) = uVar3;
      uVar1 = *(uint *)(unaff_x19 + 0x91);
      if (*(uint *)(unaff_x19 + 0x91) <= uVar3) {
        uVar1 = uVar3;
      }
      *(uint *)(unaff_x19 + 0x91) = uVar1;
      if ((uint)uVar14 >> 0xf == 0) {
        func_0x006b1f78(*unaff_x19,5,uVar4 & 0xff,(int)(short)uVar14);
      }
      else {
        func_0x006b1f78(*unaff_x19,0x42,uVar4 & 0xff,0);
        func_0x006b24c4(*unaff_x19,uVar14);
      }
      uVar22 = *(ulong *)(in_stack_00000040 + 0x38);
      if (cRam0000000000a336a0 == '\0') {
        if (uVar22 != 0) {
          uVar22 = 0;
          uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
          do {
            *(uint *)((long)unaff_x19 + 0x484) = (uVar4 + 2 + (int)uVar22 & 0xff) + 1;
            func_0x006c6028();
            *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
            uVar22 = uVar22 + 1;
          } while (uVar22 < *(ulong *)(in_stack_00000040 + 0x38));
        }
      }
      else if (uVar22 != 0) {
        uVar15 = 0;
        iVar20 = 0;
LAB_006c988c:
        do {
          uVar16 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + uVar15 * 8);
          if ((unaff_x19[0x22] != 0) && (uVar16 != unaff_x19[0x23])) {
            uVar18 = 0;
            uVar17 = uVar16 >> 4 ^ uVar16 >> 9;
            do {
              uVar17 = uVar17 & unaff_x19[0x21] - 1;
              uVar19 = *(ulong *)(unaff_x19[0x20] + uVar17 * 0x20);
              if (uVar19 == uVar16) {
                if (*(int *)(unaff_x19[0x20] + uVar17 * 0x20 + 8) == 5) {
                  iVar20 = iVar20 + 1;
                  uVar15 = uVar15 + 1;
                  if (uVar15 < uVar22) goto LAB_006c988c;
                  goto LAB_006c9988;
                }
                break;
              }
              uVar18 = uVar18 + 1;
              uVar17 = uVar18 + uVar17;
            } while (uVar19 != unaff_x19[0x23] && uVar18 <= unaff_x19[0x21] - 1);
          }
          uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
          *(uint *)((long)unaff_x19 + 0x484) = (((uVar4 + 2) - iVar20) + (int)uVar15 & 0xff) + 1;
          func_0x006c6028();
          *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
          uVar22 = *(ulong *)(in_stack_00000040 + 0x38);
          uVar15 = uVar15 + 1;
        } while (uVar15 < uVar22);
      }
LAB_006c9988:
      uVar14 = func_0x006b1354(*unaff_x19,"format",6);
      if (-1 < (int)uVar14) {
        uVar21 = *unaff_x19;
        uVar8 = func_0x006b401c("format",6);
        func_0x006b1ccc(uVar21,0x14,uVar4 & 0xff,uVar4 & 0xff,uVar8);
        func_0x006b24c4(*unaff_x19,uVar14);
        func_0x006b1ccc(*unaff_x19,0x15,uVar4 & 0xff,
                        (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2U & 0xff,2);
        func_0x006b1ccc(*unaff_x19,6,in_stack_00000018._4_4_,uVar4 & 0xff,0);
        lVar11 = uStack0000000000000058;
        *(uint *)((long)unaff_x19 + 0x484) = uVar4;
        uStack0000000000000058 = 0;
        if (lVar11 != 0) {
          __ZdaPv();
        }
        if ((long)_uStack0000000000000070 < 0) {
          __ZdlPv(uStack0000000000000060);
        }
        return;
      }
      func_0x006bc388(in_stack_00000040 + 0xc,
                      "Exceeded constant limit; simplify the code to compile");
    }
    else {
      func_0x006bc388(in_stack_00000040 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
    }
  }
code_r0x006c9ae0:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
  (*pcVar7)();
}

