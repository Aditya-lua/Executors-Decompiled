/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bebe38
 */

/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::__get_percent(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >&, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, unsigned int&, std::__ndk1::ctype<wchar_t> const&) const */

void __thiscall
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
__get_percent(undefined8 param_1_00,long *param_1,long *param_3,uint *param_4,long *param_5)

{
  bool bVar1;
  bool bVar2;
  char cVar3;
  undefined4 uVar4;
  int iVar5;
  long *plVar6;
  long *plVar7;
  uint uVar8;
  
  plVar6 = (long *)*param_1;
  if (plVar6 == (long *)0x0) {
LAB_00bebeb4:
    bVar1 = true;
    bVar2 = true;
    if (param_3 != (long *)0x0) goto LAB_00bebebc;
LAB_00bebe90:
    if (bVar2) goto LAB_00bebf0c;
    plVar6 = (long *)0x0;
  }
  else {
    if ((int *)plVar6[3] == (int *)plVar6[4]) {
      iVar5 = (**(code **)(*plVar6 + 0x48))();
    }
    else {
      iVar5 = *(int *)plVar6[3];
    }
    if (iVar5 == -1) {
      *param_1 = 0;
      goto LAB_00bebeb4;
    }
    bVar1 = *param_1 == 0;
    bVar2 = bVar1;
    if (param_3 == (long *)0x0) goto LAB_00bebe90;
LAB_00bebebc:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar5 = *(int *)param_3[3];
    }
    plVar6 = (long *)0x0;
    if (iVar5 != -1) {
      plVar6 = param_3;
    }
    if (bVar1 == (iVar5 == -1)) {
LAB_00bebf0c:
      uVar8 = 6;
      goto LAB_00bec004;
    }
  }
  plVar7 = (long *)*param_1;
  if ((undefined4 *)plVar7[3] == (undefined4 *)plVar7[4]) {
    uVar4 = (**(code **)(*plVar7 + 0x48))();
  }
  else {
    uVar4 = *(undefined4 *)plVar7[3];
  }
  cVar3 = (**(code **)(*param_5 + 0x68))(param_5,uVar4,0);
  if (cVar3 != '%') {
    uVar8 = 4;
    goto LAB_00bec004;
  }
  plVar7 = (long *)*param_1;
  if (plVar7[3] == plVar7[4]) {
    (**(code **)(*plVar7 + 0x50))();
    plVar7 = (long *)*param_1;
    if (plVar7 != (long *)0x0) goto LAB_00bebf7c;
LAB_00bebfd0:
    bVar2 = true;
    if (plVar6 == (long *)0x0) goto LAB_00bebfd8;
LAB_00bebfa4:
    if ((int *)plVar6[3] == (int *)plVar6[4]) {
      iVar5 = (**(code **)(*plVar6 + 0x48))(plVar6);
    }
    else {
      iVar5 = *(int *)plVar6[3];
    }
    if (bVar2 != (iVar5 == -1)) {
      return;
    }
  }
  else {
    plVar7[3] = plVar7[3] + 4;
LAB_00bebf7c:
    if ((int *)plVar7[3] == (int *)plVar7[4]) {
      iVar5 = (**(code **)(*plVar7 + 0x48))();
    }
    else {
      iVar5 = *(int *)plVar7[3];
    }
    if (iVar5 == -1) {
      *param_1 = 0;
      goto LAB_00bebfd0;
    }
    bVar2 = *param_1 == 0;
    if (plVar6 != (long *)0x0) goto LAB_00bebfa4;
LAB_00bebfd8:
    if (!bVar2) {
      return;
    }
  }
  uVar8 = 2;
LAB_00bec004:
  *param_4 = *param_4 | uVar8;
  return;
}

