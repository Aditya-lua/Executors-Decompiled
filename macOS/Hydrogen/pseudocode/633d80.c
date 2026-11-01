
undefined8 * FUN_00633d80(void)

{
  undefined8 uVar1;
  long *plVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long *unaff_x22;
  undefined8 unaff_x23;
  
  __ZdlPv();
  func_0x00633b94();
  uVar1 = __Unwind_Resume();
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x23;
  plVar2 = *(long **)(unaff_x19 + 0x20);
  if (plVar2 != (long *)0x0) goto LAB_00633db8;
  plVar2 = (long *)*unaff_x22;
  while (plVar2 == (long *)0x0) {
    plVar2 = (long *)__Unwind_Resume(uVar1);
LAB_00633db8:
    (**(code **)(*plVar2 + 8))();
    plVar2 = (long *)*unaff_x22;
  }
  (**(code **)(*plVar2 + 8))();
  puVar3 = (undefined8 *)__Unwind_Resume(uVar1);
  *(undefined4 *)(puVar3 + 1) = 0;
  *puVar3 = &UNK_00a010d8;
  puVar3[2] = &UNK_00a09aa0;
  puVar3[3] = 0;
  puVar3[4] = 0;
  func_0x00631da4(puVar3 + 5);
  *puVar3 = &UNK_009fb128;
  puVar3[0x1e] = &UNK_009f6678;
  puVar3[0x1f] = 0;
  puVar3[0x20] = 0;
  puVar3[0x21] = 0;
  func_0x005fdd18(puVar3 + 0x22);
  func_0x005fdd18(puVar3 + 0x28);
  *(undefined2 *)(puVar3 + 0x2e) = 0x100;
  return puVar3;
}

