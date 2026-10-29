/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b680..0xa5b6f0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5b680_0 {
    unsigned long long field_0;
    struct st_a5b680_0 *field_8;
    char padding_10[80];
    struct st_a5b680_0 *field_60;
    char padding_68[72];
    struct st_a5b680_0 *field_b0;
} st_a5b680_0;


int sub_a5b680(st_a5b680_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 && !a0->field_60)
    {
        if (a2 <= 0x7fffffff && a0->field_8 && a0->field_8->field_b0)
        {
            v0 = &v2;
            v1 = v3;
            a0->field_8->field_b0();
        }
        a0 = 0;
    }
    return (unsigned int)a0;
}
