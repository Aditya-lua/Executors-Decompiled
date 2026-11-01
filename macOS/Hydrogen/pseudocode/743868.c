
void FUN_00743868(long param_1)

{
  undefined8 *unaff_x19;
  undefined8 *puVar1;
  long unaff_x28;
  
  if ((uint)param_1 < 0x14) {
                    /* WARNING: Could not recover jumptable at 0x0074387c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_00743880 + (ulong)*(ushort *)(unaff_x28 + param_1 * 2) * 4))();
    return;
  }
  puVar1 = unaff_x19;
  do {
    if (*(char *)(puVar1 + 0xc) != '\0') {
      (*pcRam0000000000a2b5f0)(*puVar1);
      *puVar1 = 0;
      *(undefined1 *)(puVar1 + 0xc) = 0;
    }
    if (*(char *)((long)puVar1 + 0x61) != '\0') {
      (*pcRam0000000000a2b5f0)(puVar1[2]);
      puVar1[2] = 0;
      *(undefined1 *)((long)puVar1 + 0x61) = 0;
    }
    if (*(char *)((long)puVar1 + 0x62) != '\0') {
      (*pcRam0000000000a2b5f0)(puVar1[4]);
      puVar1[4] = 0;
      *(undefined1 *)((long)puVar1 + 0x62) = 0;
    }
    if (*(char *)((long)puVar1 + 99) != '\0') {
      (*pcRam0000000000a2b5f0)(puVar1[8]);
      puVar1[8] = 0;
      *(undefined1 *)((long)puVar1 + 99) = 0;
    }
    puVar1 = (undefined8 *)puVar1[0xb];
  } while (puVar1 != (undefined8 *)0x0);
  do {
    puVar1 = (undefined8 *)unaff_x19[0xb];
    (*pcRam0000000000a2b5f0)(unaff_x19);
    unaff_x19 = puVar1;
  } while (puVar1 != (undefined8 *)0x0);
  return;
}

