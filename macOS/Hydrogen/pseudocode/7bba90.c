
void FUN_007bba90(undefined1 *param_1)

{
  bool bVar1;
  code *pcVar2;
  undefined8 *in_x13;
  undefined8 unaff_x28;
  
  bVar1 = (bool)ExclusiveMonitorPass(param_1,0x10);
  if (bVar1) {
    *param_1 = (char)param_1;
    ExclusiveMonitorsStatus();
  }
  *in_x13 = unaff_x28;
  in_x13[1] = param_1;
                    /* WARNING: Does not return */
  pcVar2 = (code *)UndefinedInstructionException(0x4401,0x7bba98);
  (*pcVar2)();
}

