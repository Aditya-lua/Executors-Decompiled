
ulong FUN_0061414c(long *param_1,uint param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong *puVar4;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000008;
  
  uVar1 = (**(code **)(*param_1 + 0xa8))(param_1,(long)&uStack0000000000000008 + 7);
  if (uVar1 != 0 && uStack0000000000000008._7_1_ == param_2) {
    return uVar1;
  }
  puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar2 + 1) = 1;
  puVar2[2] = 0x6f63656420524542;
  puVar2[3] = 0x726f727265206564;
  *(undefined1 *)(puVar2 + 4) = 0;
  *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
  *puVar2 = &UNK_009f60b8;
  puVar4 = (ulong *)&DAT_0060f08c;
  auVar5 = ___cxa_throw(puVar2,&UNK_009f6090);
  lVar3 = auVar5._0_8_;
  if ((*(char *)(lVar3 + 0x31) != '\0') && (*(ulong *)(lVar3 + 0x28) < *puVar4)) {
    *puVar4 = *(ulong *)(lVar3 + 0x28);
  }
  uVar1 = (**(code **)(**(long **)(lVar3 + 0x20) + 0x118))
                    (*(long **)(lVar3 + 0x20),auVar5._8_8_,puVar4);
  if (*(char *)(lVar3 + 0x31) != '\0') {
    if (*(ulong *)(lVar3 + 0x28) < *puVar4) {
      puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
      *(undefined4 *)(puVar2 + 1) = 1;
      puVar2[2] = 0x6f63656420524542;
      puVar2[3] = 0x726f727265206564;
      *(undefined1 *)(puVar2 + 4) = 0;
      *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
      *puVar2 = &UNK_009f60b8;
      auVar5 = ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
      uVar1 = auVar5._8_8_;
      lVar3 = auVar5._0_8_;
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
    *(ulong *)(lVar3 + 0x28) = *(ulong *)(lVar3 + 0x28) - *puVar4;
  }
  return uVar1;
}

