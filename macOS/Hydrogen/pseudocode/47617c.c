
void FUN_0047617c(undefined *param_1,undefined8 param_2,undefined8 param_3)

{
  bool bVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  undefined *puVar6;
  undefined *puVar7;
  undefined1 uStack0000000000000068;
  undefined1 uStack000000000000006a;
  undefined1 uStack000000000000006b;
  undefined1 uStack000000000000006c;
  
  if (param_1 < (undefined *)0x3e8) {
    lVar3 = 0x14;
    puVar6 = param_1;
  }
  else {
    lVar4 = 0x14;
    puVar7 = param_1;
    do {
      lVar3 = lVar4 + -4;
      puVar6 = (undefined *)((ulong)puVar7 / 10000);
      uVar5 = (int)puVar7 + (int)puVar6 * -10000;
      uVar2 = (uVar5 >> 2 & 0x3fff) / 0x19;
      *(undefined2 *)(&uStack0000000000000068 + lVar4) =
           *(undefined2 *)(&UNK_00893f27 + (ulong)uVar2 * 2);
      *(undefined2 *)(&uStack000000000000006a + lVar4) =
           *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar5 + uVar2 * -100) & 0xffff) * 2);
      bVar1 = &UNK_0098967f < puVar7;
      lVar4 = lVar3;
      puVar7 = puVar6;
    } while (bVar1);
  }
  lVar4 = lVar3;
  if ((undefined *)((long)&MACH_HEADER.cpusubtype + 1) < puVar6) {
    lVar4 = lVar3 + -2;
    uVar5 = (uint)puVar6;
    uVar2 = (uVar5 >> 2 & 0x3fff) / 0x19;
    puVar6 = (undefined *)(ulong)uVar2;
    *(undefined2 *)(&uStack000000000000006a + lVar3) =
         *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar5 + uVar2 * -100) & 0xffff) * 2);
  }
  if ((param_1 == (undefined *)0x0) || (lVar3 = lVar4, puVar6 != (undefined *)0x0)) {
    lVar3 = lVar4 + -1;
    (&uStack000000000000006b)[lVar4] = (&UNK_00893f28)[((ulong)puVar6 & 0xf) * 2];
  }
  func_0x00468684(param_3,param_2,1,0,&uStack000000000000006c + lVar3,0x14 - lVar3);
  return;
}

