
bool FUN_000692e8(void)

{
  byte bVar1;
  code *pcVar2;
  bool bVar3;
  long *plVar4;
  ulong uVar5;
  byte *pbVar6;
  long *plVar7;
  byte *pbVar8;
  ulong uVar9;
  byte *pbVar10;
  char *pcVar11;
  byte *pbStack0000000000000000;
  ulong uStack0000000000000008;
  undefined2 uStack0000000000000010;
  byte bStack0000000000000017;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined7 uStack0000000000000028;
  
  bStack0000000000000017 = 0x11;
  uStack0000000000000008 = s_Transfer_Encoding_008d1aa6._8_8_;
  pbStack0000000000000000 = (byte *)s_Transfer_Encoding_008d1aa6._0_8_;
  uStack0000000000000010 = 0x67;
  plVar4 = (long *)func_0x00063e9c();
  if (plVar4 == (long *)0x0) goto code_r0x000693fc;
  plVar7 = (long *)*plVar4;
  if (plVar7 != (long *)0x0) {
    pbVar6 = pbStack0000000000000000;
    uVar5 = uStack0000000000000008;
    if (-1 < (char)bStack0000000000000017) {
      pbVar6 = (byte *)register0x00000008;
      uVar5 = (ulong)bStack0000000000000017;
    }
    if (uVar5 == 0) {
      do {
        uVar5 = plVar7[3];
        if (-1 < (char)*(byte *)((long)plVar7 + 0x27)) {
          uVar5 = (ulong)*(byte *)((long)plVar7 + 0x27);
        }
        if (uVar5 != 0) goto code_r0x000693e0;
        plVar7 = (long *)*plVar7;
      } while (plVar7 != (long *)0x0);
    }
    else {
      do {
        bVar1 = *(byte *)((long)plVar7 + 0x27);
        uVar9 = plVar7[3];
        if (-1 < (char)bVar1) {
          uVar9 = (ulong)bVar1;
        }
        if (uVar9 != uVar5) goto code_r0x000693e0;
        pbVar8 = (byte *)plVar7[2];
        if (-1 < (char)bVar1) {
          pbVar8 = (byte *)(plVar7 + 2);
        }
        uVar9 = uVar5;
        pbVar10 = pbVar6;
        do {
          if ((&UNK_00806e7c)[*pbVar8] != (&UNK_00806e7c)[*pbVar10]) goto code_r0x000693e0;
          pbVar8 = pbVar8 + 1;
          pbVar10 = pbVar10 + 1;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
        plVar7 = (long *)*plVar7;
      } while (plVar7 != (long *)0x0);
    }
    if (plVar4 == (long *)0x0) goto code_r0x000693fc;
  }
code_r0x00069414:
  pcVar11 = (char *)(plVar4 + 5);
  if (*(char *)((long)plVar4 + 0x3f) < '\0') {
    pcVar11 = *(char **)pcVar11;
  }
  goto code_r0x00069424;
code_r0x000693e0:
  if (plVar7 != plVar4) goto code_r0x00069414;
code_r0x000693fc:
  pcVar11 = "";
code_r0x00069424:
  uVar5 = _strlen(pcVar11);
  if (0x7ffffffffffffff7 < uVar5) {
    func_0x0001748c(&uStack0000000000000018);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x695ec);
    (*pcVar2)();
  }
  if (uVar5 < 0x17) {
    _uStack0000000000000028 = CONCAT17((char)uVar5,uStack0000000000000028);
    pbVar6 = (byte *)&uStack0000000000000018;
    if (uVar5 == 0) goto code_r0x00069494;
  }
  else {
    uVar9 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar9 = uVar5 | 7;
    }
    pbVar6 = (byte *)__Znwm(uVar9 + 1);
    _uStack0000000000000028 = uVar9 + 1 | 0x8000000000000000;
    uStack0000000000000018 = pbVar6;
    in_stack_00000020 = uVar5;
  }
  _memmove(pbVar6,pcVar11,uVar5);
code_r0x00069494:
  bVar3 = false;
  pbVar6[uVar5] = 0;
  uVar5 = in_stack_00000020;
  if (-1 < (long)_uStack0000000000000028) {
    uVar5 = _uStack0000000000000028 >> 0x38;
  }
  if (uVar5 == 7) {
    pbVar6 = uStack0000000000000018;
    if (-1 < (long)_uStack0000000000000028) {
      pbVar6 = (byte *)&uStack0000000000000018;
    }
    bVar3 = false;
    if ((*pbVar6 & 0xdf) == 0x43) {
      pbVar6 = uStack0000000000000018;
      if (-1 < (long)_uStack0000000000000028) {
        pbVar6 = (byte *)&uStack0000000000000018;
      }
      bVar3 = false;
      if ((pbVar6[1] & 0xdf) == 0x48) {
        pbVar6 = uStack0000000000000018;
        if (-1 < (long)_uStack0000000000000028) {
          pbVar6 = (byte *)&uStack0000000000000018;
        }
        bVar3 = false;
        if ((pbVar6[2] & 0xdf) == 0x55) {
          pbVar6 = uStack0000000000000018;
          if (-1 < (long)_uStack0000000000000028) {
            pbVar6 = (byte *)&uStack0000000000000018;
          }
          bVar3 = false;
          if ((pbVar6[3] & 0xdf) == 0x4e) {
            pbVar6 = uStack0000000000000018;
            if (-1 < (long)_uStack0000000000000028) {
              pbVar6 = (byte *)&uStack0000000000000018;
            }
            bVar3 = false;
            if ((pbVar6[4] & 0xdf) == 0x4b) {
              pbVar6 = uStack0000000000000018;
              if (-1 < (long)_uStack0000000000000028) {
                pbVar6 = (byte *)&uStack0000000000000018;
              }
              bVar3 = false;
              if ((pbVar6[5] & 0xdf) == 0x45) {
                pbVar6 = uStack0000000000000018;
                if (-1 < (long)_uStack0000000000000028) {
                  pbVar6 = (byte *)&uStack0000000000000018;
                }
                bVar3 = (pbVar6[6] & 0xdf) == 0x44;
              }
            }
          }
        }
      }
    }
  }
  if ((long)_uStack0000000000000028 < 0) {
    __ZdlPv(uStack0000000000000018);
  }
  if ((char)bStack0000000000000017 < '\0') {
    __ZdlPv(pbStack0000000000000000);
    return bVar3;
  }
  s_Transfer_Encoding_008d1aa6[0] = s_Transfer_Encoding_008d1aa6[0];
  s_Transfer_Encoding_008d1aa6[1] = s_Transfer_Encoding_008d1aa6[1];
  s_Transfer_Encoding_008d1aa6[2] = s_Transfer_Encoding_008d1aa6[2];
  s_Transfer_Encoding_008d1aa6[3] = s_Transfer_Encoding_008d1aa6[3];
  s_Transfer_Encoding_008d1aa6[4] = s_Transfer_Encoding_008d1aa6[4];
  s_Transfer_Encoding_008d1aa6[5] = s_Transfer_Encoding_008d1aa6[5];
  s_Transfer_Encoding_008d1aa6[6] = s_Transfer_Encoding_008d1aa6[6];
  s_Transfer_Encoding_008d1aa6[7] = s_Transfer_Encoding_008d1aa6[7];
  s_Transfer_Encoding_008d1aa6[8] = s_Transfer_Encoding_008d1aa6[8];
  s_Transfer_Encoding_008d1aa6[9] = s_Transfer_Encoding_008d1aa6[9];
  s_Transfer_Encoding_008d1aa6[10] = s_Transfer_Encoding_008d1aa6[10];
  s_Transfer_Encoding_008d1aa6[0xb] = s_Transfer_Encoding_008d1aa6[0xb];
  s_Transfer_Encoding_008d1aa6[0xc] = s_Transfer_Encoding_008d1aa6[0xc];
  s_Transfer_Encoding_008d1aa6[0xd] = s_Transfer_Encoding_008d1aa6[0xd];
  s_Transfer_Encoding_008d1aa6[0xe] = s_Transfer_Encoding_008d1aa6[0xe];
  s_Transfer_Encoding_008d1aa6[0xf] = s_Transfer_Encoding_008d1aa6[0xf];
  return bVar3;
}

