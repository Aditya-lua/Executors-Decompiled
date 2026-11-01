
/* WARNING: Possible PIC construction at 0x001f9f2c: Changing call to branch */

void FUN_0017f210(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x22;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined8 *puVar6;
  undefined *puVar7;
  long lVar8;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  undefined1 uStack0000000000000070;
  
  lVar3 = func_0x00187bd0();
  if (lVar3 == 0) {
    func_0x007a1f00(in_stack_00000000);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x17f460);
    (*pcVar1)();
  }
  _memcpy(lVar3);
  plVar5 = (long *)*unaff_x22;
  *unaff_x20 = unaff_x27;
  unaff_x20[1] = unaff_x21;
  unaff_x20[2] = unaff_x26;
  unaff_x20[3] = unaff_x28;
  unaff_x20[4] = lVar3;
  unaff_x20[5] = unaff_x28;
  lVar3 = plVar5[8];
  lVar8 = plVar5[0xb];
  lVar4 = plVar5[10];
  unaff_x20[7] = plVar5[9];
  unaff_x20[6] = lVar3;
  unaff_x20[9] = lVar8;
  unaff_x20[8] = lVar4;
  lVar3 = plVar5[0xc];
  lVar8 = plVar5[0xf];
  lVar4 = plVar5[0xe];
  unaff_x20[0xb] = plVar5[0xd];
  unaff_x20[10] = lVar3;
  unaff_x20[0xd] = lVar8;
  unaff_x20[0xc] = lVar4;
  lVar3 = *plVar5;
  *plVar5 = lVar3 + -1;
  LORelease();
  if (lVar3 != 1) {
    return;
  }
  DataMemoryBarrier(2,1);
  puVar2 = &uStack0000000000000050;
  lVar3 = *unaff_x22;
  plVar5 = (long *)(lVar3 + 0x10);
  if (*plVar5 != 0) {
    lVar3 = *(long *)(lVar3 + 0x18);
    lVar4 = *plVar5 << 4;
    puVar6 = &uStack0000000000000060;
    puVar7 = &UNK_001f9f30;
code_r0x00187bd4:
    *(undefined8 **)((long)puVar2 + -0x10) = puVar6;
    *(undefined **)((long)puVar2 + -8) = puVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(lVar3,lVar4,8);
    return;
  }
  if (*(long *)(lVar3 + 0x28) != 0) {
    func_0x00187bd4(*(undefined8 *)(lVar3 + 0x30),*(long *)(lVar3 + 0x28) << 4,8);
  }
  if (lVar3 != -1) {
    lVar4 = *(long *)(lVar3 + 8);
    *(long *)(lVar3 + 8) = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      lVar4 = 0x80;
      puVar2 = (undefined8 *)&uStack0000000000000070;
      puVar6 = uStack0000000000000060;
      puVar7 = in_stack_00000068;
      goto code_r0x00187bd4;
    }
  }
  return;
}

