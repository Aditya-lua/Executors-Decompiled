/* 7ff70c7fa970 FUN_7ff70c7fa970 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7fa970(longlong param_1,code *param_2,uint param_3)

{
  char *pcVar1;
  undefined4 uVar2;
  undefined1 auVar3 [16];
  float fVar4;
  float fVar5;
  longlong lVar6;
  code *pcVar7;
  longlong unaff_RBX;
  int iVar8;
  int iVar9;
  int unaff_R12D;
  int iVar10;
  code *pcVar11;
  code *unaff_R15;
  undefined8 uVar12;
  undefined4 extraout_XMM0_Dc;
  undefined4 extraout_XMM0_Dc_00;
  undefined4 extraout_XMM0_Dd;
  undefined4 extraout_XMM0_Dd_00;
  float fVar13;
  float fVar14;
  undefined1 auVar15 [16];
  undefined4 unaff_XMM7_Da;
  undefined4 unaff_XMM7_Db;
  undefined4 unaff_XMM7_Dc;
  undefined4 unaff_XMM7_Dd;
  undefined1 auStack_c8 [40];
  ulonglong uStack_a0;
  
  uVar12 = CONCAT44(unaff_XMM7_Db,unaff_XMM7_Da);
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  if (0xffffff < param_3) {
    fVar13 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x20) * _DAT_7ff70cb1c5dc;
    auVar15 = ZEXT416((uint)fVar13);
    if (_DAT_7ff70cb1ba70 <= fVar13) {
      pcVar11 = (code *)((longlong)*(int *)(param_1 + 0x50) + 8);
      lVar6 = param_1;
      if (*(int *)(param_1 + 0x54) < (int)pcVar11) {
        lVar6 = (longlong)pcVar11 * 8;
        unaff_RBX = FUN_7ff70c802100();
        if (*(longlong *)(param_1 + 0x58) != 0) {
          FUN_7ff70cb12b60(unaff_RBX,*(longlong *)(param_1 + 0x58),
                           (longlong)*(int *)(param_1 + 0x50) << 3);
          lVar6 = *(longlong *)(param_1 + 0x58);
          FUN_7ff70c802510();
        }
        *(longlong *)(param_1 + 0x58) = unaff_RBX;
        *(int *)(param_1 + 0x54) = (int)pcVar11;
        unaff_R15 = param_2;
      }
      fVar5 = _DAT_7ff70cb1c674;
      fVar4 = _DAT_7ff70cb1c670;
      iVar8 = 0;
      pcVar7 = param_2;
      func_0x7ff70d992eda();
      uVar2 = in((short)pcVar7);
      *(undefined4 *)(ulonglong)param_3 = uVar2;
      pcVar1 = (char *)(unaff_RBX + 0x3d + lVar6 * 4);
      *pcVar1 = *pcVar1 - (char)lVar6;
      do {
        lVar6 = *(longlong *)(param_1 + 0x58);
        while( true ) {
          auVar3._8_4_ = unaff_XMM7_Dc;
          auVar3._0_8_ = uVar12;
          auVar3._12_4_ = unaff_XMM7_Dd;
          auVar15 = insertps(auVar15,auVar3,0x10);
          *(ulonglong *)(lVar6 + (longlong)unaff_R12D * 8) =
               CONCAT44(auVar15._4_4_ * fVar13 + (float)((ulonglong)param_2 >> 0x20),
                        auVar15._0_4_ * fVar13 + SUB84(param_2,0));
          iVar9 = *(int *)(param_1 + 0x50) + 1;
          *(int *)(param_1 + 0x50) = iVar9;
          iVar8 = iVar8 + 1;
          if (iVar8 == 8) {
            FUN_7ff70c7b9fb0(param_1,*(undefined8 *)(param_1 + 0x58),iVar9,param_3 + 4);
            *(undefined4 *)(param_1 + 0x50) = 0;
            goto LAB_7ff70c7fab48;
          }
          fVar14 = ((float)iVar8 / fVar4) * fVar5;
          uVar12 = (*pcVar11)(fVar14);
          auVar15._0_8_ = (*unaff_R15)(fVar14);
          auVar15._8_4_ = extraout_XMM0_Dc_00;
          auVar15._12_4_ = extraout_XMM0_Dd_00;
          unaff_R12D = *(int *)(param_1 + 0x50);
          unaff_XMM7_Dc = extraout_XMM0_Dc;
          unaff_XMM7_Dd = extraout_XMM0_Dd;
          if (unaff_R12D != *(int *)(param_1 + 0x54)) break;
          if (unaff_R12D == 0) {
            iVar9 = 8;
          }
          else {
            iVar9 = unaff_R12D / 2 + unaff_R12D;
          }
          iVar10 = unaff_R12D + 1;
          if (unaff_R12D + 1 < iVar9) {
            iVar10 = iVar9;
          }
          lVar6 = FUN_7ff70c802100((longlong)iVar10 << 3);
          if (*(longlong *)(param_1 + 0x58) != 0) {
            FUN_7ff70cb12b60(lVar6,*(longlong *)(param_1 + 0x58),
                             (longlong)*(int *)(param_1 + 0x50) << 3);
            FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
          }
          *(longlong *)(param_1 + 0x58) = lVar6;
          *(int *)(param_1 + 0x54) = iVar10;
          unaff_R12D = *(int *)(param_1 + 0x50);
        }
      } while( true );
    }
  }
LAB_7ff70c7fab48:
  if (_DAT_7ff70cbebd80 == (uStack_a0 ^ (ulonglong)auStack_c8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_c8);
  pcVar11 = (code *)swi(3);
  (*pcVar11)();
  return;
}


