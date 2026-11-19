/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb964
 */

void FUN_00bfb964(undefined8 *param_1,char *param_2,
                 basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 *param_3)

{
  size_t sVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  sVar1 = strlen(param_2);
  puVar2 = (undefined8 *)
           std::__ndk1::
           basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
                     (param_3,0,param_2,sVar1);
  uVar5 = puVar2[1];
  uVar4 = *puVar2;
  uVar3 = puVar2[2];
  *puVar2 = 0;
  puVar2[1] = 0;
  param_1[1] = uVar5;
  *param_1 = uVar4;
  param_1[2] = uVar3;
  puVar2[2] = 0;
  return;
}

