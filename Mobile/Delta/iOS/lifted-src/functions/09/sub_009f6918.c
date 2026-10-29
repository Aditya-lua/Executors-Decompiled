/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6918..0x9f6a1c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6918_1 {
    struct st_9f6918_0 *field_0;
    char padding_8[56];
    char field_40;
    char field_41;
    char padding_42[6];
    long long field_48;
    unsigned long long field_50;
} st_9f6918_1;

typedef struct st_9f6918_0 {
    struct st_9f6918_0 *field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
} st_9f6918_0;


long long sub_9f6918(st_9f6918_1 *a0, st_9f6918_0 *a1)
{
    long long v2;  // x19
    long long v3;  // x20
    long long v4;  // x19
    st_9f6918_0 *v5;  // x8
    st_9f6918_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9f78ac())
    {
        v2 = 107;
        v3 = 159;
    }
    else if ((int)a0->field_0)
    {
        v2 = 103;
        v3 = 164;
    }
    else
    {
        v4 = a0->field_50 + 4;
        if (!a1)
            return v4;
        v5 = a1->field_0;
        if (v5)
        {
            v6 = (char *)v5 + v4;
        }
        else
        {
            v5 = sub_a6bf4c(v4, "crypto/ct/ct_oct.c", 180);
            v6 = v5;
            if (!v6)
            {
                sub_a6c2e4(0, "crypto/ct/ct_oct.c", 194);
                return 0xffffffff;
            }
        }
        a1->field_0 = v6;
        *(char *)&v5->field_0 = a0->field_40;
        *((char *)&v5->field_0 + 1) = a0->field_41;
        *((char *)&v5->field_0 + 2) = a0->field_50 >> 8;
        *((char *)&v5->field_0 + 3) = a0->field_50;
        _memcpy((char *)&v5->field_0 + 4, a0->field_48, a0->field_50);
        return v4;
    }
    sub_a368c8();
    sub_a369bc("crypto/ct/ct_oct.c", v3, "i2o_SCT_signature");
    sub_a36abc(50, v2, 0);
    sub_a6c2e4(0, "crypto/ct/ct_oct.c", 194);
    return 0xffffffff;
}
