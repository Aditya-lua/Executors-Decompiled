
long * FUN_00642670(long *param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long *plVar3;
  
  lVar1 = *(long *)(param_2 + 0x5b8);
  *param_1 = lVar1;
  plVar3 = param_1 + 1;
  *plVar3 = *(long *)(param_2 + 0x628);
  param_1[2] = *(long *)(param_2 + 0x630);
  *(undefined8 *)((long)param_1 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(param_2 + 0x638);
  param_1[0x3b] = (long)&UNK_009f5d60;
  lVar1 = param_1[0x3f];
  uVar2 = param_1[0x3d];
  if ((ulong)param_1[0x3e] <= (ulong)param_1[0x3d]) {
    uVar2 = param_1[0x3e];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  lVar1 = *(long *)(param_2 + 0x5c0);
  param_1[1] = lVar1;
  param_1[2] = *(long *)(param_2 + 0x618);
  *(undefined8 *)((long)plVar3 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(param_2 + 0x620);
  func_0x00633a74(param_1 + 0xc,&UNK_009fb230);
  lVar1 = *(long *)(param_2 + 0x5c8);
  param_1[1] = lVar1;
  param_1[2] = *(long *)(param_2 + 0x608);
  *(undefined8 *)((long)plVar3 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(param_2 + 0x610);
  func_0x006989cc(param_1 + 3);
  return param_1;
}

