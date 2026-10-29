/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2460..0xac2700 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2460_1 {
    char padding_0[112];
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned int field_80;
    unsigned int field_84;
} st_ac2460_1;

typedef struct st_ac2460_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    char field_50;
    char padding_51[111];
    unsigned long long field_c0;
    unsigned long long field_c8;
    unsigned int field_d0;
    unsigned int field_d4;
} st_ac2460_0;


void* sub_ac2460(void* a0, st_ac2460_0 *a1)
{
    st_ac2460_1 *v2;  // x21
    void* v3;  // x9
    void* v4;  // x8
    unsigned long long v5;  // x8
    void* v6;  // w8
    unsigned long long v7;  // x8
    unsigned long v8;  // x9
    unsigned long long v9;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a1->field_50;
    v3 = a1->field_d0;
    *(char *)(v2 + v3) = 128;
    v4 = v3 + 1;
    if ((unsigned int)v3 >= 112)
    {
        _bzero(v2 + v4, 127 - v3);
        sub_ac0d40(a1, v2, 1);
        v4 = 0;
    }
    _bzero(v2 + v4, 112 - v4);
    v5 = __builtin_bswap64(a1->field_40);
    a1->field_c0 = __builtin_bswap64(a1->field_48);
    a1->field_c8 = v5;
    sub_ac0d40(a1, v2, 1);
    if (!a0)
        return 0;
    v6 = (void*)(__ROL__(a1->field_d4 - 28, 30));
    if (4 < v6)
    {
        switch (v6)
        {
        case 5:
            *(unsigned long long *)a0 = __builtin_bswap64(a1->field_0);
            *(unsigned long long *)&a0[8] = __builtin_bswap64(a1->field_8);
            *(unsigned long long *)&a0[16] = __builtin_bswap64(a1->field_10);
            *(unsigned long long *)&a0[24] = __builtin_bswap64(a1->field_18);
            *(unsigned long long *)&a0[32] = __builtin_bswap64(a1->field_20);
            v7 = a1->field_28;
            *(char *)&a0[40] = v7 >> 56;
            *(char *)&a0[41] = v7 >> 48;
            *(char *)&a0[42] = v7 >> 40;
            *(char *)&a0[43] = v7 >> 32;
            *(char *)&a0[44] = v7 >> 24;
            *(char *)&a0[45] = v7 >> 16;
            v8 = a0 + 47;
            *(char *)&a0[46] = v7 >> 8;
            break;
        case 9:
            *(unsigned long long *)a0 = __builtin_bswap64(a1->field_0);
            *(unsigned long long *)&a0[8] = __builtin_bswap64(a1->field_8);
            *(unsigned long long *)&a0[16] = __builtin_bswap64(a1->field_10);
            *(unsigned long long *)&a0[24] = __builtin_bswap64(a1->field_18);
            *(unsigned long long *)&a0[32] = __builtin_bswap64(a1->field_20);
            *(unsigned long long *)&a0[40] = __builtin_bswap64(a1->field_28);
            *(unsigned long long *)&a0[48] = __builtin_bswap64(a1->field_30);
            v7 = a1->field_38;
            *(char *)&a0[56] = v7 >> 56;
            *(char *)&a0[57] = v7 >> 48;
            *(char *)&a0[58] = v7 >> 40;
            *(char *)&a0[59] = v7 >> 32;
            *(char *)&a0[60] = v7 >> 24;
            *(char *)&a0[61] = v7 >> 16;
            v8 = a0 + 63;
            *(char *)&a0[62] = v7 >> 8;
            break;
        default:
            return 0;
        }
    }
    else if (!v6)
    {
        *(unsigned long long *)a0 = __builtin_bswap64(a1->field_0);
        *(unsigned long long *)&a0[8] = __builtin_bswap64(a1->field_8);
        *(unsigned long long *)&a0[16] = __builtin_bswap64(a1->field_10);
        v9 = a1->field_18;
        *(char *)&a0[24] = v9 >> 56;
        *(char *)&a0[25] = v9 >> 48;
        v8 = a0 + 27;
        *(char *)&a0[26] = v9 >> 40;
        v7 = v9 >> 32;
    }
    else if (v6 == 1)
    {
        *(unsigned long long *)a0 = __builtin_bswap64(a1->field_0);
        *(unsigned long long *)&a0[8] = __builtin_bswap64(a1->field_8);
        *(unsigned long long *)&a0[16] = __builtin_bswap64(a1->field_10);
        v7 = a1->field_18;
        *(char *)&a0[24] = v7 >> 56;
        *(char *)&a0[25] = v7 >> 48;
        *(char *)&a0[26] = v7 >> 40;
        *(char *)&a0[27] = v7 >> 32;
        *(char *)&a0[28] = v7 >> 24;
        *(char *)&a0[29] = v7 >> 16;
        v8 = a0 + 31;
        *(char *)&a0[30] = v7 >> 8;
    }
    else
    {
        return 0;
    }
    *(char *)v8 = v7;
    return 1;
}
