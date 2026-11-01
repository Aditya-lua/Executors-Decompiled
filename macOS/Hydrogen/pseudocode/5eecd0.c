
void FUN_005eecd0(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  char cVar3;
  byte bVar4;
  uint uVar5;
  code *pcVar6;
  uint in_w8;
  char in_w9;
  undefined8 *unaff_x19;
  uint unaff_w20;
  ulong unaff_x21;
  byte *pbVar7;
  char unaff_w23;
  uint unaff_w24;
  char unaff_w25;
  ulong unaff_x26;
  uint unaff_w27;
  int unaff_w28;
  undefined8 in_stack_00000008;
  byte *in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  do {
    if (0x7ffffffffffffff7 < unaff_x26) {
      func_0x0001748c(&uStack0000000000000018);
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x5eedc4);
      (*pcVar6)();
    }
    bVar4 = in_w9 + (char)in_w8;
    if (unaff_x26 < 0x17) {
      in_stack_00000020 = 0;
      in_stack_00000028 = unaff_x26 << 0x38;
      uStack0000000000000018 = (byte *)(ulong)bVar4;
      pbVar7 = in_stack_00000010;
      if (unaff_x21 != 0) goto LAB_005eed58;
      *in_stack_00000010 = 0;
      cVar3 = *(char *)((long)unaff_x19 + 0x17);
    }
    else {
      uVar1 = (unaff_x26 & 0xfffffffffffffff8) + 8;
      if ((unaff_x26 | 7) != 0x17) {
        uVar1 = unaff_x26 | 7;
      }
      uStack0000000000000018 = (byte *)__Znwm(uVar1 + 1);
      in_stack_00000028 = uVar1 + 1 | 0x8000000000000000;
      pbVar7 = uStack0000000000000018 + 1;
      *uStack0000000000000018 = bVar4;
      unaff_w25 = '0';
      unaff_w24 = in_stack_00000008._4_4_;
      in_stack_00000020 = unaff_x26;
LAB_005eed58:
      puVar2 = (undefined8 *)*unaff_x19;
      if (-1 < unaff_w28) {
        puVar2 = unaff_x19;
      }
      _memmove(pbVar7,puVar2,unaff_x21);
      pbVar7[unaff_x21] = 0;
      cVar3 = *(char *)((long)unaff_x19 + 0x17);
    }
    if (cVar3 < '\0') {
      __ZdlPv(*unaff_x19);
    }
    unaff_x19[1] = in_stack_00000020;
    *unaff_x19 = uStack0000000000000018;
    unaff_x19[2] = in_stack_00000028;
    if (unaff_w20 < unaff_w24) {
      return;
    }
    uVar5 = 0;
    if (unaff_w24 != 0) {
      uVar5 = unaff_w27 / unaff_w24;
    }
    in_w8 = unaff_w27 - uVar5 * unaff_w24;
    in_w9 = unaff_w25;
    if (9 < in_w8) {
      in_w9 = unaff_w23;
    }
    unaff_w28 = (int)(char)*(byte *)((long)unaff_x19 + 0x17);
    unaff_x21 = unaff_x19[1];
    if (-1 < unaff_w28) {
      unaff_x21 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
    }
    unaff_x26 = unaff_x21 + 1;
    unaff_w20 = unaff_w27;
    unaff_w27 = uVar5;
  } while( true );
}

