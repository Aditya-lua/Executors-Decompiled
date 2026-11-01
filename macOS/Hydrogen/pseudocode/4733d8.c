
void FUN_004733d8(ulong param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  undefined1 uStack0000000000000074;
  undefined1 uStack0000000000000075;
  undefined1 uStack0000000000000076;
  undefined1 uStack000000000000007c;
  undefined1 uStack000000000000007e;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  uVar4 = (uint)param_1;
  if (uVar4 < 1000) {
    lVar5 = 10;
    uVar7 = uVar4;
    if (uVar4 < 10) goto code_r0x0047662c;
  }
  else {
    lVar6 = 0;
    do {
      lVar5 = lVar6;
      uVar3 = param_1 & 0xffffffff;
      uVar7 = (uint)(uVar3 / 10000);
      uVar8 = (uint)(uVar3 / 10000);
      uVar9 = (uint)param_1;
      uVar2 = uVar9 + uVar8 * -10000;
      uVar1 = (uVar2 >> 2 & 0x3fff) / 0x19;
      *(undefined2 *)(&uStack000000000000007c + lVar5) =
           *(undefined2 *)(&UNK_00893f27 + (ulong)uVar1 * 2);
      *(undefined2 *)(&uStack000000000000007e + lVar5) =
           *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar2 + uVar1 * -100) & 0xffff) * 2);
      lVar6 = lVar5 + -4;
      param_1 = uVar3 / 10000;
    } while (9999999 < uVar9);
    lVar5 = lVar5 + 6;
    if (uVar8 < 9 || (int)(uVar3 / 10000) == 9) goto code_r0x0047662c;
  }
  uVar1 = (uVar7 >> 2 & 0x3fff) / 0x19;
  *(undefined2 *)(&uStack0000000000000074 + lVar5) =
       *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar7 + uVar1 * -100) & 0xffff) * 2);
  lVar5 = lVar5 + -2;
  uVar7 = uVar1;
code_r0x0047662c:
  if ((uVar4 == 0) || (lVar6 = lVar5, uVar7 != 0)) {
    lVar6 = lVar5 + -1;
    (&uStack0000000000000075)[lVar5] = (&UNK_00893f28)[(uVar7 & 0xf) << 1];
  }
  func_0x00468684(param_2,1,1,0,&uStack0000000000000076 + lVar6,10 - lVar6);
  return;
}

