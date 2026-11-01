
uint FUN_0010fa14(int param_1)

{
  char *pcVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  int iVar5;
  code *unaff_x20;
  int *unaff_x21;
  uint unaff_w23;
  long unaff_x24;
  undefined1 uStack0000000000000008;
  int iStack0000000000000010;
  int iStack0000000000000014;
  undefined8 uStack0000000000000038;
  
  if (param_1 != 0) {
    func_0x000ba9b8(&uStack0000000000000008);
    func_0x000d89b8();
    func_0x000bab98(&uStack0000000000000008);
    unaff_w23 = 0;
    while (iVar4 = func_0x000bb10c(&uStack0000000000000008), iVar4 != 0) {
      iVar4 = iStack0000000000000010;
      if (iStack0000000000000010 < iStack0000000000000014) {
        do {
          uStack0000000000000038 = (char *)0x0;
          (*unaff_x20)();
          pcVar3 = uStack0000000000000038;
          func_0x000d505c(iVar4);
          pcVar1 = "*Unknown item*";
          if (pcVar3 != (char *)0x0) {
            pcVar1 = pcVar3;
          }
          iVar2 = *unaff_x21;
          uStack0000000000000038 = (char *)0x0;
          iVar5 = func_0x0010f27c(pcVar1,iVar4 == iVar2,0,&uStack0000000000000038);
          if (iVar5 != 0) {
            *unaff_x21 = iVar4;
            unaff_w23 = 1;
          }
          if (iVar4 == iVar2) {
            func_0x000d4958();
          }
          func_0x000d53d0();
          iVar4 = iVar4 + 1;
        } while (iVar4 < iStack0000000000000014);
      }
    }
    func_0x000d0b80();
    func_0x000d818c();
    if (unaff_w23 != 0) {
      func_0x000c255c(*(undefined4 *)(&UNK_000049a8 + unaff_x24));
    }
    func_0x000bab70(&uStack0000000000000008);
  }
  return unaff_w23 & 1;
}

