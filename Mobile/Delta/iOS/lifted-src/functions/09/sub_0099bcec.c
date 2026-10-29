/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bcec..0x99bd7c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bcec_1 {
    char padding_0[160];
    struct st_99bcec_2 *field_a0;
} st_99bcec_1;

typedef struct st_99bcec_3 {
    char padding_0[2304];
    struct st_99bcec_0 *field_900;
    char padding_908[872];
    struct st_99bcec_1 *field_c70;
} st_99bcec_3;

typedef struct st_99bcec_2 {
    unsigned long long field_0;
} st_99bcec_2;

typedef struct st_99bcec_0 {
    char padding_0[856];
    struct st_99bcec_0 *field_358;
} st_99bcec_0;


int sub_99bcec(st_99bcec_3 *a0)
{
    st_99bcec_0 *v7;  // x8
    unsigned int v8;  // w9
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a0->field_900;
    if (!v7)
        return 1;
    v8 = (char)v7->field_358;
    if (v8 == 0xff)
    {
        *(char *)&v7->field_358 = 0;
        return 1;
    }
    if (3 < v8 - 1)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = &v6;
    v5 = v13;
    a0->field_c70->field_a0();
}
