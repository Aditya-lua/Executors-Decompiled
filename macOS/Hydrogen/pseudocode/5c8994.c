
undefined * FUN_005c8994(long param_1,undefined8 param_2,ulong *param_3)

{
  long in_x9;
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  uint uVar4;
  
  do {
    puVar2 = (undefined8 *)(param_1 + 0x58);
    lVar3 = (ulong)*(ushort *)(param_1 + 0xba) << 3;
    uVar1 = 0xffffffffffffffff;
    do {
      if (lVar3 == 0) {
        uVar1 = (ulong)*(ushort *)(param_1 + 0xba);
        goto code_r0x005c89ec;
      }
      uVar4 = (uint)(*param_3 != *(ulong *)puVar2[-10]);
      if (*param_3 < *(ulong *)puVar2[-10]) {
        uVar4 = 0xffffffff;
      }
      puVar2 = puVar2 + 1;
      lVar3 = lVar3 + -8;
      uVar1 = uVar1 + 1;
    } while (uVar4 == 1);
    if ((uVar4 & 0xff) == 0) {
      return (undefined *)*puVar2;
    }
code_r0x005c89ec:
    if (in_x9 == 0) {
      return &UNK_008b5850;
    }
    param_1 = *(long *)(param_1 + uVar1 * 8 + 0xc0);
    in_x9 = in_x9 + -1;
  } while( true );
}

