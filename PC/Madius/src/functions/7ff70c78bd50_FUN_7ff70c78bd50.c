/* 7ff70c78bd50 FUN_7ff70c78bd50 */

undefined8 *
FUN_7ff70c78bd50(undefined8 *param_1,undefined8 param_2,longlong *param_3,undefined1 param_4,
                undefined8 param_5)

{
  longlong *plVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  ulonglong uVar6;
  uint *puVar7;
  uint uVar8;
  char cVar9;
  uint uVar10;
  longlong lStack_98;
  ulonglong uStack_90;
  undefined8 *puStack_88;
  undefined8 *puStack_80;
  undefined8 *puStack_78;
  undefined8 *puStack_70;
  longlong *plStack_68;
  longlong *plStack_60;
  undefined8 *puStack_58;
  undefined8 uStack_50;
  
  uStack_50 = 0xfffffffffffffffe;
  *param_1 = param_2;
  param_1[0x15] = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[0xc] = 0;
  *(undefined1 *)(param_1 + 0xd) = 0;
  plVar1 = (longlong *)param_3[7];
  if (plVar1 != (longlong *)0x0) {
    if (plVar1 == param_3) {
      uVar5 = (**(code **)(*plVar1 + 8))(plVar1,param_1 + 0xe);
      param_1[0x15] = uVar5;
      plVar1 = (longlong *)param_3[7];
      if (plVar1 == (longlong *)0x0) goto LAB_7ff70c78bdfb;
      (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != param_3);
    }
    else {
      param_1[0x15] = plVar1;
    }
    param_3[7] = 0;
  }
LAB_7ff70c78bdfb:
  puStack_88 = param_1 + 1;
  puStack_80 = param_1 + 8;
  *(undefined1 *)(param_1 + 0x16) = param_4;
  puStack_78 = param_1 + 0x17;
  *(undefined1 *)(param_1 + 0x17) = 9;
  param_1[0x18] = 0;
  param_1[0x19] = 0;
  *(undefined4 *)(param_1 + 0x1a) = 0xffffffff;
  *(undefined4 *)((longlong)param_1 + 0xd4) = 0xffffffff;
  *(undefined4 *)(param_1 + 0x1b) = 0xffffffff;
  *(undefined4 *)((longlong)param_1 + 0xdc) = 0xffffffff;
  param_1[0x1c] = param_5;
  uVar2 = param_1[7];
  lStack_98 = ((longlong)uVar2 >> 0x3f & 0xe000000000000000U) + (uVar2 >> 5) * 4 + param_1[4];
  uStack_90 = (ulonglong)((uint)uVar2 & 0x1f);
  puStack_70 = param_1 + 0xe;
  plStack_68 = param_1 + 4;
  plStack_60 = param_3;
  puStack_58 = param_1;
  uVar6 = FUN_7ff70ca4a6f0(param_1 + 4,&lStack_98,1);
  puVar4 = puStack_58;
  uVar8 = (uint)uVar6 & 0x1f;
  uVar2 = (ulonglong)uVar8 + 1;
  uVar3 = uVar2 >> 5;
  uVar10 = (uint)uVar2 & 0x1f;
  if (uVar8 != uVar10 || uVar3 != 0) {
    puVar7 = (uint *)(((longlong)uVar6 >> 0x3f & 0xe000000000000000U) +
                     (uVar6 >> 5) * 4 + *plStack_68);
    uVar8 = -1 << (sbyte)uVar8;
    cVar9 = (char)uVar10;
    if (uVar3 == 0) {
      uVar8 = uVar8 << (-cVar9 & 0x1fU);
    }
    else {
      *puVar7 = *puVar7 | uVar8;
      FUN_7ff70cb12b80(puVar7 + 1,CONCAT71((uint7)(uint3)(uVar8 >> 8),0xff),uVar3 * 4 + -4);
      if ((uVar2 & 0x1f) == 0) goto LAB_7ff70c78bf1d;
      puVar7 = puVar7 + uVar3;
      uVar8 = 0xffffffff;
    }
    *puVar7 = *puVar7 | uVar8 >> (-cVar9 & 0x1fU);
  }
LAB_7ff70c78bf1d:
  plVar1 = (longlong *)plStack_60[7];
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != plStack_60);
  }
  return puVar4;
}


