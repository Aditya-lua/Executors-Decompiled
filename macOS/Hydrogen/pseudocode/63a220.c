
void FUN_0063a220(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  
  puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar2 + 1) = 1;
  puVar2[2] = 0x6f63656420524542;
  puVar2[3] = 0x726f727265206564;
  *(undefined1 *)(puVar2 + 4) = 0;
  *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
  *puVar2 = &UNK_009f60b8;
  ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x63a284);
  (*pcVar1)();
}

