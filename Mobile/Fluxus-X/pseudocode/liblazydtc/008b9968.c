/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9968
 */

void FUN_008b9968(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  lVar1 = FUN_008b7610(param_2,0x180,*(undefined1 *)(param_1 + 1));
  *(long *)(param_1 + 0x50) = lVar1;
  *(undefined4 *)(param_1 + 0x44) = 8;
  *(long *)(param_1 + 0x18) = lVar1 + 0x150;
  *(long *)(param_1 + 0x20) = lVar1;
  lVar2 = FUN_008b7610(param_2,0x2d0,*(undefined1 *)(param_1 + 1));
  puVar3 = *(undefined8 **)(param_1 + 0x50);
  *(undefined4 *)(param_1 + 0x40) = 0x2d;
  *(long *)(param_1 + 0x48) = lVar2 + 0x280;
  lVar1 = lVar2 + 0x10;
  *(long *)(param_1 + 0x58) = lVar2;
  *(undefined4 *)(lVar2 + 0x1c) = 0;
  *(undefined4 *)(lVar2 + 0x2c) = 0;
  *(undefined4 *)(lVar2 + 0x3c) = 0;
  *(undefined4 *)(lVar2 + 0x4c) = 0;
  *(undefined4 *)(lVar2 + 0x5c) = 0;
  *(undefined4 *)(lVar2 + 0x6c) = 0;
  *(undefined4 *)(lVar2 + 0x7c) = 0;
  *(undefined4 *)(lVar2 + 0x8c) = 0;
  *(undefined4 *)(lVar2 + 0x9c) = 0;
  *(undefined4 *)(lVar2 + 0xac) = 0;
  *(undefined4 *)(lVar2 + 0xbc) = 0;
  *(undefined4 *)(lVar2 + 0xcc) = 0;
  *(undefined4 *)(lVar2 + 0xdc) = 0;
  *(undefined4 *)(lVar2 + 0xec) = 0;
  *(undefined4 *)(lVar2 + 0xfc) = 0;
  *(undefined4 *)(lVar2 + 0x10c) = 0;
  *(undefined4 *)(lVar2 + 0x11c) = 0;
  *(undefined4 *)(lVar2 + 300) = 0;
  *(undefined4 *)(lVar2 + 0x13c) = 0;
  *(undefined4 *)(lVar2 + 0x14c) = 0;
  *(undefined4 *)(lVar2 + 0x15c) = 0;
  *(undefined4 *)(lVar2 + 0x16c) = 0;
  *(undefined4 *)(lVar2 + 0x17c) = 0;
  *(undefined4 *)(lVar2 + 0x18c) = 0;
  *(undefined4 *)(lVar2 + 0x19c) = 0;
  *(undefined4 *)(lVar2 + 0x1ac) = 0;
  *(undefined4 *)(lVar2 + 0x1bc) = 0;
  *(undefined4 *)(lVar2 + 0x1cc) = 0;
  *(undefined4 *)(lVar2 + 0x1dc) = 0;
  *(undefined4 *)(lVar2 + 0x1ec) = 0;
  *(undefined4 *)(lVar2 + 0x1fc) = 0;
  *(undefined4 *)(lVar2 + 0x20c) = 0;
  *(undefined4 *)(lVar2 + 0x21c) = 0;
  *(undefined4 *)(lVar2 + 0x22c) = 0;
  *(undefined4 *)(lVar2 + 0x23c) = 0;
  *(undefined4 *)(lVar2 + 0x24c) = 0;
  *(undefined4 *)(lVar2 + 0x25c) = 0;
  *(undefined4 *)(lVar2 + 0x26c) = 0;
  *(undefined4 *)(lVar2 + 0x27c) = 0;
  *(undefined4 *)(lVar2 + 0x28c) = 0;
  *(undefined4 *)(lVar2 + 0x29c) = 0;
  *(undefined4 *)(lVar2 + 0x2ac) = 0;
  *(undefined4 *)(lVar2 + 700) = 0;
  *(undefined4 *)(lVar2 + 0x2cc) = 0;
  *puVar3 = 0;
  puVar3[1] = lVar2;
  *(undefined4 *)(lVar2 + 0xc) = 0;
  *(long *)(param_1 + 0x68) = lVar1;
  *(long *)(param_1 + 0x70) = lVar1;
  puVar3[2] = lVar1;
  puVar3[3] = lVar2 + 0x150;
  return;
}

