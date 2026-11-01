
undefined1 * FUN_006f6fb0(long param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  byte bVar4;
  char cVar5;
  undefined1 in_ZR;
  int iVar6;
  undefined1 *puVar7;
  long lVar8;
  undefined1 *puVar9;
  long lVar10;
  undefined1 *puVar11;
  long *plVar12;
  long in_x9;
  ulong uVar13;
  undefined8 *puVar14;
  long lVar15;
  long lVar16;
  ulong uVar17;
  long unaff_x19;
  undefined1 *puVar18;
  long *unaff_x21;
  long *plVar19;
  uint unaff_w24;
  undefined1 auVar20 [16];
  
  while (!(bool)in_ZR) {
    unaff_w24 = unaff_w24 * 0x20 + (unaff_w24 >> 2) + (uint)*(byte *)(in_x9 + param_1) ^ unaff_w24;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  plVar19 = *(long **)(unaff_x19 + 0x18);
  for (puVar18 = *(undefined1 **)
                  (*plVar19 + (long)(int)(*(int *)((long)plVar19 + 0xc) - 1U & unaff_w24) * 8);
      puVar18 != (undefined1 *)0x0; puVar18 = *(undefined1 **)(puVar18 + 8)) {
    if (((long *)(ulong)*(uint *)(puVar18 + 0x14) == unaff_x21) &&
       (param_4 = unaff_x21, iVar6 = _memcmp(), iVar6 == 0)) {
      if ((puVar18[1] & 0xb) == ((*(byte *)(plVar19 + 4) ^ 0xff) & 3)) {
        puVar18[1] = puVar18[1] ^ 3;
        return puVar18;
      }
      return puVar18;
    }
  }
  if (unaff_x21 < (long *)0x40000001) {
    puVar18 = (undefined1 *)func_0x006f3878();
    puVar18[1] = *(byte *)(*(long *)(unaff_x19 + 0x18) + 0x20) & 3;
    *puVar18 = 5;
    puVar18[2] = *(undefined1 *)(unaff_x19 + 4);
    *(undefined4 *)(puVar18 + 4) = 0xffff8000;
    *(uint *)(puVar18 + 0x10) = unaff_w24 - ((int)puVar18 + 0x10);
    *(int *)(puVar18 + 0x14) = (int)unaff_x21;
    param_4 = unaff_x21;
    _memcpy(puVar18 + 0x18);
    (puVar18 + 0x18)[(long)unaff_x21] = 0;
    plVar19 = *(long **)(unaff_x19 + 0x18);
    lVar10 = plVar19[1];
    uVar3 = *(uint *)((long)plVar19 + 0xc);
    lVar16 = *plVar19;
    lVar8 = (ulong)(uVar3 - 1 & unaff_w24) * 8;
    *(undefined8 *)(puVar18 + 8) = *(undefined8 *)(lVar16 + lVar8);
    *(undefined1 **)(lVar16 + lVar8) = puVar18;
    uVar1 = (int)lVar10 + 1;
    *(uint *)(plVar19 + 1) = uVar1;
    if ((0x3fffffff < (int)uVar3) || (uVar1 <= uVar3)) {
      return puVar18;
    }
    if (-1 < (int)uVar3) {
      uVar1 = uVar3 * 2;
      lVar8 = func_0x006f3708();
      plVar19 = *(long **)(unaff_x19 + 0x18);
      if (uVar3 != 0) {
        _bzero(lVar8,(ulong)uVar1 << 3);
      }
      uVar3 = *(uint *)((long)plVar19 + 0xc);
      if (0 < (int)uVar3) {
        uVar13 = 0;
        do {
          lVar10 = *(long *)(*plVar19 + uVar13 * 8);
          while (lVar10 != 0) {
            lVar16 = *(long *)(lVar10 + 8);
            uVar2 = *(int *)(lVar10 + 0x10) + (int)(int *)(lVar10 + 0x10) & uVar1 - 1;
            uVar17 = -(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3;
            *(undefined8 *)(lVar10 + 8) = *(undefined8 *)(lVar8 + uVar17);
            *(long *)(lVar8 + uVar17) = lVar10;
            lVar10 = lVar16;
          }
          uVar13 = uVar13 + 1;
        } while (uVar13 != uVar3);
      }
      func_0x006f3a2c();
      *(uint *)((long)plVar19 + 0xc) = uVar1;
      *plVar19 = lVar8;
      return puVar18;
    }
  }
  auVar20 = func_0x006f36f4();
  puVar9 = auVar20._8_8_;
  puVar7 = auVar20._0_8_;
  puVar14 = (undefined8 *)
            (**(long **)(puVar7 + 0x18) +
            (long)(int)(*(int *)(puVar9 + 0x10) + (int)(puVar9 + 0x10) &
                       *(int *)((long)*(long **)(puVar7 + 0x18) + 0xc) - 1U) * 8);
  puVar18 = (undefined1 *)*puVar14;
  if (puVar18 != (undefined1 *)0x0) {
    if (puVar18 != puVar9) {
      do {
        puVar11 = puVar18;
        puVar18 = *(undefined1 **)(puVar11 + 8);
        if (puVar18 == (undefined1 *)0x0) goto code_r0x006f721c;
      } while (puVar18 != puVar9);
      puVar14 = (undefined8 *)(puVar11 + 8);
    }
    *puVar14 = *(undefined8 *)(puVar9 + 8);
    *(int *)(*(long *)(puVar7 + 0x18) + 8) = *(int *)(*(long *)(puVar7 + 0x18) + 8) + -1;
  }
code_r0x006f721c:
  uVar13 = (ulong)*(uint *)(puVar9 + 0x14);
  bVar4 = puVar9[2];
  lVar8 = *(long *)(puVar7 + 0x18);
  if (uVar13 + 0x18 < 0x400) {
    cVar5 = *(char *)(uVar13 + 0xa40319);
    if (cVar5 < 0) goto code_r0x006f3be4;
    *puVar9 = 0;
    lVar10 = *(long *)(puVar7 + 0x18);
    if (param_4[5] == 0) {
      if ((int)param_4[6] < 0) {
        lVar16 = lVar10 + (ulong)(uint)(int)cVar5 * 8;
        plVar19 = *(long **)(lVar16 + 0x1a0);
        param_4[1] = (long)plVar19;
        if (plVar19 != (long *)0x0) {
          *plVar19 = (long)param_4;
        }
        *(long **)(lVar16 + 0x1a0) = param_4;
        *(long *)(puVar9 + 8) = param_4[5];
        param_4[5] = (long)puVar9;
        iVar6 = *(int *)((long)param_4 + 0x34) + -1;
        *(int *)((long)param_4 + 0x34) = iVar6;
      }
      else {
        *(undefined8 *)(puVar9 + 8) = 0;
        param_4[5] = (long)puVar9;
        iVar6 = *(int *)((long)param_4 + 0x34) + -1;
        *(int *)((long)param_4 + 0x34) = iVar6;
      }
    }
    else {
      *(long *)(puVar9 + 8) = param_4[5];
      param_4[5] = (long)puVar9;
      iVar6 = *(int *)((long)param_4 + 0x34) + -1;
      *(int *)((long)param_4 + 0x34) = iVar6;
    }
    if (iVar6 != 0) goto code_r0x006f3ce8;
    plVar19 = (long *)param_4[1];
    if (plVar19 != (long *)0x0) {
      *plVar19 = *param_4;
    }
    if (*param_4 == 0) {
      plVar12 = (long *)(lVar10 + 0x1a0 + ((long)cVar5 & 0xffffffffU) * 8);
      if ((long *)*plVar12 == param_4) goto code_r0x006f3bdc;
    }
    else {
      plVar12 = (long *)(*param_4 + 8);
code_r0x006f3bdc:
      *plVar12 = (long)plVar19;
    }
    lVar16 = *(long *)(puVar7 + 0x18);
    lVar15 = param_4[3];
    if (lVar15 != 0) {
      *(long *)(lVar15 + 0x10) = param_4[2];
    }
    if (param_4[2] == 0) {
      plVar19 = (long *)(lVar10 + 0x2e8);
      if ((long *)*plVar19 == param_4) goto code_r0x006f3c80;
    }
    else {
      plVar19 = (long *)(param_4[2] + 0x18);
code_r0x006f3c80:
      *plVar19 = lVar15;
    }
  }
  else {
code_r0x006f3be4:
    lVar10 = param_4[3];
    if (lVar10 != 0) {
      *(long *)(lVar10 + 0x10) = param_4[2];
    }
    lVar16 = lVar8;
    if (param_4[2] == 0) {
      plVar19 = (long *)(lVar8 + 0x2e8);
      if ((long *)*plVar19 != param_4) goto code_r0x006f3cd4;
    }
    else {
      plVar19 = (long *)(param_4[2] + 0x18);
    }
    *plVar19 = lVar10;
  }
code_r0x006f3cd4:
  puVar7 = (undefined1 *)
           (**(code **)(lVar16 + 0x10))
                     (*(undefined8 *)(lVar16 + 0x18),param_4,(long)(int)param_4[4],0);
code_r0x006f3ce8:
  *(ulong *)(lVar8 + 0x48) = *(long *)(lVar8 + 0x48) - (uVar13 + 0x19);
  lVar8 = lVar8 + (ulong)bVar4 * 8;
  *(ulong *)(lVar8 + 0x560) = *(long *)(lVar8 + 0x560) - (uVar13 + 0x19);
  return puVar7;
}

