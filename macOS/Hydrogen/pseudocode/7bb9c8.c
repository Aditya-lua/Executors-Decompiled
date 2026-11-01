
void FUN_007bb9c8(undefined8 param_1)

{
  bool bVar1;
  code *pcVar2;
  
  bVar1 = (bool)ExclusiveMonitorPass(param_1,0x10);
  if (bVar1) {
    *(undefined8 *)param_1 = param_1;
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)UndefinedInstructionException(1,0x7bb9d0);
  (*pcVar2)();
}

