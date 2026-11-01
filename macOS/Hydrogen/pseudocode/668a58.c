
void FUN_00668a58(long param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  long *plVar2;
  long unaff_x20;
  long unaff_x22;
  long unaff_x28;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000078;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000a8;
  undefined1 uStack00000000000000c0;
  undefined1 uStack00000000000000d8;
  undefined1 uStack00000000000000f0;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  while( true ) {
    func_0x00669d7c(param_1);
    unaff_x28 = unaff_x28 + 0x90;
    if (unaff_x28 == 0) break;
    param_1 = unaff_x20 + unaff_x28;
  }
  func_0x00669d7c();
  if (unaff_x22 != 0) {
    __ZdlPv();
  }
  func_0x001372c4(&uStack0000000000000078);
  func_0x006696d8(&uStack0000000000000090);
  func_0x001372c4(&uStack00000000000000a8);
  func_0x00621244(&uStack00000000000000c0);
  func_0x00669740(&uStack00000000000000d8);
  func_0x0066a1ec(&uStack00000000000000f0);
  auVar3 = __Unwind_Resume();
  plVar2 = auVar3._8_8_;
  puVar1 = auVar3._0_8_;
  if (*(char *)(param_3 + 0x68) != '\0') {
    *puVar1 = &UNK_00a09a40;
    func_0x005fe0b4(puVar1 + 1,param_3 + 8);
    func_0x005fe0b4(puVar1 + 7,param_3 + 0x38);
    *(undefined1 *)(puVar1 + 0xd) = *(undefined1 *)(param_3 + 0x68);
    return;
  }
  (**(code **)(*plVar2 + 0xd0))(apuStack_60,plVar2,param_3 + 8);
  (**(code **)(*plVar2 + 0xd0))(apuStack_90,plVar2,param_3 + 0x38);
  *puVar1 = &UNK_00a09a40;
  func_0x005fe0b4(puVar1 + 1,apuStack_60);
  func_0x005fe0b4(puVar1 + 7,apuStack_90);
  *(undefined1 *)(puVar1 + 0xd) = 0;
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

