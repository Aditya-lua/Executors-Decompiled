/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3e38
 */

/* std::__ndk1::enable_if<__is_forward_iterator<cpr::Parameter*>::value&&is_constructible<cpr::Parameter,
   std::__ndk1::iterator_traits<cpr::Parameter*>::reference>::value, void>::type
   std::__ndk1::vector<cpr::Parameter, std::__ndk1::allocator<cpr::Parameter>
   >::assign<cpr::Parameter*>(cpr::Parameter*, cpr::Parameter*) */

void __thiscall
std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::assign<cpr::Parameter*>
          (vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>> *this,Parameter *param_1,
          Parameter *param_2)

{
  Parameter *pPVar1;
  Parameter *pPVar2;
  Parameter *pPVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  Parameter *pPVar7;
  Parameter *pPVar8;
  ulong uVar9;
  
  lVar4 = *(long *)(this + 0x10);
  pPVar8 = *(Parameter **)this;
  uVar9 = ((long)param_2 - (long)param_1 >> 4) * -0x5555555555555555;
  if ((ulong)((lVar4 - (long)pPVar8 >> 4) * -0x5555555555555555) < uVar9) {
    if (pPVar8 != (Parameter *)0x0) {
      pPVar3 = *(Parameter **)(this + 8);
      if (*(Parameter **)(this + 8) == pPVar8) {
        pPVar3 = pPVar8;
      }
      else {
        do {
          if (((byte)pPVar3[-0x18] & 1) != 0) {
            operator_delete(*(void **)(pPVar3 + -8));
          }
          pPVar7 = pPVar3 + -0x30;
          if (((byte)pPVar3[-0x30] & 1) != 0) {
            operator_delete(*(void **)(pPVar3 + -0x20));
          }
          pPVar3 = pPVar7;
        } while (pPVar8 != pPVar7);
        pPVar3 = *(Parameter **)this;
      }
      *(Parameter **)(this + 8) = pPVar8;
      operator_delete(pPVar3);
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
    pPVar8 = operator_new(uVar6 * 0x30);
    *(Parameter **)this = pPVar8;
    *(Parameter **)(this + 8) = pPVar8;
    *(Parameter **)(this + 0x10) = pPVar8 + uVar6 * 0x30;
    for (; param_1 != param_2; param_1 = param_1 + 0x30) {
      cpr::Parameter::Parameter(pPVar8,param_1);
      pPVar8 = (Parameter *)(*(long *)(this + 8) + 0x30);
      *(Parameter **)(this + 8) = pPVar8;
    }
  }
  else {
    uVar6 = (*(long *)(this + 8) - (long)pPVar8 >> 4) * -0x5555555555555555;
    pPVar3 = param_1 + (*(long *)(this + 8) - (long)pPVar8);
    pPVar7 = pPVar3;
    if (uVar9 <= uVar6) {
      pPVar7 = param_2;
    }
    if (pPVar7 != param_1) {
      lVar4 = 0;
      do {
        if (param_1 != pPVar8) {
          pPVar1 = param_1 + lVar4;
          uVar5 = *(ulong *)(pPVar1 + 8);
          pPVar2 = *(Parameter **)(pPVar1 + 0x10);
          if (((byte)*pPVar1 & 1) == 0) {
            pPVar2 = pPVar1 + 1;
            uVar5 = (ulong)((byte)*pPVar1 >> 1);
          }
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)(pPVar8 + lVar4),(char *)pPVar2,uVar5);
          uVar5 = (ulong)((byte)pPVar1[0x18] >> 1);
          pPVar2 = pPVar1 + 0x19;
          if (((byte)pPVar1[0x18] & 1) != 0) {
            uVar5 = *(ulong *)(pPVar1 + 0x20);
            pPVar2 = *(Parameter **)(pPVar1 + 0x28);
          }
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)(pPVar8 + lVar4) + 0x18,(char *)pPVar2,uVar5);
        }
        lVar4 = lVar4 + 0x30;
      } while ((long)pPVar7 - (long)param_1 != lVar4);
      pPVar8 = pPVar8 + lVar4;
    }
    if (uVar6 < uVar9) {
      if (pPVar7 != param_2) {
        pPVar8 = *(Parameter **)(this + 8);
        do {
          cpr::Parameter::Parameter(pPVar8,pPVar3);
          pPVar3 = pPVar3 + 0x30;
          pPVar8 = (Parameter *)(*(long *)(this + 8) + 0x30);
          *(Parameter **)(this + 8) = pPVar8;
        } while (param_2 != pPVar3);
      }
    }
    else {
      pPVar3 = *(Parameter **)(this + 8);
      while (pPVar7 = pPVar3, pPVar7 != pPVar8) {
        if (((byte)pPVar7[-0x18] & 1) != 0) {
          operator_delete(*(void **)(pPVar7 + -8));
        }
        pPVar3 = pPVar7 + -0x30;
        if (((byte)pPVar7[-0x30] & 1) != 0) {
          operator_delete(*(void **)(pPVar7 + -0x20));
        }
      }
      *(Parameter **)(this + 8) = pPVar8;
    }
  }
  return;
}

