
void FUN_00590834(long param_1,long *param_2)

{
  ulong uVar1;
  code *pcVar2;
  ulong *puVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  ulong *unaff_x19;
  ulong *unaff_x21;
  ulong *puVar7;
  long lVar8;
  undefined1 uStack0000000000000008;
  
  if (*(ulong **)(param_1 + 8) != unaff_x21) {
    lVar8 = *param_2;
    puVar3 = *(ulong **)(param_1 + 8);
    do {
      puVar7 = puVar3 + 2;
      uVar1 = *puVar3;
      _uStack0000000000000008 = (long *)puVar3[1];
      *(ulong **)(param_1 + 8) = puVar7;
      if ((uVar1 < *(ulong *)(lVar8 + 0x28)) &&
         (lVar4 = *(long *)(lVar8 + 0x20), *(long *)(lVar4 + uVar1 * 0x40) == 0)) {
        puVar3 = (ulong *)(lVar4 + uVar1 * 0x40 + 8);
        plVar5 = (long *)*puVar3;
        lVar8 = *plVar5;
        *plVar5 = lVar8 + 1;
        if (lVar8 < 0) {
          func_0x007a05dc();
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x5908ec);
          (*pcVar2)();
        }
        uVar6 = *puVar3;
        unaff_x19[1] = uVar1;
        unaff_x19[2] = uVar6;
        goto LAB_005908c8;
      }
      lVar4 = *_uStack0000000000000008;
      *_uStack0000000000000008 = lVar4 + -1;
      LORelease();
      if (lVar4 == 1) {
        func_0x005d2ac4(&uStack0000000000000008);
      }
      puVar3 = puVar7;
    } while (puVar7 != unaff_x21);
  }
  _uStack0000000000000008 = (long *)0x0;
LAB_005908c8:
  *unaff_x19 = (ulong)_uStack0000000000000008;
  return;
}

