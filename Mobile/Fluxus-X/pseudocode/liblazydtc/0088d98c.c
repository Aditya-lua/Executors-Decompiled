/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088d98c
 */

void FUN_0088d98c(undefined8 *param_1,long param_2,int *param_3,undefined4 param_4)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 uVar5;
  ulong uVar6;
  double dVar7;
  
  iVar1 = *param_3;
  if (iVar1 < 4) {
    if (iVar1 == 1) {
      uVar3 = *param_1;
      uVar4 = 2;
      uVar5 = 0;
LAB_0088daf8:
      FUN_00875b54(uVar3,uVar4,param_4,uVar5,0);
      return;
    }
    if (iVar1 == 2) {
      uVar3 = *param_1;
      uVar5 = (undefined1)param_3[2];
      uVar4 = 3;
      goto LAB_0088daf8;
    }
    if (iVar1 != 3) {
      return;
    }
    dVar7 = *(double *)(param_3 + 2);
    if ((((-32768.0 <= dVar7) && (dVar7 <= 32767.0)) &&
        (uVar6 = (ulong)(uint)(int)dVar7, dVar7 == (double)(int)dVar7)) &&
       ((dVar7 != 0.0 || (-1 < (long)dVar7)))) {
      uVar3 = *param_1;
      uVar4 = 4;
      goto LAB_0088daa0;
    }
    uVar2 = FUN_00874f18(*param_1);
    iVar1 = (int)uVar2;
  }
  else if (iVar1 == 4) {
    uVar2 = FUN_00874f8c(param_3[2],param_3[3],param_3[4],param_3[5],*param_1);
    iVar1 = (int)uVar2;
  }
  else if (iVar1 == 5) {
    uVar2 = FUN_00875004(*(undefined8 *)(param_3 + 2),*(undefined8 *)(param_3 + 4),
                         *(undefined8 *)(param_3 + 6),*(undefined8 *)(param_3 + 8),*param_1);
    iVar1 = (int)uVar2;
  }
  else {
    if (iVar1 != 6) {
      return;
    }
    uVar2 = FUN_00875070(*param_1,*(undefined8 *)(param_3 + 2),param_3[1]);
    iVar1 = (int)uVar2;
  }
  if (iVar1 < 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
  }
  uVar6 = uVar2 & 0xffffffff;
  uVar3 = *param_1;
  if ((uVar2 >> 0xf & 0x1ffff) != 0) {
    FUN_00875cac(uVar3,0x42,param_4,0);
    FUN_00875d18(*param_1,uVar6);
    return;
  }
  uVar4 = 5;
LAB_0088daa0:
  FUN_00875cac(uVar3,uVar4,param_4,uVar6);
  return;
}

