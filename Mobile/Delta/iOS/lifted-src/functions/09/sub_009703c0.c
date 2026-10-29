/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9703c0..0x97057c (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9703c0_0 {
    char padding_0[8];
    struct st_9703c0_1 *field_8;
} st_9703c0_0;

typedef struct st_9703c0_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9703c0_1;

extern char g_10002b0;

long long sub_9703c0(st_9703c0_0 *a0, long long a1, long long a2, long long a3, long long a4, unsigned long a5, unsigned long a6, long long a7)
{
    long long v9;  // x20
    long long v10;  // x19
    long long v11;  // x21
    long long v0;  // [bp-0x150]
    char v1;  // [bp-0x138], Other Possible Types: unsigned int
    char v2;  // [bp-0x134], Other Possible Types: unsigned int
    char v3;  // [bp-0x130]
    char v4;  // [bp-0xf0]
    char v5;  // [bp-0xb0]
    unsigned long v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v9 = sub_95a6a8();
    v10 = sub_a3f728(v9);
    v11 = 0;
    if (v10 && v9)
    {
        if (sub_9a66ec(a0) && (int)sub_a3fe04(v10, v9, 0) >= 1)
        {
            if ((int)sub_a3fe10() < 1 || (int)sub_a3ff7c(v10, &v4, &v2) < 1 || (int)sub_a3fe04(v10, v9, 0) < 1 || (int)sub_a3ff7c(v10, &v3, &v1) < 1 || (*(unsigned int *)&v0 = 1, !sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, v9, (char *)&a0[127].field_8 + 4, a3, a4, &v3, v1, &v5, v2, v0)))
                goto LABEL_970530;
            *(unsigned int *)&v0 = 1;
            v11 = sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, v9, &v5, "exporter", 8, &v4, v2, a1, a2, v0);
        }
        else
        {
LABEL_970530:
            v11 = 0;
        }
    }
    sub_a3f73c(v10);
    if (*(long long *)&g_10002b0 == v6)
        return v11;
    ___stack_chk_fail();
}
