/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fd0fc..0x1fd574 (1144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fd0fc_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1fd0fc_1;

typedef struct st_1fd0fc_2 {
    unsigned int field_0;
} st_1fd0fc_2;

typedef struct st_1fd0fc_0 {
    char field_0;
} st_1fd0fc_0;

extern unsigned long long g_e792b0;

long long sub_1fd0fc(unsigned long a0, st_1fd0fc_1 *a1, st_1fd0fc_2 **a2, unsigned long long idx, unsigned long long a4, unsigned long a5)
{
    unsigned int v18;  // w8
    unsigned long long v19;  // x9
    unsigned long long v20;  // x8
    unsigned long long v0;  // [bp-0x118]
    st_1fd0fc_1 *v1;  // [bp-0x110]
    unsigned long long v2;  // [bp-0x108]
    uint128_t v3;  // [bp-0x100]
    uint128_t v4;  // [bp-0xf0]
    st_1fd0fc_0 **v5;  // [bp-0xe0], Other Possible Types: char
    st_1fd0fc_0 *v6;  // [bp-0xd8]
    double v7;  // [bp-0xd0]
    uint128_t v8;  // [bp-0xc8]
    uint128_t v9;  // [bp-0xb8]
    unsigned long v10;  // [bp-0xa8]
    unsigned long v11;  // [bp-0xa0]
    unsigned long v12;  // [bp-0x98]
    unsigned long v13;  // [bp-0x90]
    unsigned long v14;  // [bp-0x88]
    unsigned long v15;  // [bp-0x80]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v6 = &v5;
    v5 = &v6;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v7 = 8.487983164e-313;
    v4 = 1;
    v9 = 1;
    v3 = 0x10000000100000001;
    v8 = 0x10000000100000001;
    a1->field_8 = 0;
    if (a4 <= idx)
    {
        sub_1eccac(&v10);
        sub_1eccac(&v13);
        return 0 == a4 - idx;
    }
    v0 = a4 - idx;
    v1 = a1;
    v2 = a4;
    v18 = *(int *)&(*a2)[10 * idx];
    v19 = 0x88;
    if (v18 == 3)
        v19 = 216;
    if (v18 == 9)
        v19 = 336;
    v20 = 400;
    if (v18 != 11)
        v20 = v19;
    goto *((void *)(*(long long *)((char *)&g_e792b0 + v20)));
}
