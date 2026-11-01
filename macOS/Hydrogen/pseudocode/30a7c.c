
/* WARNING: Removing unreachable block (ram,0x00030db0) */
/* WARNING: Removing unreachable block (ram,0x00030dc4) */
/* WARNING: Removing unreachable block (ram,0x00030d8c) */

byte * FUN_00030a7c(void)

{
  byte *pbVar1;
  uint uVar2;
  ulong uVar3;
  uint uVar4;
  code *pcVar5;
  byte *pbVar6;
  byte bVar7;
  ulong uVar8;
  long lVar9;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  long unaff_x29;
  undefined8 uVar10;
  ushort uStack0000000000000040;
  undefined6 uStack0000000000000042;
  ulong uStack0000000000000048;
  ulong in_stack_00000050;
  
  func_0x000320f0();
  if ((long)in_stack_00000050 < 0) {
    __ZdlPv(_uStack0000000000000040);
  }
  uVar8 = *(ulong *)(unaff_x29 + -0x38);
  uStack0000000000000048 = *(ulong *)(unaff_x29 + -0x40);
  _uStack0000000000000040 = *(byte **)(unaff_x29 + -0x48);
  uVar4 = (uint)(char)(uVar8 >> 0x38);
  uVar3 = uStack0000000000000048;
  if (-1 < (int)uVar4) {
    uVar3 = uVar8 >> 0x38;
  }
  if (1 < uVar3 - 1) {
    func_0x000320a4();
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x30de0);
    (*pcVar5)();
  }
  pbVar6 = (byte *)(unaff_x20 + 2);
  uVar2 = *(uint *)(unaff_x21 + 0x18) & 0x1f0;
  uVar3 = uStack0000000000000048;
  if (-1 < (int)uVar4) {
    uVar3 = (ulong)uVar4 & 0xff;
  }
  if (uVar3 == 0) {
    if ((uVar2 | 0x40) == 0x40) {
      bVar7 = *pbVar6;
      if (bVar7 == 0x5c) {
        if (uVar2 == 0) {
          pbVar6 = (byte *)func_0x000311d8();
        }
        else {
          pbVar6 = (byte *)func_0x00031394();
        }
        goto joined_r0x00030c94;
      }
    }
    else {
      bVar7 = *pbVar6;
    }
    if ((int)uVar4 < 0) {
      uStack0000000000000048 = 1;
      *_uStack0000000000000040 = bVar7;
      _uStack0000000000000040[1] = 0;
      pbVar6 = (byte *)(unaff_x20 + 3);
    }
    else {
      in_stack_00000050 = CONCAT17(1,(int7)uVar8);
      uVar3 = (ulong)_uStack0000000000000040 >> 0x10;
      uStack0000000000000042 = (undefined6)uVar3;
      uStack0000000000000040 = (ushort)bVar7;
      pbVar6 = (byte *)(unaff_x20 + 3);
      uVar8 = in_stack_00000050;
    }
  }
joined_r0x00030c94:
  if ((((pbVar6 != unaff_x22) && (*pbVar6 != 0x5d)) && (pbVar1 = pbVar6 + 1, pbVar1 != unaff_x22))
     && ((*pbVar6 == 0x2d && (*pbVar1 != 0x5d)))) {
    *(undefined8 *)(unaff_x29 + -0x48) = 0;
    *(undefined8 *)(unaff_x29 + -0x40) = 0;
    *(undefined8 *)(unaff_x29 + -0x38) = 0;
    pbVar6 = pbVar6 + 2;
    if (((pbVar6 == unaff_x22) || (*pbVar1 != 0x5b)) || (*pbVar6 != 0x2e)) {
      if ((uVar2 | 0x40) == 0x40) {
        bVar7 = *pbVar1;
        if (bVar7 == 0x5c) {
          if (uVar2 == 0) {
            pbVar6 = (byte *)func_0x000311d8();
          }
          else {
            pbVar6 = (byte *)func_0x00031394();
          }
          goto code_r0x00030d28;
        }
      }
      else {
        bVar7 = *pbVar1;
      }
      *(undefined1 *)(unaff_x29 + -0x31) = 1;
      *(byte *)(unaff_x29 + -0x48) = bVar7;
      *(undefined1 *)(unaff_x29 + -0x47) = 0;
    }
    else {
      pbVar6 = (byte *)func_0x000310dc();
    }
code_r0x00030d28:
    uVar10 = *(undefined8 *)(unaff_x29 + -0x48);
    lVar9 = *(long *)(unaff_x29 + -0x38);
    *(undefined8 *)(unaff_x29 + -0x48) = 0;
    *(undefined8 *)(unaff_x29 + -0x40) = 0;
    *(undefined8 *)(unaff_x29 + -0x38) = 0;
    func_0x00031798();
    if (lVar9 < 0) {
      __ZdlPv(uVar10);
    }
    if ((long)uVar8 < 0) {
      __ZdlPv(_uStack0000000000000040);
    }
    return pbVar6;
  }
  in_stack_00000050._7_1_ = (char)(uVar8 >> 0x38);
  if ((long)uVar8 < 0) {
    if (uStack0000000000000048 == 0) goto code_r0x00030c3c;
    if (uStack0000000000000048 == 1) goto code_r0x00030b88;
  }
  else {
    if (in_stack_00000050._7_1_ == '\0') goto code_r0x00030c3c;
    if (in_stack_00000050._7_1_ == '\x01') {
code_r0x00030b88:
      func_0x0002f0ac();
      goto code_r0x00030c3c;
    }
  }
  func_0x00031cc4();
code_r0x00030c3c:
  if ((long)uVar8 < 0) {
    __ZdlPv(_uStack0000000000000040);
    return pbVar6;
  }
  return pbVar6;
}

