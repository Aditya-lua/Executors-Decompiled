
ulong * FUN_0057f3f0(void)

{
  long lVar1;
  ulong *puVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined8 auStack_90 [3];
  undefined8 uStack_78;
  undefined8 auStack_60 [4];
  undefined8 uStack_40;
  ulong uStack_38;
  ulong uStack_30;
  undefined1 uStack_28;
  
  auVar4 = func_0x007a2668();
  uVar3 = *auVar4._8_8_;
  lVar1 = *auVar4._0_8_;
  if (lVar1 == 0) {
    auStack_90[0] = 0;
    uStack_78 = 0;
    puVar2 = (ulong *)func_0x00592630(auStack_90);
  }
  else {
    auStack_60[0] = 2;
    uStack_40 = 0;
    uStack_28 = 0;
    uStack_38 = uVar3;
    uStack_30 = uVar3;
    func_0x0055f72c(auStack_90,lVar1,auVar4._0_8_[1],auStack_60);
    puVar2 = (ulong *)func_0x00592630(auStack_90);
  }
  if (puVar2 == (ulong *)0x0) {
    return (ulong *)0x0;
  }
  if (*puVar2 <= uVar3) {
    if ((char)puVar2[2] == '\0') {
      if (uVar3 <= puVar2[1]) {
        return puVar2;
      }
    }
    else if (uVar3 < puVar2[1]) {
      return puVar2;
    }
  }
  return (ulong *)0x0;
}

