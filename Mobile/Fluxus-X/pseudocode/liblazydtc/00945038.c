/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945038
 */

long FUN_00945038(long param_1,long param_2,ulong param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  
  uVar4 = (ulong)*(uint *)(param_1 + 0x2ec);
  lVar3 = *(long *)(param_1 + 0x20);
  if (*(uint *)(param_1 + 0x2ec) == 0) {
    uVar4 = *(ulong *)(param_2 + 0x38);
  }
  auVar5 = FUN_00941cb8();
  lVar2 = FUN_00941d54(auVar5._0_8_,auVar5._8_8_,*(undefined8 *)(param_2 + 0x28),
                       *(undefined8 *)(param_2 + 0x30));
  uVar1 = *(uint *)(param_1 + 0x2e0);
  lVar2 = uVar4 - lVar2;
  if ((uVar1 != 0) && ((param_3 & 1) == 0)) {
    auVar5 = FUN_00941cb8();
    lVar3 = FUN_00941d54(auVar5._0_8_,auVar5._8_8_,*(undefined8 *)(lVar3 + 0x1f0),
                         *(undefined8 *)(lVar3 + 0x1f8));
    lVar3 = (ulong)uVar1 - lVar3;
    if (lVar3 <= lVar2) {
      lVar2 = lVar3;
    }
  }
  return lVar2;
}

