
void FUN_0065a994(long param_1,long *param_2)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  long *unaff_x19;
  long unaff_x20;
  
  lVar1 = *(long *)(unaff_x20 + 0x80);
  uVar2 = *(undefined8 *)(unaff_x20 + 0x88);
  *param_2 = param_1;
  param_2[1] = lVar1;
  *(undefined8 *)((long)param_2 + *(long *)(param_1 + -0x18)) = uVar2;
  func_0x00621dd4(param_2 + 0xb);
  unaff_x19[9] = (long)&UNK_00a098c0;
  if ((long *)unaff_x19[10] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[10] + 8))();
  }
  lVar3 = *(long *)(unaff_x20 + 0x20);
  lVar1 = *(long *)(unaff_x20 + 0x70);
  uVar2 = *(undefined8 *)(unaff_x20 + 0x78);
  *unaff_x19 = lVar3;
  unaff_x19[1] = lVar1;
  *(undefined8 *)((long)unaff_x19 + *(long *)(lVar3 + -0x18)) = uVar2;
  unaff_x19[3] = (long)&UNK_009f5d60;
  lVar1 = unaff_x19[7];
  uVar4 = unaff_x19[5];
  if ((ulong)unaff_x19[6] <= (ulong)unaff_x19[5]) {
    uVar4 = unaff_x19[6];
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  return;
}

