/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bea2fc
 */

int FUN_00bea2fc(long *param_1,long *param_2,uint *param_3,long *param_4,int param_5)

{
  byte bVar1;
  bool bVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  long *plVar7;
  long *plVar8;
  long *plVar9;
  ulong uVar10;
  ulong uVar11;
  
  plVar7 = (long *)*param_1;
  if (plVar7 == (long *)0x0) {
LAB_00bea380:
    bVar2 = true;
    bVar3 = true;
    if (param_2 != (long *)0x0) goto LAB_00bea388;
LAB_00bea370:
    if (bVar3) {
LAB_00bea3d8:
      iVar5 = 0;
      uVar4 = 6;
      goto LAB_00bea410;
    }
    plVar7 = (long *)0x0;
  }
  else {
    if (plVar7[3] == plVar7[4]) {
      iVar5 = (**(code **)(*plVar7 + 0x48))();
      if (iVar5 == -1) {
        *param_1 = 0;
        goto LAB_00bea380;
      }
      bVar3 = *param_1 == 0;
    }
    else {
      bVar3 = false;
    }
    bVar2 = bVar3;
    if (param_2 == (long *)0x0) goto LAB_00bea370;
LAB_00bea388:
    if (param_2[3] != param_2[4]) {
      plVar7 = param_2;
      if (bVar2 != false) goto LAB_00bea398;
      goto LAB_00bea3d8;
    }
    iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
    plVar7 = (long *)0x0;
    if (iVar5 != -1) {
      plVar7 = param_2;
    }
    if (bVar2 == (iVar5 == -1)) goto LAB_00bea3d8;
  }
LAB_00bea398:
  plVar8 = (long *)*param_1;
  if ((byte *)plVar8[3] == (byte *)plVar8[4]) {
    uVar10 = (**(code **)(*plVar8 + 0x48))();
    uVar11 = uVar10 & 0xffffffff;
    if (((uint)uVar10 >> 7 & 1) == 0) goto LAB_00bea3f8;
  }
  else {
    bVar1 = *(byte *)plVar8[3];
    uVar11 = (ulong)bVar1;
    if (-1 < (char)bVar1) {
LAB_00bea3f8:
      if (((uint)*(undefined8 *)(param_4[2] + (uVar11 & 0xff) * 8) >> 6 & 1) != 0) {
        uVar4 = (**(code **)(*param_4 + 0x48))(param_4,uVar11,0);
        plVar8 = (long *)*param_1;
        uVar4 = uVar4 & 0xff;
        if (plVar8[3] == plVar8[4]) {
          (**(code **)(*plVar8 + 0x50))();
        }
        else {
          plVar8[3] = plVar8[3] + 1;
        }
        do {
          plVar9 = (long *)*param_1;
          plVar8 = plVar7;
          if (plVar9 == (long *)0x0) {
LAB_00bea4f4:
            bVar3 = true;
            if (plVar7 != (long *)0x0) goto LAB_00bea4fc;
LAB_00bea4e8:
            bVar2 = true;
          }
          else {
            if (plVar9[3] == plVar9[4]) {
              iVar5 = (**(code **)(*plVar9 + 0x48))();
              if (iVar5 == -1) {
                *param_1 = 0;
                goto LAB_00bea4f4;
              }
              bVar3 = *param_1 == 0;
            }
            else {
              bVar3 = false;
            }
            if (plVar7 == (long *)0x0) goto LAB_00bea4e8;
LAB_00bea4fc:
            if (plVar7[3] == plVar7[4]) {
              iVar5 = (**(code **)(*plVar7 + 0x48))(plVar7);
              bVar2 = iVar5 == -1;
              plVar8 = (long *)0x0;
              if (!bVar2) {
                plVar8 = plVar7;
              }
            }
            else {
              bVar2 = false;
            }
          }
          plVar7 = (long *)*param_1;
          iVar5 = uVar4 - 0x30;
          if ((bVar3 == bVar2) || (param_5 < 2)) {
            if (plVar7 == (long *)0x0) {
LAB_00bea5f4:
              bVar3 = true;
            }
            else if (plVar7[3] == plVar7[4]) {
              iVar6 = (**(code **)(*plVar7 + 0x48))();
              if (iVar6 == -1) {
                *param_1 = 0;
                goto LAB_00bea5f4;
              }
              bVar3 = *param_1 == 0;
            }
            else {
              bVar3 = false;
            }
            if (plVar8 == (long *)0x0) {
              if (bVar3 == false) {
                return iVar5;
              }
            }
            else if (plVar8[3] == plVar8[4]) {
              iVar6 = (**(code **)(*plVar8 + 0x48))(plVar8);
              if (bVar3 != (iVar6 == -1)) {
                return iVar5;
              }
            }
            else if (bVar3) {
              return iVar5;
            }
            uVar4 = 2;
            goto LAB_00bea410;
          }
          if ((byte *)plVar7[3] == (byte *)plVar7[4]) {
            uVar10 = (**(code **)(*plVar7 + 0x48))();
            uVar11 = uVar10 & 0xffffffff;
            if (((uint)uVar10 >> 7 & 1) != 0) {
              return iVar5;
            }
          }
          else {
            bVar1 = *(byte *)plVar7[3];
            uVar11 = (ulong)bVar1;
            if ((char)bVar1 < '\0') {
              return iVar5;
            }
          }
          if (((uint)*(undefined8 *)(param_4[2] + (uVar11 & 0xff) * 8) >> 6 & 1) == 0) {
            return iVar5;
          }
          uVar4 = (**(code **)(*param_4 + 0x48))(param_4,uVar11,0);
          plVar7 = (long *)*param_1;
          if (plVar7[3] == plVar7[4]) {
            (**(code **)(*plVar7 + 0x50))(plVar7);
          }
          else {
            plVar7[3] = plVar7[3] + 1;
          }
          param_5 = param_5 + -1;
          uVar4 = iVar5 * 10 + (uVar4 & 0xff);
          plVar7 = plVar8;
        } while( true );
      }
    }
  }
  iVar5 = 0;
  uVar4 = 4;
LAB_00bea410:
  *param_3 = *param_3 | uVar4;
  return iVar5;
}

