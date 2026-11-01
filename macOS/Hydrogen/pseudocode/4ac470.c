
void FUN_004ac470(undefined8 *param_1,undefined8 param_2)

{
  bool bVar1;
  uint uVar2;
  undefined *puVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  undefined *puVar7;
  undefined *puVar8;
  undefined2 uStack_28;
  undefined1 auStack_25 [21];
  
  puVar3 = (undefined *)*param_1;
  if (puVar3 < (undefined *)0x3e8) {
    lVar4 = 0x14;
    puVar7 = puVar3;
  }
  else {
    lVar5 = 0x14;
    puVar8 = puVar3;
    do {
      lVar4 = lVar5 + -4;
      puVar7 = (undefined *)((ulong)puVar8 / 10000);
      uVar6 = (int)puVar8 + (int)puVar7 * -10000;
      uVar2 = (uVar6 >> 2 & 0x3fff) / 0x19;
      *(undefined2 *)(auStack_25 + lVar5 + -3) = *(undefined2 *)(&UNK_00893f27 + (ulong)uVar2 * 2);
      *(undefined2 *)(auStack_25 + lVar5 + -1) =
           *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar6 + uVar2 * -100) & 0xffff) * 2);
      bVar1 = &UNK_0098967f < puVar8;
      lVar5 = lVar4;
      puVar8 = puVar7;
    } while (bVar1);
  }
  lVar5 = lVar4;
  if ((undefined *)((long)&MACH_HEADER.cpusubtype + 1) < puVar7) {
    lVar5 = lVar4 + -2;
    uVar6 = (uint)puVar7;
    uVar2 = (uVar6 >> 2 & 0x3fff) / 0x19;
    puVar7 = (undefined *)(ulong)uVar2;
    *(undefined2 *)(auStack_25 + lVar4 + -1) =
         *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar6 + uVar2 * -100) & 0xffff) * 2);
  }
  if ((puVar3 == (undefined *)0x0) || (lVar4 = lVar5, puVar7 != (undefined *)0x0)) {
    lVar4 = lVar5 + -1;
    auStack_25[lVar5] = (&UNK_00893f28)[((ulong)puVar7 & 0xf) * 2];
  }
  func_0x00468684(param_2,1,1,0,auStack_25 + lVar4 + 1,0x14 - lVar4);
  return;
}

