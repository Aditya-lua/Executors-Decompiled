
void thunk_FUN_000356e0(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  long unaff_x29;
  undefined1 uStack00000000000000c0;
  
  func_0x0002d418(&uStack00000000000000c0);
  func_0x0002d4f0(unaff_x29 + -0x78);
  lVar1 = __Unwind_Resume(param_1);
  puVar2 = *(undefined8 **)(lVar1 + 8);
  puVar4 = *(undefined8 **)(lVar1 + 0x10);
  if (puVar4 == puVar2) {
    *(undefined8 *)(lVar1 + 0x28) = 0;
    uVar5 = (long)puVar4 - (long)puVar2;
  }
  else {
    uVar5 = *(ulong *)(lVar1 + 0x20);
    plVar6 = puVar2 + uVar5 / 0x2a;
    lVar7 = *plVar6 + (uVar5 % 0x2a) * 0x60;
    uVar5 = *(long *)(lVar1 + 0x28) + uVar5;
    lVar8 = puVar2[uVar5 / 0x2a] + (uVar5 % 0x2a) * 0x60;
    if (lVar7 != lVar8) {
      do {
        if (*(long *)(lVar7 + 0x38) != 0) {
          *(long *)(lVar7 + 0x40) = *(long *)(lVar7 + 0x38);
          __ZdlPv();
        }
        if (*(long *)(lVar7 + 0x20) != 0) {
          *(long *)(lVar7 + 0x28) = *(long *)(lVar7 + 0x20);
          __ZdlPv();
        }
        lVar7 = lVar7 + 0x60;
        if (lVar7 - *plVar6 == 0xfc0) {
          plVar6 = plVar6 + 1;
          lVar7 = *plVar6;
        }
      } while (lVar7 != lVar8);
      puVar2 = *(undefined8 **)(lVar1 + 8);
      puVar4 = *(undefined8 **)(lVar1 + 0x10);
    }
    *(long *)(lVar1 + 0x28) = 0;
    uVar5 = (long)puVar4 - (long)puVar2;
  }
  while (0x10 < uVar5) {
    __ZdlPv(*puVar2);
    puVar2 = (undefined8 *)(*(long *)(lVar1 + 8) + 8);
    *(undefined8 **)(lVar1 + 8) = puVar2;
    uVar5 = *(long *)(lVar1 + 0x10) - (long)puVar2;
  }
  if (uVar5 >> 3 == 1) {
    uVar3 = 0x15;
  }
  else {
    if (uVar5 >> 3 != 2) {
      return;
    }
    uVar3 = 0x2a;
  }
  *(undefined8 *)(lVar1 + 0x20) = uVar3;
  return;
}

