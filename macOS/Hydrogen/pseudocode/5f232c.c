
void FUN_005f232c(long *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  char cVar4;
  code *pcVar5;
  undefined8 *puVar6;
  long *plVar7;
  undefined8 *puVar8;
  undefined3 uStack0000000000000018;
  undefined1 uStack000000000000001b;
  undefined3 uStack000000000000001c;
  
  puVar6 = (undefined8 *)___cxa_allocate_exception(0x28);
  plVar7 = (long *)(**(code **)(*param_1 + 0x70))(param_1);
  (**(code **)(*plVar7 + 0x18))();
  puVar8 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar1 = *puVar8;
  uVar2 = puVar8[1];
  uVar3 = *(undefined4 *)((long)puVar8 + 0x13);
  uStack0000000000000018 = (undefined3)*(undefined4 *)(puVar8 + 2);
  uStack000000000000001b = (undefined1)uVar3;
  uStack000000000000001c = (undefined3)((uint)uVar3 >> 8);
  cVar4 = *(char *)((long)puVar8 + 0x17);
  puVar8[1] = 0;
  puVar8[2] = 0;
  *puVar8 = 0;
  *puVar6 = &UNK_009b2ec8;
  *(undefined4 *)(puVar6 + 1) = 0;
  if (cVar4 < '\0') {
    func_0x00017634(puVar6 + 2,uVar1);
  }
  else {
    puVar6[2] = uVar1;
    puVar6[3] = uVar2;
    *(undefined4 *)(puVar6 + 4) = _uStack0000000000000018;
    *(undefined4 *)((long)puVar6 + 0x23) = uVar3;
    *(char *)((long)puVar6 + 0x27) = cVar4;
  }
  *puVar6 = &UNK_009b2ea0;
  ___cxa_throw(puVar6,&UNK_009b2e78,&DAT_00026d7c);
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x5f23f8);
  (*pcVar5)();
}

