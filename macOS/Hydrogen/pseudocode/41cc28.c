
ulong FUN_0041cc28(void)

{
  ulong uVar1;
  code *pcVar2;
  uint *puVar3;
  ulong uVar4;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar5;
  ulong unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  
  while (unaff_x24 != 0) {
    while( true ) {
      uVar4 = unaff_x24;
      if (unaff_x27 <= unaff_x24) {
        uVar4 = unaff_x27;
      }
      uVar4 = _write(1,unaff_x23,uVar4);
      if (uVar4 == 0xffffffffffffffff) break;
      if (uVar4 == 0) goto LAB_0041cc6c;
      uVar1 = unaff_x24 - uVar4;
      if (unaff_x24 < uVar4) {
        func_0x007a28a4(uVar4,unaff_x24,&UNK_009da7a0);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x41ccf8);
        (*pcVar2)();
      }
      unaff_x23 = unaff_x23 + uVar4;
      unaff_x24 = uVar1;
      if (uVar1 == 0) goto LAB_0041cc84;
    }
    puVar3 = (uint *)___error();
    if (*puVar3 != 4) goto code_r0x0041cc64;
  }
LAB_0041cc84:
  lVar5 = *(long *)(unaff_x25 + 0x30);
  if (unaff_x19 < (ulong)(*(long *)(unaff_x25 + 0x20) - lVar5)) {
    _memcpy(*(long *)(unaff_x25 + 0x28) + lVar5,unaff_x20 + unaff_x21);
    unaff_x22 = 0;
    *(ulong *)(unaff_x25 + 0x30) = lVar5 + unaff_x19;
  }
  else {
    unaff_x22 = func_0x007a04a8(unaff_x25 + 0x20,unaff_x20 + unaff_x21);
  }
LAB_0041cbc4:
  *(long *)(unaff_x25 + 0x18) = *(long *)(unaff_x25 + 0x18) + 1;
  return unaff_x22;
code_r0x0041cc64:
  unaff_x22 = unaff_x26 & 0xffffffff | (ulong)*puVar3 << 0x20;
LAB_0041cc6c:
  if ((unaff_x22 != 0) && ((unaff_x22 & 0xffffffff00000003) != 0x900000002)) goto LAB_0041cbc4;
  goto LAB_0041cc84;
}

