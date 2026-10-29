/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bdd98..0x1bdfd0 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bdd98_0 {
    char field_0;
} st_1bdd98_0;

typedef struct st_1bdd98_2 {
    st_1bdd98_0 field_0;
} st_1bdd98_2;

extern char g_e6fe88;
extern char g_10002b0;

void* sub_1bdd98(void* a0, unsigned long a1, unsigned long a2, long long a3, long long a4, long long a5)
{
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x0
    long long v15;  // x0
    long long v16;  // x0
    st_1bdd98_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_1bdd98_0 *v1;  // [bp-0xa0]
    char v2;  // [bp-0x91]
    char *v3;  // [bp-0x90]
    char v4;  // [bp-0x88]
    st_1bdd98_2 **v5;  // [bp-0x68], Other Possible Types: void*
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v9 = sub_1a23b8();
    *(char **)a0 = &g_e6fe88;
    *(unsigned long *)&a0[920] = 850045863;
    memset(a0 + 928, 0, 96);
    v10 = sub_961bfc(sub_95419c(v9));
    *(long long *)&a0[912] = v10;
    sub_960f58(v10, 123, 0x303, 0);
    v11 = sub_2fa10(a0 + 8, 0);
    v12 = sub_2fa10(a0 + 8, sub_6b08(a0 + 8));
    v5 = a0;
    sub_1a7230(&v4, &v5, &v2);
    sub_1be4bc(&v5, &v4);
    sub_1a413c(v11, v12, 46, -0x1, &v5);
    sub_181a8(&v5);
    sub_181a8(&v4);
    v5 = &v3;
    v3 = &v5;
    if (sub_6b08(a3))
    {
        v5 = &v3;
        v3 = &v5;
        if (sub_6b08(a4))
        {
            v5 = &v3;
            v3 = &v5;
            if (sub_6b08(a5))
            {
                v13 = sub_a0c8(a5);
                sub_961c7c((long long)a0[912], v13);
            }
            v14 = sub_a0c8(a3);
            if (sub_964ac8((long long)a0[912], v14, 1) != 1 || (v15 = sub_a0c8(a4), sub_964ccc((long long)a0[912], sub_a0c8(a4), 1) != 1))
            {
                sub_95e3b8((long long)a0[912]);
                *(unsigned long long *)&a0[912] = 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return a0;
    v16 = ___stack_chk_fail();
    sub_181a8(&v5);
    sub_181a8(&v4);
    v3 = a0 + 992;
    sub_271a8(&v3);
    sub_1af8c8(a0);
    __Unwind_Resume(v16);
}
