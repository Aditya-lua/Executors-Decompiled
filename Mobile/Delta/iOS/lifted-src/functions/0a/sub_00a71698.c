/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71698..0xa7173c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71698_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a71698_1 *field_10;
    unsigned long long field_18;
} st_a71698_0;

typedef struct st_a71698_1 {
    unsigned long long field_0;
} st_a71698_1;


st_a71698_0 * sub_a71698(st_a71698_0 *a0, st_a71698_0 *a1, st_a71698_0 *a2, unsigned int a3)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1)
    {
        if (a0->field_8 == a3)
        {
            if (a2)
                a2->field_0 = a0->field_18;
            a1->field_0 = *(long long *)a0->field_10;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1482, "get_ptr_internal");
        v2 = 129;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1478, "get_ptr_internal");
        v2 = 786690;
    }
    sub_a36abc(15, v2, 0);
    return 0;
}
