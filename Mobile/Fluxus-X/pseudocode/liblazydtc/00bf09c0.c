/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf09c0
 */

/* std::__ndk1::money_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, bool, std::__ndk1::ios_base&, unsigned int&,
   std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >&) const */

long * __thiscall
std::__ndk1::
money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_get(undefined8 param_1,long *param_2,long *param_3,uint param_4,long param_5,uint *param_6,
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
      *param_7)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar1;
  int *piVar2;
  bool bVar3;
  undefined4 uVar4;
  int iVar5;
  ulong uVar6;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar7;
  long *plVar8;
  ulong uVar9;
  long local_228;
  long local_220;
  int *local_218;
  code *local_210;
  int local_208 [100];
  long *local_78;
  undefined8 *local_70;
  undefined ***local_68;
  undefined8 **local_48;
  
  local_218 = local_208;
  local_210 = __do_nothing;
  local_78 = param_2;
                    /* try { // try from 00bf0a0c to 00bf0a17 has its CatchHandler @ 00bf0ca8 */
  ios_base::getloc();
  local_70 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_48 = &local_70;
    local_68 = (undefined ***)&local_48;
                    /* try { // try from 00bf0a44 to 00bf0a5b has its CatchHandler @ 00bf0cbc */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_228 + 0x18) - *(long *)(local_228 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar8 = *(long **)(*(long *)(local_228 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar8 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bf0c98 to 00bf0c9b has its CatchHandler @ 00bf0cbc */
    FUN_00bd8968();
  }
  local_48 = (undefined8 **)((ulong)local_48 & 0xffffffffffffff00);
                    /* try { // try from 00bf0a88 to 00bf0b4b has its CatchHandler @ 00bf0cb8 */
  uVar6 = __do_get(&local_78,param_3,param_4 & 1,&local_228,*(undefined4 *)(param_5 + 8),param_6,
                   &local_48,plVar8,&local_218,&local_220,&local_78);
  if ((uVar6 & 1) != 0) {
    if (((byte)*param_7 & 1) == 0) {
      *(undefined4 *)(param_7 + 4) = 0;
      *param_7 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  )0x0;
    }
    else {
      **(undefined4 **)(param_7 + 0x10) = 0;
      *(undefined8 *)(param_7 + 8) = 0;
    }
    if ((char)local_48 == '\x01') {
      uVar4 = (**(code **)(*plVar8 + 0x58))(plVar8,0x2d);
      bVar1 = *param_7;
      if (((byte)bVar1 & 1) == 0) {
        if (bVar1 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      )0x8) {
          uVar9 = 4;
LAB_00bf0b2c:
          uVar6 = uVar9;
          basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
          __grow_by(param_7,uVar6,1,uVar6,uVar6,0,0);
          goto LAB_00bf0b50;
        }
        uVar6 = (ulong)((byte)bVar1 >> 1);
        pbVar7 = param_7 + 4;
        *param_7 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    )((char)bVar1 + 2);
      }
      else {
        uVar6 = *(ulong *)(param_7 + 8);
        uVar9 = (*(ulong *)param_7 & 0xfffffffffffffffe) - 1;
        if (uVar6 == uVar9) goto LAB_00bf0b2c;
LAB_00bf0b50:
        pbVar7 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                   **)(param_7 + 0x10);
        *(ulong *)(param_7 + 8) = uVar6 + 1;
      }
      *(undefined4 *)(pbVar7 + uVar6 * 4) = uVar4;
      *(undefined4 *)(pbVar7 + uVar6 * 4 + 4) = 0;
    }
                    /* try { // try from 00bf0b80 to 00bf0b8b has its CatchHandler @ 00bf0ca0 */
    iVar5 = (**(code **)(*plVar8 + 0x58))(plVar8,0x30);
    for (piVar2 = local_218; (piVar2 < (int *)(local_220 + -4) && (*piVar2 == iVar5));
        piVar2 = piVar2 + 1) {
    }
                    /* try { // try from 00bf0bb4 to 00bf0bbb has its CatchHandler @ 00bf0c9c */
    FUN_00bf0ce8(param_7);
  }
  if (local_78 == (long *)0x0) {
LAB_00bf0c08:
    bVar3 = true;
    if (param_3 == (long *)0x0) goto LAB_00bf0bfc;
LAB_00bf0c10:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar5 = *(int *)param_3[3];
    }
    if (bVar3 != (iVar5 == -1)) goto LAB_00bf0c50;
  }
  else {
    if ((int *)local_78[3] == (int *)local_78[4]) {
                    /* try { // try from 00bf0be0 to 00bf0c33 has its CatchHandler @ 00bf0cb8 */
      iVar5 = (**(code **)(*local_78 + 0x48))();
    }
    else {
      iVar5 = *(int *)local_78[3];
    }
    if (iVar5 == -1) {
      local_78 = (long *)0x0;
      goto LAB_00bf0c08;
    }
    bVar3 = local_78 == (long *)0x0;
    if (param_3 != (long *)0x0) goto LAB_00bf0c10;
LAB_00bf0bfc:
    if (!bVar3) goto LAB_00bf0c50;
  }
  *param_6 = *param_6 | 2;
LAB_00bf0c50:
  plVar8 = local_78;
  locale::~locale((locale *)&local_228);
  piVar2 = local_218;
  local_218 = (int *)0x0;
  if (piVar2 != (int *)0x0) {
                    /* try { // try from 00bf0c6c to 00bf0c6f has its CatchHandler @ 00bf0ca4 */
    (*local_210)();
  }
  return plVar8;
}

