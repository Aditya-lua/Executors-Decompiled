/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f7ec..0x7f848 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f7ec_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_7f7ec_0;


unsigned long long sub_7f7ec(st_7f7ec_0 *a0, unsigned long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_7f500();
    if (!v2)
    {
        return v2;
    }
    else if (a0->field_30 > v2)
    {
        _bzero();
        a0->field_30 = v2;
        return v2;
    }
    else
    {
        return v2;
    }
}
