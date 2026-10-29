/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc44d00..0xc45084 (900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c44d00_4 {
    struct st_c44d00_3 *field_0;
    unsigned long long field_8;
} st_c44d00_4;

typedef struct st_c44d00_2 {
    long long field_0;
    struct st_c44d00_0 *field_8;
} st_c44d00_2;

typedef struct st_c44d00_0 {
    char padding_0[24];
    struct st_c44d00_1 *field_18;
} st_c44d00_0;

typedef struct st_c44d00_3 {
    struct st_c44d00_2 *field_0;
    char padding_8[16];
    char field_18;
    char padding_19[7];
    char field_20;
} st_c44d00_3;

typedef struct st_c44d00_1 {
    unsigned long long field_0;
} st_c44d00_1;

typedef struct st_c44d00_5 {
    char padding_0[8];
    char field_8;
} st_c44d00_5;

extern unsigned long long g_bef1c8;
extern unsigned long long g_c45084;
extern unsigned long long g_c4513c;
extern long long g_cba67f;
extern long long g_e0d5de;
extern long long g_e0d5e9;
extern long long g_e0d604;

char sub_c44d00(st_c44d00_4 *a0, char a1, void* a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    st_c44d00_3 *v12;  // x21
    st_c44d00_2 *v13;  // x8
    unsigned long v0;  // [bp-0xd8]
    char *v1;  // [bp-0xd0], Other Possible Types: st_c44d00_5 *, uint128_t
    unsigned long long v2;  // [bp-0xc8]
    uint128_t v3;  // [bp-0xc0], Other Possible Types: char
    unsigned short v4;  // [bp-0xb8]
    uint128_t v5;  // [bp-0xb0]
    uint128_t v6;  // [bp-0xa0]
    uint128_t v7;  // [bp-0x90]
    char *v8;  // [bp-0x78]
    unsigned long long v9;  // [bp-0x70]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a0->field_0;
    v0 = a1;
    if (!a1 && !(v12->field_20 & 1))
    {
        a0->field_8 = a0->field_8 + 1;
        return 0;
    }
    v13 = v12->field_0;
    if (a0->field_8)
        v13->field_8->field_18();
    v1 = &v12->field_18;
    v2 = &g_bef1c8;
    if (sub_be769c(v13->field_0, v13->field_8, &g_e0d5de, &v1) & 1 || v12->field_20 == 1 && !(v1 = &v0, v2 = &g_c45084, v3 = 0, v4 = 18, !(sub_be769c(v12->field_0->field_0, v12->field_0->field_8, &g_e0d5e9, &v1) & 1)))
        return 1;
    if (*(long long *)a2 == 3)
    {
        v12->field_0->field_8->field_18();
    }
    else if (v12->field_20 & 1)
    {
        v5 = (int128_t)a2[32];
        v6 = (int128_t)a2[48];
        v7 = (int128_t)a2[64];
        v1 = *(int128_t *)a2;
        v3 = (int128_t)a2[16];
        v8 = &v1;
        v9 = &g_c4513c;
        if (!(sub_be769c(v12->field_0->field_0, v12->field_0->field_8, &g_cba67f, &v8) & 1))
            v12->field_0->field_8->field_18();
    }
    else
    {
        v5 = (int128_t)a2[32];
        v6 = (int128_t)a2[48];
        v7 = (int128_t)a2[64];
        v1 = *(int128_t *)a2;
        v3 = (int128_t)a2[16];
        v8 = &v1;
        v9 = &g_c4513c;
        if (!(sub_be769c(v12->field_0->field_0, v12->field_0->field_8, &g_e0d604, &v8) & 1))
            v12->field_0->field_8->field_18();
    }
    return 1;
}
