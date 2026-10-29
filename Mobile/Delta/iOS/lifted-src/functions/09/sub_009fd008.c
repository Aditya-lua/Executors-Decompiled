/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd008..0x9fd030 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd008_0 {
    char padding_0[8];
    struct st_9fd008_0 *field_8;
    char padding_10[8];
    struct st_9fd008_0 *field_18;
} st_9fd008_0;

typedef struct st_9fd008_1 {
    char padding_0[32];
    struct st_9fd008_0 *field_20;
} st_9fd008_1;


long long sub_9fd008(st_9fd008_1 *a0)
{
    st_9fd008_0 *v0;  // x8

    v0 = a0->field_20;
    if (!v0)
    {
        return 1;
    }
    else if (v0->field_8)
    {
        return !v0->field_18;
    }
    else
    {
        return 1;
    }
}
