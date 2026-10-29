/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c044..0x97c250 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c044_1 {
    unsigned long long field_0;
} st_97c044_1;

typedef struct st_97c044_0 {
    char padding_0[88];
    struct st_97c044_1 *field_58;
} st_97c044_0;

typedef struct st_97c044_2 {
    char padding_0[112];
    struct st_97c044_0 *field_70;
} st_97c044_2;


int sub_97c044(st_97c044_2 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
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
    sub_98e304(a0);
    if (!a0->field_70->field_58)
        sub_97c08c(); /* do not return */
    a0->field_70->field_58();
}
