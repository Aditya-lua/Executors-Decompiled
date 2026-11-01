
ulong FUN_0041d718(undefined8 *param_1)

{
  ulong uVar1;
  int iVar2;
  code *pcVar3;
  undefined8 *puVar4;
  ulong uVar5;
  
  puVar4 = (undefined8 *)func_0x0041d068(*param_1);
  if (puVar4[3] != 0) {
    func_0x007a2334(&UNK_009da678);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x41d7a8);
    (*pcVar3)();
  }
  puVar4[3] = 0xffffffffffffffff;
  uVar5 = func_0x0041f388();
  puVar4[3] = puVar4[3] + 1;
  iVar2 = *(int *)(puVar4 + 2);
  *(int *)(puVar4 + 2) = iVar2 + -1;
  if (iVar2 + -1 == 0) {
    puVar4[1] = 0;
    _pthread_mutex_unlock(*puVar4);
  }
  uVar1 = 0;
  if ((uVar5 & 0xffffffff00000003) != 0x900000002) {
    uVar1 = uVar5;
  }
  return uVar1;
}

