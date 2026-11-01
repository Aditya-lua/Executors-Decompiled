
void FUN_00267710(undefined8 *param_1,long param_2,undefined8 param_3,long param_4)

{
  ulong uVar1;
  long *plVar2;
  undefined8 in_x9;
  ulong in_x10;
  long in_x11;
  ulong in_x12;
  int in_w13;
  ulong in_x14;
  long in_x15;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  uVar4 = in_x10 + 3;
  *(ulong *)(param_2 + 0x10) = uVar4;
  if ((((-1 < (char)*(byte *)(in_x11 + in_x15)) ||
       (uVar3 = (ulong)*(byte *)(in_x11 + in_x15), in_x14 <= uVar3)) || (CARRY8(uVar4,uVar3))) ||
     ((uVar1 = uVar3 + uVar4, in_x12 < uVar1 || (*(ulong *)(param_2 + 0x10) = uVar1, in_w13 != 0x30)
      ))) {
    *param_1 = 0x8000000000000000;
    param_1[1] = 0;
    return;
  }
  if (in_x10 <= uVar1) {
    param_1[2] = uVar1 - in_x10;
    param_1[3] = in_x11 + uVar4;
    param_1[4] = uVar3;
    *param_1 = 0x800000000000002c;
    param_1[1] = in_x9;
    return;
  }
  auVar6 = func_0x007a23bc(&UNK_009cb348);
  plVar2 = auVar6._0_8_;
  uVar4 = param_4 - auVar6._8_8_;
  lVar5 = plVar2[2];
  if ((ulong)(*plVar2 - lVar5) < uVar4) {
    func_0x0079ce18(plVar2,lVar5,uVar4,1,1);
    lVar5 = plVar2[2];
  }
  _memcpy(plVar2[1] + lVar5,auVar6._8_8_,uVar4);
  plVar2[2] = lVar5 + uVar4;
  return;
}

