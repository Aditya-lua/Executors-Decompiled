/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cbdc8
 */

bool FUN_008cbdc8(long param_1,double *param_2,double *param_3)

{
  int iVar1;
  bool bVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  float fVar6;
  double dVar7;
  float fVar8;
  double dVar9;
  
  fVar6 = *(float *)((long)param_2 + 0xc);
  if ((int)fVar6 < 4) {
    if ((int)fVar6 < 2) {
      if (fVar6 == 0.0) {
        return true;
      }
      if (fVar6 == 1.4013e-45) {
        fVar6 = *(float *)param_2;
        fVar8 = *(float *)param_3;
LAB_008cbebc:
        return fVar6 == fVar8;
      }
    }
    else {
      if (fVar6 == 2.8026e-45) {
        if (*param_2 == *param_3) {
          fVar6 = *(float *)(param_2 + 1);
          fVar8 = *(float *)(param_3 + 1);
          goto LAB_008cbebc;
        }
        goto LAB_008cbf78;
      }
      if (fVar6 == 4.2039e-45) {
        return *param_2 == *param_3;
      }
    }
LAB_008cbe98:
    dVar7 = *param_2;
    dVar9 = *param_3;
LAB_008cbf38:
    bVar2 = dVar7 == dVar9;
  }
  else {
    if ((int)fVar6 < 8) {
      if (fVar6 != 5.60519e-45) {
        if (fVar6 != 8.40779e-45) goto LAB_008cbe98;
        uVar4 = *(undefined8 *)((long)*param_2 + 0x10);
        uVar5 = *(undefined8 *)((long)*param_3 + 0x10);
        goto LAB_008cbee0;
      }
      if ((*(float *)param_2 == *(float *)param_3) &&
         (*(float *)((long)param_2 + 4) == *(float *)((long)param_3 + 4))) {
        return *(float *)(param_2 + 1) == *(float *)(param_3 + 1);
      }
    }
    else {
      if (fVar6 == 1.12104e-44) {
        uVar4 = *(undefined8 *)((long)*param_2 + 8);
        uVar5 = *(undefined8 *)((long)*param_3 + 8);
      }
      else {
        if ((fVar6 == 1.54143e-44) || (fVar6 != 1.68156e-44)) goto LAB_008cbe98;
        uVar4 = *(undefined8 *)(*(long *)((long)*param_2 + 0x10) + 0x50);
        uVar5 = *(undefined8 *)(*(long *)((long)*param_3 + 0x10) + 0x50);
      }
LAB_008cbee0:
      lVar3 = FUN_008cbf8c(param_1,uVar4,uVar5);
      if (lVar3 == 0) {
        dVar7 = *param_2;
        dVar9 = *param_3;
        goto LAB_008cbf38;
      }
      FUN_008cb070(param_1,*(undefined8 *)(param_1 + 0x68),lVar3,param_2,param_3);
      iVar1 = (*(int **)(param_1 + 0x68))[3];
      if (iVar1 != 0) {
        if (iVar1 == 1) {
          return **(int **)(param_1 + 0x68) != 0;
        }
        return true;
      }
    }
LAB_008cbf78:
    bVar2 = false;
  }
  return bVar2;
}

