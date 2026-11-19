/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce478
 */

/* std::__ndk1::ios_base::swap(std::__ndk1::ios_base&) */

void __thiscall std::__ndk1::ios_base::swap(ios_base *this,ios_base *param_1)

{
  undefined8 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  locale alStack_28 [8];
  
  uVar5 = *(undefined8 *)(param_1 + 0x10);
  uVar2 = *(undefined4 *)(this + 8);
  *(undefined4 *)(this + 8) = *(undefined4 *)(param_1 + 8);
  uVar4 = *(undefined8 *)(this + 0x10);
  *(undefined8 *)(this + 0x10) = uVar5;
  *(undefined4 *)(param_1 + 8) = uVar2;
  *(undefined8 *)(param_1 + 0x10) = uVar4;
  uVar2 = *(undefined4 *)(param_1 + 0x20);
  uVar4 = *(undefined8 *)(this + 0x18);
  *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 0x18);
  uVar3 = *(undefined4 *)(this + 0x20);
  *(undefined4 *)(this + 0x20) = uVar2;
  *(undefined4 *)(param_1 + 0x20) = uVar3;
  uVar2 = *(undefined4 *)(this + 0x24);
  *(undefined8 *)(param_1 + 0x18) = uVar4;
  *(undefined4 *)(this + 0x24) = *(undefined4 *)(param_1 + 0x24);
  *(undefined4 *)(param_1 + 0x24) = uVar2;
  locale::locale(alStack_28,(locale *)(this + 0x30));
  locale::operator=((locale *)(this + 0x30),(locale *)(param_1 + 0x30));
  locale::operator=((locale *)(param_1 + 0x30),alStack_28);
  locale::~locale(alStack_28);
  uVar4 = *(undefined8 *)(this + 0x38);
  *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
  *(undefined8 *)(param_1 + 0x38) = uVar4;
  uVar5 = *(undefined8 *)(param_1 + 0x48);
  uVar4 = *(undefined8 *)(this + 0x40);
  uVar1 = *(undefined8 *)(this + 0x48);
  *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_1 + 0x40);
  *(undefined8 *)(this + 0x48) = uVar5;
  *(undefined8 *)(param_1 + 0x40) = uVar4;
  *(undefined8 *)(param_1 + 0x48) = uVar1;
  uVar5 = *(undefined8 *)(param_1 + 0x58);
  uVar4 = *(undefined8 *)(this + 0x50);
  uVar1 = *(undefined8 *)(this + 0x58);
  *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_1 + 0x50);
  *(undefined8 *)(this + 0x58) = uVar5;
  *(undefined8 *)(param_1 + 0x50) = uVar4;
  uVar4 = *(undefined8 *)(this + 0x60);
  *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_1 + 0x60);
  *(undefined8 *)(param_1 + 0x58) = uVar1;
  *(undefined8 *)(param_1 + 0x60) = uVar4;
  uVar5 = *(undefined8 *)(param_1 + 0x70);
  uVar4 = *(undefined8 *)(this + 0x68);
  uVar1 = *(undefined8 *)(this + 0x70);
  *(undefined8 *)(this + 0x68) = *(undefined8 *)(param_1 + 0x68);
  *(undefined8 *)(this + 0x70) = uVar5;
  *(undefined8 *)(param_1 + 0x68) = uVar4;
  uVar4 = *(undefined8 *)(this + 0x78);
  *(undefined8 *)(this + 0x78) = *(undefined8 *)(param_1 + 0x78);
  *(undefined8 *)(param_1 + 0x70) = uVar1;
  *(undefined8 *)(param_1 + 0x78) = uVar4;
  uVar4 = *(undefined8 *)(this + 0x80);
  *(undefined8 *)(this + 0x80) = *(undefined8 *)(param_1 + 0x80);
  *(undefined8 *)(param_1 + 0x80) = uVar4;
  return;
}

