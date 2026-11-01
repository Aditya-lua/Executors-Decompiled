
void FUN_00661b00(void)

{
  int iVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long lVar3;
  long lVar4;
  
  uVar2 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar2,0x3b);
  if ((char)unaff_x19[4] == '\0') {
    lVar3 = unaff_x19[1];
    iVar1 = _strncmp(lVar3,"ThisObject:",0xb);
    if ((iVar1 == 0) && (iVar1 = _strcmp(lVar3 + 0xb,&UNK_008bdbb8), iVar1 == 0)) {
      func_0x0003eef0(lVar3,&UNK_009ff5b0,unaff_x19[2]);
      lVar3 = *unaff_x19;
      lVar4 = unaff_x19[3];
      func_0x0064e79c(lVar4 + 0x18,lVar3 + 0x18);
      func_0x005ffccc(lVar4 + 0x100,lVar3 + 0x100);
      *(undefined4 *)(lVar4 + 0x130) = *(undefined4 *)(lVar3 + 0x130);
      func_0x005ffccc(lVar4 + 0x138,lVar3 + 0x138);
      if (lVar4 != lVar3) {
        func_0x0064e988(lVar4 + 0x168,*(long *)(lVar3 + 0x168),*(long *)(lVar3 + 0x170),
                        (*(long *)(lVar3 + 0x170) - *(long *)(lVar3 + 0x168) >> 4) *
                        -0x5555555555555555);
      }
      *(undefined1 *)(unaff_x19 + 4) = 1;
      return;
    }
  }
  return;
}

