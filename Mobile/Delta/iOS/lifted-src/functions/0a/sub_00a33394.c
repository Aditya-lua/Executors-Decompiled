/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33394..0xa334a0 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33394_0 {
    char padding_0[192];
    struct st_a33394_0 *field_c0;
    struct st_a33394_0 *field_c8;
    struct st_a33394_0 *field_d0;
    struct st_a33394_0 *field_d8;
} st_a33394_0;

extern long long g_f0d560;
extern st_a33394_0 *g_f12810;
extern st_a33394_0 *g_f12818;

st_a33394_0 * sub_a33394(st_a33394_0 *a0, st_a33394_0 *a1, st_a33394_0 *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a33394_0 *v12;  // x10
    st_a33394_0 *v13;  // x8
    st_a33394_0 **v14;  // x10
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (!a1 && !a0->field_d8)
    {
        return 0;
    }
    else
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        if (a2 && !sub_a7c198(g_f0d560))
            return 0;
        v12 = g_f12810;
        if (a1)
        {
            if (g_f12810)
            {
                do
                {
                    v13 = v12;
                    if (v13->field_d8 == a1)
                        goto LABEL_a33454;
                } while ((v12 = v13->field_c0, v13->field_c0));
            }
            if (a0->field_d8)
                goto LABEL_a33454;
            a0->field_d8 = a1;
        }
        if (g_f12810)
        {
            if (g_f12818 && (v14 = &g_f12818->field_d0, !g_f12818->field_d0))
                goto LABEL_a33488;
        }
        else
        {
            if (!g_f12818)
            {
                v14 = &g_f12810;
LABEL_a33488:
                *v14 = a0;
                g_f12818 = a0;
                a0->field_c8 = g_f12818;
                a0->field_d0 = 0;
                if (!a2)
                    return 1;
                sub_a7c1b4(g_f0d560);
                return 1;
            }
        }
LABEL_a33454:
        if (!a2)
            return 0;
        sub_a7c1b4(g_f0d560);
        return 0;
    }
}
