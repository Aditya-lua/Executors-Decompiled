
void FUN_005edd80(void)

{
  bool bVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong uVar3;
  ulong unaff_x27;
  undefined8 uStack0000000000000008;
  char in_stack_00000018;
  
  do {
    uVar3 = *unaff_x21;
    if (uVar3 == unaff_x26) {
      *unaff_x21 = unaff_x25;
    }
    if (uVar3 != unaff_x27) {
      do {
        if ((uVar3 & 3) != unaff_x24) goto LAB_005eddf8;
        if (uStack0000000000000008 != (long *)0x0) {
          lVar2 = *uStack0000000000000008;
          *uStack0000000000000008 = lVar2 + unaff_x23;
          LORelease();
          if (lVar2 == 1) {
            DataMemoryBarrier(2,1);
            func_0x00403874(&uStack0000000000000008);
          }
        }
        uStack0000000000000008 = (long *)func_0x00411da8();
        in_stack_00000018 = '\0';
        bVar1 = *unaff_x21 != uVar3;
        uVar3 = *unaff_x21;
      } while (bVar1);
      *unaff_x21 = unaff_x25;
    }
    while (in_stack_00000018 == '\0') {
      func_0x004127a8();
    }
LAB_005eddf8:
    if (uStack0000000000000008 != (long *)0x0) {
      lVar2 = *uStack0000000000000008;
      *uStack0000000000000008 = lVar2 + unaff_x23;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x00403874(&uStack0000000000000008);
      }
    }
    unaff_x26 = *unaff_x21;
    while (unaff_x24 = unaff_x26 & 3, unaff_x24 == 0) {
      if (unaff_x19 == 0) goto code_r0x005edd68;
      uVar3 = unaff_x26 + 1;
      bVar1 = *unaff_x21 == unaff_x26;
      unaff_x26 = *unaff_x21;
      if (bVar1) {
        *unaff_x21 = uVar3;
        (**(code **)(unaff_x20 + 0x20))();
        func_0x005edbfc(&uStack0000000000000008);
        return;
      }
    }
    if (unaff_x24 != 1) {
      if (unaff_x24 == 2) {
        return;
      }
      do {
                    /* WARNING: Do nothing block with infinite loop */
      } while( true );
    }
code_r0x005edd68:
    unaff_x25 = unaff_x22 + unaff_x24;
    uStack0000000000000008 = (long *)func_0x00411da8();
    in_stack_00000018 = '\0';
    unaff_x27 = unaff_x26;
  } while( true );
}

