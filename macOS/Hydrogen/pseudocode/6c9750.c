
void FUN_006c9750(undefined8 *param_1,char *param_2)

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
  long lVar11;
  long *plVar12;
  long *plVar13;
  undefined8 uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *unaff_x19;
  int iVar19;
  undefined8 *puVar20;
  undefined8 *unaff_x21;
  undefined2 unaff_w22;
  undefined8 uVar21;
  ulong uVar22;
  ulong uVar23;
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
  
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (param_1,param_2 + 0x5c0,2);
    puVar20 = unaff_x21;
    do {
      uVar23 = _uStack0000000000000070;
      unaff_x21 = puVar20 + 2;
      if (unaff_x21 == in_stack_00000028) {
        uVar22 = in_stack_00000068;
        if (-1 < (long)_uStack0000000000000070) {
          uVar22 = _uStack0000000000000070 >> 0x38;
        }
        lVar11 = __Znam(uVar22);
        puVar20 = uStack0000000000000060;
        if (-1 < (long)uVar23) {
          puVar20 = &uStack0000000000000060;
        }
        uStack0000000000000058 = lVar11;
        _memcpy(lVar11,puVar20,uVar22);
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
        uVar14 = func_0x006b1354(*unaff_x19,lVar11,uVar22);
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
        uVar23 = *(ulong *)(in_stack_00000040 + 0x38);
        if (cRam0000000000a336a0 == '\0') {
          if (uVar23 != 0) {
            uVar23 = 0;
            uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
            do {
              *(uint *)((long)unaff_x19 + 0x484) = (uVar4 + 2 + (int)uVar23 & 0xff) + 1;
              func_0x006c6028();
              *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
              uVar23 = uVar23 + 1;
            } while (uVar23 < *(ulong *)(in_stack_00000040 + 0x38));
          }
          goto code_r0x006c9988;
        }
        if (uVar23 == 0) goto code_r0x006c9988;
        uVar22 = 0;
        iVar19 = 0;
        goto code_r0x006c988c;
      }
      pcVar3 = (char *)*unaff_x21;
      lVar11 = puVar20[3];
      lVar9 = _memchr(pcVar3,0x25,lVar11);
      uVar23 = _uStack0000000000000070;
      if (lVar9 == 0) {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&uStack0000000000000060,pcVar3,lVar11);
      }
      else {
        for (; _uStack0000000000000070 = uVar23, lVar11 != 0; lVar11 = lVar11 + -1) {
          cVar6 = *pcVar3;
          bStack0000000000000077 = (byte)(uVar23 >> 0x38);
          if ((long)uVar23 < 0) {
            uVar22 = (uVar23 & 0x7fffffffffffffff) - 1;
            if (in_stack_00000068 != uVar22) goto code_r0x006c9624;
            if ((uVar23 & 0x7fffffffffffffff) != 0x7ffffffffffffff8) {
              uVar23 = 0x7ffffffffffffff7;
              puVar20 = uStack0000000000000060;
              if (uVar22 < 0x3ffffffffffffff3) goto code_r0x006c9580;
              goto code_r0x006c95b0;
            }
code_r0x006c9a90:
            func_0x0001748c(&uStack0000000000000060);
            goto code_r0x006c9ae0;
          }
          if (bStack0000000000000077 == 0x16) {
            uVar22 = 0x16;
            puVar20 = &uStack0000000000000060;
code_r0x006c9580:
            uVar15 = uVar22 * 2;
            if (uVar15 < uVar22 + 1) {
              uVar15 = uVar22 + 1;
            }
            uVar16 = (uVar15 & 0x7ffffffffffffff8) + 8;
            if ((uVar15 | 7) != 0x17) {
              uVar16 = uVar15 | 7;
            }
            uVar23 = 0x17;
            if (0x16 < uVar15) {
              uVar23 = uVar16 + 1;
            }
code_r0x006c95b0:
            puVar10 = (undefined8 *)__Znwm(uVar23);
            if ((uVar22 == 0) || (_memmove(puVar10,puVar20,uVar22), uVar22 != 0x16)) {
              __ZdlPv(puVar20);
            }
            in_stack_00000068 = uVar22;
            uStack0000000000000060 = puVar10;
            _uStack0000000000000070 = uVar23 | 0x8000000000000000;
code_r0x006c9624:
            *(char *)((long)uStack0000000000000060 + in_stack_00000068) = cVar6;
            ((char *)((long)uStack0000000000000060 + in_stack_00000068))[1] = '\0';
            in_stack_00000068 = in_stack_00000068 + 1;
            uVar23 = _uStack0000000000000070;
          }
          else {
            uVar22 = (ulong)bStack0000000000000077;
            uStack0000000000000070 = (undefined7)uVar23;
            _uStack0000000000000070 =
                 CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
            *(char *)((long)&uStack0000000000000060 + uVar22) = cVar6;
            *(undefined1 *)((long)&uStack0000000000000060 + uVar22 + 1) = 0;
            uVar23 = _uStack0000000000000070;
          }
          _uStack0000000000000070 = uVar23;
          if (cVar6 == '%') {
            bStack0000000000000077 = (byte)(uVar23 >> 0x38);
            if ((long)uVar23 < 0) {
              uVar22 = (uVar23 & 0x7fffffffffffffff) - 1;
              if (in_stack_00000068 == uVar22) {
                if ((uVar23 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto code_r0x006c9a90;
                uVar23 = 0x7ffffffffffffff7;
                puVar20 = uStack0000000000000060;
                if (uVar22 < 0x3ffffffffffffff3) goto code_r0x006c969c;
                goto code_r0x006c96d4;
              }
code_r0x006c971c:
              uVar22 = in_stack_00000068;
              puVar20 = uStack0000000000000060;
              in_stack_00000068 = in_stack_00000068 + 1;
            }
            else {
              if (bStack0000000000000077 == 0x16) {
                uVar22 = 0x16;
                puVar20 = &uStack0000000000000060;
code_r0x006c969c:
                uVar15 = uVar22 * 2;
                if (uVar15 < uVar22 + 1) {
                  uVar15 = uVar22 + 1;
                }
                if (uVar15 < 0x17) {
                  uVar23 = 0x17;
                }
                else {
                  uVar23 = (uVar15 & 0x7ffffffffffffff8) + 8;
                  if ((uVar15 | 7) != 0x17) {
                    uVar23 = uVar15 | 7;
                  }
                  uVar23 = uVar23 + 1;
                }
code_r0x006c96d4:
                puVar10 = (undefined8 *)__Znwm(uVar23);
                if ((uVar22 == 0) || (_memmove(puVar10,puVar20,uVar22), uVar22 != 0x16)) {
                  __ZdlPv(puVar20);
                }
                in_stack_00000068 = uVar22;
                uStack0000000000000060 = puVar10;
                _uStack0000000000000070 = uVar23 | 0x8000000000000000;
                goto code_r0x006c971c;
              }
              uVar22 = (ulong)bStack0000000000000077;
              uStack0000000000000070 = (undefined7)uVar23;
              _uStack0000000000000070 =
                   CONCAT17(bStack0000000000000077 + 1,uStack0000000000000070) & 0x7fffffffffffffff;
              puVar20 = &uStack0000000000000060;
            }
            *(undefined2 *)((long)puVar20 + uVar22) = unaff_w22;
          }
          pcVar3 = pcVar3 + 1;
          uVar23 = _uStack0000000000000070;
        }
      }
      in_stack_00000030 = in_stack_00000030 + -1;
      puVar20 = unaff_x21;
    } while (in_stack_00000030 == 0);
    param_1 = &uStack0000000000000060;
    param_2 = "[inext]";
  } while( true );
code_r0x006c988c:
  uVar15 = *(ulong *)(*(long *)(in_stack_00000040 + 0x30) + uVar22 * 8);
  if ((unaff_x19[0x22] != 0) && (uVar15 != unaff_x19[0x23])) {
    uVar16 = 0;
    uVar17 = uVar15 >> 4 ^ uVar15 >> 9;
    do {
      uVar17 = uVar17 & unaff_x19[0x21] - 1;
      uVar18 = *(ulong *)(unaff_x19[0x20] + uVar17 * 0x20);
      if (uVar18 == uVar15) {
        if (*(int *)(unaff_x19[0x20] + uVar17 * 0x20 + 8) == 5) {
          iVar19 = iVar19 + 1;
          uVar22 = uVar22 + 1;
          if (uVar22 < uVar23) goto code_r0x006c988c;
          goto code_r0x006c9988;
        }
        break;
      }
      uVar16 = uVar16 + 1;
      uVar17 = uVar16 + uVar17;
    } while (uVar18 != unaff_x19[0x23] && uVar16 <= unaff_x19[0x21] - 1);
  }
  uVar5 = *(undefined4 *)((long)unaff_x19 + 0x484);
  *(uint *)((long)unaff_x19 + 0x484) = (((uVar4 + 2) - iVar19) + (int)uVar22 & 0xff) + 1;
  func_0x006c6028();
  *(undefined4 *)((long)unaff_x19 + 0x484) = uVar5;
  uVar23 = *(ulong *)(in_stack_00000040 + 0x38);
  uVar22 = uVar22 + 1;
  if (uVar23 <= uVar22) {
code_r0x006c9988:
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
    func_0x006bc388(in_stack_00000040 + 0xc,"Exceeded constant limit; simplify the code to compile")
    ;
code_r0x006c9ae0:
                    /* WARNING: Does not return */
    pcVar7 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
    (*pcVar7)();
  }
  goto code_r0x006c988c;
}

