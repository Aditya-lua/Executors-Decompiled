
undefined8 FUN_0078a818(void)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  bool bVar4;
  char cVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  long unaff_x19;
  uint unaff_w20;
  int unaff_w21;
  long lVar9;
  char *unaff_x22;
  long unaff_x23;
  ulong unaff_x25;
  long *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000040;
  
  while( true ) {
    while (*unaff_x22 == '%') {
      bVar1 = unaff_x22[1];
      if (((bVar1 - 0x30 & 0xff) < 10) ||
         (uVar3 = bVar1 - 0x41,
         uVar3 < 0x26 && (unaff_x23 << ((ulong)uVar3 & 0x3f) & 0x3f0000003fU) != 0)) {
        bVar2 = unaff_x22[2];
        if (((bVar2 - 0x30 & 0xff) < 10) ||
           (uVar3 = bVar2 - 0x41,
           uVar3 < 0x26 && (unaff_x23 << ((ulong)uVar3 & 0x3f) & 0x3f0000003fU) != 0)) {
          bVar4 = (byte)(bVar1 + 0xbf) < 0x1a;
          if ((!bVar4 && 0x18 < (byte)(bVar2 + 0xbf)) && (bVar4 || (byte)(bVar2 + 0xbf) != 0x19)) {
            unaff_x22 = unaff_x22 + 1;
          }
          else {
            cVar5 = func_0x0077e6e4((int)(char)bVar1);
            unaff_x22[1] = cVar5;
            cVar5 = func_0x0077e6e4((long)unaff_x22[2]);
            unaff_x22[2] = cVar5;
            unaff_x22 = unaff_x22 + 3;
          }
        }
        else {
          unaff_x22 = unaff_x22 + 1;
        }
      }
      else {
        unaff_x22 = unaff_x22 + 1;
      }
    }
    if (*unaff_x22 == '\0') break;
    unaff_x22 = unaff_x22 + 1;
  }
  lVar7 = func_0x00740a58(&uStack0000000000000040);
  if ((in_stack_00000010._4_4_ == 0) || (lVar7 == 0)) {
    if ((unaff_w21 == 5) &&
       ((lVar9 = func_0x00156654(&uStack0000000000000040), (unaff_w20 >> 10 & 1) == 0 ||
        (lVar9 != 0)))) {
      if (lVar9 == 0) {
code_r0x0078a9e4:
        func_0x00740678(&uStack0000000000000040);
        return 0x15;
      }
      if ((unaff_x25 & 1) == 0) {
        uStack0000000000000018 = 0;
        iVar6 = func_0x00742734(lVar7,lVar9,&uStack0000000000000018,&uStack0000000000000020,3);
        if ((iVar6 != 0) || (iVar6 = func_0x0078b6d8(), iVar6 != 0)) {
          (*pcRam0000000000a2b5f0)(uStack0000000000000018);
          goto code_r0x0078a9e4;
        }
        (*pcRam0000000000a2b5f0)(uStack0000000000000018);
      }
      else {
        iVar6 = func_0x0078b6d8();
        if (iVar6 != 0) goto code_r0x0078a9e4;
      }
    }
  }
  else {
    lVar9 = *(long *)(unaff_x19 + 0x40);
    if ((lVar9 != 0) && (lVar8 = _strlen(lVar9), lVar8 != 0)) {
      cVar5 = *(char *)(lVar8 + lVar9 + -1);
      func_0x0074066c(&uStack0000000000000020,&UNK_007a1200);
      iVar6 = func_0x0074075c(&uStack0000000000000020,*(undefined8 *)(unaff_x19 + 0x40),lVar8);
      if ((iVar6 == 0) &&
         (((cVar5 == '&' || (iVar6 = func_0x0074075c(&uStack0000000000000020,"&",1), iVar6 == 0)) &&
          (iVar6 = func_0x007408a0(&uStack0000000000000020,lVar7), iVar6 == 0)))) {
        func_0x00740678(&uStack0000000000000040);
        (*pcRam0000000000a2b5f0)(*in_stack_00000008);
        lVar7 = func_0x00740a58(&uStack0000000000000020);
        *in_stack_00000008 = lVar7;
        return 0;
      }
      func_0x00740678(&uStack0000000000000040);
      return 7;
    }
  }
  (*pcRam0000000000a2b5f0)(*in_stack_00000008);
  *in_stack_00000008 = lVar7;
  return 0;
}

