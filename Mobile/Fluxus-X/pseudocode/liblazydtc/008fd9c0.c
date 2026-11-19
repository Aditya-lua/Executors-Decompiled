/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd9c0
 */

/* std::__ndk1::enable_if<__is_forward_iterator<cpr::File*>::value&&is_constructible<cpr::File,
   std::__ndk1::iterator_traits<cpr::File*>::reference>::value, void>::type
   std::__ndk1::vector<cpr::File, std::__ndk1::allocator<cpr::File>
   >::assign<cpr::File*>(cpr::File*, cpr::File*) */

void __thiscall
std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::assign<cpr::File*>
          (vector<cpr::File,std::__ndk1::allocator<cpr::File>> *this,File *param_1,File *param_2)

{
  File *pFVar1;
  File *pFVar2;
  File *pFVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  File *pFVar7;
  File *pFVar8;
  ulong uVar9;
  
  lVar4 = *(long *)(this + 0x10);
  pFVar8 = *(File **)this;
  uVar9 = ((long)param_2 - (long)param_1 >> 4) * -0x5555555555555555;
  if ((ulong)((lVar4 - (long)pFVar8 >> 4) * -0x5555555555555555) < uVar9) {
    if (pFVar8 != (File *)0x0) {
      pFVar3 = *(File **)(this + 8);
      if (*(File **)(this + 8) == pFVar8) {
        pFVar3 = pFVar8;
      }
      else {
        do {
          if (((byte)pFVar3[-0x18] & 1) != 0) {
            operator_delete(*(void **)(pFVar3 + -8));
          }
          pFVar7 = pFVar3 + -0x30;
          if (((byte)pFVar3[-0x30] & 1) != 0) {
            operator_delete(*(void **)(pFVar3 + -0x20));
          }
          pFVar3 = pFVar7;
        } while (pFVar8 != pFVar7);
        pFVar3 = *(File **)this;
      }
      *(File **)(this + 8) = pFVar8;
      operator_delete(pFVar3);
      lVar4 = 0;
      *(undefined8 *)this = 0;
      *(undefined8 *)(this + 8) = 0;
      *(undefined8 *)(this + 0x10) = 0;
    }
    uVar6 = 0x555555555555555;
    if (0x555555555555555 < uVar9) {
                    /* WARNING: Subroutine does not return */
      __vector_base_common<true>::__throw_length_error();
    }
    if ((ulong)((lVar4 >> 4) * -0x5555555555555555) < 0x2aaaaaaaaaaaaaa) {
      uVar5 = (lVar4 >> 4) * 0x5555555555555556;
      uVar6 = uVar9;
      if (uVar9 <= uVar5) {
        uVar6 = uVar5;
      }
    }
    pFVar8 = operator_new(uVar6 * 0x30);
    *(File **)this = pFVar8;
    *(File **)(this + 8) = pFVar8;
    *(File **)(this + 0x10) = pFVar8 + uVar6 * 0x30;
    for (; param_1 != param_2; param_1 = param_1 + 0x30) {
      cpr::File::File(pFVar8,param_1);
      pFVar8 = (File *)(*(long *)(this + 8) + 0x30);
      *(File **)(this + 8) = pFVar8;
    }
  }
  else {
    uVar6 = (*(long *)(this + 8) - (long)pFVar8 >> 4) * -0x5555555555555555;
    pFVar3 = param_1 + (*(long *)(this + 8) - (long)pFVar8);
    pFVar7 = pFVar3;
    if (uVar9 <= uVar6) {
      pFVar7 = param_2;
    }
    if (pFVar7 != param_1) {
      lVar4 = 0;
      do {
        if (param_1 != pFVar8) {
          pFVar1 = param_1 + lVar4;
          uVar5 = *(ulong *)(pFVar1 + 8);
          pFVar2 = *(File **)(pFVar1 + 0x10);
          if (((byte)*pFVar1 & 1) == 0) {
            pFVar2 = pFVar1 + 1;
            uVar5 = (ulong)((byte)*pFVar1 >> 1);
          }
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)(pFVar8 + lVar4),(char *)pFVar2,uVar5);
          uVar5 = (ulong)((byte)pFVar1[0x18] >> 1);
          pFVar2 = pFVar1 + 0x19;
          if (((byte)pFVar1[0x18] & 1) != 0) {
            uVar5 = *(ulong *)(pFVar1 + 0x20);
            pFVar2 = *(File **)(pFVar1 + 0x28);
          }
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)(pFVar8 + lVar4) + 0x18,(char *)pFVar2,uVar5);
        }
        lVar4 = lVar4 + 0x30;
      } while ((long)pFVar7 - (long)param_1 != lVar4);
      pFVar8 = pFVar8 + lVar4;
    }
    if (uVar6 < uVar9) {
      if (pFVar7 != param_2) {
        pFVar8 = *(File **)(this + 8);
        do {
          cpr::File::File(pFVar8,pFVar3);
          pFVar3 = pFVar3 + 0x30;
          pFVar8 = (File *)(*(long *)(this + 8) + 0x30);
          *(File **)(this + 8) = pFVar8;
        } while (param_2 != pFVar3);
      }
    }
    else {
      pFVar3 = *(File **)(this + 8);
      while (pFVar7 = pFVar3, pFVar7 != pFVar8) {
        if (((byte)pFVar7[-0x18] & 1) != 0) {
          operator_delete(*(void **)(pFVar7 + -8));
        }
        pFVar3 = pFVar7 + -0x30;
        if (((byte)pFVar7[-0x30] & 1) != 0) {
          operator_delete(*(void **)(pFVar7 + -0x20));
        }
      }
      *(File **)(this + 8) = pFVar8;
    }
  }
  return;
}

