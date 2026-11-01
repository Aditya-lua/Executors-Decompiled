
void FUN_006c964c(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  char *pcVar3;
  uint uVar4;
  undefined4 uVar5;
  char cVar6;
  code *pcVar7;
  undefined1 uVar8;
  long lVar9;
  undefined8 *puVar10;
  long *plVar11;
  long *plVar12;
  undefined8 uVar13;
  uint in_w9;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 *unaff_x19;
  int iVar18;
  undefined8 *unaff_x21;
  undefined8 *puVar19;
  undefined2 unaff_w22;
  char *unaff_x23;
  undefined8 uVar20;
  long unaff_x24;
  ulong uVar21;
  ulong uVar22;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  undefined8 *in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  byte bStack0000000000000077;
  
code_r0x006c964c:
  if (in_w9 != 0x16) {
    param_1 = param_1 & 0xff;
    _uStack0000000000000070 =
         CONCAT17((char)in_w9 + '\x01',uStack0000000000000070) & 0x7fffffffffffffff;
    puVar19 = &uStack0000000000000060;
    goto LAB_006c9514;
  }
  uVar21 = 0x16;
  puVar19 = &uStack0000000000000060;
  do {
    uVar14 = uVar21 * 2;
    if (uVar14 < uVar21 + 1) {
      uVar14 = uVar21 + 1;
    }
    if (uVar14 < 0x17) {
      uVar22 = 0x17;
    }
    else {
      uVar22 = (uVar14 & 0x7ffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar22 = uVar14 | 7;
      }
      uVar22 = uVar22 + 1;
    }
    do {
      puVar10 = (undefined8 *)__Znwm(uVar22);
      if ((uVar21 == 0) || (_memmove(puVar10,puVar19,uVar21), uVar21 != 0x16)) {
        __ZdlPv(puVar19);
      }
      _uStack0000000000000070 = uVar22 | 0x8000000000000000;
      in_stack_00000068 = uVar21;
      uStack0000000000000060 = puVar10;
      do {
        param_1 = in_stack_00000068;
        puVar19 = uStack0000000000000060;
        in_stack_00000068 = in_stack_00000068 + 1;
LAB_006c9514:
        *(undefined2 *)((long)puVar19 + param_1) = unaff_w22;
        do {
          while( true ) {
            unaff_x24 = unaff_x24 + -1;
            pcVar3 = unaff_x23;
            uVar21 = _uStack0000000000000070;
            while( true ) {
              puVar19 = unaff_x21;
              _uStack0000000000000070 = uVar21;
              if (unaff_x24 != 0) break;
              while( true ) {
                in_stack_00000030 = in_stack_00000030 + -1;
                if (in_stack_00000030 != 0) {
                  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                            (&uStack0000000000000060,"%*",2);
                }
                uVar21 = _uStack0000000000000070;
                unaff_x21 = puVar19 + 2;
                if (unaff_x21 == in_stack_00000028) {
                  uVar14 = in_stack_00000068;
                  if (-1 < (long)_uStack0000000000000070) {
                    uVar14 = _uStack0000000000000070 >> 0x38;
                  }
                  lVar9 = __Znam(uVar14);
                  puVar19 = uStack0000000000000060;
                  if (-1 < (long)uVar21) {
                    puVar19 = &uStack0000000000000060;
                  }
                  uStack0000000000000058 = lVar9;
                  _memcpy(lVar9,puVar19,uVar14);
                  plVar11 = (long *)unaff_x19[0xa7];
                  if (plVar11 < (long *)unaff_x19[0xa8]) {
                    uStack0000000000000058 = 0;
                    plVar12 = plVar11 + 1;
                    *plVar11 = lVar9;
                  }
                  else {
                    plVar12 = (long *)func_0x006cb028(unaff_x19 + 0xa6,&uStack0000000000000058);
                  }
                  unaff_x19[0xa7] = plVar12;
                  uVar13 = func_0x006b1354(*unaff_x19,lVar9,uVar14);
                  if ((int)(uint)uVar13 < 0) {
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
                  if ((uint)uVar13 >> 0xf == 0) {
                    func_0x006b1f78(*unaff_x19,5,uVar4 & 0xff,(int)(short)uVar13);
                  }
                  else {
                    func_0x006b1f78(*unaff_x19,0x42,uVar4 & 0xff,0);
                    func_0x006b24c4(*unaff_x19,uVar13);
                  }
                  uVar21 = *(ulong *)(in_stack_00000040 + 0x38);
                  if (cRam0000000000a336a0 == '\0') {
                    if (uVar21 != 0) {
                      uVar21 = 0;
                      uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
                      do {
                        *(uint *)((long)unaff_x19 + 0x484) = (uVar4 + 2 + (int)uVar21 & 0xff) + 1;
                        func_0x006c6028();
                        *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
                        uVar21 = uVar21 + 1;
                      } while (uVar21 < *(ulong *)(in_stack_00000040 + 0x38));
                    }
                    goto code_r0x006c9988;
                  }
                  if (uVar21 == 0) goto code_r0x006c9988;
                  uVar14 = 0;
                  iVar18 = 0;
                  goto code_r0x006c988c;
                }
                pcVar3 = (char *)*unaff_x21;
                unaff_x24 = puVar19[3];
                lVar9 = _memchr(pcVar3,0x25,unaff_x24);
                uVar21 = _uStack0000000000000070;
                if (lVar9 != 0) break;
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                          (&uStack0000000000000060,pcVar3,unaff_x24);
                puVar19 = unaff_x21;
              }
            }
            unaff_x23 = pcVar3 + 1;
            cVar6 = *pcVar3;
            bStack0000000000000077 = (byte)(uVar21 >> 0x38);
            if (-1 < (long)uVar21) break;
            uVar14 = (uVar21 & 0x7fffffffffffffff) - 1;
            if (in_stack_00000068 == uVar14) {
              if ((uVar21 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto code_r0x006c9a90;
              uVar21 = 0x7ffffffffffffff7;
              puVar19 = uStack0000000000000060;
              if (uVar14 < 0x3ffffffffffffff3) goto code_r0x006c9580;
code_r0x006c95b0:
              puVar10 = (undefined8 *)__Znwm(uVar21);
              if ((uVar14 == 0) || (_memmove(puVar10,puVar19,uVar14), uVar14 != 0x16)) {
                __ZdlPv(puVar19);
              }
              in_stack_00000068 = uVar14;
              uStack0000000000000060 = puVar10;
              _uStack0000000000000070 = uVar21 | 0x8000000000000000;
            }
            uVar21 = in_stack_00000068 + 1;
            *(char *)((long)uStack0000000000000060 + in_stack_00000068) = cVar6;
            ((char *)((long)uStack0000000000000060 + in_stack_00000068))[1] = '\0';
            in_stack_00000068 = uVar21;
            if (cVar6 == '%') goto code_r0x006c9640;
          }
          if (bStack0000000000000077 == 0x16) {
            uVar14 = 0x16;
            puVar19 = &uStack0000000000000060;
code_r0x006c9580:
            uVar22 = uVar14 * 2;
            if (uVar22 < uVar14 + 1) {
              uVar22 = uVar14 + 1;
            }
            uVar15 = (uVar22 & 0x7ffffffffffffff8) + 8;
            if ((uVar22 | 7) != 0x17) {
              uVar15 = uVar22 | 7;
            }
            uVar21 = 0x17;
            if (0x16 < uVar22) {
              uVar21 = uVar15 + 1;
            }
            goto code_r0x006c95b0;
          }
          uVar14 = (ulong)bStack0000000000000077;
          uStack0000000000000070 = (undefined7)uVar21;
          _uStack0000000000000070 =
               CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
          *(char *)((long)&uStack0000000000000060 + uVar14) = cVar6;
          *(undefined1 *)((long)&uStack0000000000000060 + uVar14 + 1) = 0;
        } while (cVar6 != '%');
code_r0x006c9640:
        param_1 = (ulong)(char)bStack0000000000000077;
        if (-1 < (long)_uStack0000000000000070) {
          in_w9 = (uint)bStack0000000000000077;
          goto code_r0x006c964c;
        }
        uVar21 = (_uStack0000000000000070 & 0x7fffffffffffffff) - 1;
      } while (in_stack_00000068 != uVar21);
      if ((_uStack0000000000000070 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) {
code_r0x006c9a90:
        func_0x0001748c(&uStack0000000000000060);
        goto code_r0x006c9ae0;
      }
      uVar22 = 0x7ffffffffffffff7;
      puVar19 = uStack0000000000000060;
    } while (0x3ffffffffffffff2 < uVar21);
  } while( true );
code_r0x006c988c:
  uVar22 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + uVar14 * 8);
  if ((unaff_x19[0x22] != 0) && (uVar22 != unaff_x19[0x23])) {
    uVar15 = 0;
    uVar16 = uVar22 >> 4 ^ uVar22 >> 9;
    do {
      uVar16 = uVar16 & unaff_x19[0x21] - 1;
      uVar17 = *(ulong *)(unaff_x19[0x20] + uVar16 * 0x20);
      if (uVar17 == uVar22) {
        if (*(int *)(unaff_x19[0x20] + uVar16 * 0x20 + 8) == 5) {
          iVar18 = iVar18 + 1;
          uVar14 = uVar14 + 1;
          if (uVar21 <= uVar14) goto code_r0x006c9988;
          goto code_r0x006c988c;
        }
        break;
      }
      uVar15 = uVar15 + 1;
      uVar16 = uVar15 + uVar16;
    } while (uVar17 != unaff_x19[0x23] && uVar15 <= unaff_x19[0x21] - 1);
  }
  uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
  *(uint *)((long)unaff_x19 + 0x484) = (((uVar4 + 2) - iVar18) + (int)uVar14 & 0xff) + 1;
  func_0x006c6028();
  *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
  uVar21 = *(ulong *)(in_stack_00000040 + 0x38);
  uVar14 = uVar14 + 1;
  if (uVar21 <= uVar14) {
code_r0x006c9988:
    uVar13 = func_0x006b1354(*unaff_x19,"format",6);
    if (-1 < (int)uVar13) {
      uVar20 = *unaff_x19;
      uVar8 = func_0x006b401c("format",6);
      func_0x006b1ccc(uVar20,0x14,uVar4 & 0xff,uVar4 & 0xff,uVar8);
      func_0x006b24c4(*unaff_x19,uVar13);
      func_0x006b1ccc(*unaff_x19,0x15,uVar4 & 0xff,
                      (*(int *)(in_stack_00000040 + 0x38) - in_stack_00000020) + 2U & 0xff,2);
      func_0x006b1ccc(*unaff_x19,6,in_stack_00000018._4_4_,uVar4 & 0xff,0);
      lVar9 = uStack0000000000000058;
      *(uint *)((long)unaff_x19 + 0x484) = uVar4;
      uStack0000000000000058 = 0;
      if (lVar9 != 0) {
        __ZdaPv();
      }
      if ((long)_uStack0000000000000070 < 0) {
        __ZdlPv(uStack0000000000000060);
      }
      return;
    }
    func_0x006bc388(in_stack_00000040 + 0xc,"Exceeded constant limit; simplify the code to compile")
    ;
code_r0x006c9ae0:
                    /* WARNING: Does not return */
    pcVar7 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
    (*pcVar7)();
  }
  goto code_r0x006c988c;
}

