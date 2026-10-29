/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a3478..0x2a3554 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a3478_1 {
    char padding_0[12];
    unsigned int field_c;
} st_2a3478_1;

typedef struct st_2a3478_0 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[4];
    unsigned int field_2c;
} st_2a3478_0;

typedef struct st_2a3478_2 {
    char padding_0[72];
    struct st_2a3478_0 *field_48;
    char padding_50[8];
    struct st_2a3478_1 *field_58;
} st_2a3478_2;

typedef struct st_2a3478_4 {
    unsigned long long field_0;
} st_2a3478_4;

typedef struct st_2a3478_3 {
    char padding_0[32];
    struct st_2a3478_4 *field_20;
} st_2a3478_3;

extern st_2a3478_3 *g_f0d3d8;

void sub_2a3478(st_2a3478_2 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_2a3478_1 *v12;  // x10
    st_2a3478_0 *v13;  // x8
    st_2a3478_1 *i;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_3c5e8c();
    sub_3c5de4(a0, 8);
    v12 = a0->field_58;
    v13 = a0->field_48;
    i = &v13->field_20;
    if (i > a0->field_58)
    {
        do
        {
            a0->field_58 = &v12[1];
            v12->field_c = 0;
            v12 = a0->field_58;
            v13 = a0->field_48;
            i = &a0->field_48->field_20;
        } while (a0->field_58 < i);
    }
    a0->field_58 = i;
    v13->field_20 = 0;
    v13->field_2c = 3;
    a0->field_58 = a0->field_58 + 1;
    g_f0d3d8->field_20();
}
