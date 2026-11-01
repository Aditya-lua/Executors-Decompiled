
void FUN_005a8064(void)

{
  char cVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x24;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  
  while( true ) {
    uVar7 = (ulong)*(ushort *)(unaff_x21 + 0x322);
    lVar8 = uVar7 * 0x18;
    uVar6 = 0xffffffffffffffff;
    lVar4 = unaff_x21 + 0x218;
    do {
      if (lVar8 == 0) {
        uVar6 = uVar7;
        if (unaff_x20 != 0) goto code_r0x005a8058;
        goto code_r0x005a8090;
      }
      lVar2 = *(long *)(lVar4 + 0x10);
      iVar3 = _memcmp();
      lVar2 = unaff_x24 - lVar2;
      if (iVar3 != 0) {
        lVar2 = (long)iVar3;
      }
      cVar1 = 0 < lVar2;
      if (lVar2 < 0) {
        cVar1 = -1;
      }
      lVar8 = lVar8 + -0x18;
      uVar6 = uVar6 + 1;
      lVar4 = lVar4 + 0x18;
    } while (cVar1 == '\x01');
    if (cVar1 == '\0') break;
    uVar7 = uVar6;
    if (unaff_x20 == 0) {
code_r0x005a8090:
      uVar5 = 1;
code_r0x005a806c:
      unaff_x19[2] = unaff_x20;
      unaff_x19[3] = uVar6;
      *unaff_x19 = uVar5;
      unaff_x19[1] = unaff_x21;
      return;
    }
code_r0x005a8058:
    unaff_x21 = *(long *)(unaff_x21 + uVar7 * 8 + 0x328);
    unaff_x20 = unaff_x20 + -1;
  }
  uVar5 = 0;
  goto code_r0x005a806c;
}

