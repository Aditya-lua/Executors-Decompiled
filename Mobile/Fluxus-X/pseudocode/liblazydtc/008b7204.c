/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7204
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_157(void)

{
  int iVar1;
  long lVar2;
  undefined1 *puVar3;
  long lVar4;
  
  DAT_00d1f4b0 = 0x3f800000;
  uRam0000000000d1f498 = 0;
  _DAT_00d1f490 = 0;
  uRam0000000000d1f4a8 = 0;
  _DAT_00d1f4a0 = 0;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1f490,&PTR_LOOP_00c48880);
  puVar3 = &DAT_00d1f4b8;
  _DAT_00d1f4b8 = 0;
  DAT_00d1f4d0 = 0;
  DAT_00d1f4c0 = "LuauGcTraceUdata";
  DAT_00d1f4c8 = DAT_00d1eec0;
  DAT_00d1eec0 = &DAT_00d1f4b8;
  do {
    iVar1 = strcmp(*(char **)(puVar3 + 8),"LuauGcTraceUdata");
    if (iVar1 == 0) {
      *(undefined4 *)(puVar3 + 0x18) = 5;
    }
    lVar2 = DAT_00d1eec8;
    puVar3 = *(undefined1 **)(puVar3 + 0x10);
  } while (puVar3 != (undefined1 *)0x0);
  if (DAT_00d1eec8 != 0) {
    lVar4 = DAT_00d1eec8;
    do {
      iVar1 = strcmp(*(char **)(lVar4 + 8),"LuauGcTraceUdata");
      if (iVar1 == 0) {
        *(undefined4 *)(lVar4 + 0x18) = 5;
      }
      lVar4 = *(long *)(lVar4 + 0x10);
    } while (lVar4 != 0);
  }
  _DAT_00d1f4d8 = 0x100;
  DAT_00d1f4e0 = "LuauGcHeapShrinkFix";
  DAT_00d1f4e8 = &DAT_00d1f4b8;
  puVar3 = &DAT_00d1f4f8;
  DAT_00d1f4f0 = 0;
  _DAT_00d1f4f8 = 0;
  DAT_00d1f500 = "LuauRuntimeFeedback";
  DAT_00d1f508 = &DAT_00d1f4d8;
  DAT_00d1f510 = 0;
  DAT_00d1eec0 = &DAT_00d1f4f8;
  do {
    iVar1 = strcmp(*(char **)(puVar3 + 8),"LuauRuntimeFeedback");
    if (iVar1 == 0) {
      *(undefined4 *)(puVar3 + 0x18) = 2;
    }
    puVar3 = *(undefined1 **)(puVar3 + 0x10);
  } while (puVar3 != (undefined1 *)0x0);
  for (; lVar2 != 0; lVar2 = *(long *)(lVar2 + 0x10)) {
    iVar1 = strcmp(*(char **)(lVar2 + 8),"LuauRuntimeFeedback");
    if (iVar1 == 0) {
      *(undefined4 *)(lVar2 + 0x18) = 2;
    }
  }
  return;
}

