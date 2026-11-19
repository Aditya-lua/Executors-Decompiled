/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092aff8
 */

void FUN_0092aff8(long param_1,long param_2,uint param_3)

{
  long *plVar1;
  long lVar2;
  uint uVar3;
  uint uVar4;
  long *plVar5;
  int iVar6;
  long lVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  undefined1 auVar14 [16];
  
  lVar11 = *(long *)(param_1 + 0xc0);
  if (lVar11 != 0) {
    auVar14 = FUN_00941cb8();
    uVar4 = auVar14._8_4_ + ((int)param_2 + (int)(param_2 / 1000) * -1000) * 1000;
    plVar9 = *(long **)(param_1 + 0xe10);
    lVar2 = auVar14._0_8_ + param_2 / 1000;
    uVar3 = uVar4 - 1000000;
    if ((int)uVar4 < 1000000) {
      uVar3 = uVar4;
    }
    if (999999 < (int)uVar4) {
      lVar2 = lVar2 + 1;
    }
    uVar12 = auVar14._8_8_ & 0xffffffff00000000 | (ulong)uVar3;
    plVar1 = (long *)(param_1 + 0xe10);
    for (; plVar9 != (long *)0x0; plVar9 = (long *)plVar9[2]) {
      if (*(uint *)(*plVar9 + 0x28) == param_3) {
        FUN_00925d80(plVar1,plVar9,0);
        break;
      }
    }
    lVar13 = param_1 + (ulong)param_3 * 0x30;
    *(long *)(lVar13 + 0xe48) = lVar2;
    *(ulong *)(lVar13 + 0xe50) = uVar12;
    *(uint *)(lVar13 + 0xe58) = param_3;
    lVar7 = FUN_00925eb0(plVar1);
    if ((lVar7 == 0) || ((long *)*plVar1 == (long *)0x0)) {
      plVar9 = (long *)0x0;
    }
    else {
      plVar5 = (long *)*plVar1;
      plVar9 = (long *)0x0;
      do {
        plVar10 = plVar5;
        lVar7 = FUN_00941d54(*(undefined8 *)(*plVar10 + 0x18),*(undefined8 *)(*plVar10 + 0x20),
                             *(undefined8 *)(lVar13 + 0xe48),*(undefined8 *)(lVar13 + 0xe50));
        if (0 < lVar7) break;
        plVar5 = (long *)plVar10[2];
        plVar9 = plVar10;
      } while ((long *)plVar10[2] != (long *)0x0);
    }
    FUN_00925ca4(plVar1,plVar9,lVar13 + 0xe30,lVar13 + 0xe30);
    if ((*(long *)(param_1 + 0xdc8) != 0) || (*(int *)(param_1 + 0xdd0) != 0)) {
      lVar7 = FUN_00941d54(lVar2,uVar12,*(long *)(param_1 + 0xdc8),*(undefined8 *)(param_1 + 0xdd0))
      ;
      if (0 < lVar7) {
        return;
      }
      iVar6 = FUN_009415dc(*(undefined8 *)(lVar11 + 0xd0),param_1 + 0xdd8,
                           (undefined8 *)(lVar11 + 0xd0));
      if (((iVar6 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Internal error removing splay node = %d",iVar6);
      }
    }
    *(long *)(param_1 + 0xdc8) = lVar2;
    *(ulong *)(param_1 + 0xdd0) = uVar12;
    *(long *)(param_1 + 0xe08) = param_1;
    uVar8 = FUN_00941454(lVar2,uVar12,*(undefined8 *)(lVar11 + 0xd0),param_1 + 0xdd8);
    *(undefined8 *)(lVar11 + 0xd0) = uVar8;
  }
  return;
}

