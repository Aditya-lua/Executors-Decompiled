/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e058..0x97e0f0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e058_1 {
    char padding_0[184];
    unsigned int field_b8;
} st_97e058_1;

typedef struct st_97e058_0 {
    char padding_0[88];
    long long field_58;
} st_97e058_0;

typedef struct st_97e058_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_97e058_2;

extern st_97e058_2 g_d284b0;

long long sub_97e058(void)
{
    unsigned int *v7;  // x9
    unsigned int *v8;  // x10
    unsigned int v9;  // w8
    unsigned long v10;  // x19
    st_97e058_0 *v0;  // [bp-0x58]
    unsigned int *v1;  // [bp-0x40]
    st_97e058_1 *v2;  // [bp-0x38]
    unsigned int v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!sub_97f48c())
        return 1;
    sub_ad9384(sub_c4ba8(v0->field_58));
    v7 = &v2->field_b8;
    v8 = v1 + 94;
    if (!v3)
        v7 = v8;
    v9 = *v7 - 2;
    if (10 >= v9)
        v10 = (&g_d284b0.field_0)[v9];
    else
        v10 = 1;
    sub_ad93b4(sub_c4ba8(v0->field_58));
    return v10;
}
