/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afa314
 */

ulong FUN_00afa314(long param_1,long param_2,undefined8 *param_3)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  int *piVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  undefined8 *puVar12;
  
  if ((param_2 != 0) && (iVar3 = OPENSSL_sk_num(param_2), 0 < iVar3)) {
    if ((param_1 == 0) && (param_3 == (undefined8 *)0x0)) {
      return 0;
    }
    if ((param_1 != 0) && (*(long *)(param_1 + 0x38) == 0)) goto LAB_00afa6e8;
    if (param_3 == (undefined8 *)0x0) {
      lVar8 = OPENSSL_sk_value(param_2,0);
      param_3 = *(undefined8 **)(lVar8 + 0x130);
      if (param_3 == (undefined8 *)0x0) {
        return 1;
      }
      iVar3 = 0;
    }
    else {
      lVar8 = 0;
      iVar3 = -1;
    }
    iVar4 = FUN_00af94bc(*param_3);
    if ((iVar4 == 0) || (iVar4 = FUN_00af94bc(param_3[1]), iVar4 == 0)) {
      if (param_1 == 0) {
        return 0;
      }
      *(int *)(param_1 + 0xac) = iVar3;
      *(undefined4 *)(param_1 + 0xb0) = 0x29;
      *(long *)(param_1 + 0xb8) = lVar8;
      uVar6 = (**(code **)(param_1 + 0x38))(0,param_1);
      uVar9 = uVar6 & 0xffffffff;
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      piVar7 = (int *)*param_3;
      if (piVar7 != (int *)0x0) goto LAB_00afa3ec;
LAB_00afa410:
      lVar10 = 0;
LAB_00afa424:
      bVar1 = false;
      piVar7 = (int *)param_3[1];
      if (piVar7 == (int *)0x0) goto LAB_00afa44c;
LAB_00afa430:
      if (*piVar7 == 1) {
        lVar11 = *(long *)(piVar7 + 2);
        goto LAB_00afa458;
      }
      if (*piVar7 != 0) goto LAB_00afa44c;
      lVar11 = 0;
      bVar2 = true;
    }
    else {
      uVar9 = 1;
      piVar7 = (int *)*param_3;
      if (piVar7 == (int *)0x0) goto LAB_00afa410;
LAB_00afa3ec:
      if (*piVar7 == 1) {
        lVar10 = *(long *)(piVar7 + 2);
        goto LAB_00afa424;
      }
      if (*piVar7 != 0) goto LAB_00afa410;
      lVar10 = 0;
      bVar1 = true;
      piVar7 = (int *)param_3[1];
      if (piVar7 != (int *)0x0) goto LAB_00afa430;
LAB_00afa44c:
      lVar11 = 0;
LAB_00afa458:
      bVar2 = false;
    }
    iVar3 = iVar3 + 1;
    while( true ) {
      uVar5 = (uint)uVar9;
      iVar4 = OPENSSL_sk_num(param_2);
      if (iVar4 <= iVar3) break;
      lVar8 = OPENSSL_sk_value(param_2,iVar3);
      if (lVar8 == 0) goto LAB_00afa6e4;
      puVar12 = *(undefined8 **)(lVar8 + 0x130);
      if (puVar12 == (undefined8 *)0x0) {
        if (lVar10 != 0 || lVar11 != 0) {
          if (param_1 == 0) {
            return 0;
          }
          *(int *)(param_1 + 0xac) = iVar3;
          *(undefined4 *)(param_1 + 0xb0) = 0x2e;
          *(long *)(param_1 + 0xb8) = lVar8;
          uVar6 = (**(code **)(param_1 + 0x38))(0,param_1);
          uVar9 = uVar6 & 0xffffffff;
          uVar5 = (uint)uVar6;
joined_r0x00afa57c:
          if (uVar5 == 0) {
            return uVar6;
          }
          goto LAB_00afa464;
        }
        lVar10 = 0;
        lVar11 = 0;
        iVar3 = iVar3 + 1;
      }
      else {
        iVar4 = FUN_00af94bc(*puVar12);
        if ((iVar4 == 0) || (iVar4 = FUN_00af94bc(puVar12[1]), iVar4 == 0)) {
          if (param_1 == 0) {
            return 0;
          }
          *(int *)(param_1 + 0xac) = iVar3;
          *(undefined4 *)(param_1 + 0xb0) = 0x29;
          *(long *)(param_1 + 0xb8) = lVar8;
          uVar6 = (**(code **)(param_1 + 0x38))(0,param_1);
          uVar9 = uVar6 & 0xffffffff;
          if ((int)uVar6 == 0) {
            return uVar6;
          }
        }
        puVar12 = *(undefined8 **)(lVar8 + 0x130);
        piVar7 = (int *)*puVar12;
        if ((lVar10 != 0) && (piVar7 == (int *)0x0)) {
          if (param_1 == 0) {
            return 0;
          }
          *(int *)(param_1 + 0xac) = iVar3;
          *(undefined4 *)(param_1 + 0xb0) = 0x2e;
          *(long *)(param_1 + 0xb8) = lVar8;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
          puVar12 = *(undefined8 **)(lVar8 + 0x130);
          uVar9 = uVar9 & 0xffffffff;
          lVar10 = 0;
          bVar1 = false;
          piVar7 = (int *)*puVar12;
        }
        if ((piVar7 != (int *)0x0) && (*piVar7 == 1)) {
          if (bVar1) {
LAB_00afa548:
            lVar10 = *(long *)(piVar7 + 2);
          }
          else {
            iVar4 = FUN_00afa190(*(undefined8 *)(piVar7 + 2),lVar10);
            if (iVar4 != 0) {
              puVar12 = *(undefined8 **)(lVar8 + 0x130);
              piVar7 = (int *)*puVar12;
              goto LAB_00afa548;
            }
            if (param_1 == 0) {
              return 0;
            }
            *(int *)(param_1 + 0xac) = iVar3;
            *(undefined4 *)(param_1 + 0xb0) = 0x2e;
            *(long *)(param_1 + 0xb8) = lVar8;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
            puVar12 = *(undefined8 **)(lVar8 + 0x130);
            uVar9 = uVar9 & 0xffffffff;
          }
          bVar1 = false;
        }
        piVar7 = (int *)puVar12[1];
        if ((lVar11 != 0) && (piVar7 == (int *)0x0)) {
          if (param_1 == 0) {
            return 0;
          }
          *(int *)(param_1 + 0xac) = iVar3;
          *(undefined4 *)(param_1 + 0xb0) = 0x2e;
          *(long *)(param_1 + 0xb8) = lVar8;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
          uVar9 = uVar9 & 0xffffffff;
          lVar11 = 0;
          bVar2 = false;
          piVar7 = *(int **)(*(long *)(lVar8 + 0x130) + 8);
        }
        if ((piVar7 == (int *)0x0) || (*piVar7 != 1)) {
LAB_00afa464:
          iVar3 = iVar3 + 1;
        }
        else {
          if (!bVar2) {
            iVar4 = FUN_00afa190(*(undefined8 *)(piVar7 + 2),lVar11);
            if (iVar4 == 0) {
              if (param_1 == 0) {
                return 0;
              }
              *(int *)(param_1 + 0xac) = iVar3;
              *(undefined4 *)(param_1 + 0xb0) = 0x2e;
              *(long *)(param_1 + 0xb8) = lVar8;
              uVar5 = (**(code **)(param_1 + 0x38))(0,param_1);
              uVar9 = (ulong)uVar5;
              bVar2 = false;
              uVar6 = 0;
              goto joined_r0x00afa57c;
            }
            piVar7 = *(int **)(*(long *)(lVar8 + 0x130) + 8);
          }
          lVar11 = *(long *)(piVar7 + 2);
          bVar2 = false;
          iVar3 = iVar3 + 1;
        }
      }
    }
    if (lVar8 != 0) {
      puVar12 = *(undefined8 **)(lVar8 + 0x130);
      if (puVar12 != (undefined8 *)0x0) {
        if (((int *)*puVar12 == (int *)0x0) || (*(int *)*puVar12 != 0)) {
          piVar7 = (int *)puVar12[1];
        }
        else {
          if (param_1 == 0) {
            return 0;
          }
          *(int *)(param_1 + 0xac) = iVar3;
          *(undefined4 *)(param_1 + 0xb0) = 0x2e;
          *(long *)(param_1 + 0xb8) = lVar8;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          uVar5 = (uint)uVar9;
          if (uVar5 == 0) {
            return uVar9;
          }
          uVar9 = uVar9 & 0xffffffff;
          piVar7 = *(int **)(*(long *)(lVar8 + 0x130) + 8);
        }
        if (piVar7 != (int *)0x0) {
          if (*piVar7 == 0) {
            uVar5 = 0;
          }
          if (*piVar7 != 0) {
            return (ulong)uVar5;
          }
          if (param_1 == 0) {
            return (ulong)uVar5;
          }
          *(int *)(param_1 + 0xac) = iVar3;
          *(undefined4 *)(param_1 + 0xb0) = 0x2e;
          *(long *)(param_1 + 0xb8) = lVar8;
                    /* WARNING: Could not recover jumptable at 0x00afa6e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          return uVar9;
        }
      }
      return uVar9;
    }
  }
LAB_00afa6e4:
  if (param_1 == 0) {
    return 0;
  }
LAB_00afa6e8:
  *(undefined4 *)(param_1 + 0xb0) = 1;
  return 0;
}

