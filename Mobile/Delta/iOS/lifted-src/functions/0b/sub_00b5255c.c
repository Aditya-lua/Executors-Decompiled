/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5255c..0xb52614 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5255c_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    long long field_20;
    char padding_28[64];
    unsigned int field_68;
    char padding_6c[72];
    unsigned int field_b4;
} st_b5255c_0;


unsigned long long sub_b5255c(st_b5255c_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w0
    unsigned int v13;  // w0
    unsigned int v14;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0->field_68 != 6)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_aafbcc(a0->field_10);
    v13 = sub_a50ac8(a0->field_20);
    v14 = (sub_aafbc4(a0->field_10) & 7) == 1;
    if (!(a1 >> 31 & 1) && (int)(v12 - v13 - v14) >= (int)a1)
    {
        a0->field_b4 = a1;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/signature/rsa_sig.c", 219, "rsa_check_parameters");
    sub_a36abc(57, 112, 0);
    return 0;
}
