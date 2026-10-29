/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60868..0xa608b8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60868_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    long long field_18;
    long long field_20;
    long long field_28;
    char padding_30[4];
    struct st_a60868_0 *field_34;
    char padding_3c[28];
    unsigned int field_58;
} st_a60868_0;


st_a60868_0 * sub_a60868(st_a60868_0 *a0, st_a60868_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        sub_a60cac(a0, a1->field_18, a1->field_20, a1->field_28);
        *(unsigned int *)&a0->padding_3c[24] = a1->field_10;
        *(unsigned int *)(a0->padding_30)[1] = 0;
        return 1;
    }
    else
    {
        return 0;
    }
}
