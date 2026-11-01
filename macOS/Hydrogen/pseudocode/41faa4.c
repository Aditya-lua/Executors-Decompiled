
undefined1  [16] FUN_0041faa4(void)

{
  long lVar1;
  ulong uVar2;
  uint *puVar3;
  ulong uVar4;
  long *unaff_x19;
  undefined8 uVar5;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 *puVar6;
  ulong unaff_x27;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000008;
  long *in_stack_00000010;
  ulong in_stack_00000018;
  
code_r0x0041faa4:
  unaff_x19[2] = unaff_x23 + unaff_x27;
  uVar2 = unaff_x21 + unaff_x27;
  unaff_x21 = unaff_x22;
  if (uVar2 <= unaff_x22) {
    unaff_x21 = uVar2;
  }
  *(ulong *)(unaff_x20 + 0x10) = unaff_x21;
  uVar2 = unaff_x27 + in_stack_00000018;
  uVar5 = 1;
  in_stack_00000018 = uVar2;
  if (unaff_x27 != 0) {
LAB_0041f924:
    if (unaff_x21 < unaff_x22) {
code_r0x0041f92c:
      in_stack_00000018 = unaff_x22 - unaff_x21;
      if (unaff_x25 != 0) goto code_r0x0041f934;
    }
    else {
      unaff_x22 = _read(0);
      if (unaff_x22 != 0xffffffffffffffff) {
        uVar4 = unaff_x22;
        if (unaff_x22 <= unaff_x24) {
          uVar4 = unaff_x24;
        }
        unaff_x21 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
        *(ulong *)(unaff_x20 + 0x18) = unaff_x22;
        *(ulong *)(unaff_x20 + 0x20) = uVar4;
        unaff_x24 = uVar4;
        goto code_r0x0041f92c;
      }
      puVar3 = (uint *)___error();
      unaff_x22 = 0;
      in_stack_00000018 = (ulong)*puVar3 << 0x20 | 2;
      unaff_x21 = 0;
      *(undefined8 *)(unaff_x20 + 0x10) = 0;
      *(undefined8 *)(unaff_x20 + 0x18) = 0;
      *(ulong *)(unaff_x20 + 0x20) = unaff_x24;
      if (in_stack_00000018 == 0) goto code_r0x0041f92c;
      unaff_x22 = 0;
      unaff_x21 = 0;
      if (in_stack_00000018 == 0x900000002) goto code_r0x0041f92c;
    }
    uVar4 = in_stack_00000018 & 3;
    if (uVar4 < 2) {
      if (uVar4 == 0) {
        if (*(char *)(in_stack_00000018 + 0x10) != '#') goto LAB_0041fafc;
      }
      else {
        if (*(char *)(in_stack_00000018 + 0xf) != '#') goto LAB_0041fafc;
        unaff_x23 = *(long *)(in_stack_00000018 - 1);
        puVar6 = *(undefined8 **)(in_stack_00000018 + 7);
        if ((code *)*puVar6 != (code *)0x0) {
          (*(code *)*puVar6)(unaff_x23);
        }
        if (puVar6[1] != 0) {
          func_0x00187bd4(unaff_x23,puVar6[1],puVar6[2]);
        }
        func_0x00187bd4(in_stack_00000018 - 1,0x18,8);
      }
    }
    else if (uVar4 == 2) {
      if (in_stack_00000018 >> 0x20 != 4) goto LAB_0041fafc;
    }
    else if (in_stack_00000018 >> 0x20 != 0x23) goto LAB_0041fafc;
    goto LAB_0041f924;
  }
  goto LAB_0041fb84;
code_r0x0041f934:
  lVar1 = unaff_x25 + unaff_x21;
  if (in_stack_00000018 < 0x10) {
    if (in_stack_00000018 != 0) {
      uVar4 = 0;
      do {
        if ((uint)*(byte *)(lVar1 + uVar4) == (in_stack_00000008._4_4_ & 0xff))
        goto code_r0x0041fb28;
        uVar4 = uVar4 + 1;
      } while (in_stack_00000018 != uVar4);
    }
  }
  else {
    auVar7 = func_0x0046b0fc(in_stack_00000008._4_4_,lVar1,in_stack_00000018);
    uVar4 = auVar7._8_8_;
    if ((auVar7._0_8_ & 1) != 0) goto code_r0x0041fb20;
  }
  unaff_x23 = in_stack_00000010[2];
  if ((ulong)(*in_stack_00000010 - unaff_x23) < in_stack_00000018) {
    func_0x007a0000(in_stack_00000010,unaff_x23,in_stack_00000018,1,1);
    unaff_x23 = in_stack_00000010[2];
  }
  _memcpy(in_stack_00000010[1] + unaff_x23,lVar1,in_stack_00000018);
  unaff_x19 = in_stack_00000010;
  unaff_x27 = in_stack_00000018;
  in_stack_00000018 = uVar2;
  goto code_r0x0041faa4;
code_r0x0041fb20:
  if (uVar4 == 0xffffffffffffffff) {
    func_0x007a28fc(&UNK_009da7b8);
code_r0x0041fb9c:
    func_0x007a28b0(unaff_x23,in_stack_00000018,&UNK_009da7b8);
  }
  else {
code_r0x0041fb28:
    unaff_x23 = uVar4 + 1;
    if (in_stack_00000018 <= uVar4) goto code_r0x0041fb9c;
    unaff_x24 = in_stack_00000010[2];
    if (uVar4 < *in_stack_00000010 - unaff_x24) goto code_r0x0041fb4c;
  }
  func_0x007a0000(in_stack_00000010,unaff_x24,unaff_x23,1,1);
  unaff_x24 = in_stack_00000010[2];
code_r0x0041fb4c:
  _memcpy(in_stack_00000010[1] + unaff_x24,lVar1,unaff_x23);
  in_stack_00000010[2] = unaff_x24 + unaff_x23;
  if (unaff_x21 + unaff_x23 <= unaff_x22) {
    unaff_x22 = unaff_x21 + unaff_x23;
  }
  *(ulong *)(unaff_x20 + 0x10) = unaff_x22;
  in_stack_00000018 = unaff_x23 + uVar2;
LAB_0041fb84:
  uVar5 = 0;
LAB_0041fafc:
  auVar7._8_8_ = in_stack_00000018;
  auVar7._0_8_ = uVar5;
  return auVar7;
}

