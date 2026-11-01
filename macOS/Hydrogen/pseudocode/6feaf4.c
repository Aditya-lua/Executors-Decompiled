
void FUN_006feaf4(long param_1,undefined8 param_2,long *param_3)

{
  uint uVar1;
  ulong uVar2;
  uint uVar3;
  char cVar4;
  byte bVar5;
  int iVar6;
  undefined8 uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  long lVar10;
  code *pcVar11;
  long lVar12;
  long *plVar13;
  long lVar14;
  long *plVar15;
  long lVar16;
  long lVar17;
  undefined1 auVar18 [16];
  
  ___cxa_guard_abort(param_1 + 0xb80);
  uVar7 = __Unwind_Resume();
  ___cxa_guard_abort(0xa28b70);
  auVar18 = __Unwind_Resume(uVar7);
  uVar9 = auVar18._8_8_;
  lVar16 = auVar18._0_8_;
  if (uVar9 < 0x7fffffe8) {
    uVar2 = uVar9 + 0xf & 0xfffffffffffffff0;
    if (uVar9 < 0x11) {
      uVar2 = uVar9;
    }
    puVar8 = (undefined1 *)func_0x006f3878(lVar16,uVar2 + 0x10,*(undefined1 *)(lVar16 + 4));
    puVar8[1] = *(byte *)(*(long *)(lVar16 + 0x18) + 0x20) & 3;
    *puVar8 = 8;
    puVar8[2] = *(undefined1 *)(lVar16 + 4);
    *(int *)(puVar8 + 4) = auVar18._8_4_;
    *(undefined1 **)(puVar8 + 8) = puVar8 + 8;
    puVar8[3] = (char)param_3;
    return;
  }
  auVar18 = func_0x006f36f4(lVar16);
  puVar8 = auVar18._8_8_;
  lVar16 = auVar18._0_8_;
  bVar5 = puVar8[3];
  if ((char)bVar5 < '\0') {
    if ((bVar5 == 0x80) && (*(code **)(puVar8 + (long)*(int *)(puVar8 + 4) + 8) != (code *)0x0)) {
      (**(code **)(puVar8 + (long)*(int *)(puVar8 + 4) + 8))();
    }
  }
  else {
    pcVar11 = *(code **)(*(long *)(lVar16 + 0x18) + (ulong)bVar5 * 8 + 0xd60);
    if (pcVar11 != (code *)0x0) {
      (*pcVar11)(lVar16,puVar8 + 0x10);
    }
  }
  uVar3 = *(uint *)(puVar8 + 4);
  uVar1 = uVar3 + 0xf & 0xfffffff0;
  if ((int)uVar3 < 0x11) {
    uVar1 = uVar3;
  }
  lVar12 = (long)(int)uVar1;
  bVar5 = puVar8[2];
  lVar17 = *(long *)(lVar16 + 0x18);
  if (lVar12 + 0xfU < 0x400) {
    cVar4 = *(char *)(lVar12 + 0xa40310);
    if (cVar4 < 0) goto code_r0x006f3be4;
    *puVar8 = 0;
    lVar10 = *(long *)(lVar16 + 0x18);
    if (param_3[5] == 0) {
      if ((int)param_3[6] < 0) {
        lVar14 = lVar10 + (ulong)(uint)(int)cVar4 * 8;
        plVar15 = *(long **)(lVar14 + 0x1a0);
        param_3[1] = (long)plVar15;
        if (plVar15 != (long *)0x0) {
          *plVar15 = (long)param_3;
        }
        *(long **)(lVar14 + 0x1a0) = param_3;
        *(long *)(puVar8 + 8) = param_3[5];
        param_3[5] = (long)puVar8;
        iVar6 = *(int *)((long)param_3 + 0x34) + -1;
        *(int *)((long)param_3 + 0x34) = iVar6;
      }
      else {
        *(undefined8 *)(puVar8 + 8) = 0;
        param_3[5] = (long)puVar8;
        iVar6 = *(int *)((long)param_3 + 0x34) + -1;
        *(int *)((long)param_3 + 0x34) = iVar6;
      }
    }
    else {
      *(long *)(puVar8 + 8) = param_3[5];
      param_3[5] = (long)puVar8;
      iVar6 = *(int *)((long)param_3 + 0x34) + -1;
      *(int *)((long)param_3 + 0x34) = iVar6;
    }
    if (iVar6 != 0) goto code_r0x006f3ce8;
    plVar15 = (long *)param_3[1];
    if (plVar15 != (long *)0x0) {
      *plVar15 = *param_3;
    }
    if (*param_3 == 0) {
      plVar13 = (long *)(lVar10 + 0x1a0 + ((long)cVar4 & 0xffffffffU) * 8);
      if ((long *)*plVar13 == param_3) goto code_r0x006f3bdc;
    }
    else {
      plVar13 = (long *)(*param_3 + 8);
code_r0x006f3bdc:
      *plVar13 = (long)plVar15;
    }
    lVar14 = *(long *)(lVar16 + 0x18);
    lVar16 = param_3[3];
    if (lVar16 != 0) {
      *(long *)(lVar16 + 0x10) = param_3[2];
    }
    if (param_3[2] == 0) {
      plVar15 = (long *)(lVar10 + 0x2e8);
      if ((long *)*plVar15 == param_3) goto code_r0x006f3c80;
    }
    else {
      plVar15 = (long *)(param_3[2] + 0x18);
code_r0x006f3c80:
      *plVar15 = lVar16;
    }
  }
  else {
code_r0x006f3be4:
    lVar16 = param_3[3];
    if (lVar16 != 0) {
      *(long *)(lVar16 + 0x10) = param_3[2];
    }
    lVar14 = lVar17;
    if (param_3[2] == 0) {
      plVar15 = (long *)(lVar17 + 0x2e8);
      if ((long *)*plVar15 != param_3) goto code_r0x006f3cd4;
    }
    else {
      plVar15 = (long *)(param_3[2] + 0x18);
    }
    *plVar15 = lVar16;
  }
code_r0x006f3cd4:
  (**(code **)(lVar14 + 0x10))(*(undefined8 *)(lVar14 + 0x18),param_3,(long)(int)param_3[4],0);
code_r0x006f3ce8:
  *(long *)(lVar17 + 0x48) = *(long *)(lVar17 + 0x48) - (lVar12 + 0x10);
  lVar17 = lVar17 + (ulong)bVar5 * 8;
  *(long *)(lVar17 + 0x560) = *(long *)(lVar17 + 0x560) - (lVar12 + 0x10);
  return;
}

