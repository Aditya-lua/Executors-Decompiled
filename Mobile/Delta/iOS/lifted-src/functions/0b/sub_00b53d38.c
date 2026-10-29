/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53d38..0xb53e44 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53d38_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[328];
    struct st_b53d38_0 *field_160;
    struct st_b53d38_0 *field_168;
} st_b53d38_0;

extern char g_10002b0;

st_b53d38_0 * sub_b53d38(st_b53d38_0 *a0, st_b53d38_0 *a1, unsigned long long *a2, unsigned long a3)
{
    st_b53d38_0 *v6;  // x0
    st_b53d38_0 *v7;  // x21
    unsigned long v8;  // x8
    st_b53d38_0 *v0;  // [bp-0x90]
    char v1;  // [bp-0x8c]
    char v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = (st_b53d38_0 *)0;
    v6 = a0;
    if (v6)
    {
        if (!a0->field_160)
        {
LABEL_b53df4:
            v6 = 0;
        }
        else if (a1)
        {
            v6 = sub_b54464(a0);
            if ((unsigned int)v6 && (v6 = sub_a3ff7c(a0->field_160, &v2, &v0), (unsigned int)v6))
            {
                v7 = v0;
                if (a3 < sub_a16b20(a0->field_10) || a0->field_168 && a0->field_168 != v7 || (int)sub_ac8c70(&v2, v7, a1, &v1, a0->field_10) < 1)
                    goto LABEL_b53df4;
                v8 = v1;
LABEL_b53e08:
                *a2 = v8;
                v6 = 1;
            }
        }
        else
        {
            v8 = sub_a16b20(a0->field_10);
            goto LABEL_b53e08;
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
