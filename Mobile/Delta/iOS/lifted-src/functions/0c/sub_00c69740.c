/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc69740..0xc699d8 (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c69740_0 {
    char padding_0[16];
    struct st_c69740_0 *field_10;
    struct st_c69740_1 *field_18;
    unsigned long long field_20;
} st_c69740_0;

typedef struct st_c69740_1 {
    unsigned long long field_0;
} st_c69740_1;


int sub_c69740(st_c69740_0 *a0, st_c69740_0 *a1, int a2, st_c69740_0 *a3, st_c69740_0 *a4, unsigned long long *a5, unsigned long a6)
{
    st_c69740_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    if (a0 && a2 >= 1 && a4)
    {
        if (a1)
        {
            v2 = sub_a6bf4c(40, "crypto/property/property.c", 337);
            if (v2)
            {
                v2->field_10 = a4;
                v2->field_18 = a5;
                v2->field_20 = a6;
                a5();
            }
        }
        else
        {
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}
