/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef5cc
 */

/* cpr::MultiRange::str() const */

void cpr::MultiRange::str(void)

{
  ulong uVar1;
  __ndk1 *this;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  char *pcVar5;
  long *in_x0;
  basic_string_conflict *in_x2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  uint uVar6;
  ulong uVar7;
  byte local_b0 [16];
  void *local_a0;
  byte local_98 [8];
  basic_string_conflict *local_90;
  char *local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  puVar2 = (undefined8 *)in_x0[1];
  if ((undefined8 *)*in_x0 != puVar2) {
    uVar7 = 0;
    uVar6 = 0;
    puVar4 = (undefined8 *)*in_x0;
    while( true ) {
      uStack_78 = puVar4[1];
      local_80 = *puVar4;
                    /* try { // try from 008ef64c to 008ef657 has its CatchHandler @ 008ef760 */
      Range::str();
      uVar1 = (ulong)(uVar6 >> 1);
      if ((uVar6 & 1) != 0) {
        uVar1 = uVar7;
      }
      this = (__ndk1 *)&DAT_002ab32c;
      if (uVar1 != 0) {
        this = (__ndk1 *)&DAT_002a715d;
      }
                    /* try { // try from 008ef66c to 008ef677 has its CatchHandler @ 008ef740 */
      std::__ndk1::operator+(this,(char *)local_b0,in_x2);
      in_x2 = (basic_string_conflict *)(ulong)(local_98[0] >> 1);
      pcVar5 = (char *)((ulong)local_98 | 1);
      if ((local_98[0] & 1) != 0) {
        in_x2 = local_90;
        pcVar5 = local_88;
      }
                    /* try { // try from 008ef690 to 008ef697 has its CatchHandler @ 008ef708 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,pcVar5,(ulong)in_x2);
      if ((local_98[0] & 1) != 0) {
        operator_delete(local_88);
      }
      if ((local_b0[0] & 1) != 0) {
        operator_delete(local_a0);
      }
      if (puVar2 == puVar4 + 2) break;
      uVar6 = (uint)(byte)*in_x8;
      uVar7 = *(ulong *)(in_x8 + 8);
      puVar4 = puVar4 + 2;
    }
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

