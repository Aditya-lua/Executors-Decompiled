/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fa94..0x7fc20 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7fa94_1 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
} st_7fa94_1;

typedef struct st_7fa94_0 {
    char field_0;
} st_7fa94_0;


long long sub_7fa94(st_7fa94_1 *a0, void* a1, unsigned long long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v17;  // x28
    unsigned long long v18;  // x27
    unsigned long long v27;  // x30
    unsigned long long v28;  // x8
    unsigned long long v29;  // x0
    unsigned long long v30;  // x0
    unsigned long long v31;  // x0
    unsigned long long v32;  // x0
    unsigned long long v33;  // x9
    unsigned long long v34;  // x8
    unsigned long v35;  // cc_dep1
    unsigned long long v36;  // x10
    unsigned long long v19;  // x26
    unsigned long long v37;  // 4112
    unsigned long long v38;  // 4107
    unsigned long long v39;  // 4112
    unsigned long long v40;  // 4107
    unsigned long long v41;  // x11
    unsigned long v42;  // x11
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    st_7fa94_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_7fa94_0 *v1;  // [bp-0x88]
    uint128_t v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v1 = &v0;
    v0 = &v1;
    v28 = 1 << ((char)a0->field_0 & 63);
    if (v28 >= a6)
        v28 = a6;
    if (!a6)
        v28 = 1;
    v29 = sub_7ff98();
    if (v29 < v28)
        v28 = v29;
    v30 = sub_7d5d8();
    v2 = *(int128_t *)a1;
    v3 = (long long)a1[16];
    v31 = sub_b5164(&v2);
    v2 = *(int128_t *)a1;
    v3 = (long long)a1[16];
    v32 = sub_b4348(&v2, v28);
    v33 = ((v28 >> 10) + v28 / 3) * 16 + 95 & 0xffffffffffffffc0;
    if (!a7)
        v33 = 0;
    if (*(int *)a1 == 1)
        v34 = 63 + 12 * v32 & 0xffffffffffffffc0;
    else
        v34 = 0;
    v35 = a2;
    v36 = 25456;
    if (!a2)
        v36 = 20184;
    if ((int)a0->field_10 != 3)
    {
        v37 = arm64g_calculate_condition(19, v35, 0, 0);
        v38 = arm64g_calculate_condition(19, (v37 & 1 ? a7 : 0), 0, 0);
        if (!(v38 & 1))
            goto LABEL_7fbc2;
        v41 = 3;
LABEL_7fbc1:
    }
    else
    {
        v39 = arm64g_calculate_condition(19, v35, 0, 0);
        v40 = arm64g_calculate_condition(16, (v39 & 1 ? a7 : 0), 0, 0);
        if (v40 & 1)
            goto LABEL_7fbc1;
LABEL_7fbc2:
        v41 = 4;
    }
    v42 = v28 / v41;
    return a4 + a5 + v36 + v30 + v31 + v28 + v33 + v34 + v42 * 3 + (v42 * 8 + 63 & 0xffffffffffffffc0) + 32;
}
