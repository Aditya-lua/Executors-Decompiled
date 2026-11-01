
void FUN_005f01d4(long *param_1,ulong param_2)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined1 *puStack_c0;
  ulong uStack_b8;
  byte bStack_a9;
  undefined1 auStack_a8 [24];
  undefined1 auStack_90 [24];
  undefined1 auStack_78 [24];
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined1 auStack_48 [24];
  
  uVar2 = (**(code **)(*param_1 + 0x48))();
  if (param_2 <= (uVar2 & 0xffffffff)) {
    return;
  }
  uVar3 = ___cxa_allocate_exception(0x28);
  uVar4 = (**(code **)(*param_1 + 0x48))(param_1);
  func_0x005eec2c(auStack_a8,uVar4,10);
  func_0x00049ad4(auStack_90,"HashTransformation: can\'t truncate a ",auStack_a8);
  func_0x0003a638(auStack_78,auStack_90," byte digest to ");
  func_0x0060de44(&puStack_c0,param_2,10);
  if (-1 < (char)bStack_a9) {
    uStack_b8 = (ulong)bStack_a9;
    puStack_c0 = (undefined1 *)&puStack_c0;
  }
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (auStack_78,puStack_c0,uStack_b8);
  uStack_58 = puVar5[1];
  uStack_60 = *puVar5;
  uStack_50 = puVar5[2];
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  func_0x0003a638(auStack_48,&uStack_60," bytes");
  func_0x0002703c(uVar3,auStack_48);
  ___cxa_throw(uVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f0300);
  (*pcVar1)();
}

