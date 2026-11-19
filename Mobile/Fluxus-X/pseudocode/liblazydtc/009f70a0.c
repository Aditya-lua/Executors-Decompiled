/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f70a0
 */

void ossl_asn1_template_free(undefined8 ***param_1,ulong *param_2)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  uint uVar5;
  undefined8 **ppuVar6;
  undefined8 local_48;
  undefined8 ***local_38;
  
  uVar5 = (uint)*param_2;
  uVar1 = uVar5 & 0x1000;
  if ((uVar5 >> 0xc & 1) != 0) {
    local_38 = param_1;
    param_1 = &local_38;
  }
  if ((*param_2 & 6) == 0) {
    uVar4 = (*(code *)param_2[4])();
    ossl_asn1_item_embed_free(param_1,uVar4,uVar1);
  }
  else {
    ppuVar6 = *param_1;
    iVar2 = OPENSSL_sk_num(ppuVar6);
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        local_48 = OPENSSL_sk_value(ppuVar6,iVar2);
        uVar4 = (*(code *)param_2[4])();
        ossl_asn1_item_embed_free(&local_48,uVar4,uVar1);
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(ppuVar6);
      } while (iVar2 < iVar3);
    }
    OPENSSL_sk_free(ppuVar6);
    *param_1 = (undefined8 **)0x0;
  }
  return;
}

