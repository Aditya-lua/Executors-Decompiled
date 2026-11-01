
void FUN_006eed44(undefined1 param_1 [16])

{
  long lVar1;
  char cVar2;
  long lVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  
  unaff_x23[1] = param_1._8_8_;
  *unaff_x23 = param_1._0_8_;
  *(undefined8 **)(unaff_x19 + 8) = unaff_x23 + 2;
  *(undefined8 *)(unaff_x19 + 0x10) = *unaff_x20;
  unaff_x20[2] = unaff_x23 + 2;
  lVar3 = *(long *)(unaff_x19 + 0x40);
  (*(code *)(*(long *)(unaff_x22 + 0x20) + unaff_x22 + 0x20))();
  *(long *)(unaff_x19 + 0x20) = (long)unaff_x20 + (*(long *)(unaff_x19 + 0x40) - lVar3);
  func_0x006ef974();
  if ((20000 < *(int *)(unaff_x19 + 0x4c)) &&
     (lVar3 = *(long *)(unaff_x19 + 0x40),
     (int)((ulong)(*(long *)(unaff_x19 + 0x20) - lVar3) >> 3) * -0x33333333 < 19999)) {
    lVar1 = func_0x006f3d14();
    *(undefined4 *)(unaff_x19 + 0x4c) = 20000;
    *(long *)(unaff_x19 + 0x20) = lVar1 + (*(long *)(unaff_x19 + 0x20) - lVar3);
    *(undefined **)(unaff_x19 + 0x38) = &UNK_000c34d8 + lVar1;
    *(long *)(unaff_x19 + 0x40) = lVar1;
  }
  func_0x00700a04();
  cVar2 = *(char *)(unaff_x19 + 3);
  if (cRam0000000000a336b8 != '\0') goto LAB_006eeeb0;
LAB_006eee88:
  if ((cVar2 != '\0') || (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x40))) {
    return;
  }
  lVar3 = **(long **)(*(ulong *)(unaff_x19 + 0x20) + 8);
  if (*(char *)(lVar3 + 3) != '\0') goto LAB_006eeee0;
  do {
    (*pcRam0000000000a401e0)();
    cVar2 = *(char *)(unaff_x19 + 3);
    while( true ) {
      if (cRam0000000000a336b8 == '\0') goto LAB_006eee88;
LAB_006eeeb0:
      if ((cVar2 != '\0') && (cVar2 != '\x7f')) {
        return;
      }
      if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x40)) {
        return;
      }
      *(undefined1 *)(unaff_x19 + 3) = 0;
      lVar3 = **(long **)(*(ulong *)(unaff_x19 + 0x20) + 8);
      if (*(char *)(lVar3 + 3) == '\0') break;
LAB_006eeee0:
      (*(code *)(*(long *)(lVar3 + 0x20) + lVar3 + 0x20))();
      if (*(char *)(unaff_x19 + 3) == '\x01') {
        return;
      }
      if (*(char *)(unaff_x19 + 3) == '\x06') {
        return;
      }
      func_0x00700a04();
      cVar2 = *(char *)(unaff_x19 + 3);
    }
  } while( true );
}

