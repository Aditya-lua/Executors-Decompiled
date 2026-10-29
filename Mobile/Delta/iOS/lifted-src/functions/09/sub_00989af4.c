/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989af4..0x989bd4 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989af4_0 {
    char padding_0[88];
    unsigned long long field_58;
    char padding_60[24];
    long long field_78;
    char padding_80[32];
    char field_a0;
    char padding_a1[95];
    unsigned long long field_100;
} st_989af4_0;


int sub_989af4(long long a0, st_989af4_0 *a1, unsigned long long a2, unsigned long a3)
{
    unsigned long v8;  // x8
    unsigned int v9;  // w9
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_989af4_0 *v15;  // x21
    st_989af4_0 *v16;  // x20
    char v0;  // [bp-0x38], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v8 = a1->field_100;
    v9 = ((unsigned int)v8 * 0x10000 | (unsigned int)v8 >> 16) & 0xffff00ff & 0xff;
    if (v9 - 4 < 3)
    {
        return 1;
    }
    else if (2 >= v9 - 1)
    {
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = &v7;
        v6 = v14;
        if (4 >= v9 - 2)
        {
            v15 = a1;
            if (sub_97bebc(&a1->field_a0, &v0) && v0 != a3)
                return 0;
            v8 = v15->field_100;
            a1 = v15;
        }
        a1->field_58 = a2;
        a1->field_100 = v8 & 0xfffffffbff00ffff | 0x50000;
        v16 = a1;
        sub_9860e8(a1->field_78);
        v16->field_78 = 0;
        sub_98959c(a0, v16);
        return 1;
    }
    else
    {
        return 0;
    }
}
