
void FUN_00279bc8(long param_1)

{
  uint uVar1;
  byte *pbVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  byte bVar7;
  uint in_w9;
  byte *pbVar8;
  uint in_w10;
  long *unaff_x19;
  byte *unaff_x20;
  byte *unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  uint unaff_w27;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
code_r0x00279bc8:
  pbVar8 = unaff_x21;
  if ((in_w9 >= 10 && 4 < in_w10) && (in_w9 < 10 || in_w10 != 5)) goto LAB_00279af4;
  do {
    uVar4 = unaff_x26;
    if (0xffff < unaff_w27) {
      uVar4 = unaff_x26 + 1;
    }
    uVar5 = unaff_x25;
    if (0x7ff < unaff_w27) {
      uVar5 = uVar4;
    }
    uVar4 = unaff_x24;
    if (0x7f < unaff_w27) {
      uVar4 = uVar5;
    }
    bVar7 = (byte)unaff_w27;
    if ((ulong)(uStack0000000000000008 - unaff_x22) < uVar4) {
      func_0x0079cf14(&uStack0000000000000008,unaff_x22,uVar4,1,1);
      pbVar8 = (byte *)(in_stack_00000010 + in_stack_00000018);
      param_1 = in_stack_00000010;
      if (unaff_w27 < 0x80) goto LAB_00279ae8;
LAB_00279c0c:
      if (unaff_w27 < 0x800) {
        *pbVar8 = (byte)(unaff_w27 >> 6) | 0xc0;
        pbVar8[1] = bVar7 & 0x3f | 0x80;
      }
      else if (unaff_w27 < 0x10000) {
        *pbVar8 = (byte)(unaff_w27 >> 0xc) | 0xe0;
        pbVar8[1] = (byte)(unaff_w27 >> 6) & 0x3f | 0x80;
        pbVar8[2] = bVar7 & 0x3f | 0x80;
      }
      else {
        *pbVar8 = (byte)(unaff_w27 >> 0x12) | 0xf0;
        pbVar8[1] = (byte)(unaff_w27 >> 0xc) & 0x3f | 0x80;
        pbVar8[2] = (byte)(unaff_w27 >> 6) & 0x3f | 0x80;
        pbVar8[3] = bVar7 & 0x3f | 0x80;
      }
    }
    else {
      pbVar8 = (byte *)(param_1 + unaff_x22);
      if (0x7f < unaff_w27) goto LAB_00279c0c;
LAB_00279ae8:
      *pbVar8 = bVar7;
    }
    unaff_x22 = uVar4 + unaff_x22;
    pbVar8 = unaff_x21;
    in_stack_00000018 = unaff_x22;
LAB_00279af4:
    do {
      if (pbVar8 == unaff_x20) {
code_r0x00279cc0:
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = in_stack_00000018;
        return;
      }
      unaff_x21 = pbVar8 + 1;
      unaff_w27 = (uint)*pbVar8;
      if (-1 < (char)*pbVar8) {
        pbVar8 = unaff_x21;
        if (unaff_w27 - 0x30 < 10 || (unaff_w27 & 0xffffffdf) - 0x41 < 6) break;
        goto LAB_00279af4;
      }
      pbVar2 = pbVar8 + 1;
      uVar3 = *pbVar2 & 0x3f;
      if (unaff_w27 < 0xe0) {
        unaff_x21 = pbVar8 + 2;
        uVar6 = (unaff_w27 & 0x1f) << 6;
        unaff_w27 = uVar3 | uVar6;
        pbVar8 = unaff_x21;
        if (unaff_w27 - 0x30 < 10 || (*pbVar2 & 0x1f | uVar6) - 0x41 < 6) break;
        goto LAB_00279af4;
      }
      uVar3 = uVar3 << 6;
      uVar6 = pbVar8[2] & 0x3f | uVar3;
      if (unaff_w27 < 0xf0) {
        unaff_x21 = pbVar8 + 3;
        uVar1 = (unaff_w27 & 0x1f) << 0xc;
        unaff_w27 = uVar6 | uVar1;
        in_w9 = unaff_w27 - 0x30;
        in_w10 = (pbVar8[2] & 0x1f | uVar3 | uVar1) - 0x41;
        goto code_r0x00279bc8;
      }
      pbVar2 = pbVar8 + 3;
      uVar6 = uVar6 << 6;
      uVar3 = (unaff_w27 & 7) << 0x12;
      unaff_w27 = *pbVar2 & 0x3f | uVar6 | uVar3;
      if (unaff_w27 == 0x110000) goto code_r0x00279cc0;
      unaff_x21 = pbVar8 + 4;
      pbVar8 = unaff_x21;
    } while (9 < unaff_w27 - 0x30 && 5 < (*pbVar2 & 0x1f | uVar6 | uVar3) - 0x41);
  } while( true );
}

