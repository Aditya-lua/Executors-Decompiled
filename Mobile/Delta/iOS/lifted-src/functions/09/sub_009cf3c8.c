/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf3c8..0x9cf424 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf3c8_2 {
    long long field_0;
    char padding_8[8];
    unsigned int field_10;
} st_9cf3c8_2;

typedef struct st_9cf3c8_0 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    int field_20;
} st_9cf3c8_0;

typedef struct st_9cf3c8_1 {
    char padding_0[32];
    struct st_9cf3c8_0 *field_20;
} st_9cf3c8_1;


unsigned long long sub_9cf3c8(unsigned long long a0, st_9cf3c8_1 *a1)
{
    st_9cf3c8_0 *v5;  // x9
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_9cf3c8_2 *v9;  // x19
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (*(long long *)a0)
    {
        v5 = a1->field_20;
        if (!v5)
        {
            return a0;
        }
        else if (v5->field_8 >> 1 & 1)
        {
            v0 = v6;
            v1 = v7;
            v2 = &v4;
            v3 = v8;
            v9 = *(long long *)a0 + v5->field_20;
            v10 = sub_a6c2e4(v9->field_0, "crypto/asn1/tasn_utl.c", 157);
            v9->field_0 = 0;
            *(unsigned long long *)v9->padding_8 = 0;
            v9->field_10 = 1;
            return v10;
        }
        else
        {
            return a0;
        }
    }
    else
    {
        return a0;
    }
}
