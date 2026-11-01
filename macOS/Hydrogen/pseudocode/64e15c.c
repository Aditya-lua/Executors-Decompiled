
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0064e15c(long *param_1)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  
  uVar3 = _UNK_00a0ff88;
  lVar2 = _UNK_00a0ff80;
  lVar1 = _UNK_00a0ff18;
  *param_1 = _UNK_00a0ff18;
  param_1[1] = lVar2;
  *(undefined8 *)((long)param_1 + *(long *)(lVar1 + -0x18)) = uVar3;
  func_0x00621dd4(param_1 + 0xb);
  param_1[9] = (long)&UNK_00a098c0;
  if ((long *)param_1[10] != (long *)0x0) {
    (**(code **)(*(long *)param_1[10] + 8))();
  }
  uVar3 = _UNK_00a0ff78;
  lVar2 = _UNK_00a0ff70;
  lVar1 = _UNK_00a0ff20;
  *param_1 = _UNK_00a0ff20;
  param_1[1] = lVar2;
  *(undefined8 *)((long)param_1 + *(long *)(lVar1 + -0x18)) = uVar3;
  param_1[3] = (long)&UNK_009f5d60;
  lVar1 = param_1[7];
  uVar4 = param_1[5];
  if ((ulong)param_1[6] <= (ulong)param_1[5]) {
    uVar4 = param_1[6];
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
  return param_1;
}

