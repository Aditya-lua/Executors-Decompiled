
void FUN_002158b4(int *param_1)

{
  int *piVar1;
  code *pcVar2;
  undefined1 in_ZR;
  long lVar3;
  long in_x9;
  int *in_x10;
  long unaff_x20;
  long *plVar4;
  long unaff_x21;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  int *unaff_x28;
  undefined8 *in_stack_00000010;
  undefined1 uStack0000000000000060;
  undefined8 uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 uStack0000000000000130;
  long in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  long in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 uStack0000000000000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  long in_stack_000001c8;
  long in_stack_000001d0;
  long in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  
  while (!(bool)in_ZR && in_x10 != unaff_x28) {
    if (*(long *)(param_1 + -2) == in_x9) {
      if (1 < *param_1 + 1U) {
        *in_stack_00000010 = 0x800000000000001a;
        *(undefined1 *)(in_stack_00000010 + 1) = 0x19;
        func_0x002097e0(&uStack00000000000000a8);
        goto code_r0x00215a1c;
      }
      break;
    }
    piVar1 = param_1 + 4;
    in_x10 = param_1 + 6;
    param_1 = param_1 + 8;
    in_ZR = (short)*piVar1 == 0x19;
  }
  if (*(long *)(unaff_x21 + 0x130) != -0x8000000000000000) {
    lVar6 = *(long *)(unaff_x21 + 0x140);
    if (lVar6 < 0) {
      uVar8 = 0;
LAB_00215a98:
      func_0x007a1f00(uVar8,lVar6,&UNK_009c6fd0);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x215ab0);
      (*pcVar2)();
    }
    uVar5 = *(undefined8 *)(unaff_x21 + 0x138);
    if (lVar6 == 0) {
      lVar3 = 1;
    }
    else {
      uVar8 = 1;
      lVar3 = func_0x00187bd0(lVar6,1);
      if (lVar3 == 0) goto LAB_00215a98;
    }
    _memcpy(lVar3,uVar5,lVar6);
    in_stack_00000100 = lVar6;
    in_stack_00000108 = lVar3;
    in_stack_00000110 = lVar6;
  }
  lVar6 = *(long *)(unaff_x20 + 0x60);
  lVar3 = *(long *)(unaff_x20 + 0x68);
  lVar7 = *(long *)(lVar3 + 0x10);
  if (*(char *)(unaff_x20 + 0x38) == '\x01') {
    in_stack_00000138 = *(long *)(unaff_x20 + 0x40);
    uStack0000000000000130 = *(ulong *)(unaff_x20 + 0x38);
    in_stack_00000148 = *(undefined8 *)(unaff_x20 + 0x50);
    in_stack_00000140 = *(undefined8 *)(unaff_x20 + 0x48);
  }
  else {
    plVar4 = (long *)(unaff_x20 + 0x40);
    if (*plVar4 == -0x8000000000000000) {
      in_stack_00000158 = *(undefined8 *)(unaff_x20 + 0x48);
      in_stack_00000150 = *plVar4;
      in_stack_00000180 = *(undefined8 *)(unaff_x20 + 0x50);
    }
    else {
      func_0x0045cd08(&uStack0000000000000170,plVar4);
      in_stack_00000158 = in_stack_00000178;
      in_stack_00000150 = uStack0000000000000170;
    }
    in_stack_00000140 = in_stack_00000158;
    in_stack_00000138 = in_stack_00000150;
    uStack0000000000000130 = uStack0000000000000130 & 0xffffffffffffff00;
    in_stack_00000148 = in_stack_00000180;
    in_stack_00000160 = in_stack_00000180;
  }
  in_stack_000001b8 = in_stack_000000f0;
  in_stack_000001b0 = in_stack_000000e8;
  in_stack_000001c8 = in_stack_00000100;
  in_stack_000001c0 = in_stack_000000f8;
  in_stack_000001d8 = in_stack_00000110;
  in_stack_000001d0 = in_stack_00000108;
  in_stack_000001e8 = in_stack_00000120;
  in_stack_000001e0 = in_stack_00000118;
  in_stack_00000178 = in_stack_000000b0;
  uStack0000000000000170 = uStack00000000000000a8;
  in_stack_00000188 = in_stack_000000c0;
  in_stack_00000180 = in_stack_000000b8;
  in_stack_00000198 = in_stack_000000d0;
  in_stack_00000190 = in_stack_000000c8;
  in_stack_000001a8 = in_stack_000000e0;
  in_stack_000001a0 = in_stack_000000d8;
  (**(code **)(lVar3 + 0x48))
            (lVar6 + (lVar7 - 1U & 0xfffffffffffffff0) + 0x10,&uStack0000000000000130,
             &uStack0000000000000170);
  *in_stack_00000010 = 0x8000000000000027;
code_r0x00215a1c:
  func_0x00252db4(&uStack0000000000000060);
  return;
}

