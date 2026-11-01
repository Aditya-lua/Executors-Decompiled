
undefined8 FUN_007af8b8(long *param_1)

{
  byte bVar1;
  code *pcVar2;
  ulong in_x9;
  long lVar3;
  ulong in_x10;
  ulong in_x11;
  ulong uVar4;
  ulong in_x12;
  long lVar5;
  ulong in_x13;
  long in_x14;
  ulong *unaff_x19;
  ulong unaff_x21;
  long in_stack_00000008;
  ulong in_stack_00000010;
  ulong *in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  
  do {
    uVar4 = in_x13 & 0x8080808080808080;
    if (uVar4 != 0) {
      do {
        uVar4 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
        uVar4 = in_x12 + ((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3) & in_x10;
        if (-1 < *(char *)((long)unaff_x19 + uVar4)) {
          uVar4 = (*unaff_x19 & 0x8080808080808080) >> 7;
          uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
          uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
          uVar4 = (ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3;
        }
        bVar1 = (byte)(in_x11 >> 0x38);
        *(byte *)((long)unaff_x19 + uVar4) = bVar1 >> 1;
        *(byte *)((long)unaff_x19 + (uVar4 - 8 & in_x10) + 8) = bVar1 >> 1;
        lVar3 = *param_1;
        in_stack_00000020[-1 - uVar4] = *(ulong *)(lVar3 + ~in_x9 * 8);
        uVar4 = in_x9;
        do {
          in_x9 = uVar4 + 1;
          if (uVar4 == unaff_x21) {
            lVar5 = param_1[1];
            *param_1 = (long)in_stack_00000020;
            param_1[1] = in_stack_00000028;
            param_1[2] = in_stack_00000030;
            param_1[3] = in_stack_00000038;
            if (lVar5 != 0) {
              uVar4 = (in_stack_00000048 + in_stack_00000040 + in_stack_00000040 * lVar5) - 1U &
                      -in_stack_00000048;
              func_0x00187bd4(lVar3 - uVar4,lVar5 + uVar4 + 9);
            }
            return 0x8000000000000001;
          }
          uVar4 = in_x9;
        } while (*(char *)(lVar3 + in_x9) < '\0');
        uVar4 = *(ulong *)(lVar3 + in_x9 * -8 + -8);
        if (in_stack_00000010 <= uVar4) {
          func_0x007a2570(uVar4,in_stack_00000010,&UNK_009f22d0);
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x7af984);
          (*pcVar2)();
        }
        in_x11 = *(ulong *)(in_stack_00000008 + uVar4 * 0x10 + 8);
        in_x12 = in_stack_00000028 & in_x11;
        uVar4 = *(ulong *)((long)in_stack_00000020 + in_x12) & 0x8080808080808080;
        in_x10 = in_stack_00000028;
        unaff_x19 = in_stack_00000020;
      } while (uVar4 != 0);
      in_x14 = 8;
    }
    in_x12 = in_x12 + in_x14 & in_x10;
    in_x13 = *(ulong *)((long)unaff_x19 + in_x12);
    in_x14 = in_x14 + 8;
  } while( true );
}

