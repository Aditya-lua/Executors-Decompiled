
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005e6eac(long param_1,undefined8 param_2)

{
  char cVar1;
  code *pcVar2;
  long lVar3;
  ulong *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  ulong uVar7;
  long *plVar8;
  undefined8 extraout_x8;
  ulong extraout_x8_00;
  ulong unaff_x19;
  ulong *unaff_x20;
  long unaff_x22;
  long *plVar9;
  code *unaff_x23;
  ulong uVar10;
  ulong uVar11;
  undefined8 uStack0000000000000010;
  
  func_0x00438238(param_2,param_1 + 0x3b0);
  *(undefined1 *)(unaff_x22 + 0x28) = 1;
  lVar3 = (*unaff_x23)();
  cVar1 = *(char *)(lVar3 + 0x20);
  *(undefined1 *)(lVar3 + 0x20) = 0;
  uVar10 = _UNK_009f4128;
  plVar9 = _UNK_009f4120;
  uVar11 = ___ZN12tracing_core10dispatcher4NONE17hec1704e7c8575e04E;
  if (cVar1 == '\x01') {
    puVar4 = (ulong *)(*unaff_x23)();
    if (0x7ffffffffffffffe < *puVar4) {
      func_0x007a2378(&UNK_009f3988);
LAB_005e7048:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5e704c);
      (*pcVar2)();
    }
    puVar5 = (undefined8 *)(*unaff_x23)(*puVar4 + 1);
    *puVar5 = extraout_x8;
    puVar4 = puVar5 + 1;
    uVar11 = *puVar4;
    if (uVar11 == 2) {
      puVar4 = (ulong *)&__ZN12tracing_core10dispatcher15GLOBAL_DISPATCH17h107bb7149eefa31bE;
      if (___ZN12tracing_core10dispatcher11GLOBAL_INIT17h2e36d73a7bb96473E != 2) {
        puVar4 = (ulong *)&__ZN12tracing_core10dispatcher4NONE17hec1704e7c8575e04E;
      }
      uVar11 = *puVar4;
    }
    uStack0000000000000010 = 0;
    plVar9 = (long *)puVar4[1];
    uVar10 = puVar4[2];
    if ((uVar11 & 1) == 0) {
      uVar6 = (**(code **)(uVar10 + 0x38))(plVar9,&uStack0000000000000010);
    }
    else {
      uVar6 = (**(code **)(uVar10 + 0x38))
                        ((long)plVar9 + (*(long *)(uVar10 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
                         &uStack0000000000000010);
      uVar11 = 1;
      lVar3 = *plVar9;
      *plVar9 = lVar3 + 1;
      if (lVar3 < 0) goto LAB_005e7048;
    }
    plVar8 = (long *)(*unaff_x23)(uVar6);
    *plVar8 = *plVar8 + -1;
    *(undefined1 *)(plVar8 + 4) = 1;
    uVar7 = extraout_x8_00;
  }
  else {
    uStack0000000000000010 = 0;
    if ((___ZN12tracing_core10dispatcher4NONE17hec1704e7c8575e04E & 1) == 0) {
      uVar7 = (**(code **)(_UNK_009f4128 + 0x38))(_UNK_009f4120,&uStack0000000000000010);
    }
    else {
      uVar7 = (**(code **)(_UNK_009f4128 + 0x38))
                        ((long)_UNK_009f4120 +
                         (*(long *)(_UNK_009f4128 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
                         &uStack0000000000000010);
      uVar11 = 1;
      lVar3 = *plVar9;
      *plVar9 = lVar3 + 1;
      if (lVar3 < 0) goto LAB_005e7048;
    }
  }
  *unaff_x20 = uVar11;
  unaff_x20[1] = (ulong)plVar9;
  unaff_x20[2] = uVar10;
  unaff_x20[3] = uVar7;
  unaff_x20[4] = unaff_x19;
  return;
}

