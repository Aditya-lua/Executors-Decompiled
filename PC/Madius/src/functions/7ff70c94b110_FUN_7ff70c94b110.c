/* 7ff70c94b110 FUN_7ff70c94b110 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c94b110(longlong param_1,longlong param_2)

{
  longlong lVar1;
  bool bVar2;
  byte bVar3;
  uint uVar4;
  int iVar5;
  longlong lVar6;
  byte bVar7;
  longlong *plVar8;
  uint uVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  uint uVar13;
  int iVar14;
  longlong lStack_90;
  longlong lStack_88;
  byte abStack_7d [5];
  undefined8 uStack_78;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  longlong lStack_58;
  longlong lStack_48;
  
  uStack_78._0_4_ = 0xffffffff;
  uStack_78._4_4_ = 0xffffffff;
  uStack_70 = 0xffffffff;
  uStack_6c = 0xffffffff;
  uStack_68 = 0xffffffff;
  uStack_64 = 0xffffffff;
  uStack_60 = 0xffffffff;
  uStack_5c = 0xffffffff;
  lStack_58 = -1;
  lStack_90 = param_2;
  uVar4 = FUN_7ff70c94bb80(param_2,&uStack_78);
  lVar1 = param_1 + 0xe0;
  uVar10 = 0;
  do {
    bVar7 = (byte)uVar10;
    uVar13 = 0x10000 << (bVar7 & 0x1f);
    if ((uVar4 >> (bVar7 & 0x1f) & 0x10001) == 0) goto LAB_7ff70c94b3bc;
    lVar12 = (&uStack_78)[uVar10];
    lStack_88 = lVar12;
    if (lVar12 == -1) {
      lVar6 = 0;
    }
    else {
      lVar6 = FUN_7ff70c992c00(lVar1,&lStack_88);
    }
    uVar9 = uVar4 >> (bVar7 & 0x1f);
    bVar3 = (byte)uVar9 & 1;
    bVar7 = bVar3 + 2;
    if ((uVar13 & uVar4) == 0) {
      bVar7 = bVar3;
    }
    abStack_7d[uVar10] = bVar7;
    if (lVar6 == 0) {
      lStack_88 = lVar12;
      lStack_48 = lVar12;
      if ((lVar12 == -1) || (lVar6 = FUN_7ff70c992c00(lVar1,&lStack_88,8), lVar6 == 0)) {
        lVar6 = (*_DAT_7ff70cbebaf0)(1,0x48);
        if (lVar6 == 0) {
          return 3;
        }
        FUN_7ff70c992990(lVar6,0xd,&UNK_7ff70c94f3c0,&UNK_7ff70c94f3b0,&UNK_7ff70c94f3a0);
        lVar11 = FUN_7ff70c9929c0(lVar1,&lStack_48,8,lVar6);
        if (lVar11 == 0) {
          FUN_7ff70c992c80(lVar6);
          (*_DAT_7ff70cbebad8)(lVar6);
          return 3;
        }
      }
    }
    else if (0 < (longlong)*(int *)(lStack_90 + 0xc0)) {
      lVar11 = 0;
      do {
        if (lVar12 == *(longlong *)(lStack_90 + 0x90 + lVar11 * 8)) {
          bVar3 = *(byte *)(lStack_90 + 0xb8 + lVar11);
          bVar2 = true;
          if (bVar3 != bVar7) {
            if ((bVar3 & 1) != 0) {
              *(int *)(lVar6 + 0x40) = *(int *)(lVar6 + 0x40) + -1;
            }
            if ((bVar3 & 2) != 0) {
              *(int *)(lVar6 + 0x44) = *(int *)(lVar6 + 0x44) + -1;
            }
            if ((uVar9 & 1) != 0) {
              *(int *)(lVar6 + 0x40) = *(int *)(lVar6 + 0x40) + 1;
            }
            if ((uVar13 & uVar4) != 0) {
              *(int *)(lVar6 + 0x44) = *(int *)(lVar6 + 0x44) + 1;
            }
          }
          goto LAB_7ff70c94b2ea;
        }
        lVar11 = lVar11 + 1;
      } while (*(int *)(lStack_90 + 0xc0) != lVar11);
    }
    *(int *)(lVar6 + 0x34) = *(int *)(lVar6 + 0x34) + 1;
    if ((uVar9 & 1) != 0) {
      *(int *)(lVar6 + 0x40) = *(int *)(lVar6 + 0x40) + 1;
    }
    if ((uVar13 & uVar4) != 0) {
      *(int *)(lVar6 + 0x44) = *(int *)(lVar6 + 0x44) + 1;
    }
    lVar11 = FUN_7ff70c9929c0(lVar6,&lStack_90,8,lStack_90);
    if (lVar11 == 0) {
      FUN_7ff70c992c80(lVar6);
      return 3;
    }
    bVar2 = false;
LAB_7ff70c94b2ea:
    iVar14 = (uint)(*(int *)(lVar6 + 0x40) != 0) + (uint)(*(int *)(lVar6 + 0x44) != 0) * 2;
    if ((!bVar2) || (*(int *)(lVar6 + 0x30) != iVar14)) {
      if (*(code **)(param_1 + 0x80) != (code *)0x0) {
        *(undefined1 *)(param_1 + 0x1b3) = 1;
        iVar5 = (**(code **)(param_1 + 0x80))
                          (lStack_90,lVar12,iVar14,*(undefined8 *)(param_1 + 0x88),
                           *(undefined8 *)(lVar6 + 0x38));
        *(undefined1 *)(param_1 + 0x1b3) = 0;
        if (iVar5 == -1) goto LAB_7ff70c94b570;
      }
      *(int *)(lVar6 + 0x30) = iVar14;
    }
    uVar10 = uVar10 + 1;
  } while (uVar10 != 5);
  uVar10 = 5;
LAB_7ff70c94b3bc:
  iVar14 = (int)uVar10;
  if (0 < *(int *)(lStack_90 + 0xc0)) {
    lVar12 = 0;
    do {
      lVar6 = *(longlong *)(lStack_90 + 0x90 + lVar12 * 8);
      if ((((iVar14 == 0) ||
           ((lVar6 != CONCAT44(uStack_78._4_4_,(undefined4)uStack_78) &&
            ((iVar14 == 1 ||
             ((lVar6 != CONCAT44(uStack_6c,uStack_70) &&
              ((iVar14 == 2 ||
               ((lVar6 != CONCAT44(uStack_64,uStack_68) &&
                ((iVar14 == 3 ||
                 ((lVar6 != CONCAT44(uStack_5c,uStack_60) && ((iVar14 == 4 || (lVar6 != lStack_58)))
                  ))))))))))))))) && (lStack_88 = lVar6, lVar6 != -1)) &&
         (lVar11 = FUN_7ff70c992c00(lVar1,&lStack_88,8), lVar11 != 0)) {
        bVar7 = *(byte *)(lStack_90 + 0xb8 + lVar12);
        iVar5 = *(int *)(lVar11 + 0x34) + -1;
        *(int *)(lVar11 + 0x34) = iVar5;
        if ((bVar7 & 2) != 0) {
          *(int *)(lVar11 + 0x44) = *(int *)(lVar11 + 0x44) + -1;
        }
        if ((bVar7 & 1) != 0) {
          *(int *)(lVar11 + 0x40) = *(int *)(lVar11 + 0x40) + -1;
        }
        plVar8 = &lStack_90;
        if (iVar5 == 0) {
          if (*(code **)(param_1 + 0x80) != (code *)0x0) {
            *(undefined1 *)(param_1 + 0x1b3) = 1;
            iVar5 = (**(code **)(param_1 + 0x80))
                              (lStack_90,lVar6,4,*(undefined8 *)(param_1 + 0x88),
                               *(undefined8 *)(lVar11 + 0x38));
            *(undefined1 *)(param_1 + 0x1b3) = 0;
            if (iVar5 == -1) {
LAB_7ff70c94b570:
              *(undefined1 *)(param_1 + 0x1b4) = 1;
              return 0xb;
            }
          }
          lStack_88 = lVar6;
          FUN_7ff70c992c80(lVar11);
          lVar11 = lVar1;
          plVar8 = &lStack_88;
        }
        FUN_7ff70c992b70(lVar11,plVar8,8);
      }
      lVar12 = lVar12 + 1;
    } while (lVar12 < *(int *)(lStack_90 + 0xc0));
  }
  lVar1 = lStack_90;
  FUN_7ff70cb12b60(lStack_90 + 0x90,&uStack_78,(uVar10 & 0xffffffff) * 8);
  FUN_7ff70cb12b60(lVar1 + 0xb8,abStack_7d,uVar10 & 0xffffffff);
  *(int *)(lVar1 + 0xc0) = iVar14;
  return 0;
}


