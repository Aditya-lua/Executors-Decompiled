/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49da0..0xa49f78 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a49da0_1 {
    char padding_0[11];
    unsigned short field_b;
} st_a49da0_1;

typedef struct st_a49da0_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[107];
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    char field_f8[28];
    char field_104;
    char padding_105[15];
    unsigned long long field_114;
} st_a49da0_2;

typedef struct st_a49da0_0 {
    char padding_0[260];
    uint128_t field_104;
    uint128_t field_114;
    uint128_t field_124;
    uint128_t field_134;
    char field_144[28];
    char field_150;
    char padding_151[15];
    char field_160;
    char padding_161[91];
    uint128_t field_1bc;
    uint128_t field_1cc;
    uint128_t field_1dc;
    uint128_t field_1ec;
    char field_1fc[28];
    char field_208;
    char padding_209[15];
    unsigned long long field_218;
} st_a49da0_0;

typedef struct st_a49da0_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    unsigned long long field_5c;
} st_a49da0_3;

extern char g_10002b0;

unsigned int sub_a49da0(long long a0, unsigned int a1, long long a2, st_a49da0_1 *a3)
{
    st_a49da0_0 *v7;  // x19
    uint128_t v8;  // q2
    uint128_t v17;  // q1
    uint128_t v18;  // q1
    uint128_t v9;  // q2
    unsigned int v10;  // w0
    unsigned long v11;  // x8
    unsigned long long v12;  // x21
    unsigned long v13;  // x21
    st_a49da0_3 *v15;  // x0
    st_a49da0_2 *v16;  // x8
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80], Other Possible Types: uint128_t
    uint128_t v2;  // [bp-0x70], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x60], Other Possible Types: uint128_t
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = sub_9ffdd8();
    if (a1 != 22)
    {
        if (a1 != 23)
            goto LABEL_a49e50;
        v2 = 0;
        v3 = 0;
        v0 = 0;
        v1 = 0;
        if (a2 >= 65)
        {
            sub_a7d710((v7->padding_0)[1]);
            sub_a7d544((v7->padding_0)[1], a3, a2);
            sub_a7d64c(&v0, (v7->padding_0)[1]);
        }
        else
        {
            ___memcpy_chk(&v0, a3, a2, 64);
        }
        v8 = CONCAT(0x3636363636363636, 0x3636363636363636);
        v0 ^= v8;
        v1 ^= v8;
        v2 ^= v8;
        v3 ^= v8;
        sub_a7d710((v7->padding_0)[1]);
        sub_a7d544((v7->padding_0)[1], &v0, 64);
        v9 = CONCAT(0x6a6a6a6a6a6a6a6a, 0x6a6a6a6a6a6a6a6a);
        v0 ^= v9;
        v1 ^= v9;
        v2 ^= v9;
        v3 ^= v9;
        sub_a7d710(&v7->field_144[16]);
        sub_a7d544(&v7->field_144[16], &v0, 64);
        sub_a66ec0(&v0, 64);
        v10 = 1;
    }
    else if (a2 == 13)
    {
        v11 = *(short *)&(a3->padding_0)[1];
        v12 = (unsigned int)((v11 & 0xff00) >> 8) | (unsigned int)v11 * 0x100 & 0xff00ff00;
        if (!sub_a50720(a0))
        {
            v13 = (unsigned int)v12 - 16;
            if (16 <= (unsigned int)v12)
            {
                *(unsigned short *)&(a3->padding_0)[1] = (((((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                v12 = v13;
                goto LABEL_a49f04;
            }
            goto LABEL_a49e50;
        }
        else
        {
LABEL_a49f04:
            *(unsigned long long *)((char *)&v7->field_1ec + 8) = v12 & 0xffffffff;
            v15 = &v7->padding_161[63];
            v16 = (v7->padding_0)[1];
            *(int128_t *)&v15->field_40[12] = *(int128_t *)&v7->field_144[0];
            v17 = v16->field_30;
            v15->field_20 = v16->field_20;
            v15->field_30 = v17;
            *(int128_t *)&v15->field_40[0] = *(int128_t *)&v16->field_40[0];
            v18 = v16->field_10;
            v15->field_0 = v16->field_0;
            v15->field_10 = v18;
            sub_a7d544(v15, a3, 13);
            v10 = 16;
        }
    }
    else
    {
LABEL_a49e50:
        v10 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v10;
    ___stack_chk_fail();
}
