/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86e5c
 */

int FUN_00b86e5c(undefined8 param_1,undefined8 *param_2,uint param_3,uint param_4)

{
  uint uVar1;
  ushort uVar2;
  int iVar3;
  uint uVar4;
  ushort *puVar5;
  
  iVar3 = psa_get_and_lock_key_slot();
  if (iVar3 != 0) {
    return iVar3;
  }
  puVar5 = (ushort *)*param_2;
  uVar2 = *puVar5;
  uVar1 = param_3 & 0xfffffffe;
  if ((uVar2 & 0x7000) != 0x4000) {
    uVar1 = param_3;
  }
  if ((uVar1 & (*(uint *)(puVar5 + 4) ^ 0xffffffff)) == 0) {
    if (param_4 == 0) {
      return 0;
    }
    uVar1 = param_4 & 0xffffff00;
    if ((int)uVar1 < 0x6000900) {
      if (uVar1 == 0x6000200) goto LAB_00b86f18;
      uVar4 = 0x300;
LAB_00b86ef8:
      if ((uVar1 == (uVar4 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b86f18;
LAB_00b86f48:
      if (((param_4 & 0x7f000000) != 0x5000000) &&
         (uVar1 = param_4, (param_4 & 0x7f000000) != 0x3000000)) goto joined_r0x00b86fc8;
      if ((param_4 >> 0xf & 1) == 0) goto LAB_00b86fcc;
    }
    else {
      if (uVar1 != 0x6000900) {
        uVar4 = 0x1300;
        goto LAB_00b86ef8;
      }
LAB_00b86f18:
      if ((param_4 & 0xff) == 0) goto LAB_00b86f48;
      if (0x60008ff < (int)uVar1) {
        if (uVar1 == 0x6000900) goto LAB_00b86fa0;
        uVar4 = 0x1300;
LAB_00b86f80:
        if ((uVar1 == (uVar4 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b86fa0;
        goto LAB_00b86fcc;
      }
      if (uVar1 != 0x6000200) {
        uVar4 = 0x300;
        goto LAB_00b86f80;
      }
LAB_00b86fa0:
      uVar1 = param_4 & 0xff | 0x2000000;
joined_r0x00b86fc8:
      if (uVar1 != 0x20000ff) {
LAB_00b86fcc:
        iVar3 = FUN_00b909c8(uVar2,*(undefined4 *)(puVar5 + 6),param_4);
        if (iVar3 != 0) {
          return 0;
        }
        iVar3 = FUN_00b909c8(uVar2,*(undefined4 *)(puVar5 + 8),param_4);
        if (iVar3 != 0) {
          return 0;
        }
        goto LAB_00b86ffc;
      }
    }
    iVar3 = -0x87;
  }
  else {
LAB_00b86ffc:
    iVar3 = -0x85;
  }
  *param_2 = 0;
  psa_unregister_read_under_mutex(puVar5);
  return iVar3;
}

