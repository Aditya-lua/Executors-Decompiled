/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956e18..0x956ec0 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956e18_2 {
    char padding_0[24];
    struct st_956e18_1 *field_18;
    char padding_20[1256];
    unsigned int field_508;
} st_956e18_2;

typedef struct st_956e18_1 {
    int field_0;
    char padding_4[212];
    struct st_956e18_0 *field_d8;
} st_956e18_1;

typedef struct st_956e18_0 {
    char padding_0[80];
    char field_50;
} st_956e18_0;


char sub_956e18(st_956e18_2 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        if (a0->field_508 || sub_96ef34(a0, sub_95a6a8(), 0, 0, 0, &a0[1].padding_20[80]))
            return sub_96f1fc() != 0;
        return 0;
        return sub_96f1fc() != 0;
    }
}
