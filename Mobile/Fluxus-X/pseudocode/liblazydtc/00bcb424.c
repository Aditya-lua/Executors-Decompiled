/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb424
 */

void FUN_00bcb424(undefined8 *param_1,int *param_2,
                 basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 *param_3)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  byte local_48;
  undefined7 uStack_47;
  void *local_38;
  
  iVar2 = *param_2;
  if (iVar2 != 0) {
    uVar1 = (ulong)((byte)*param_3 >> 1);
    if (((byte)*param_3 & 1) != 0) {
      uVar1 = *(ulong *)(param_3 + 8);
    }
    if (uVar1 != 0) {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(param_3,": ");
      iVar2 = *param_2;
    }
    (**(code **)(**(long **)(param_2 + 2) + 0x30))(&local_48,*(long **)(param_2 + 2),iVar2);
                    /* try { // try from 00bcb490 to 00bcb49b has its CatchHandler @ 00bcb4e4 */
    FUN_0081f6dc(param_3,&local_48);
    if ((local_48 & 1) != 0) {
      operator_delete(local_38,CONCAT71(uStack_47,local_48) & 0xfffffffffffffffe);
    }
  }
  uVar5 = *(undefined8 *)(param_3 + 8);
  uVar4 = *(undefined8 *)param_3;
  uVar3 = *(undefined8 *)(param_3 + 0x10);
  *(undefined8 *)(param_3 + 8) = 0;
  *(undefined8 *)(param_3 + 0x10) = 0;
  param_1[1] = uVar5;
  *param_1 = uVar4;
  param_1[2] = uVar3;
  *(undefined8 *)param_3 = 0;
  return;
}

