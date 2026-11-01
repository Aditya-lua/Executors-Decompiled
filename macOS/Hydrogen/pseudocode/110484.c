
byte * FUN_00110484(undefined1 *param_1)

{
  byte bVar1;
  uint uVar2;
  int iVar3;
  byte *pbVar4;
  byte *pbVar5;
  ushort uVar6;
  undefined1 *puVar7;
  char *pcVar8;
  long lVar9;
  long in_x9;
  long in_x10;
  ulong in_x11;
  byte in_w12;
  char cVar10;
  bool bVar11;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  ushort *unaff_x19;
  ulong unaff_x20;
  undefined4 unaff_w21;
  byte *unaff_x23;
  undefined1 auVar12 [16];
  ushort *puStack0000000000000000;
  ushort uStack000000000000000c;
  undefined1 uStack0000000000000030;
  long in_stack_00000038;
  
  do {
    puVar7 = param_1;
    pbVar4 = unaff_x23;
    if (0x3b < (uint)in_x15 || (in_x10 << (in_x15 & 0x3f) & in_x11) == 0) {
      puVar7 = param_1 + 1;
      *param_1 = (char)in_x14;
    }
LAB_00110454:
    in_x9 = in_x9 + -1;
    if (in_x9 == 0) {
      *puVar7 = 0;
      _uStack000000000000000c = 0;
      puStack0000000000000000 = unaff_x19;
      if (unaff_x20 < 4) {
        puStack0000000000000000 = &uStack000000000000000c;
      }
      iVar3 = _sscanf();
      if (iVar3 < 1) {
        pbVar4 = (byte *)0x0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
          return (byte *)0x0;
        }
        goto code_r0x00110608;
      }
      if (3 < unaff_x20) goto code_r0x001105d8;
      switch(unaff_w21) {
      case 0:
        iVar3 = _uStack000000000000000c;
        if (0x7e < _uStack000000000000000c) {
          iVar3 = 0x7f;
        }
        if (iVar3 < -0x7f) {
          iVar3 = -0x80;
        }
        *(char *)unaff_x19 = (char)iVar3;
        break;
      case 1:
        iVar3 = _uStack000000000000000c;
        if (0xfe < _uStack000000000000000c) {
          iVar3 = 0xff;
        }
        *(byte *)unaff_x19 = (byte)iVar3 & ((byte)(iVar3 >> 0x1f) ^ 0xff);
        break;
      case 2:
        iVar3 = _uStack000000000000000c;
        if (0x7ffe < _uStack000000000000000c) {
          iVar3 = 0x7fff;
        }
        if (iVar3 < -0x7fff) {
          iVar3 = -0x8000;
        }
        uVar6 = (ushort)iVar3;
        goto code_r0x001105d4;
      case 3:
        iVar3 = _uStack000000000000000c;
        if (0xfffe < _uStack000000000000000c) {
          iVar3 = 0xffff;
        }
        uVar6 = (ushort)iVar3 & ((ushort)(iVar3 >> 0x1f) ^ 0xffff);
code_r0x001105d4:
        *unaff_x19 = uVar6;
      }
code_r0x001105d8:
      iVar3 = _memcmp(&uStack0000000000000030);
      pbVar4 = (byte *)(ulong)(iVar3 != 0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
        return pbVar4;
      }
code_r0x00110608:
      auVar12 = ___stack_chk_fail(pbVar4);
      auVar12._8_8_ = auVar12._8_8_;
      auVar12._0_8_ = auVar12._0_8_;
      pbVar4 = auVar12._8_8_;
      if (*auVar12._0_8_ != '%') goto code_r0x00110738;
      iVar3 = 0x25;
      cVar10 = '%';
      pcVar8 = auVar12._0_8_;
      goto code_r0x00110658;
    }
    unaff_x23 = pbVar4 + 1;
    bVar1 = *pbVar4;
    in_x14 = (ulong)bVar1;
    if (((in_w12 & 1) == 0) &&
       (((byte)(bVar1 - 0x30) < 10 || (bVar1 < 0x2f && (in_x10 << (in_x14 & 0x3f) & in_x13) != 0))))
    break;
    in_w12 = in_w12 | ((bVar1 & 0xffffffdf) - 0x41 & 0xff) < 0x1a;
    in_x15 = (ulong)(bVar1 - 0x24);
    param_1 = puVar7;
  } while( true );
  in_w12 = 0;
  pbVar4 = unaff_x23;
  goto LAB_00110454;
code_r0x00110658:
  do {
    pcVar8 = pcVar8 + 1;
    if ((byte)(cVar10 + 0xbfU) < 0x1a) {
      uVar2 = 1 << (ulong)(iVar3 - 0x41U & 0x1f) & 0x900;
joined_r0x00110648:
      if (uVar2 == 0) break;
    }
    else if ((byte)(cVar10 + 0x9fU) < 0x1a) {
      uVar2 = 1 << (ulong)(iVar3 - 0x61U & 0x1f) & 0x2480a80;
      goto joined_r0x00110648;
    }
    cVar10 = *pcVar8;
    iVar3 = (int)cVar10;
  } while (cVar10 != '\0');
  lVar9 = (long)pcVar8 - (long)auVar12._0_8_;
  if (auVar12._0_8_ <= pcVar8 && lVar9 != 0) {
    bVar11 = false;
    do {
      pbVar4 = auVar12._8_8_;
      pbVar5 = auVar12._0_8_;
      bVar1 = *pbVar5;
      if ((bVar11) ||
         ((9 < (byte)(bVar1 - 0x30) &&
          (0x2e < bVar1 || (1L << ((ulong)bVar1 & 0x3f) & 0x480800000000U) == 0)))) {
        bVar11 = (bool)(bVar11 | ((bVar1 & 0xffffffdf) - 0x41 & 0xff) < 0x1a);
        uVar2 = bVar1 - 0x24;
        if (0x3b < uVar2 || (1L << ((ulong)uVar2 & 0x3f) & 0x800000000000009U) == 0) {
          *pbVar4 = bVar1;
          pbVar4 = pbVar4 + 1;
        }
      }
      else {
        bVar11 = false;
      }
      auVar12._8_8_ = pbVar4;
      auVar12._0_8_ = pbVar5 + 1;
      lVar9 = lVar9 + -1;
    } while (lVar9 != 0);
  }
code_r0x00110738:
  *pbVar4 = 0;
  return auVar12._8_8_;
}

