/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb497e0..0xb4998c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b497e0_1 {
    char padding_0[224];
    unsigned long long field_e0;
    char padding_e8[8];
    struct st_b497e0_0 *field_f0;
} st_b497e0_1;

typedef struct st_b497e0_0 {
    char padding_0[24];
    long long field_18;
    unsigned long long field_20;
} st_b497e0_0;


long long sub_b497e0(st_b497e0_1 *a0, long long iter, unsigned int a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    st_b497e0_0 *v8;  // x19
    long long v9;  // x27
    unsigned long long v18;  // x8
    unsigned long long v19;  // x21
    unsigned long v20;  // x0
    unsigned long v21;  // x0
    unsigned long long n;  // x21
    long long v11;  // x28
    unsigned long v12;  // x0
    unsigned long v13;  // x0
    unsigned long v14;  // x0
    unsigned long v15;  // x0
    unsigned long v16;  // x0
    unsigned long v17;  // x0
    char v0;  // [bp-0x66]
    char v1;  // [bp-0x65]
    char v2;  // [bp-0x64]
    char v3;  // [bp-0x63]
    char v4;  // [bp-0x62]
    char v5;  // [bp-0x61]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0], Other Possible Types: long long

    v6 = &v7;
    v8 = a0->field_f0;
    v9 = v8->field_18;
    n = a0->field_e0;
    v0 = 1;
    v1 = n >> 21;
    v2 = n >> 13;
    v3 = n >> 5;
    v4 = (char)n * 8;
    if (a2 != 0xff)
    {
        v5 = a2;
        v11 = 6;
    }
    else
    {
        v11 = 5;
    }
    v12 = sub_a3fe04(v9, sub_954340(v8), 0);
    if (!(unsigned int)v12)
        return v12;
    while (1)
    {
        v13 = sub_a3fe10(v9, &v0, v11);
        if (!(unsigned int)v13)
            return v13;
        v14 = sub_a3fe10(v9, a3, a4);
        if (!(unsigned int)v14)
            return v14;
        if (a5)
        {
            v15 = sub_a3fe10(v9, a5, a6);
            if (!(unsigned int)v15)
                return v15;
        }
        if (a7)
        {
            v16 = sub_a3fe10(v9, a7, v7);
            if (!(unsigned int)v16)
                return v16;
        }
        if (n >= v8->field_20)
        {
            v17 = sub_a3ff18(v9, iter, 0);
            if (!(unsigned int)v17)
                return v17;
            v18 = v8->field_20;
            v19 = n - v18;
            if (n == v18)
                break;
            v0 += 1;
            iter += v18;
            v20 = sub_a3fe04(v9, sub_954340(v8), 0);
            n = v19;
            if (!(unsigned int)v20)
                return v20;
        }
        else
        {
            v21 = sub_a3ff18(v9, &v8[6].padding_0[22], 0);
            if (!(unsigned int)v21)
                return v21;
            _memcpy(iter, &v8[6].padding_0[22], n);
            sub_a66ec0(&v8[6].padding_0[22], v8->field_20);
            break;
        }
    }
    return 1;
}
