/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910510
 */

long FUN_00910510(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  auVar6 = FUN_00941cb8();
  plVar3 = *(long **)(param_2 + 0x10);
  if (plVar3 == (long *)0x0) {
    lVar2 = 0;
  }
  else {
    lVar2 = 0;
    lVar4 = -1;
    do {
      while (lVar5 = *plVar3, *(long *)(lVar5 + 1000) != 0) {
        plVar3 = (long *)plVar3[2];
        if (plVar3 == (long *)0x0) goto LAB_0091058c;
      }
      lVar1 = FUN_00941d54(auVar6._0_8_,auVar6._8_8_,*(undefined8 *)(lVar5 + 0x210),
                           *(undefined8 *)(lVar5 + 0x218));
      if (lVar1 <= lVar4) {
        lVar1 = lVar4;
        lVar5 = lVar2;
      }
      lVar2 = lVar5;
      plVar3 = (long *)plVar3[2];
      lVar4 = lVar1;
    } while (plVar3 != (long *)0x0);
LAB_0091058c:
    if (lVar2 != 0) {
      for (plVar3 = *(long **)(param_2 + 0x10); plVar3 != (long *)0x0; plVar3 = (long *)plVar3[2]) {
        if (*plVar3 == lVar2) {
          FUN_00925d80((long *)(param_2 + 0x10),plVar3,0);
          *(long *)(param_2 + 8) = *(long *)(param_2 + 8) + -1;
          *(undefined8 *)(lVar2 + 0x540) = 0;
          break;
        }
      }
      *(long *)(*(long *)(param_1 + 0xc38) + 0x30) =
           *(long *)(*(long *)(param_1 + 0xc38) + 0x30) + -1;
    }
  }
  return lVar2;
}

