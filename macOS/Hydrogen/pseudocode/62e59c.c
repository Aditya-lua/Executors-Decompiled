
void FUN_0062e59c(long param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  int iVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long in_x9;
  long in_x10;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  long in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  long in_stack_00000090;
  
  while( true ) {
    lVar8 = in_x10 + param_1 * in_x9;
    func_0x005ffccc(unaff_x24 + 8,unaff_x19 + lVar8 * unaff_x27 + 8);
    func_0x005ffccc(unaff_x24 + 0x38,unaff_x19 + lVar8 * unaff_x27 + 0x38);
    *(undefined1 *)(unaff_x24 + 0x68) = *(undefined1 *)(unaff_x19 + lVar8 * unaff_x27 + 0x68);
    plVar4 = (long *)(*(long *)(unaff_x29 + -0x70) + unaff_x25 * unaff_x26);
    uVar5 = (plVar4[1] - *plVar4 >> 4) * 0x6db6db6db6db6db7;
    if (1 < uVar5) {
      iVar3 = (int)uVar5;
      if (2 < iVar3) {
        lVar8 = (ulong)(iVar3 - 2) + 1;
        do {
          (**(code **)(*unaff_x20 + 0x48))();
          (**(code **)(*unaff_x20 + 0x48))();
          lVar8 = lVar8 + -1;
        } while (1 < lVar8);
      }
      (**(code **)(*unaff_x20 + 0x48))();
      (**(code **)(*unaff_x20 + 0x38))();
      lVar8 = (**(code **)(*unaff_x20 + 0x20))();
      func_0x005ffccc(unaff_x24 + 8,lVar8 + 8);
      func_0x005ffccc(unaff_x24 + 0x38,lVar8 + 0x38);
      *(undefined1 *)(unaff_x24 + 0x68) = *(undefined1 *)(lVar8 + 0x68);
    }
    unaff_x24 = unaff_x24 + 0x70;
    unaff_x25 = unaff_x25 + 1;
    if (unaff_x25 == in_stack_00000028) break;
    plVar4 = (long *)(*(long *)(unaff_x29 + -0x70) + unaff_x25 * unaff_x26);
    unaff_x19 = *plVar4;
    param_1 = plVar4[1] - unaff_x19 >> 4;
    in_x9 = 0x6db6db6db6db6db7;
    in_x10 = in_stack_00000030;
  }
  if (in_stack_00000088 <= in_stack_00000080) {
    in_stack_00000080 = in_stack_00000088;
  }
  if (in_stack_00000090 != 0) {
    if (in_stack_00000080 != 0) {
      do {
        *(undefined8 *)(in_stack_00000090 + -8 + in_stack_00000080 * 8) = 0;
        in_stack_00000080 = in_stack_00000080 - 1;
      } while (in_stack_00000080 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000058 <= in_stack_00000050) {
    in_stack_00000050 = in_stack_00000058;
  }
  if (in_stack_00000060 != 0) {
    if (in_stack_00000050 != 0) {
      do {
        *(undefined8 *)(in_stack_00000060 + -8 + in_stack_00000050 * 8) = 0;
        in_stack_00000050 = in_stack_00000050 - 1;
      } while (in_stack_00000050 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x0064b344(unaff_x29 + -0x88);
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
  }
  puVar7 = *(undefined8 **)(unaff_x29 + -0x70);
  if (puVar7 != (undefined8 *)0x0) {
    puVar2 = puVar7;
    if (*(undefined8 **)(unaff_x29 + -0x68) != puVar7) {
      puVar2 = *(undefined8 **)(unaff_x29 + -0x68);
      do {
        puVar9 = puVar2 + -3;
        puVar10 = (undefined8 *)*puVar9;
        if (puVar10 != (undefined8 *)0x0) {
          puVar6 = (undefined8 *)puVar2[-2];
          puVar1 = puVar10;
          if (puVar6 != puVar10) {
            do {
              puVar6 = puVar6 + -0xe;
              (**(code **)*puVar6)(puVar6);
            } while (puVar6 != puVar10);
            puVar1 = (undefined8 *)*puVar9;
          }
          puVar2[-2] = puVar10;
          __ZdlPv(puVar1);
        }
        puVar2 = puVar9;
      } while (puVar9 != puVar7);
      puVar2 = *(undefined8 **)(unaff_x29 + -0x70);
    }
    *(undefined8 **)(unaff_x29 + -0x68) = puVar7;
    __ZdlPv(puVar2);
  }
  return;
}

