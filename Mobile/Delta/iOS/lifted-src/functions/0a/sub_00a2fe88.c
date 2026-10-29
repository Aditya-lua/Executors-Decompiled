/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2fe88..0xa2ffe8 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2fe88_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
} st_a2fe88_0;


int sub_a2fe88(long long a0, st_a2fe88_0 *a1)
{
    unsigned long v3;  // x0
    unsigned long v4;  // x0
    unsigned long v5;  // x8
    unsigned long long v6;  // 4118
    unsigned long v7;  // x8
    unsigned long long v8;  // 4118
    unsigned long v9;  // x8
    unsigned long long v0;  // [bp-0x30], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1->field_34;
    if ((unsigned int)v3)
    {
        v4 = sub_a2d030(sub_a60658(v3));
        if (!v4 || !(v0 = v4, (int)sub_9d524c(a0, "GROUP: %s\n") >= 1))
            goto LABEL_a2ffd4;
    }
    else if (!sub_a2fa60(a0, "P:   ", a1->field_0) || a1->field_8 && !sub_a2fa60(a0, "Q:   ") || !sub_a2fa60(a0, "G:   ", a1->field_10) || a1->field_18 && !sub_a2fa60(a0, "J:   ") || a1->field_20 && !sub_a2fd10(a0, "SEED:") || !(v5 = a1->field_38, v6 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0), (v6 & 1 || (v0 = v5, (int)sub_9d524c(a0, "gindex: %d\n") >= 1)) && (v7 = a1->field_30, v8 = arm64g_calculate_condition(1, v7 & 0xffffffff, 1, 0), (v8 & 1 || (v0 = v7, (int)sub_9d524c(a0, "pcounter: %d\n") >= 1)) && (v9 = a1->field_3c, !(unsigned int)v9 || !(v0 = v9, 0 >= (int)sub_9d524c(a0, "h: %d\n"))))))
    {
LABEL_a2ffd4:
        return 0;
    }
    return 1;
}
