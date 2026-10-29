/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae24..0x2af08 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ae24_0 {
    char field_0;
} st_2ae24_0;


double sub_2ae24(void* a0, unsigned long long a1)
{
    long long v8;  // x20
    long long v9;  // x8
    unsigned long v10;  // x9
    uint128_t v11;  // q0
    long long v12;  // x0
    char v0;  // [bp-0x58], Other Possible Types: long long
    long long v1;  // [bp-0x50]
    long long v2;  // [bp-0x48], Other Possible Types: uint128_t
    unsigned long v3;  // [bp-0x40]
    st_2ae24_0 **v4;  // [bp-0x30], Other Possible Types: char
    st_2ae24_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a1 > (unsigned long long)(((long long)a0[16] - *(long long *)a0 >> 3) * 17361641481138401521))
    {
        if (135637824071393762 > a1)
        {
            sub_29abc(&v0);
            v5 = &v4;
            v4 = &v5;
            v8 = v1 + *(long long *)a0 - (long long)a0[8];
            sub_30de8(a0, *(long long *)a0, (long long)a0[8], v8);
            v9 = *(long long *)a0;
            *(long long *)a0 = v8;
            v10 = (long long)a0[16];
            v11 = v2;
            *(uint128_t *)&a0[8] = v11;
            v2 = v9;
            v3 = v10;
            v0 = v9;
            v1 = v9;
            sub_30848(&v0);
        }
        else
        {
            v12 = sub_ca34();
            sub_30848(&v0);
            __Unwind_Resume(v12);
        }
    }
    return (unsigned long long)v11;
}
