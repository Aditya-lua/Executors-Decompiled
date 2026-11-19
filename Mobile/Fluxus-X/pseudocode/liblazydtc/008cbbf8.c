/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cbbf8
 */

bool FUN_008cbbf8(long param_1,double *param_2,double *param_3)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  double *pdVar9;
  undefined8 uVar10;
  uint uVar11;
  float fVar12;
  double dVar13;
  float fVar14;
  double dVar15;
  undefined1 auVar16 [16];
  
  fVar12 = *(float *)((long)param_2 + 0xc);
  if (fVar12 == *(float *)((long)param_3 + 0xc)) {
    if (fVar12 == 7.00649e-45) {
      dVar13 = *param_2;
      dVar15 = *param_3;
      if (dVar13 == dVar15) {
        uVar11 = 0;
      }
      else {
        uVar11 = (uint)*(byte *)((long)dVar13 + 0x18) - (uint)*(byte *)((long)dVar15 + 0x18);
        if (uVar11 == 0) {
          uVar1 = *(uint *)((long)dVar13 + 0x14);
          uVar2 = *(uint *)((long)dVar15 + 0x14);
          uVar4 = uVar1;
          if (uVar2 <= uVar1) {
            uVar4 = uVar2;
          }
          uVar11 = (uint)(uVar2 < uVar1);
          if (uVar2 > uVar1) {
            uVar11 = 0xffffffff;
          }
          uVar4 = memcmp((byte *)((long)dVar13 + 0x18),(byte *)((long)dVar15 + 0x18),(ulong)uVar4);
          if (uVar4 != 0) {
            uVar11 = uVar4;
          }
        }
      }
      return (int)uVar11 < 1;
    }
    if (fVar12 == 4.2039e-45) {
      return *param_2 <= *param_3;
    }
    lVar6 = FUN_008be028(param_1,param_2,0x11);
    if (*(int *)(lVar6 + 0xc) != 0) {
      uVar7 = FUN_008be028(param_1,param_3,0x11);
      iVar5 = FUN_008b9214(lVar6,uVar7);
      if (iVar5 != 0) {
        FUN_008cb070(param_1,*(undefined8 *)(param_1 + 0x68),lVar6,param_2,param_3);
        iVar5 = (*(int **)(param_1 + 0x68))[3];
        if (iVar5 == 0) {
          return false;
        }
        if (iVar5 == 1) {
          return **(int **)(param_1 + 0x68) != 0;
        }
        return true;
      }
    }
    lVar6 = FUN_008be028(param_1,param_3,0x10);
    if (*(int *)(lVar6 + 0xc) != 0) {
      uVar7 = FUN_008be028(param_1,param_2,0x10);
      iVar5 = FUN_008b9214(lVar6,uVar7);
      if (iVar5 != 0) {
        FUN_008cb070(param_1,*(undefined8 *)(param_1 + 0x68),lVar6,param_3,param_2);
        iVar5 = (*(int **)(param_1 + 0x68))[3];
        if (iVar5 == 0) {
          return true;
        }
        if (iVar5 == 1) {
          return **(int **)(param_1 + 0x68) == 0;
        }
        return false;
      }
    }
  }
  auVar16 = FUN_008b3b74(param_1,param_2,param_3,0x11);
  pdVar9 = auVar16._8_8_;
  lVar6 = auVar16._0_8_;
  fVar12 = *(float *)((long)pdVar9 + 0xc);
  if ((int)fVar12 < 4) {
    if ((int)fVar12 < 2) {
      if (fVar12 == 0.0) {
        return true;
      }
      if (fVar12 == 1.4013e-45) {
        fVar12 = *(float *)pdVar9;
        fVar14 = *(float *)param_3;
LAB_008cbebc:
        return fVar12 == fVar14;
      }
    }
    else {
      if (fVar12 == 2.8026e-45) {
        if (*pdVar9 == *param_3) {
          fVar12 = *(float *)(pdVar9 + 1);
          fVar14 = *(float *)(param_3 + 1);
          goto LAB_008cbebc;
        }
        goto LAB_008cbf78;
      }
      if (fVar12 == 4.2039e-45) {
        return *pdVar9 == *param_3;
      }
    }
LAB_008cbe98:
    dVar13 = *pdVar9;
    dVar15 = *param_3;
LAB_008cbf38:
    bVar3 = dVar13 == dVar15;
  }
  else {
    if ((int)fVar12 < 8) {
      if (fVar12 != 5.60519e-45) {
        if (fVar12 != 8.40779e-45) goto LAB_008cbe98;
        uVar7 = *(undefined8 *)((long)*pdVar9 + 0x10);
        uVar10 = *(undefined8 *)((long)*param_3 + 0x10);
        goto LAB_008cbee0;
      }
      if ((*(float *)pdVar9 == *(float *)param_3) &&
         (*(float *)((long)pdVar9 + 4) == *(float *)((long)param_3 + 4))) {
        return *(float *)(pdVar9 + 1) == *(float *)(param_3 + 1);
      }
    }
    else {
      if (fVar12 == 1.12104e-44) {
        uVar7 = *(undefined8 *)((long)*pdVar9 + 8);
        uVar10 = *(undefined8 *)((long)*param_3 + 8);
      }
      else {
        if ((fVar12 == 1.54143e-44) || (fVar12 != 1.68156e-44)) goto LAB_008cbe98;
        uVar7 = *(undefined8 *)(*(long *)((long)*pdVar9 + 0x10) + 0x50);
        uVar10 = *(undefined8 *)(*(long *)((long)*param_3 + 0x10) + 0x50);
      }
LAB_008cbee0:
      lVar8 = FUN_008cbf8c(lVar6,uVar7,uVar10);
      if (lVar8 == 0) {
        dVar13 = *pdVar9;
        dVar15 = *param_3;
        goto LAB_008cbf38;
      }
      FUN_008cb070(lVar6,*(undefined8 *)(lVar6 + 0x68),lVar8,pdVar9,param_3);
      iVar5 = (*(int **)(lVar6 + 0x68))[3];
      if (iVar5 != 0) {
        if (iVar5 == 1) {
          return **(int **)(lVar6 + 0x68) != 0;
        }
        return true;
      }
    }
LAB_008cbf78:
    bVar3 = false;
  }
  return bVar3;
}

