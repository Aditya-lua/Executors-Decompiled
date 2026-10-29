/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1781c..0xc178e0 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1781c_0 {
    char padding_0[128];
    unsigned long long field_80;
    long long field_88;
    unsigned long long field_90;
} st_c1781c_0;


void sub_c1781c(st_c1781c_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x23
    unsigned long long v17;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_90 + 1;
    while (1)
    {
        v17 = v16 - 1;
        if (v16 == 1)
            break;
        sub_c26704();
        v16 = v17;
    }
    if (a0->field_80)
        _free(a0->field_88);
    sub_c172f8(a0);
    sub_c172f8();
    return;
}
