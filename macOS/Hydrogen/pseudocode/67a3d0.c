
undefined8 * FUN_0067a3d0(undefined8 *param_1)

{
  ulong uVar1;
  
  *param_1 = &UNK_00a14f18;
  if ((long *)param_1[0xf] != (long *)0x0) {
    (**(code **)(*(long *)param_1[0xf] + 8))();
  }
  uVar1 = param_1[0xc];
  if ((ulong)param_1[0xd] <= (ulong)param_1[0xc]) {
    uVar1 = param_1[0xd];
  }
  if ((undefined8 *)param_1[0xe] == param_1 + 7) {
    *(undefined1 *)((long)param_1 + 0x59) = 0;
    for (; uVar1 != 0; uVar1 = uVar1 - 1) {
      *(undefined1 *)((long)param_1 + uVar1 + 0x37) = 0;
    }
  }
  uVar1 = param_1[4];
  if ((ulong)param_1[5] <= (ulong)param_1[4]) {
    uVar1 = param_1[5];
  }
  if ((undefined8 *)param_1[6] == param_1 + 1) {
    *(undefined1 *)((long)param_1 + 0x19) = 0;
    for (; uVar1 != 0; uVar1 = uVar1 - 1) {
      *(undefined1 *)((long)param_1 + uVar1 + 7) = 0;
    }
  }
  return param_1;
}

