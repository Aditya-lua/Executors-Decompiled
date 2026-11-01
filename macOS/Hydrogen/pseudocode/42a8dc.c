
void FUN_0042a8dc(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  uint *puVar2;
  undefined *puVar3;
  undefined8 uVar4;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined1 uStack0000000000000008;
  long in_stack_00000210;
  undefined1 *in_stack_00000218;
  long in_stack_00000220;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (0x17f < unaff_x20) {
    func_0x00459450(auStack_7ffffffe + 0x8000020e,param_2);
    if (in_stack_00000210 == -0x8000000000000000) {
      (*(code *)&DAT_003f4af4)(1,in_stack_00000218,in_stack_00000220);
      *in_stack_00000218 = 0;
      if (in_stack_00000220 == 0) {
        return;
      }
      in_stack_00000210 = in_stack_00000220;
    }
    else {
      *unaff_x19 = 1;
      unaff_x19[1] = &UNK_009dae48;
      if (in_stack_00000210 == 0) {
        return;
      }
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(in_stack_00000218,in_stack_00000210,1);
    return;
  }
  _memcpy(&uStack0000000000000008);
  auStack_7ffffffe[unaff_x20 + 0x80000006] = 0;
  func_0x00462a54(unaff_x29 + -200,&uStack0000000000000008,unaff_x20 + 1);
  if (*(int *)(unaff_x29 + -200) == 1) {
    puVar3 = &UNK_009dae48;
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x38) = 0;
    *(undefined8 *)(unaff_x29 + -0x40) = 0;
    *(undefined8 *)(unaff_x29 + -0x28) = 0;
    *(undefined8 *)(unaff_x29 + -0x30) = 0;
    *(undefined8 *)(unaff_x29 + -0x58) = 0;
    *(undefined8 *)(unaff_x29 + -0x60) = 0;
    *(undefined8 *)(unaff_x29 + -0x48) = 0;
    *(undefined8 *)(unaff_x29 + -0x50) = 0;
    *(undefined8 *)(unaff_x29 + -0x78) = 0;
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    *(undefined8 *)(unaff_x29 + -0x68) = 0;
    *(undefined8 *)(unaff_x29 + -0x70) = 0;
    *(undefined8 *)(unaff_x29 + -0x98) = 0;
    *(undefined8 *)(unaff_x29 + -0xa0) = 0;
    *(undefined8 *)(unaff_x29 + -0x88) = 0;
    *(undefined8 *)(unaff_x29 + -0x90) = 0;
    *(undefined8 *)(unaff_x29 + -0xa8) = 0;
    *(undefined8 *)(unaff_x29 + -0xb0) = 0;
    iVar1 = _stat(*(undefined8 *)(unaff_x29 + -0xc0),unaff_x29 + -0xb0);
    if (iVar1 != -1) {
      uVar4 = 0;
      uVar7 = *(undefined8 *)(unaff_x29 + -0x68);
      uVar6 = *(undefined8 *)(unaff_x29 + -0x70);
      uVar5 = *(undefined8 *)(unaff_x29 + -0x60);
      unaff_x19[0xc] = *(undefined8 *)(unaff_x29 + -0x58);
      unaff_x19[0xb] = uVar5;
      uVar5 = *(undefined8 *)(unaff_x29 + -0x50);
      uVar9 = *(undefined8 *)(unaff_x29 + -0x38);
      uVar8 = *(undefined8 *)(unaff_x29 + -0x40);
      unaff_x19[0xe] = *(undefined8 *)(unaff_x29 + -0x48);
      unaff_x19[0xd] = uVar5;
      unaff_x19[0x10] = uVar9;
      unaff_x19[0xf] = uVar8;
      uVar5 = *(undefined8 *)(unaff_x29 + -0x30);
      unaff_x19[0x12] = *(undefined8 *)(unaff_x29 + -0x28);
      unaff_x19[0x11] = uVar5;
      uVar9 = *(undefined8 *)(unaff_x29 + -0xa8);
      uVar8 = *(undefined8 *)(unaff_x29 + -0xb0);
      uVar5 = *(undefined8 *)(unaff_x29 + -0xa0);
      unaff_x19[4] = *(undefined8 *)(unaff_x29 + -0x98);
      unaff_x19[3] = uVar5;
      uVar5 = *(undefined8 *)(unaff_x29 + -0x90);
      uVar11 = *(undefined8 *)(unaff_x29 + -0x78);
      uVar10 = *(undefined8 *)(unaff_x29 + -0x80);
      unaff_x19[6] = *(undefined8 *)(unaff_x29 + -0x88);
      unaff_x19[5] = uVar5;
      unaff_x19[8] = uVar11;
      unaff_x19[7] = uVar10;
      unaff_x19[10] = uVar7;
      unaff_x19[9] = uVar6;
      unaff_x19[2] = uVar9;
      unaff_x19[1] = uVar8;
      goto code_r0x0042a9a8;
    }
    puVar2 = (uint *)___error();
    puVar3 = (undefined *)((ulong)*puVar2 << 0x20 | 2);
  }
  unaff_x19[1] = puVar3;
  uVar4 = 1;
code_r0x0042a9a8:
  *unaff_x19 = uVar4;
  return;
}

