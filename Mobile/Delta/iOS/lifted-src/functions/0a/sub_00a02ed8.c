/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02ed8..0xa02fbc (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02ed8_1 {
    char padding_0[96];
    long long field_60;
    char padding_68[48];
    struct st_a02ed8_0 *field_98;
} st_a02ed8_1;

typedef struct st_a02ed8_0 {
    int field_0;
    int field_4;
    char padding_8[16];
    long long field_18;
} st_a02ed8_0;


unsigned long long sub_a02ed8(st_a02ed8_1 *a0, long long a1)
{
    st_a02ed8_0 *v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v5;  // x20
    unsigned long long v6;  // x0
    unsigned long long v7;  // x21
    unsigned long long v9;  // x22
    char v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_98;
    if (a0->field_60)
    {
        v4 = sub_9e5ce8();
        if (!v4)
            return 0;
        v5 = v4;
        v6 = sub_a01fc8(sub_a5ce38(), a0);
        if (!v6)
        {
            sub_9e5cfc(v5);
            return 0;
        }
    }
    else
    {
        v5 = 0;
        v6 = sub_a01fc8();
        if (!v6)
        {
            sub_9e5cfc(0);
            return 0;
        }
    }
    v7 = v6;
    if (v3->field_18)
        sub_a60e34(v7 + 8, sub_a50a58(v3->field_18), 0);
    v9 = sub_a62e5c(0, v7 + 8, 0, v3->field_0, v3->field_4, &v0, v5);
    sub_9e5cfc(v5);
    if ((int)v9 < 1)
    {
        sub_a01fd4(v7);
        return v9;
    }
    sub_a5ab14(a1, 116, v7);
    return v9;
}
