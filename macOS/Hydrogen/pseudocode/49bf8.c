
void FUN_00049bf8(void)

{
  ulong uVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  byte bVar6;
  char cVar7;
  uint uVar8;
  uint uVar9;
  code *pcVar10;
  undefined1 in_CY;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  char *pcVar11;
  byte *pbVar12;
  ulong unaff_x23;
  int unaff_w24;
  uint unaff_w25;
  uint unaff_w26;
  uint unaff_w27;
  int unaff_w28;
  long in_stack_00000000;
  byte *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  do {
    if ((bool)in_CY) {
      uVar3 = (unaff_x20 & 0xfffffffffffffff8) + 8;
      if ((unaff_x20 | 7) != 0x17) {
        uVar3 = unaff_x20 | 7;
      }
      uStack0000000000000018 = (char *)__Znwm(uVar3 + 1);
      in_stack_00000028 = uVar3 + 1 | 0x8000000000000000;
      pbVar12 = (byte *)(uStack0000000000000018 + 1);
      *uStack0000000000000018 = (byte)unaff_w28;
      unaff_x23 = 0x7ffffffffffffff7;
      in_stack_00000020 = unaff_x20;
LAB_00049c60:
      puVar5 = (undefined8 *)*unaff_x19;
      if (-1 < unaff_w24) {
        puVar5 = unaff_x19;
      }
      _memmove(pbVar12,puVar5,unaff_x21);
      pbVar12[unaff_x21] = 0;
      cVar7 = *(char *)((long)unaff_x19 + 0x17);
    }
    else {
      in_stack_00000020 = 0;
      in_stack_00000028 = unaff_x20 << 0x38;
      uStack0000000000000018 = (char *)(ulong)(byte)unaff_w28;
      pbVar12 = in_stack_00000008;
      if (unaff_x21 != 0) goto LAB_00049c60;
      *in_stack_00000008 = 0;
      cVar7 = *(char *)((long)unaff_x19 + 0x17);
    }
    if (cVar7 < '\0') {
      __ZdlPv(*unaff_x19);
    }
    unaff_x19[1] = in_stack_00000020;
    *unaff_x19 = uStack0000000000000018;
    unaff_x19[2] = in_stack_00000028;
    if (unaff_w27 < unaff_w26) {
      if (-1 < in_stack_00000000) {
        return;
      }
      bVar6 = *(byte *)((long)unaff_x19 + 0x17);
      uVar3 = unaff_x19[1];
      if (-1 < (char)bVar6) {
        uVar3 = (ulong)bVar6;
      }
      uVar1 = uVar3 + 1;
      if (uVar1 < 0x7ffffffffffffff8) {
        if (uVar1 < 0x17) {
          in_stack_00000020 = 0;
          in_stack_00000028 = uVar1 << 0x38;
          pcVar11 = (char *)((ulong)&uStack0000000000000018 | 1);
          uStack0000000000000018 = segment_command_00000020.segname + 5;
          if (uVar3 == 0) {
            *pcVar11 = '\0';
            goto joined_r0x00049d88;
          }
        }
        else {
          uVar4 = (uVar1 & 0xfffffffffffffff8) + 8;
          if ((uVar1 | 7) != 0x17) {
            uVar4 = uVar1 | 7;
          }
          uStack0000000000000018 = (char *)__Znwm(uVar4 + 1);
          in_stack_00000028 = uVar4 + 1 | 0x8000000000000000;
          pcVar11 = uStack0000000000000018 + 1;
          *uStack0000000000000018 = '-';
          in_stack_00000020 = uVar1;
        }
        puVar5 = (undefined8 *)*unaff_x19;
        if (-1 < (char)bVar6) {
          puVar5 = unaff_x19;
        }
        _memmove(pcVar11,puVar5,uVar3);
        pcVar11[uVar3] = '\0';
joined_r0x00049d88:
        if ((char)bVar6 < '\0') {
          __ZdlPv(*unaff_x19);
        }
        unaff_x19[1] = in_stack_00000020;
        *unaff_x19 = uStack0000000000000018;
        unaff_x19[2] = in_stack_00000028;
        return;
      }
      func_0x0001748c(&uStack0000000000000018);
      goto code_r0x00049dac;
    }
    uVar9 = 0;
    if (unaff_w26 != 0) {
      uVar9 = unaff_w25 / unaff_w26;
    }
    uVar8 = unaff_w25 - uVar9 * unaff_w26;
    iVar2 = 0x30;
    if (9 < uVar8) {
      iVar2 = in_stack_00000010._4_4_;
    }
    unaff_w24 = (int)(char)*(byte *)((long)unaff_x19 + 0x17);
    unaff_x21 = unaff_x19[1];
    if (-1 < unaff_w24) {
      unaff_x21 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
    }
    unaff_x20 = unaff_x21 + 1;
    if (unaff_x23 < unaff_x20) {
      func_0x0001748c(&uStack0000000000000018);
code_r0x00049dac:
                    /* WARNING: Does not return */
      pcVar10 = (code *)SoftwareBreakpoint(1,0x49db0);
      (*pcVar10)();
    }
    unaff_w28 = iVar2 + uVar8;
    in_CY = 0x16 < unaff_x20;
    unaff_w27 = unaff_w25;
    unaff_w25 = uVar9;
  } while( true );
}

