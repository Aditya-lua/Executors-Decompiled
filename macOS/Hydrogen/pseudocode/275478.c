
void FUN_00275478(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  char acStack_1ec [492];
  
  uVar1 = *(undefined8 *)(param_2 + 0x18);
  func_0x00274a84(acStack_1ec);
  if (acStack_1ec[0] != '\x04') {
    _memcpy(param_1 + 1,acStack_1ec,0x1ec);
    *param_1 = uVar1;
    acStack_1ec[0] = '\x03';
  }
  *(char *)((long)param_1 + 500) = acStack_1ec[0];
  return;
}

