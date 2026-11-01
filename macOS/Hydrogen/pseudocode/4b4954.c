
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004b4954(void)

{
  uint uVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  uint unaff_w26;
  undefined8 uStack0000000000000010;
  long *in_stack_00000018;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000088;
  
  lVar4 = func_0x00187bd0();
  if (lVar4 == 0) {
    func_0x007a1f00();
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x4b4b88);
    (*pcVar3)();
  }
  _memcpy(lVar4);
  *unaff_x19 = unaff_x20 + unaff_x21;
  lVar2 = _UNK_007fc110;
  unaff_x19[2] = _UNK_007fc118;
  unaff_x19[1] = lVar2;
  unaff_x19[3] = unaff_x23;
  unaff_x19[4] = lVar4;
  unaff_x19[5] = unaff_x23;
  if ((in_stack_00000088 | 0x8000000000000000) == 0x8000000000000000) {
    uVar1 = 0;
    if (uStack0000000000000010 != 2) {
      uVar1 = unaff_w26;
    }
  }
  else {
    func_0x00187bd4();
    uVar1 = 0;
    if (uStack0000000000000010 != 2) {
      uVar1 = unaff_w26;
    }
  }
  if ((((uVar1 & 1) != 0) &&
      (func_0x005ec378(&uStack0000000000000010,&uStack0000000000000028),
      lVar4 = uStack0000000000000010, uStack0000000000000010 != 2)) &&
     (func_0x005ec3ac(&uStack0000000000000010,uStack0000000000000028), lVar4 != 0)) {
    lVar4 = *in_stack_00000018;
    *in_stack_00000018 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000010 | 8);
    }
  }
  return;
}

