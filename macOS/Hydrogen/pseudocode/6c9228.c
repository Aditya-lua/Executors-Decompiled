
void FUN_006c9228(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  byte *pbVar3;
  uint uVar4;
  undefined4 uVar5;
  byte bVar6;
  char cVar7;
  code *pcVar8;
  undefined1 in_ZR;
  undefined1 uVar9;
  long lVar10;
  undefined8 *puVar11;
  long *plVar12;
  long *plVar13;
  undefined8 uVar14;
  ulong in_x9;
  ulong uVar15;
  ulong in_x10;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined2 unaff_w21;
  int iVar19;
  uint unaff_w22;
  byte *unaff_x23;
  char *pcVar20;
  undefined8 uVar21;
  long unaff_x24;
  ulong unaff_x25;
  ulong uVar22;
  undefined8 *unaff_x26;
  undefined8 *puVar23;
  ulong uVar24;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  long in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  byte bStack0000000000000077;
  
code_r0x006c9228:
  puVar23 = unaff_x26;
  if (!(bool)in_ZR) {
    in_x9 = in_x10;
  }
  uVar22 = 0x17;
  if (0x16 < param_1) {
    uVar22 = in_x9 + 1;
  }
code_r0x006c9238:
  uVar24 = unaff_x25;
  puVar11 = (undefined8 *)__Znwm(uVar22);
  if ((uVar24 == 0) || (_memmove(puVar11,puVar23,uVar24), uVar24 != 0x16)) {
    __ZdlPv(puVar23);
  }
  uStack0000000000000060 = puVar11;
  _uStack0000000000000070 = uVar22 | 0x8000000000000000;
LAB_006c92ac:
  in_stack_00000068 = uVar24 + 1;
  *(undefined1 *)((long)uStack0000000000000060 + uVar24) = (char)unaff_w22;
  ((undefined1 *)((long)uStack0000000000000060 + uVar24))[1] = 0;
  if (unaff_w22 != 0x25) goto LAB_006c91a0;
code_r0x006c92c8:
  if (-1 < (long)_uStack0000000000000070) {
    if (bStack0000000000000077 == 0x16) {
      uVar22 = 0x16;
      puVar23 = &uStack0000000000000060;
LAB_006c9324:
      uVar15 = uVar22 * 2;
      if (uVar15 < uVar22 + 1) {
        uVar15 = uVar22 + 1;
      }
      if (uVar15 < 0x17) {
        uVar24 = 0x17;
      }
      else {
        uVar24 = (uVar15 & 0x7ffffffffffffff8) + 8;
        if ((uVar15 | 7) != 0x17) {
          uVar24 = uVar15 | 7;
        }
        uVar24 = uVar24 + 1;
      }
LAB_006c935c:
      puVar11 = (undefined8 *)__Znwm(uVar24);
      if ((uVar22 == 0) || (_memmove(puVar11,puVar23,uVar22), uVar22 != 0x16)) {
        __ZdlPv(puVar23);
      }
      _uStack0000000000000070 = uVar24 | 0x8000000000000000;
      in_stack_00000068 = uVar22;
      uStack0000000000000060 = puVar11;
      goto LAB_006c93a4;
    }
    uVar22 = (ulong)bStack0000000000000077;
    _uStack0000000000000070 =
         CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
    puVar23 = &uStack0000000000000060;
LAB_006c919c:
    *(undefined2 *)((long)puVar23 + uVar22) = unaff_w21;
LAB_006c91a0:
    do {
      unaff_x24 = unaff_x24 + -1;
      pbVar3 = unaff_x23;
      puVar23 = uStack0000000000000060;
      uVar24 = in_stack_00000068;
      uVar22 = _uStack0000000000000070;
joined_r0x006c91a4:
      uStack0000000000000060 = puVar23;
      in_stack_00000068 = uVar24;
      _uStack0000000000000070 = uVar22;
      if (unaff_x24 == 0) {
        do {
          if (unaff_x20 < *(ulong *)(in_stack_00000040 + 0x38)) {
            if (unaff_x19[0x22] != 0) {
              uVar22 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + unaff_x20 * 8);
              if (uVar22 != unaff_x19[0x23]) {
                uVar24 = 0;
                uVar15 = uVar22 >> 4 ^ uVar22 >> 9;
                do {
                  uVar15 = uVar15 & unaff_x19[0x21] - 1;
                  uVar17 = *(ulong *)(unaff_x19[0x20] + uVar15 * 0x20);
                  if (uVar17 == uVar22) {
                    lVar10 = unaff_x19[0x20] + uVar15 * 0x20;
                    if (*(int *)(lVar10 + 8) == 5) {
                      pcVar20 = *(char **)(lVar10 + 0x10);
                      uVar1 = *(uint *)(lVar10 + 0xc);
                      uVar22 = (ulong)uVar1;
                      lVar10 = _memchr(pcVar20,0x25,uVar22);
                      if (lVar10 == 0) {
                        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                  (&uStack0000000000000060,pcVar20,uVar22);
                      }
                      else if (uVar1 != 0) {
                        do {
                          cVar7 = *pcVar20;
                          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                    (&uStack0000000000000060,(long)cVar7);
                          if (cVar7 == '%') {
                            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                      (&uStack0000000000000060,0x25);
                          }
                          uVar22 = uVar22 - 1;
                          pcVar20 = pcVar20 + 1;
                        } while (uVar22 != 0);
                      }
                      goto code_r0x006c9148;
                    }
                    break;
                  }
                  uVar24 = uVar24 + 1;
                  uVar15 = uVar24 + uVar15;
                } while (uVar17 != unaff_x19[0x23] && uVar24 <= unaff_x19[0x21] - 1);
              }
            }
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (&uStack0000000000000060,"%*",2);
          }
code_r0x006c9148:
          uVar22 = _uStack0000000000000070;
          unaff_x20 = unaff_x20 + 1;
          if (*(ulong *)(in_stack_00000040 + 0x28) <= unaff_x20) {
            uVar24 = in_stack_00000068;
            if (-1 < (long)_uStack0000000000000070) {
              uVar24 = _uStack0000000000000070 >> 0x38;
            }
            lVar10 = __Znam(uVar24);
            puVar23 = uStack0000000000000060;
            if (-1 < (long)uVar22) {
              puVar23 = &uStack0000000000000060;
            }
            uStack0000000000000058 = lVar10;
            _memcpy(lVar10,puVar23,uVar24);
            plVar12 = (long *)unaff_x19[0xa7];
            if (plVar12 < (long *)unaff_x19[0xa8]) {
              uStack0000000000000058 = 0;
              plVar13 = plVar12 + 1;
              *plVar12 = lVar10;
            }
            else {
              plVar13 = (long *)func_0x006cb028(unaff_x19 + 0xa6,&uStack0000000000000058);
            }
            unaff_x19[0xa7] = plVar13;
            uVar14 = func_0x006b1354(*unaff_x19,lVar10,uVar24);
            if ((int)(uint)uVar14 < 0) {
              func_0x006bc388(in_stack_00000040 + 0xc,
                              "Exceeded constant limit; simplify the code to compile");
              goto code_r0x006c9ae0;
            }
            uVar4 = *(uint *)((long)unaff_x19 + 0x484);
            uVar1 = (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2 + uVar4;
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
              goto code_r0x006c9988;
            }
            if (uVar22 == 0) goto code_r0x006c9988;
            uVar24 = 0;
            iVar19 = 0;
            goto code_r0x006c988c;
          }
          puVar23 = (undefined8 *)(*(long *)(in_stack_00000040 + 0x20) + unaff_x20 * 0x10);
          pbVar3 = (byte *)*puVar23;
          unaff_x24 = puVar23[1];
          lVar10 = _memchr(pbVar3,0x25,unaff_x24);
          puVar23 = uStack0000000000000060;
          uVar24 = in_stack_00000068;
          uVar22 = _uStack0000000000000070;
          if (lVar10 != 0) goto joined_r0x006c91a4;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (&uStack0000000000000060,pbVar3,unaff_x24);
        } while( true );
      }
      unaff_x23 = pbVar3 + 1;
      bVar6 = *pbVar3;
      unaff_w22 = (uint)bVar6;
      bStack0000000000000077 = (byte)(uVar22 >> 0x38);
      if ((long)uVar22 < 0) {
        unaff_x25 = (uVar22 & 0x7fffffffffffffff) - 1;
        if (uVar24 != unaff_x25) goto LAB_006c92ac;
        if ((uVar22 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto LAB_006c9a84;
        uVar22 = 0x7ffffffffffffff7;
        unaff_x26 = puVar23;
        if (0x3ffffffffffffff2 < unaff_x25) goto code_r0x006c9238;
code_r0x006c9208:
        param_1 = unaff_x25 * 2;
        if (param_1 < unaff_x25 + 1) {
          param_1 = unaff_x25 + 1;
        }
        in_x9 = (param_1 & 0x7ffffffffffffff8) + 8;
        in_x10 = param_1 | 7;
        in_ZR = in_x10 == 0x17;
        goto code_r0x006c9228;
      }
      if (bStack0000000000000077 == 0x16) {
        unaff_x25 = 0x16;
        unaff_x26 = &uStack0000000000000060;
        goto code_r0x006c9208;
      }
      uVar24 = (ulong)bStack0000000000000077;
      uStack0000000000000070 = (undefined7)uVar22;
      _uStack0000000000000070 =
           CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
      *(byte *)((long)&uStack0000000000000060 + uVar24) = bVar6;
      *(undefined1 *)((long)&uStack0000000000000060 + uVar24 + 1) = 0;
    } while (bVar6 != 0x25);
    goto code_r0x006c92c8;
  }
  uVar22 = (_uStack0000000000000070 & 0x7fffffffffffffff) - 1;
  if (in_stack_00000068 != uVar22) {
LAB_006c93a4:
    uVar22 = in_stack_00000068;
    puVar23 = uStack0000000000000060;
    in_stack_00000068 = in_stack_00000068 + 1;
    goto LAB_006c919c;
  }
  if ((_uStack0000000000000070 & 0x7fffffffffffffff) != 0x7ffffffffffffff8) {
    uVar24 = 0x7ffffffffffffff7;
    puVar23 = uStack0000000000000060;
    if (uVar22 < 0x3ffffffffffffff3) goto LAB_006c9324;
    goto LAB_006c935c;
  }
LAB_006c9a84:
  func_0x0001748c(&uStack0000000000000060);
  goto code_r0x006c9ae0;
code_r0x006c988c:
  do {
    uVar15 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + uVar24 * 8);
    if ((unaff_x19[0x22] != 0) && (uVar15 != unaff_x19[0x23])) {
      uVar17 = 0;
      uVar16 = uVar15 >> 4 ^ uVar15 >> 9;
      do {
        uVar16 = uVar16 & unaff_x19[0x21] - 1;
        uVar18 = *(ulong *)(unaff_x19[0x20] + uVar16 * 0x20);
        if (uVar18 == uVar15) {
          if (*(int *)(unaff_x19[0x20] + uVar16 * 0x20 + 8) == 5) {
            iVar19 = iVar19 + 1;
            uVar24 = uVar24 + 1;
            if (uVar24 < uVar22) goto code_r0x006c988c;
            goto code_r0x006c9988;
          }
          break;
        }
        uVar17 = uVar17 + 1;
        uVar16 = uVar17 + uVar16;
      } while (uVar18 != unaff_x19[0x23] && uVar17 <= unaff_x19[0x21] - 1);
    }
    uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
    *(uint *)((long)unaff_x19 + 0x484) = (((uVar4 + 2) - iVar19) + (int)uVar24 & 0xff) + 1;
    func_0x006c6028();
    *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
    uVar22 = *(ulong *)(in_stack_00000040 + 0x38);
    uVar24 = uVar24 + 1;
  } while (uVar24 < uVar22);
code_r0x006c9988:
  uVar14 = func_0x006b1354(*unaff_x19,"format",6);
  if (-1 < (int)uVar14) {
    uVar21 = *unaff_x19;
    uVar9 = func_0x006b401c("format",6);
    func_0x006b1ccc(uVar21,0x14,uVar4 & 0xff,uVar4 & 0xff,uVar9);
    func_0x006b24c4(*unaff_x19,uVar14);
    func_0x006b1ccc(*unaff_x19,0x15,uVar4 & 0xff,
                    (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2U & 0xff,2);
    func_0x006b1ccc(*unaff_x19,6,in_stack_00000018._4_4_,uVar4 & 0xff,0);
    lVar10 = uStack0000000000000058;
    *(uint *)((long)unaff_x19 + 0x484) = uVar4;
    uStack0000000000000058 = 0;
    if (lVar10 != 0) {
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
  pcVar8 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
  (*pcVar8)();
}

