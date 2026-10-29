/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa273a0..0xa274e0 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a273a0_2 {
    struct st_a273a0_1 *field_0;
    char padding_8[56];
    long long field_40;
    char padding_48[24];
    long long field_60;
    long long field_68;
    char padding_70[56];
    long long field_a8;
} st_a273a0_2;

typedef struct st_a273a0_1 {
    char padding_0[288];
    struct st_a273a0_0 *field_120;
} st_a273a0_1;

typedef struct st_a273a0_0 {
    struct st_a273a0_0 *field_0;
} st_a273a0_0;


st_a273a0_0 ** sub_a273a0(st_a273a0_2 *a0, st_a273a0_0 **a1, st_a273a0_0 **a2, st_a273a0_0 **a3, st_a273a0_0 **a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && !sub_9e4c34(a1, a0->field_40))
        return 0;
    if (!a2 && !a3)
    {
LABEL_a27430:
    }
    else if (a0->field_0->field_120)
    {
        if (!a4 && !sub_9dddcc(a0->field_a8))
            return 0;
        if (a2)
        {
            a0->field_0->field_120();
        }
        else if (a3)
        {
            a0->field_0->field_120();
        }
    }
    else
    {
        if (a2 && !sub_9e4c34(a2, a0->field_60))
        {
            sub_9dded4();
            return 0;
        }
        if (!a3)
            goto LABEL_a27430;
        if (!sub_9e4c34(a3, a0->field_68))
        {
            sub_9dded4();
            return 0;
        }
    }
    sub_9dded4();
    return 1;
}
