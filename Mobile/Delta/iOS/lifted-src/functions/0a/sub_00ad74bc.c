/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad74bc..0xad753c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad74bc_0 {
    char padding_0[64];
    struct st_ad74bc_1 *field_40;
    char padding_48[104];
    struct st_ad74bc_1 *field_b0;
} st_ad74bc_0;

typedef struct st_ad74bc_2 {
    struct st_ad74bc_0 *field_0;
    long long field_8;
    char padding_10[48];
    long long field_40;
} st_ad74bc_2;

typedef struct st_ad74bc_1 {
    unsigned long long field_0;
} st_ad74bc_1;


long long sub_ad74bc(st_ad74bc_2 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_40)
    {
        if (!sub_ad69e4(a0->field_40))
        {
            sub_ad6020(a0->field_40);
            a0->field_40 = 0;
        }
        else if (a0->field_40)
        {
            return 0;
        }
    }
    if (!a0->field_8)
        a0->field_0->field_40();
    a0->field_0->field_b0();
}
