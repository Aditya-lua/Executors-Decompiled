
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_00655f80(void)

{
  long *plVar1;
  long lVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long unaff_x19;
  long unaff_x22;
  
  func_0x00611644();
  if (unaff_x22 != 0) {
    do {
      (*(code *)**(undefined8 **)(unaff_x19 + -0x50 + unaff_x22))();
      unaff_x22 = unaff_x22 + -0x50;
    } while (unaff_x22 != 0);
  }
  puVar3 = (undefined8 *)__Unwind_Resume();
  puVar3[-1] = &UNK_00a09bc0;
  *puVar3 = &UNK_00a09ca8;
  puVar3[1] = &UNK_00a09d00;
  puVar3[2] = &UNK_00a02900;
  puVar3[3] = &UNK_00a029a0;
  puVar3[4] = &UNK_00a02a70;
  func_0x00631cc8(puVar3 + 0x34);
  puVar3[3] = &UNK_00a02ae8;
  puVar3[4] = &UNK_00a02bb8;
  lVar2 = _UNK_009fb230;
  plVar1 = puVar3 + 5;
  *plVar1 = _UNK_009fb230;
  *(undefined8 *)((long)plVar1 + *(long *)(lVar2 + -0x70)) = _UNK_009fb278;
  puVar3[0x2d] = &UNK_009f5d60;
  lVar2 = puVar3[0x31];
  uVar4 = puVar3[0x2f];
  if ((ulong)puVar3[0x30] <= (ulong)puVar3[0x2f]) {
    uVar4 = puVar3[0x30];
  }
  if (lVar2 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  puVar3[0x27] = &UNK_009f5d60;
  lVar2 = puVar3[0x2b];
  uVar4 = puVar3[0x29];
  if ((ulong)puVar3[0x2a] <= (ulong)puVar3[0x29]) {
    uVar4 = puVar3[0x2a];
  }
  if (lVar2 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  puVar3[0x23] = &UNK_009f6678;
  if (puVar3[0x24] != 0) {
    puVar3[0x25] = puVar3[0x24];
    __ZdlPv();
  }
  lVar2 = _UNK_009fb238;
  *plVar1 = _UNK_009fb238;
  *(undefined8 *)((long)plVar1 + *(long *)(lVar2 + -0x70)) = _UNK_009fb270;
  func_0x00631cc8(puVar3 + 10);
  puVar3[7] = &UNK_00a09aa0;
  if ((long *)puVar3[9] != (long *)0x0) {
    (**(code **)(*(long *)puVar3[9] + 8))();
  }
  if ((long *)puVar3[8] != (long *)0x0) {
    (**(code **)(*(long *)puVar3[8] + 8))();
  }
  return plVar1;
}

