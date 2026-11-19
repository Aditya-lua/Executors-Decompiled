/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66d70
 */

undefined8
FUN_00b66d70(byte *param_1,undefined8 *param_2,ulong *param_3,undefined8 *param_4,ulong param_5)

{
  int iVar1;
  undefined8 uVar2;
  byte bVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  
  bVar3 = *param_1;
  uVar4 = (uint)bVar3;
  if ((bVar3 >> 1 & 1) == 0) {
    return 0;
  }
  if (*(long *)(param_1 + 0x20) == -1) {
    lVar5 = *(long *)(param_1 + 0x90);
    if ((param_2 != (undefined8 *)0x0) && (uVar6 = 0, param_4 == (undefined8 *)0x0)) {
LAB_00b66e04:
      uVar2 = 1;
      goto LAB_00b66ff0;
    }
    if ((bVar3 >> 2 & 1) != 0) {
      if (param_2 == (undefined8 *)0x0) {
        if (param_4 == (undefined8 *)0x0) {
          uVar2 = (**(code **)(lVar5 + 8))
                            (param_1,param_1 + 0x30,0xf - *(long *)(param_1 + 8),param_5);
          if ((int)uVar2 != 0) {
            bVar3 = *param_1 | 0x10;
            goto LAB_00b66fe0;
          }
        }
        else {
          if ((param_5 != 0) && ((bVar3 >> 4 & 1) == 0)) goto LAB_00b66e10;
          uVar2 = (**(code **)(lVar5 + 0x10))(param_1,param_4,param_5);
          iVar1 = (int)uVar2;
joined_r0x00b66f4c:
          uVar6 = param_5;
          if (iVar1 != 0) goto LAB_00b66e04;
        }
      }
      else {
        if ((bVar3 >> 4 & 1) == 0) {
          uVar2 = (**(code **)(lVar5 + 8))
                            (param_1,param_1 + 0x30,0xf - *(long *)(param_1 + 8),param_5);
          if ((int)uVar2 == 0) goto LAB_00b66fec;
          uVar4 = *param_1 | 0x10;
          *param_1 = (byte)uVar4;
        }
        if ((uVar4 & 1) == 0) {
          if ((uVar4 >> 3 & 1) == 0) goto LAB_00b66e10;
          uVar2 = (**(code **)(lVar5 + 0x20))
                            (param_1,param_4,param_2,param_5,param_1 + 0x40,
                             *(undefined8 *)(param_1 + 0x10));
          if ((int)uVar2 != 0) {
            bVar3 = *param_1 & 0xe3;
            goto LAB_00b66fe0;
          }
        }
        else {
          uVar2 = (**(code **)(lVar5 + 0x18))(param_1,param_4,param_2,param_5,0,0);
          if ((int)uVar2 != 0) {
            bVar3 = *param_1 | 8;
LAB_00b66fe0:
            *param_1 = bVar3;
            uVar6 = param_5;
            goto LAB_00b66e04;
          }
        }
      }
LAB_00b66fec:
      uVar6 = 0;
      goto LAB_00b66ff0;
    }
  }
  else {
    iVar1 = ossl_prov_is_running(0);
    if ((param_2 == param_4) && (param_4 != (undefined8 *)0x0)) {
      uVar6 = 0;
      uVar2 = 0;
      if (iVar1 == 0) goto LAB_00b66ff0;
      lVar5 = *(long *)(param_1 + 0x10);
      if (lVar5 + 8U <= param_5) {
        if ((*param_1 & 1) == 0) {
          uVar2 = *param_4;
        }
        else {
          uVar2 = *(undefined8 *)(param_1 + 0x40);
          *param_4 = uVar2;
          lVar5 = *(long *)(param_1 + 0x10);
        }
        *(undefined8 *)(param_1 + 0x34) = uVar2;
        param_5 = (param_5 - 8) - lVar5;
        uVar2 = (**(code **)(*(long *)(param_1 + 0x90) + 8))
                          (param_1,param_1 + 0x30,0xf - *(long *)(param_1 + 8),param_5);
        if ((int)uVar2 != 0) {
          *param_1 = *param_1 | 0x10;
          uVar2 = (**(code **)(*(long *)(param_1 + 0x90) + 0x10))
                            (param_1,param_1 + 0x40,*(undefined8 *)(param_1 + 0x20));
          if ((int)uVar2 != 0) {
            param_4 = param_4 + 1;
            if ((*param_1 & 1) == 0) {
              uVar2 = (**(code **)(*(long *)(param_1 + 0x90) + 0x20))
                                (param_1,param_4,param_4,param_5,(long)param_4 + param_5,
                                 *(undefined8 *)(param_1 + 0x10));
              iVar1 = (int)uVar2;
              goto joined_r0x00b66f4c;
            }
            uVar2 = (**(code **)(*(long *)(param_1 + 0x90) + 0x18))
                              (param_1,param_4,param_4,param_5,(long)param_4 + param_5,
                               *(undefined8 *)(param_1 + 0x10));
            if ((int)uVar2 != 0) {
              uVar6 = param_5 + *(long *)(param_1 + 0x10) + 8;
              goto LAB_00b66e04;
            }
          }
        }
        goto LAB_00b66fec;
      }
    }
  }
LAB_00b66e10:
  uVar6 = 0;
  uVar2 = 0;
LAB_00b66ff0:
  *param_3 = uVar6;
  return uVar2;
}

