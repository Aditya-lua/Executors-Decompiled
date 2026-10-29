/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80ff8..0xa8117c (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80ff8_0 {
    struct st_a80ff8_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_a80ff8_0;

typedef struct st_a80ff8_2 {
    unsigned short field_0;
    char field_2;
} st_a80ff8_2;

typedef struct st_a80ff8_1 {
    unsigned int field_0;
} st_a80ff8_1;

extern unsigned int g_7fe000;
extern char g_10002b0;

unsigned long long sub_a80ff8(long long a0, long long a1, uint128_t *a2, st_a80ff8_0 *a3)
{
    unsigned int *iter;  // x22
    unsigned long long v9;  // x8
    unsigned int v18;  // w10
    unsigned long long v10;  // x23
    unsigned long long v11;  // x9
    unsigned long long i;  // x25
    unsigned long long v13;  // x8
    unsigned long long v14;  // w26
    unsigned long long v15;  // x8
    st_a80ff8_2 *v16;  // x9
    unsigned int v17;  // w9
    uint128_t v0;  // [bp-0x140]
    uint128_t v1;  // [bp-0x130]
    char v2;  // [bp-0x120]
    char v3;  // [bp-0x11f]
    unsigned short v4;  // [bp-0x110]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v0 = *a2;
    v1 = a2[1];
    iter = a3->field_0;
    v9 = a3->field_8;
    if (v9)
    {
        v10 = 0;
        v11 = a3->field_10;
        do
        {
            if (v11)
            {
                i = 0;
                do
                {
                    v3 = v10;
                    v2 = i;
                    if (sub_a3f7f0(a0, a1, 0) != 1 || sub_a3fe10(a0, &v0, 0x22) != 1 || sub_a403bc(a0, &v4, 168) != 1)
                    {
LABEL_a8113c:
                        if (*(long long *)&g_10002b0 == v5)
                            return 0;
                        ___stack_chk_fail();
                    }
                    v13 = 0;
                    v14 = 0;
                    while (1)
                    {
                        v15 = v13;
                        v16 = (char *)&v4 + v15;
                        v17 = v16->field_2;
                        v18 = (v16->field_0 | (v17 * 0x10000 | v17 >> 16) & 0x7f0000) & 0x7fffff;
                        iter[v14] = v18;
                        if (&g_7fe000 >= v18)
                            break;
LABEL_a810cc:
                        v13 = v15 + 3;
                        if (165 <= v15 && (v13 = 0, !sub_a403bc(a0, &v4, 168)))
                            goto LABEL_a8113c;
                    }
                    if (254 >= v14)
                    {
                        v14 += 1;
                        goto LABEL_a810cc;
                    }
                    iter += 0x100;
                    i += 1;
                    v11 = a3->field_10;
                } while (a3->field_10 > i);
                v9 = a3->field_8;
            }
        } while ((v10 += 1, v10 < v9));
    }
    if (*(long long *)&g_10002b0 == v5)
        return 1;
    ___stack_chk_fail();
}
