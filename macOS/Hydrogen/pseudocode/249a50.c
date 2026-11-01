
void FUN_00249a50(undefined8 param_1,ulong param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  code *pcVar4;
  ulong uVar5;
  long *plVar6;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x28;
  undefined8 *in_stack_00000000;
  
  do {
    uVar5 = *(ulong *)(unaff_x21 + 0xb8);
    *(undefined8 *)(unaff_x21 + 0xb8) = 0;
    uVar3 = param_2 - uVar5;
    if (param_2 < uVar5) {
      func_0x007a28b0(uVar5,param_2,&UNK_009c2450);
code_r0x00249b1c:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x249b20);
      (*pcVar4)();
    }
    if ((uVar5 != 0) && (uVar3 != 0)) {
      _memmove(unaff_x24,unaff_x24 + uVar5,uVar3);
    }
    uVar5 = uVar3 + unaff_x25;
    if (CARRY8(uVar3,unaff_x25)) {
      func_0x007a28bc(unaff_x25,uVar5,&UNK_009c9f20);
      goto code_r0x00249b1c;
    }
    if (unaff_x20 < uVar5) {
      func_0x007a28b0(uVar5);
      goto code_r0x00249b1c;
    }
    _memcpy(unaff_x22 + unaff_x25,unaff_x24,uVar3);
    if (unaff_x23 != 0) {
      func_0x00187bd4(unaff_x24,unaff_x23,1);
    }
    if (*(long *)(unaff_x21 + 0xb0) == 0) {
code_r0x00249ab4:
      *in_stack_00000000 = 2;
      in_stack_00000000[1] = uVar5;
      return;
    }
    lVar2 = *(long *)(unaff_x21 + 0xa8);
    uVar3 = lVar2 + 1;
    uVar1 = 0;
    if (*(ulong *)(unaff_x21 + 0x98) <= uVar3) {
      uVar1 = *(ulong *)(unaff_x21 + 0x98);
    }
    *(ulong *)(unaff_x21 + 0xa8) = uVar3 - uVar1;
    *(long *)(unaff_x21 + 0xb0) = *(long *)(unaff_x21 + 0xb0) + -1;
    plVar6 = (long *)(*(long *)(unaff_x21 + 0xa0) + lVar2 * unaff_x28);
    unaff_x23 = *plVar6;
    if (unaff_x23 == unaff_x19) goto code_r0x00249ab4;
    unaff_x24 = plVar6[1];
    param_2 = plVar6[2];
    unaff_x25 = uVar5;
  } while( true );
}

