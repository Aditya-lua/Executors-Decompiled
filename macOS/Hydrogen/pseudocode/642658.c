
long * FUN_00642658(long *param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  long *plVar3;
  
  lVar1 = *param_2;
  *param_1 = lVar1;
  plVar3 = param_1 + 1;
  *plVar3 = param_2[0xe];
  param_1[2] = param_2[0xf];
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x18)) = param_2[0x10];
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
  lVar1 = param_2[1];
  param_1[1] = lVar1;
  param_1[2] = param_2[0xc];
  *(long *)((long)plVar3 + *(long *)(lVar1 + -0x18)) = param_2[0xd];
  func_0x00633a74(param_1 + 0xc,&UNK_009fb230);
  lVar1 = param_2[2];
  param_1[1] = lVar1;
  param_1[2] = param_2[10];
  *(long *)((long)plVar3 + *(long *)(lVar1 + -0x18)) = param_2[0xb];
  func_0x006989cc(param_1 + 3);
  return param_1;
}

