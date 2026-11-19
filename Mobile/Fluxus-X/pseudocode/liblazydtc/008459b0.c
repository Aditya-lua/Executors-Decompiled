/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008459b0
 */

void FUN_008459b0(locale *param_1,undefined4 param_2)

{
  undefined8 *puVar1;
  long lVar2;
  undefined *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  if ((*(uint *)(param_1 + 0x18) & 1) == 0) {
    if ((*(uint *)(param_1 + 0x18) >> 3 & 1) == 0) {
      puVar1 = operator_new(0x18);
      lVar2 = *(long *)(param_1 + 0x38);
      *(undefined4 *)(puVar1 + 2) = param_2;
      uVar4 = *(undefined8 *)(lVar2 + 8);
      *puVar1 = &PTR_LAB_00c48e78;
      puVar1[1] = uVar4;
      *(undefined8 **)(lVar2 + 8) = puVar1;
      goto LAB_00845a60;
    }
    puVar1 = operator_new(0x30);
    lVar2 = *(long *)(param_1 + 0x38);
    puVar3 = &std::__ndk1::__back_ref_collate<char,std::__ndk1::regex_traits<char>>::vtable;
  }
  else {
    puVar1 = operator_new(0x30);
    lVar2 = *(long *)(param_1 + 0x38);
    puVar3 = &std::__ndk1::__back_ref_icase<char,std::__ndk1::regex_traits<char>>::vtable;
  }
  uVar4 = *(undefined8 *)(lVar2 + 8);
  *puVar1 = puVar3 + 0x10;
  puVar1[1] = uVar4;
  std::__ndk1::locale::locale((locale *)(puVar1 + 2),param_1);
  uVar5 = *(undefined8 *)(param_1 + 0x10);
  uVar4 = *(undefined8 *)(param_1 + 8);
  lVar2 = *(long *)(param_1 + 0x38);
  *(undefined4 *)(puVar1 + 5) = param_2;
  puVar1[4] = uVar5;
  puVar1[3] = uVar4;
  *(undefined8 **)(lVar2 + 8) = puVar1;
LAB_00845a60:
  *(undefined8 **)(param_1 + 0x38) = puVar1;
  return;
}

