/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00977b44
 */

/* ix::HttpClient::generateMultipartBoundary() */

void __thiscall ix::HttpClient::generateMultipartBoundary(HttpClient *this)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  char *pcVar4;
  long lVar5;
  ulong uVar6;
  byte *in_x8;
  byte *pbVar7;
  long lVar8;
  uniform_int_distribution<long> local_70;
  undefined7 uStack_6f;
  undefined1 uStack_68;
  undefined4 uStack_67;
  undefined1 uStack_63;
  undefined2 uStack_62;
  void *local_60;
  undefined8 local_58;
  long lStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  in_x8[0] = 0;
  in_x8[1] = 0;
  in_x8[2] = 0;
  in_x8[3] = 0;
  in_x8[4] = 0;
  in_x8[5] = 0;
  in_x8[6] = 0;
  in_x8[7] = 0;
  in_x8[8] = 0;
  in_x8[9] = 0;
  in_x8[10] = 0;
  in_x8[0xb] = 0;
  in_x8[0xc] = 0;
  in_x8[0xd] = 0;
  in_x8[0xe] = 0;
  in_x8[0xf] = 0;
  in_x8[0x10] = 0;
  in_x8[0x11] = 0;
  in_x8[0x12] = 0;
  in_x8[0x13] = 0;
  in_x8[0x14] = 0;
  in_x8[0x15] = 0;
  in_x8[0x16] = 0;
  in_x8[0x17] = 0;
  pcVar4 = operator_new(0x40);
  in_x8[8] = 0x3e;
  in_x8[9] = 0;
  in_x8[10] = 0;
  in_x8[0xb] = 0;
  in_x8[0xc] = 0;
  in_x8[0xd] = 0;
  in_x8[0xe] = 0;
  in_x8[0xf] = 0;
  in_x8[0] = 0x41;
  in_x8[1] = 0;
  in_x8[2] = 0;
  in_x8[3] = 0;
  in_x8[4] = 0;
  in_x8[5] = 0;
  in_x8[6] = 0;
  in_x8[7] = 0;
  builtin_strncpy(pcVar4 + 0x10,"GHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz",0x2e);
  *(char **)(in_x8 + 0x10) = pcVar4;
  pcVar4[0x3e] = '\0';
  builtin_strncpy(pcVar4,"0123456789ABCDEF",0x10);
  if (((DAT_00d20300 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d20300), iVar3 != 0)) {
    uStack_62 = 0;
    local_60 = (void *)0x0;
    local_70 = (uniform_int_distribution<long>)0x18;
    uStack_67 = 0x6d6f646e;
    uStack_6f = 0x72752f7665642f;
    uStack_68 = 0x61;
    uStack_63 = 0;
                    /* try { // try from 00977cb4 to 00977cc3 has its CatchHandler @ 00977d80 */
    std::__ndk1::random_device::random_device
              ((random_device *)&DAT_00d202f8,(basic_string_conflict *)&local_70);
    if (((byte)local_70 & 1) != 0) {
      operator_delete(local_60);
    }
    __cxa_atexit(std::__ndk1::random_device::~random_device,&DAT_00d202f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d20300);
  }
  if (((DAT_00d21690 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d21690), iVar3 != 0)) {
                    /* try { // try from 00977d10 to 00977d1b has its CatchHandler @ 00977d70 */
    uVar6 = std::__ndk1::random_device::operator()((random_device *)&DAT_00d202f8);
    uVar6 = uVar6 & 0xffffffff;
    lVar8 = 1;
    DAT_00d20308 = uVar6;
    do {
      uVar6 = (ulong)((int)lVar8 + ((uint)(uVar6 >> 0x1e) ^ (uint)uVar6) * 0x6c078965);
      (&DAT_00d20308)[lVar8] = uVar6;
      lVar8 = lVar8 + 1;
    } while (lVar8 != 0x270);
    DAT_00d21688 = 0;
    __cxa_guard_release(&DAT_00d21690);
  }
  pbVar7 = *(byte **)(in_x8 + 0x10);
  uVar6 = (ulong)(*in_x8 >> 1);
  if ((*in_x8 & 1) == 0) {
    pbVar7 = in_x8 + 1;
  }
  else {
    uVar6 = *(ulong *)(in_x8 + 8);
  }
  if (1 < (long)uVar6) {
    uStack_68 = 0xff;
    uStack_67 = 0xffffffff;
    uStack_63 = 0xff;
    uStack_62 = 0x7fff;
    local_70 = (uniform_int_distribution<long>)0x0;
    uStack_6f = 0;
    if (pbVar7 < pbVar7 + (uVar6 - 1)) {
      lVar8 = uVar6 - 1;
      do {
        local_58 = 0;
                    /* try { // try from 00977c1c to 00977c2b has its CatchHandler @ 00977dac */
        lStack_50 = lVar8;
        lVar5 = std::__ndk1::uniform_int_distribution<long>::operator()
                          (&local_70,(mersenne_twister_engine *)&DAT_00d20308,
                           (param_type *)&local_58);
        if (lVar5 != 0) {
          bVar1 = *pbVar7;
          *pbVar7 = pbVar7[lVar5];
          pbVar7[lVar5] = bVar1;
        }
        lVar8 = lVar8 + -1;
        pbVar7 = pbVar7 + 1;
      } while (lVar8 != 0);
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

