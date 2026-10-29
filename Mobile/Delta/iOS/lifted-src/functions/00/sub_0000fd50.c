/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xfd50..0xff14 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_fd50_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_fd50_0;

typedef struct st_fd50_3 {
    char padding_0[12];
    uint128_t field_c;
} st_fd50_3;

typedef struct st_fd50_1 {
    unsigned long long field_0;
    struct st_fd50_2 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_fd50_1;

typedef struct st_fd50_2 {
    struct st_fd50_0 *field_0;
} st_fd50_2;

typedef struct st_fd50_4 {
    char field_0;
} st_fd50_4;


double sub_fd50(void* a0, long long a1, unsigned long long a2)
{
    long long v9;  // w8
    unsigned long long v10;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x22
    st_fd50_1 *v19;  // x8
    uint128_t v20;  // q0
    unsigned long long v11;  // x21
    unsigned int v12;  // w0
    long long v13;  // x8
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    st_fd50_3 *v16;  // x8
    st_fd50_4 **v0;  // [bp-0x88], Other Possible Types: char
    st_fd50_4 *v1;  // [bp-0x80]
    st_fd50_0 *v2;  // [bp-0x78], Other Possible Types: st_fd50_3 *
    long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    long long v5;  // [bp-0x5c]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    switch (v9)
    {
    case 123:
        v17 = (long long)a0[140];
        v2 = sub_219fc(a0);
        v18 = (long long)a0[168];
        v16 = v2;
        v19->field_0 = sub_13094(a0, &v2, 1);
        v19->field_8 = &v2;
        v19->field_10 = v17;
        v19->field_18 = v18;
        break;
    case 40:
        v10 = (long long)a0[140];
        v5 = (int)a0[128];
        v6 = (long long)a0[132];
        sub_f8d0(a0);
        v2 = a0 + 656;
        v3 = (long long)a0[664] - (long long)a0[656] >> 3;
        v4 = 0;
        if ((int)a0[128] != 41)
            sub_ff50(a0, &v2, a1);
        v11 = (long long)a0[140];
        v12 = sub_1ef30(a0, 41, &v5, 0);
        if (a2)
            v13 = v12 ^ 1;
        else
            v13 = 1;
        if (!(v13 & 1))
            *(long long *)a2 = (long long)a0[132];
        v14 = sub_ef54(a0, &v2);
        v15 = (long long)a0[160];
        v19->field_0 = v14;
        v19->field_8 = &v2;
        v19->field_10 = v10;
        v19->field_18 = v11;
        v19->field_20 = v6;
        v19->field_28 = v15;
        sub_dd88(v2, v2->field_0 + v3 * 8, v2->field_8);
        return (unsigned long long)v20;
    default:
        *(int128_t *)&v19->field_10 = (int128_t)a0[132];
        v2 = sub_19760(a0);
        v16 = v2;
        v19->field_0 = sub_13094(a0, &v2, 1);
        v19->field_8 = &v2;
        break;
    }
    v20 = *(int128_t *)(v16->padding_0)[1];
    *(uint128_t *)&v19->field_20 = v20;
    return (unsigned long long)v20;
}
