
void __ZN3ast5local7RcLocal3new17ha6a156d3c5727cb3E(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  
  uVar1 = *param_1;
  uVar2 = param_1[1];
  uVar5 = param_1[2];
  puVar4 = (undefined8 *)func_0x00187bd0(0x28,8);
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x5ca4a4);
    (*pcVar3)();
  }
  *puVar4 = 1;
  *(undefined1 *)(puVar4 + 1) = 0;
  puVar4[2] = uVar1;
  puVar4[3] = uVar2;
  puVar4[4] = uVar5;
  return;
}

