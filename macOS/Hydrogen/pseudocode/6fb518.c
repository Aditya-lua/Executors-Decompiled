
void FUN_006fb518(long param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  byte bVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 *puVar6;
  long lVar7;
  long lVar8;
  uint uVar9;
  long *plVar10;
  long in_x9;
  undefined4 *puVar11;
  long *plVar12;
  long unaff_x19;
  int unaff_w21;
  undefined4 unaff_w22;
  ulong uVar13;
  long lVar14;
  undefined1 auVar15 [16];
  
  puVar11 = (undefined4 *)(in_x9 + 0xc);
  do {
    *puVar11 = 0;
    param_1 = param_1 + -1;
    puVar11 = puVar11 + 4;
  } while (param_1 != 0);
  *(undefined4 *)(unaff_x19 + 8) = unaff_w22;
  if (unaff_w21 < 1) {
    return;
  }
  iVar3 = func_0x006f4b48(unaff_w21 + -1);
  if (iVar3 < 0x1a) {
    uVar9 = iVar3 + 1;
    uVar2 = 1 << (ulong)(uVar9 & 0x1f);
    uVar13 = (ulong)uVar2;
    uVar4 = func_0x006f3708();
    lVar8 = 0;
    *(undefined8 *)(unaff_x19 + 0x20) = uVar4;
    do {
      lVar5 = *(long *)(unaff_x19 + 0x20) + lVar8;
      *(undefined4 *)(lVar5 + 0x1c) = 0;
      *(undefined4 *)(lVar5 + 0xc) = 0;
      lVar8 = lVar8 + 0x20;
      uVar13 = uVar13 - 1;
    } while (uVar13 != 0);
    *(char *)(unaff_x19 + 6) = (char)uVar9;
    *(byte *)(unaff_x19 + 7) = ~(byte)(-1 << (ulong)(uVar9 & 0x1f));
    *(uint *)(unaff_x19 + 0xc) = uVar2;
    return;
  }
  auVar15 = func_0x006eceb0();
  puVar6 = auVar15._8_8_;
  lVar8 = auVar15._0_8_;
  lVar14 = *(long *)(puVar6 + 0x20);
  lVar5 = __dyld_get_image_header(0);
  if (lVar14 != lVar5 + 0x4e8dec0) {
    uVar9 = 1 << (ulong)((byte)puVar6[6] & 0x1f);
    func_0x006f3a2c(lVar8,*(undefined8 *)(puVar6 + 0x20),
                    -(ulong)(uVar9 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar9 << 5,puVar6[2]);
  }
  if (*(long *)(puVar6 + 0x18) != 0) {
    func_0x006f3a2c(lVar8,*(long *)(puVar6 + 0x18),(long)*(int *)(puVar6 + 8) << 4,puVar6[2]);
  }
  bVar1 = puVar6[2];
  lVar5 = *(long *)(lVar8 + 0x18);
  uVar13 = (ulong)cRam0000000000a40330;
  uVar9 = (uint)cRam0000000000a40330;
  if ((int)uVar9 < 0) {
    lVar8 = param_4[3];
    if (lVar8 != 0) {
      *(long *)(lVar8 + 0x10) = param_4[2];
    }
    lVar14 = lVar5;
    if (param_4[2] == 0) {
      plVar12 = (long *)(lVar5 + 0x2e8);
      if ((long *)*plVar12 != param_4) goto code_r0x006f3cd4;
    }
    else {
      plVar12 = (long *)(param_4[2] + 0x18);
    }
    *plVar12 = lVar8;
  }
  else {
    *puVar6 = 0;
    lVar7 = *(long *)(lVar8 + 0x18);
    if (param_4[5] == 0) {
      if ((int)param_4[6] < 0) {
        lVar14 = lVar7 + (ulong)uVar9 * 8;
        plVar12 = *(long **)(lVar14 + 0x1a0);
        param_4[1] = (long)plVar12;
        if (plVar12 != (long *)0x0) {
          *plVar12 = (long)param_4;
        }
        *(long **)(lVar14 + 0x1a0) = param_4;
        *(long *)(puVar6 + 8) = param_4[5];
        param_4[5] = (long)puVar6;
        iVar3 = *(int *)((long)param_4 + 0x34) + -1;
        *(int *)((long)param_4 + 0x34) = iVar3;
      }
      else {
        *(undefined8 *)(puVar6 + 8) = 0;
        param_4[5] = (long)puVar6;
        iVar3 = *(int *)((long)param_4 + 0x34) + -1;
        *(int *)((long)param_4 + 0x34) = iVar3;
      }
    }
    else {
      *(long *)(puVar6 + 8) = param_4[5];
      param_4[5] = (long)puVar6;
      iVar3 = *(int *)((long)param_4 + 0x34) + -1;
      *(int *)((long)param_4 + 0x34) = iVar3;
    }
    if (iVar3 != 0) goto code_r0x006f3ce8;
    plVar12 = (long *)param_4[1];
    if (plVar12 != (long *)0x0) {
      *plVar12 = *param_4;
    }
    if (*param_4 == 0) {
      plVar10 = (long *)(lVar7 + 0x1a0 + (uVar13 & 0xffffffff) * 8);
      if ((long *)*plVar10 == param_4) goto code_r0x006f3bdc;
    }
    else {
      plVar10 = (long *)(*param_4 + 8);
code_r0x006f3bdc:
      *plVar10 = (long)plVar12;
    }
    lVar14 = *(long *)(lVar8 + 0x18);
    lVar8 = param_4[3];
    if (lVar8 != 0) {
      *(long *)(lVar8 + 0x10) = param_4[2];
    }
    if (param_4[2] == 0) {
      plVar12 = (long *)(lVar7 + 0x2e8);
      if ((long *)*plVar12 != param_4) goto code_r0x006f3cd4;
    }
    else {
      plVar12 = (long *)(param_4[2] + 0x18);
    }
    *plVar12 = lVar8;
  }
code_r0x006f3cd4:
  (**(code **)(lVar14 + 0x10))(*(undefined8 *)(lVar14 + 0x18),param_4,(long)(int)param_4[4],0);
code_r0x006f3ce8:
  *(long *)(lVar5 + 0x48) = *(long *)(lVar5 + 0x48) + -0x30;
  lVar5 = lVar5 + (ulong)bVar1 * 8;
  *(long *)(lVar5 + 0x560) = *(long *)(lVar5 + 0x560) + -0x30;
  return;
}

