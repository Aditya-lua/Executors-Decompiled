/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7f00..0xad7f98 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7f00_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_ad7f00_0;


unsigned long long sub_ad7f00(unsigned long long a0, unsigned long a1, st_ad7f00_0 *a2)
{
    long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!(int)a2->field_8)
    {
        v3 = sub_a68f38(a2->field_0);
        sub_a68e7c(v3, a2->field_10);
        if (!a0)
        {
LABEL_ad7f54:
            v4 = sub_a6820c(a2->field_0, 15);
            if (!v4)
                return v4;
        }
    }
    else if (!(a0))
    {
        goto LABEL_ad7f54;
    }
    if (sub_aa57f0())
        return v0;
    return 0;
}
