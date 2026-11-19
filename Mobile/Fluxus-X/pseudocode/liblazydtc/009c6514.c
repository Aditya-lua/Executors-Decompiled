/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6514
 */

undefined8 FUN_009c6514(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  char *pcVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  int local_48;
  int iStack_44;
  
  if (*(int *)(param_2 + 0xc) == 0) {
    pcVar2 = (char *)0x0;
  }
  else {
    pcVar2 = OBJ_nid2sn(*(int *)(param_2 + 0xc));
  }
  iVar1 = EVP_PKEY_digestsign_supports_digest
                    (param_4,**(undefined8 **)(param_1 + 0x9a8),pcVar2,
                     (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  if (0 < iVar1) {
    if (*(long *)(param_1 + 0x398) == 0) {
      return 1;
    }
    uVar3 = X509_get_signature_info(param_3,&iStack_44,&local_48,0,0);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
    uVar5 = *(ulong *)(param_1 + 0x3a8);
    if (uVar5 != 0) {
      lVar6 = *(long *)(param_1 + 0x398);
      uVar7 = 0;
      do {
        lVar4 = FUN_009c21e4(param_1,*(undefined2 *)(lVar6 + uVar7 * 2));
        if (((lVar4 != 0) && (iStack_44 == *(int *)(lVar4 + 0xc))) &&
           (local_48 == *(int *)(lVar4 + 0x14))) {
          return 1;
        }
        uVar7 = uVar7 + 1;
      } while (uVar7 < uVar5);
    }
  }
  return 0;
}

