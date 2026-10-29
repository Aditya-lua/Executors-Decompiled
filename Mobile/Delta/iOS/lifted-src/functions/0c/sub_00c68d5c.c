/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68d5c..0xc68e5c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68d5c_0 {
    char padding_0[16];
    uint128_t field_10;
} st_c68d5c_0;


unsigned long long sub_c68d5c(st_c68d5c_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long v13;  // x0
    char *v14;  // x8
    unsigned long long v15;  // x9
    unsigned long long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (8 >= a2)
    {
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = v11;
        v5 = &v7;
        v6 = v12;
        v13 = sub_c68684();
        if (!(unsigned int)v13)
            return v13;
        *(__m128i *)&a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(a2, a2));
        if (!v0)
            return 1;
        if (a2)
        {
            v14 = v0 + a2;
            *(v14 - 1) = a1;
            v15 = a1 >> 8;
            if (a2 != 1)
            {
                *(v14 - 2) = v15;
                v15 = a1 >> 16;
                if (a2 != 2)
                {
                    *(v14 - 3) = v15;
                    v15 = a1 >> 24;
                    if (a2 != 3)
                    {
                        *(v14 - 4) = v15;
                        v15 = a1 >> 32;
                        if (a2 != 4)
                        {
                            *(v14 - 5) = v15;
                            v15 = a1 >> 40;
                            if (a2 != 5)
                            {
                                *(v14 - 6) = v15;
                                v15 = a1 >> 48;
                                if (a2 != 6)
                                {
                                    *(v14 - 7) = v15;
                                    v15 = a1 >> 56;
                                    if (a2 != 7)
                                    {
                                        *(v14 - 8) = v15;
                                        v15 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            v15 = a1;
        }
        return !v15;
    }
}
