/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac5298..0xac5464 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac5298_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_ac5298_1;

extern char g_10002b0;

long long sub_ac5298(void* a0, unsigned long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v14;  // x19
    void* v15;  // x28
    long long v16;  // x21
    unsigned long v17;  // x20
    st_ac5298_1 *v18;  // x27
    unsigned long v20;  // x19
    uint128_t v0;  // [bp-0x150]
    uint128_t v1;  // [bp-0x140]
    unsigned long long v2;  // [bp-0x130]
    uint128_t v3;  // [bp-0x100]
    uint128_t v4;  // [bp-0xf0]
    unsigned long long v5;  // [bp-0xe0]
    uint128_t v6;  // [bp-0xd8]
    uint128_t v7;  // [bp-0xb0]
    uint128_t v8;  // [bp-0xa0]
    uint128_t v9;  // [bp-0x90]
    uint128_t v10;  // [bp-0x80]
    unsigned long v11;  // [bp-0x70]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a5;
    v11 = *(long long *)&g_10002b0;
    v15 = *(long long *)a0;
    v16 = (long long)a0[24];
    v17 = *(int *)((long long)v15[160] + 16);
    v9 = 0;
    v10 = 0;
    v7 = 0;
    v8 = 0;
    if (!(int)a0[32])
    {
        v18 = &v3;
        sub_a71618("digest", sub_a50a58((long long)v15[192]), 0);
        if ((long long)v15[144])
        {
            sub_a71618("properties");
            v3 = v0;
            v4 = v1;
            v5 = v2;
            v18 = &v6;
        }
        sub_a71bbc();
        v18->field_0 = v0;
        v18->field_10 = v1;
        v18->field_20 = v2;
        *(unsigned int *)&a0[32] = 1;
    }
    if (sub_a58104(v16) == 1 && sub_a58164(v16, a2, v17) == 1 && sub_a58164(v16, a3, a4) == 1 && sub_a58170(v16, &v7, 0, 64) == 1)
        v20 = sub_a6ebd4(v14, &v7, v17) != 0;
    else
        v20 = 0;
    sub_a66ec0(&v7, 64);
    if (*(long long *)&g_10002b0 == v11)
        return v20;
    ___stack_chk_fail();
}
