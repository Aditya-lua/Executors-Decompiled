/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18934..0x18b88 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18934_0 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    char field_80;
    char padding_81[3];
    unsigned long long field_84;
    char padding_8c[76];
    long long field_d8;
    char padding_e0[52];
    unsigned int field_114;
} st_18934_0;

typedef struct st_18934_1 {
    char padding_0[20];
    unsigned long long field_14;
} st_18934_1;

typedef struct st_18934_2 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_18934_2;

extern st_18934_2 g_cbe82c;

long long sub_18934(st_18934_0 *a0, unsigned long long a1)
{
    unsigned long v5;  // x28
    unsigned long long v6;  // x0
    unsigned long v15;  // x25
    long long v16;  // x0
    unsigned long v7;  // x21
    st_18934_1 *v8;  // x24
    unsigned long v9;  // x0
    long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x24
    unsigned long long v13;  // x25
    st_18934_1 *v14;  // x27
    unsigned int v0;  // [bp-0x74]
    unsigned long v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = *(int *)&a0->padding_e0[44];
    sub_16844();
    v5 = *(long long *)(a0->padding_81)[1];
    v6 = sub_19044(&a0->field_80);
    if (!(v6 >> 32 & 1))
        v6 = sub_10714(a0);
    if (!(v6 >> 32 & 1))
    {
        v7 = sub_1dbc8(a0);
    }
    else
    {
        sub_f8d0(a0);
        v8 = sub_18934(a0, 8);
        v1 = v5;
        v2 = *(long long *)&(v8->padding_0)[1];
        v9 = sub_404c(*(long long *)&a0->padding_8c[72], 40);
        v7 = v9;
        sub_599c(v9, &v1, v6, v8);
        if (a0->field_58 == 1)
        {
            v10 = sub_404c(*(long long *)&a0->padding_8c[72], 12);
            sub_87b8(v10, *(long long *)(a0->padding_81)[1]);
            v1 = v7;
            sub_1c9f0(&a0[4].padding_0[32], &v1);
            *(long long *)(sub_12484(&a0[4].padding_0[32], &v1) + 8) = v10;
        }
    }
    v11 = sub_23ea0(&a0->field_80);
    if (!(v11 >> 32 & 1) && !(v11 = sub_10e6c(a0, &g_cbe82c.field_0, a1), v11 >> 32 & 1))
    {
LABEL_18a4c:
        v15 = v7;
    }
    else
    {
        v12 = v11;
        do
        {
            v13 = v12 & 0xffffffff;
            if ((&g_cbe82c.field_0)[2 * v13] <= (unsigned int)a1)
                goto LABEL_18a4c;
            sub_f8d0(a0);
            v14 = sub_18934(a0, (&g_cbe82c.field_0)[1 + 2 * v13]);
            v1 = v5;
            v2 = *(long long *)&(v14->padding_0)[1];
            v15 = sub_404c(*(long long *)&a0->padding_8c[72], 48);
            sub_54e8(v15, &v1, v12, v7, v14);
            if (a0->field_58 == 1)
            {
                v16 = sub_404c(*(long long *)&a0->padding_8c[72], 12);
                sub_87b8(v16, *(long long *)(a0->padding_81)[1]);
                v1 = v15;
                sub_1c9f0(&a0[4].padding_0[32], &v1);
                *(long long *)(sub_12484(&a0[4].padding_0[32], &v1) + 8) = v16;
                v12 = sub_23ea0(&a0->field_80);
                if (v12 >> 32 & 1)
                    continue;
            }
            else
            {
                v12 = sub_23ea0(&a0->field_80);
                if (v12 >> 32 & 1)
                    continue;
            }
            v12 = sub_10e6c(a0, &g_cbe82c.field_0, a1);
        } while ((sub_16844(a0, "expression"), v7 = v15, v12 >> 32 & 1));
    }
    *(unsigned int *)&a0->padding_e0[44] = v0;
    return v15;
}
