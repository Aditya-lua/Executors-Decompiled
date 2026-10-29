/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f36b8..0x1f3848 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f36b8_1 {
    unsigned long long field_0;
    long long field_8;
} st_1f36b8_1;

typedef struct st_1f36b8_2 {
    char padding_0[64];
    unsigned long long field_40;
} st_1f36b8_2;

typedef struct st_1f36b8_3 {
    char padding_0[44];
    unsigned int field_2c;
    char padding_30[24];
    unsigned long long field_48;
} st_1f36b8_3;

typedef struct st_1f36b8_0 {
    char field_0;
} st_1f36b8_0;


long long sub_1f36b8(st_1f36b8_1 *a0)
{
    unsigned long long v11;  // x22
    long long v12;  // x23
    st_1f36b8_2 *v13;  // x20
    unsigned long long v14;  // x20
    unsigned long long v15;  // x0
    st_1f36b8_3 *v16;  // x9
    st_1f36b8_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_1f36b8_0 *v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x98]
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    char v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    if ((unsigned long long)a0->field_8 < 2)
        return sub_1eccac(&v5);
    v11 = 0;
    v12 = 1;
    do
    {
        v13 = a0->field_0 + v11;
        if (sub_1ef140(&v13->padding_0[40]))
        {
            v14 = sub_1f87a8(a0, &v5, v12 + v13->field_40);
            if (v14)
            {
                v2 = 0;
                v3 = 0;
                v4 = 0;
                sub_1ecbe0(&v8, a0->field_8);
                sub_1f2330(&v8);
                v15 = sub_1f4dd0(a0, &v2, v12 + *(long long *)(a0->field_0 + v11 + 72), &v8, 0, 1);
                sub_1eccac(&v8);
                if (!(v15 & 1) && !(sub_1f0bd4(&v5, &v2) & 1))
                {
                    v16 = a0->field_0 + v11;
                    *(unsigned long long *)(a0->field_0 + 40 * v14 + 32) = v12 + v16->field_48 - v14;
                    v16->field_48 = 0;
                    v16->field_2c = 49;
                }
                sub_1eccac(&v2);
            }
        }
    } while ((v12 += 1, v11 += 40, (unsigned long long)a0->field_8 > (unsigned long long)v12));
    return sub_1eccac(&v5);
}
