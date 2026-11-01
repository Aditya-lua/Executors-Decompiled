
undefined8 FUN_0073e6f4(void)

{
  byte bVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  char *unaff_x21;
  byte *unaff_x22;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if ((unaff_x21 == (char *)0x0) || (*unaff_x21 == '\0')) {
    func_0x0074066c(&uStack0000000000000020,&UNK_00002710);
    bVar1 = *unaff_x22;
  }
  else {
    func_0x0074066c(&uStack0000000000000020,&UNK_00002710);
    bVar1 = *unaff_x22;
  }
  do {
    if (bVar1 == 0) {
      lVar4 = func_0x00740a58(&uStack0000000000000020);
      if (lVar4 == 0) {
        uVar5 = 0x1b;
      }
      else {
        uVar5 = func_0x0073eae4();
        if ((int)uVar5 == 0) {
          func_0x00783e98();
        }
        else {
          func_0x0073c9e4();
        }
      }
code_r0x0073e93c:
      (*pcRam0000000000a2b5f0)(lVar4);
      (*pcRam0000000000a2b5f0)(in_stack_00000018);
      return uVar5;
    }
    if (((((bVar1 - 0x7f & 0xff) < 0xa2) ||
         ((uVar2 = bVar1 - 0x22, uVar2 < 0x3b &&
          ((1L << ((ulong)uVar2 & 0x3f) & 0x400000000000021U) != 0)))) &&
        (iVar3 = func_0x0074075c(&uStack0000000000000020,"\\",1), iVar3 != 0)) ||
       (iVar3 = func_0x0074075c(&uStack0000000000000020,unaff_x22,1), iVar3 != 0)) {
      lVar4 = 0;
      uVar5 = 0x1b;
      goto code_r0x0073e93c;
    }
    unaff_x22 = unaff_x22 + 1;
    bVar1 = *unaff_x22;
  } while( true );
}

