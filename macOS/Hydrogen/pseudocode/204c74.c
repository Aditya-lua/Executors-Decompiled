
void FUN_00204c74(void)

{
  ulong uVar1;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x23;
  
  if ((((unaff_x20 & 1) == 0) && ((*(ulong *)(unaff_x23 + 0x548) & 0x7fffffffffffffff) != 0)) &&
     (uVar1 = func_0x007a1140(), (uVar1 & 1) == 0)) {
    *(undefined1 *)(unaff_x19 + 1) = 1;
  }
  func_0x00430048(*unaff_x19);
  return;
}

