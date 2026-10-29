/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4d6d8..0xb4d7a4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4d6d8_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[336];
    struct st_b4d6d8_0 *field_168;
    struct st_b4d6d8_0 *field_170;
    long long field_178;
    long long field_180;
} st_b4d6d8_0;

extern char g_10002b0;

st_b4d6d8_0 * sub_b4d6d8(st_b4d6d8_0 *a0)
{
    st_b4d6d8_0 *v5;  // w0
    st_b4d6d8_0 *v6;  // x0
    st_b4d6d8_0 *v7;  // x22
    st_b4d6d8_0 *v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = (st_b4d6d8_0 *)0;
    v5 = (st_b4d6d8_0 *)(unsigned int)sub_a2f9e0();
    v6 = 0;
    if (a0 && v5)
    {
        v6 = a0->field_168;
        if (v6)
        {
            v6 = sub_a3ff7c(v6, &v1, &v0);
            if ((unsigned int)v6)
            {
                v7 = v0;
                v6 = sub_a2f9e0();
                if ((unsigned int)v6)
                {
                    if (a0->field_170 && a0->field_170 != v7)
                        v6 = 0;
                    else
                        v6 = sub_a20124(0, &v1, v7, a0->field_178, a0->field_180, a0->field_10);
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
}
