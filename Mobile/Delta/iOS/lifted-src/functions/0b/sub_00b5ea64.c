/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ea64..0xb5eb08 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5ea64_0 {
    char padding_0[32];
    char field_20;
    char padding_21[15];
    long long field_30;
    char padding_38[52];
    char field_6c;
    char padding_6d[51];
    unsigned int field_a0;
    char padding_a4[12];
    long long field_b0;
} st_b5ea64_0;


int sub_b5ea64(st_b5ea64_0 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned int v20;  // w8
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    long long i;  // x19
    long long v18;  // x20
    long long v19;  // x21
    unsigned int v0;  // [bp-0x44]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a3)
        return 1;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    i = a3;
    v18 = a2;
    v19 = a1;
    if ((unsigned long long)a3 >= 0x40000000)
        a3 = 0x40000000;
    v20 = a0->field_a0;
    do
    {
        v0 = v20;
        sub_a94484(v18, v19, i, a0->field_b0, &a0->field_20, &v0, __ROL__(a0->field_6c, 31) & 0x80000001 & 1, a0->field_30);
        v20 = v0;
        a0->field_a0 = v20;
        v18 += a3;
        v19 += a3;
        i -= a3;
        if ((unsigned long long)i < (unsigned long long)a3)
            a3 = i;
    } while (i);
    return 1;
}
