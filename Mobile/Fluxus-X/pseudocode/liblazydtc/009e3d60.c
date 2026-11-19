/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3d60
 */

bool ssl3_take_mac(long param_1)

{
  long lVar1;
  bool bVar2;
  long lVar3;
  long lVar4;
  
  lVar4 = *(long *)(*(long *)(param_1 + 8) + 0xc0);
  bVar2 = *(int *)(param_1 + 0x38) != 0;
  lVar3 = 0x40;
  if (bVar2) {
    lVar3 = 0x30;
  }
  lVar1 = 0x48;
  if (bVar2) {
    lVar1 = 0x38;
  }
  lVar3 = (**(code **)(lVar4 + 0x28))
                    (param_1,*(undefined8 *)(lVar4 + lVar3),*(undefined8 *)(lVar4 + lVar1),
                     param_1 + 0x248);
  *(long *)(param_1 + 0x2c8) = lVar3;
  return lVar3 != 0;
}

