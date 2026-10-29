/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990bf4..0x990cb4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_990bf4_0 {
    struct st_990bf4_1 *field_0;
    char padding_8[16];
    struct st_990bf4_2 *field_18;
} st_990bf4_0;

typedef struct st_990bf4_2 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_990bf4_2;

typedef struct st_990bf4_1 {
    char field_0;
} st_990bf4_1;


unsigned int sub_990bf4(unsigned long a0, st_990bf4_0 *a1)
{
    char *v7;  // x19
    char *v8;  // x20
    unsigned int v9;  // w0
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    unsigned int v12;  // w9
    char v13;  // x10
    char v0;  // [bp-0x25]
    char v1;  // [bp-0x24]
    char v2;  // [bp-0x23]
    char v3;  // [bp-0x22]
    char v4;  // [bp-0x21]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1->field_0;
    v8 = &a1->field_18->field_0;
    v9 = sub_9909fc();
    if (!v9)
        return v9;
    v10 = *v7;
    *v8 = *v8 ^ v1;
    if (v10 & 3)
    {
        v11 = (v10 & 3) + 1;
        v8[1] = v8[1] ^ v2;
        if (v11 != 2)
        {
            v8[2] = v8[2] ^ v3;
            if (v11 != 3)
                v8[3] = v8[3] ^ v4;
        }
    }
    v12 = *v7;
    if (0 <= (int)v12)
        v13 = 31;
    else
        v13 = 15;
    *v7 = v13 & v0 ^ (char)v12;
    return 1;
}
