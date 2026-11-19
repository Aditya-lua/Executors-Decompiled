/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cbab8
 */

/* WARNING: Removing unreachable block (ram,0x008cbbc4) */

ulong FUN_008cbab8(undefined8 param_1,double *param_2,double *param_3)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  float extraout_w8;
  uint uVar11;
  float fVar12;
  double dVar13;
  float fVar14;
  double dVar15;
  undefined1 auVar16 [16];
  
  auVar16._8_8_ = param_2;
  auVar16._0_8_ = param_1;
  fVar12 = *(float *)((long)param_2 + 0xc);
  if (fVar12 == *(float *)((long)param_3 + 0xc)) {
    if (fVar12 == 4.2039e-45) {
      return (ulong)(*param_2 < *param_3);
    }
  }
  else {
    auVar16 = FUN_008b3b74();
    fVar12 = extraout_w8;
  }
  puVar9 = auVar16._8_8_;
  lVar5 = auVar16._0_8_;
  if (fVar12 == 7.00649e-45) {
    uVar6 = FUN_008cba50(*puVar9,*param_3);
    return uVar6 >> 0x1f & 1;
  }
  lVar7 = FUN_008be028(lVar5,puVar9,0x10);
  if (*(int *)(lVar7 + 0xc) != 0) {
    uVar8 = FUN_008be028(lVar5,param_3,0x10);
    iVar3 = FUN_008b9214(lVar7,uVar8);
    if (iVar3 != 0) {
      FUN_008cb070(lVar5,*(undefined8 *)(lVar5 + 0x68),lVar7,puVar9,param_3);
      uVar11 = (*(int **)(lVar5 + 0x68))[3];
      uVar6 = (ulong)uVar11;
      if (uVar11 != 0) {
        if (uVar11 == 1) {
          uVar6 = (ulong)(**(int **)(lVar5 + 0x68) != 0);
        }
        else {
          uVar6 = 1;
        }
      }
      return uVar6;
    }
  }
  auVar16 = FUN_008b3b74(lVar5,puVar9,param_3,0x10);
  auVar16._8_8_ = auVar16._8_8_;
  lVar5 = auVar16._0_8_;
  fVar12 = *(float *)((long)auVar16._8_8_ + 0xc);
  if (fVar12 == *(float *)((long)param_3 + 0xc)) {
    if (fVar12 == 7.00649e-45) {
      dVar13 = *auVar16._8_8_;
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
      return (ulong)((int)uVar11 < 1);
    }
    if (fVar12 == 4.2039e-45) {
      return (ulong)(*auVar16._8_8_ <= *param_3);
    }
    lVar7 = FUN_008be028(lVar5,auVar16._8_8_,0x11);
    if (*(int *)(lVar7 + 0xc) != 0) {
      uVar8 = FUN_008be028(lVar5,param_3,0x11);
      iVar3 = FUN_008b9214(lVar7,uVar8);
      if (iVar3 != 0) {
        FUN_008cb070(lVar5,*(undefined8 *)(lVar5 + 0x68),lVar7,auVar16._8_8_,param_3);
        iVar3 = (*(int **)(lVar5 + 0x68))[3];
        if (iVar3 == 0) {
          return 0;
        }
        if (iVar3 == 1) {
          return (ulong)(**(int **)(lVar5 + 0x68) != 0);
        }
        return 1;
      }
    }
    lVar7 = FUN_008be028(lVar5,param_3,0x10);
    if (*(int *)(lVar7 + 0xc) != 0) {
      uVar8 = FUN_008be028(lVar5,auVar16._8_8_,0x10);
      iVar3 = FUN_008b9214(lVar7,uVar8);
      if (iVar3 != 0) {
        FUN_008cb070(lVar5,*(undefined8 *)(lVar5 + 0x68),lVar7,param_3,auVar16._8_8_);
        iVar3 = (*(int **)(lVar5 + 0x68))[3];
        if (iVar3 == 0) {
          return 1;
        }
        if (iVar3 == 1) {
          return (ulong)(**(int **)(lVar5 + 0x68) == 0);
        }
        return 0;
      }
    }
  }
  auVar16 = FUN_008b3b74(lVar5,auVar16._8_8_,param_3,0x11);
  auVar16._8_8_ = auVar16._8_8_;
  lVar5 = auVar16._0_8_;
  fVar12 = *(float *)((long)auVar16._8_8_ + 0xc);
  if ((int)fVar12 < 4) {
    if ((int)fVar12 < 2) {
      if (fVar12 == 0.0) {
        return 1;
      }
      if (fVar12 == 1.4013e-45) {
        fVar12 = *(float *)auVar16._8_8_;
        fVar14 = *(float *)param_3;
LAB_008cbebc:
        return (ulong)(fVar12 == fVar14);
      }
    }
    else {
      if (fVar12 == 2.8026e-45) {
        if (*auVar16._8_8_ == *param_3) {
          fVar12 = *(float *)(auVar16._8_8_ + 1);
          fVar14 = *(float *)(param_3 + 1);
          goto LAB_008cbebc;
        }
        goto LAB_008cbf78;
      }
      if (fVar12 == 4.2039e-45) {
        return (ulong)(*auVar16._8_8_ == *param_3);
      }
    }
LAB_008cbe98:
    dVar13 = *auVar16._8_8_;
    dVar15 = *param_3;
LAB_008cbf38:
    uVar6 = (ulong)(dVar13 == dVar15);
  }
  else {
    if ((int)fVar12 < 8) {
      if (fVar12 != 5.60519e-45) {
        if (fVar12 != 8.40779e-45) goto LAB_008cbe98;
        uVar8 = *(undefined8 *)((long)*auVar16._8_8_ + 0x10);
        uVar10 = *(undefined8 *)((long)*param_3 + 0x10);
        goto LAB_008cbee0;
      }
      if ((*(float *)auVar16._8_8_ == *(float *)param_3) &&
         (*(float *)((long)auVar16._8_8_ + 4) == *(float *)((long)param_3 + 4))) {
        return (ulong)(*(float *)(auVar16._8_8_ + 1) == *(float *)(param_3 + 1));
      }
    }
    else {
      if (fVar12 == 1.12104e-44) {
        uVar8 = *(undefined8 *)((long)*auVar16._8_8_ + 8);
        uVar10 = *(undefined8 *)((long)*param_3 + 8);
      }
      else {
        if ((fVar12 == 1.54143e-44) || (fVar12 != 1.68156e-44)) goto LAB_008cbe98;
        uVar8 = *(undefined8 *)(*(long *)((long)*auVar16._8_8_ + 0x10) + 0x50);
        uVar10 = *(undefined8 *)(*(long *)((long)*param_3 + 0x10) + 0x50);
      }
LAB_008cbee0:
      lVar7 = FUN_008cbf8c(lVar5,uVar8,uVar10);
      if (lVar7 == 0) {
        dVar13 = *auVar16._8_8_;
        dVar15 = *param_3;
        goto LAB_008cbf38;
      }
      FUN_008cb070(lVar5,*(undefined8 *)(lVar5 + 0x68),lVar7,auVar16._8_8_,param_3);
      iVar3 = (*(int **)(lVar5 + 0x68))[3];
      if (iVar3 != 0) {
        if (iVar3 == 1) {
          return (ulong)(**(int **)(lVar5 + 0x68) != 0);
        }
        return 1;
      }
    }
LAB_008cbf78:
    uVar6 = 0;
  }
  return uVar6;
}

