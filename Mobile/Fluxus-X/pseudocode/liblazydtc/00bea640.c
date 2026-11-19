/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bea640
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, unsigned int&, tm*, wchar_t const*,
   wchar_t const*) const */

long * __thiscall
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::get
          (time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
           *this,long *param_2,long *param_3,undefined8 param_4,uint *param_5,undefined8 param_6,
          undefined4 *param_7,undefined4 *param_8)

{
  bool bVar1;
  char cVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  int iVar6;
  int iVar7;
  ulong uVar8;
  uint uVar9;
  long lVar10;
  long *plVar11;
  long *plVar12;
  long local_80;
  undefined8 *local_78;
  undefined8 ***local_70;
  undefined8 **local_68;
  
  ios_base::getloc();
  local_78 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_68 = &local_78;
    local_70 = &local_68;
                    /* try { // try from 00bea6bc to 00bea6d3 has its CatchHandler @ 00beab14 */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_70,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_80 + 0x18) - *(long *)(local_80 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar12 = *(long **)(*(long *)(local_80 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar12 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00beab10 to 00beab13 has its CatchHandler @ 00beab14 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_80);
  *param_5 = 0;
  if (param_7 != param_8) {
    while (param_2 != (long *)0x0) {
      if ((int *)param_2[3] == (int *)param_2[4]) {
        iVar7 = (**(code **)(*param_2 + 0x48))(param_2);
      }
      else {
        iVar7 = *(int *)param_2[3];
      }
      bVar1 = iVar7 == -1;
      plVar11 = (long *)0x0;
      if (!bVar1) {
        plVar11 = param_2;
      }
      param_2 = plVar11;
      if (param_3 == (long *)0x0) goto LAB_00bea728;
LAB_00bea750:
      if ((int *)param_3[3] == (int *)param_3[4]) {
        iVar7 = (**(code **)(*param_3 + 0x48))(param_3);
      }
      else {
        iVar7 = *(int *)param_3[3];
      }
      plVar11 = (long *)0x0;
      if (iVar7 != -1) {
        plVar11 = param_3;
      }
      param_3 = plVar11;
      if (bVar1 == (iVar7 == -1)) goto LAB_00beaa4c;
LAB_00bea788:
      cVar2 = (**(code **)(*plVar12 + 0x68))(plVar12,*param_7,0);
      if (cVar2 == '%') {
        if (param_7 + 1 == param_8) goto LAB_00beaa4c;
        uVar3 = (**(code **)(*plVar12 + 0x68))(plVar12,param_7[1],0);
        if (((uVar3 & 0xff) == 0x45) || ((uVar3 & 0xff) == 0x30)) {
          if (param_7 + 2 == param_8) goto LAB_00beaa4c;
          uVar4 = (**(code **)(*plVar12 + 0x68))(plVar12,param_7[2],0);
          lVar10 = 8;
          uVar9 = uVar3;
        }
        else {
          uVar9 = 0;
          lVar10 = 4;
          uVar4 = uVar3;
        }
        param_7 = (undefined4 *)((long)param_7 + lVar10);
        param_2 = (long *)(**(code **)(*(long *)this + 0x48))
                                    (this,param_2,param_3,param_4,param_5,param_6,uVar4,uVar9);
LAB_00bea9a4:
        param_7 = param_7 + 1;
      }
      else {
        uVar8 = (**(code **)(*plVar12 + 0x18))(plVar12,1,*param_7);
        if ((uVar8 & 1) == 0) {
          if ((undefined4 *)param_2[3] == (undefined4 *)param_2[4]) {
            uVar5 = (**(code **)(*param_2 + 0x48))(param_2);
          }
          else {
            uVar5 = *(undefined4 *)param_2[3];
          }
          iVar7 = (**(code **)(*plVar12 + 0x38))(plVar12,uVar5);
          iVar6 = (**(code **)(*plVar12 + 0x38))(plVar12,*param_7);
          if (iVar7 == iVar6) {
            if (param_2[3] == param_2[4]) {
              (**(code **)(*param_2 + 0x50))(param_2);
              goto LAB_00bea9a4;
            }
            param_7 = param_7 + 1;
            param_2[3] = param_2[3] + 4;
          }
          else {
            *param_5 = 4;
          }
        }
        else {
          do {
            param_7 = param_7 + 1;
            if (param_7 == param_8) break;
            uVar8 = (**(code **)(*plVar12 + 0x18))(plVar12,1,*param_7);
          } while ((uVar8 & 1) != 0);
LAB_00bea87c:
          plVar11 = param_2;
          if (param_2 == (long *)0x0) goto LAB_00bea8f0;
LAB_00bea880:
          if ((int *)plVar11[3] == (int *)plVar11[4]) {
            iVar7 = (**(code **)(*plVar11 + 0x48))(plVar11);
          }
          else {
            iVar7 = *(int *)plVar11[3];
          }
          bVar1 = iVar7 == -1;
          param_2 = (long *)0x0;
          if (!bVar1) {
            param_2 = plVar11;
          }
          plVar11 = param_3;
          if (param_3 == (long *)0x0) goto LAB_00bea8f8;
          while( true ) {
            if ((int *)plVar11[3] == (int *)plVar11[4]) {
              iVar7 = (**(code **)(*plVar11 + 0x48))(plVar11);
            }
            else {
              iVar7 = *(int *)plVar11[3];
            }
            param_3 = (long *)0x0;
            if (iVar7 != -1) {
              param_3 = plVar11;
            }
            if (bVar1 == (iVar7 == -1)) break;
            while( true ) {
              if ((undefined4 *)param_2[3] == (undefined4 *)param_2[4]) {
                uVar5 = (**(code **)(*param_2 + 0x48))(param_2);
              }
              else {
                uVar5 = *(undefined4 *)param_2[3];
              }
              uVar8 = (**(code **)(*plVar12 + 0x18))(plVar12,1,uVar5);
              if ((uVar8 & 1) == 0) goto joined_r0x00beaa14;
              if (param_2[3] == param_2[4]) {
                (**(code **)(*param_2 + 0x50))(param_2);
                goto LAB_00bea87c;
              }
              param_2[3] = param_2[3] + 4;
              plVar11 = param_2;
              if (param_2 != (long *)0x0) goto LAB_00bea880;
LAB_00bea8f0:
              bVar1 = true;
              plVar11 = param_3;
              if (param_3 != (long *)0x0) break;
LAB_00bea8f8:
              if (bVar1 != false) goto joined_r0x00beaa14;
            }
          }
        }
      }
joined_r0x00beaa14:
      if ((param_7 == param_8) || (*param_5 != 0)) goto LAB_00beaa54;
    }
    bVar1 = true;
    if (param_3 != (long *)0x0) goto LAB_00bea750;
LAB_00bea728:
    if (!bVar1) goto LAB_00bea788;
LAB_00beaa4c:
    *param_5 = 4;
  }
LAB_00beaa54:
  if (param_2 == (long *)0x0) {
    bVar1 = true;
    plVar12 = (long *)0x0;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
      iVar7 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar7 = *(int *)param_2[3];
    }
    bVar1 = iVar7 == -1;
    plVar12 = (long *)0x0;
    if (!bVar1) {
      plVar12 = param_2;
    }
  }
  if (param_3 == (long *)0x0) {
    if (!bVar1) {
      return plVar12;
    }
  }
  else {
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar7 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar7 = *(int *)param_3[3];
    }
    if (bVar1 != (iVar7 == -1)) {
      return plVar12;
    }
  }
  *param_5 = *param_5 | 2;
  return plVar12;
}

