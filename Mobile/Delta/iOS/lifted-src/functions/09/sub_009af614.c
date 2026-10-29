/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af614..0x9af678 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9af614_2 {
    char padding_0[216];
    struct st_9af614_0 *field_d8;
} st_9af614_2;

typedef struct st_9af614_0 {
    char padding_0[24];
    struct st_9af614_1 *field_18;
} st_9af614_0;

typedef struct st_9af614_1 {
    unsigned long long field_0;
} st_9af614_1;

typedef struct st_9af614_3 {
    char padding_0[24];
    struct st_9af614_2 *field_18;
    char padding_20[88];
    unsigned int field_78;
} st_9af614_3;


void sub_9af614(st_9af614_3 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // 4107
    unsigned long long v10;  // 4107
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_78;
    if (!a0->field_78)
    {
        v9 = arm64g_calculate_condition(3, v8, 0, 0);
        if (!(v9 & 1))
            goto LABEL_9af64a;
LABEL_9af649:
    }
    else
    {
        v10 = arm64g_calculate_condition(3, v8, 0, 0);
        if (v10 & 1)
            goto LABEL_9af649;
LABEL_9af64a:
    }
    a0->field_18->field_d8->field_18();
}
