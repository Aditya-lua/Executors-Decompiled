
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004111fc(long param_1,undefined8 *param_2)

{
  char cVar1;
  ulong uVar2;
  char cVar3;
  byte bVar4;
  bool bVar5;
  uint *puVar6;
  ulong in_x4;
  long in_x6;
  long in_x7;
  undefined1 uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  ulong in_x11;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  long lVar17;
  long *plVar18;
  undefined8 uVar19;
  long unaff_x28;
  undefined1 auVar20 [16];
  undefined8 in_stack_00000030;
  long lStack_80;
  ulong uStack_78;
  uint *puStack_70;
  long lStack_68;
  ulong uStack_60;
  long lStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  ushort uStack_40;
  uint auStack_38 [2];
  long lStack_30;
  undefined8 uStack_28;
  long lStack_20;
  long lStack_18;
  
  lVar10 = *(long *)(in_x6 + 0x28);
  if (in_x11 == 1) {
    lVar13 = 0;
  }
  else {
    lVar13 = 0;
    do {
      lVar8 = (in_x11 >> 1) + lVar13;
      if (*(ulong *)(lVar10 + lVar8 * 0x1c8 + 0x1c0) <= in_x4) {
        lVar13 = lVar8;
      }
      in_x11 = in_x11 - (in_x11 >> 1);
    } while (1 < in_x11);
  }
  uVar14 = *(ulong *)(lVar10 + lVar13 * 0x1c8 + 0x1c0);
  if (uVar14 != in_x4) {
    if (uVar14 < in_x4) {
      lVar13 = lVar13 + 1;
    }
    if (lVar13 != 0) {
      lVar10 = lVar10 + lVar13 * 0x1c8;
      puVar6 = (uint *)(lVar10 + -0x1c8);
      if (((*puVar6 & 1) == 0) &&
         (uVar14 = in_x4 - *(ulong *)(lVar10 + -0x1c0), *(ulong *)(lVar10 + -0x1c0) <= in_x4)) {
        lVar13 = 0xc;
        if (*(char *)(lVar10 + -0x17f) != '\b') {
          lVar13 = 4;
        }
        uVar11 = (*(long *)(lVar10 + -400) - *(ulong *)(lVar10 + -0x198)) + lVar13;
        if (uVar11 <= uVar14 && uVar14 - uVar11 < *(ulong *)(lVar10 + -0x198)) {
          param_1 = param_1 + 0x10;
          cVar3 = *(char *)(lVar10 + -0x17f);
          lVar13 = 0xc;
          if (cVar3 != '\b') {
            lVar13 = 4;
          }
          uVar2 = *(ulong *)(lVar10 + -0x198);
          uVar11 = (*(long *)(lVar10 + -400) - uVar2) + lVar13;
          if (uVar14 < uVar11 || uVar2 <= uVar14 - uVar11) {
            param_2[2] = puVar6;
            uVar19 = _UNK_008848e0;
            param_2[1] = _UNK_008848e8;
            *param_2 = uVar19;
            return;
          }
          uVar9 = 0;
          uVar15 = 0;
          lVar8 = *(long *)(lVar10 + -0x58);
          lStack_68 = lVar8 + 0x10;
          uVar11 = *(long *)(lVar10 + -0x1a0) + uVar2;
          uStack_78 = (uVar14 - lVar13) - *(long *)(lVar10 + -400);
          do {
            bVar4 = *(byte *)(uVar11 + uStack_78);
            if (((int)uVar15 == 0x3f) && (1 < bVar4)) {
              uVar7 = 6;
              goto code_r0x0041008c;
            }
            uVar9 = ((ulong)bVar4 & 0x7f) << (uVar15 & 0x3f) | uVar9;
            if (-1 < (char)bVar4) {
              lStack_80 = *(long *)(lVar10 + -0x1a0) + uVar2 + uStack_78 + 1;
              uStack_78 = ~uStack_78;
              if (uVar9 == 0) {
                *(undefined1 *)(param_2 + 1) = 0x3a;
                goto code_r0x004100a0;
              }
              if (uVar9 - 1 < *(ulong *)(lVar8 + 0x20)) {
                lVar13 = *(long *)(lVar8 + 0x18) + (uVar9 - 1) * 0x70;
                goto code_r0x004100fc;
              }
              lVar12 = *(long *)(lVar8 + 0x28);
              if (lVar12 == 0) goto code_r0x004102cc;
              lVar8 = *(long *)(lVar8 + 0x30);
              goto code_r0x00410244;
            }
            uVar15 = (ulong)((int)uVar15 + 7);
            bVar5 = uStack_78 != 0xffffffffffffffff;
            uStack_78 = uStack_78 + 1;
          } while (bVar5);
          uVar7 = 0x13;
          goto code_r0x0041008c;
        }
      }
    }
  }
  *param_2 = 1;
  param_2[1] = 0x3a;
  return;
code_r0x00410244:
  lVar17 = (ulong)*(ushort *)(lVar12 + 0x532) << 3;
  lVar13 = lVar12 + -0x70;
  uVar14 = 0xffffffffffffffff;
  puVar16 = (ulong *)(lVar12 + 0x4d8);
  do {
    if (lVar17 == 0) {
      uVar14 = (ulong)*(ushort *)(lVar12 + 0x532);
      goto code_r0x00410290;
    }
    cVar1 = *puVar16 < uVar9;
    if (uVar9 < *puVar16) {
      cVar1 = -1;
    }
    lVar17 = lVar17 + -8;
    lVar13 = lVar13 + 0x70;
    uVar14 = uVar14 + 1;
    puVar16 = puVar16 + 1;
  } while (cVar1 == '\x01');
  if (cVar1 == '\0') goto code_r0x004100fc;
code_r0x00410290:
  if (lVar8 == 0) goto code_r0x004102cc;
  lVar12 = *(long *)(lVar12 + uVar14 * 8 + 0x538);
  lVar8 = lVar8 + -1;
  goto code_r0x00410244;
code_r0x004102cc:
  uVar7 = 0x12;
  uVar11 = uVar9;
code_r0x0041008c:
  *(undefined1 *)(param_2 + 1) = uVar7;
  *(undefined1 *)((long)param_2 + 9) = 0;
  *(undefined2 *)((long)param_2 + 0xe) = 0;
  *(undefined4 *)((long)param_2 + 10) = 0;
  param_2[2] = uVar11;
code_r0x004100a0:
  *param_2 = 1;
  return;
code_r0x004100fc:
  uStack_60 = (ulong)(*(char *)(lVar13 + 0x6a) == '\x01');
  puStack_70 = puVar6;
  auVar20 = func_0x00445ad4(lVar13);
  plVar18 = auVar20._0_8_;
  if (auVar20._8_8_ != 0) {
    lVar13 = 0;
    uVar19 = *(undefined8 *)(lVar10 + -0x28);
    lVar10 = auVar20._8_8_ << 4;
    lVar8 = 0x2e;
    do {
      lStack_18 = plVar18[1];
      lStack_20 = *plVar18;
      func_0x00405760(&lStack_58,&lStack_80,puStack_70[0x12],&lStack_20);
      if (lStack_58 == 0x2e) {
        param_2[2] = uStack_48;
        param_2[1] = uStack_50;
        *param_2 = 1;
        return;
      }
      if (uStack_40 < 0x47) {
        if (uStack_40 == 3) {
          func_0x00406c1c(&lStack_20,&lStack_58);
          func_0x004096ac(auStack_38,param_1,cVar3,uVar19,&lStack_20);
          if (auStack_38[0] == 0) {
            in_stack_00000030 = uStack_28;
            lVar13 = lStack_30;
          }
        }
        else if (uStack_40 == 0x31) goto code_r0x00410150;
      }
      else if (uStack_40 == 0x47) {
code_r0x00410150:
        func_0x00406c1c(&lStack_20,&lStack_58);
        lVar8 = lStack_20;
        unaff_x28 = lStack_18;
      }
      else {
        if (uStack_40 != 0x2007) {
          if (uStack_40 != 0x6e) goto code_r0x00410160;
        }
        func_0x00406c1c(&lStack_20,&lStack_58);
        func_0x004096ac(auStack_38,param_1,cVar3,uVar19,&lStack_20);
        if ((auStack_38[0] & 1) == 0) {
          param_2[1] = lStack_30;
          param_2[2] = uStack_28;
          *param_2 = 0;
          return;
        }
      }
code_r0x00410160:
      plVar18 = plVar18 + 2;
      lVar10 = lVar10 + -0x10;
    } while (lVar10 != 0);
    if (lVar13 != 0) {
      param_2[1] = lVar13;
      param_2[2] = in_stack_00000030;
      goto code_r0x004102e8;
    }
    if (lVar8 != 0x2e) {
      func_0x004111b0(param_2,lVar8,unaff_x28,1,param_1,puVar6,in_x6,in_x7 + -1);
      return;
    }
  }
  param_2[1] = 0;
code_r0x004102e8:
  *param_2 = 0;
  return;
}

