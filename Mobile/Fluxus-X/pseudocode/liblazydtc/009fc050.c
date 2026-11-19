/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc050
 */

/* WARNING: Removing unreachable block (ram,0x009fc2ac) */

ulong FUN_009fc050(long param_1,undefined8 param_2,ulong param_3,ulong *param_4)

{
  code *pcVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x112,"bio_read_intern");
    uVar5 = 0xc0102;
LAB_009fc114:
    ERR_set_error(0x20,uVar5,0);
  }
  else {
    if ((*(long *)(param_1 + 8) == 0) || (*(long *)(*(long *)(param_1 + 8) + 0x20) == 0)) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_lib.c",0x116,"bio_read_intern");
      ERR_set_error(0x20,0x79,0);
      uVar3 = 0xfffffffe;
      goto LAB_009fc120;
    }
    pcVar1 = *(code **)(param_1 + 0x18);
    if (*(code **)(param_1 + 0x10) == (code *)0x0) {
      if (pcVar1 != (code *)0x0) goto LAB_009fc138;
LAB_009fc168:
      if (*(int *)(param_1 + 0x28) == 0) {
        ERR_new();
        ERR_set_debug("crypto/bio/bio_lib.c",0x120,"bio_read_intern");
        uVar5 = 0x78;
        goto LAB_009fc114;
      }
      uVar4 = (**(code **)(*(long *)(param_1 + 8) + 0x20))(param_1,param_2,param_3,param_4);
      uVar3 = uVar4 & 0xffffffff;
      iVar2 = (int)uVar4;
      if (0 < iVar2) {
        *(ulong *)(param_1 + 0x60) = *(long *)(param_1 + 0x60) + *param_4;
      }
      pcVar1 = *(code **)(param_1 + 0x18);
      if (*(code **)(param_1 + 0x10) == (code *)0x0) {
        if (pcVar1 != (code *)0x0) goto LAB_009fc20c;
LAB_009fc230:
        if ((int)uVar3 < 1) goto LAB_009fc120;
      }
      else {
        if (pcVar1 != (code *)0x0) {
LAB_009fc20c:
          uVar3 = (*pcVar1)(param_1,0x82,param_2,param_3,0,0,uVar3,param_4);
          goto LAB_009fc230;
        }
        if (param_3 >> 0x1f != 0) {
LAB_009fc1d0:
          uVar3 = 0xffffffffffffffff;
          goto LAB_009fc120;
        }
        if (iVar2 < 1) {
          uVar3 = (ulong)iVar2;
        }
        else {
          uVar3 = *param_4;
          if (uVar3 >> 0x1f != 0) goto LAB_009fc1d0;
        }
        uVar3 = (**(code **)(param_1 + 0x10))(param_1,0x82,param_2,param_3 & 0xffffffff,0,uVar3);
        if ((long)uVar3 < 1) goto LAB_009fc230;
        *param_4 = uVar3;
        uVar3 = 1;
      }
      if (*param_4 <= param_3) goto LAB_009fc120;
      ERR_new();
      ERR_set_debug("crypto/bio/bio_lib.c",0x12f,"bio_read_intern");
      uVar5 = 0xc0103;
      goto LAB_009fc114;
    }
    if (pcVar1 != (code *)0x0) {
LAB_009fc138:
      uVar3 = (*pcVar1)(param_1,2,param_2,param_3,0,0,1,0);
LAB_009fc15c:
      if ((int)uVar3 < 1) goto LAB_009fc120;
      goto LAB_009fc168;
    }
    if (param_3 >> 0x1f == 0) {
      uVar3 = (**(code **)(param_1 + 0x10))(param_1,2,param_2,param_3 & 0xffffffff,0,1);
      goto LAB_009fc15c;
    }
  }
  uVar3 = 0xffffffff;
LAB_009fc120:
  return uVar3 & 0xffffffff;
}

