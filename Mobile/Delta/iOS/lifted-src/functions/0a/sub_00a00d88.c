/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00d88..0xa00db8 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00d88_0 {
    char padding_0[8];
    struct st_a00d88_0 *field_8;
    struct st_a00d88_0 *field_10;
    struct st_a00d88_0 *field_18;
} st_a00d88_0;

typedef struct st_a00d88_1 {
    char padding_0[32];
    struct st_a00d88_0 *field_20;
} st_a00d88_1;


long long sub_a00d88(st_a00d88_1 *a0)
{
    st_a00d88_0 *v0;  // x8

    v0 = a0->field_20;
    if (!v0)
    {
        return 1;
    }
    else if (!v0->field_8)
    {
        return 1;
    }
    else if (v0->field_10)
    {
        return !v0->field_18;
    }
    else
    {
        return 1;
    }
}
