
undefined1  [16] FUN_0044f81c(undefined *param_1,undefined8 param_2)

{
  undefined4 in_w8;
  undefined1 auVar1 [16];
  
  switch(in_w8) {
  case 0x2000:
    param_1 = &UNK_0088bffa;
    param_2 = 0xd;
    break;
  case 0x2001:
    param_1 = &UNK_0088c014;
    param_2 = 0xe;
    break;
  case 0x2002:
    param_1 = &UNK_0088c022;
    param_2 = 0x15;
    break;
  case 0x2003:
    param_1 = &UNK_0088c037;
    param_2 = 0x1a;
    break;
  case 0x2004:
    param_1 = &UNK_0088c051;
    goto FUN_00450578;
  case 0x2005:
    param_1 = &UNK_0088c068;
    param_2 = 0x1d;
    break;
  case 0x2006:
    param_1 = &UNK_0088c085;
    param_2 = 0x22;
    break;
  case 0x2007:
    param_1 = &UNK_0088c0a7;
    goto FUN_00450578;
  case 0x2008:
    param_1 = &UNK_0088c0be;
    param_2 = 0x11;
    break;
  case 0x2009:
    param_1 = &UNK_0088c0cf;
    goto LAB_00450540;
  case 0x200a:
    param_1 = &UNK_0088c0e7;
    goto FUN_00450578;
  case 0x200b:
    param_1 = &UNK_0088c0fe;
    goto code_r0x004505a4;
  case 0x200c:
    param_1 = &UNK_0088c114;
    goto code_r0x004505a4;
  case 0x200d:
    param_1 = &UNK_0088c12a;
code_r0x004505a4:
    param_2 = 0x16;
    break;
  case 0x200e:
    param_1 = &UNK_0088c140;
    goto FUN_00450578;
  case 0x200f:
    param_1 = &UNK_0088c157;
    param_2 = 0x1f;
    break;
  case 0x2010:
    param_1 = &UNK_0088c176;
    param_2 = 0x21;
    break;
  case 0x2011:
    param_1 = &UNK_0088c197;
FUN_00450578:
    param_2 = 0x17;
    break;
  case 0x2026:
    param_1 = &UNK_0088c1ae;
LAB_00450540:
    param_2 = 0x18;
  }
  auVar1._8_8_ = param_2;
  auVar1._0_8_ = param_1;
  return auVar1;
}

