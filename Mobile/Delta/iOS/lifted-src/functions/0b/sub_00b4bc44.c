/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4bc44..0xb4bcf4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4bc44_0 {
    char padding_0[28];
    char field_1c;
} st_b4bc44_0;

extern char g_10002b0;

st_b4bc44_0 * sub_b4bc44(st_b4bc44_0 *a0)
{
    st_b4bc44_0 *v11;  // x0
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x80]
    char v3;  // [bp-0x78]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (a0)
    {
        if (!(a0->field_1c & 1))
        {
            sub_a71bbc(sub_a71670("signature"));
            v4 = v0;
            v5 = v1;
            v6 = v2;
            v11 = sub_b4c2fc(a0, &v3);
            if ((unsigned int)v11)
                v11 = sub_b4c200(a0);
            a0->field_1c = a0->field_1c | 2;
            a0 = v11;
        }
        else
        {
            a0 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v7)
        return a0;
    ___stack_chk_fail();
}
