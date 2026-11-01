
void FUN_007bb310(undefined1 *param_1)

{
  bool bVar1;
  code *pcVar2;
  
  bVar1 = (bool)ExclusiveMonitorPass(param_1,0x10);
  if (bVar1) {
    *param_1 = (char)param_1;
    ExclusiveMonitorsStatus();
  }
  Hint_Prefetch(0x7bd350,0,0,0);
                    /* WARNING: Does not return */
  pcVar2 = (code *)UndefinedInstructionException(0x1001,0x7bb318);
  (*pcVar2)();
}

