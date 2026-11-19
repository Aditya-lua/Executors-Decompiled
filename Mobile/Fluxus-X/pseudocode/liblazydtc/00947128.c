/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00947128
 */

undefined8 FUN_00947128(long param_1,undefined1 *param_2)

{
  undefined8 uVar1;
  undefined1 uVar2;
  long lVar3;
  undefined1 auVar4 [16];
  
  lVar3 = *(long *)(param_1 + 0x20);
  FUN_00931d94(param_1,4);
  if ((*(byte *)(*(long *)(lVar3 + 0x3a8) + 0x94) >> 4 & 1) == 0) {
    *(ulong *)(lVar3 + 0x3a0) = *(ulong *)(lVar3 + 0x3a0) & 0xffffffffffffffef;
    *(undefined8 *)(param_1 + 0x1108) = 0;
    auVar4 = FUN_00941cb8();
    *(undefined1 (*) [16])(lVar3 + 0x1f0) = auVar4;
    if ((*(char *)(lVar3 + 0x3a0) < '\0') ||
       (uVar1 = FUN_0090a514(param_1,lVar3,0,*(undefined8 *)(lVar3 + 0x30),0xffffffff),
       (int)uVar1 == 0)) {
      uVar1 = FUN_00921be0(param_1);
    }
    uVar2 = 0;
  }
  else {
    uVar1 = 0;
    uVar2 = 1;
  }
  *param_2 = uVar2;
  return uVar1;
}

