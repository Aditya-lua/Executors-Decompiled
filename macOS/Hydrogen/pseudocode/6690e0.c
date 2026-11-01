
void FUN_006690e0(code *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 *unaff_x20;
  long *plVar7;
  
  (*param_1)();
  func_0x005ffccc();
  uVar6 = (**(code **)(*(long *)*unaff_x20 + 0x90))();
  puVar1 = unaff_x20 + 0x25;
  func_0x005ffccc(puVar1,uVar6);
  uVar6 = (**(code **)(*(long *)*unaff_x20 + 0x80))((long *)*unaff_x20,puVar1);
  puVar2 = unaff_x20 + 0x2b;
  func_0x005ffccc(puVar2,uVar6);
  puVar3 = unaff_x20 + 0x19;
  puVar4 = unaff_x20 + 0x13;
  uVar6 = (**(code **)(*(long *)*unaff_x20 + 0x80))((long *)*unaff_x20,puVar3,puVar4);
  func_0x005ffccc(puVar3,uVar6);
  uVar6 = (**(code **)(*(long *)*unaff_x20 + 0x90))();
  puVar5 = unaff_x20 + 0x31;
  func_0x005ffccc(puVar5,uVar6);
  plVar7 = (long *)*unaff_x20;
  uVar6 = (**(code **)(*plVar7 + 0x38))(plVar7,puVar5);
  uVar6 = (**(code **)(*plVar7 + 0x20))(plVar7,uVar6,puVar5);
  uVar6 = (**(code **)(*plVar7 + 0x20))(plVar7,uVar6,puVar3);
  func_0x005ffccc(puVar5,uVar6);
  (**(code **)(*(long *)*unaff_x20 + 0x90))((long *)*unaff_x20,puVar5);
  func_0x005ffccc();
  (**(code **)(*(long *)*unaff_x20 + 0x50))();
  (**(code **)(*(long *)*unaff_x20 + 0x50))();
  (**(code **)(*(long *)*unaff_x20 + 0x50))((long *)*unaff_x20,puVar2);
  (**(code **)(*(long *)*unaff_x20 + 0x80))((long *)*unaff_x20,puVar5,puVar2);
  func_0x005ffccc();
  uVar6 = (**(code **)(*(long *)*unaff_x20 + 0x90))((long *)*unaff_x20,puVar1);
  func_0x005ffccc(puVar4,uVar6);
  plVar7 = (long *)*unaff_x20;
  func_0x0060bf70(plVar7,puVar4);
                    /* WARNING: Could not recover jumptable at 0x006692d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar7 + 0x50))(plVar7);
  return;
}

