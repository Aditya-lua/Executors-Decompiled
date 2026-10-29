/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77818..0xa77930 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a77818_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[24];
    struct st_a77818_1 *field_30;
} st_a77818_0;

typedef struct st_a77818_1 {
    unsigned long long field_0;
} st_a77818_1;


st_a77818_0 * sub_a77818(unsigned long a0, long long a1)
{
    st_a77818_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c(a1, 18);
    if (!v2)
    {
        return 0;
    }
    else if (sub_a7c198(v2->field_10))
    {
        v2->field_30();
    }
    else
    {
        return 0;
    }
}
