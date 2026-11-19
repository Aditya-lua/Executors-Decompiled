/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be9d30
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_white_space(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >&,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, unsigned int&,
   std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_white_space(undefined8 param_1_00,long *param_1,long *param_3,uint *param_4,long param_5)

{
  byte bVar1;
  bool bVar2;
  int iVar3;
  long *plVar4;
  ulong uVar5;
  long *plVar6;
  bool bVar7;
  
  plVar4 = (long *)*param_1;
  if (plVar4 != (long *)0x0) goto LAB_00be9d74;
LAB_00be9dc0:
  bVar2 = true;
  plVar6 = param_3;
  bVar7 = true;
  if (param_3 == (long *)0x0) goto LAB_00be9db0;
LAB_00be9dc8:
  if (plVar6[3] == plVar6[4]) {
    iVar3 = (**(code **)(*plVar6 + 0x48))(plVar6);
    plVar4 = (long *)*param_1;
    param_3 = (long *)0x0;
    if (iVar3 != -1) {
      param_3 = plVar6;
    }
    plVar6 = param_3;
    if (bVar7 != (iVar3 == -1)) goto LAB_00be9e08;
  }
  else {
    param_3 = plVar6;
    if (bVar7 != false) {
LAB_00be9e08:
      do {
        plVar6 = param_3;
        if ((byte *)plVar4[3] == (byte *)plVar4[4]) {
          uVar5 = (**(code **)(*plVar4 + 0x48))();
          uVar5 = uVar5 & 0xff;
          if ((uint)uVar5 >> 7 != 0) goto LAB_00be9e68;
        }
        else {
          bVar1 = *(byte *)plVar4[3];
          uVar5 = (ulong)bVar1;
          if ((char)bVar1 < '\0') {
LAB_00be9e68:
            plVar4 = (long *)*param_1;
            break;
          }
        }
        plVar4 = (long *)*param_1;
        if ((*(ulong *)(*(long *)(param_5 + 0x10) + uVar5 * 8) & 1) == 0) break;
        if (plVar4[3] == plVar4[4]) {
          (**(code **)(*plVar4 + 0x50))();
          plVar4 = (long *)*param_1;
        }
        else {
          plVar4[3] = plVar4[3] + 1;
          plVar4 = (long *)*param_1;
        }
        if (plVar4 == (long *)0x0) goto LAB_00be9dc0;
LAB_00be9d74:
        if (plVar4[3] == plVar4[4]) {
          iVar3 = (**(code **)(*plVar4 + 0x48))();
          if (iVar3 == -1) {
            plVar4 = (long *)0x0;
            *param_1 = 0;
            goto LAB_00be9dc0;
          }
          plVar4 = (long *)*param_1;
          bVar2 = plVar4 == (long *)0x0;
        }
        else {
          bVar2 = false;
        }
        plVar6 = param_3;
        bVar7 = bVar2;
        if (param_3 != (long *)0x0) goto LAB_00be9dc8;
LAB_00be9db0:
        plVar6 = param_3;
        if (bVar2) break;
      } while( true );
    }
  }
  if (plVar4 != (long *)0x0) {
    if (plVar4[3] != plVar4[4]) {
      bVar2 = false;
      goto joined_r0x00be9ebc;
    }
    iVar3 = (**(code **)(*plVar4 + 0x48))();
    if (iVar3 != -1) {
      bVar2 = *param_1 == 0;
      goto joined_r0x00be9ebc;
    }
    *param_1 = 0;
  }
  bVar2 = true;
joined_r0x00be9ebc:
  if (plVar6 == (long *)0x0) {
    if (!bVar2) {
      return;
    }
  }
  else if (plVar6[3] == plVar6[4]) {
    iVar3 = (**(code **)(*plVar6 + 0x48))(plVar6);
    if (bVar2 != (iVar3 == -1)) {
      return;
    }
  }
  else if (bVar2 != false) {
    return;
  }
  *param_4 = *param_4 | 2;
  return;
}

