/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfbcd8
 */

/* std::__ndk1::collate_byname<char>::do_transform(char const*, char const*) const */

void std::__ndk1::collate_byname<char>::do_transform(char *param_1,char *param_2)

{
  ulong uVar1;
  size_t __n;
  char *in_x2;
  ulong *in_x8;
  ulong uVar2;
  byte *pbVar3;
  char *pcVar4;
  undefined8 local_58;
  ulong local_50;
  char *local_48;
  
  uVar2 = (long)in_x2 - (long)param_2;
  if (0xfffffffffffffff7 < uVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (uVar2 < 0x17) {
    pcVar4 = (char *)((ulong)&local_58 | 1);
    local_58 = CONCAT71(local_58._1_7_,(char)((int)uVar2 << 1));
  }
  else {
    uVar1 = 0x1a;
    if ((uVar2 | 7) != 0x17) {
      uVar1 = (uVar2 | 7) + 1;
    }
    pcVar4 = operator_new(uVar1);
    local_58 = uVar1 | 1;
    local_50 = uVar2;
    local_48 = pcVar4;
  }
  if (in_x2 != param_2) {
    memcpy(pcVar4,param_2,uVar2);
  }
  pcVar4[uVar2] = '\0';
  pcVar4 = local_48;
  if ((local_58 & 1) == 0) {
    pcVar4 = (char *)((long)&local_58 + 1);
  }
                    /* try { // try from 00bfbd90 to 00bfbddb has its CatchHandler @ 00bfbeac */
  __n = strxfrm_l((char *)0x0,pcVar4,0,*(__locale_t *)(param_1 + 0x10));
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bfbe70 to 00bfbe73 has its CatchHandler @ 00bfbeac */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    pbVar3 = (byte *)((long)in_x8 + 1);
    *(byte *)in_x8 = (byte)((int)__n << 1);
    if (__n == 0) goto LAB_00bfbdfc;
  }
  else {
    uVar2 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar2 = (__n | 7) + 1;
    }
    pbVar3 = operator_new(uVar2);
    in_x8[1] = __n;
    in_x8[2] = (ulong)pbVar3;
    *in_x8 = uVar2 | 1;
  }
  memset(pbVar3,0,__n);
LAB_00bfbdfc:
  pbVar3[__n] = 0;
  uVar2 = in_x8[1];
  pbVar3 = (byte *)in_x8[2];
  pcVar4 = (char *)((ulong)&local_58 | 1);
  if ((local_58 & 1) != 0) {
    pcVar4 = local_48;
  }
  if (((byte)*in_x8 & 1) == 0) {
    pbVar3 = (byte *)((long)in_x8 + 1);
    uVar2 = (ulong)(byte)((byte)*in_x8 >> 1);
  }
                    /* try { // try from 00bfbe30 to 00bfbe37 has its CatchHandler @ 00bfbe74 */
  strxfrm_l((char *)pbVar3,pcVar4,uVar2 + 1,*(__locale_t *)(param_1 + 0x10));
  if ((local_58 & 1) != 0) {
    operator_delete(local_48,local_58 & 0xfffffffffffffffe);
  }
  return;
}

