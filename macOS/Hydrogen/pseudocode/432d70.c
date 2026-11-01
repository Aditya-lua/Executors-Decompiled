
void FUN_00432d70(void)

{
  ulong uVar1;
  long lVar2;
  uint uVar3;
  bool in_ZR;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined2 *extraout_x8;
  ushort uVar7;
  undefined4 uVar8;
  ulong uVar9;
  undefined *puVar10;
  undefined2 uVar11;
  undefined4 extraout_w15;
  undefined4 uVar12;
  long *in_stack_00000000;
  undefined1 auStack_7ffffffe [2147483630];
  
  if (in_ZR) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(auStack_7ffffffe + 0x80000436);
  }
  lVar4 = *in_stack_00000000;
  *in_stack_00000000 = lVar4 + -1;
  LORelease();
  if (lVar4 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4();
  }
  __Unwind_Resume();
  lVar5 = func_0x007a2668();
  lVar4 = *(long *)(lVar5 + 8);
  if (*(long *)(lVar5 + 8) != 0) {
    do {
      uVar1 = *(ulong *)(lVar4 + 0x20);
      lVar2 = *(long *)(lVar4 + 0x28);
      if (*(char *)(uVar1 + 1) == '\x1e') {
        uVar3 = *(uint *)(lVar4 + 0x10);
        *(long *)(lVar5 + 8) = lVar2;
        if (uVar3 < 0x1c) {
code_r0x00432ea8:
          puVar6 = (undefined8 *)func_0x007a247c(&UNK_0088751b,0x35,&UNK_009dbc00);
                    /* WARNING: Could not recover jumptable at 0x007b34a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR__freeaddrinfo_00a24e60)(*puVar6);
          return;
        }
        uVar7 = *(ushort *)(uVar1 + 2) >> 8 | *(ushort *)(uVar1 + 2) << 8;
        uVar8 = *(undefined4 *)(uVar1 + 4);
        lVar4 = (ulong)*(uint *)(uVar1 + 8) << 0x10;
        puVar10 = *(undefined **)(uVar1 + 0xc);
        uVar9 = (ulong)*(uint *)(uVar1 + 0x14);
        uVar12 = *(undefined4 *)(uVar1 + 0x18);
        uVar11 = 1;
code_r0x00432e68:
        *extraout_x8 = uVar11;
        *(int *)(extraout_x8 + 1) = (int)lVar4;
        extraout_x8[3] = (short)((ulong)lVar4 >> 0x20);
        *(undefined **)(extraout_x8 + 4) = puVar10;
        *(int *)(extraout_x8 + 8) = (int)uVar9;
        *(undefined4 *)(extraout_x8 + 10) = uVar8;
        *(undefined4 *)(extraout_x8 + 0xc) = uVar12;
        extraout_x8[0xe] = uVar7;
        return;
      }
      if (*(char *)(uVar1 + 1) == '\x02') {
        uVar3 = *(uint *)(lVar4 + 0x10);
        *(long *)(lVar5 + 8) = lVar2;
        if (uVar3 < 0x10) {
          func_0x007a247c(&UNK_008874bb,0x34,&UNK_009dbbe8);
          goto code_r0x00432ea8;
        }
        uVar11 = 0;
        uVar8 = *(undefined4 *)(uVar1 + 4);
        uVar3 = (uint)(*(ushort *)(uVar1 + 2) >> 8) | (*(ushort *)(uVar1 + 2) & 0xff00ff) << 8;
        uVar7 = (ushort)uVar3;
        lVar4 = CONCAT44(uVar3,uVar8);
        puVar10 = &UNK_009dbc18;
        uVar9 = uVar1;
        uVar12 = extraout_w15;
        goto code_r0x00432e68;
      }
      lVar4 = lVar2;
    } while (lVar2 != 0);
    *(undefined8 *)(lVar5 + 8) = 0;
  }
  *extraout_x8 = 2;
  return;
}

