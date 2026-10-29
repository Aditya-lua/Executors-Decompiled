/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53d4..0xb5534 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53d4_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[24];
    unsigned long long field_28;
    char padding_30[8];
    struct st_b53d4_0 *field_38;
    unsigned long long field_40;
} st_b53d4_1;

typedef struct st_b53d4_0 {
    char field_0;
} st_b53d4_0;


unsigned long long sub_b53d4(st_b53d4_1 *a0, long long a1, long long a2, unsigned int *a3)
{
    long long v10;  // x24
    long long v11;  // x21
    long long v20;  // x26
    unsigned long long v21;  // x8
    char v22;  // x11
    char *v23;  // x10
    char v24;  // x12
    unsigned long long v12;  // x0
    long long v13;  // x21
    unsigned long long *v14;  // x19
    unsigned long long v15;  // x0
    unsigned long v16;  // x24
    unsigned long v17;  // x24
    unsigned long long *v18;  // x19
    unsigned long long v19;  // x8
    unsigned long long *v0;  // [bp-0xa8]
    long long v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    st_b53d4_0 **v4;  // [bp-0x88], Other Possible Types: char
    st_b53d4_0 *v5;  // [bp-0x80]
    unsigned int v6;  // [bp-0x74]
    char v7;  // [bp-0x70]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a2;
    v11 = a1;
    v5 = &v4;
    v4 = &v5;
    v3 = a3[3];
    v12 = sub_b440c(&v7, a3);
    if ((unsigned long long)v10 <= (unsigned long long)v11)
        return v12;
    v0 = &a0->field_40;
    v1 = v10;
    v13 = v11;
    do
    {
        v6 = 0;
        v14 = v0;
        v15 = sub_b44e0(&v7, v13, v10 - v13, v14, &v6);
        v2 = v15;
        v16 = v6;
        if ((unsigned int)v16)
        {
            do
            {
                v17 = v16;
                v18 = v14 + 1;
                v19 = v13 + *v14;
                if (v19 >= v11 + v3)
                {
                    v20 = v19 + -v3;
                    v15 = sub_77ccc(v20, v3, 0);
                    v21 = v15 & ~(0xffffffff << ((char)a3[1] - (char)a3[2] & 31));
                    v22 = a3[2];
                    v23 = a0->field_38;
                    v24 = v23[v21];
                    *(unsigned long long *)(a0->field_28 + (v21 << (v22 & 63)) * 8 + v24 * 8) = v15 & 0xffffffff00000000 | v20 - a0->field_8;
                    v23[v21] = v24 + 1 & (char)~(0xffffffff << (v22 & 31));
                }
            } while ((v16 = v17 - 1, v14 = v18, v17 != 1));
        }
    } while ((v10 = v1, v13 += v2, (unsigned long long)v10 > (unsigned long long)v13));
    return v15;
}
