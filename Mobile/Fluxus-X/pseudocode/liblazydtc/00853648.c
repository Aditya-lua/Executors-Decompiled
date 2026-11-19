/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853648
 */

void FUN_00853648(uint *param_1,long *param_2)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  byte bVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  long lVar14;
  int *piVar15;
  ulong uVar16;
  uint uVar17;
  char cVar18;
  ulong uVar19;
  undefined1 auVar20 [12];
  undefined4 local_44;
  undefined8 local_40;
  long local_38;
  
  lVar6 = tpidr_el0;
  local_38 = *(long *)(lVar6 + 0x28);
  uVar13 = *(uint *)(param_2 + 2);
  uVar11 = *(uint *)((long)param_2 + 0x14);
  iVar4 = (int)param_2[3];
  uVar16 = param_2[1];
  uVar12 = uVar13 - iVar4;
  uVar8 = CONCAT44(uVar12,uVar11);
  local_40 = uVar8;
  if (uVar16 <= uVar13) {
switchD_008536ac_caseD_0:
    *param_1 = 0;
    *(undefined8 *)(param_1 + 1) = uVar8;
    goto LAB_00853bd4;
  }
  lVar14 = *param_2;
  bVar5 = *(byte *)(lVar14 + (ulong)uVar13);
  switch(bVar5) {
  case 0:
    goto switchD_008536ac_caseD_0;
  default:
    if (bVar5 - 0x30 < 10) {
LAB_00853918:
      FUN_008547b0(param_2,&local_40);
    }
    else {
      uVar17 = (uint)bVar5;
      if ((0x19 < (uVar17 | 0x20) - 0x61) && (uVar17 != 0x5f)) {
        if ((char)bVar5 < '\0') {
          if (*(long *)(lVar6 + 0x28) == local_38) {
            FUN_00854b10();
            return;
          }
          goto LAB_00853d1c;
        }
        *param_1 = uVar17;
        *(uint *)(param_2 + 2) = uVar13 + 1;
        goto LAB_00853ac0;
      }
      auVar20 = FUN_008548e0();
      uVar9 = auVar20._0_8_;
      lVar14 = param_2[2];
      uVar3 = *(undefined4 *)((long)param_2 + 0x14);
      lVar7 = param_2[3];
      param_1[5] = 0;
      *param_1 = auVar20._8_4_;
      *(undefined8 *)(param_1 + 1) = local_40;
      uVar8 = CONCAT44((int)lVar14 - (int)lVar7,uVar3);
LAB_00853bac:
      *(undefined8 *)(param_1 + 3) = uVar8;
      *(undefined8 *)(param_1 + 6) = uVar9;
    }
    goto LAB_00853be0;
  case 0x22:
  case 0x27:
    if (*(long *)(lVar6 + 0x28) == local_38) {
      FUN_0085435c();
      return;
    }
    goto LAB_00853d1c;
  case 0x23:
  case 0x26:
  case 0x28:
  case 0x29:
  case 0x2c:
  case 0x3b:
  case 0x3f:
  case 0x5d:
  case 0x7c:
    *param_1 = (uint)bVar5;
    uVar12 = uVar12 + 1;
    *(uint *)(param_2 + 2) = uVar13 + 1;
    *(undefined8 *)(param_1 + 1) = uVar8;
    goto LAB_00853bd4;
  case 0x25:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar16 <= uVar17) || (*(char *)(lVar14 + (ulong)uVar17) != '=')) {
      uVar13 = 0x25;
      break;
    }
    uVar17 = 0x113;
LAB_008539e4:
    *(uint *)(param_2 + 2) = uVar13 + 2;
    uVar12 = uVar12 + 2;
LAB_008539ec:
    *param_1 = uVar17;
    *(undefined8 *)(param_1 + 1) = uVar8;
    goto LAB_00853bd4;
  case 0x2a:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x110;
      goto LAB_008539e4;
    }
    uVar13 = 0x2a;
    break;
  case 0x2b:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x10e;
      goto LAB_008539e4;
    }
    uVar13 = 0x2b;
    break;
  case 0x2d:
    uVar17 = uVar13 + 1;
    if (uVar17 < uVar16) {
      cVar18 = *(char *)(lVar14 + (ulong)uVar17);
      if (cVar18 == '-') {
        if (*(long *)(lVar6 + 0x28) == local_38) {
          FUN_00853fc0();
          return;
        }
        goto LAB_00853d1c;
      }
      if (cVar18 == '=') {
        uVar17 = 0x10f;
      }
      else {
        if (cVar18 != '>') goto LAB_00853ab0;
        uVar17 = 0x107;
      }
      *(uint *)(param_2 + 2) = uVar13 + 2;
      *param_1 = uVar17;
      *(undefined8 *)(param_1 + 1) = uVar8;
      uVar12 = uVar12 + 2;
    }
    else {
LAB_00853ab0:
      *(uint *)(param_2 + 2) = uVar17;
      *param_1 = 0x2d;
LAB_00853ac0:
      uVar12 = uVar12 + 1;
      *(undefined8 *)(param_1 + 1) = uVar8;
    }
    goto LAB_00853bd4;
  case 0x2e:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if (uVar17 < uVar16) {
      uVar17 = (uint)*(byte *)(lVar14 + (ulong)uVar17);
      if (uVar17 == 0x2e) {
        uVar17 = uVar13 + 2;
        *(uint *)(param_2 + 2) = uVar17;
        if (uVar16 <= uVar17) {
LAB_00853c88:
          uVar13 = 0x105;
          goto LAB_00853cd8;
        }
        cVar18 = *(char *)(lVar14 + (ulong)uVar17);
        if (cVar18 == '=') {
          uVar17 = 0x115;
        }
        else {
          if (cVar18 != '.') goto LAB_00853c88;
          uVar17 = 0x106;
        }
LAB_00853d10:
        *(uint *)(param_2 + 2) = uVar13 + 3;
        uVar12 = uVar12 + 3;
        goto LAB_008539ec;
      }
      if (uVar17 - 0x30 < 10) goto LAB_00853918;
    }
    uVar13 = 0x2e;
    break;
  case 0x2f:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if (uVar16 <= uVar17) {
LAB_00853aa8:
      uVar13 = 0x2f;
      break;
    }
    cVar18 = *(char *)(lVar14 + (ulong)uVar17);
    if (cVar18 != '/') {
      if (cVar18 == '=') {
        uVar17 = 0x111;
        goto LAB_008539e4;
      }
      goto LAB_00853aa8;
    }
    uVar17 = uVar13 + 2;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x112;
      goto LAB_00853d10;
    }
    uVar13 = 0x109;
LAB_00853cd8:
    *(undefined8 *)(param_1 + 1) = uVar8;
    uVar12 = uVar12 + 2;
    goto LAB_00853bd0;
  case 0x3a:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == ':')) {
      uVar17 = 0x108;
      goto LAB_008539e4;
    }
    uVar13 = 0x3a;
    break;
  case 0x3c:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x102;
      goto LAB_008539e4;
    }
    uVar13 = 0x3c;
    break;
  case 0x3d:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x101;
      goto LAB_008539e4;
    }
    uVar13 = 0x3d;
    break;
  case 0x3e:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x103;
      goto LAB_008539e4;
    }
    uVar13 = 0x3e;
    break;
  case 0x40:
    uVar17 = uVar13 + 1;
    uVar19 = (ulong)uVar17;
    if (uVar19 < uVar16) {
      if (*(char *)(lVar14 + uVar19) == '[') {
        uVar17 = 0x11d;
        goto LAB_008539e4;
      }
      *(uint *)(param_2 + 2) = uVar17;
      if (((*(byte *)(lVar14 + uVar19) | 0x20) - 0x61 < 0x1a) ||
         (*(byte *)(lVar14 + uVar19) == 0x5f)) {
        uVar9 = FUN_008548e0();
        lVar14 = param_2[2];
        uVar3 = *(undefined4 *)((long)param_2 + 0x14);
        lVar7 = param_2[3];
        *(undefined8 *)(param_1 + 1) = uVar8;
        param_1[5] = 0;
        uVar8 = CONCAT44((int)lVar14 - (int)lVar7,uVar3);
        *param_1 = 0x11c;
        goto LAB_00853bac;
      }
    }
    else {
      *(uint *)(param_2 + 2) = uVar17;
    }
    *(undefined8 *)(param_1 + 1) = uVar8;
    param_1[5] = 0;
    *param_1 = 0x11c;
    *(ulong *)(param_1 + 3) = CONCAT44(uVar17 - iVar4,uVar11);
    *(undefined1 **)(param_1 + 6) = &DAT_002ab32c;
    goto LAB_00853be0;
  case 0x5b:
    uVar19 = (ulong)(uVar13 + 1);
    *(uint *)(param_2 + 2) = uVar13 + 1;
    if (uVar16 <= uVar19) {
LAB_00853c48:
      *(undefined8 *)(param_1 + 1) = uVar8;
      *param_1 = 0x5b;
      uVar12 = uVar12 + 1;
      goto LAB_00853bd4;
    }
    uVar17 = 0;
    do {
      cVar18 = *(char *)(lVar14 + uVar19);
      if (cVar18 != '=') goto LAB_00853794;
      iVar2 = uVar13 + uVar17;
      uVar17 = uVar17 + 1;
      uVar1 = iVar2 + 2;
      uVar19 = (ulong)uVar1;
      *(uint *)(param_2 + 2) = uVar1;
    } while (uVar19 < uVar16);
    cVar18 = '\0';
LAB_00853794:
    iVar2 = uVar13 + uVar17;
    if (cVar18 != '[') {
      uVar17 = ~uVar17;
    }
    if (-1 < (int)uVar17) {
      FUN_0085411c(param_2,&local_40,uVar17,0x116,0x11e);
      goto LAB_00853be0;
    }
    if (uVar17 == 0xffffffff) goto LAB_00853c48;
    *(undefined8 *)(param_1 + 1) = uVar8;
    param_1[5] = 0;
    *param_1 = 0x11e;
    *(ulong *)(param_1 + 3) = CONCAT44((iVar2 + 1) - iVar4,uVar11);
    goto LAB_00853bdc;
  case 0x5e:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x114;
      goto LAB_008539e4;
    }
    uVar13 = 0x5e;
    break;
  case 0x60:
    *(uint *)(param_2 + 2) = uVar13 + 1;
    if (*(long *)(lVar6 + 0x28) == local_38) {
      uVar9 = 0x10a;
      uVar10 = 0x10d;
LAB_00853744:
      FUN_008544a0(param_2,uVar8,uVar9,uVar10);
      return;
    }
    goto LAB_00853d1c;
  case 0x7b:
    *(uint *)(param_2 + 2) = uVar13 + 1;
    if (param_2[0xc] != param_2[0xd]) {
      local_44 = 1;
      FUN_008546cc(param_2 + 0xc,&local_44);
      uVar12 = (uint)((ulong)local_40 >> 0x20);
      uVar11 = (uint)local_40;
    }
    uVar13 = 0x7b;
    break;
  case 0x7d:
    *(uint *)(param_2 + 2) = uVar13 + 1;
    if ((param_2[0xc] != param_2[0xd]) &&
       (piVar15 = (int *)(param_2[0xd] + -4), iVar4 = *piVar15, param_2[0xd] = (long)piVar15,
       iVar4 == 0)) {
      if (*(long *)(lVar6 + 0x28) == local_38) {
        uVar9 = 0x10b;
        uVar10 = 0x10c;
        goto LAB_00853744;
      }
      goto LAB_00853d1c;
    }
    uVar13 = 0x7d;
    break;
  case 0x7e:
    uVar17 = uVar13 + 1;
    *(uint *)(param_2 + 2) = uVar17;
    if ((uVar17 < uVar16) && (*(char *)(lVar14 + (ulong)uVar17) == '=')) {
      uVar17 = 0x104;
      goto LAB_008539e4;
    }
    uVar13 = 0x7e;
  }
  *(undefined8 *)(param_1 + 1) = local_40;
  uVar12 = uVar12 + 1;
LAB_00853bd0:
  *param_1 = uVar13;
LAB_00853bd4:
  param_1[3] = uVar11;
  param_1[4] = uVar12;
  param_1[5] = 0;
LAB_00853bdc:
  param_1[6] = 0;
  param_1[7] = 0;
LAB_00853be0:
  if (*(long *)(lVar6 + 0x28) == local_38) {
    return;
  }
LAB_00853d1c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

