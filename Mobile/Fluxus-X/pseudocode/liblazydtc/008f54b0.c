/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f54b0
 */

/* std::__ndk1::__hash_table<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::__move_assign(std::__ndk1::__hash_table<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   std::__ndk1::hash<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::equal_to<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > > >&, std::__ndk1::integral_constant<bool, true>) */

void std::__ndk1::
     __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
     ::__move_assign(long *param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  void *pvVar7;
  
  if (param_1[3] != 0) {
    puVar2 = (void *)param_1[2];
    while (puVar2 != (void *)0x0) {
      pvVar7 = (void *)*puVar2;
      if ((*(byte *)(puVar2 + 2) & 1) != 0) {
        operator_delete((void *)puVar2[4]);
      }
      operator_delete(puVar2);
      puVar2 = pvVar7;
    }
    lVar3 = param_1[1];
    param_1[2] = 0;
    if (lVar3 != 0) {
      lVar5 = 0;
      do {
        *(undefined8 *)(*param_1 + lVar5 * 8) = 0;
        lVar5 = lVar5 + 1;
      } while (lVar3 != lVar5);
    }
    param_1[3] = 0;
  }
  lVar3 = *param_2;
  *param_2 = 0;
  pvVar7 = (void *)*param_1;
  *param_1 = lVar3;
  if (pvVar7 != (void *)0x0) {
    operator_delete(pvVar7);
  }
  param_1[1] = param_2[1];
  lVar5 = param_2[3];
  param_2[1] = 0;
  param_1[3] = lVar5;
  *(int *)(param_1 + 4) = (int)param_2[4];
  lVar3 = param_2[2];
  param_1[2] = lVar3;
  if (lVar5 != 0) {
    uVar6 = param_1[1];
    uVar4 = *(ulong *)(lVar3 + 8);
    if ((uVar6 - 1 & uVar6) == 0) {
      uVar4 = uVar6 - 1 & uVar4;
    }
    else if (uVar6 <= uVar4) {
      uVar1 = 0;
      if (uVar6 != 0) {
        uVar1 = uVar4 / uVar6;
      }
      uVar4 = uVar4 - uVar1 * uVar6;
    }
    *(long **)(*param_1 + uVar4 * 8) = param_1 + 2;
    param_2[2] = 0;
    param_2[3] = 0;
  }
  return;
}

