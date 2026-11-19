/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc7e4
 */

/* std::__ndk1::promise<void>::promise() */

void __thiscall std::__ndk1::promise<void>::promise(promise<void> *this)

{
  undefined8 *puVar1;
  
  puVar1 = operator_new(0x78);
  *(undefined4 *)(puVar1 + 0xe) = 0;
  *puVar1 = &PTR_LAB_00cacb48;
  puVar1[1] = 0;
  puVar1[3] = 0;
  puVar1[2] = 0;
  puVar1[5] = 0;
  puVar1[4] = 0;
  puVar1[7] = 0;
  puVar1[6] = 0;
  puVar1[9] = 0;
  puVar1[8] = 0;
  puVar1[0xb] = 0;
  puVar1[10] = 0;
  puVar1[0xd] = 0;
  puVar1[0xc] = 0;
  *(undefined8 **)this = puVar1;
  return;
}

