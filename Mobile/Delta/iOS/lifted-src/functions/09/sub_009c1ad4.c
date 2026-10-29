/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1ad4..0x9c1c08 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c1ad4_0 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_9c1ad4_1 *field_8;
} st_9c1ad4_0;

typedef struct st_9c1ad4_1 {
    struct st_9c1ad4_0 *field_0;
} st_9c1ad4_1;


st_9c1ad4_0 * sub_9c1ad4(long long a0, st_9c1ad4_0 *a1, unsigned long long a2)
{
    st_9c1ad4_0 *v2;  // x20
    long long v3;  // x21
    st_9c1ad4_0 *v4;  // x19
    unsigned int v5;  // w0
    unsigned int v6;  // w9
    unsigned long long v7;  // 4167
    unsigned long v8;  // x23
    long long v9;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = 524301;
    if (a1)
    {
        v2->field_4 = a2;
        v4 = v2;
LABEL_9c1b18:
        if (sub_9e5c94(a0) && !sub_9e4828(a0))
            v4->field_4 = v4->field_4 | 258;
        v5 = sub_9e46a8(a0);
        v6 = v5 + 14;
        v7 = arm64g_calculate_condition(177, v5, 7, 0);
        v8 = (15 <= v6 ? (int)((v7 & 1 ? v6 : v5 + 7)) >> 3 : 1);
        if (sub_9c7770(v4, 0, v8))
        {
            if (sub_9e4828(a0))
            {
                *(char *)&v4->field_8->field_0 = 0;
                v4->field_0 = v8;
                return v4;
            }
            v4->field_0 = sub_9e5350(a0);
            return v4;
        }
        v9 = 492;
    }
    else
    {
        v4 = sub_9c79e8(a2);
        if (v4)
            goto LABEL_9c1b18;
        v3 = 524554;
        v9 = 479;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/a_int.c", v9, "bn_to_asn1_string");
    sub_a36abc(13, v3, 0);
    if (v4 != v2)
        sub_9cf124(v4);
    return 0;
}
