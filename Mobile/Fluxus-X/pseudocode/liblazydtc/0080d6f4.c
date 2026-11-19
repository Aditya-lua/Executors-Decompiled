/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080d6f4
 */

void FUN_0080d6f4(undefined8 *param_1,long *param_2,long *param_3)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  byte bVar9;
  
  uVar4 = param_2[1];
  uVar3 = param_3[1];
  bVar9 = POPCOUNT((char)uVar4) + POPCOUNT((char)(uVar4 >> 8)) + POPCOUNT((char)(uVar4 >> 0x10)) +
          POPCOUNT((char)(uVar4 >> 0x18)) + POPCOUNT((char)(uVar4 >> 0x20)) +
          POPCOUNT((char)(uVar4 >> 0x28)) + POPCOUNT((char)(uVar4 >> 0x30)) +
          POPCOUNT((char)(uVar4 >> 0x38));
  if (bVar9 < 2) {
    uVar3 = uVar4 - 1 & uVar3;
  }
  else if (uVar4 <= uVar3) {
    uVar7 = 0;
    if (uVar4 != 0) {
      uVar7 = uVar3 / uVar4;
    }
    uVar3 = uVar3 - uVar7 * uVar4;
  }
  lVar6 = *param_2;
  plVar2 = *(long **)(lVar6 + uVar3 * 8);
  do {
    plVar5 = plVar2;
    plVar2 = (long *)*plVar5;
  } while ((long *)*plVar5 != param_3);
  if (plVar5 != param_2 + 2) {
    uVar7 = plVar5[1];
    if (bVar9 < 2) {
      uVar7 = uVar7 & uVar4 - 1;
    }
    else if (uVar4 <= uVar7) {
      uVar1 = 0;
      if (uVar4 != 0) {
        uVar1 = uVar7 / uVar4;
      }
      uVar7 = uVar7 - uVar1 * uVar4;
    }
    if (uVar7 == uVar3) goto LAB_0080d7c0;
  }
  if (*param_3 != 0) {
    uVar7 = *(ulong *)(*param_3 + 8);
    if (bVar9 < 2) {
      uVar7 = uVar7 & uVar4 - 1;
    }
    else if (uVar4 <= uVar7) {
      uVar1 = 0;
      if (uVar4 != 0) {
        uVar1 = uVar7 / uVar4;
      }
      uVar7 = uVar7 - uVar1 * uVar4;
    }
    if (uVar7 == uVar3) goto LAB_0080d7c0;
  }
  *(undefined8 *)(lVar6 + uVar3 * 8) = 0;
LAB_0080d7c0:
  lVar8 = *param_3;
  if (lVar8 != 0) {
    uVar7 = *(ulong *)(lVar8 + 8);
    if (bVar9 < 2) {
      uVar7 = uVar7 & uVar4 - 1;
    }
    else if (uVar4 <= uVar7) {
      uVar1 = 0;
      if (uVar4 != 0) {
        uVar1 = uVar7 / uVar4;
      }
      uVar7 = uVar7 - uVar1 * uVar4;
    }
    if (uVar7 != uVar3) {
      *(long **)(lVar6 + uVar7 * 8) = plVar5;
      lVar8 = *param_3;
    }
  }
  lVar6 = param_2[3];
  *plVar5 = lVar8;
  *param_3 = 0;
  *param_1 = param_3;
  param_1[1] = param_2 + 2;
  param_2[3] = lVar6 + -1;
  *(undefined1 *)(param_1 + 2) = 1;
  *(undefined4 *)((long)param_1 + 0x11) = 0;
  *(undefined4 *)((long)param_1 + 0x14) = 0;
  return;
}

