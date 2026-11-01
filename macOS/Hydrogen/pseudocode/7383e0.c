
void FUN_007383e0(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  long lVar4;
  byte unaff_w23;
  char *pcVar5;
  undefined1 uStack0000000000000010;
  
  if ((unaff_x21 == (char *)0x0) || (*unaff_x21 == '\0')) {
LAB_00738538:
    *(byte *)(unaff_x19 + 0x7f0) = *(byte *)(unaff_x19 + 0x7f0) & 0xfe;
  }
  else {
    iVar1 = _strcmp();
    if (iVar1 == 0) {
      lVar4 = *(long *)PTR____stdinp_009b01f8;
      *(byte *)(unaff_x19 + 0x7f0) = unaff_w23 & 0xfe;
      if (lVar4 == 0) goto LAB_00738544;
      lVar2 = 0;
    }
    else {
      lVar2 = _fopen();
      if (lVar2 == 0) {
        if ((*(char *)(unaff_x20 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        goto LAB_00738538;
      }
      *(byte *)(unaff_x19 + 0x7f0) = *(byte *)(unaff_x19 + 0x7f0) & 0xfe;
      lVar4 = lVar2;
    }
    func_0x0074066c(&uStack0000000000000010,&UNK_00001388);
    iVar1 = func_0x0073aa84(&uStack0000000000000010,lVar4);
    while (iVar1 != 0) {
      lVar3 = func_0x00740a58(&uStack0000000000000010);
      iVar1 = func_0x0077e76c(lVar3,"Set-Cookie:",0xb);
      if ((iVar1 != 0) && (pcVar5 = (char *)(lVar3 + 0xb), *pcVar5 == ' ' || *pcVar5 == '\t')) {
        do {
          pcVar5 = pcVar5 + 1;
        } while (*pcVar5 == ' ' || *pcVar5 == '\t');
      }
      func_0x00738578();
      iVar1 = func_0x0073aa84(&uStack0000000000000010,lVar4);
    }
    func_0x00740678(&uStack0000000000000010);
    func_0x007395bc();
    if (lVar2 != 0) {
      _fclose(lVar2);
    }
  }
LAB_00738544:
  *(uint *)(&UNK_00001344 + unaff_x20) = *(uint *)(&UNK_00001344 + unaff_x20) | 0x2000;
  *(byte *)(unaff_x19 + 0x7f0) = *(byte *)(unaff_x19 + 0x7f0) | 1;
  return;
}

