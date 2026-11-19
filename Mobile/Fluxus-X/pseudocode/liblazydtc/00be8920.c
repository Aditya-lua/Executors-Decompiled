/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be8920
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::get(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, std::__ndk1::ios_base&,
   unsigned int&, tm*, char const*, char const*) const */

long * __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
get(time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>> *this,
   long *param_2,long *param_3,undefined8 param_4,uint *param_5,undefined8 param_6,char *param_7,
   char *param_8)

{
  byte bVar1;
  bool bVar2;
  char *pcVar3;
  bool bVar4;
  undefined1 uVar5;
  char cVar6;
  char cVar7;
  uint uVar8;
  uint uVar9;
  int iVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  char *pcVar14;
  long *plVar15;
  long *plVar16;
  long local_80;
  undefined8 *local_78;
  undefined8 ***local_70;
  undefined8 **local_68;
  
  ios_base::getloc();
  local_78 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_68 = &local_78;
    local_70 = &local_68;
                    /* try { // try from 00be899c to 00be89b3 has its CatchHandler @ 00be8de4 */
    __call_once((ulong *)&ctype<char>::id,&local_70,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_80 + 0x18) - *(long *)(local_80 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (plVar16 = *(long **)(*(long *)(local_80 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     plVar16 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be8de0 to 00be8de3 has its CatchHandler @ 00be8de4 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_80);
  *param_5 = 0;
  if (param_7 != param_8) {
    while (param_2 != (long *)0x0) {
      if (param_2[3] == param_2[4]) {
        iVar10 = (**(code **)(*param_2 + 0x48))(param_2);
        bVar4 = iVar10 == -1;
        plVar15 = (long *)0x0;
        if (!bVar4) {
          plVar15 = param_2;
        }
        goto joined_r0x00be8a40;
      }
      bVar4 = false;
      if (param_3 != (long *)0x0) goto LAB_00be8a00;
LAB_00be8a1c:
      if (bVar4 != false) goto LAB_00be8d24;
LAB_00be8a6c:
      cVar6 = (**(code **)(*plVar16 + 0x48))(plVar16,*param_7,0);
      if (cVar6 == '%') {
        if (param_7 + 1 == param_8) goto LAB_00be8d24;
        uVar8 = (**(code **)(*plVar16 + 0x48))(plVar16,param_7[1],0);
        if (((uVar8 & 0xff) == 0x45) || ((uVar8 & 0xff) == 0x30)) {
          if (param_7 + 2 == param_8) goto LAB_00be8d24;
          uVar9 = (**(code **)(*plVar16 + 0x48))(plVar16,param_7[2],0);
          lVar12 = 2;
          uVar11 = uVar8;
        }
        else {
          uVar11 = 0;
          lVar12 = 1;
          uVar9 = uVar8;
        }
        param_7 = param_7 + lVar12;
        param_2 = (long *)(**(code **)(*(long *)this + 0x48))
                                    (this,param_2,param_3,param_4,param_5,param_6,uVar9,uVar11);
LAB_00be8b60:
        param_7 = param_7 + 1;
      }
      else {
        if ((-1 < (long)*param_7) && ((*(ulong *)(plVar16[2] + (long)*param_7 * 8) & 1) != 0)) {
          pcVar14 = param_7;
          do {
            pcVar14 = pcVar14 + 1;
            pcVar3 = param_8;
            if (pcVar14 == param_8) goto joined_r0x00be8c30;
            pcVar3 = pcVar14;
            if ((long)*pcVar14 < 0) goto joined_r0x00be8c30;
            param_7 = param_7 + 1;
          } while ((*(ulong *)(plVar16[2] + (long)*pcVar14 * 8) & 1) != 0);
LAB_00be8c40:
          if (param_2 == (long *)0x0) goto LAB_00be8d18;
LAB_00be8c44:
          if (param_2[3] == param_2[4]) {
            iVar10 = (**(code **)(*param_2 + 0x48))(param_2);
            bVar4 = iVar10 == -1;
            plVar15 = (long *)0x0;
            if (!bVar4) {
              plVar15 = param_2;
            }
          }
          else {
            bVar4 = false;
            plVar15 = param_2;
          }
          param_2 = plVar15;
          plVar15 = param_3;
          bVar2 = bVar4;
          if (param_3 == (long *)0x0) goto LAB_00be8cb8;
          do {
            param_3 = plVar15;
            if (plVar15[3] == plVar15[4]) {
              iVar10 = (**(code **)(*plVar15 + 0x48))(plVar15);
              param_3 = (long *)0x0;
              if (iVar10 != -1) {
                param_3 = plVar15;
              }
              if (bVar4 == (iVar10 == -1)) goto LAB_00be8bf8;
            }
            else if (bVar4 == false) goto LAB_00be8bf8;
            while( true ) {
              if ((byte *)param_2[3] == (byte *)param_2[4]) {
                uVar13 = (**(code **)(*param_2 + 0x48))(param_2);
                uVar13 = uVar13 & 0xff;
                if ((uint)uVar13 >> 7 != 0) goto LAB_00be8bf8;
              }
              else {
                bVar1 = *(byte *)param_2[3];
                uVar13 = (ulong)bVar1;
                if ((char)bVar1 < '\0') goto LAB_00be8bf8;
              }
              if ((*(ulong *)(plVar16[2] + uVar13 * 8) & 1) == 0) goto LAB_00be8bf8;
              if (param_2[3] != param_2[4]) {
                param_2[3] = param_2[3] + 1;
                goto LAB_00be8c40;
              }
              (**(code **)(*param_2 + 0x50))(param_2);
              pcVar3 = param_7;
joined_r0x00be8c30:
              param_7 = pcVar3;
              if (param_2 != (long *)0x0) goto LAB_00be8c44;
LAB_00be8d18:
              bVar4 = true;
              bVar2 = true;
              plVar15 = param_3;
              if (param_3 != (long *)0x0) break;
LAB_00be8cb8:
              if (bVar2) goto LAB_00be8bf8;
            }
          } while( true );
        }
        if ((byte *)param_2[3] == (byte *)param_2[4]) {
          uVar8 = (**(code **)(*param_2 + 0x48))(param_2);
        }
        else {
          uVar8 = (uint)*(byte *)param_2[3];
        }
        cVar6 = (**(code **)(*plVar16 + 0x18))(plVar16,uVar8);
        cVar7 = (**(code **)(*plVar16 + 0x18))(plVar16,*param_7);
        if (cVar6 == cVar7) {
          if (param_2[3] == param_2[4]) {
            (**(code **)(*param_2 + 0x50))(param_2);
            goto LAB_00be8b60;
          }
          param_7 = param_7 + 1;
          param_2[3] = param_2[3] + 1;
        }
        else {
          *param_5 = 4;
        }
      }
LAB_00be8bf8:
      if ((param_7 == param_8) || (*param_5 != 0)) goto LAB_00be8d2c;
    }
    bVar4 = true;
    plVar15 = param_2;
joined_r0x00be8a40:
    param_2 = plVar15;
    if (param_3 == (long *)0x0) goto LAB_00be8a1c;
LAB_00be8a00:
    if (param_3[3] == param_3[4]) {
      iVar10 = (**(code **)(*param_3 + 0x48))(param_3);
      plVar15 = (long *)0x0;
      if (iVar10 != -1) {
        plVar15 = param_3;
      }
      param_3 = plVar15;
      if (bVar4 == (iVar10 == -1)) goto LAB_00be8d24;
      goto LAB_00be8a6c;
    }
    if (bVar4) goto LAB_00be8a6c;
LAB_00be8d24:
    *param_5 = 4;
  }
LAB_00be8d2c:
  plVar16 = param_2;
  if (param_2 == (long *)0x0) {
    uVar5 = true;
  }
  else if (param_2[3] == param_2[4]) {
    iVar10 = (**(code **)(*param_2 + 0x48))(param_2);
    uVar5 = iVar10 == -1;
    plVar16 = (long *)0x0;
    if (!(bool)uVar5) {
      plVar16 = param_2;
    }
  }
  else {
    uVar5 = false;
  }
  if (param_3 == (long *)0x0) {
    if ((bool)uVar5 == false) {
      return plVar16;
    }
  }
  else if (param_3[3] == param_3[4]) {
    iVar10 = (**(code **)(*param_3 + 0x48))(param_3);
    if ((bool)uVar5 != (iVar10 == -1)) {
      return plVar16;
    }
  }
  else if ((bool)uVar5) {
    return plVar16;
  }
  *param_5 = *param_5 | 2;
  return plVar16;
}

