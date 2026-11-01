
void FUN_0045cd9c(void)

{
  ulong *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  
  auVar5 = func_0x007a1f00();
  puVar1 = auVar5._0_8_;
  uVar4 = 0;
  uVar2 = *(undefined8 *)(auVar5._8_8_ + 8);
  uVar3 = *(ulong *)(auVar5._8_8_ + 0x10);
  puVar1[2] = 0;
  if (*puVar1 < uVar3) {
    func_0x007a1e50(puVar1,0,uVar3);
    uVar4 = puVar1[2];
  }
  _memcpy(puVar1[1] + uVar4,uVar2,uVar3);
  puVar1[2] = uVar4 + uVar3;
  return;
}

