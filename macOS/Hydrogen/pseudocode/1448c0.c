
undefined8 FUN_001448c0(undefined1 *param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined2 *puVar3;
  undefined4 *puVar4;
  ulong unaff_x20;
  undefined8 unaff_x21;
  undefined1 *unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined4 *unaff_x27;
  char unaff_w28;
  undefined1 uStack0000000000000008;
  ulong uStack0000000000000010;
  undefined7 uStack0000000000000018;
  undefined1 *in_stack_00000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  char cStack0000000000000057;
  undefined1 uStack0000000000000058;
  undefined2 uStack0000000000000059;
  undefined1 uStack000000000000005b;
  
code_r0x001448c0:
  _uStack0000000000000018 = unaff_x23 | 0x8000000000000000;
  _uStack0000000000000008 = param_1;
  uStack0000000000000010 = unaff_x20;
  do {
    _memmove(unaff_x22,unaff_x21,unaff_x20);
    do {
      unaff_x22[unaff_x20] = 0;
      in_stack_00000028 = uStack0000000000000010;
      in_stack_00000020 = _uStack0000000000000008;
      in_stack_00000030 = _uStack0000000000000018;
      in_stack_00000038 = 0;
      in_stack_00000040 = 0x6e692d746c697542;
      in_stack_00000048 = 0x6f6974636e756620;
      *unaff_x27 = CONCAT13(uStack000000000000005b,
                            CONCAT21(uStack0000000000000059,uStack0000000000000058));
      *(undefined4 *)((long)unaff_x27 + 3) = _uStack000000000000005b;
      cStack0000000000000057 = unaff_w28;
      func_0x0014b5b0();
      if (cStack0000000000000057 < '\0') {
        __ZdlPv(in_stack_00000040);
      }
      if ((long)in_stack_00000030 < 0) {
        __ZdlPv(in_stack_00000020);
      }
      if (unaff_x26 == 0x1e0) {
        puRam0000000000a391c8 = &DAT_00149d04;
        if (cRam0000000000a3918f < '\0') {
          uRam0000000000a39180 = 2;
          puVar3 = puRam0000000000a39178;
        }
        else {
          cRam0000000000a3918f = '\x02';
          puVar3 = (undefined2 *)0xa39178;
        }
        *puVar3 = 0x2a2f;
        *(undefined1 *)(puVar3 + 1) = 0;
        if (cRam0000000000a391a7 < '\0') {
          uRam0000000000a39198 = 2;
          puVar3 = (undefined2 *)
                   CONCAT53(uRam0000000000a39193,CONCAT12(uRam0000000000a39192,uRam0000000000a39190)
                           );
          *puVar3 = 0x2f2a;
          *(undefined1 *)(puVar3 + 1) = 0;
        }
        else {
          cRam0000000000a391a7 = '\x02';
          uRam0000000000a39190 = 0x2f2a;
          uRam0000000000a39192 = 0;
        }
        if (cRam0000000000a391bf < '\0') {
          uRam0000000000a391b0 = 2;
          puVar3 = puRam0000000000a391a8;
        }
        else {
          cRam0000000000a391bf = '\x02';
          puVar3 = (undefined2 *)0xa391a8;
        }
        *puVar3 = 0x2f2f;
        *(undefined1 *)(puVar3 + 1) = 0;
        uRam0000000000a391e8 = 1;
        uRam0000000000a391c1 = 1;
        if (cRam0000000000a390ff < '\0') {
          uRam0000000000a390f0 = 3;
          puVar4 = puRam0000000000a390e8;
        }
        else {
          cRam0000000000a390ff = '\x03';
          puVar4 = (undefined4 *)0xa390e8;
        }
        *puVar4 = 0x2b2b43;
        uRam0000000000a390a8 = 1;
        return 0xa390e8;
      }
      unaff_x26 = unaff_x26 + 8;
      uStack0000000000000059 = 0;
      _uStack000000000000005b = 0;
      uStack0000000000000058 = 0x6e;
      unaff_x21 = *(undefined8 *)(unaff_x24 + unaff_x26);
      unaff_x20 = _strlen(unaff_x21);
      if (unaff_x25 < unaff_x20) {
        func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x144ae4);
        (*pcVar2)();
      }
      if (0x16 < unaff_x20) {
        uVar1 = (unaff_x20 & 0xfffffffffffffff8) + 8;
        if ((unaff_x20 | 7) != 0x17) {
          uVar1 = unaff_x20 | 7;
        }
        unaff_x23 = uVar1 + 1;
        param_1 = (undefined1 *)__Znwm(unaff_x23);
        unaff_x22 = param_1;
        goto code_r0x001448c0;
      }
      _uStack0000000000000018 = CONCAT17((char)unaff_x20,uStack0000000000000018);
      unaff_x22 = &uStack0000000000000008;
    } while (unaff_x20 == 0);
  } while( true );
}

