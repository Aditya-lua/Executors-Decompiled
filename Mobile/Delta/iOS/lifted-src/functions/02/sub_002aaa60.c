/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aaa60..0x2aab3c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_2aaa60(void* a0, unsigned long long a1)
{
    unsigned long v9;  // x3
    unsigned long v10;  // x8
    uint128_t v11;  // q0
    uint128_t v12;  // q1
    long long v13;  // x0
    unsigned long v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x68]
    char *v2;  // [bp-0x60], Other Possible Types: unsigned long
    unsigned int v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x48]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    if (a1 > (unsigned long long)((long long)a0[16] * 64))
    {
        if (sub_2aec50() >= a1)
        {
            v4 = 0;
            v5 = 0;
            sub_2ab3b4(&v4, a1);
            v9 = (long long)a0[8];
            v2 = *(long long *)a0;
            v3 = 0;
            v0 = *(long long *)a0 + (v9 >> 6) * 8;
            v1 = (unsigned int)v9 & 63;
            sub_2aa1e8(&v4, &v2, &v0, v9);
            v10 = *(long long *)a0;
            *(unsigned long *)a0 = v4;
            v4 = v10;
            v11 = v5;
            v12 = (int128_t)a0[8];
            *(uint128_t *)&a0[8] = v11;
            v5 = v12;
            v2 = &v4;
            sub_2ab41c(&v2);
        }
        else
        {
            v13 = sub_ca34();
            v6 = a1;
            sub_2ab41c(&v6);
            __Unwind_Resume(v13);
        }
    }
    return *(unsigned long long *)&v11;
}
