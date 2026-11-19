/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c21e4
 */

long FUN_009c21e4(long param_1,short param_2)

{
  long lVar1;
  long lVar2;
  
  lVar2 = *(long *)(*(long *)(param_1 + 0x9a8) + 0x620);
  if (*(short *)(lVar2 + 8) != param_2) {
    if (*(short *)(lVar2 + 0x30) == param_2) {
      lVar2 = lVar2 + 0x28;
    }
    else if (*(short *)(lVar2 + 0x58) == param_2) {
      lVar2 = lVar2 + 0x50;
    }
    else if (*(short *)(lVar2 + 0x80) == param_2) {
      lVar2 = lVar2 + 0x78;
    }
    else if (*(short *)(lVar2 + 0xa8) == param_2) {
      lVar2 = lVar2 + 0xa0;
    }
    else if (*(short *)(lVar2 + 0xd0) == param_2) {
      lVar2 = lVar2 + 200;
    }
    else if (*(short *)(lVar2 + 0xf8) == param_2) {
      lVar2 = lVar2 + 0xf0;
    }
    else if (*(short *)(lVar2 + 0x120) == param_2) {
      lVar2 = lVar2 + 0x118;
    }
    else if (*(short *)(lVar2 + 0x148) == param_2) {
      lVar2 = lVar2 + 0x140;
    }
    else if (*(short *)(lVar2 + 0x170) == param_2) {
      lVar2 = lVar2 + 0x168;
    }
    else if (*(short *)(lVar2 + 0x198) == param_2) {
      lVar2 = lVar2 + 400;
    }
    else if (*(short *)(lVar2 + 0x1c0) == param_2) {
      lVar2 = lVar2 + 0x1b8;
    }
    else if (*(short *)(lVar2 + 0x1e8) == param_2) {
      lVar2 = lVar2 + 0x1e0;
    }
    else if (*(short *)(lVar2 + 0x210) == param_2) {
      lVar2 = lVar2 + 0x208;
    }
    else if (*(short *)(lVar2 + 0x238) == param_2) {
      lVar2 = lVar2 + 0x230;
    }
    else if (*(short *)(lVar2 + 0x260) == param_2) {
      lVar2 = lVar2 + 600;
    }
    else if (*(short *)(lVar2 + 0x288) == param_2) {
      lVar2 = lVar2 + 0x280;
    }
    else if (*(short *)(lVar2 + 0x2b0) == param_2) {
      lVar2 = lVar2 + 0x2a8;
    }
    else if (*(short *)(lVar2 + 0x2d8) == param_2) {
      lVar2 = lVar2 + 0x2d0;
    }
    else if (*(short *)(lVar2 + 0x300) == param_2) {
      lVar2 = lVar2 + 0x2f8;
    }
    else if (*(short *)(lVar2 + 0x328) == param_2) {
      lVar2 = lVar2 + 800;
    }
    else if (*(short *)(lVar2 + 0x350) == param_2) {
      lVar2 = lVar2 + 0x348;
    }
    else if (*(short *)(lVar2 + 0x378) == param_2) {
      lVar2 = lVar2 + 0x370;
    }
    else if (*(short *)(lVar2 + 0x3a0) == param_2) {
      lVar2 = lVar2 + 0x398;
    }
    else if (*(short *)(lVar2 + 0x3c8) == param_2) {
      lVar2 = lVar2 + 0x3c0;
    }
    else if (*(short *)(lVar2 + 0x3f0) == param_2) {
      lVar2 = lVar2 + 1000;
    }
    else if (*(short *)(lVar2 + 0x418) == param_2) {
      lVar2 = lVar2 + 0x410;
    }
    else {
      if (*(short *)(lVar2 + 0x440) != param_2) {
        return 0;
      }
      lVar2 = lVar2 + 0x438;
    }
  }
  lVar1 = 0;
  if (*(int *)(lVar2 + 0x24) != 0) {
    lVar1 = lVar2;
  }
  return lVar1;
}

