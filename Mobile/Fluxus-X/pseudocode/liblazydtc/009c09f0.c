/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c09f0
 */

undefined4
tls1_export_keying_material
          (long param_1,undefined8 param_2,undefined8 param_3,void *param_4,size_t param_5,
          void *param_6,size_t param_7,int param_8)

{
  long lVar1;
  undefined8 *puVar2;
  int iVar3;
  undefined4 uVar4;
  void *__dest;
  undefined8 uVar5;
  
  lVar1 = param_7 + 2;
  if (param_8 == 0) {
    lVar1 = 0;
  }
  lVar1 = lVar1 + param_5 + 0x40;
  __dest = CRYPTO_malloc((int)lVar1,"ssl/t1_enc.c",0x2d4);
  if (__dest == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/t1_enc.c",0x30d,"tls1_export_keying_material");
    uVar5 = 0xc0100;
  }
  else {
    memcpy(__dest,param_4,param_5);
    uVar5 = *(undefined8 *)(param_1 + 0x170);
    puVar2 = (undefined8 *)((long)__dest + param_5);
    puVar2[3] = *(undefined8 *)(param_1 + 0x178);
    puVar2[2] = uVar5;
    uVar5 = *(undefined8 *)(param_1 + 0x160);
    puVar2[1] = *(undefined8 *)(param_1 + 0x168);
    *puVar2 = uVar5;
    uVar5 = *(undefined8 *)(param_1 + 0x140);
    puVar2[5] = *(undefined8 *)(param_1 + 0x148);
    puVar2[4] = uVar5;
    uVar5 = *(undefined8 *)(param_1 + 0x150);
    puVar2[7] = *(undefined8 *)(param_1 + 0x158);
    puVar2[6] = uVar5;
    if (param_8 != 0) {
      *(char *)((long)__dest + param_5 + 0x40) = (char)(param_7 >> 8);
      *(char *)((long)puVar2 + 0x41) = (char)param_7;
      if ((param_6 != (void *)0x0) || (param_7 != 0)) {
        memcpy((void *)((long)__dest + param_5 + 0x42),param_6,param_7);
      }
    }
    iVar3 = memcmp(__dest,"client finished",0xf);
    if (iVar3 != 0) {
      iVar3 = memcmp(__dest,"server finished",0xf);
      if (iVar3 != 0) {
        iVar3 = memcmp(__dest,"master secret",0xd);
        if (iVar3 != 0) {
          iVar3 = memcmp(__dest,"extended master secret",0x16);
          if (iVar3 != 0) {
            iVar3 = memcmp(__dest,"key expansion",0xd);
            if (iVar3 != 0) {
              uVar4 = FUN_009c0598(param_1,__dest,lVar1,0,0,0,0,0,0,
                                   *(long *)(param_1 + 0x918) + 0x50,
                                   *(undefined8 *)(*(long *)(param_1 + 0x918) + 8),param_2,param_3,0
                                  );
              goto LAB_009c0be0;
            }
          }
        }
      }
    }
    ERR_new();
    ERR_set_debug("ssl/t1_enc.c",0x309,"tls1_export_keying_material");
    uVar5 = 0x16f;
  }
  ERR_set_error(0x14,uVar5,0);
  uVar4 = 0;
LAB_009c0be0:
  CRYPTO_clear_free(__dest,lVar1,"ssl/t1_enc.c",0x310);
  return uVar4;
}

