/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bec384
 */

/* std::__ndk1::time_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, tm const*, char const*, char const*) const */

long * __thiscall
std::__ndk1::time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
put(time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>> *this,
   long *param_2,undefined8 param_3,undefined4 param_4,undefined8 param_5,undefined1 *param_6,
   undefined1 *param_7)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  undefined1 uVar5;
  undefined1 *puVar6;
  long *plVar7;
  undefined1 *puVar8;
  long *plVar9;
  uint uVar10;
  long local_80;
  undefined8 *local_78;
  undefined8 ***local_70;
  undefined8 **local_68;
  
  ios_base::getloc();
  local_78 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_68 = &local_78;
    local_70 = &local_68;
                    /* try { // try from 00bec3f8 to 00bec40f has its CatchHandler @ 00bec60c */
    __call_once((ulong *)&ctype<char>::id,&local_70,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_80 + 0x18) - *(long *)(local_80 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (plVar9 = *(long **)(*(long *)(local_80 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     plVar9 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bec608 to 00bec60b has its CatchHandler @ 00bec60c */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_80);
LAB_00bec458:
  do {
    while( true ) {
      if (param_6 == param_7) {
        return param_2;
      }
      cVar1 = (**(code **)(*plVar9 + 0x48))(plVar9,*param_6,0);
      if (cVar1 != '%') break;
      puVar8 = param_6 + 1;
      if (puVar8 == param_7) {
        if (param_2 == (long *)0x0) {
          return (long *)0x0;
        }
        puVar6 = (undefined1 *)param_2[6];
        uVar5 = *param_6;
        if (puVar6 != (undefined1 *)param_2[7]) {
LAB_00bec564:
          param_2[6] = (long)(puVar6 + 1);
          *puVar6 = uVar5;
          return param_2;
        }
LAB_00bec5c0:
        iVar4 = (**(code **)(*param_2 + 0x68))(param_2);
        plVar9 = (long *)0x0;
        if (iVar4 != -1) {
          plVar9 = param_2;
        }
        return plVar9;
      }
      uVar2 = (**(code **)(*plVar9 + 0x48))(plVar9,*puVar8,0);
      if (((uVar2 & 0xff) == 0x4f) || ((uVar2 & 0xff) == 0x45)) {
        puVar6 = param_6 + 2;
        if (puVar6 == param_7) {
          if (param_2 == (long *)0x0) {
            return (long *)0x0;
          }
          puVar6 = (undefined1 *)param_2[6];
          uVar5 = *param_6;
          if (puVar6 == (undefined1 *)param_2[7]) {
            iVar4 = (**(code **)(*param_2 + 0x68))(param_2);
            if (iVar4 == -1) {
              return (long *)0x0;
            }
          }
          else {
            param_2[6] = (long)(puVar6 + 1);
            *puVar6 = uVar5;
          }
          puVar6 = (undefined1 *)param_2[6];
          uVar5 = *puVar8;
          if (puVar6 != (undefined1 *)param_2[7]) goto LAB_00bec564;
          goto LAB_00bec5c0;
        }
        uVar3 = (**(code **)(*plVar9 + 0x48))(plVar9,*puVar6,0);
        puVar8 = puVar6;
        uVar10 = uVar2;
        uVar2 = uVar3;
      }
      else {
        uVar10 = 0;
      }
      param_2 = (long *)(**(code **)(*(long *)this + 0x18))
                                  (this,param_2,param_3,param_4,param_5,uVar2,uVar10);
      param_6 = puVar8 + 1;
    }
    plVar7 = param_2;
    if (param_2 == (long *)0x0) {
LAB_00bec454:
      param_6 = param_6 + 1;
      param_2 = plVar7;
      goto LAB_00bec458;
    }
    puVar8 = (undefined1 *)param_2[6];
    uVar5 = *param_6;
    if (puVar8 == (undefined1 *)param_2[7]) {
      iVar4 = (**(code **)(*param_2 + 0x68))(param_2);
      plVar7 = (long *)0x0;
      if (iVar4 != -1) {
        plVar7 = param_2;
      }
      goto LAB_00bec454;
    }
    param_6 = param_6 + 1;
    param_2[6] = (long)(puVar8 + 1);
    *puVar8 = uVar5;
  } while( true );
}

