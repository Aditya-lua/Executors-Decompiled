/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43b0c..0xb43be8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43b0c_0 {
    char padding_0[8];
    long long field_8;
} st_b43b0c_0;


unsigned long long sub_b43b0c(st_b43b0c_0 *a0, unsigned long long a1, unsigned long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b43d98(a0, a3);
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (!a1)
    {
        return sub_a4d02c();
    }
    else if (sub_a50904(a0->field_8) == a2)
    {
        return sub_a4d02c(a0->field_8, 0, 0, a1, 0) != 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/gmac_prov.c", 106, "gmac_setkey");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
