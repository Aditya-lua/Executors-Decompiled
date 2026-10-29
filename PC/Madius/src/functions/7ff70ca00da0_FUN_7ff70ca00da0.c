/* 7ff70ca00da0 FUN_7ff70ca00da0 */

undefined8 * FUN_7ff70ca00da0(undefined8 *param_1,uint *param_2,uint *param_3)

{
  short sVar1;
  longlong lVar2;
  longlong lVar3;
  uint uVar4;
  undefined8 *puVar5;
  undefined2 *puVar6;
  uint *puVar7;
  bool bVar8;
  ulonglong uVar9;
  bool bVar10;
  
  lVar2 = *(longlong *)(param_3 + 4);
  puVar7 = param_3;
  if (7 < *(ulonglong *)(param_3 + 6)) {
    puVar7 = *(uint **)param_3;
  }
  if (lVar2 != 0) {
    if (lVar2 == 1) {
      uVar4 = (uint)(ushort)*puVar7;
    }
    else {
      uVar4 = *puVar7;
      if ((uVar4 & 0xffffffdf) - 0x3a0041 < 0x1a) goto LAB_7ff70ca00e0b;
    }
    if (((short)uVar4 != 0x2f) && ((uVar4 & 0xffff) != 0x5c)) {
      lVar3 = *(longlong *)(param_2 + 4);
      if (7 < *(ulonglong *)(param_2 + 6)) {
        param_2 = *(uint **)param_2;
      }
      if (lVar3 == 2) {
        bVar10 = (*param_2 & 0xffffffdf) - 0x3a0041 < 0x1a;
      }
      else {
        bVar10 = false;
      }
      bVar8 = false;
      if ((lVar3 != 0) && (bVar8 = false, !bVar10)) {
        sVar1 = *(short *)((longlong)param_2 + lVar3 * 2 + -2);
        bVar8 = sVar1 != 0x2f && sVar1 != 0x5c;
      }
      uVar9 = (ulonglong)bVar8 + lVar3 + lVar2;
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      param_1[3] = 7;
      puVar5 = param_1;
      if (uVar9 < 8) {
        param_1[2] = uVar9;
      }
      else {
        FUN_7ff70ca014a0(param_1,uVar9);
        if (7 < (ulonglong)param_1[3]) {
          puVar5 = (undefined8 *)*param_1;
        }
      }
      FUN_7ff70cb12b60(puVar5,param_2,lVar3 * 2);
      puVar6 = (undefined2 *)((longlong)puVar5 + lVar3 * 2);
      if (bVar8 != false) {
        *puVar6 = 0x5c;
        puVar6 = puVar6 + 1;
      }
      FUN_7ff70cb12b60(puVar6,puVar7,lVar2 * 2);
      param_1[2] = uVar9;
      puVar5 = param_1;
      if (7 < (ulonglong)param_1[3]) {
        puVar5 = (undefined8 *)*param_1;
      }
      *(undefined2 *)((longlong)puVar5 + uVar9 * 2) = 0;
      return param_1;
    }
  }
LAB_7ff70ca00e0b:
  FUN_7ff70ca016d0(param_1,param_2);
  FUN_7ff70ca00fa0(param_1,param_3);
  return param_1;
}


