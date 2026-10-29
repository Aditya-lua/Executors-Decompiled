/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99093c..0x9909fc (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99093c_0 {
    struct st_99093c_1 *field_0;
    char padding_8[16];
    struct st_99093c_2 *field_18;
} st_99093c_0;

typedef struct st_99093c_2 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_99093c_2;

typedef struct st_99093c_1 {
    char field_0;
} st_99093c_1;


unsigned int sub_99093c(unsigned long a0, st_99093c_0 *a1)
{
    char *v7;  // x19
    unsigned int v8;  // w0
    unsigned int v9;  // w9
    unsigned int v10;  // w10
    unsigned int v11;  // w8
    unsigned int v12;  // w8
    char v0;  // [bp-0x25]
    char v1;  // [bp-0x24]
    char v2;  // [bp-0x23]
    char v3;  // [bp-0x22]
    char v4;  // [bp-0x21]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = &a1->field_18->field_0;
    v8 = sub_9909fc();
    if (!v8)
        return v8;
    v9 = *(char *)a1->field_0;
    if (0 <= (char)v9)
        v10 = 31;
    else
        v10 = 15;
    v11 = v10 & v0 ^ v9;
    *(char *)a1->field_0 = v11;
    *v7 = *v7 ^ v1;
    if (!(v11 & 3))
        return 1;
    v12 = (v11 & 3) + 1;
    v7[1] = v7[1] ^ v2;
    if (v12 != 2)
    {
        v7[2] = v7[2] ^ v3;
        if (v12 != 3)
            v7[3] = v7[3] ^ v4;
    }
    return 1;
}
