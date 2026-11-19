/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bea110
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_percent(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >&,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, unsigned int&,
   std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_percent(undefined8 param_1_00,long *param_1,long *param_3,uint *param_4,long *param_5)

{
  bool bVar1;
  char cVar2;
  int iVar3;
  long *plVar4;
  long *plVar5;
  uint uVar6;
  bool bVar7;
  
  plVar4 = (long *)*param_1;
  if (plVar4 == (long *)0x0) {
LAB_00bea18c:
    bVar7 = true;
    bVar1 = true;
    if (param_3 == (long *)0x0) goto LAB_00bea154;
LAB_00bea194:
    if (param_3[3] == param_3[4]) {
      iVar3 = (**(code **)(*param_3 + 0x48))(param_3);
      plVar4 = (long *)0x0;
      if (iVar3 != -1) {
        plVar4 = param_3;
      }
      if (bVar7 == (iVar3 == -1)) {
LAB_00bea1e0:
        uVar6 = 6;
        goto LAB_00bea2d8;
      }
    }
    else {
      plVar4 = param_3;
      if (bVar7 == false) goto LAB_00bea1e0;
    }
  }
  else {
    if (plVar4[3] == plVar4[4]) {
      iVar3 = (**(code **)(*plVar4 + 0x48))();
      if (iVar3 == -1) {
        *param_1 = 0;
        goto LAB_00bea18c;
      }
      bVar1 = *param_1 == 0;
    }
    else {
      bVar1 = false;
    }
    bVar7 = bVar1;
    if (param_3 != (long *)0x0) goto LAB_00bea194;
LAB_00bea154:
    if (bVar1) goto LAB_00bea1e0;
    plVar4 = (long *)0x0;
  }
  plVar5 = (long *)*param_1;
  if ((byte *)plVar5[3] == (byte *)plVar5[4]) {
    uVar6 = (**(code **)(*plVar5 + 0x48))();
  }
  else {
    uVar6 = (uint)*(byte *)plVar5[3];
  }
  cVar2 = (**(code **)(*param_5 + 0x48))(param_5,uVar6,0);
  if (cVar2 != '%') {
    uVar6 = 4;
    goto LAB_00bea2d8;
  }
  plVar5 = (long *)*param_1;
  if (plVar5[3] == plVar5[4]) {
    (**(code **)(*plVar5 + 0x50))();
    plVar5 = (long *)*param_1;
    if (plVar5 != (long *)0x0) goto LAB_00bea250;
LAB_00bea2c8:
    bVar1 = true;
    if (plVar4 != (long *)0x0) goto LAB_00bea264;
LAB_00bea2d0:
    if (bVar1 == false) {
      return;
    }
  }
  else {
    plVar5[3] = plVar5[3] + 1;
LAB_00bea250:
    if (plVar5[3] == plVar5[4]) {
      iVar3 = (**(code **)(*plVar5 + 0x48))();
      if (iVar3 == -1) {
        *param_1 = 0;
        goto LAB_00bea2c8;
      }
      bVar1 = *param_1 == 0;
    }
    else {
      bVar1 = false;
    }
    if (plVar4 == (long *)0x0) goto LAB_00bea2d0;
LAB_00bea264:
    if (plVar4[3] == plVar4[4]) {
      iVar3 = (**(code **)(*plVar4 + 0x48))(plVar4);
      if (bVar1 != (iVar3 == -1)) {
        return;
      }
    }
    else if (bVar1) {
      return;
    }
  }
  uVar6 = 2;
LAB_00bea2d8:
  *param_4 = *param_4 | uVar6;
  return;
}

