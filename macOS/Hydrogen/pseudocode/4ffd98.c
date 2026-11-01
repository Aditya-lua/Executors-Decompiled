
void FUN_004ffd98(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x24;
  long *plVar4;
  ulong unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *in_stack_00000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  
code_r0x004ffd98:
  if ((ulong)(uStack0000000000000010 - in_stack_00000020) < unaff_x25) {
    func_0x007a5594(&uStack0000000000000010,in_stack_00000020,unaff_x25,8,8);
  }
  _memcpy(in_stack_00000018 + in_stack_00000020 * 8,unaff_x24,unaff_x25 << 3);
  in_stack_00000020 = in_stack_00000020 + unaff_x25;
  if (uStack0000000000000028 != 0) {
    func_0x00187bd4(unaff_x24,uStack0000000000000028 << 3,8);
  }
  do {
    do {
      unaff_x27 = unaff_x27 + 1;
      if (unaff_x27 == unaff_x26) {
        in_stack_00000008[1] = in_stack_00000018;
        *in_stack_00000008 = uStack0000000000000010;
        in_stack_00000008[2] = in_stack_00000020;
        return;
      }
      lVar2 = unaff_x28 + unaff_x27 * unaff_x22;
      lVar3 = *(long *)(lVar2 + 0x90);
    } while (lVar3 == 0);
    lVar3 = lVar3 * unaff_x19;
    plVar4 = (long *)(*(long *)(lVar2 + 0x88) + 0x220);
    do {
      if ((*plVar4 == unaff_x21) &&
         (iVar1 = _memcmp(plVar4[-1]), lVar2 = in_stack_00000020, iVar1 == 0)) {
        if (in_stack_00000020 == uStack0000000000000010) {
          func_0x0050c238(&uStack0000000000000010,&UNK_009e89e8);
        }
        *(long *)(in_stack_00000018 + lVar2 * 8) = unaff_x28 + unaff_x27 * unaff_x22;
        in_stack_00000020 = lVar2 + 1;
        func_0x004ffcac(&uStack0000000000000028);
        unaff_x24 = in_stack_00000030;
        unaff_x25 = in_stack_00000038;
        goto code_r0x004ffd98;
      }
      plVar4 = plVar4 + 0x4b;
      lVar3 = lVar3 + -600;
    } while (lVar3 != 0);
  } while( true );
}

