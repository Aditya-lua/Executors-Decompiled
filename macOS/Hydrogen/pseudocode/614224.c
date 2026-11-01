
ulong FUN_00614224(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  long unaff_x19;
  ulong *unaff_x20;
  undefined1 auVar4 [16];
  
  uVar1 = (**(code **)(param_1 + 0x118))();
  if (*(char *)(unaff_x19 + 0x31) != '\0') {
    if (*(ulong *)(unaff_x19 + 0x28) < *unaff_x20) {
      puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
      *(undefined4 *)(puVar2 + 1) = 1;
      puVar2[2] = 0x6f63656420524542;
      puVar2[3] = 0x726f727265206564;
      *(undefined1 *)(puVar2 + 4) = 0;
      *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
      *puVar2 = &UNK_009f60b8;
      auVar4 = ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
      uVar1 = auVar4._8_8_;
      lVar3 = auVar4._0_8_;
      if (*(char *)(lVar3 + 0x31) != '\0') {
        if (*(ulong *)(lVar3 + 0x28) < uVar1) {
          puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
          *(undefined4 *)(puVar2 + 1) = 1;
          puVar2[2] = 0x6f63656420524542;
          puVar2[3] = 0x726f727265206564;
          *(undefined1 *)(puVar2 + 4) = 0;
          *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
          *puVar2 = &UNK_009f60b8;
          lVar3 = ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Could not recover jumptable at 0x00614364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar1 = (**(code **)(**(long **)(lVar3 + 0x20) + 0x120))();
          return uVar1;
        }
        *(ulong *)(lVar3 + 0x28) = *(ulong *)(lVar3 + 0x28) - uVar1;
      }
      return uVar1;
    }
    *(ulong *)(unaff_x19 + 0x28) = *(ulong *)(unaff_x19 + 0x28) - *unaff_x20;
  }
  return uVar1;
}

