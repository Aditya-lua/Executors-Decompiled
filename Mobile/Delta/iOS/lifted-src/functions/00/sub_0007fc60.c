/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fc60..0x7fd6c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7fc60_0 {
    char field_0;
} st_7fc60_0;


void* sub_7fc60(void* a0, void* a1, long long a2, long long a3)
{
    uint128_t v4;  // q1
    uint128_t v5;  // q3
    uint128_t v6;  // q2
    void* v7;  // x0
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    st_7fc60_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_7fc60_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(int128_t *)a0 = *(int128_t *)a1;
    v4 = (int128_t)a1[64];
    v5 = (int128_t)a1[16];
    v6 = (int128_t)a1[32];
    *(int128_t *)&a0[48] = (int128_t)a1[48];
    *(uint128_t *)&a0[64] = v4;
    *(uint128_t *)&a0[16] = v5;
    *(uint128_t *)&a0[32] = v6;
    v7 = a0;
    if (a2)
    {
        *(unsigned long long *)&a0[8] = *(long long *)a1 + a2 * 8;
        v7 = sub_7e414(a0);
        *(void* *)&a0[16] = (long long)a0[16] + v7;
    }
    if ((int)a1[72])
    {
        if ((int)a1[76] >= (unsigned long long)a2 && (unsigned long long)a3 >= (int)a1[76])
            *(unsigned int *)&a0[76] = (int)a0[76] - a2;
        else
            *(unsigned int *)&a0[72] = 0;
    }
    *(unsigned long long *)a0 = *(long long *)a1 + a2 * 8;
    v9 = *(long long *)a1;
    *(unsigned long long *)&a0[8] = v9 + a3 * 8;
    if (a3 != (long long)((long long)a1[8] - v9) >> 3)
    {
        v7 = sub_7e414(a0);
        *(void* *)&a0[24] = (long long)a0[16] + v7;
    }
    v10 = (long long)a0[40];
    *(long long *)&a0[32] = (long long)a0[32] + a2;
    *(unsigned long *)&a0[40] = v10 + a2;
    *(long long *)&a0[48] = (long long)a0[48] + a2;
    return v7;
}
