
undefined1  [16] thunk_FUN_00537ae8(void)

{
  int iVar1;
  long lVar2;
  undefined *puVar3;
  ulong in_x3;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x25;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  
  do {
    if (unaff_x23 < unaff_x22) {
      puVar3 = &UNK_009ebd90;
      auVar5 = func_0x007a28a4(unaff_x23 + 1);
      if (auVar5._8_8_ < in_x3) {
        lVar2 = 0;
      }
      else {
        lVar2 = auVar5._0_8_ + in_x3;
        iVar1 = _memcmp(auVar5._0_8_,puVar3,in_x3);
        if (iVar1 != 0) {
          lVar2 = 0;
        }
      }
      auVar5._8_8_ = auVar5._8_8_ - in_x3;
      auVar5._0_8_ = lVar2;
      return auVar5;
    }
    if ((unaff_x19 <= unaff_x23 - unaff_x22) && (iVar1 = _memcmp(), iVar1 == 0)) goto LAB_00537b2c;
    unaff_x22 = unaff_x22 + 1;
  } while (unaff_x22 != unaff_x25);
  iVar1 = _memcmp();
  unaff_x20 = (ulong)(iVar1 == 0);
  unaff_x22 = unaff_x25;
LAB_00537b2c:
  auVar4._8_8_ = unaff_x22;
  auVar4._0_8_ = unaff_x20;
  return auVar4;
}

