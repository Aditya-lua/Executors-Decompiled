/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66c58..0xa66ccc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a66c58_0 {
    struct st_a66c58_1 *field_0;
    char padding_8[32];
    struct st_a66c58_2 *field_28;
    char padding_30[8];
    unsigned int field_38;
} st_a66c58_0;

typedef struct st_a66c58_2 {
    unsigned long long field_0;
} st_a66c58_2;

typedef struct st_a66c58_1 {
    struct st_a66c58_0 *field_0;
} st_a66c58_1;


void sub_a66c58(st_a66c58_0 *a0, unsigned long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x21
    unsigned long long v17;  // 4158
    unsigned long v18;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_38 - 1;
    v17 = arm64g_calculate_condition(67, a0->field_38, 1, 0);
    if (v17 & 1)
        return;
    do
    {
        v18 = v16;
        if (*(long long *)&a0->field_0[v18])
            a0->field_28();
    } while ((v16 = v18 - 1, (long long)v18 >= 1));
    return;
}
