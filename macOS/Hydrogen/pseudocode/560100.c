
void FUN_00560100(long param_1)

{
  undefined8 *puVar1;
  ulong unaff_x20;
  long unaff_x21;
  ulong *puVar2;
  undefined1 auVar3 [16];
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  puVar2 = (ulong *)(param_1 + 0x10);
  do {
    if (*puVar2 <= unaff_x20) {
      auVar3 = func_0x007a2570();
      puVar1 = auVar3._8_8_;
      uStack_28 = puVar1[1];
      uStack_30 = *puVar1;
      uStack_18 = puVar1[3];
      uStack_20 = puVar1[2];
      func_0x0058febc(&uStack_30,puVar1[4],auVar3._0_8_);
      return;
    }
    if (**(long **)(puVar2[-1] + unaff_x20 * 8) == 0) {
      func_0x00563b2c();
    }
    puVar2 = puVar2 + 3;
    unaff_x21 = unaff_x21 + -1;
  } while (unaff_x21 != 0);
  return;
}

