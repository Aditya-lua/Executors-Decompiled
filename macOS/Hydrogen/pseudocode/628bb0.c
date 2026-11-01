
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_00628bb0(undefined8 param_1,undefined8 *param_2)

{
  long *plVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *unaff_x19;
  
  *param_2 = param_1;
  func_0x00621dd4(param_2 + 0x1d);
  unaff_x19[-1] = &UNK_009ff600;
  *unaff_x19 = &UNK_009ff6d0;
  uVar4 = _UNK_00a10ed8;
  uVar3 = _UNK_00a10ed0;
  lVar2 = _UNK_00a10e68;
  plVar1 = unaff_x19 + 1;
  *plVar1 = _UNK_00a10e68;
  unaff_x19[2] = uVar3;
  *(undefined8 *)((long)plVar1 + *(long *)(lVar2 + -0x18)) = uVar4;
  func_0x00621dd4(unaff_x19 + 0xc);
  unaff_x19[10] = &UNK_00a098c0;
  if ((long *)unaff_x19[0xb] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[0xb] + 8))();
  }
  uVar4 = _UNK_00a10ec8;
  uVar3 = _UNK_00a10ec0;
  lVar2 = _UNK_00a10e70;
  *plVar1 = _UNK_00a10e70;
  unaff_x19[2] = uVar3;
  *(undefined8 *)((long)plVar1 + *(long *)(lVar2 + -0x18)) = uVar4;
  unaff_x19[4] = &UNK_009f5d60;
  lVar2 = unaff_x19[8];
  uVar5 = unaff_x19[6];
  if ((ulong)unaff_x19[7] <= (ulong)unaff_x19[6]) {
    uVar5 = unaff_x19[7];
  }
  if (lVar2 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  return plVar1;
}

