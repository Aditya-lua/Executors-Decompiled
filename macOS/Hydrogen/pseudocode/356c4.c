
void FUN_000356c4(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  long unaff_x29;
  undefined1 uStack00000000000000c0;
  
  func_0x0002d418(&uStack00000000000000c0);
  func_0x0002d4f0(unaff_x29 + -0x78);
  uVar1 = __Unwind_Resume();
  func_0x0002d418(&uStack00000000000000c0);
  func_0x0002d4f0(unaff_x29 + -0x78);
  lVar2 = __Unwind_Resume(uVar1);
  puVar3 = *(undefined8 **)(lVar2 + 8);
  puVar4 = *(undefined8 **)(lVar2 + 0x10);
  if (puVar4 == puVar3) {
    *(undefined8 *)(lVar2 + 0x28) = 0;
    uVar5 = (long)puVar4 - (long)puVar3;
  }
  else {
    uVar5 = *(ulong *)(lVar2 + 0x20);
    plVar6 = puVar3 + uVar5 / 0x2a;
    lVar7 = *plVar6 + (uVar5 % 0x2a) * 0x60;
    uVar5 = *(long *)(lVar2 + 0x28) + uVar5;
    lVar8 = puVar3[uVar5 / 0x2a] + (uVar5 % 0x2a) * 0x60;
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
      puVar3 = *(undefined8 **)(lVar2 + 8);
      puVar4 = *(undefined8 **)(lVar2 + 0x10);
    }
    *(long *)(lVar2 + 0x28) = 0;
    uVar5 = (long)puVar4 - (long)puVar3;
  }
  while (0x10 < uVar5) {
    __ZdlPv(*puVar3);
    puVar3 = (undefined8 *)(*(long *)(lVar2 + 8) + 8);
    *(undefined8 **)(lVar2 + 8) = puVar3;
    uVar5 = *(long *)(lVar2 + 0x10) - (long)puVar3;
  }
  if (uVar5 >> 3 == 1) {
    uVar1 = 0x15;
  }
  else {
    if (uVar5 >> 3 != 2) {
      return;
    }
    uVar1 = 0x2a;
  }
  *(undefined8 *)(lVar2 + 0x20) = uVar1;
  return;
}

