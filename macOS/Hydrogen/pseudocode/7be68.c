
/* WARNING: Type propagation algorithm not settling */

void FUN_0007be68(void)

{
  undefined8 *puVar1;
  uint uVar2;
  bool bVar3;
  undefined8 *puVar4;
  undefined *puVar5;
  uint uVar6;
  undefined2 *puVar7;
  undefined *puVar8;
  ulong uVar9;
  uint unaff_w21;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  
  if (in_stack_00000038 < 0) {
    __ZdlPv(in_stack_00000028);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  if ((unaff_w21 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar10 = __Unwind_Resume();
  puVar5 = auVar10._8_8_;
  puVar4 = auVar10._0_8_;
  if (puVar5 == (undefined *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x0007bee4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)**(undefined8 **)*puVar4)((undefined8 *)*puVar4,0x30);
    return;
  }
  puVar1 = puVar4 + 2;
  if ((long)puVar5 < 0) {
    *(undefined1 *)puVar1 = 0x2d;
    puVar5 = (undefined *)-(long)puVar5;
    if (puVar5 < (undefined *)0xa) {
      puVar7 = (undefined2 *)((long)puVar4 + 0x12);
    }
    else {
      puVar8 = puVar5;
      uVar2 = 4;
      do {
        uVar6 = uVar2;
        if (puVar8 < (undefined *)0x64) {
          uVar6 = uVar6 - 1;
          goto joined_r0x0007c0bc;
        }
        if (puVar8 < (undefined *)0x3e8) goto joined_r0x0007c0bc;
        if ((ulong)puVar8 >> 4 < 0x271) goto LAB_0007bfdc;
        bVar3 = &UNK_0001869f < puVar8;
        puVar8 = (undefined *)((ulong)puVar8 / 10000);
        uVar2 = uVar6 + 4;
      } while (bVar3);
      uVar6 = uVar6 + 1;
LAB_0007bfdc:
      puVar7 = (undefined2 *)((long)puVar1 + (ulong)(uVar6 + 1));
    }
    if (puVar5 < &segment_command_00000020.flags) goto joined_r0x0007c084;
  }
  else {
    if (puVar5 < (undefined *)0xa) {
      *(char *)(puVar4 + 2) = auVar10[8] + '0';
                    /* WARNING: Could not recover jumptable at 0x0007bed0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*(long *)*puVar4 + 8))((long *)*puVar4,puVar1,1);
      return;
    }
    puVar8 = puVar5;
    uVar2 = 4;
    do {
      uVar6 = uVar2;
      if (puVar8 < (undefined *)0x64) {
        uVar6 = uVar6 - 2;
        goto joined_r0x0007c004;
      }
      if (puVar8 < (undefined *)0x3e8) {
        uVar6 = uVar6 - 1;
        goto joined_r0x0007c004;
      }
      if ((ulong)puVar8 >> 4 < 0x271) goto joined_r0x0007c0bc;
      bVar3 = &UNK_0001869f < puVar8;
      puVar8 = (undefined *)((ulong)puVar8 / 10000);
      uVar2 = uVar6 + 4;
    } while (bVar3);
    uVar6 = uVar6 + 1;
joined_r0x0007c004:
    puVar7 = (undefined2 *)((long)puVar1 + (ulong)uVar6);
    if (puVar5 < (ulong)((long)&segment_command_00000020 + 0x44)) goto joined_r0x0007c084;
  }
LAB_0007c058:
  do {
    puVar8 = (undefined *)((ulong)puVar5 / 100);
    puVar7 = puVar7 + -1;
    *puVar7 = *(undefined2 *)(&UNK_0080ad7b + ((ulong)puVar5 % 100) * 2);
    uVar9 = (ulong)puVar5 >> 4;
    puVar5 = puVar8;
  } while (0x270 < uVar9);
joined_r0x0007c084:
  if (puVar5 < (undefined *)((long)&MACH_HEADER.cpusubtype + 2)) {
    *(char *)((long)puVar7 + -1) = (char)puVar5 + '0';
                    /* WARNING: Could not recover jumptable at 0x0007c0e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)*puVar4 + 8))();
    return;
  }
  puVar7[-1] = *(undefined2 *)(&UNK_0080ad7b + (long)puVar5 * 2);
                    /* WARNING: Could not recover jumptable at 0x0007c0a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)*puVar4 + 8))();
  return;
joined_r0x0007c0bc:
  puVar7 = (undefined2 *)((long)puVar1 + (ulong)uVar6);
  if (puVar5 < &segment_command_00000020.flags) goto joined_r0x0007c084;
  goto LAB_0007c058;
}

