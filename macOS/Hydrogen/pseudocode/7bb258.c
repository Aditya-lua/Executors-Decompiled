
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb258(undefined1 param_1 [16],undefined4 *param_2)

{
  bool bVar1;
  undefined1 auVar2 [32];
  undefined4 in_w11;
  long in_x12;
  undefined1 in_register_00005010 [16];
  undefined1 in_z1 [32];
  undefined1 in_q4 [16];
  undefined1 in_z12 [32];
  
  bVar1 = (bool)ExclusiveMonitorPass(param_2,0x10);
  if (bVar1) {
    *param_2 = (int)param_2;
    param_2[1] = in_w11;
    ExclusiveMonitorsStatus();
  }
  auVar2._16_16_ = in_register_00005010;
  auVar2._0_16_ = param_1;
  SVE_add(in_z1,auVar2,in_z12);
  *(long *)(in_x12 + 0x28) = in_q4._8_8_;
  *(long *)(in_x12 + 0x20) = in_q4._0_8_;
  *(long *)(in_x12 + 0x38) = param_1._8_8_;
  *(long *)(in_x12 + 0x30) = param_1._0_8_;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

