
void FUN_0019dbb8(undefined8 param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  bool bVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 uVar6;
  ulong *puVar7;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000010;
  ulong *puStack_78;
  long lStack_70;
  char cStack_68;
  
  uVar6 = func_0x007a26e4(0,param_2,param_3,&uStack0000000000000010);
  lVar3 = *uStack0000000000000010;
  *uStack0000000000000010 = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403874(&uStack0000000000000010);
  }
  __Unwind_Resume(uVar6);
  auVar8 = func_0x007a2668();
  puVar7 = auVar8._0_8_;
  uVar5 = *puVar7;
  do {
    while (uVar1 = uVar5 & 3, uVar1 == 0) {
      if (auVar8._8_8_ == 0) goto LAB_0019dc68;
      uVar1 = uVar5 + 1;
      bVar2 = *puVar7 == uVar5;
      uVar5 = *puVar7;
      if (bVar2) {
        *puVar7 = uVar1;
        lStack_70 = 0;
        puStack_78 = puVar7;
        uVar5 = (**(code **)(param_3 + 0x20))(auVar8._8_8_);
        if ((uVar5 & 1) != 0) {
          lStack_70 = 2;
        }
        func_0x0019dafc(&puStack_78);
        return;
      }
    }
    if (uVar1 != 1) {
      if (uVar1 == 2) {
        return;
      }
      do {
                    /* WARNING: Do nothing block with infinite loop */
      } while( true );
    }
LAB_0019dc68:
    puStack_78 = (ulong *)func_0x00411da8();
    lStack_70 = uVar5 - uVar1;
    cStack_68 = '\0';
    if (*puVar7 == uVar5) {
      *puVar7 = (long)&puStack_78 + uVar1;
    }
    else {
      uVar5 = *puVar7;
      do {
        cStack_68 = '\0';
        if ((uVar5 & 3) != uVar1) goto code_r0x0019dcf8;
        if (puStack_78 != (ulong *)0x0) {
          uVar4 = *puStack_78;
          *puStack_78 = uVar4 - 1;
          LORelease();
          if (uVar4 == 1) {
            DataMemoryBarrier(2,1);
            func_0x00403874(&puStack_78);
          }
        }
        puStack_78 = (ulong *)func_0x00411da8();
        lStack_70 = uVar5 - uVar1;
        cStack_68 = '\0';
        bVar2 = *puVar7 != uVar5;
        uVar5 = *puVar7;
      } while (bVar2);
      *puVar7 = (long)&puStack_78 + uVar1;
    }
    while (cStack_68 == '\0') {
      func_0x004127a8();
    }
code_r0x0019dcf8:
    if (puStack_78 != (ulong *)0x0) {
      uVar5 = *puStack_78;
      *puStack_78 = uVar5 - 1;
      LORelease();
      if (uVar5 == 1) {
        DataMemoryBarrier(2,1);
        func_0x00403874(&puStack_78);
      }
    }
    uVar5 = *puVar7;
  } while( true );
}

