/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53e44..0xb53f18 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53e44_0 {
    char padding_0[344];
    long long field_158;
    struct st_b53e44_0 *field_160;
    struct st_b53e44_0 *field_168;
} st_b53e44_0;

extern char g_10002b0;

st_b53e44_0 * sub_b53e44(st_b53e44_0 *a0, unsigned long a1, unsigned long a2)
{
    st_b53e44_0 *v5;  // x0
    unsigned long long v6;  // 4118
    st_b53e44_0 *v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = (st_b53e44_0 *)0;
    v5 = a0;
    if (v5)
    {
        if (!a0->field_160 || (v6 = arm64g_calculate_condition(33, sub_a50ac8(a0->field_158) - 65, 64, 0), !(v6 & 1)))
        {
LABEL_b53e98:
            v5 = 0;
        }
        else
        {
            v5 = sub_b54464(a0);
            if ((unsigned int)v5 && (v5 = sub_a3ff7c(a0->field_160, &v1, &v0), (unsigned int)v5))
            {
                if (a0->field_168 && a0->field_168 != v0)
                    goto LABEL_b53e98;
                v5 = sub_ac8dd8(&v1);
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
