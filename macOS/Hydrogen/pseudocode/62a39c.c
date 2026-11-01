
void FUN_0062a39c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  long *plVar2;
  long *plVar3;
  ulong unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000058;
  undefined1 uStack0000000000000078;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  if ((unaff_x21 & 1) != 0) {
    ___cxa_free_exception();
  }
  func_0x0003e9ec(&uStack0000000000000038);
  func_0x0003e9ec(&uStack0000000000000058);
  func_0x0003e9ec(&uStack0000000000000078);
  func_0x0003e9ec(unaff_x29 + -0x78);
  plVar2 = (long *)__Unwind_Resume();
  plVar3 = (long *)(**(code **)(*plVar2 + 0x88))();
  uVar1 = (**(code **)(*plVar2 + 0x50))(plVar2);
  func_0x005fef78(apuStack_60,param_3,uVar1,0,1);
  (**(code **)(*plVar3 + 0x78))(apuStack_90,plVar3,apuStack_60);
  (**(code **)(*plVar3 + 200))(plVar3,1,apuStack_90,param_4);
  apuStack_90[0] = &UNK_009f5d60;
  if (uStack_78 <= uStack_80) {
    uStack_80 = uStack_78;
  }
  if (lStack_70 != 0) {
    if (uStack_80 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
        uStack_80 = uStack_80 - 1;
      } while (uStack_80 != 0);
    }
    func_0x00611644();
  }
  apuStack_60[0] = &UNK_009f5d60;
  if (uStack_48 <= uStack_50) {
    uStack_50 = uStack_48;
  }
  if (lStack_40 != 0) {
    if (uStack_50 != 0) {
      do {
        *(undefined8 *)(lStack_40 + -8 + uStack_50 * 8) = 0;
        uStack_50 = uStack_50 - 1;
      } while (uStack_50 != 0);
    }
    func_0x00611644();
  }
  return;
}

