/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984c78
 */

/* ix::Socket::readLine(std::__ndk1::function<bool ()> const&) */

void ix::Socket::readLine(function *param_1)

{
  uint uVar1;
  ulong *puVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  int *piVar7;
  long in_x1;
  ulong *__src;
  undefined1 *in_x8;
  undefined1 *__dest;
  ulong __n;
  ulong *puVar8;
  ulong uVar9;
  ulong local_78;
  ulong uStack_70;
  ulong *local_68;
  char local_5c [4];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  local_78 = 0;
  uStack_70 = 0;
  local_68 = (ulong *)0x0;
                    /* try { // try from 00984cb4 to 00984cc3 has its CatchHandler @ 00984f00 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  reserve((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
          &local_78,0x40);
  puVar8 = &local_78;
  uVar5 = 0;
LAB_00984d14:
  uVar9 = uVar5;
                    /* try { // try from 00984d24 to 00984d8b has its CatchHandler @ 00984f08 */
  if ((*(long **)(in_x1 + 0x20) == (long *)0x0) ||
     (uVar5 = (**(code **)(**(long **)(in_x1 + 0x20) + 0x30))(), (uVar5 & 1) == 0)) {
    lVar6 = (**(code **)(*(long *)param_1 + 0x30))(param_1,local_5c,1);
    if (lVar6 == 1) {
LAB_00984cdc:
                    /* try { // try from 00984da4 to 00984dab has its CatchHandler @ 00984f04 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      push_back((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                &local_78,local_5c[0]);
      __src = local_68;
      __n = uStack_70;
      uVar5 = uVar9 + 1;
      if (uVar5 < 2) goto LAB_00984d14;
      puVar2 = (ulong *)((ulong)&local_78 | 1);
      if ((local_78 & 1) != 0) {
        puVar2 = local_68;
      }
      if (*(char *)((long)puVar2 + (uVar9 - 1)) == '\r') goto LAB_00984e7c;
      puVar8 = local_68;
      if (*(char *)((long)puVar2 + uVar9) == '\n') goto LAB_00984e7c;
      goto LAB_00984d14;
    }
    if (lVar6 < 0) {
      piVar7 = (int *)__errno();
      if (((*piVar7 == 0x73) || (*piVar7 == 0xb)) && (*(int *)(param_1 + 8) != -1)) {
        iVar4 = poll(true,1,*(int *)(param_1 + 8),param_1 + 0x38);
        uVar1 = (uint)puVar8 & (uint)(iVar4 != 3);
        puVar8 = (ulong *)(ulong)uVar1;
        uVar5 = uVar9;
        if (iVar4 == 3) {
          if (uVar1 != 0) goto LAB_00984cdc;
          goto LAB_00984db0;
        }
        goto LAB_00984d14;
      }
    }
  }
LAB_00984db0:
  __src = local_68;
  __n = uStack_70;
  *in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)(in_x8 + 0x18) = 0;
  if ((local_78 & 1) == 0) goto LAB_00984dc8;
  if (0xffffffffffffffef < uStack_70) {
                    /* try { // try from 00984ee8 to 00984eef has its CatchHandler @ 00984efc */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (0x16 < uStack_70) {
    uVar5 = uStack_70 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00984e44 to 00984e4b has its CatchHandler @ 00984efc */
    __dest = operator_new(uVar5);
    *(ulong *)(in_x8 + 0x10) = __n;
    *(undefined1 **)(in_x8 + 0x18) = __dest;
    *(ulong *)(in_x8 + 8) = uVar5 | 1;
    goto LAB_00984e64;
  }
  __dest = in_x8 + 9;
  in_x8[8] = (char)((int)uStack_70 << 1);
  if (uStack_70 != 0) goto LAB_00984e64;
  goto LAB_00984e6c;
LAB_00984e7c:
  *in_x8 = 1;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)(in_x8 + 0x18) = 0;
  if ((local_78 & 1) == 0) {
LAB_00984dc8:
    *(ulong **)(in_x8 + 0x18) = local_68;
    *(ulong *)(in_x8 + 0x10) = uStack_70;
    *(ulong *)(in_x8 + 8) = local_78;
    goto joined_r0x00984ddc;
  }
  if (0xffffffffffffffef < uStack_70) {
                    /* try { // try from 00984ef0 to 00984ef7 has its CatchHandler @ 00984ef8 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (uStack_70 < 0x17) {
    __dest = in_x8 + 9;
    in_x8[8] = (char)((int)uStack_70 << 1);
    if (uStack_70 != 0) goto LAB_00984e64;
  }
  else {
    uVar5 = uStack_70 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00984ec0 to 00984ec7 has its CatchHandler @ 00984ef8 */
    __dest = operator_new(uVar5);
    *(ulong *)(in_x8 + 0x10) = __n;
    *(undefined1 **)(in_x8 + 0x18) = __dest;
    *(ulong *)(in_x8 + 8) = uVar5 | 1;
LAB_00984e64:
    memcpy(__dest,__src,__n);
  }
LAB_00984e6c:
  __dest[__n] = 0;
joined_r0x00984ddc:
  if ((local_78 & 1) != 0) {
    operator_delete(local_68);
  }
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

