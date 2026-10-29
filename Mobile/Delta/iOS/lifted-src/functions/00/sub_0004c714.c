/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c714..0x4c7c4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c714_0 {
    char field_0;
} st_4c714_0;


double sub_4c714(void* a0, void* a1)
{
    uint128_t v4;  // q0
    unsigned long v5;  // x8
    unsigned long i;  // x9
    uint128_t *v7;  // x10
    uint128_t *v8;  // x11
    uint128_t v9;  // q2
    st_4c714_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4c714_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)&a0[8] = 0;
    v4 = (int128_t)a1[16];
    *(uint128_t *)&a0[16] = v4;
    if ((long long)a1[8])
    {
        *(long long *)a0 = operatornew((long long)a1[8] * 48);
        if ((long long)a1[8])
        {
            v5 = 0;
            i = 0;
            do
            {
                v7 = *(long long *)a0 + v5;
                v8 = *(long long *)a1 + v5;
                v4 = *v8;
                v9 = v8[2];
                v7[1] = v8[1];
                v7[2] = v9;
                *v7 = v4;
                i += 1;
                *(unsigned long *)&a0[8] = i;
                v5 += 48;
            } while (i < (unsigned long long)(long long)a1[8]);
        }
    }
    return (unsigned long long)v4;
}
