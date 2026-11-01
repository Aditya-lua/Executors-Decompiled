
void FUN_00640338(ulong param_1,long param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  code *pcVar1;
  long *plVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  long *plVar6;
  ulong in_x9;
  undefined1 auVar7 [16];
  undefined *puStack_b0;
  undefined *apuStack_a8 [2];
  ulong uStack_98;
  ulong uStack_90;
  long lStack_88;
  undefined *apuStack_78 [2];
  ulong uStack_68;
  ulong uStack_60;
  long lStack_58;
  undefined1 uStack_48;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  uVar5 = func_0x0001753c();
  func_0x0064f6d0();
  auVar7 = __Unwind_Resume(uVar5);
  plVar6 = (long *)(auVar7._0_8_ + -8);
  puStack_b0 = &UNK_00a09a40;
  func_0x005fdd18(apuStack_a8);
  func_0x005fdd18(apuStack_78);
  uStack_48 = 1;
  plVar2 = *(long **)(auVar7._0_8_ + 0x30);
  uVar3 = (**(code **)(*plVar2 + 0x80))(plVar2,&puStack_b0,auVar7._8_8_,param_5);
  if ((uVar3 & 1) == 0) {
    puVar4 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar4 + 1) = 1;
    puVar4[2] = 0x6f63656420524542;
    puVar4[3] = 0x726f727265206564;
    *(undefined1 *)(puVar4 + 4) = 0;
    *(undefined1 *)((long)puVar4 + 0x27) = 0x10;
    *puVar4 = &UNK_009f60b8;
    ___cxa_throw(puVar4,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x640314);
    (*pcVar1)();
  }
  (**(code **)(*plVar6 + 0x28))(plVar6,&puStack_b0);
  puStack_b0 = &UNK_00a09a40;
  apuStack_78[0] = &UNK_009f5d60;
  if (uStack_60 <= uStack_68) {
    uStack_68 = uStack_60;
  }
  if (lStack_58 != 0) {
    if (uStack_68 != 0) {
      do {
        *(undefined8 *)(lStack_58 + -8 + uStack_68 * 8) = 0;
        uStack_68 = uStack_68 - 1;
      } while (uStack_68 != 0);
    }
    func_0x00611644();
  }
  apuStack_a8[0] = &UNK_009f5d60;
  if (uStack_90 <= uStack_98) {
    uStack_98 = uStack_90;
  }
  if (lStack_88 != 0) {
    if (uStack_98 != 0) {
      do {
        *(undefined8 *)(lStack_88 + -8 + uStack_98 * 8) = 0;
        uStack_98 = uStack_98 - 1;
      } while (uStack_98 != 0);
    }
    func_0x00611644();
  }
  return;
}

