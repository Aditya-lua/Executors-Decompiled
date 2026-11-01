
bool FUN_004bb004(long param_1)

{
  ulong uVar1;
  long lVar2;
  long in_x11;
  ulong uVar3;
  long lVar4;
  
  uVar1 = (ulong)*(uint *)(param_1 + 0x18);
  lVar2 = 0;
  uVar3 = 0xffffffff;
  do {
    for (; uVar1 < *(ulong *)(in_x11 + 0x28);
        uVar1 = (ulong)*(uint *)(*(long *)(in_x11 + 0x20) + uVar1 * 0x30 + 0x20)) {
      lVar2 = lVar2 + 1;
    }
    do {
      if (*(ulong *)(in_x11 + 0x28) <= uVar3) {
        return lVar2 == 0;
      }
      lVar4 = *(long *)(in_x11 + 0x20) + uVar3 * 0x30;
      uVar3 = (ulong)*(uint *)(lVar4 + 0x24);
    } while (*(int *)(lVar4 + 0x28) == -1);
    lVar2 = lVar2 + 1;
  } while( true );
}

