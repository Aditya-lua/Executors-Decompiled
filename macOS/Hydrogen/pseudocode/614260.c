
ulong FUN_00614260(undefined8 *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  *(undefined4 *)(param_1 + 1) = 1;
  param_1[2] = 0x6f63656420524542;
  param_1[3] = 0x726f727265206564;
  *(undefined1 *)(param_1 + 4) = 0;
  *(undefined1 *)((long)param_1 + 0x27) = 0x10;
  *param_1 = &UNK_009f60b8;
  auVar4 = ___cxa_throw(param_1,&UNK_009f6090,&DAT_0060f08c);
  uVar3 = auVar4._8_8_;
  lVar2 = auVar4._0_8_;
  if (*(char *)(lVar2 + 0x31) != '\0') {
    if (*(ulong *)(lVar2 + 0x28) < uVar3) {
      puVar1 = (undefined8 *)___cxa_allocate_exception(0x28);
      *(undefined4 *)(puVar1 + 1) = 1;
      puVar1[2] = 0x6f63656420524542;
      puVar1[3] = 0x726f727265206564;
      *(undefined1 *)(puVar1 + 4) = 0;
      *(undefined1 *)((long)puVar1 + 0x27) = 0x10;
      *puVar1 = &UNK_009f60b8;
      lVar2 = ___cxa_throw(puVar1,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Could not recover jumptable at 0x00614364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (**(code **)(**(long **)(lVar2 + 0x20) + 0x120))();
      return uVar3;
    }
    *(ulong *)(lVar2 + 0x28) = *(ulong *)(lVar2 + 0x28) - uVar3;
  }
  return uVar3;
}

