/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d624..0x95d668 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95d624_0 {
    char padding_0[112];
    long long field_70;
} st_95d624_0;


long long sub_95d624(st_95d624_0 *a0, unsigned long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_70)
    {
        v2 = sub_ad61b4(0);
        a0->field_70 = v2;
        if (!v2)
            return 0;
    }
}
