/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef388
 */

/* WARNING: Type propagation algorithm not settling */
/* cpr::Range::str() const */

void cpr::Range::str(void)

{
  ulong uVar1;
  long lVar2;
  char *pcVar3;
  undefined8 *in_x0;
  __ndk1 *this;
  undefined8 *puVar4;
  long in_x1;
  long extraout_x1;
  char *in_x2;
  undefined8 *in_x8;
  undefined8 uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_80 [16];
  void *local_70;
  ulong local_68;
  ulong local_60;
  char *local_58;
  ulong local_50;
  undefined8 uStack_48;
  void *local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if ((long)*in_x0 < 0) {
    local_50 = 0;
    uStack_48 = 0;
    local_40 = (void *)0x0;
    this = (__ndk1 *)in_x0[1];
  }
  else {
    std::__ndk1::to_string((__ndk1 *)*in_x0,in_x1);
    this = (__ndk1 *)in_x0[1];
    in_x1 = extraout_x1;
  }
  if ((long)this < 0) {
    local_68 = 0;
    local_60 = 0;
    local_58 = (char *)0x0;
  }
  else {
                    /* try { // try from 008ef3c8 to 008ef3cf has its CatchHandler @ 008ef4ac */
    std::__ndk1::to_string(this,in_x1);
  }
                    /* try { // try from 008ef3ec to 008ef3ff has its CatchHandler @ 008ef4f4 */
  std::__ndk1::operator+((__ndk1 *)&local_50,(basic_string_conflict *)&DAT_002ccc8b,in_x2);
  uVar1 = local_68 >> 1 & 0x7f;
  pcVar3 = (char *)((ulong)&local_68 | 1);
  if ((local_68 & 1) != 0) {
    uVar1 = local_60;
    pcVar3 = local_58;
  }
                    /* try { // try from 008ef420 to 008ef427 has its CatchHandler @ 008ef4bc */
  puVar4 = (undefined8 *)
           std::__ndk1::
           basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                     (local_80,pcVar3,uVar1);
  in_x8[2] = puVar4[2];
  uVar5 = *puVar4;
  in_x8[1] = puVar4[1];
  *in_x8 = uVar5;
  puVar4[1] = 0;
  puVar4[2] = 0;
  *puVar4 = 0;
  if (((byte)local_80[0] & 1) != 0) {
    operator_delete(local_70);
  }
  if ((local_68 & 1) != 0) {
    operator_delete(local_58);
  }
  if ((local_50 & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

