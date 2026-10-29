/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46ddc..0x46e38 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46ddc_1 {
    char padding_0[8];
    char field_8;
    char field_9;
} st_46ddc_1;

typedef struct st_46ddc_0 {
    char field_0;
} st_46ddc_0;


unsigned long long sub_46ddc(long long a0, unsigned long a1)
{
    st_46ddc_1 *v5;  // x0
    st_46ddc_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_46ddc_0 *v1;  // [bp-0x20]
    unsigned long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v5 = sub_34930(a0 + 144, &v2);
    if (!v5)
    {
        return 0xffffffff;
    }
    else if (v5->field_9 == 1)
    {
        return v5->field_8;
    }
    else
    {
        return 0xffffffff;
    }
}
