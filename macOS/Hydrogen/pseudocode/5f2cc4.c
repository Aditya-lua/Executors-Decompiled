
void FUN_005f2cc4(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  char cVar4;
  undefined8 *puVar5;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000040;
  undefined3 uStack0000000000000048;
  undefined1 uStack000000000000004b;
  undefined3 uStack000000000000004c;
  
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000030,param_2 + 0x34,0x22);
  uVar1 = *puVar5;
  uVar2 = puVar5[1];
  uVar3 = *(undefined4 *)((long)puVar5 + 0x13);
  uStack0000000000000048 = (undefined3)*(undefined4 *)(puVar5 + 2);
  uStack000000000000004b = (undefined1)uVar3;
  uStack000000000000004c = (undefined3)((uint)uVar3 >> 8);
  cVar4 = *(char *)((long)puVar5 + 0x17);
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  if (cVar4 < '\0') {
    func_0x00017634(unaff_x19 + 2,uVar1);
    *unaff_x19 = &UNK_009b2f08;
    __ZdlPv(uVar1);
  }
  else {
    unaff_x19[2] = uVar1;
    unaff_x19[3] = uVar2;
    *(undefined4 *)(unaff_x19 + 4) = _uStack0000000000000048;
    *(undefined4 *)((long)unaff_x19 + 0x23) = uVar3;
    *(char *)((long)unaff_x19 + 0x27) = cVar4;
    *unaff_x19 = &UNK_009b2f08;
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  *unaff_x19 = &UNK_009f57b0;
  return;
}

