/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9614f0..0x9615f0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9614f0_2 {
    char padding_0[8];
    struct st_9614f0_0 *field_8;
} st_9614f0_2;

typedef struct st_9614f0_3 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9614f0_2 *field_8;
} st_9614f0_3;

typedef struct st_9614f0_0 {
    char padding_0[192];
    struct st_9614f0_1 *field_c0;
} st_9614f0_0;

typedef struct st_9614f0_1 {
    unsigned long long field_0;
} st_9614f0_1;


st_9614f0_3 * sub_9614f0(st_9614f0_3 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x9
    unsigned long long v13;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_0;
    v13 = a0;
    if (!(unsigned int)v12)
    {
LABEL_961524:
        v13 = sub_95aa30(a0->field_8, *(long long *)(v13 + 1392), v13 + 1376, v13 + 1384, a1, *(long long *)(v13 + 2176));
        if (v13)
            a0->field_8->field_8->field_c0();
    }
    else if (v12 >> 7 & 1)
    {
        v13 = sub_980dc8(a0);
        if (v13)
            goto LABEL_961524;
    }
    else
    {
        v13 = 0;
    }
    return v13;
}
