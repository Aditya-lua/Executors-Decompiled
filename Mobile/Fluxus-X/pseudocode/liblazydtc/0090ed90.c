/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ed90
 */

undefined8 FUN_0090ed90(long param_1,undefined4 *param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined1 auVar5 [16];
  
  lVar3 = *(long *)(param_1 + 0xda0);
  if (lVar3 == 0) {
    puVar4 = *(undefined8 **)(param_1 + 0xda8);
    auVar5 = FUN_00941cb8();
    lVar3 = FUN_00941d54(auVar5._0_8_,auVar5._8_8_,*puVar4,puVar4[1]);
    uVar2 = 0;
    if (2 < lVar3) {
      if (lVar3 < 0x33) {
        uVar2 = (ulong)((uint)lVar3 & 0xff) / 3;
      }
      else {
        uVar2 = 0x32;
        if (0xfa < lVar3) {
          uVar2 = 200;
        }
      }
    }
    FUN_0092aff8(param_1,uVar2,1);
    uVar1 = 0;
  }
  else {
    uVar1 = 1;
    *param_2 = *(undefined4 *)(lVar3 + 0x38);
    *(long *)(lVar3 + 0x30) = param_1;
  }
  return uVar1;
}

