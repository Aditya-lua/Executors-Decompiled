
void FUN_005a7918(undefined8 param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 in_x9;
  undefined8 unaff_x20;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 *in_stack_00000000;
  undefined8 in_stack_00000030;
  
  *(undefined8 *)(unaff_x29 + -0xd0) = unaff_x20;
  *(undefined8 *)(unaff_x29 + -200) = param_1;
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x78) = in_x9;
  *(undefined8 **)(unaff_x29 + -0x70) = unaff_x25;
  *(long *)(unaff_x29 + -0x68) = unaff_x22;
  in_stack_00000000 = (undefined8 *)*in_stack_00000000;
  puVar3 = (undefined8 *)*in_stack_00000000;
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009f1b98);
  }
  else {
    lVar4 = in_stack_00000000[1];
    puVar2 = (undefined8 *)func_0x00187bd0(0x3e0,8);
    if (puVar2 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x3e0);
    }
    else {
      *puVar2 = 0;
      *(undefined2 *)((long)puVar2 + 0x37a) = 0;
      puVar2[0x70] = puVar3;
      *puVar3 = puVar2;
      *(undefined2 *)(puVar3 + 0x6f) = 0;
      *in_stack_00000000 = puVar2;
      in_stack_00000000[1] = lVar4 + 1;
      if (unaff_x22 == lVar4) {
        *(undefined2 *)((long)puVar2 + 0x37a) = 1;
        puVar2[1] = unaff_x20;
        uVar6 = *(undefined8 *)(unaff_x29 + -0xb0);
        uVar5 = *(undefined8 *)(unaff_x29 + -0xb8);
        uVar7 = *(undefined8 *)(unaff_x29 + -0xa8);
        uVar9 = *(undefined8 *)(unaff_x29 + -0x90);
        uVar8 = *(undefined8 *)(unaff_x29 + -0x98);
        puVar2[0x11] = *(undefined8 *)(unaff_x29 + -0xa0);
        puVar2[0x10] = uVar7;
        puVar2[0x13] = uVar9;
        puVar2[0x12] = uVar8;
        puVar2[0x14] = *(undefined8 *)(unaff_x29 + -0x88);
        uVar7 = *(undefined8 *)(unaff_x29 + -200);
        puVar2[0xd] = *(undefined8 *)(unaff_x29 + -0xc0);
        puVar2[0xc] = uVar7;
        puVar2[0xf] = uVar6;
        puVar2[0xe] = uVar5;
        puVar2[0x71] = unaff_x25;
        *unaff_x25 = puVar2;
        *(undefined2 *)(unaff_x25 + 0x6f) = 1;
        *unaff_x26 = unaff_x28;
        unaff_x26[1] = in_stack_00000030;
        unaff_x26[2] = unaff_x27;
        return;
      }
      func_0x007a247c(&UNK_008ae948,0x30,&UNK_009f1bc8);
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5a7b64);
  (*pcVar1)();
}

