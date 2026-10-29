/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x127d78..0x128078 (768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_127d78_1 {
    char padding_0[40];
    struct st_127d78_2 *field_28;
    char padding_30[100];
    unsigned int field_94;
    unsigned int field_98;
    unsigned int field_9c;
} st_127d78_1;

typedef struct st_127d78_6 {
    struct st_127d78_5 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_127d78_6;

typedef struct st_127d78_5 {
    char padding_0[16];
    unsigned int field_10;
} st_127d78_5;

typedef struct st_127d78_2 {
    unsigned int field_0;
} st_127d78_2;

typedef struct st_127d78_4 {
    struct st_127d78_1 *field_0;
} st_127d78_4;

typedef struct st_127d78_0 {
    char field_0;
} st_127d78_0;

typedef struct st_127d78_3 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38[2];
    struct st_127d78_4 *field_40;
    struct st_127d78_4 *field_48;
    unsigned int field_50;
    char field_54;
    char padding_55[3];
    unsigned long long field_58;
    unsigned long long field_60;
} st_127d78_3;

extern char _NSHomeDirectory;

st_127d78_3 * sub_127d78(st_127d78_3 *a0, long long a1)
{
    long long v6;  // x0
    unsigned int v7;  // w23
    unsigned int v16;  // w8
    st_127d78_5 *v17;  // x8
    unsigned int v19;  // w8
    unsigned int v20;  // w8
    unsigned int v21;  // w10
    unsigned int v23;  // w8
    unsigned int v24;  // w8
    st_127d78_1 **v8;  // x8
    st_127d78_1 *v9;  // x20
    unsigned int v10;  // x8
    unsigned int idx;  // x9
    unsigned int v12;  // w11
    unsigned int v13;  // w9
    unsigned int v14;  // x21
    st_127d78_6 *v15;  // x0
    st_127d78_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_127d78_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    st_127d78_0 **v3;  // [bp-0x48], Other Possible Types: unsigned int
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = 850045863;
    *((char *)&a0->field_40 + 4) = 0;
    a0->field_48 = 0;
    *(uint128_t *)&(&a0->field_0)[1] = 0;
    *(uint128_t *)((char *)&a0->field_8 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_18 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_28 + 8) = 0;
    *(unsigned long long *)&a0->field_50 = 0xffffffffffffffff;
    v6 = operatornew(88);
    sub_126ad8(v6, a1);
    v7 = 2166136261;
    v3 = 0;
    sub_128750(a0->field_38, v6);
    sub_128750(&v3, 0);
    v8 = a0->field_38[0];
    a0->field_38[1] = v8;
    v2 = &v3;
    v3 = &v2;
    v9 = *v8;
    v10 = v9->field_94;
    if (v10)
    {
        idx = 0;
        do
        {
            v12 = *(int *)&v9->field_28[idx];
            v7 = 16777619 * (16777619 * ((v12 * 0x10000 | v12 >> 16) & 0xffff00ff & 0xff ^ 16777619 * ((v12 * &_NSHomeDirectory | v12 >> 8) & 0xff0000ff & 0xff ^ 16777619 * (v12 & 0xff ^ v7))) ^ v12 >> 24);
            idx += 1;
        } while (idx < v10);
    }
    v13 = v9->field_98;
    if (v9->field_98)
    {
        v14 = 0;
        do
        {
            v15 = sub_efa18(v9, v14);
            v16 = v15->field_c;
            v7 = 16777619 * (16777619 * ((v16 * 0x10000 | v16 >> 16) & 0xffff00ff & 0xff ^ 16777619 * ((v16 * &_NSHomeDirectory | v16 >> 8) & 0xff0000ff & 0xff ^ 16777619 * (v16 & 0xff ^ v7))) ^ v16 >> 24);
            if (v16 == 3)
            {
                v17 = v15->field_0;
                v19 = ...;
            }
            else
            {
                if (v16 != 6)
                    continue;
                v20 = v15->field_0->field_10;
                v19 = 16777619 * (__ROL__(v20, 16) & 0xffff00ff & 0xff ^ 16777619 * (__ROL__(v20, 24) & 0xff0000ff & 0xff ^ 16777619 * (v20 & 0xff ^ v7))) ^ v20 >> 24;
            }
            v7 = 16777619 * v19;
        } while ((v14 += 1, v13 = v9->field_98, v13 > v14));
        v10 = v9->field_94;
    }
    v21 = v9->field_9c;
    v23 = ...;
    v24 = 16777619 * (16777619 * (__ROL__(v13, 16) & 0xffff00ff & 0xff ^ 16777619 * (__ROL__(v13, 24) & 0xff0000ff & 0xff ^ 16777619 * (v13 & 0xff ^ v23))) ^ v13 >> 24);
    *(unsigned int *)&a0->field_40 = v24 - 100000 * ((v24 >> 5) * 175921861 >> 39);
    return a0;
}
