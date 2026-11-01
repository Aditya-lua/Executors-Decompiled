
undefined1  [16] FUN_001e0afc(long param_1,long param_2)

{
  ushort *puVar1;
  code *pcVar2;
  ulong uVar3;
  long *in_x11;
  long *plVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  uVar3 = *(ulong *)(param_2 + 0x18);
  plVar4 = in_x11;
  if (*(ushort *)((long)in_x11 + 0x37a) <= uVar3) {
    do {
      in_x11 = (long *)*plVar4;
      if (in_x11 == (long *)0x0) {
        func_0x007a23bc(&UNK_009c36e8);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x1e0ba8);
        (*pcVar2)();
      }
      param_1 = param_1 + 1;
      puVar1 = (ushort *)(plVar4 + 0x6f);
      uVar3 = (ulong)*puVar1;
      plVar4 = in_x11;
    } while (*(ushort *)((long)in_x11 + 0x37a) <= *puVar1);
  }
  lVar5 = uVar3 + 1;
  if (param_1 == 0) {
    plVar4 = in_x11;
  }
  else {
    plVar4 = in_x11 + lVar5;
    do {
      plVar4 = (long *)plVar4[0x70];
      param_1 = param_1 + -1;
    } while (param_1 != 0);
    lVar5 = 0;
  }
  *(long **)(param_2 + 8) = plVar4;
  *(undefined8 *)(param_2 + 0x10) = 0;
  *(long *)(param_2 + 0x18) = lVar5;
  auVar6._8_8_ = in_x11 + uVar3 * 7 + 0x22;
  auVar6._0_8_ = in_x11 + uVar3 * 3 + 1;
  return auVar6;
}

