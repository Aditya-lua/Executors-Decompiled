
void FUN_006c9368(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined4 uVar4;
  char cVar5;
  code *pcVar6;
  undefined1 uVar7;
  long lVar8;
  undefined8 *puVar9;
  long *plVar10;
  long *plVar11;
  undefined8 uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined2 unaff_w21;
  int iVar18;
  char *unaff_x23;
  char *pcVar19;
  undefined8 uVar20;
  long unaff_x24;
  ulong uVar21;
  ulong unaff_x25;
  undefined8 *puVar22;
  undefined8 *unaff_x26;
  undefined8 *unaff_x27;
  ulong unaff_x28;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  long in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  byte bStack0000000000000077;
  
code_r0x006c9368:
  if ((unaff_x25 == 0) || (_memmove(unaff_x27,unaff_x26,unaff_x25), unaff_x25 != 0x16)) {
    __ZdlPv(unaff_x26);
  }
  _uStack0000000000000070 = unaff_x28 | 0x8000000000000000;
  in_stack_00000068 = unaff_x25;
  uStack0000000000000060 = unaff_x27;
LAB_006c93a4:
  uVar14 = in_stack_00000068;
  puVar22 = uStack0000000000000060;
  in_stack_00000068 = in_stack_00000068 + 1;
  do {
    *(undefined2 *)((long)puVar22 + uVar14) = unaff_w21;
code_r0x006c91a0:
    do {
      unaff_x24 = unaff_x24 + -1;
      pcVar19 = unaff_x23;
      uVar14 = _uStack0000000000000070;
joined_r0x006c91a4:
      _uStack0000000000000070 = uVar14;
      if (unaff_x24 == 0) {
        do {
          if (unaff_x20 < *(ulong *)(in_stack_00000040 + 0x38)) {
            if (unaff_x19[0x22] != 0) {
              uVar14 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + unaff_x20 * 8);
              if (uVar14 != unaff_x19[0x23]) {
                uVar21 = 0;
                uVar13 = uVar14 >> 4 ^ uVar14 >> 9;
                do {
                  uVar13 = uVar13 & unaff_x19[0x21] - 1;
                  uVar16 = *(ulong *)(unaff_x19[0x20] + uVar13 * 0x20);
                  if (uVar16 == uVar14) {
                    lVar8 = unaff_x19[0x20] + uVar13 * 0x20;
                    if (*(int *)(lVar8 + 8) == 5) {
                      pcVar19 = *(char **)(lVar8 + 0x10);
                      uVar1 = *(uint *)(lVar8 + 0xc);
                      uVar14 = (ulong)uVar1;
                      lVar8 = _memchr(pcVar19,0x25,uVar14);
                      if (lVar8 == 0) {
                        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                  (&uStack0000000000000060,pcVar19,uVar14);
                      }
                      else if (uVar1 != 0) {
                        do {
                          cVar5 = *pcVar19;
                          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                    (&uStack0000000000000060,(long)cVar5);
                          if (cVar5 == '%') {
                            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                      (&uStack0000000000000060,0x25);
                          }
                          uVar14 = uVar14 - 1;
                          pcVar19 = pcVar19 + 1;
                        } while (uVar14 != 0);
                      }
                      goto code_r0x006c9148;
                    }
                    break;
                  }
                  uVar21 = uVar21 + 1;
                  uVar13 = uVar21 + uVar13;
                } while (uVar16 != unaff_x19[0x23] && uVar21 <= unaff_x19[0x21] - 1);
              }
            }
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (&uStack0000000000000060,"%*",2);
          }
code_r0x006c9148:
          uVar14 = _uStack0000000000000070;
          unaff_x20 = unaff_x20 + 1;
          if (*(ulong *)(in_stack_00000040 + 0x28) <= unaff_x20) {
            uVar21 = in_stack_00000068;
            if (-1 < (long)_uStack0000000000000070) {
              uVar21 = _uStack0000000000000070 >> 0x38;
            }
            lVar8 = __Znam(uVar21);
            puVar22 = uStack0000000000000060;
            if (-1 < (long)uVar14) {
              puVar22 = &uStack0000000000000060;
            }
            uStack0000000000000058 = lVar8;
            _memcpy(lVar8,puVar22,uVar21);
            plVar10 = (long *)unaff_x19[0xa7];
            if (plVar10 < (long *)unaff_x19[0xa8]) {
              uStack0000000000000058 = 0;
              plVar11 = plVar10 + 1;
              *plVar10 = lVar8;
            }
            else {
              plVar11 = (long *)func_0x006cb028(unaff_x19 + 0xa6,&uStack0000000000000058);
            }
            unaff_x19[0xa7] = plVar11;
            uVar12 = func_0x006b1354(*unaff_x19,lVar8,uVar21);
            if ((int)(uint)uVar12 < 0) {
              func_0x006bc388(in_stack_00000040 + 0xc,
                              "Exceeded constant limit; simplify the code to compile");
              goto code_r0x006c9ae0;
            }
            uVar3 = *(uint *)((long)unaff_x19 + 0x484);
            uVar1 = (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2 + uVar3;
            if (0xff < uVar1) {
              func_0x006bc388(in_stack_00000040 + 0xc,
                              "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             );
              goto code_r0x006c9ae0;
            }
            *(uint *)((long)unaff_x19 + 0x484) = uVar1;
            uVar2 = *(uint *)(unaff_x19 + 0x91);
            if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
              uVar2 = uVar1;
            }
            *(uint *)(unaff_x19 + 0x91) = uVar2;
            if ((uint)uVar12 >> 0xf == 0) {
              func_0x006b1f78(*unaff_x19,5,uVar3 & 0xff,(int)(short)uVar12);
            }
            else {
              func_0x006b1f78(*unaff_x19,0x42,uVar3 & 0xff,0);
              func_0x006b24c4(*unaff_x19,uVar12);
            }
            uVar14 = *(ulong *)(in_stack_00000040 + 0x38);
            if (cRam0000000000a336a0 == '\0') {
              if (uVar14 != 0) {
                uVar14 = 0;
                uVar4 = *(undefined4 *)((long)unaff_x19 + 0x484);
                do {
                  *(uint *)((long)unaff_x19 + 0x484) = (uVar3 + 2 + (int)uVar14 & 0xff) + 1;
                  func_0x006c6028();
                  *(undefined4 *)((long)unaff_x19 + 0x484) = uVar4;
                  uVar14 = uVar14 + 1;
                } while (uVar14 < *(ulong *)(in_stack_00000040 + 0x38));
              }
              goto code_r0x006c9988;
            }
            if (uVar14 == 0) goto code_r0x006c9988;
            uVar21 = 0;
            iVar18 = 0;
            goto code_r0x006c988c;
          }
          puVar22 = (undefined8 *)(*(long *)(in_stack_00000040 + 0x20) + unaff_x20 * 0x10);
          pcVar19 = (char *)*puVar22;
          unaff_x24 = puVar22[1];
          lVar8 = _memchr(pcVar19,0x25,unaff_x24);
          uVar14 = _uStack0000000000000070;
          if (lVar8 != 0) goto joined_r0x006c91a4;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (&uStack0000000000000060,pcVar19,unaff_x24);
        } while( true );
      }
      unaff_x23 = pcVar19 + 1;
      cVar5 = *pcVar19;
      bStack0000000000000077 = (byte)(uVar14 >> 0x38);
      if ((long)uVar14 < 0) {
        uVar21 = (uVar14 & 0x7fffffffffffffff) - 1;
        if (in_stack_00000068 == uVar21) {
          if ((uVar14 & 0x7fffffffffffffff) != 0x7ffffffffffffff8) {
            uVar14 = 0x7ffffffffffffff7;
            puVar22 = uStack0000000000000060;
            if (uVar21 < 0x3ffffffffffffff3) goto code_r0x006c9208;
            goto code_r0x006c9238;
          }
          goto code_r0x006c9a84;
        }
code_r0x006c92ac:
        uVar14 = in_stack_00000068 + 1;
        *(char *)((long)uStack0000000000000060 + in_stack_00000068) = cVar5;
        ((char *)((long)uStack0000000000000060 + in_stack_00000068))[1] = '\0';
        in_stack_00000068 = uVar14;
        if (cVar5 == '%') break;
        goto code_r0x006c91a0;
      }
      if (bStack0000000000000077 == 0x16) {
        uVar21 = 0x16;
        puVar22 = &uStack0000000000000060;
code_r0x006c9208:
        uVar13 = uVar21 * 2;
        if (uVar13 < uVar21 + 1) {
          uVar13 = uVar21 + 1;
        }
        uVar16 = (uVar13 & 0x7ffffffffffffff8) + 8;
        if ((uVar13 | 7) != 0x17) {
          uVar16 = uVar13 | 7;
        }
        uVar14 = 0x17;
        if (0x16 < uVar13) {
          uVar14 = uVar16 + 1;
        }
code_r0x006c9238:
        puVar9 = (undefined8 *)__Znwm(uVar14);
        if ((uVar21 == 0) || (_memmove(puVar9,puVar22,uVar21), uVar21 != 0x16)) {
          __ZdlPv(puVar22);
        }
        in_stack_00000068 = uVar21;
        uStack0000000000000060 = puVar9;
        _uStack0000000000000070 = uVar14 | 0x8000000000000000;
        goto code_r0x006c92ac;
      }
      uVar21 = (ulong)bStack0000000000000077;
      uStack0000000000000070 = (undefined7)uVar14;
      _uStack0000000000000070 =
           CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
      *(char *)((long)&uStack0000000000000060 + uVar21) = cVar5;
      *(undefined1 *)((long)&uStack0000000000000060 + uVar21 + 1) = 0;
    } while (cVar5 != '%');
    if ((long)_uStack0000000000000070 < 0) break;
    if (bStack0000000000000077 == 0x16) {
      unaff_x25 = 0x16;
      unaff_x26 = &uStack0000000000000060;
      goto code_r0x006c9324;
    }
    uVar14 = (ulong)bStack0000000000000077;
    _uStack0000000000000070 =
         CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
    puVar22 = &uStack0000000000000060;
  } while( true );
  unaff_x25 = (_uStack0000000000000070 & 0x7fffffffffffffff) - 1;
  if (in_stack_00000068 == unaff_x25) goto code_r0x006c92fc;
  goto LAB_006c93a4;
code_r0x006c92fc:
  if ((_uStack0000000000000070 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto code_r0x006c9a84;
  unaff_x28 = 0x7ffffffffffffff7;
  unaff_x26 = uStack0000000000000060;
  if (unaff_x25 < 0x3ffffffffffffff3) {
code_r0x006c9324:
    uVar14 = unaff_x25 * 2;
    if (uVar14 < unaff_x25 + 1) {
      uVar14 = unaff_x25 + 1;
    }
    if (uVar14 < 0x17) {
      unaff_x28 = 0x17;
    }
    else {
      uVar21 = (uVar14 & 0x7ffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar21 = uVar14 | 7;
      }
      unaff_x28 = uVar21 + 1;
    }
  }
  unaff_x27 = (undefined8 *)__Znwm(unaff_x28);
  goto code_r0x006c9368;
code_r0x006c9a84:
  func_0x0001748c(&uStack0000000000000060);
  goto code_r0x006c9ae0;
code_r0x006c988c:
  do {
    uVar13 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + uVar21 * 8);
    if ((unaff_x19[0x22] != 0) && (uVar13 != unaff_x19[0x23])) {
      uVar16 = 0;
      uVar15 = uVar13 >> 4 ^ uVar13 >> 9;
      do {
        uVar15 = uVar15 & unaff_x19[0x21] - 1;
        uVar17 = *(ulong *)(unaff_x19[0x20] + uVar15 * 0x20);
        if (uVar17 == uVar13) {
          if (*(int *)(unaff_x19[0x20] + uVar15 * 0x20 + 8) == 5) {
            iVar18 = iVar18 + 1;
            uVar21 = uVar21 + 1;
            if (uVar21 < uVar14) goto code_r0x006c988c;
            goto code_r0x006c9988;
          }
          break;
        }
        uVar16 = uVar16 + 1;
        uVar15 = uVar16 + uVar15;
      } while (uVar17 != unaff_x19[0x23] && uVar16 <= unaff_x19[0x21] - 1);
    }
    uVar4 = *(undefined4 *)((long)unaff_x19 + 0x484);
    *(uint *)((long)unaff_x19 + 0x484) = (((uVar3 + 2) - iVar18) + (int)uVar21 & 0xff) + 1;
    func_0x006c6028();
    *(undefined4 *)((long)unaff_x19 + 0x484) = uVar4;
    uVar14 = *(ulong *)(in_stack_00000040 + 0x38);
    uVar21 = uVar21 + 1;
  } while (uVar21 < uVar14);
code_r0x006c9988:
  uVar12 = func_0x006b1354(*unaff_x19,"format",6);
  if (-1 < (int)uVar12) {
    uVar20 = *unaff_x19;
    uVar7 = func_0x006b401c("format",6);
    func_0x006b1ccc(uVar20,0x14,uVar3 & 0xff,uVar3 & 0xff,uVar7);
    func_0x006b24c4(*unaff_x19,uVar12);
    func_0x006b1ccc(*unaff_x19,0x15,uVar3 & 0xff,
                    (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2U & 0xff,2);
    func_0x006b1ccc(*unaff_x19,6,in_stack_00000018._4_4_,uVar3 & 0xff,0);
    lVar8 = uStack0000000000000058;
    *(uint *)((long)unaff_x19 + 0x484) = uVar3;
    uStack0000000000000058 = 0;
    if (lVar8 != 0) {
      __ZdaPv();
    }
    if ((long)_uStack0000000000000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    return;
  }
  func_0x006bc388(in_stack_00000040 + 0xc,"Exceeded constant limit; simplify the code to compile");
code_r0x006c9ae0:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
  (*pcVar6)();
}

