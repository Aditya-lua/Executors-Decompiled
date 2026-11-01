
long * FUN_000632b4(void)

{
  ulong uVar1;
  byte bVar2;
  char cVar3;
  ulong uVar4;
  ulong uVar5;
  byte *pbVar6;
  ulong uVar7;
  long *plVar8;
  ulong uVar9;
  ulong uVar10;
  byte *pbVar11;
  byte *pbVar12;
  undefined8 *unaff_x19;
  undefined2 uVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined8 in_stack_00000008;
  
  cVar3 = *(char *)((long)unaff_x19 + 0x17);
  while (-1 < cVar3) {
    __Unwind_Resume();
    __ZdlPv(in_stack_00000008);
    cVar3 = *(char *)((long)unaff_x19 + 0x17);
  }
  __ZdlPv(*unaff_x19);
  auVar15 = __Unwind_Resume();
  pbVar11 = auVar15._8_8_;
  plVar8 = auVar15._0_8_;
  bVar2 = pbVar11[0x17];
  uVar1 = *(ulong *)(pbVar11 + 8);
  if (-1 < (char)bVar2) {
    uVar1 = (ulong)bVar2;
  }
  if (uVar1 == 0) {
    uVar5 = 0;
    uVar9 = plVar8[1];
  }
  else {
    uVar5 = 0;
    pbVar6 = *(byte **)pbVar11;
    if (-1 < (char)bVar2) {
      pbVar6 = pbVar11;
    }
    uVar9 = uVar1;
    do {
      uVar5 = uVar5 * 0x21 & 0x3ffffffffffffff ^ (ulong)(byte)(&UNK_00806e7c)[*pbVar6];
      uVar9 = uVar9 - 1;
      pbVar6 = pbVar6 + 1;
    } while (uVar9 != 0);
    uVar9 = plVar8[1];
  }
  if (uVar9 != 0) {
    uVar14 = CONCAT17(POPCOUNT((char)(uVar9 >> 0x38)),
                      CONCAT16(POPCOUNT((char)(uVar9 >> 0x30)),
                               CONCAT15(POPCOUNT((char)(uVar9 >> 0x28)),
                                        CONCAT14(POPCOUNT((char)(uVar9 >> 0x20)),
                                                 CONCAT13(POPCOUNT((char)(uVar9 >> 0x18)),
                                                          CONCAT12(POPCOUNT((char)(uVar9 >> 0x10)),
                                                                   CONCAT11(POPCOUNT((char)(uVar9 >>
                                                                                           8)),
                                                                            POPCOUNT((char)uVar9))))
                                                ))));
    uVar13 = NEON_uaddlv(uVar14,1);
    uVar10 = CONCAT62((int6)((ulong)uVar14 >> 0x10),uVar13) & 0xffffffff;
    if (uVar10 < 2) {
      uVar7 = uVar9 - 1 & uVar5;
    }
    else {
      uVar7 = uVar5;
      if (uVar9 <= uVar5) {
        uVar7 = 0;
        if (uVar9 != 0) {
          uVar7 = uVar5 / uVar9;
        }
        uVar7 = uVar5 - uVar7 * uVar9;
      }
    }
    plVar8 = *(long **)(*plVar8 + uVar7 * 8);
    if ((plVar8 != (long *)0x0) && (plVar8 = (long *)*plVar8, plVar8 != (long *)0x0)) {
      pbVar6 = *(byte **)pbVar11;
      if (-1 < (char)bVar2) {
        pbVar6 = pbVar11;
      }
      if (uVar10 < 2) {
        do {
          if (plVar8[1] == uVar5) {
            bVar2 = *(byte *)((long)plVar8 + 0x27);
            uVar10 = plVar8[3];
            if (-1 < (char)bVar2) {
              uVar10 = (ulong)bVar2;
            }
            if (uVar10 == uVar1) {
              pbVar11 = (byte *)plVar8[2];
              if (-1 < (char)bVar2) {
                pbVar11 = (byte *)(plVar8 + 2);
              }
              if (uVar1 == 0) {
                return plVar8;
              }
              uVar10 = uVar1;
              pbVar12 = pbVar6;
              while ((&UNK_00806e7c)[*pbVar11] == (&UNK_00806e7c)[*pbVar12]) {
                pbVar11 = pbVar11 + 1;
                pbVar12 = pbVar12 + 1;
                uVar10 = uVar10 - 1;
                if (uVar10 == 0) {
                  return plVar8;
                }
              }
            }
          }
          else if ((plVar8[1] & uVar9 - 1) != uVar7) {
            return (long *)0x0;
          }
          plVar8 = (long *)*plVar8;
        } while (plVar8 != (long *)0x0);
      }
      else {
        do {
          uVar10 = plVar8[1];
          if (uVar10 == uVar5) {
            bVar2 = *(byte *)((long)plVar8 + 0x27);
            uVar10 = plVar8[3];
            if (-1 < (char)bVar2) {
              uVar10 = (ulong)bVar2;
            }
            if (uVar10 == uVar1) {
              pbVar11 = (byte *)plVar8[2];
              if (-1 < (char)bVar2) {
                pbVar11 = (byte *)(plVar8 + 2);
              }
              if (uVar1 == 0) {
                return plVar8;
              }
              uVar10 = uVar1;
              pbVar12 = pbVar6;
              while ((&UNK_00806e7c)[*pbVar11] == (&UNK_00806e7c)[*pbVar12]) {
                pbVar11 = pbVar11 + 1;
                pbVar12 = pbVar12 + 1;
                uVar10 = uVar10 - 1;
                if (uVar10 == 0) {
                  return plVar8;
                }
              }
            }
          }
          else {
            if (uVar9 <= uVar10) {
              uVar4 = 0;
              if (uVar9 != 0) {
                uVar4 = uVar10 / uVar9;
              }
              uVar10 = uVar10 - uVar4 * uVar9;
            }
            if (uVar10 != uVar7) {
              return (long *)0x0;
            }
          }
          plVar8 = (long *)*plVar8;
        } while (plVar8 != (long *)0x0);
      }
      return (long *)0x0;
    }
  }
  return (long *)0x0;
}

