
void FUN_00401704(long param_1,long *param_2)

{
  undefined8 uVar1;
  code *pcVar2;
  long lVar3;
  uint in_w9;
  long lVar4;
  long *unaff_x19;
  ulong unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  
  while( true ) {
    if ((uint)unaff_x20 < in_w9) {
      lVar4 = unaff_x20 + 1;
      if (unaff_x22 == 0) {
        lVar3 = (long)unaff_x21;
      }
      else {
        lVar3 = (long)unaff_x21 + lVar4 * 8;
        lVar4 = unaff_x22;
        do {
          lVar3 = *(long *)(lVar3 + 0x220);
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
        lVar4 = 0;
      }
      *(long *)(unaff_x23 + 8) = lVar3;
      *(undefined8 *)(unaff_x23 + 0x10) = 0;
      *(long *)(unaff_x23 + 0x18) = lVar4;
      *unaff_x19 = (long)unaff_x21;
      unaff_x19[1] = unaff_x22;
      unaff_x19[2] = unaff_x20;
      return;
    }
    unaff_x21 = (long *)*param_2;
    if (unaff_x21 == (long *)0x0) break;
    unaff_x22 = param_1 + 1;
    unaff_x20 = (ulong)*(ushort *)(param_2 + 0x43);
    uVar1 = unaff_x25;
    if (param_1 != 0) {
      uVar1 = unaff_x24;
    }
    func_0x00187bd4(param_2,uVar1,8);
    in_w9 = (uint)*(ushort *)((long)unaff_x21 + 0x21a);
    param_2 = unaff_x21;
    param_1 = unaff_x22;
  }
  uVar1 = 0x220;
  if (param_1 != 0) {
    uVar1 = 0x280;
  }
  func_0x00187bd4(param_2,uVar1,8);
  func_0x007a23bc(&UNK_009d9668);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4017e8);
  (*pcVar2)();
}

