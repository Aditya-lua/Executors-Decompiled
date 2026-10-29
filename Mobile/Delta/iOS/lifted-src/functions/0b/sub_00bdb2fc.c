/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdb2fc..0xbdb3d8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdb2fc_0 {
    char *field_0;
    char padding_8[8];
    struct st_bdb2fc_1 *field_10;
    struct st_bdb2fc_1 *field_18;
    struct st_bdb2fc_1 *field_20;
    struct st_bdb2fc_1 *field_28;
} st_bdb2fc_0;

typedef struct st_bdb2fc_1 {
    struct st_bdb2fc_1 *field_0;
    char padding_8[528];
    unsigned short field_218;
    unsigned short field_21a;
} st_bdb2fc_1;

extern long long g_efa5b0;
extern long long g_efa5e0;

char * sub_bdb2fc(st_bdb2fc_0 *a0)
{
    char *v2;  // x8
    char *v3;  // x10
    char *v4;  // x11
    char *v5;  // x9
    char *v6;  // x11
    char *v7;  // x9
    char *v8;  // x11
    char *i;  // x10
    char *v10;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if (!a0->field_0)
    {
LABEL_bdb328:
        if (!v2)
            return v2;
    }
    else if (a0->field_0 != v2)
    {
        if (!v2)
        {
            a0 = sub_c73c64(&g_efa5b0);
            goto LABEL_bdb328;
        }
    }
    else
    {
        if (a0->field_10 == a0->field_28)
            return 0;
    }
    v3 = a0->field_20;
    v4 = a0->field_28;
    if (a0->field_28)
    {
        v5 = v2;
    }
    else
    {
        do
        {
            v5 = *(long long *)v2;
            if (!v5)
            {
                sub_c73c64(&g_efa5e0);
                __debugbreak();
            }
        } while ((v3 += 1, v4 = *(short *)&v2[536], v2 = v5, !v4));
    }
    v6 = v4 - 1;
    v7 = v5;
    v8 = v6;
    if (v3)
    {
        v7 = *(long long *)(v5 + 0x8 * v6 + 544);
        i = v3 - 1;
        if (v3 != 1)
        {
            do
            {
                v10 = i;
                v7 = *(long long *)&v7[544 + 8 * *(short *)&v7[538]];
                i = v10 - 1;
            } while (i);
        }
        v8 = *(short *)&v7[538];
    }
    a0->field_18 = v7;
    a0->field_20 = 0;
    a0->field_28 = v8;
    return v5 + 0x18 * v6 + 8;
}
