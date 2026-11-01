
uint FUN_0010fac0(void)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  char in_NG;
  char in_OV;
  int iVar4;
  int iVar5;
  code *unaff_x20;
  int *unaff_x21;
  int iVar6;
  ulong unaff_x22;
  uint unaff_w23;
  long unaff_x24;
  long unaff_x25;
  undefined1 uStack0000000000000008;
  uint uStack0000000000000010;
  int iStack0000000000000014;
  undefined8 uStack0000000000000038;
  
  do {
    if (in_NG == in_OV) {
      do {
        iVar4 = func_0x000bb10c(&uStack0000000000000008);
        if (iVar4 == 0) {
          func_0x000d0b80();
          func_0x000d818c();
          if ((unaff_w23 & 1) != 0) {
            func_0x000c255c(*(undefined4 *)(&UNK_000049a8 + unaff_x24));
          }
          func_0x000bab70(&uStack0000000000000008);
          return unaff_w23 & 1;
        }
        unaff_x22 = (ulong)uStack0000000000000010;
      } while (iStack0000000000000014 <= (int)uStack0000000000000010);
    }
    uStack0000000000000038 = 0;
    (*unaff_x20)();
    lVar3 = uStack0000000000000038;
    func_0x000d505c(unaff_x22);
    lVar2 = unaff_x25;
    if (lVar3 != 0) {
      lVar2 = lVar3;
    }
    iVar4 = *unaff_x21;
    iVar6 = (int)unaff_x22;
    uStack0000000000000038 = 0;
    iVar5 = func_0x0010f27c(lVar2,iVar6 == iVar4,0,&uStack0000000000000038);
    if (iVar5 != 0) {
      *unaff_x21 = iVar6;
      unaff_w23 = 1;
    }
    if (iVar6 == iVar4) {
      func_0x000d4958();
    }
    func_0x000d53d0();
    uVar1 = iVar6 + 1;
    unaff_x22 = (ulong)uVar1;
    in_OV = SBORROW4(uVar1,iStack0000000000000014);
    in_NG = (int)(uVar1 - iStack0000000000000014) < 0;
  } while( true );
}

