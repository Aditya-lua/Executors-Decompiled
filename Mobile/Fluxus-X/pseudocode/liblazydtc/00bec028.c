/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bec028
 */

int FUN_00bec028(long *param_1,long *param_2,uint *param_3,long *param_4,int param_5)

{
  bool bVar1;
  bool bVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  int iVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  
  plVar7 = (long *)*param_1;
  if (plVar7 == (long *)0x0) {
LAB_00bec0ac:
    bVar1 = true;
    bVar2 = true;
    if (param_2 != (long *)0x0) goto LAB_00bec0b4;
LAB_00bec088:
    if (bVar2) goto LAB_00bec104;
    plVar7 = (long *)0x0;
  }
  else {
    if ((int *)plVar7[3] == (int *)plVar7[4]) {
      iVar4 = (**(code **)(*plVar7 + 0x48))();
    }
    else {
      iVar4 = *(int *)plVar7[3];
    }
    if (iVar4 == -1) {
      *param_1 = 0;
      goto LAB_00bec0ac;
    }
    bVar1 = *param_1 == 0;
    bVar2 = bVar1;
    if (param_2 == (long *)0x0) goto LAB_00bec088;
LAB_00bec0b4:
    if ((int *)param_2[3] == (int *)param_2[4]) {
      iVar4 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar4 = *(int *)param_2[3];
    }
    plVar7 = (long *)0x0;
    if (iVar4 != -1) {
      plVar7 = param_2;
    }
    if (bVar1 == (iVar4 == -1)) {
LAB_00bec104:
      iVar4 = 0;
      uVar3 = 6;
      goto LAB_00bec358;
    }
  }
  plVar8 = (long *)*param_1;
  if ((undefined4 *)plVar8[3] == (undefined4 *)plVar8[4]) {
    uVar5 = (**(code **)(*plVar8 + 0x48))();
  }
  else {
    uVar5 = *(undefined4 *)plVar8[3];
  }
  uVar9 = (**(code **)(*param_4 + 0x18))(param_4,0x40,uVar5);
  if ((uVar9 & 1) != 0) {
    uVar3 = (**(code **)(*param_4 + 0x68))(param_4,uVar5,0);
    plVar8 = (long *)*param_1;
    uVar3 = uVar3 & 0xff;
    if (plVar8[3] == plVar8[4]) {
      (**(code **)(*plVar8 + 0x50))();
    }
    else {
      plVar8[3] = plVar8[3] + 4;
    }
    do {
      plVar8 = (long *)*param_1;
      if (plVar8 == (long *)0x0) {
LAB_00bec204:
        bVar2 = true;
        if (plVar7 != (long *)0x0) goto LAB_00bec20c;
LAB_00bec1e4:
        bVar1 = true;
        plVar8 = plVar7;
      }
      else {
        if ((int *)plVar8[3] == (int *)plVar8[4]) {
          iVar4 = (**(code **)(*plVar8 + 0x48))();
        }
        else {
          iVar4 = *(int *)plVar8[3];
        }
        if (iVar4 == -1) {
          *param_1 = 0;
          goto LAB_00bec204;
        }
        bVar2 = *param_1 == 0;
        if (plVar7 == (long *)0x0) goto LAB_00bec1e4;
LAB_00bec20c:
        if ((int *)plVar7[3] == (int *)plVar7[4]) {
          iVar4 = (**(code **)(*plVar7 + 0x48))(plVar7);
        }
        else {
          iVar4 = *(int *)plVar7[3];
        }
        bVar1 = iVar4 == -1;
        plVar8 = (long *)0x0;
        if (!bVar1) {
          plVar8 = plVar7;
        }
      }
      plVar7 = (long *)*param_1;
      iVar4 = uVar3 - 0x30;
      if ((bVar2 == bVar1) || (param_5 < 2)) {
        if (plVar7 == (long *)0x0) {
LAB_00bec318:
          bVar2 = true;
          if (plVar8 != (long *)0x0) goto LAB_00bec320;
LAB_00bec2f8:
          if (!bVar2) {
            return iVar4;
          }
        }
        else {
          if ((int *)plVar7[3] == (int *)plVar7[4]) {
            iVar6 = (**(code **)(*plVar7 + 0x48))();
          }
          else {
            iVar6 = *(int *)plVar7[3];
          }
          if (iVar6 == -1) {
            *param_1 = 0;
            goto LAB_00bec318;
          }
          bVar2 = *param_1 == 0;
          if (plVar8 == (long *)0x0) goto LAB_00bec2f8;
LAB_00bec320:
          if ((int *)plVar8[3] == (int *)plVar8[4]) {
            iVar6 = (**(code **)(*plVar8 + 0x48))(plVar8);
          }
          else {
            iVar6 = *(int *)plVar8[3];
          }
          if (bVar2 != (iVar6 == -1)) {
            return iVar4;
          }
        }
        uVar3 = 2;
        goto LAB_00bec358;
      }
      if ((undefined4 *)plVar7[3] == (undefined4 *)plVar7[4]) {
        uVar5 = (**(code **)(*plVar7 + 0x48))();
      }
      else {
        uVar5 = *(undefined4 *)plVar7[3];
      }
      uVar9 = (**(code **)(*param_4 + 0x18))(param_4,0x40,uVar5);
      if ((uVar9 & 1) == 0) {
        return iVar4;
      }
      uVar3 = (**(code **)(*param_4 + 0x68))(param_4,uVar5,0);
      plVar7 = (long *)*param_1;
      if (plVar7[3] == plVar7[4]) {
        (**(code **)(*plVar7 + 0x50))(plVar7);
      }
      else {
        plVar7[3] = plVar7[3] + 4;
      }
      param_5 = param_5 + -1;
      uVar3 = iVar4 * 10 + (uVar3 & 0xff);
      plVar7 = plVar8;
    } while( true );
  }
  iVar4 = 0;
  uVar3 = 4;
LAB_00bec358:
  *param_3 = *param_3 | uVar3;
  return iVar4;
}

