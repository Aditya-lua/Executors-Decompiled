
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005ebc84(void)

{
  char cVar1;
  char cVar2;
  code *pcVar3;
  char cVar4;
  ulong *puVar5;
  undefined8 *puVar6;
  long *plVar7;
  undefined8 extraout_x8;
  ulong uVar8;
  ulong uVar9;
  char *unaff_x19;
  undefined8 *unaff_x21;
  code *unaff_x23;
  
  puVar5 = (ulong *)(*unaff_x23)();
  if (0x7ffffffffffffffe < *puVar5) {
    func_0x007a2378(&UNK_009f4198);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x5ebdf4);
    (*pcVar3)();
  }
  puVar6 = (undefined8 *)(*unaff_x23)(*puVar5 + 1);
  *puVar6 = extraout_x8;
  puVar5 = puVar6 + 1;
  uVar9 = *puVar5;
  if (uVar9 == 2) {
    puVar5 = (ulong *)&__ZN12tracing_core10dispatcher15GLOBAL_DISPATCH17h107bb7149eefa31bE;
    if (___ZN12tracing_core10dispatcher11GLOBAL_INIT17h2e36d73a7bb96473E != 2) {
      puVar5 = (ulong *)&__ZN12tracing_core10dispatcher4NONE17hec1704e7c8575e04E;
    }
    uVar9 = *puVar5;
  }
  uVar8 = puVar5[1];
  if ((uVar9 & 1) != 0) {
    uVar8 = uVar8 + (*(long *)(puVar5[2] + 0x10) - 1U & 0xfffffffffffffff0) + 0x10;
  }
  cVar4 = (**(code **)(puVar5[2] + 0x20))(uVar8,*unaff_x21);
  cVar2 = *unaff_x19;
  cVar1 = cVar2;
  if (cVar2 != cVar4) {
    cVar1 = '\x01';
  }
  if (cVar2 != '\x03') {
    cVar4 = cVar1;
  }
  *unaff_x19 = cVar4;
  plVar7 = (long *)(*unaff_x23)();
  *plVar7 = *plVar7 + -1;
  *(undefined1 *)(plVar7 + 4) = 1;
  return;
}

