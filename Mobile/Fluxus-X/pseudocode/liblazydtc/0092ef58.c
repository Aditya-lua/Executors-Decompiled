/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092ef58
 */

undefined8 curl_multi_timeout(int *param_1,undefined8 *param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar3 = 1;
  }
  else if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) == 0) {
    uVar5 = 0;
    if ((*(byte *)((long)param_1 + 0x231) >> 4 & 1) == 0) {
      if (*(long *)(param_1 + 0x34) == 0) {
        uVar5 = 0xffffffffffffffff;
      }
      else {
        auVar6 = FUN_00941cb8();
        lVar1 = auVar6._0_8_;
        lVar2 = FUN_00941308(0,0,*(undefined8 *)(param_1 + 0x34));
        *(long *)(param_1 + 0x34) = lVar2;
        lVar4 = *(long *)(lVar2 + 0x20);
        uVar5 = 0;
        if ((lVar1 <= lVar4) &&
           ((lVar1 < lVar4 || (uVar5 = 0, auVar6._8_4_ < *(int *)(lVar2 + 0x28))))) {
          uVar5 = FUN_00941dc4(lVar4,*(undefined8 *)(lVar2 + 0x28),lVar1,auVar6._8_8_);
        }
      }
    }
    uVar3 = 0;
    *param_2 = uVar5;
  }
  else {
    uVar3 = 8;
  }
  return uVar3;
}

