/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e4aec
 */

undefined8 tls_get_message_body(undefined4 *param_1,undefined8 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  code *pcVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long local_38;
  
  if (param_1[0xb6] != 0x101) {
    lVar6 = *(long *)(param_1 + 0x26);
    lVar8 = *(long *)(param_1 + 0xb4) - lVar6;
    if (lVar8 != 0) {
      lVar10 = *(long *)(param_1 + 0x24);
      do {
        iVar1 = (**(code **)(*(long *)(param_1 + 2) + 0x68))
                          (param_1,0x16,0,lVar10 + lVar6,lVar8,0,&local_38);
        if (iVar1 < 1) {
          uVar5 = 0;
          uVar2 = 0;
          param_1[10] = 3;
          goto LAB_009e4b1c;
        }
        lVar8 = lVar8 - local_38;
        lVar6 = *(long *)(param_1 + 0x26) + local_38;
        *(long *)(param_1 + 0x26) = lVar6;
      } while (lVar8 != 0);
    }
    if (**(char **)(*(long *)(param_1 + 0x22) + 8) == '\x14') {
      lVar8 = *(long *)(*(long *)(param_1 + 2) + 0xc0);
      lVar6 = 0x40;
      if (param_1[0xe] != 0) {
        lVar6 = 0x30;
      }
      lVar10 = 0x48;
      if (param_1[0xe] != 0) {
        lVar10 = 0x38;
      }
      lVar6 = (**(code **)(lVar8 + 0x28))
                        (param_1,*(undefined8 *)(lVar8 + lVar6),*(undefined8 *)(lVar8 + lVar10),
                         param_1 + 0x92);
      *(long *)(param_1 + 0xb2) = lVar6;
      uVar2 = 0;
      if (lVar6 != 0) goto LAB_009e4bec;
LAB_009e4d0c:
      uVar5 = 0;
      goto LAB_009e4b1c;
    }
LAB_009e4bec:
    iVar1 = RECORD_LAYER_is_sslv2_record(param_1 + 0x316);
    if (iVar1 == 0) {
      if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
          (iVar1 = **(int **)(param_1 + 2), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
        iVar1 = param_1[0xb6];
        if ((iVar1 != 4) && (iVar1 != 0x18)) goto LAB_009e4c8c;
      }
      else {
        iVar1 = param_1[0xb6];
LAB_009e4c8c:
        uVar9 = *(ulong *)(param_1 + 0x26);
        if (((iVar1 != 2) ||
            ((uVar9 < 0x26 ||
             (iVar1 = memcmp(hrrrandom,(void *)(*(long *)(*(long *)(param_1 + 0x22) + 8) + 6),0x20),
             iVar1 != 0)))) &&
           (uVar2 = ssl3_finish_mac(param_1,*(undefined8 *)(*(long *)(param_1 + 0x22) + 8),uVar9 + 4
                                   ), (int)uVar2 == 0)) goto LAB_009e4d0c;
      }
      pcVar7 = *(code **)(param_1 + 0x130);
      if (pcVar7 == (code *)0x0) goto LAB_009e4b14;
      uVar3 = *param_1;
      uVar4 = *(undefined8 *)(param_1 + 0x132);
      uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x22) + 8);
      lVar6 = *(long *)(param_1 + 0x26) + 4;
      uVar2 = 0x16;
    }
    else {
      uVar2 = ssl3_finish_mac(param_1,*(undefined8 *)(*(long *)(param_1 + 0x22) + 8),
                              *(undefined8 *)(param_1 + 0x26));
      if ((int)uVar2 == 0) goto LAB_009e4d0c;
      pcVar7 = *(code **)(param_1 + 0x130);
      if (pcVar7 == (code *)0x0) goto LAB_009e4b14;
      lVar6 = *(long *)(param_1 + 0x26);
      uVar4 = *(undefined8 *)(param_1 + 0x132);
      uVar3 = 2;
      uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x22) + 8);
      uVar2 = 0;
    }
    (*pcVar7)(0,uVar3,uVar2,uVar5,lVar6,param_1,uVar4);
  }
LAB_009e4b14:
  uVar5 = *(undefined8 *)(param_1 + 0x26);
  uVar2 = 1;
LAB_009e4b1c:
  *param_2 = uVar5;
  return uVar2;
}

