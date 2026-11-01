
undefined1  [16] FUN_00580300(long param_1,long param_2)

{
  ushort *puVar1;
  code *pcVar2;
  ulong in_x10;
  long *in_x11;
  long *plVar3;
  long lVar4;
  undefined1 auVar5 [16];
  
  plVar3 = in_x11;
  if (*(ushort *)((long)in_x11 + 0x16a) <= in_x10) {
    do {
      in_x11 = (long *)*plVar3;
      if (in_x11 == (long *)0x0) {
        func_0x007a23bc(&UNK_009f0810);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x5803a4);
        (*pcVar2)();
      }
      param_1 = param_1 + 1;
      puVar1 = (ushort *)(plVar3 + 0x2d);
      in_x10 = (ulong)*puVar1;
      plVar3 = in_x11;
    } while (*(ushort *)((long)in_x11 + 0x16a) <= *puVar1);
  }
  lVar4 = in_x10 + 1;
  if (param_1 == 0) {
    plVar3 = in_x11;
  }
  else {
    plVar3 = in_x11 + lVar4;
    do {
      plVar3 = (long *)plVar3[0x2e];
      param_1 = param_1 + -1;
    } while (param_1 != 0);
    lVar4 = 0;
  }
  *(long **)(param_2 + 8) = plVar3;
  *(undefined8 *)(param_2 + 0x10) = 0;
  *(long *)(param_2 + 0x18) = lVar4;
  auVar5._8_8_ = in_x11 + in_x10 + 0x22;
  auVar5._0_8_ = in_x11 + in_x10 * 3 + 1;
  return auVar5;
}

