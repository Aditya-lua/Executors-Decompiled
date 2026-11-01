
void FUN_00511ae0(ulong param_1)

{
  byte *pbVar1;
  byte bVar2;
  uint uVar3;
  code *pcVar4;
  bool in_ZR;
  bool in_CY;
  uint uVar5;
  long *unaff_x19;
  long lVar6;
  long unaff_x20;
  ulong unaff_x21;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x23;
  long lVar10;
  ulong uVar11;
  long in_stack_00000028;
  undefined8 uStack0000000000000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  
  if (in_CY) {
    if (!in_ZR) goto code_r0x00511e5c;
  }
  else if (*(char *)(unaff_x23 + param_1) < -0x40) goto code_r0x00511e5c;
  uVar9 = unaff_x21;
  if (param_1 != unaff_x21) {
    uVar9 = param_1;
  }
  if (uVar9 == 0) {
    lVar6 = 0;
    lVar7 = 1;
    lVar10 = 0;
  }
  else {
    func_0x007a5594(&uStack0000000000000078,0,uVar9,1,1);
    lVar6 = in_stack_00000088;
    lVar7 = in_stack_00000080;
    lVar10 = uStack0000000000000078;
  }
  _memcpy(lVar7 + lVar6);
  in_stack_00000088 = lVar6 + uVar9;
  if (lVar10 == in_stack_00000088) {
    func_0x007a5594(&uStack0000000000000078,lVar10,1,1,1);
    *(undefined1 *)(in_stack_00000080 + in_stack_00000088) = 10;
  }
  else {
    *(undefined1 *)(lVar7 + in_stack_00000088) = 10;
  }
  in_stack_00000088 = in_stack_00000088 + 1;
  uVar8 = uVar9;
  if (uVar9 != 0) goto LAB_00511d44;
LAB_00511d60:
  do {
    do {
      if (uVar9 == unaff_x21) {
        uVar9 = in_stack_00000028 - unaff_x21;
        if ((ulong)(uStack0000000000000078 - in_stack_00000088) < uVar9) {
          func_0x007a5594(&uStack0000000000000078,in_stack_00000088,uVar9,1,1);
        }
        lVar6 = in_stack_00000088;
        _memcpy(in_stack_00000080 + in_stack_00000088,unaff_x20 + unaff_x21,uVar9);
        in_stack_000000a0 = lVar6 + uVar9;
        in_stack_00000098 = in_stack_00000080;
        in_stack_00000090 = uStack0000000000000078;
        if (*unaff_x19 != 0) {
          func_0x00187bd4();
        }
        unaff_x19[1] = in_stack_00000098;
        *unaff_x19 = in_stack_00000090;
        unaff_x19[2] = in_stack_000000a0;
        return;
      }
      pbVar1 = (byte *)(unaff_x23 + uVar9);
      bVar2 = *pbVar1;
      if ((char)bVar2 < '\0') {
        if (bVar2 < 0xe0) {
          uVar3 = pbVar1[1] & 0x3f | (bVar2 & 0x1f) << 6;
        }
        else {
          uVar5 = (uint)bVar2;
          uVar3 = pbVar1[2] & 0x3f | (pbVar1[1] & 0x3f) << 6;
          if (uVar5 < 0xf0) {
            uVar3 = uVar3 | (uVar5 & 0x1f) << 0xc;
          }
          else {
            uVar3 = pbVar1[3] & 0x3f | uVar3 << 6 | (uVar5 & 7) << 0x12;
          }
        }
        if (uVar3 < 0x80) goto LAB_00511bd4;
        if (uVar3 < 0x800) {
          uVar11 = uVar9 + 2;
        }
        else {
          lVar6 = 3;
          if (0xffff < uVar3) {
            lVar6 = 4;
          }
          uVar11 = lVar6 + uVar9;
        }
      }
      else {
LAB_00511bd4:
        uVar11 = uVar9 + 1;
      }
      if (uVar11 != 0) {
        if (uVar11 < unaff_x21) {
          if (*(char *)(unaff_x23 + uVar11) < -0x40) goto code_r0x00511e5c;
        }
        else if (uVar11 != unaff_x21) goto code_r0x00511e5c;
      }
      uVar8 = unaff_x21;
      if (uVar11 != unaff_x21) {
        uVar8 = uVar11;
      }
      uVar11 = uVar8 - uVar9;
      if ((ulong)(uStack0000000000000078 - in_stack_00000088) < uVar11) {
        func_0x007a5594(&uStack0000000000000078,in_stack_00000088,uVar11,1,1);
      }
      lVar10 = in_stack_00000088;
      lVar7 = in_stack_00000080;
      lVar6 = uStack0000000000000078;
      _memcpy(in_stack_00000080 + in_stack_00000088,unaff_x20 + uVar9,uVar11);
      in_stack_00000088 = lVar10 + uVar11;
      if (lVar6 == in_stack_00000088) {
        func_0x007a5594(&uStack0000000000000078,lVar6,1,1,1);
        *(undefined1 *)(in_stack_00000080 + in_stack_00000088) = 10;
      }
      else {
        *(undefined1 *)(lVar7 + in_stack_00000088) = 10;
      }
      in_stack_00000088 = in_stack_00000088 + 1;
      uVar9 = uVar8;
    } while (uVar8 == 0);
LAB_00511d44:
    uVar9 = uVar8;
    if (unaff_x21 <= uVar8) {
      if (uVar8 != unaff_x21) break;
      goto LAB_00511d60;
    }
  } while (-0x41 < *(char *)(unaff_x23 + uVar8));
code_r0x00511e5c:
  func_0x007a297c();
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x511e94);
  (*pcVar4)();
}

