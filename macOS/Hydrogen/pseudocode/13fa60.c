
void FUN_0013fa60(long param_1)

{
  int iVar1;
  uint in_w9;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  int in_w13;
  byte bVar2;
  int iVar3;
  ulong in_x17;
  long unaff_x19;
  ulong uVar4;
  undefined8 unaff_x21;
  long unaff_x27;
  undefined8 *unaff_x28;
  undefined8 uVar5;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  ulong uStack0000000000000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_000000a8;
  long in_stack_000000b8;
  
code_r0x0013fa60:
  iVar3 = *(int *)(unaff_x19 + 0x54);
  iVar1 = 0;
  if (iVar3 != 0) {
    iVar1 = (int)in_w9 / iVar3;
  }
  in_w9 = iVar3 + iVar1 * iVar3;
  bVar2 = 0;
  do {
    iVar3 = in_w13;
    if ((bVar2 & 0xe0) == 0xc0) {
      iVar3 = in_w13 + 1;
    }
    while( true ) {
      while( true ) {
        while( true ) {
          while( true ) {
            in_x11 = (ulong)(uint)(iVar3 + (int)in_x11);
            if (in_x10 <= in_x11) {
              uVar4 = (ulong)in_w9 << 0x20 | in_x17 & 0xffffffff;
              uStack0000000000000070 = uVar4;
              func_0x001377f0(&uStack0000000000000058);
              if (in_stack_00000090 < 0) {
                __ZdlPv(in_stack_00000080);
              }
              in_stack_00000088 = in_stack_00000060;
              in_stack_00000080 = uStack0000000000000058;
              in_stack_00000090 = in_stack_00000068;
              uVar5 = *unaff_x28;
              *(undefined8 *)(unaff_x27 + 0x70) = unaff_x28[1];
              *(undefined8 *)(unaff_x27 + 0x68) = uVar5;
              *(undefined8 *)(unaff_x19 + 0x20) = unaff_x21;
              *(ulong *)(unaff_x19 + 0x28) = uVar4;
              func_0x00139988();
              *(undefined1 *)(unaff_x19 + 0x5d) = 1;
              func_0x001420d0();
              if (in_stack_000000b8 < 0) {
                __ZdlPv(in_stack_000000a8);
              }
              if (in_stack_00000090 < 0) {
                __ZdlPv(in_stack_00000080);
              }
              return;
            }
            bVar2 = *(byte *)(param_1 + in_x11 * in_x12);
            if (bVar2 == 9) goto code_r0x0013fa60;
            in_w9 = in_w9 + 1;
            if ((bVar2 & 0xfe) != 0xfc) break;
            iVar3 = 6;
          }
          if ((bVar2 & 0xfc) != 0xf8) break;
          iVar3 = 5;
        }
        if ((bVar2 & 0xf8) != 0xf0) break;
        iVar3 = 4;
      }
      if ((bVar2 & 0xf0) != 0xe0) break;
      iVar3 = 3;
    }
  } while( true );
}

