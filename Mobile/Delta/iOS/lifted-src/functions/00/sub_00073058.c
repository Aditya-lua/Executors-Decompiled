/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73058..0x730fc (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73058_0 {
    char field_0;
} st_73058_0;


double sub_73058(void* a0, long long a1)
{
    long long v8;  // x1
    long long v9;  // x20
    long long v10;  // x8
    unsigned long v11;  // x9
    uint128_t v12;  // q0
    char v0;  // [bp-0x58], Other Possible Types: long long
    long long v1;  // [bp-0x50], Other Possible Types: unsigned long
    long long v2;  // [bp-0x48], Other Possible Types: uint128_t
    unsigned long v3;  // [bp-0x40]
    st_73058_0 **v4;  // [bp-0x30], Other Possible Types: char
    st_73058_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if ((unsigned long long)a1 > (unsigned long long)((long long)a0[16] - *(long long *)a0))
    {
        if (a1 >= 0)
        {
            sub_30f60(&v0);
            v5 = &v4;
            v4 = &v5;
            v8 = *(long long *)a0;
            v9 = v1 + v8 - (long long)a0[8];
            _memcpy(v9, v8, (long long)a0[8] - v8);
            v10 = *(long long *)a0;
            *(long long *)a0 = v9;
            v11 = (long long)a0[16];
            v12 = v2;
            *(uint128_t *)&a0[8] = v12;
            v2 = v10;
            v3 = v11;
            v0 = v10;
            v1 = v10;
            sub_2f3b0(&v0);
        }
        else
        {
            sub_ca34();
        }
    }
    return (unsigned long long)v12;
}
