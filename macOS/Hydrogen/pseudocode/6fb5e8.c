
void FUN_006fb5e8(long param_1)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  uint uVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  undefined8 *puVar10;
  long *unaff_x19;
  undefined1 *unaff_x20;
  long lVar11;
  long unaff_x21;
  long unaff_x22;
  
  if (unaff_x22 != param_1 + 0x4e8dec0) {
    func_0x006f3a2c();
  }
  if (*(long *)(unaff_x20 + 0x18) != 0) {
    func_0x006f3a2c();
  }
  bVar1 = unaff_x20[2];
  lVar11 = *(long *)(unaff_x21 + 0x18);
  uVar5 = (ulong)cRam0000000000a40330;
  uVar4 = (uint)cRam0000000000a40330;
  if ((int)uVar4 < 0) {
    lVar3 = unaff_x19[3];
    if (lVar3 != 0) {
      *(long *)(lVar3 + 0x10) = unaff_x19[2];
    }
    lVar7 = lVar11;
    if (unaff_x19[2] == 0) {
      plVar8 = (long *)(lVar11 + 0x2e8);
      if ((long *)*plVar8 != unaff_x19) goto code_r0x006f3cd4;
    }
    else {
      plVar8 = (long *)(unaff_x19[2] + 0x18);
    }
    *plVar8 = lVar3;
  }
  else {
    *unaff_x20 = 0;
    lVar3 = *(long *)(unaff_x21 + 0x18);
    if (unaff_x19[5] == 0) {
      if ((int)unaff_x19[6] < 0) {
        lVar7 = lVar3 + (ulong)uVar4 * 8;
        puVar10 = *(undefined8 **)(lVar7 + 0x1a0);
        unaff_x19[1] = (long)puVar10;
        if (puVar10 != (undefined8 *)0x0) {
          *puVar10 = unaff_x19;
        }
        *(long **)(lVar7 + 0x1a0) = unaff_x19;
        *(long *)(unaff_x20 + 8) = unaff_x19[5];
        unaff_x19[5] = (long)unaff_x20;
        iVar2 = *(int *)((long)unaff_x19 + 0x34) + -1;
        *(int *)((long)unaff_x19 + 0x34) = iVar2;
      }
      else {
        *(undefined8 *)(unaff_x20 + 8) = 0;
        unaff_x19[5] = (long)unaff_x20;
        iVar2 = *(int *)((long)unaff_x19 + 0x34) + -1;
        *(int *)((long)unaff_x19 + 0x34) = iVar2;
      }
    }
    else {
      *(long *)(unaff_x20 + 8) = unaff_x19[5];
      unaff_x19[5] = (long)unaff_x20;
      iVar2 = *(int *)((long)unaff_x19 + 0x34) + -1;
      *(int *)((long)unaff_x19 + 0x34) = iVar2;
    }
    if (iVar2 != 0) goto code_r0x006f3ce8;
    plVar8 = (long *)unaff_x19[1];
    if (plVar8 != (long *)0x0) {
      *plVar8 = *unaff_x19;
    }
    if (*unaff_x19 == 0) {
      plVar6 = (long *)(lVar3 + 0x1a0 + (uVar5 & 0xffffffff) * 8);
      if ((long *)*plVar6 == unaff_x19) goto code_r0x006f3bdc;
    }
    else {
      plVar6 = (long *)(*unaff_x19 + 8);
code_r0x006f3bdc:
      *plVar6 = (long)plVar8;
    }
    lVar7 = *(long *)(unaff_x21 + 0x18);
    lVar9 = unaff_x19[3];
    if (lVar9 != 0) {
      *(long *)(lVar9 + 0x10) = unaff_x19[2];
    }
    if (unaff_x19[2] == 0) {
      plVar8 = (long *)(lVar3 + 0x2e8);
      if ((long *)*plVar8 != unaff_x19) goto code_r0x006f3cd4;
    }
    else {
      plVar8 = (long *)(unaff_x19[2] + 0x18);
    }
    *plVar8 = lVar9;
  }
code_r0x006f3cd4:
  (**(code **)(lVar7 + 0x10))(*(undefined8 *)(lVar7 + 0x18));
code_r0x006f3ce8:
  *(long *)(lVar11 + 0x48) = *(long *)(lVar11 + 0x48) + -0x30;
  lVar11 = lVar11 + (ulong)bVar1 * 8;
  *(long *)(lVar11 + 0x560) = *(long *)(lVar11 + 0x560) + -0x30;
  return;
}

