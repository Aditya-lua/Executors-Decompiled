/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a925fc
 */

undefined8 FUN_00a925fc(long param_1,uint param_2,int param_3,undefined8 *param_4)

{
  undefined4 uVar1;
  bool bVar2;
  undefined8 uVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  
  if (0x25 < param_2) {
switchD_00a9263c_caseD_17:
    return 0xffffffff;
  }
  lVar6 = *(long *)(param_1 + 0x78);
  uVar3 = 1;
  switch(param_2) {
  case 0:
    if (lVar6 == 0) {
      lVar6 = Poly1305_ctx_size(1);
      lVar6 = CRYPTO_zalloc(lVar6 + 0xd0,"crypto/evp/e_chacha20_poly1305.c",0x1f9);
      *(long *)(param_1 + 0x78) = lVar6;
      if (lVar6 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/e_chacha20_poly1305.c",0x1fb,"chacha20_poly1305_ctrl");
        uVar3 = 0x86;
LAB_00a9284c:
        ERR_set_error(6,uVar3,0);
        goto LAB_00a92854;
      }
    }
    *(undefined8 *)(lVar6 + 0xa8) = 0;
    *(undefined8 *)(lVar6 + 0xb0) = 0;
    *(undefined8 *)(lVar6 + 0x9c) = 0;
    *(undefined8 *)(lVar6 + 0x94) = 0;
    *(undefined8 *)(lVar6 + 0xb8) = 0;
    *(undefined8 *)(lVar6 + 0xc0) = 0xc00000000;
    *(undefined8 *)(lVar6 + 200) = 0xffffffffffffffff;
    uVar3 = 1;
    break;
  default:
    goto switchD_00a9263c_caseD_17;
  case 8:
    if (lVar6 != 0) {
      lVar4 = Poly1305_ctx_size(1);
      lVar6 = CRYPTO_memdup(lVar6,lVar4 + 0xd0,"crypto/evp/e_chacha20_poly1305.c",0x20d);
      param_4[0xf] = lVar6;
      if (lVar6 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/e_chacha20_poly1305.c",0x20f,"chacha20_poly1305_ctrl");
        uVar3 = 0xad;
        goto LAB_00a9284c;
      }
    }
    goto LAB_00a92820;
  case 9:
    uVar3 = 0;
    if (param_3 - 1U < 0xc) {
      *(int *)(lVar6 + 0xc4) = param_3;
      uVar3 = 1;
    }
    break;
  case 0x10:
    if (0xf < param_3 - 1U) {
      return 0;
    }
    if (*(int *)(param_1 + 0x10) != 0) {
      memcpy(param_4,(void *)(lVar6 + 0x84),(long)param_3);
      return 1;
    }
LAB_00a92854:
    uVar3 = 0;
    break;
  case 0x11:
    if (0xf < param_3 - 1U) {
      return 0;
    }
    if (param_4 != (undefined8 *)0x0) {
      memcpy((void *)(lVar6 + 0x84),param_4,(long)param_3);
      *(int *)(lVar6 + 0xc0) = param_3;
      return 1;
    }
LAB_00a92820:
    uVar3 = 1;
    break;
  case 0x12:
    uVar3 = 0;
    if (param_3 == 0xc) {
      uVar1 = *(undefined4 *)param_4;
      uVar3 = 1;
      *(undefined4 *)(lVar6 + 0x24) = uVar1;
      *(undefined4 *)(lVar6 + 0x78) = uVar1;
      uVar1 = *(undefined4 *)((long)param_4 + 4);
      *(undefined4 *)(lVar6 + 0x28) = uVar1;
      *(undefined4 *)(lVar6 + 0x7c) = uVar1;
      uVar1 = *(undefined4 *)(param_4 + 1);
      *(undefined4 *)(lVar6 + 0x2c) = uVar1;
      *(undefined4 *)(lVar6 + 0x80) = uVar1;
    }
    break;
  case 0x16:
    uVar3 = 0;
    if (param_3 == 0xd) {
      *(undefined8 *)(lVar6 + 0x99) = *(undefined8 *)((long)param_4 + 5);
      *(undefined8 *)(lVar6 + 0x94) = *param_4;
      uVar5 = (uint)CONCAT11(*(undefined1 *)((long)param_4 + 0xb),
                             *(undefined1 *)((long)param_4 + 0xc));
      if (*(int *)(param_1 + 0x10) == 0) {
        bVar2 = uVar5 < 0x10;
        uVar5 = uVar5 - 0x10;
        if (bVar2) {
          return 0;
        }
        *(char *)(lVar6 + 0x9f) = (char)(uVar5 >> 8);
        *(char *)(lVar6 + 0xa0) = (char)uVar5;
      }
      *(ulong *)(lVar6 + 200) = (ulong)uVar5;
      *(undefined4 *)(lVar6 + 0x24) = *(undefined4 *)(lVar6 + 0x78);
      *(undefined4 *)(lVar6 + 0xbc) = 0;
      *(uint *)(lVar6 + 0x28) = *(uint *)(lVar6 + 0x94) ^ *(uint *)(lVar6 + 0x7c);
      *(uint *)(lVar6 + 0x2c) = *(uint *)(lVar6 + 0x98) ^ *(uint *)(lVar6 + 0x80);
      uVar3 = 0x10;
    }
    break;
  case 0x17:
    break;
  case 0x25:
    uVar3 = 1;
    *(undefined4 *)param_4 = *(undefined4 *)(lVar6 + 0xc4);
  }
  return uVar3;
}

