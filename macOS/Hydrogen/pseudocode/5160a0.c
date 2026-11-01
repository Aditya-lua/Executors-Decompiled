
void FUN_005160a0(long param_1)

{
  code *pcVar1;
  long in_x9;
  undefined8 in_x10;
  undefined8 *unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long lVar2;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar3;
  undefined8 *puVar4;
  
  *unaff_x19 = in_x10;
  unaff_x19[1] = in_x10;
  unaff_x19[2] = 0;
  unaff_x19[3] = in_x10;
  if (param_1 - in_x9 != 0) {
    uVar3 = (ulong)(param_1 - in_x9) >> 5;
    puVar4 = (undefined8 *)(in_x9 + 0x10);
    do {
      if (puVar4[-1] != 0) {
        func_0x00187bd4(*puVar4,puVar4[-1],1);
      }
      puVar4 = puVar4 + 4;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
  }
  if (unaff_x23 != 0) {
    lVar2 = (unaff_x25 >> 4) * 0x18;
    if (unaff_x22 != lVar2) {
      if (unaff_x22 == 0) {
        unaff_x21 = 8;
      }
      else {
        unaff_x21 = func_0x00187bd8();
        if (unaff_x21 == 0) {
          func_0x007a1f18(8,lVar2);
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x516128);
          (*pcVar1)();
        }
      }
    }
  }
  *unaff_x20 = unaff_x25 >> 4;
  unaff_x20[1] = unaff_x21;
  unaff_x20[2] = unaff_x24;
  return;
}

