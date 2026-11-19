/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092b338
 */

void curl_multi_remove_handle(int *param_1,int *param_2)

{
  long *plVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  int *piVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar5 = 1;
    goto LAB_0092b3ac;
  }
  if ((param_2 != (int *)0x0) && (*param_2 == -0x3f212453)) {
    if (*(int **)(param_2 + 0x30) == (int *)0x0) {
      uVar5 = 0;
      goto LAB_0092b3ac;
    }
    if (*(int **)(param_2 + 0x30) == param_1) {
      if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) == 0) {
        uVar2 = param_2[0x16];
        if (uVar2 < 0x10) {
          param_1[7] = param_1[7] + -1;
        }
        if ((*(long *)(param_2 + 8) != 0) &&
           ((5 < uVar2 - 10 || (FUN_00908c4c(*(long *)(param_2 + 8),2), *(long *)(param_2 + 8) != 0)
            ))) {
          FUN_0092b674(param_2,param_2[0x17],uVar2 < 0x10);
        }
        FUN_0092ba18(param_2);
        if (*(long *)(param_2 + 10) != 0) {
          if (param_2[0x16] == 1) {
            piVar6 = param_1 + 0x10;
          }
          else {
            piVar6 = param_1 + 0x18;
          }
          FUN_00925d80(piVar6,param_2 + 10,0);
        }
        if ((param_2[0x16] | 0x10U) != 0x11) {
          plVar7 = (long *)(param_2 + 4);
          lVar9 = *plVar7;
          lVar8 = *(long *)(param_2 + 6);
          if (lVar8 == 0) {
            *(long *)(param_1 + 2) = lVar9;
          }
          else {
            *(long *)(lVar8 + 0x10) = lVar9;
            lVar9 = *plVar7;
          }
          plVar1 = (long *)(param_1 + 4);
          if (lVar9 != 0) {
            plVar1 = (long *)(lVar9 + 0x18);
          }
          *plVar1 = lVar8;
          *plVar7 = 0;
          param_2[6] = 0;
          param_2[7] = 0;
        }
        if (param_2[0x2e] == 1) {
          param_2[0x2c] = 0;
          param_2[0x2d] = 0;
          param_2[0x2e] = 0;
        }
        FUN_0092f788(param_2 + 0x4c8);
        param_2[0x16] = 0x10;
        FUN_0092bcf8(param_2,&local_58);
        iVar4 = FUN_0092dfc0(param_1,param_2,&local_58,param_2 + 0x24);
        if (iVar4 == 0) {
          *(undefined8 *)(param_2 + 0x2a) = uStack_40;
          *(undefined8 *)(param_2 + 0x28) = local_48;
          *(undefined8 *)(param_2 + 0x26) = uStack_50;
          *(long *)(param_2 + 0x24) = local_58;
        }
        lVar8 = *(long *)(param_2 + 8);
        if (lVar8 != 0) {
          FUN_00907e2c(lVar8,param_2);
          FUN_00925d80(lVar8 + 0x3d0,param_2 + 0x10,0);
        }
        param_2[8] = 0;
        param_2[9] = 0;
        if ((((*(char *)((long)param_2 + 0xa81) != '\0') && (*(long *)(param_2 + 0x32) == 0)) &&
            (iVar4 = FUN_00908b60(param_2,&local_58), iVar4 != -1)) && (local_58 != 0)) {
          FUN_0090fe90(param_2,local_58,1);
          FUN_00946cfc(param_2,local_58,1);
        }
        if (*(long *)(param_2 + 0x314) != -1) {
          FUN_00910008(param_2,*(undefined8 *)(param_2 + 0x30e),0,&LAB_0092bafc);
        }
        param_2[0x30e] = 0;
        param_2[0x30f] = 0;
        param_2[0x30] = 0;
        param_2[0x31] = 0;
        for (plVar7 = *(long **)(param_1 + 8); plVar7 != (long *)0x0; plVar7 = (long *)plVar7[2]) {
          if (*(int **)(*plVar7 + 0x20) == param_2) {
            FUN_00925d80(param_1 + 8,plVar7,0);
            break;
          }
        }
        param_1[6] = param_1[6] + -1;
        if (*(long **)(param_1 + 0x10) != (long *)0x0) {
          lVar8 = **(long **)(param_1 + 0x10);
          *(undefined8 *)(lVar8 + 0x10) = 0;
          if (*(long *)(param_1 + 2) == 0) {
            *(undefined8 *)(lVar8 + 0x18) = 0;
            *(long *)(param_1 + 2) = lVar8;
          }
          else {
            lVar9 = *(long *)(param_1 + 4);
            *(long *)(lVar9 + 0x10) = lVar8;
            *(long *)(lVar8 + 0x18) = lVar9;
          }
          *(long *)(param_1 + 4) = lVar8;
          if (*(int *)(lVar8 + 0x58) != 3) {
            *(undefined4 *)(lVar8 + 0x58) = 3;
            FUN_009425cc(lVar8);
          }
          FUN_00925d80(param_1 + 0x10,lVar8 + 0x28,0);
          FUN_0092aff8(lVar8,0,8);
        }
        uVar5 = FUN_0092b1f4(param_1);
      }
      else {
        uVar5 = 8;
      }
      goto LAB_0092b3ac;
    }
  }
  uVar5 = 2;
LAB_0092b3ac:
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

