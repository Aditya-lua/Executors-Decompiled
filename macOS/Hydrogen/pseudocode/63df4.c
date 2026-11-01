
long * FUN_00063df4(long param_1)

{
  byte bVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  byte *pbVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  undefined8 *unaff_x19;
  long *plVar12;
  undefined2 uVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  
  plVar12 = (long *)(param_1 + 0x28);
  if (*(char *)(param_1 + 0x3f) < '\0') {
    plVar12 = (long *)*plVar12;
  }
  uVar3 = _strlen(plVar12);
  if (uVar3 < 0x7ffffffffffffff8) {
    if (uVar3 < 0x17) {
      *(char *)((long)unaff_x19 + 0x17) = (char)uVar3;
      puVar4 = unaff_x19;
      if (uVar3 == 0) {
        *(undefined1 *)unaff_x19 = 0;
        return (long *)0x0;
      }
    }
    else {
      uVar5 = (uVar3 & 0xfffffffffffffff8) + 8;
      if ((uVar3 | 7) != 0x17) {
        uVar5 = uVar3 | 7;
      }
      puVar4 = (undefined8 *)__Znwm(uVar5 + 1);
      unaff_x19[1] = uVar3;
      unaff_x19[2] = uVar5 + 1 | 0x8000000000000000;
      *unaff_x19 = puVar4;
    }
    plVar12 = (long *)_memmove(puVar4,plVar12,uVar3);
    *(undefined1 *)((long)puVar4 + uVar3) = 0;
    return plVar12;
  }
  auVar15 = func_0x0001748c();
  pbVar10 = auVar15._8_8_;
  plVar12 = auVar15._0_8_;
  bVar1 = pbVar10[0x17];
  uVar3 = *(ulong *)(pbVar10 + 8);
  if (-1 < (char)bVar1) {
    uVar3 = (ulong)bVar1;
  }
  if (uVar3 == 0) {
    uVar5 = 0;
    uVar8 = plVar12[1];
  }
  else {
    uVar5 = 0;
    pbVar6 = *(byte **)pbVar10;
    if (-1 < (char)bVar1) {
      pbVar6 = pbVar10;
    }
    uVar8 = uVar3;
    do {
      uVar5 = uVar5 * 0x21 & 0x3ffffffffffffff ^ (ulong)(byte)(&UNK_00806e7c)[*pbVar6];
      uVar8 = uVar8 - 1;
      pbVar6 = pbVar6 + 1;
    } while (uVar8 != 0);
    uVar8 = plVar12[1];
  }
  if (uVar8 != 0) {
    uVar14 = CONCAT17(POPCOUNT((char)(uVar8 >> 0x38)),
                      CONCAT16(POPCOUNT((char)(uVar8 >> 0x30)),
                               CONCAT15(POPCOUNT((char)(uVar8 >> 0x28)),
                                        CONCAT14(POPCOUNT((char)(uVar8 >> 0x20)),
                                                 CONCAT13(POPCOUNT((char)(uVar8 >> 0x18)),
                                                          CONCAT12(POPCOUNT((char)(uVar8 >> 0x10)),
                                                                   CONCAT11(POPCOUNT((char)(uVar8 >>
                                                                                           8)),
                                                                            POPCOUNT((char)uVar8))))
                                                ))));
    uVar13 = NEON_uaddlv(uVar14,1);
    uVar9 = CONCAT62((int6)((ulong)uVar14 >> 0x10),uVar13) & 0xffffffff;
    if (uVar9 < 2) {
      uVar7 = uVar8 - 1 & uVar5;
    }
    else {
      uVar7 = uVar5;
      if (uVar8 <= uVar5) {
        uVar7 = 0;
        if (uVar8 != 0) {
          uVar7 = uVar5 / uVar8;
        }
        uVar7 = uVar5 - uVar7 * uVar8;
      }
    }
    plVar12 = *(long **)(*plVar12 + uVar7 * 8);
    if ((plVar12 != (long *)0x0) && (plVar12 = (long *)*plVar12, plVar12 != (long *)0x0)) {
      pbVar6 = *(byte **)pbVar10;
      if (-1 < (char)bVar1) {
        pbVar6 = pbVar10;
      }
      if (uVar9 < 2) {
        do {
          if (uVar5 == plVar12[1]) {
            bVar1 = *(byte *)((long)plVar12 + 0x27);
            uVar9 = plVar12[3];
            if (-1 < (char)bVar1) {
              uVar9 = (ulong)bVar1;
            }
            if (uVar9 == uVar3) {
              pbVar10 = (byte *)plVar12[2];
              if (-1 < (char)bVar1) {
                pbVar10 = (byte *)(plVar12 + 2);
              }
              if (uVar3 == 0) {
                return plVar12;
              }
              uVar9 = uVar3;
              pbVar11 = pbVar6;
              while ((&UNK_00806e7c)[*pbVar10] == (&UNK_00806e7c)[*pbVar11]) {
                pbVar10 = pbVar10 + 1;
                pbVar11 = pbVar11 + 1;
                uVar9 = uVar9 - 1;
                if (uVar9 == 0) {
                  return plVar12;
                }
              }
            }
          }
          else if ((plVar12[1] & uVar8 - 1) != uVar7) {
            return (long *)0x0;
          }
          plVar12 = (long *)*plVar12;
        } while (plVar12 != (long *)0x0);
      }
      else {
        do {
          uVar9 = plVar12[1];
          if (uVar5 == uVar9) {
            bVar1 = *(byte *)((long)plVar12 + 0x27);
            uVar9 = plVar12[3];
            if (-1 < (char)bVar1) {
              uVar9 = (ulong)bVar1;
            }
            if (uVar9 == uVar3) {
              pbVar10 = (byte *)plVar12[2];
              if (-1 < (char)bVar1) {
                pbVar10 = (byte *)(plVar12 + 2);
              }
              if (uVar3 == 0) {
                return plVar12;
              }
              uVar9 = uVar3;
              pbVar11 = pbVar6;
              while ((&UNK_00806e7c)[*pbVar10] == (&UNK_00806e7c)[*pbVar11]) {
                pbVar10 = pbVar10 + 1;
                pbVar11 = pbVar11 + 1;
                uVar9 = uVar9 - 1;
                if (uVar9 == 0) {
                  return plVar12;
                }
              }
            }
          }
          else {
            if (uVar8 <= uVar9) {
              uVar2 = 0;
              if (uVar8 != 0) {
                uVar2 = uVar9 / uVar8;
              }
              uVar9 = uVar9 - uVar2 * uVar8;
            }
            if (uVar9 != uVar7) {
              return (long *)0x0;
            }
          }
          plVar12 = (long *)*plVar12;
        } while (plVar12 != (long *)0x0);
      }
      return (long *)0x0;
    }
  }
  return (long *)0x0;
}

