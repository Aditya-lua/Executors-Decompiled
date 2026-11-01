
undefined8 FUN_00145774(void)

{
  ulong uVar1;
  code *pcVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined2 *puVar5;
  undefined8 uVar6;
  ulong unaff_x25;
  long unaff_x26;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined4 uStack0000000000000050;
  undefined3 uStack0000000000000054;
  char cStack0000000000000057;
  undefined1 uStack0000000000000058;
  undefined2 uStack0000000000000059;
  undefined4 uStack000000000000005b;
  
  do {
    uStack0000000000000059 = 0;
    uStack000000000000005b = 0;
    uStack0000000000000058 = 0x6e;
    uVar6 = *(undefined8 *)(&UNK_009bc3b8 + unaff_x26);
    uVar3 = _strlen(uVar6);
    if (unaff_x25 < uVar3) {
      func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x145a34);
      (*pcVar2)();
    }
    if (uVar3 < 0x17) {
      _uStack0000000000000018 = CONCAT17((char)uVar3,uStack0000000000000018);
      puVar4 = &uStack0000000000000008;
      if (uVar3 != 0) goto LAB_0014582c;
    }
    else {
      uVar1 = (uVar3 & 0xfffffffffffffff8) + 8;
      if ((uVar3 | 7) != 0x17) {
        uVar1 = uVar3 | 7;
      }
      puVar4 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000018 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000008 = puVar4;
      in_stack_00000010 = uVar3;
LAB_0014582c:
      _memmove(puVar4,uVar6,uVar3);
    }
    *(undefined1 *)((long)puVar4 + uVar3) = 0;
    in_stack_00000028 = in_stack_00000010;
    uStack0000000000000020 = uStack0000000000000008;
    in_stack_00000030 = _uStack0000000000000018;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0x6e692d746c697542;
    in_stack_00000048 = 0x6f6974636e756620;
    uStack0000000000000050 =
         CONCAT13((char)uStack000000000000005b,
                  CONCAT21(uStack0000000000000059,uStack0000000000000058));
    uStack0000000000000054 = (undefined3)((uint)uStack000000000000005b >> 8);
    cStack0000000000000057 = '\x11';
    func_0x0014b5b0(0xa39440,&uStack0000000000000020,&uStack0000000000000020);
    if (cStack0000000000000057 < '\0') {
      __ZdlPv(in_stack_00000040);
    }
    if ((long)in_stack_00000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
    unaff_x26 = unaff_x26 + 8;
    if (unaff_x26 == 0x188) {
      puRam0000000000a394e0 = &DAT_0014a3d0;
      if (cRam0000000000a394a7 < '\0') {
        uRam0000000000a39498 = 2;
        puVar5 = puRam0000000000a39490;
      }
      else {
        cRam0000000000a394a7 = '\x02';
        puVar5 = (undefined2 *)0xa39490;
      }
      *puVar5 = 0x2a2f;
      *(undefined1 *)(puVar5 + 1) = 0;
      if (cRam0000000000a394bf < '\0') {
        uRam0000000000a394b0 = 2;
        puVar5 = (undefined2 *)
                 CONCAT53(uRam0000000000a394ab,CONCAT12(uRam0000000000a394aa,uRam0000000000a394a8));
        *puVar5 = 0x2f2a;
        *(undefined1 *)(puVar5 + 1) = 0;
      }
      else {
        cRam0000000000a394bf = '\x02';
        uRam0000000000a394a8 = 0x2f2a;
        uRam0000000000a394aa = 0;
      }
      if (cRam0000000000a394d7 < '\0') {
        uRam0000000000a394c8 = 2;
        puVar5 = puRam0000000000a394c0;
      }
      else {
        cRam0000000000a394d7 = '\x02';
        puVar5 = (undefined2 *)0xa394c0;
      }
      *puVar5 = 0x2f2f;
      *(undefined1 *)(puVar5 + 1) = 0;
      uRam0000000000a39500 = 1;
      uRam0000000000a394d9 = 1;
      if (cRam0000000000a39417 < '\0') {
        uRam0000000000a39408 = 1;
        puVar5 = puRam0000000000a39400;
      }
      else {
        cRam0000000000a39417 = '\x01';
        puVar5 = (undefined2 *)0xa39400;
      }
      *puVar5 = 0x43;
      uRam0000000000a390ab = 1;
      return 0xa39400;
    }
  } while( true );
}

