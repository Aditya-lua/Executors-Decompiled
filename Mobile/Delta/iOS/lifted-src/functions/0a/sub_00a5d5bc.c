/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5d5bc..0xa5d6b0 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5d5bc_0 {
    char padding_0[72];
    struct st_a5d5bc_1 *field_48;
    struct st_a5d5bc_1 *field_50;
    char padding_58[120];
    struct st_a5d5bc_1 *field_d0;
} st_a5d5bc_0;

typedef struct st_a5d5bc_2 {
    unsigned int field_0;
    char padding_4[28];
    struct st_a5d5bc_2 *field_20;
    struct st_a5d5bc_0 *field_28;
} st_a5d5bc_2;

typedef struct st_a5d5bc_1 {
    unsigned long long field_0;
} st_a5d5bc_1;


st_a5d5bc_2 * sub_a5d5bc(st_a5d5bc_2 *a0)
{
    unsigned long v2;  // x8
    unsigned int v3;  // x0
    st_a5d5bc_0 **v4;  // x19
    st_a5d5bc_2 *v5;  // x0
    unsigned int v6;  // x0
    unsigned int v7;  // x0
    unsigned int v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if ((unsigned int)v2 & 49648)
    {
        v3 = (unsigned int)a0->field_28;
        v4 = &a0->field_28;
        if (*(long long *)&a0[1].field_0 && v3)
            (*(long long *)(v3 + 208))();
        v5 = sub_a5ed84(v3);
    }
    else if (v2 >> 11 & 1)
    {
        v8 = (unsigned int)a0->field_28;
        v4 = &a0->field_28;
        if (*(long long *)&a0[1].field_0 && v8)
            (*(long long *)(v8 + 72))();
        v5 = sub_a52760(v8);
    }
    else if ((unsigned int)v2 & 0x3000)
    {
        v6 = (unsigned int)a0->field_28;
        v4 = &a0->field_28;
        if (*(long long *)&a0[1].field_0 && v6)
            (*(long long *)(v6 + 80))();
        v5 = sub_a5431c(v6);
    }
    else if ((unsigned int)v2 & 0x600)
    {
        v7 = (unsigned int)a0->field_28;
        v4 = &a0->field_28;
        if (*(long long *)&a0[1].field_0 && v7)
            (*(long long *)(v7 + 80))();
        v5 = sub_a38220(v7);
    }
    else if (!((unsigned int)v2 & 6))
    {
        return a0;
    }
    else if (!a0->field_28)
    {
        return a0;
    }
    else if (!a0->field_20)
    {
        return a0->field_20;
    }
    *v4 = 0;
    v4[1] = 0;
    return v5;
}
