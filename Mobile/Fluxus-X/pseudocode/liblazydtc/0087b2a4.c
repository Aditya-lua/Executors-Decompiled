/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087b2a4
 */

bool FUN_0087b2a4(undefined1 (*param_1) [16],undefined1 (*param_2) [16])

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  undefined1 (*pauVar6) [16];
  undefined8 uVar7;
  ulong uVar8;
  undefined1 (*pauVar9) [16];
  undefined8 uVar10;
  long lVar11;
  int iVar12;
  undefined1 (*pauVar13) [16];
  long lVar14;
  undefined1 auVar15 [16];
  
  uVar5 = (long)param_2 - (long)param_1 >> 3;
  if ((long)uVar5 < 3) {
    if (uVar5 < 2) {
      return true;
    }
    if (uVar5 == 2) {
      if (*(uint *)(param_2[-1] + 8) < *(uint *)*param_1) {
        uVar7 = *(undefined8 *)*param_1;
        *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar7;
        return true;
      }
      return true;
    }
  }
  else {
    if (uVar5 == 3) {
      uVar1 = *(uint *)(*param_1 + 8);
      if (*(uint *)*param_1 <= uVar1) {
        if (uVar1 <= *(uint *)(param_2[-1] + 8)) {
          return true;
        }
        uVar7 = *(undefined8 *)(*param_1 + 8);
        *(undefined8 *)(*param_1 + 8) = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar7;
        if (*(uint *)(*param_1 + 8) < *(uint *)*param_1) {
          auVar15 = NEON_ext(*param_1,*param_1,8,1);
          *(long *)(*param_1 + 8) = auVar15._8_8_;
          *(long *)*param_1 = auVar15._0_8_;
          return true;
        }
        return true;
      }
      uVar7 = *(undefined8 *)*param_1;
      if (*(uint *)(param_2[-1] + 8) < uVar1) {
        *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar7;
        return true;
      }
      *(undefined8 *)*param_1 = *(undefined8 *)(*param_1 + 8);
      *(undefined8 *)(*param_1 + 8) = uVar7;
      if (*(uint *)(param_2[-1] + 8) < (uint)uVar7) {
        *(undefined8 *)(*param_1 + 8) = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar7;
        return true;
      }
      return true;
    }
    if (uVar5 == 4) {
      uVar1 = *(uint *)(*param_1 + 8);
      uVar2 = *(uint *)*param_1;
      uVar3 = *(uint *)param_1[1];
      uVar5 = (ulong)uVar3;
      if (uVar1 < uVar2) {
        uVar8 = *(ulong *)*param_1;
        if (uVar3 < uVar1) {
          uVar7 = *(undefined8 *)param_1[1];
          *(ulong *)param_1[1] = uVar8;
          *(undefined8 *)*param_1 = uVar7;
        }
        else {
          *(undefined8 *)*param_1 = *(undefined8 *)(*param_1 + 8);
          *(ulong *)(*param_1 + 8) = uVar8;
          if ((uint)uVar8 <= uVar3) goto LAB_0087b514;
          *(undefined8 *)(*param_1 + 8) = *(undefined8 *)param_1[1];
          *(ulong *)param_1[1] = uVar8;
        }
        uVar5 = uVar8 & 0xffffffff;
      }
      else if (uVar3 < uVar1) {
        uVar5 = *(ulong *)(*param_1 + 8);
        uVar7 = *(undefined8 *)param_1[1];
        *(undefined8 *)(*param_1 + 8) = uVar7;
        *(ulong *)param_1[1] = uVar5;
        if ((uint)uVar7 < uVar2) {
          uVar10 = *(undefined8 *)*param_1;
          *(undefined8 *)*param_1 = uVar7;
          *(undefined8 *)(*param_1 + 8) = uVar10;
        }
      }
LAB_0087b514:
      if ((uint)uVar5 <= *(uint *)(param_2[-1] + 8)) {
        return true;
      }
      uVar7 = *(undefined8 *)param_1[1];
      *(undefined8 *)param_1[1] = *(undefined8 *)(param_2[-1] + 8);
      *(undefined8 *)(param_2[-1] + 8) = uVar7;
      if (*(uint *)(*param_1 + 8) <= *(uint *)param_1[1]) {
        return true;
      }
      uVar7 = *(undefined8 *)(*param_1 + 8);
      uVar10 = *(undefined8 *)param_1[1];
      uVar1 = *(uint *)*param_1;
      *(undefined8 *)(*param_1 + 8) = uVar10;
      *(undefined8 *)param_1[1] = uVar7;
      if ((uint)uVar10 < uVar1) {
        uVar7 = *(undefined8 *)*param_1;
        *(undefined8 *)*param_1 = uVar10;
        *(undefined8 *)(*param_1 + 8) = uVar7;
        return true;
      }
      return true;
    }
    if (uVar5 == 5) {
      FUN_0087b130(param_1,*param_1 + 8,param_1 + 1,param_1[1] + 8,param_2[-1] + 8);
      return true;
    }
  }
  uVar1 = *(uint *)(*param_1 + 8);
  uVar2 = *(uint *)*param_1;
  uVar3 = *(uint *)param_1[1];
  if (uVar1 < uVar2) {
    uVar7 = *(undefined8 *)*param_1;
    if (uVar3 < uVar1) {
      uVar10 = *(undefined8 *)param_1[1];
      *(undefined8 *)param_1[1] = uVar7;
      *(undefined8 *)*param_1 = uVar10;
    }
    else {
      *(undefined8 *)*param_1 = *(undefined8 *)(*param_1 + 8);
      *(undefined8 *)(*param_1 + 8) = uVar7;
      if (uVar3 < (uint)uVar7) {
        *(undefined8 *)(*param_1 + 8) = *(undefined8 *)param_1[1];
        *(undefined8 *)param_1[1] = uVar7;
      }
    }
  }
  else if (uVar3 < uVar1) {
    uVar7 = *(undefined8 *)(*param_1 + 8);
    uVar10 = *(undefined8 *)param_1[1];
    *(undefined8 *)(*param_1 + 8) = uVar10;
    *(undefined8 *)param_1[1] = uVar7;
    if ((uint)uVar10 < uVar2) {
      uVar7 = *(undefined8 *)*param_1;
      *(undefined8 *)*param_1 = uVar10;
      *(undefined8 *)(*param_1 + 8) = uVar7;
    }
  }
  if ((undefined1 (*) [16])(param_1[1] + 8) != param_2) {
    lVar11 = 0;
    iVar12 = 0;
    pauVar13 = (undefined1 (*) [16])(param_1[1] + 8);
    pauVar9 = param_1 + 1;
    do {
      pauVar6 = pauVar13;
      if (*(uint *)*pauVar6 < *(uint *)*pauVar9) {
        uVar7 = *(undefined8 *)*pauVar6;
        lVar4 = lVar11;
        do {
          lVar14 = lVar4;
          *(undefined8 *)(param_1[1] + lVar14 + 8) = *(undefined8 *)(param_1[1] + lVar14);
          if (lVar14 == -0x10) {
            pauVar13 = param_1;
            goto LAB_0087b488;
          }
          lVar4 = lVar14 + -8;
        } while ((uint)uVar7 < *(uint *)(*param_1 + lVar14 + 8));
        pauVar13 = (undefined1 (*) [16])(param_1[1] + lVar14);
LAB_0087b488:
        iVar12 = iVar12 + 1;
        *(undefined8 *)*pauVar13 = uVar7;
        if (iVar12 == 8) {
          return (undefined1 (*) [16])(*pauVar6 + 8) == param_2;
        }
      }
      lVar11 = lVar11 + 8;
      pauVar13 = (undefined1 (*) [16])(*pauVar6 + 8);
      pauVar9 = pauVar6;
    } while ((undefined1 (*) [16])(*pauVar6 + 8) != param_2);
  }
  return true;
}

