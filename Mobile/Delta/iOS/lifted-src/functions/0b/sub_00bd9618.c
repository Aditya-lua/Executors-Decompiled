/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd9618..0xbd972c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd9618_1 {
    char padding_0[24];
    unsigned int field_18;
} st_bd9618_1;

typedef struct st_bd9618_3 {
    char padding_0[28];
    unsigned int field_1c;
} st_bd9618_3;

typedef struct st_bd9618_2 {
    char padding_0[32];
    unsigned int field_20;
} st_bd9618_2;

typedef struct st_bd9618_4 {
    char padding_0[36];
    unsigned int field_24;
} st_bd9618_4;

typedef struct st_bd9618_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[4];
    unsigned int field_44;
} st_bd9618_0;


double sub_bd9618(void* a0, st_bd9618_0 *a1, unsigned int a2)
{
    unsigned long v0;  // x8
    unsigned long i;  // x10
    st_bd9618_1 *v10;  // x2
    unsigned long v11;  // x17
    st_bd9618_2 *v12;  // x3
    st_bd9618_3 *v13;  // x14
    unsigned long v14;  // x13
    st_bd9618_4 *v15;  // x15
    uint128_t v16;  // q0
    uint128_t v17;  // q1
    unsigned long v18;  // d0
    unsigned long long v2;  // x11
    void* v3;  // x9
    unsigned long long v5;  // x13
    unsigned long long v6;  // x17
    unsigned int v7;  // w12
    unsigned long long v8;  // x14
    unsigned long long v9;  // x15

    v0 = a2;
    i = a1->field_28;
    if (i <= v0)
    {
        *(unsigned long *)a0 = 0x8000000000000000;
        return v18;
    }
    v2 = a1->field_20;
    v3 = v2 + (unsigned int)v0 * 48;
    if (*(long long *)v3 == 0x8000000000000000)
    {
        *(unsigned long *)a0 = 0x8000000000000000;
        return v18;
    }
    v5 = a1->field_10;
    v6 = (long long)v3[40] & 0xffffffff;
    if (v5 > v6)
    {
        v7 = (int)v3[36];
        v8 = (unsigned long long)((long long)v3[40]) >> 32;
        v9 = a1->field_8;
        v10 = v9 + v6 * 32;
        if (v10->field_18 == v0)
        {
            v10->field_18 = (int)v3[32];
        }
        else
        {
            while (i > v11)
            {
                v12 = v2 + 48 * v11;
                if (v12->field_20 == v0)
                {
                    v12->field_20 = (int)v3[32];
                    break;
                }
            }
        }
        if (v5 > v8)
        {
            v13 = v9 + v8 * 32;
            if (v13->field_1c == v0)
            {
                v13->field_1c = v7;
            }
            else
            {
                while (i > v14)
                {
                    v15 = v2 + 48 * v14;
                    if (v15->field_24 == v0)
                    {
                        v15->field_24 = v7;
                        break;
                    }
                }
            }
        }
    }
    *(unsigned int *)&v3[32] = a1->field_44;
    *(unsigned long *)&v3[36] = 0xffffffffffffffff;
    *(unsigned int *)&v3[44] = 0xffffffff;
    a1->field_44 = v0;
    a1->field_38 = a1->field_38 - 1;
    v16 = *(int128_t *)v3;
    v17 = (int128_t)v3[16];
    *(uint128_t *)a0 = v16;
    *(uint128_t *)&a0[16] = v17;
    *(unsigned long *)v3 = 0x8000000000000000;
    return *(unsigned long long *)&v16;
}
