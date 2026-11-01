
undefined8 FUN_0010f7a0(void)

{
  char *pcVar1;
  uint uVar2;
  int iVar3;
  char *pcVar4;
  long unaff_x19;
  uint *unaff_x20;
  uint unaff_w21;
  ulong uVar5;
  bool bVar6;
  undefined4 *unaff_x24;
  undefined8 uStack0000000000000008;
  
  func_0x000d4200(&uStack0000000000000008);
  iVar3 = func_0x0010e854();
  if (iVar3 != 0) {
    if ((int)unaff_w21 < 1) {
      func_0x000d9c4c(0);
    }
    else {
      uVar5 = 0;
      bVar6 = false;
      do {
        pcVar4 = *(char **)(unaff_x19 + uVar5 * 8);
        pcVar1 = "*Unknown item*";
        if (pcVar4 != (char *)0x0) {
          pcVar1 = pcVar4;
        }
        func_0x000d505c(uVar5);
        uVar2 = *unaff_x20;
        uStack0000000000000008 = 0;
        iVar3 = func_0x0010f27c(pcVar1,uVar5 == uVar2,0,&uStack0000000000000008);
        if ((iVar3 != 0) && (uVar5 != *unaff_x20)) {
          *unaff_x20 = (uint)uVar5;
          bVar6 = true;
        }
        if (uVar5 == uVar2) {
          func_0x000d4958();
        }
        func_0x000d53d0();
        uVar5 = uVar5 + 1;
      } while (unaff_w21 != uVar5);
      func_0x000d9c4c();
      if (bVar6) {
        func_0x000c255c(*unaff_x24);
        return 1;
      }
    }
  }
  return 0;
}

