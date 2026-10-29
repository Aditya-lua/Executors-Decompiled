/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9765e4..0x9766cc (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9765e4_1 {
    struct st_9765e4_0 *field_0;
    struct st_9765e4_0 *field_8;
    char padding_10[8];
    struct st_9765e4_0 *field_18;
    char padding_20[36];
    struct st_9765e4_0 *field_44;
} st_9765e4_1;

typedef struct st_9765e4_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_9765e4_0 *field_10;
    struct st_9765e4_0 *field_18;
    char padding_20[8];
    struct st_9765e4_0 *field_28;
    char padding_30[36];
    struct st_9765e4_0 *field_54;
} st_9765e4_0;


void sub_9765e4(st_9765e4_0 **a0, st_9765e4_0 *a1)
{
    st_9765e4_0 *v2;  // x8
    st_9765e4_0 *v3;  // x9
    st_9765e4_1 *v4;  // x8
    st_9765e4_0 *v5;  // x8
    st_9765e4_0 *v6;  // x10
    st_9765e4_0 *v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(int *)&(a1->padding_30)[1] == 1)
    {
        if (a0[2] == a1)
            a0[2] = a1->field_18;
        v5 = a1;
        v3 = v5->field_10;
        v4 = &v5->field_10;
        if (a0[3] == a1)
            a0[3] = v3;
    }
    else if (!*(int *)&(a1->padding_30)[1])
    {
        if (*a0 == a1)
            *a0 = a1->field_18;
        v2 = a1;
        v3 = v2->field_10;
        v4 = &v2->field_10;
        if (a0[1] == a1)
            a0[1] = v3;
    }
    else
    {
        return;
    }
    v6 = a1->field_18;
    if (v3)
        v3->field_18 = v6;
    if (v6)
        v6->field_10 = v3;
    v4->field_0 = 0;
    v4->field_8 = 0;
    v7 = a0[5];
    a1->field_10 = v7;
    a0[5] = a1;
    if (v7)
        v7->field_18 = a1;
    if (!a0[4])
        a0[4] = a1;
    if (!a1->field_28)
    {
        *(unsigned int *)&(a1->padding_30)[1] = (unsigned int)0xffffffff;
        return;
    }
    a1->field_28();
}
