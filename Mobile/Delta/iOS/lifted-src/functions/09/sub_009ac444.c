/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac444..0x9ac528 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac444_0 {
    char padding_0[8];
    struct st_9ac444_1 *field_8;
} st_9ac444_0;

typedef struct st_9ac444_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9ac444_1;


long long sub_9ac444(st_9ac444_0 *a0, long long a1)
{
    long long v3;  // x0
    long long v4;  // x19
    long long v5;  // x21
    long long v6;  // x20
    char v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_961b9c(a0->field_8->field_0, 982, a0->field_8->field_470);
    if (!v3)
        return 0;
    v4 = v3;
    v5 = sub_a3f728();
    if (v5 && (int)sub_a3fd98(v5, v4) >= 1 && (int)sub_a3fe10(v5, &a0[24].field_8, 32) >= 1 && (int)sub_a3fe10(v5, &a0[22].field_8, 32) >= 1 && (int)sub_a3ff7c(v5, a1, &v0) > 0)
    {
        sub_a3f73c(v5);
        v6 = 1;
    }
    else
    {
        sub_a3f73c(v5);
        v6 = 0;
    }
    sub_961c0c(v4);
    return v6;
}
