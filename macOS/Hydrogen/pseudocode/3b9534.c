
/* WARNING: Control flow encountered bad instruction data */

void FUN_003b9534(int param_1)

{
  long lVar1;
  long lVar2;
  ushort *puVar3;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined1 auStack_7ffffffe [2147483646];
  
  if (param_1 != 0) {
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  func_0x00331c60();
  func_0x0032f8e8(unaff_x19 + 0x580,auStack_7ffffffe + 0x80001d3e);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x98)) {
    return;
  }
  auVar4 = ___stack_chk_fail();
  lVar1 = auVar4._8_8_;
  lVar2 = 0;
  puVar3 = (ushort *)(auVar4._0_8_ + 8);
  do {
    puVar3[-4] = -(*(byte *)(lVar1 + lVar2) & 1) & 0x681;
    puVar3[-3] = -(*(byte *)(lVar1 + lVar2) >> 1 & 1) & 0x681;
    puVar3[-2] = -(*(byte *)(lVar1 + lVar2) >> 2 & 1) & 0x681;
    puVar3[-1] = -(*(byte *)(lVar1 + lVar2) >> 3 & 1) & 0x681;
    *puVar3 = -(*(byte *)(lVar1 + lVar2) >> 4 & 1) & 0x681;
    puVar3[1] = -(*(byte *)(lVar1 + lVar2) >> 5 & 1) & 0x681;
    puVar3[2] = -(*(byte *)(lVar1 + lVar2) >> 6 & 1) & 0x681;
    puVar3[3] = -(ushort)(*(byte *)(lVar1 + lVar2) >> 7) & 0x681;
    lVar2 = lVar2 + 1;
    puVar3 = puVar3 + 8;
  } while (lVar2 != 0x20);
  return;
}

