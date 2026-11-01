
void FUN_004ffd08(void)

{
  undefined8 uVar1;
  ulong uVar2;
  undefined1 in_ZR;
  int iVar3;
  long lVar4;
  long lVar5;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long *plVar6;
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
  
  do {
    if ((bool)in_ZR) {
      in_stack_00000008[1] = in_stack_00000018;
      *in_stack_00000008 = uStack0000000000000010;
      in_stack_00000008[2] = in_stack_00000020;
      return;
    }
    lVar4 = unaff_x28 + unaff_x27 * unaff_x22;
    lVar5 = *(long *)(lVar4 + 0x90);
    if (lVar5 != 0) {
      lVar5 = lVar5 * unaff_x19;
      plVar6 = (long *)(*(long *)(lVar4 + 0x88) + 0x220);
      do {
        if ((*plVar6 == unaff_x21) &&
           (iVar3 = _memcmp(plVar6[-1]), lVar4 = in_stack_00000020, iVar3 == 0)) {
          if (in_stack_00000020 == uStack0000000000000010) {
            func_0x0050c238(&uStack0000000000000010,&UNK_009e89e8);
          }
          *(long *)(in_stack_00000018 + lVar4 * 8) = unaff_x28 + unaff_x27 * unaff_x22;
          in_stack_00000020 = lVar4 + 1;
          func_0x004ffcac(&uStack0000000000000028);
          uVar2 = in_stack_00000038;
          uVar1 = in_stack_00000030;
          if ((ulong)(uStack0000000000000010 - in_stack_00000020) < in_stack_00000038) {
            func_0x007a5594(&uStack0000000000000010,in_stack_00000020,in_stack_00000038,8,8);
          }
          _memcpy(in_stack_00000018 + in_stack_00000020 * 8,uVar1,uVar2 << 3);
          in_stack_00000020 = in_stack_00000020 + uVar2;
          if (uStack0000000000000028 != 0) {
            func_0x00187bd4(uVar1,uStack0000000000000028 << 3,8);
          }
          break;
        }
        plVar6 = plVar6 + 0x4b;
        lVar5 = lVar5 + -600;
      } while (lVar5 != 0);
    }
    unaff_x27 = unaff_x27 + 1;
    in_ZR = unaff_x27 == unaff_x26;
  } while( true );
}

