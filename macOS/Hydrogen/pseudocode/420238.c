
void FUN_00420238(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  long lVar2;
  long *extraout_x8;
  long *plVar3;
  long *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  while( true ) {
    plVar3 = param_1;
    uVar5 = param_3;
    uVar4 = param_2;
    *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x22;
    *(undefined8 *)((long)register0x00000008 + -0x18) = unaff_x21;
    *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x20;
    *(long **)((long)register0x00000008 + -8) = unaff_x19;
    *(undefined8 *)register0x00000008 = *(undefined8 *)register0x00000008;
    *(undefined8 *)((long)register0x00000008 + 8) = *(undefined8 *)((long)register0x00000008 + 8);
    func_0x00464acc((undefined8 *)((long)register0x00000008 + -0x78));
    if (*(short *)((long)register0x00000008 + -0x78) == 2) {
      func_0x00432ed4((undefined8 *)((long)register0x00000008 + -0x58),uVar4,uVar5);
      lVar2 = *(long *)((long)register0x00000008 + -0x50);
      if ((*(uint *)((long)register0x00000008 + -0x58) & 1) == 0) {
        *(undefined8 *)((long)register0x00000008 + -0x28) =
             *(undefined8 *)((long)register0x00000008 + -0x40);
        *(undefined8 *)((long)register0x00000008 + -0x30) =
             *(undefined8 *)((long)register0x00000008 + -0x48);
        *(long *)((long)register0x00000008 + -0x38) = lVar2;
        func_0x0041fc04(plVar3,(undefined8 *)((long)register0x00000008 + -0x38));
      }
      else {
        *plVar3 = 0;
        plVar3[1] = lVar2;
      }
      return;
    }
    puVar1 = (undefined8 *)func_0x00187bd0(0x20,4);
    if (puVar1 != (undefined8 *)0x0) break;
    lVar2 = func_0x007a1f18(4,0x20);
    *(BADSPACEBASE **)((long)register0x00000008 + -0x90) = register0x00000008;
    *(undefined **)((long)register0x00000008 + -0x88) =
         &
         __ZN78__LT_alloc__string__String_u20_as_u20_std__net__socket_addr__ToSocketAddrs_GT_15to_socket_addrs17h1dbb516e1c642fe3E
    ;
    register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x90);
    param_2 = *(undefined8 *)(lVar2 + 8);
    param_3 = *(undefined8 *)(lVar2 + 0x10);
    param_1 = extraout_x8;
    unaff_x19 = plVar3;
    unaff_x20 = uVar5;
    unaff_x21 = uVar4;
  }
  uVar4 = *(undefined8 *)((long)register0x00000008 + -0x78);
  uVar6 = *(undefined8 *)((long)register0x00000008 + -0x60);
  uVar5 = *(undefined8 *)((long)register0x00000008 + -0x68);
  puVar1[1] = *(undefined8 *)((long)register0x00000008 + -0x70);
  *puVar1 = uVar4;
  puVar1[3] = uVar6;
  puVar1[2] = uVar5;
  *plVar3 = (long)puVar1;
  plVar3[1] = (long)puVar1;
  plVar3[2] = 1;
  plVar3[3] = (long)(puVar1 + 4);
  return;
}

