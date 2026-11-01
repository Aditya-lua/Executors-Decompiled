
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005ec0f8(void)

{
  code *pcVar1;
  ulong *puVar2;
  undefined8 *puVar3;
  long *plVar4;
  int in_w8;
  undefined8 extraout_x8;
  ulong uVar5;
  ulong uVar6;
  ulong *unaff_x19;
  code *unaff_x22;
  
  if (in_w8 == 1) {
    puVar2 = (ulong *)(*unaff_x22)();
    if (0x7ffffffffffffffe < *puVar2) {
      func_0x007a2378(&UNK_009f4198);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5ec274);
      (*pcVar1)();
    }
    puVar3 = (undefined8 *)(*unaff_x22)(*puVar2 + 1);
    *puVar3 = extraout_x8;
    puVar2 = puVar3 + 1;
    uVar6 = *puVar2;
    if (uVar6 == 2) {
      puVar2 = (ulong *)&__ZN12tracing_core10dispatcher15GLOBAL_DISPATCH17h107bb7149eefa31bE;
      if (___ZN12tracing_core10dispatcher11GLOBAL_INIT17h2e36d73a7bb96473E != 2) {
        puVar2 = (ulong *)&__ZN12tracing_core10dispatcher4NONE17hec1704e7c8575e04E;
      }
      uVar6 = *puVar2;
    }
    uVar5 = puVar2[1];
    if ((uVar6 & 1) != 0) {
      uVar5 = uVar5 + (*(long *)(puVar2[2] + 0x10) - 1U & 0xfffffffffffffff0) + 0x10;
    }
    uVar6 = (**(code **)(puVar2[2] + 0x30))(uVar5);
    if (uVar6 != 5) {
      if (uVar6 == 6) {
        uVar6 = 0;
      }
      if (uVar6 < *unaff_x19) {
        *unaff_x19 = uVar6;
      }
    }
    plVar4 = (long *)(*unaff_x22)();
    *plVar4 = *plVar4 + -1;
    *(undefined1 *)(plVar4 + 4) = 1;
  }
  else if (*unaff_x19 != 0) {
    *unaff_x19 = 0;
  }
  return;
}

