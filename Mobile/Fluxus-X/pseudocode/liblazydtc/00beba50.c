/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beba50
 */

/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >
   >::__get_white_space(std::__ndk1::istreambuf_iterator<wchar_t, std::__ndk1::char_traits<wchar_t>
   >&, std::__ndk1::istreambuf_iterator<wchar_t, std::__ndk1::char_traits<wchar_t> >, unsigned int&,
   std::__ndk1::ctype<wchar_t> const&) const */

void __thiscall
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
__get_white_space(undefined8 param_1_00,long *param_1,long *param_3,uint *param_4,long *param_5)

{
  bool bVar1;
  bool bVar2;
  undefined4 uVar3;
  int iVar4;
  long *plVar5;
  ulong uVar6;
  long *plVar7;
  
  plVar5 = (long *)*param_1;
  if (plVar5 != (long *)0x0) goto LAB_00beba94;
LAB_00bebae0:
  plVar7 = (long *)0x0;
  bVar1 = true;
  plVar5 = param_3;
  bVar2 = true;
  if (param_3 == (long *)0x0) goto LAB_00bebabc;
  while( true ) {
    if ((int *)plVar5[3] == (int *)plVar5[4]) {
      iVar4 = (**(code **)(*plVar5 + 0x48))(plVar5);
      plVar7 = (long *)*param_1;
    }
    else {
      iVar4 = *(int *)plVar5[3];
    }
    param_3 = (long *)0x0;
    if (iVar4 != -1) {
      param_3 = plVar5;
    }
    if (bVar1 == (iVar4 == -1)) break;
    while( true ) {
      if ((undefined4 *)plVar7[3] == (undefined4 *)plVar7[4]) {
        uVar3 = (**(code **)(*plVar7 + 0x48))();
      }
      else {
        uVar3 = *(undefined4 *)plVar7[3];
      }
      uVar6 = (**(code **)(*param_5 + 0x18))(param_5,1,uVar3);
      plVar7 = (long *)*param_1;
      if ((uVar6 & 1) == 0) goto LAB_00bebb94;
      if (plVar7[3] == plVar7[4]) {
        (**(code **)(*plVar7 + 0x50))();
        plVar5 = (long *)*param_1;
      }
      else {
        plVar7[3] = plVar7[3] + 4;
        plVar5 = (long *)*param_1;
      }
      if (plVar5 == (long *)0x0) goto LAB_00bebae0;
LAB_00beba94:
      if ((int *)plVar5[3] == (int *)plVar5[4]) {
        iVar4 = (**(code **)(*plVar5 + 0x48))();
      }
      else {
        iVar4 = *(int *)plVar5[3];
      }
      if (iVar4 == -1) {
        *param_1 = 0;
        goto LAB_00bebae0;
      }
      plVar7 = (long *)*param_1;
      bVar1 = plVar7 == (long *)0x0;
      plVar5 = param_3;
      bVar2 = bVar1;
      if (param_3 != (long *)0x0) break;
LAB_00bebabc:
      if (bVar2) goto LAB_00bebb94;
    }
  }
LAB_00bebb94:
  if (plVar7 != (long *)0x0) {
    if ((int *)plVar7[3] == (int *)plVar7[4]) {
      iVar4 = (**(code **)(*plVar7 + 0x48))();
    }
    else {
      iVar4 = *(int *)plVar7[3];
    }
    if (iVar4 != -1) {
      bVar2 = *param_1 == 0;
      goto joined_r0x00bebbe4;
    }
    *param_1 = 0;
  }
  bVar2 = true;
joined_r0x00bebbe4:
  if (param_3 == (long *)0x0) {
    if (!bVar2) {
      return;
    }
  }
  else {
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar4 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar4 = *(int *)param_3[3];
    }
    if (bVar2 != (iVar4 == -1)) {
      return;
    }
  }
  *param_4 = *param_4 | 2;
  return;
}

