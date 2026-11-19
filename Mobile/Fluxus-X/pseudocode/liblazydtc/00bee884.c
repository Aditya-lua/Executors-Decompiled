/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bee884
 */

/* std::__ndk1::money_get<char, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> > >::do_get(std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, bool, std::__ndk1::ios_base&, unsigned int&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
   const */

long * __thiscall
std::__ndk1::money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_get(undefined8 param_1,long *param_2,long *param_3,uint param_4,long param_5,uint *param_6,
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_7)

{
  bool bVar1;
  char cVar2;
  byte bVar3;
  int iVar4;
  ulong uVar5;
  byte *pbVar6;
  byte *pbVar7;
  long *plVar8;
  long local_100;
  long local_f8;
  byte *local_f0;
  code *local_e8;
  byte local_dc [100];
  long *local_78;
  undefined8 *local_70;
  undefined8 ***local_68;
  undefined8 **local_48;
  
  local_f0 = local_dc;
  local_e8 = __do_nothing;
  local_78 = param_2;
                    /* try { // try from 00bee8d0 to 00bee8db has its CatchHandler @ 00beeb00 */
  ios_base::getloc();
  local_70 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_48 = &local_70;
    local_68 = &local_48;
                    /* try { // try from 00bee908 to 00bee91f has its CatchHandler @ 00beeb14 */
    __call_once((ulong *)&ctype<char>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_100 + 0x18) - *(long *)(local_100 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (plVar8 = *(long **)(*(long *)(local_100 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     plVar8 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00beeaf0 to 00beeaf3 has its CatchHandler @ 00beeb14 */
    FUN_00bd8968();
  }
  local_48 = (undefined8 **)((ulong)local_48 & 0xffffffffffffff00);
                    /* try { // try from 00bee94c to 00bee9c7 has its CatchHandler @ 00beeb10 */
  uVar5 = __do_get(&local_78,param_3,param_4 & 1,&local_100,*(undefined4 *)(param_5 + 8),param_6,
                   &local_48,plVar8,&local_f0,&local_f8,&local_78);
  if ((uVar5 & 1) != 0) {
    if (((byte)*param_7 & 1) == 0) {
      *(undefined2 *)param_7 = 0;
    }
    else {
      **(undefined1 **)(param_7 + 0x10) = 0;
      *(undefined8 *)(param_7 + 8) = 0;
    }
    if ((char)local_48 == '\x01') {
      cVar2 = (**(code **)(*plVar8 + 0x38))(plVar8,0x2d);
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                (param_7,cVar2);
    }
                    /* try { // try from 00bee9d0 to 00bee9db has its CatchHandler @ 00beeaf8 */
    bVar3 = (**(code **)(*plVar8 + 0x38))(plVar8,0x30);
    pbVar7 = (byte *)(local_f8 + -1);
    pbVar6 = local_f0;
    if (local_f0 < pbVar7) {
      do {
        if (*pbVar6 != bVar3) goto LAB_00beea08;
        pbVar6 = pbVar6 + 1;
      } while (pbVar6 != pbVar7);
      pbVar6 = pbVar7;
    }
LAB_00beea08:
                    /* try { // try from 00beea08 to 00beea0f has its CatchHandler @ 00beeaf4 */
    FUN_00beeb40(param_7,pbVar6);
  }
  if (local_78 == (long *)0x0) {
LAB_00beea60:
    bVar1 = true;
    if (param_3 != (long *)0x0) goto LAB_00beea68;
LAB_00beea54:
    if (!bVar1) goto LAB_00beea84;
  }
  else {
    if (local_78[3] == local_78[4]) {
                    /* try { // try from 00beea38 to 00beea3b has its CatchHandler @ 00beeb10 */
      iVar4 = (**(code **)(*local_78 + 0x48))();
      if (iVar4 == -1) {
        local_78 = (long *)0x0;
        goto LAB_00beea60;
      }
      bVar1 = local_78 == (long *)0x0;
    }
    else {
      bVar1 = false;
    }
    if (param_3 == (long *)0x0) goto LAB_00beea54;
LAB_00beea68:
    if (param_3[3] == param_3[4]) {
                    /* try { // try from 00beead4 to 00beeadb has its CatchHandler @ 00beeb10 */
      iVar4 = (**(code **)(*param_3 + 0x48))(param_3);
      if (bVar1 != (iVar4 == -1)) goto LAB_00beea84;
    }
    else if (bVar1 != false) goto LAB_00beea84;
  }
  *param_6 = *param_6 | 2;
LAB_00beea84:
  plVar8 = local_78;
  locale::~locale((locale *)&local_100);
  pbVar6 = local_f0;
  local_f0 = (byte *)0x0;
  if (pbVar6 != (byte *)0x0) {
                    /* try { // try from 00beeaa0 to 00beeaa3 has its CatchHandler @ 00beeafc */
    (*local_e8)();
  }
  return plVar8;
}

