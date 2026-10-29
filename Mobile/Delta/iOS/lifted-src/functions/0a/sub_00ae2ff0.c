/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae2ff0..0xae3058 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae2ff0_0 {
    struct st_ae2ff0_0 *field_0;
    long long field_8;
} st_ae2ff0_0;


st_ae2ff0_0 * sub_ae2ff0(st_ae2ff0_0 *a0)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_ae2ff0_0 *v0;  // [bp-0x24], Other Possible Types: char
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a0)
    {
        return 1;
    }
    else if ((int)a0->field_0)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        if ((int)a0->field_0 != 1 || !sub_ad69e4(a0->field_8))
            return 0;
        sub_c6a268(&a0->field_8, &v0);
        return v0;
        return 0;
    }
    else
    {
        return 1;
    }
}
