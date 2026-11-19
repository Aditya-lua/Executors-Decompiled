/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf1f80
 */

/* std::__ndk1::money_put<char, std::__ndk1::ostreambuf_iterator<char,
   std::__ndk1::char_traits<char> > >::do_put(std::__ndk1::ostreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, bool, std::__ndk1::ios_base&, char,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&) const */

undefined8 __thiscall
std::__ndk1::money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(undefined8 param_1,undefined8 param_2,byte param_3,long param_4,undefined4 param_5,
      byte *param_6)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  bool bVar4;
  byte bVar5;
  ulong uVar6;
  undefined8 ***__ptr;
  undefined8 uVar7;
  byte *pbVar8;
  ctype *pcVar9;
  undefined8 ***pppuVar10;
  char *local_140;
  char *pcStack_138;
  undefined8 **local_130 [12];
  int local_cc;
  ulong local_c8;
  ulong local_c0;
  void *local_b8;
  undefined8 *local_b0;
  ulong local_a8;
  void *local_a0;
  undefined8 ***local_98;
  undefined8 uStack_90;
  void *local_88;
  char local_7c [4];
  char local_78 [4];
  pattern apStack_74 [4];
  long local_70 [2];
  
  ios_base::getloc();
  local_b0 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_130[0] = &local_b0;
    local_98 = local_130;
                    /* try { // try from 00bf1ff0 to 00bf2007 has its CatchHandler @ 00bf2320 */
    __call_once((ulong *)&ctype<char>::id,&local_98,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_70[0] + 0x18) - *(long *)(local_70[0] + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (pcVar9 = *(ctype **)(*(long *)(local_70[0] + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     pcVar9 == (ctype *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bf228c to 00bf228f has its CatchHandler @ 00bf2320 */
    FUN_00bd8968();
  }
  bVar3 = *param_6;
  uVar1 = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    uVar1 = *(ulong *)(param_6 + 8);
  }
  if (uVar1 == 0) {
    bVar4 = false;
  }
  else {
    pbVar8 = *(byte **)(param_6 + 0x10);
    if ((bVar3 & 1) == 0) {
      pbVar8 = param_6 + 1;
    }
    bVar3 = *pbVar8;
                    /* try { // try from 00bf2058 to 00bf2063 has its CatchHandler @ 00bf2294 */
    bVar5 = (**(code **)(*(long *)pcVar9 + 0x38))(pcVar9,0x2d);
    bVar4 = bVar3 == bVar5;
  }
  local_98 = (undefined8 ***)0x0;
  uStack_90 = 0;
  local_88 = (void *)0x0;
  local_b0 = (undefined8 *)0x0;
  local_a8 = 0;
  local_a0 = (void *)0x0;
  local_c8 = 0;
  local_c0 = 0;
  local_b8 = (void *)0x0;
                    /* try { // try from 00bf208c to 00bf20bb has its CatchHandler @ 00bf2298 */
  __money_put<char>::__gather_info
            ((bool)(param_3 & 1),bVar4,(locale *)local_70,apStack_74,local_78,local_7c,
             (basic_string_conflict *)&local_98,(basic_string_conflict *)&local_b0,
             (basic_string_conflict *)&local_c8,&local_cc);
  bVar3 = *param_6;
  uVar1 = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    uVar1 = *(ulong *)(param_6 + 8);
  }
  if (local_cc < (int)uVar1) {
    uVar6 = (ulong)((byte)local_c8._0_1_ >> 1);
    if ((local_c8 & 1) != 0) {
      uVar6 = local_c0;
    }
    uVar2 = (ulong)((byte)local_b0._0_1_ >> 1);
    if (((ulong)local_b0 & 1) != 0) {
      uVar2 = local_a8;
    }
    uVar6 = (uVar1 * 2 - (long)local_cc) + uVar6 + uVar2 + 1;
  }
  else {
    uVar6 = (ulong)((byte)local_c8._0_1_ >> 1);
    if ((local_c8 & 1) != 0) {
      uVar6 = local_c0;
    }
    uVar2 = (ulong)((byte)local_b0._0_1_ >> 1);
    if (((ulong)local_b0 & 1) != 0) {
      uVar2 = local_a8;
    }
    uVar6 = (long)local_cc + uVar6 + uVar2 + 2;
  }
  if (100 < uVar6) {
    __ptr = malloc(uVar6);
    pppuVar10 = __ptr;
    if (__ptr != (undefined8 ***)0x0) goto LAB_00bf217c;
                    /* try { // try from 00bf2170 to 00bf2173 has its CatchHandler @ 00bf2290 */
    __throw_bad_alloc();
  }
  __ptr = (undefined8 ***)0x0;
  pppuVar10 = local_130;
LAB_00bf217c:
  pbVar8 = *(byte **)(param_6 + 0x10);
  if ((bVar3 & 1) == 0) {
    pbVar8 = param_6 + 1;
  }
                    /* try { // try from 00bf2194 to 00bf21ef has its CatchHandler @ 00bf22d8 */
  __money_put<char>::__format
            ((char *)pppuVar10,&pcStack_138,&local_140,*(uint *)(param_4 + 8),(char *)pbVar8,
             (char *)(pbVar8 + uVar1),pcVar9,bVar4,apStack_74,local_78[0],local_7c[0],
             (basic_string_conflict *)&local_98,(basic_string_conflict *)&local_b0,
             (basic_string_conflict *)&local_c8,local_cc);
  uVar7 = FUN_00be5420(param_2,pppuVar10,pcStack_138,local_140,param_4,param_5);
  if (__ptr != (undefined8 ***)0x0) {
    free(__ptr);
  }
  if ((local_c8 & 1) != 0) {
    operator_delete(local_b8,local_c8 & 0xfffffffffffffffe);
  }
  if (((ulong)local_b0 & 1) != 0) {
    operator_delete(local_a0,(ulong)local_b0 & 0xfffffffffffffffe);
  }
  if (((ulong)local_98 & 1) != 0) {
    operator_delete(local_88,(ulong)local_98 & 0xfffffffffffffffe);
  }
  locale::~locale((locale *)local_70);
  return uVar7;
}

