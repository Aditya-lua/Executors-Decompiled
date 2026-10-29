/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa07e44..0xa08140 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a07e44_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20[25];
    char field_29;
} st_a07e44_0;

extern long long g_f086b8;
extern char g_10002b0;

long long sub_a07e44(long long a0, st_a07e44_0 *a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9)
{
    unsigned long v12;  // x0
    unsigned long v13;  // x19
    unsigned long v14;  // x20
    char v0;  // [bp-0x270]
    char v1;  // [bp-0x239]
    char v2;  // [bp-0x238]
    char v3;  // [bp-0x237]
    char v4;  // [bp-0x168]
    uint128_t v5;  // [bp-0x130]
    uint128_t v6;  // [bp-0x120]
    uint200_t v7;  // [bp-0x110]
    char v8;  // [bp-0xe8]
    char v9;  // [bp-0xb0]
    unsigned long v10;  // [bp-0x78]
    char *v11;  // [bp-0x10]

    v11 = &a8;
    v10 = *(long long *)&g_10002b0;
    v12 = sub_a3f728();
    *(uint128_t *)((char *)&v7 + 9) = 0;
    v6 = 0;
    *(uint128_t *)&v7 = 0;
    v5 = 0;
    if (v12)
    {
        v13 = v12;
        if (sub_a07c8c(a0, &v0, 114, a2, a9))
        {
            v0 &= 252;
            v2 = 0;
            v1 |= 128;
            sub_a0a0cc(&v9, &v0, 57);
            if (sub_a08140(a0, v13, a6, a7, a8, a9) && sub_a3fe10(v13, &v3, 57) && sub_a3fe10(v13, a4, a5))
            {
                sub_a66ec0(&v0, 114);
                if (sub_a400f8(v13, &v0, 114))
                {
                    sub_a0a0cc(&v8, &v0, 114);
                    sub_a66ec0(&v0, 114);
                    sub_a0a654(&v4, &v8);
                    sub_a0a654(&v4, &v4);
                    sub_a05544(&v0, g_f086b8, &v4);
                    sub_a05e24(&v5, &v0);
                    sub_a06058(&v0);
                    sub_a0a0c4(&v4);
                    if (sub_a08140(a0, v13, a6, a7, a8, a9) && sub_a3fe10(v13, &v5, 57) && sub_a3fe10(v13, a3, 57) && sub_a3fe10(v13, a4, a5) && sub_a400f8(v13, &v0, 114))
                    {
                        sub_a0a0cc(&v4, &v0, 114);
                        sub_a66ec0(&v0, 114);
                        sub_a096fc(&v4, &v4, &v9);
                        sub_a09b60(&v4, &v4, &v8);
                        sub_a66ec0(a1, 114);
                        a1->field_0 = v5;
                        a1->field_10 = v6;
                        *(uint128_t *)&a1->field_20[0] = *(uint128_t *)&v7;
                        *(uint128_t *)&a1->field_20[9] = *(uint128_t *)((void*)&v7 + 9);
                        sub_a0a420(&a1->field_29, &v4);
                        sub_a0a0c4(&v9);
                        sub_a0a0c4(&v8);
                        sub_a0a0c4(&v4);
                        v14 = 0xffffffff;
                        goto LABEL_a080f8;
                    }
                }
            }
            else
            {
                sub_a66ec0(&v0, 114);
            }
        }
        v14 = 0;
LABEL_a080f8:
        sub_a3f73c(v13);
    }
    else
    {
        v14 = 0;
    }
    if (*(long long *)&g_10002b0 == v10)
        return v14;
    ___stack_chk_fail();
}
