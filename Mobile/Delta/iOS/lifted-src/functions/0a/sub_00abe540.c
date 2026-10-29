/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabe540..0xabe680 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_abe540_0 {
    uint128_t field_0;
    struct st_abe540_0 *field_10;
    char padding_18[8];
    struct st_abe540_0 *field_20;
    char padding_28[8];
    struct st_abe540_0 *field_30;
    char padding_38[8];
    struct st_abe540_0 *field_40;
    char padding_48[8];
    struct st_abe540_0 *field_50;
} st_abe540_0;

extern char g_10002b0;

st_abe540_0 * sub_abe540(st_abe540_0 *a0, unsigned int a1, long long a2, long long a3)
{
    st_abe540_0 *v7;  // w0
    char v0;  // [bp-0x64]
    uint128_t v1;  // [bp-0x50]
    uint128_t v2;  // [bp-0x40]
    char v3[8];  // [bp-0x30]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (a1 == 29)
    {
        v7 = (st_abe540_0 *)0;
        if (a0 && a2 == 48)
        {
            sub_abe350(a0, a3, 48);
            v1 = CONCAT(0x3636363636363636, 0x3636363636363636);
            v2 = v1;
            strncpy(v3, "66666666", 8);
            sub_abe350(a0, &v1, 40);
            sub_abe458(&v0, a0);
            *(uint128_t *)&a0->field_20 = 0;
            *(uint128_t *)&a0->field_30 = 0;
            *(uint128_t *)&a0->field_40 = 0;
            *(uint128_t *)&a0->field_50 = 0;
            a0->field_0 = 0x1032547698badcfeefcdab8967452301;
            *(uint128_t *)&a0->field_10 = 0;
            *(unsigned int *)&a0->field_10 = 3285377520;
            sub_abe350(a0, a3, 48);
            v1 = CONCAT(0x5c5c5c5c5c5c5c5c, 0x5c5c5c5c5c5c5c5c);
            v2 = v1;
            strncpy(v3, "\\\\\\\\\\\\\\\\", 8);
            sub_abe350(a0, &v1, 40);
            sub_abe350(a0, &v0, 20);
            sub_a66ec0(&v0, 20);
            v7 = (st_abe540_0 *)1;
        }
    }
    else
    {
        v7 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}
