
/* WARNING: Removing unreachable block (ram,0x0028f878) */
/* WARNING: Removing unreachable block (ram,0x0028f87c) */

void FUN_0079cf94(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long in_x10;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 *puVar4;
  int in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  if (param_4 <= (ulong)(in_x10 - param_1)) {
    func_0x0079a108();
    if (in_stack_00000000 != 1) {
      *unaff_x19 = unaff_x20;
      unaff_x19[1] = in_stack_00000008;
      return;
    }
    param_2 = in_stack_00000008;
    param_3 = in_stack_00000010;
  }
  func_0x007a1f00(param_2,param_3,&UNK_009cdb88);
  ___assert_rtn("aws_lc_0_24_0_d2i_ASN1_OBJECT","a_object.c",0x96,"CBS_data(&cbs) == contents");
  ___assert_rtn("aws_lc_0_24_0_BIO_write_all","bio.c",0x12e,"ret <= write_len");
  lVar3 = func_0x00373eb8(0,0);
  if ((lVar3 != 0) ||
     ((lVar3 = _calloc(1,400), lVar3 != 0 &&
      (iVar2 = func_0x00373f5c(0,lVar3,&DAT_00290080), iVar2 != 0)))) {
    iVar2 = *(int *)(lVar3 + 0x180);
    uVar1 = iVar2 + 1U & 0xf;
    *(uint *)(lVar3 + 0x180) = uVar1;
    if (uVar1 == *(uint *)(lVar3 + 0x184)) {
      *(uint *)(lVar3 + 0x184) = iVar2 + 2U & 0xf;
    }
    puVar4 = (undefined8 *)(lVar3 + (ulong)uVar1 * 0x18);
    _free(puVar4[1]);
    puVar4[1] = 0;
    puVar4[2] = 0;
    *puVar4 = "/aws-lc/crypto/bio/bio.c";
    *(undefined2 *)((long)puVar4 + 0x14) = 0x16a;
    *(undefined4 *)(puVar4 + 2) = 0x11000073;
  }
  return;
}

