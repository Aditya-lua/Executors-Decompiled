
void FUN_005e5c24(undefined8 *param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  long *plVar4;
  long unaff_x19;
  undefined8 unaff_x21;
  undefined4 unaff_w22;
  long unaff_x24;
  ulong unaff_x25;
  ulong unaff_x27;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  
  do {
    func_0x005e6024(param_1);
    lVar3 = in_stack_00000010;
    do {
      unaff_x27 = unaff_x27 + 1;
      puVar1 = (undefined8 *)(in_stack_00000010 + unaff_x24);
      *puVar1 = 0;
      puVar1[1] = 0;
      puVar1[2] = 0;
      puVar1[3] = unaff_x21;
      *(undefined4 *)(puVar1 + 4) = unaff_w22;
      *(int *)(puVar1 + 5) = (int)unaff_x27;
      unaff_x24 = unaff_x24 + 0x40;
      in_stack_00000018 = unaff_x27;
      if (unaff_x25 == unaff_x27) {
        if (unaff_x25 < uStack0000000000000008) {
          lVar3 = func_0x00187bd8(in_stack_00000010,uStack0000000000000008 << 6,0x40);
          if (lVar3 == 0) {
            func_0x007a1f00(0x40);
            goto code_r0x005e5cf8;
          }
          plVar4 = (long *)func_0x00187bd0(0x20,8);
        }
        else {
          plVar4 = (long *)func_0x00187bd0(0x20,8);
        }
        if (plVar4 != (long *)0x0) {
          *plVar4 = lVar3;
          plVar4[1] = unaff_x25;
          plVar4[2] = unaff_x19;
          *(int *)(plVar4 + 3) = 0x3f - (int)LZCOUNT(unaff_x25);
          return;
        }
        func_0x007a1f18(8,0x20);
code_r0x005e5cf8:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x5e5cfc);
        (*pcVar2)();
      }
    } while (unaff_x27 != uStack0000000000000008);
    param_1 = &uStack0000000000000008;
  } while( true );
}

