/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa13060..0xa130e4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a13060_1 {
    char padding_0[208];
    unsigned long long field_d0;
} st_a13060_1;

typedef struct st_a13060_0 {
    char padding_0[24];
    long long field_18;
} st_a13060_0;


int sub_a13060(st_a13060_1 **a0, st_a13060_0 *a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a1b4f4() && !sub_9e4828(a1->field_18))
    {
        if (*a0->field_d0)
            *a0->field_d0();
        return 0;
    }
    return 1;
}
