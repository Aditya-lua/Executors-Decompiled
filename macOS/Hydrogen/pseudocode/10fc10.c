
bool FUN_0010fc10(void)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  char *pcVar5;
  code *unaff_x20;
  int *unaff_x21;
  long unaff_x24;
  bool bVar6;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  int iStack0000000000000018;
  int iStack000000000000001c;
  
  func_0x000bab98(&uStack0000000000000010);
  bVar6 = false;
  while (iVar3 = func_0x000bb10c(&uStack0000000000000010), iVar3 != 0) {
    iVar3 = iStack0000000000000018;
    if (iStack0000000000000018 < iStack000000000000001c) {
      do {
        pcVar5 = (char *)(*unaff_x20)();
        func_0x000d505c(iVar3);
        pcVar1 = "*Unknown item*";
        if (pcVar5 != (char *)0x0) {
          pcVar1 = pcVar5;
        }
        iVar2 = *unaff_x21;
        uStack0000000000000008 = 0;
        iVar4 = func_0x0010f27c(pcVar1,iVar3 == iVar2,0,&uStack0000000000000008);
        if (iVar4 != 0) {
          *unaff_x21 = iVar3;
          bVar6 = true;
        }
        if (iVar3 == iVar2) {
          func_0x000d4958();
        }
        func_0x000d53d0();
        iVar3 = iVar3 + 1;
      } while (iVar3 < iStack000000000000001c);
    }
  }
  func_0x000d0b80();
  func_0x000d818c();
  if (bVar6) {
    func_0x000c255c(*(undefined4 *)(&UNK_000049a8 + unaff_x24));
  }
  func_0x000bab70(&uStack0000000000000010);
  return bVar6;
}

