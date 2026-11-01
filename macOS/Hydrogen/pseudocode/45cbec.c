
void FUN_0045cbec(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  long *unaff_x19;
  long *unaff_x20;
  long lVar4;
  long unaff_x23;
  undefined2 unaff_w26;
  undefined1 unaff_w27;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  long in_stack_00000048;
  
  do {
    func_0x007a1e50(param_1,unaff_x23,3);
    unaff_x23 = in_stack_00000018;
    do {
      *(undefined2 *)(in_stack_00000010 + unaff_x23) = unaff_w26;
      *(undefined1 *)((undefined2 *)(in_stack_00000010 + unaff_x23) + 1) = unaff_w27;
      unaff_x23 = unaff_x23 + 3;
      lVar4 = in_stack_00000010;
      do {
        in_stack_00000018 = unaff_x23;
        func_0x0046daac(&uStack0000000000000030,&uStack0000000000000020);
        lVar3 = in_stack_00000048;
        uVar2 = in_stack_00000038;
        lVar1 = uStack0000000000000030;
        if (uStack0000000000000030 == 0) {
          unaff_x20[1] = in_stack_00000010;
          *unaff_x20 = uStack0000000000000008;
          unaff_x20[2] = in_stack_00000018;
          if (*unaff_x19 != 0) {
            func_0x00187bd4();
          }
          return;
        }
        if ((ulong)(uStack0000000000000008 - unaff_x23) < in_stack_00000038) {
          func_0x007a1e50(&uStack0000000000000008,unaff_x23,in_stack_00000038);
          lVar4 = in_stack_00000010;
          unaff_x23 = in_stack_00000018;
        }
        _memcpy(lVar4 + unaff_x23,lVar1,uVar2);
        unaff_x23 = unaff_x23 + uVar2;
      } while (lVar3 == 0);
    } while (2 < (ulong)(uStack0000000000000008 - unaff_x23));
    param_1 = &uStack0000000000000008;
    in_stack_00000018 = unaff_x23;
  } while( true );
}

