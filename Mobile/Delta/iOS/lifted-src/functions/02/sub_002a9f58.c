/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9f58..0x2aa03c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9f58_4 {
    struct st_2a9f58_2 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned int field_18;
} st_2a9f58_4;

typedef struct st_2a9f58_2 {
    unsigned long long field_0;
} st_2a9f58_2;

typedef struct st_2a9f58_5 {
    struct st_2a9f58_6 *field_0;
} st_2a9f58_5;

typedef struct st_2a9f58_6 {
    struct st_2a9f58_5 *field_0;
} st_2a9f58_6;

typedef struct st_2a9f58_0 {
    char field_0;
} st_2a9f58_0;

typedef struct st_2a9f58_3 {
    unsigned long long field_0;
    unsigned int field_8;
} st_2a9f58_3;

typedef struct st_2a9f58_1 {
    struct st_2a9f58_2 *field_0;
    unsigned int field_8;
} st_2a9f58_1;


unsigned long long sub_2a9f58(unsigned long a0, st_2a9f58_1 *a1, long long a2, st_2a9f58_3 *a3)
{
    unsigned long long v8;  // x0
    st_2a9f58_4 *v9;  // x8
    st_2a9f58_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2a9f58_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    st_2a9f58_6 **v4;  // [bp-0x60]
    st_2a9f58_6 **v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = sub_2ae83c(a1, a2);
    if (!(v8 & 1))
    {
        do
        {
            v2 = a3->field_0;
            v3 = 1 << ((char)a3->field_8 & 63);
            v4 = &v5;
            v5 = &v4;
            sub_3b720(&v2, (int)((unsigned long long)(*(long long *)a1->field_0) >> ((char)a1->field_8 & 63)) & 1);
            sub_2ae384(a1);
            sub_2ae384(a3);
            v8 = sub_2ae83c(a1, a2);
        } while (!(unsigned int)v8);
    }
    v9->field_0 = a1->field_0;
    v9->field_8 = a1->field_8;
    v9->field_10 = a3->field_0;
    v9->field_18 = a3->field_8;
    return v8;
}
