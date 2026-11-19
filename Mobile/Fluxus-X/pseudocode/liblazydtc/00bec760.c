/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bec760
 */

/* std::__ndk1::time_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, tm const*, wchar_t const*,
   wchar_t const*) const */

long * __thiscall
std::__ndk1::
time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::put
          (time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
           *this,long *param_2,undefined8 param_3,undefined4 param_4,undefined8 param_5,int *param_6
          ,int *param_7)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int *piVar5;
  long *plVar6;
  int *piVar7;
  long *plVar8;
  uint uVar9;
  long local_80;
  undefined8 *local_78;
  undefined8 ***local_70;
  undefined8 **local_68;
  
  ios_base::getloc();
  local_78 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_68 = &local_78;
    local_70 = &local_68;
                    /* try { // try from 00bec7d4 to 00bec7eb has its CatchHandler @ 00bec9f8 */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_70,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_80 + 0x18) - *(long *)(local_80 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar8 = *(long **)(*(long *)(local_80 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar8 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bec9f4 to 00bec9f7 has its CatchHandler @ 00bec9f8 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_80);
  do {
    if (param_6 == param_7) {
      return param_2;
    }
    while (cVar1 = (**(code **)(*plVar8 + 0x68))(plVar8,*param_6,0), cVar1 == '%') {
      piVar7 = param_6 + 1;
      if (piVar7 == param_7) {
        if (param_2 == (long *)0x0) {
          return (long *)0x0;
        }
        piVar5 = (int *)param_2[6];
        iVar4 = *param_6;
        if (piVar5 != (int *)param_2[7]) {
LAB_00bec94c:
          *piVar5 = iVar4;
          param_2[6] = (long)(piVar5 + 1);
          goto LAB_00bec9a0;
        }
LAB_00bec98c:
        iVar4 = (**(code **)(*param_2 + 0x68))(param_2);
LAB_00bec9a0:
        plVar8 = (long *)0x0;
        if (iVar4 != -1) {
          plVar8 = param_2;
        }
        return plVar8;
      }
      uVar2 = (**(code **)(*plVar8 + 0x68))(plVar8,*piVar7,0);
      if (((uVar2 & 0xff) == 0x4f) || ((uVar2 & 0xff) == 0x45)) {
        piVar5 = param_6 + 2;
        if (piVar5 == param_7) {
          if (param_2 == (long *)0x0) {
            return (long *)0x0;
          }
          piVar5 = (int *)param_2[6];
          iVar4 = *param_6;
          if (piVar5 == (int *)param_2[7]) {
            iVar4 = (**(code **)(*param_2 + 0x68))(param_2);
          }
          else {
            *piVar5 = iVar4;
            param_2[6] = (long)(piVar5 + 1);
          }
          if (iVar4 == -1) {
            return (long *)0x0;
          }
          piVar5 = (int *)param_2[6];
          iVar4 = *piVar7;
          if (piVar5 != (int *)param_2[7]) goto LAB_00bec94c;
          goto LAB_00bec98c;
        }
        uVar3 = (**(code **)(*plVar8 + 0x68))(plVar8,*piVar5,0);
        piVar7 = piVar5;
        uVar9 = uVar2;
        uVar2 = uVar3;
      }
      else {
        uVar9 = 0;
      }
      param_2 = (long *)(**(code **)(*(long *)this + 0x18))
                                  (this,param_2,param_3,param_4,param_5,uVar2,uVar9);
      param_6 = piVar7 + 1;
      if (param_6 == param_7) {
        return param_2;
      }
    }
    plVar6 = param_2;
    if (param_2 != (long *)0x0) {
      piVar7 = (int *)param_2[6];
      iVar4 = *param_6;
      if (piVar7 == (int *)param_2[7]) {
        iVar4 = (**(code **)(*param_2 + 0x68))(param_2);
      }
      else {
        *piVar7 = iVar4;
        param_2[6] = (long)(piVar7 + 1);
      }
      plVar6 = (long *)0x0;
      if (iVar4 != -1) {
        plVar6 = param_2;
      }
    }
    param_6 = param_6 + 1;
    param_2 = plVar6;
  } while( true );
}

