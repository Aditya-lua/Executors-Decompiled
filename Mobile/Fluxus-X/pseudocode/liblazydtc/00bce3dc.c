/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce3dc
 */

/* std::__ndk1::ios_base::move(std::__ndk1::ios_base&) */

void __thiscall std::__ndk1::ios_base::move(ios_base *this,ios_base *param_1)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar1 = *(undefined4 *)(param_1 + 8);
  uVar3 = *(undefined8 *)(param_1 + 0x18);
  uVar2 = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined4 *)(this + 8) = uVar1;
  uVar4 = *(undefined8 *)(param_1 + 0x20);
  *(undefined8 *)(this + 0x18) = uVar3;
  *(undefined8 *)(this + 0x10) = uVar2;
  *(undefined8 *)(this + 0x20) = uVar4;
  locale::locale((locale *)(this + 0x30),(locale *)(param_1 + 0x30));
  uVar4 = *(undefined8 *)(param_1 + 0x48);
  uVar3 = *(undefined8 *)(param_1 + 0x40);
  uVar2 = *(undefined8 *)(param_1 + 0x38);
  *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_1 + 0x50);
  *(undefined8 *)(this + 0x48) = uVar4;
  *(undefined8 *)(this + 0x40) = uVar3;
  *(undefined8 *)(this + 0x38) = uVar2;
  uVar3 = *(undefined8 *)(param_1 + 0x60);
  uVar2 = *(undefined8 *)(param_1 + 0x58);
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x48) = 0;
  *(undefined8 *)(this + 0x68) = *(undefined8 *)(param_1 + 0x68);
  *(undefined8 *)(this + 0x60) = uVar3;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  uVar4 = *(undefined8 *)(param_1 + 0x80);
  uVar3 = *(undefined8 *)(param_1 + 0x78);
  *(undefined8 *)(this + 0x58) = uVar2;
  *(undefined8 *)(param_1 + 0x58) = 0;
  *(undefined8 *)(param_1 + 0x68) = 0;
  *(undefined8 *)(param_1 + 0x60) = 0;
  *(undefined8 *)(this + 0x70) = *(undefined8 *)(param_1 + 0x70);
  *(undefined8 *)(param_1 + 0x70) = 0;
  *(undefined8 *)(this + 0x80) = uVar4;
  *(undefined8 *)(this + 0x78) = uVar3;
  *(undefined8 *)(param_1 + 0x80) = 0;
  *(undefined8 *)(param_1 + 0x78) = 0;
  return;
}

