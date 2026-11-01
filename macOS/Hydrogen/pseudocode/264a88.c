
void FUN_00264a88(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  long in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  ulong in_x15;
  long lStack_58;
  ulong uStack_50;
  undefined8 uStack_48;
  undefined1 uStack_40;
  
  *(ulong *)(param_2 + 0x10) = in_x15;
  if (in_x15 < in_x10) {
    bVar3 = *(byte *)(in_x9 + in_x11);
    uVar1 = in_x12 + 4;
    *(ulong *)(param_2 + 0x10) = uVar1;
    if (uVar1 < in_x10) {
      bVar4 = *(byte *)(in_x9 + in_x15);
      uVar2 = in_x12 + 5;
      *(ulong *)(param_2 + 0x10) = uVar2;
      if ((((bVar3 != 0) &&
           (uStack_50 = (ulong)bVar3 << 0x10 | (ulong)bVar4 << 8 | (ulong)*(byte *)(in_x9 + uVar1),
           uStack_50 < 0xffff)) && (!CARRY8(uVar2,uStack_50))) && (uStack_50 + uVar2 <= in_x10)) {
        *(ulong *)(param_2 + 0x10) = uStack_50 + uVar2;
        lStack_58 = in_x9 + uVar2;
        uStack_48 = 0x800000000000001c;
        uStack_40 = 1;
        func_0x0025de4c(&lStack_58,&uStack_48);
        return;
      }
    }
  }
  *param_1 = 0x800000000000001c;
  *(undefined1 *)(param_1 + 1) = 1;
  return;
}

