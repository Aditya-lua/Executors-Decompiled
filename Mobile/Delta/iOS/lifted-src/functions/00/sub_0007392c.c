/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7392c..0x73c30 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7392c_0 {
    char field_0;
} st_7392c_0;


unsigned long long sub_7392c(long long a0, unsigned long long a1, unsigned long long a2, unsigned long long *a3, unsigned long long *a4, unsigned long long a5)
{
    unsigned long long v11;  // x20
    uint128_t t;  // x0
    unsigned long long v21;  // 4108
    char v22;  // x9
    unsigned long long v24;  // x0
    unsigned long long v13;  // x26
    unsigned long long v14;  // x27
    long long v15;  // x0
    unsigned long long v16;  // x8
    unsigned long v17;  // x8
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // 4110
    char v20;  // x9
    st_7392c_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_7392c_0 *v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    unsigned long long idx;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x78]
    unsigned int v7;  // [bp-0x6c]
    unsigned long long *v8;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v11 = *a4 - *a3;
    t = std::__1::chrono::system_clock::now();
    v13 = (unsigned long long)((int128_t)(t * 4835703278458516699) >> 82) + (unsigned long long)(t * 4835703278458516699 >> 127);
    v7 = (((((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    idx = 0;
    v5 = 0;
    v6 = 0;
    v14 = v11 >> 16;
    v8 = 0;
    sub_7386c();
    *(char *)idx = a1;
    if (a2)
        *(char *)idx = *(char *)idx | 128;
    if (a1 && a5)
        *(char *)idx = *(char *)idx | 64;
    v15 = a0 + 24;
    if (125 >= v11)
    {
        if (sub_60768(v15, 5))
            v16 = 128;
        else
            v16 = 0;
        *(char *)(idx + 1) = v16 | (char)v11;
        if (!sub_60768())
            goto LABEL_73ba0;
        *(char *)(idx + 2) = v13 >> 24;
        *(char *)(idx + 3) = v13 >> 16;
        *(char *)(idx + 4) = v13 >> 8;
        v17 = idx + 5;
        goto LABEL_73b9c;
    }
    v18 = sub_60768(v15, 5) & 0xffffffff;
    if (!v14)
    {
        v19 = arm64g_calculate_condition(19, v18, 0, 0);
        if (v19 & 1)
            v20 = 254;
        else
            v20 = 126;
        *(char *)(idx + 1) = v20;
        *(char *)(idx + 2) = v11 >> 8;
        *(char *)(idx + 3) = v11;
        if (!sub_60768())
            goto LABEL_73ba0;
        *(char *)(idx + 4) = v13 >> 24;
        *(char *)(idx + 5) = v13 >> 16;
        *(char *)(idx + 6) = v13 >> 8;
        v17 = idx + 7;
        goto LABEL_73b9c;
    }
    else
    {
        v21 = arm64g_calculate_condition(3, v18, 0, 0);
        if (v21 & 1)
            v22 = 127;
        else
            v22 = 0xff;
        *(char *)(idx + 1) = v22;
        *(char *)(idx + 2) = v11 >> 56;
        *(char *)(idx + 3) = v11 >> 48;
        *(char *)(idx + 4) = v11 >> 40;
        *(char *)(idx + 5) = v11 >> 32;
        *(char *)(idx + 6) = v11 >> 24;
        *(char *)(idx + 7) = v14;
        *(unsigned short *)(idx + 8) = (((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        if (sub_60768())
        {
            *(char *)(idx + 10) = v13 >> 24;
            *(char *)(idx + 11) = v13 >> 16;
            *(char *)(idx + 12) = v13 >> 8;
            v17 = idx + 13;
LABEL_73b9c:
            *(char *)v17 = v13;
        }
    }
LABEL_73ba0:
    v2 = *a4;
    v3 = *a3;
    sub_74118(a0, &idx, &v3, &v2, v11, &v7);
    v24 = sub_732c0(a0);
    v8 = &idx;
    sub_30030(&v8);
    return v24;
}
