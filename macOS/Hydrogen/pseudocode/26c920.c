
undefined8 FUN_0026c920(void)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long lVar5;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 uStack0000000000000098;
  long in_stack_000000a8;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  
code_r0x0026c920:
  if (unaff_x22 == unaff_x23) {
    if (((uint)unaff_x21 & 0xff) == 3) {
      while (in_stack_00000090 != in_stack_00000088) {
        func_0x00261518(unaff_x29 + -0x98,&uStack0000000000000080);
        lVar4 = *(long *)(unaff_x29 + -0x98);
        if (lVar4 == unaff_x23 + 1) break;
        lVar1 = *(long *)(unaff_x29 + -0x90);
        lVar5 = *(long *)(unaff_x29 + -0x88);
        if (lVar4 == unaff_x23) {
          if (((((uint)lVar1 & 0xff) == 3) && (unaff_x20 == *(ulong *)(unaff_x29 + -0x80))) &&
             (iVar2 = _memcmp(unaff_x19,lVar5,unaff_x20), iVar2 == 0)) {
            return 1;
          }
        }
        else if (unaff_x23 + -1 < lVar4) {
          if (((*(ulong *)(unaff_x29 + -0x80) & 0xff) == 0) &&
             ((*(ulong *)(unaff_x29 + -0x78) | 0x8000000000000000) != 0x8000000000000000)) {
            func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x70),*(ulong *)(unaff_x29 + -0x78),1);
          }
          if (lVar5 != 0) {
            puVar3 = (undefined8 *)(lVar1 + 8);
            do {
              if (puVar3[-1] != 0) {
                func_0x00187bd4(*puVar3,puVar3[-1],1);
              }
              puVar3 = puVar3 + 3;
              lVar5 = lVar5 + -1;
            } while (lVar5 != 0);
          }
          if (lVar4 != 0) {
            func_0x00187bd4(lVar1,lVar4 * 0x18,8);
          }
        }
      }
    }
  }
  else if (unaff_x23 + -1 < unaff_x22) {
    if (((unaff_x20 & 0xff) == 0) &&
       ((*(ulong *)(unaff_x29 + -0x78) | 0x8000000000000000) != 0x8000000000000000)) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x70),*(ulong *)(unaff_x29 + -0x78),1);
    }
    if (unaff_x19 != 0) {
      puVar3 = (undefined8 *)(unaff_x21 + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    if (unaff_x22 != 0) {
      func_0x00187bd4(unaff_x21,unaff_x22 * 0x18,8);
    }
  }
  do {
    if (in_stack_00000020 != in_stack_00000018) {
      func_0x00261518(unaff_x29 + -0x98,&uStack0000000000000010);
      unaff_x22 = *(long *)(unaff_x29 + -0x98);
      if (unaff_x22 != unaff_x23 + 1) break;
    }
    if (in_stack_00000040 == in_stack_00000038) {
      return 0;
    }
    *(undefined1 *)(unaff_x29 + -0x90) = 7;
    *(undefined8 *)(unaff_x29 + -0x98) = in_stack_00000008;
    uStack0000000000000098 = 0;
    in_stack_000000a8 = 0;
    in_stack_000000b8 = 0;
    func_0x00262614(&uStack0000000000000048,&uStack0000000000000030,0x30,unaff_x29 + -0x98,
                    &uStack0000000000000098,0xffff);
    if (uStack0000000000000048 != unaff_x23) {
      puVar3 = &uStack0000000000000048;
code_r0x0026cacc:
      func_0x002219a8(puVar3);
      return 0;
    }
    if (in_stack_00000070 != 0 || in_stack_00000060 != 0) {
      return 0;
    }
    if (in_stack_00000050 == 0) {
      return 0;
    }
    *(long *)(unaff_x29 + -0xb0) = in_stack_00000050;
    *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_00000058;
    *(undefined8 *)(unaff_x29 + -0xa0) = 0;
    func_0x00266d64(unaff_x29 + -0x98,unaff_x29 + -0xb0);
    lVar4 = *(long *)(unaff_x29 + -0x98);
    uVar6 = *(undefined8 *)(unaff_x26 + 8);
    *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x26 + 0x10);
    *(undefined8 *)(unaff_x29 + -0xd0) = uVar6;
    *(undefined8 *)(unaff_x29 + -0xc0) = *(undefined8 *)(unaff_x26 + 0x18);
    in_stack_000000d8 = *(undefined8 *)(unaff_x26 + 0x28);
    in_stack_000000d0 = *(undefined8 *)(unaff_x26 + 0x20);
    in_stack_000000e0 = *(undefined8 *)(unaff_x26 + 0x30);
    if (lVar4 != unaff_x23) {
      uVar6 = *(undefined8 *)(unaff_x29 + -0xd0);
      *(undefined8 *)(unaff_x25 + 0x10) = *(undefined8 *)(unaff_x29 + -200);
      *(undefined8 *)(unaff_x25 + 8) = uVar6;
      *(undefined8 *)(unaff_x25 + 0x18) = *(undefined8 *)(unaff_x29 + -0xc0);
      *(undefined8 *)(unaff_x24 + 0x28) = in_stack_000000d8;
      *(undefined8 *)(unaff_x24 + 0x20) = in_stack_000000d0;
      puVar3 = &uStack0000000000000098;
      uStack0000000000000098 = lVar4;
      in_stack_000000c8 = in_stack_000000e0;
      goto code_r0x0026cacc;
    }
    uVar6 = *(undefined8 *)(unaff_x29 + -0xd0);
    *(undefined8 *)(unaff_x25 + 0x18) = *(undefined8 *)(unaff_x29 + -200);
    *(undefined8 *)(unaff_x25 + 0x10) = uVar6;
    *(undefined8 *)(unaff_x25 + 0x20) = *(undefined8 *)(unaff_x29 + -0xc0);
    if (in_stack_000000a8 == 0) {
      return 0;
    }
    in_stack_00000088 = *(long *)(unaff_x25 + 0x18);
    uStack0000000000000080 = *(undefined8 *)(unaff_x25 + 0x10);
    in_stack_00000090 = *(long *)(unaff_x25 + 0x20);
  } while( true );
  unaff_x21 = *(long *)(unaff_x29 + -0x90);
  unaff_x19 = *(long *)(unaff_x29 + -0x88);
  unaff_x20 = *(ulong *)(unaff_x29 + -0x80);
  goto code_r0x0026c920;
}

