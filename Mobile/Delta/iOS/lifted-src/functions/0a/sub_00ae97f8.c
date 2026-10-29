/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae97f8..0xae98d8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae97f8_1 {
    long long field_0;
    struct st_ae97f8_0 *field_8;
} st_ae97f8_1;

typedef struct st_ae97f8_2 {
    struct st_ae97f8_0 *field_0;
    struct st_ae97f8_1 *field_8;
} st_ae97f8_2;

typedef struct st_ae97f8_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ae97f8_0 *field_8;
} st_ae97f8_0;

extern unsigned long long g_c7c2eb;

int sub_ae97f8(unsigned long a0, st_ae97f8_2 *a1, long long a2, unsigned long long a3)
{
    st_ae97f8_0 *v6;  // x8
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    st_ae97f8_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = a3;
    v1 = &g_c7c2eb;
    sub_9d524c(a2, "%*sPath Length Constraint: ");
    if (a1->field_0)
        sub_9c994c(a2);
    else
        sub_9d524c(a2, "infinite");
    sub_9d4888(a2, "\n");
    v0 = a3;
    v1 = &g_c7c2eb;
    sub_9d524c(a2, "%*sPolicy Language: ");
    sub_9c3060(a2, a1->field_8->field_0);
    v6 = a1->field_8->field_8;
    if (!v6)
    {
        return 1;
    }
    else if (v6->field_8)
    {
        v2 = v6->field_0;
        v3 = v6->field_8;
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "\n%*sPolicy Text: %.*s");
        return 1;
    }
    else
    {
        return 1;
    }
}
