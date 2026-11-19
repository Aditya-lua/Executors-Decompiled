/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087deec
 */

undefined1  [16] FUN_0087deec(long param_1,long *param_2,long *param_3)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong *puVar7;
  undefined1 auVar8 [16];
  
  iVar3 = *(int *)(param_1 + 8);
  if ((param_1 == 0) || (iVar3 != DAT_00d1b010)) {
    if ((param_1 == 0) || (iVar3 != DAT_00d1b050)) {
      if (param_1 != 0) {
        if (iVar3 != DAT_00d1b020) {
          return ZEXT816(0);
        }
        uVar4 = *(ulong *)(param_1 + 0x20);
        if (param_2[5] != 0) {
          uVar5 = (uVar4 >> 4 ^ uVar4 >> 9) * -0x61c8864680b583eb >>
                  ((ulong)*(byte *)(param_2 + 6) & 0x3f);
          if ((*(ulong *)(param_2[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
            do {
              if (*(ulong *)(*param_2 + uVar5 * 0x10) == uVar4) {
                if (*(int *)(*param_2 + uVar5 * 0x10 + 8) != 0) goto LAB_0087e280;
                break;
              }
              uVar5 = uVar5 + 1 & param_2[4] - 1U;
            } while ((*(ulong *)(param_2[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
          }
        }
        auVar8._8_8_ = 0;
        auVar8._0_8_ = uVar4;
        return auVar8 << 0x40;
      }
    }
    else {
      lVar6 = *(long *)(param_1 + 0x20);
      if (((lVar6 != 0) && (*(int *)(lVar6 + 8) == DAT_00d1b010)) && (param_3[5] != 0)) {
        uVar4 = *(ulong *)(lVar6 + 0x20);
        uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
        uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
        uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_3 + 6) & 0x3f);
        if ((*(ulong *)(param_3[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
          do {
            puVar7 = (ulong *)(*param_3 + uVar5 * 0x28);
            if (*puVar7 == uVar4) {
              if ((((puVar7[4] & 1) == 0) && (uVar4 = puVar7[1], uVar4 != 0)) &&
                 ((*(int *)(uVar4 + 8) == DAT_00d1b020 ||
                  (((*(int *)(uVar4 + 8) == DAT_00d1b0a0 && (*(int *)(uVar4 + 0x1c) == 0xf)) &&
                   (uVar4 = *(ulong *)(uVar4 + 0x20), *(int *)(uVar4 + 8) == DAT_00d1b020)))))) {
                iVar3 = FUN_0087e29c(param_2,*(undefined8 *)(uVar4 + 0x20));
                if (iVar3 == 0) {
                  auVar2._8_8_ = *(undefined8 *)(param_1 + 0x28);
                  auVar2._0_8_ = *(undefined8 *)(uVar4 + 0x20);
                  return auVar2;
                }
                goto LAB_0087e280;
              }
              break;
            }
            uVar5 = uVar5 + 1 & param_3[4] - 1U;
          } while ((*(ulong *)(param_3[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
        }
      }
      if (lVar6 != 0) {
        if (*(int *)(lVar6 + 8) != DAT_00d1b020) {
          return ZEXT816(0);
        }
        uVar4 = *(ulong *)(lVar6 + 0x20);
        if (param_2[5] != 0) {
          uVar5 = (uVar4 >> 4 ^ uVar4 >> 9) * -0x61c8864680b583eb >>
                  ((ulong)*(byte *)(param_2 + 6) & 0x3f);
          if ((*(ulong *)(param_2[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
            do {
              if (*(ulong *)(*param_2 + uVar5 * 0x10) == uVar4) {
                if (*(int *)(*param_2 + uVar5 * 0x10 + 8) != 0) goto LAB_0087e280;
                break;
              }
              uVar5 = uVar5 + 1 & param_2[4] - 1U;
            } while ((*(ulong *)(param_2[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
          }
        }
        auVar1._8_8_ = *(undefined8 *)(param_1 + 0x28);
        auVar1._0_8_ = uVar4;
        return auVar1;
      }
    }
  }
  else if (param_3[5] != 0) {
    uVar4 = *(ulong *)(param_1 + 0x20);
    uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
    uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
    uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_3 + 6) & 0x3f);
    if ((*(ulong *)(param_3[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      do {
        puVar7 = (ulong *)(*param_3 + uVar5 * 0x28);
        if (*puVar7 == uVar4) {
          if (((puVar7[4] & 1) == 0) && (puVar7[1] != 0)) {
            auVar8 = FUN_0087deec();
            return auVar8;
          }
          break;
        }
        uVar5 = uVar5 + 1 & param_3[4] - 1U;
      } while ((*(ulong *)(param_3[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
    }
  }
LAB_0087e280:
  return ZEXT816(0);
}

