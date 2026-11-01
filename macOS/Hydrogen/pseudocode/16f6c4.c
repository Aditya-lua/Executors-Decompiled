
void FUN_0016f6c4(long param_1,undefined8 *param_2)

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  if (param_2 != (undefined8 *)0x0) {
    lVar2 = *(long *)*param_2;
    *(long *)*param_2 = lVar2 + 1;
    if (lVar2 < 0) {
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x16f728);
      (*pcVar1)();
    }
    uVar6 = param_2[1];
    uVar5 = *param_2;
    puVar4 = (undefined8 *)(param_1 + 0xb8);
    plVar3 = (long *)*puVar4;
    if (plVar3 != (long *)0x0) {
      lVar2 = *plVar3;
      *plVar3 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9964(puVar4);
      }
    }
    *(undefined8 *)(param_1 + 0xc0) = uVar6;
    *puVar4 = uVar5;
  }
  return;
}

