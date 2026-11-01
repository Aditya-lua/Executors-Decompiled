
long FUN_0067ab78(void)

{
  uint uVar1;
  ulong uVar2;
  ulong in_x9;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long in_x16;
  ulong unaff_x19;
  ulong unaff_x21;
  ulong *unaff_x22;
  ulong *unaff_x23;
  ulong unaff_x24;
  uint unaff_w25;
  uint unaff_w26;
  ulong unaff_x27;
  long unaff_x28;
  ulong in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000030;
  ulong *in_stack_00000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  
  do {
    *unaff_x23 = in_x9 ^ unaff_x27;
    while( true ) {
      unaff_w25 = unaff_w25 - 0x40;
      if (unaff_w25 < 0x40) {
        if (unaff_w25 != 0) {
          uVar2 = *unaff_x22 << ((ulong)-unaff_w25 & 0x3f);
          if (*(uint *)(in_stack_00000010 + 0x90) != 0) {
            uVar5 = 0;
            uVar4 = (ulong)*(uint *)(in_stack_00000010 + 0x90) + 0x3f >> 3 & 0x3ffffff8;
            do {
              uVar6 = *(ulong *)((long)unaff_x22 + (uVar4 - 8));
              *(ulong *)((long)unaff_x22 + (uVar4 - 8)) = uVar6 >> ((ulong)unaff_w25 & 0x3f) | uVar5
              ;
              uVar5 = uVar6 << ((ulong)(0x40 - unaff_w25) & 0x3f);
              uVar4 = uVar4 - 8;
            } while (uVar4 != 0);
          }
          uVar1 = *(uint *)(in_stack_00000010 + 0x98);
          uVar4 = (ulong)uVar1;
          if (uVar1 < 0x40) {
            uVar5 = 0;
            do {
              uVar6 = (uVar2 >> (uVar5 & 0x3f) & 1) << (uVar4 + uVar5 & 0x3f);
              if (0x3f < (uint)(uVar4 + uVar5)) {
                uVar6 = 0;
              }
              uVar2 = uVar6 ^ uVar2;
              uVar5 = uVar5 + 1;
            } while (0x40 - uVar4 != uVar5);
          }
          else {
            uVar3 = (uVar1 >> 6) - 1;
            unaff_x22[uVar3] = unaff_x22[uVar3] ^ uVar2 << (uVar4 & 0x3f);
          }
          if ((uVar1 & 0x3f) != 0) {
            uVar4 = (ulong)(uVar1 >> 3) & 0x1ffffff8;
            *(ulong *)((long)unaff_x22 + uVar4) =
                 *(ulong *)((long)unaff_x22 + uVar4) ^ uVar2 >> ((ulong)-(uVar1 & 0x3f) & 0x3f);
          }
          uVar1 = *(uint *)(in_stack_00000010 + 0x94);
          uVar3 = uVar1 & 0x3f;
          if (uVar3 == 0) {
            uVar1 = (uVar1 >> 6) - 1;
          }
          else {
            uVar1 = uVar1 >> 6;
            unaff_x22[uVar1 - 1] = unaff_x22[uVar1 - 1] ^ uVar2 << uVar3;
            uVar2 = uVar2 >> ((ulong)-uVar3 & 0x3f);
          }
          unaff_x22[uVar1] = unaff_x22[uVar1] ^ uVar2;
        }
        if (*(ulong **)(in_stack_00000010 + 0xb8) != unaff_x22) {
          _memcpy();
        }
        if (0x1ffffffffffffffe < in_stack_00000000) {
          in_stack_00000000 = 0x1fffffffffffffff;
        }
        if (in_stack_00000000 != 0) {
          do {
            *(undefined8 *)(in_stack_00000008 + -8 + in_stack_00000000 * 8) = 0;
            in_stack_00000000 = in_stack_00000000 - 1;
          } while (in_stack_00000000 != 0);
        }
        func_0x00611644(in_stack_00000008);
        return in_stack_00000010 + 0xa0;
      }
      unaff_x27 = *unaff_x22;
      if (0x40 < unaff_w26) {
        _memmove();
      }
      unaff_x22[in_x16] = 0;
      if ((uint)unaff_x28 < 0x40) {
        uVar2 = 0;
        do {
          uVar4 = (unaff_x27 >> (uVar2 & 0x3f) & 1) << (unaff_x28 + uVar2 & 0x3f);
          if (0x3f < (uint)(unaff_x28 + uVar2)) {
            uVar4 = 0;
          }
          unaff_x27 = uVar4 ^ unaff_x27;
          uVar2 = uVar2 + 1;
        } while (unaff_x24 != uVar2);
      }
      else {
        *(ulong *)((long)unaff_x22 + in_stack_00000018) =
             *(ulong *)((long)unaff_x22 + in_stack_00000018) ^ unaff_x27 << (unaff_x21 & 0x3f);
      }
      if ((int)unaff_x21 != 0) {
        *(ulong *)((long)unaff_x22 + in_stack_00000030) =
             *(ulong *)((long)unaff_x22 + in_stack_00000030) ^
             unaff_x27 >> (in_stack_00000048 & 0x3f);
      }
      if ((int)unaff_x19 == 0) break;
      *unaff_x23 = *unaff_x23 ^ unaff_x27 << (unaff_x19 & 0x3f);
      *in_stack_00000038 = *in_stack_00000038 ^ unaff_x27 >> (in_stack_00000040 & 0x3f);
    }
    in_x9 = *unaff_x23;
  } while( true );
}

