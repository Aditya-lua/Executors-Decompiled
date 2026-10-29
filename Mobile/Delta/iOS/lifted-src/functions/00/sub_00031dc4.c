/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31dc4..0x31eb0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31dc4_0 {
    char field_0;
} st_31dc4_0;


double sub_31dc4(void* a0, long long a1)
{
    long long v9;  // x0
    long long v10;  // x1
    long long v11;  // x20
    long long v12;  // x8
    unsigned long v13;  // x9
    char v0;  // [bp-0x58], Other Possible Types: long long
    long long v1;  // [bp-0x50], Other Possible Types: unsigned long
    uint128_t v2;  // [bp-0x48]
    long long v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    st_31dc4_0 **v5;  // [bp-0x30], Other Possible Types: char
    st_31dc4_0 *v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    if ((unsigned long long)a1 > (unsigned long long)((long long)a0[16] - (long long)a0[8]))
    {
        v9 = sub_29ccc(a0, (long long)a0[8] + a1 - *(long long *)a0);
        sub_30f60(&v0, v9, (long long)a0[8] - *(long long *)a0, a0);
        sub_31d90(&v0, a1);
        v6 = &v5;
        v5 = &v6;
        v10 = *(long long *)a0;
        v11 = v1 + v10 - (long long)a0[8];
        _memcpy(v11, v10, (long long)a0[8] - v10);
        v12 = *(long long *)a0;
        *(long long *)a0 = v11;
        v13 = (long long)a0[16];
        *(uint128_t *)&a0[8] = v2;
        v3 = v12;
        v4 = v13;
        v0 = v12;
        v1 = v12;
        sub_2f3b0(&v0);
        return *(unsigned long long *)&v2;
    }
}
