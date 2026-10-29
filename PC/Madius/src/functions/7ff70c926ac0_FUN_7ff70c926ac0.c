/* 7ff70c926ac0 FUN_7ff70c926ac0 */

/* WARNING: Type propagation algorithm not settling */

void FUN_7ff70c926ac0(longlong param_1,ulonglong param_2)

{
  longlong *plVar1;
  longlong *plVar2;
  longlong lVar3;
  longlong *plVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  code *pcVar7;
  longlong *plVar8;
  int iVar9;
  ulonglong uVar10;
  byte bVar11;
  ulonglong uVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  longlong lVar16;
  longlong lVar17;
  longlong *plVar18;
  
  if (0x800000000000000 < param_2) {
    FUN_7ff70cb12520(&UNK_7ff70cb80e99);
    pcVar7 = (code *)swi(3);
    (*pcVar7)();
    return;
  }
  uVar13 = param_2 - 1 | 1;
  lVar17 = 0x3f;
  if (uVar13 != 0) {
    for (; uVar13 >> lVar17 == 0; lVar17 = lVar17 + -1) {
    }
  }
  bVar11 = -((byte)lVar17 ^ 0x3f);
  lVar17 = 1L << (bVar11 & 0x3f);
  plVar1 = *(longlong **)(param_1 + 8);
  FUN_7ff70c7ac0b0(param_1 + 0x18,2L << (bVar11 & 0x3f),plVar1);
  *(longlong *)(param_1 + 0x30) = lVar17 + -1;
  *(longlong *)(param_1 + 0x38) = lVar17;
  plVar8 = (longlong *)**(undefined8 **)(param_1 + 8);
joined_r0x7ff70c926b34:
  do {
    if (plVar8 == plVar1) {
      return;
    }
    lVar17 = plVar8[2];
    uVar13 = plVar8[3];
    uVar15 = 0xcbf29ce484222325;
    if (uVar13 != 0) {
      uVar10 = (ulonglong)((uint)uVar13 & 3);
      if (uVar13 < 4) {
        uVar12 = 0;
      }
      else {
        uVar12 = 0;
        do {
          uVar15 = ((ulonglong)*(byte *)(lVar17 + 3 + uVar12) ^
                   ((ulonglong)*(byte *)(lVar17 + 2 + uVar12) ^
                   ((ulonglong)*(byte *)(lVar17 + 1 + uVar12) ^
                   (*(byte *)(lVar17 + uVar12) ^ uVar15) * 0x100000001b3) * 0x100000001b3) *
                   0x100000001b3) * 0x100000001b3;
          uVar12 = uVar12 + 4;
        } while ((uVar13 & 0xfffffffffffffffc) != uVar12);
        if (uVar10 == 0) goto LAB_7ff70c926c16;
      }
      uVar14 = 0;
      do {
        uVar15 = (*(byte *)(uVar12 + lVar17 + uVar14) ^ uVar15) * 0x100000001b3;
        uVar14 = uVar14 + 1;
      } while (uVar10 != uVar14);
    }
LAB_7ff70c926c16:
    plVar2 = (longlong *)*plVar8;
    lVar3 = *(longlong *)(param_1 + 0x18);
    lVar16 = (uVar15 & *(ulonglong *)(param_1 + 0x30)) * 0x10;
    plVar4 = *(longlong **)(lVar3 + lVar16);
    if (plVar4 == plVar1) {
      *(longlong **)(lVar3 + lVar16) = plVar8;
      *(longlong **)(lVar3 + 8 + lVar16) = plVar8;
      plVar8 = plVar2;
    }
    else {
      plVar18 = *(longlong **)(lVar3 + 8 + lVar16);
      if ((uVar13 == plVar18[3]) &&
         ((uVar13 == 0 || (iVar9 = FUN_7ff70cb12b50(lVar17,plVar18[2],uVar13), iVar9 == 0)))) {
        plVar18 = (longlong *)*plVar18;
        if (plVar18 != plVar8) {
          plVar4 = (longlong *)plVar8[1];
          *plVar4 = (longlong)plVar2;
          puVar5 = (undefined8 *)plVar2[1];
          *puVar5 = plVar18;
          puVar6 = (undefined8 *)plVar18[1];
          *puVar6 = plVar8;
          plVar18[1] = (longlong)puVar5;
          plVar2[1] = (longlong)plVar4;
          plVar8[1] = (longlong)puVar6;
        }
        *(longlong **)(lVar3 + 8 + lVar16) = plVar8;
        plVar8 = plVar2;
      }
      else {
        do {
          if (plVar4 == plVar18) {
            plVar4 = (longlong *)plVar8[1];
            *plVar4 = (longlong)plVar2;
            puVar5 = (undefined8 *)plVar2[1];
            *puVar5 = plVar18;
            puVar6 = (undefined8 *)plVar18[1];
            *puVar6 = plVar8;
            plVar18[1] = (longlong)puVar5;
            plVar2[1] = (longlong)plVar4;
            plVar8[1] = (longlong)puVar6;
            *(longlong **)(lVar3 + lVar16) = plVar8;
            plVar8 = plVar2;
            goto joined_r0x7ff70c926b34;
          }
          plVar18 = (longlong *)plVar18[1];
        } while ((uVar13 != plVar18[3]) ||
                ((uVar13 != 0 && (iVar9 = FUN_7ff70cb12b50(lVar17,plVar18[2],uVar13), iVar9 != 0))))
        ;
        lVar17 = *plVar18;
        plVar4 = (longlong *)plVar8[1];
        *plVar4 = (longlong)plVar2;
        plVar18 = (longlong *)plVar2[1];
        *plVar18 = lVar17;
        puVar5 = *(undefined8 **)(lVar17 + 8);
        *puVar5 = plVar8;
        *(longlong **)(lVar17 + 8) = plVar18;
        plVar2[1] = (longlong)plVar4;
        plVar8[1] = (longlong)puVar5;
        plVar8 = plVar2;
      }
    }
  } while( true );
}


