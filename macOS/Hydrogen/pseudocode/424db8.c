
uint FUN_00424db8(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  uint uVar9;
  long lVar10;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x22;
  uint uVar11;
  ulong unaff_x23;
  ulong unaff_x24;
  uint unaff_w25;
  long unaff_x29;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  ulong in_stack_00000090;
  undefined8 in_stack_00000098;
  ulong in_stack_000000a0;
  
  do {
    uVar9 = (uint)in_x9;
    lVar1 = 0;
    if (5 < uVar9) {
      lVar1 = param_1;
    }
    bVar6 = SBORROW8(in_x11,lVar1);
    lVar10 = in_x11 - lVar1;
    bVar7 = in_x11 == lVar1;
    if (bVar7) {
      uVar4 = *(ulong *)(unaff_x29 + -0x78);
      if (in_x11 == 0) {
        if (uVar9 < 6) {
          uVar11 = (uint)unaff_x23;
          if (uVar11 == uVar9) {
            uVar3 = *(undefined8 *)(unaff_x29 + -0x70);
            uVar5 = *(ulong *)(unaff_x29 + -0x68);
            if ((int)uVar11 < 3) {
              if (uVar11 == 0) {
LAB_00424dd8:
                uVar5 = unaff_x24;
                if (uVar4 <= unaff_x24) {
                  uVar5 = uVar4;
                }
                iVar8 = _memcmp(unaff_x20,*(undefined8 *)(unaff_x29 + -0x80),uVar5);
                lVar10 = unaff_x24 - uVar4;
                if (iVar8 != 0) {
                  lVar10 = (long)iVar8;
                }
              }
              else {
                if (uVar11 != 1) goto LAB_00424eb0;
code_r0x00424e44:
                uVar2 = unaff_x24;
                if (uVar4 <= unaff_x24) {
                  uVar2 = uVar4;
                }
                iVar8 = _memcmp(unaff_x20,*(undefined8 *)(unaff_x29 + -0x80),uVar2);
                lVar10 = unaff_x24 - uVar4;
                if (iVar8 != 0) {
                  lVar10 = (long)iVar8;
                }
                if (lVar10 == 0) {
                  uVar4 = unaff_x22;
                  if (uVar5 <= unaff_x22) {
                    uVar4 = uVar5;
                  }
                  iVar8 = _memcmp(unaff_x19,uVar3,uVar4);
                  lVar10 = unaff_x22 - uVar5;
                  if (iVar8 != 0) {
                    lVar10 = (long)iVar8;
                  }
                }
              }
              bVar7 = lVar10 == 0;
              bVar6 = false;
              goto LAB_00424df8;
            }
            if (uVar11 == 3) goto LAB_00424dd8;
            if (uVar11 == 4) goto code_r0x00424e44;
LAB_00424eb0:
            uVar9 = (uint)(*(byte *)(unaff_x29 + -0x87) < unaff_w25);
            if (unaff_w25 < *(byte *)(unaff_x29 + -0x87)) {
              uVar9 = 0xffffffff;
            }
          }
          else {
            uVar9 = (uint)((long)in_x9 < (long)in_x10);
            if ((long)in_x10 < (long)in_x9) {
              uVar9 = 0xffffffff;
            }
          }
          goto joined_r0x00424e98;
        }
      }
      else if (in_x11 == 4) goto LAB_00424dd8;
    }
    else {
LAB_00424df8:
      uVar9 = (uint)(!bVar7 && lVar10 < 0 == bVar6);
      if (lVar10 < 0 != bVar6) {
        uVar9 = 0xffffffff;
      }
joined_r0x00424e98:
      if (((uVar9 & 0xff) != 0) && ((uVar9 & 0xff) != 2)) {
        return uVar9;
      }
    }
    func_0x004245b4(&uStack0000000000000080);
    unaff_x22 = in_stack_000000a0;
    unaff_x19 = in_stack_00000098;
    unaff_x24 = in_stack_00000090;
    unaff_x20 = in_stack_00000088;
    in_x10 = (ulong)(byte)uStack0000000000000080;
    uVar9 = (uint)(byte)uStack0000000000000080;
    if (uVar9 == 10) {
      func_0x004245b4(unaff_x29 + -0x88,&uStack0000000000000040);
      return -(uint)(*(char *)(unaff_x29 + -0x88) != '\n');
    }
    unaff_w25 = (uint)uStack0000000000000080._1_1_;
    func_0x004245b4(unaff_x29 + -0x88,&uStack0000000000000040);
    in_x9 = (ulong)*(byte *)(unaff_x29 + -0x88);
    if (*(byte *)(unaff_x29 + -0x88) == 10) {
      return 1;
    }
    in_x11 = in_x10 - 5;
    if (3 < uVar9 - 6) {
      in_x11 = 0;
    }
    param_1 = in_x9 - 5;
    unaff_x23 = in_x10;
  } while( true );
}

