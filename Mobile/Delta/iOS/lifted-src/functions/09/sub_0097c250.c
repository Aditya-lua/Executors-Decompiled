/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c250..0x97c37c (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c250_0 {
    char padding_0[8];
    struct st_97c250_0 *field_8;
} st_97c250_0;

typedef struct st_97c250_1 {
    long long field_0;
    char padding_8[16];
    struct st_97c250_2 *field_18;
} st_97c250_1;

typedef struct st_97c250_2 {
    unsigned long long field_0;
} st_97c250_2;

typedef struct st_97c250_3 {
    char padding_0[104];
    struct st_97c250_0 *field_68;
    struct st_97c250_1 *field_70;
} st_97c250_3;


void sub_97c250(st_97c250_3 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_97c250_0 *v16;  // x1
    st_97c250_0 *v17;  // x1
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    sub_98e27c();
    if (sub_98e304(a0))
        a0->field_70->field_18();
    v16 = a0->field_68;
    if (a0->field_68)
    {
        do
        {
            v17 = v16;
            sub_9765e4(a0->field_70->field_0);
            v16 = v17->field_8;
        } while (v17->field_8);
    }
}
