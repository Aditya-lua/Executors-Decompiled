/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc668d8..0xc669c0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c668d8_1 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_c668d8_0 *field_98;
} st_c668d8_1;

typedef struct st_c668d8_0 {
    char padding_0[8];
    long long field_8;
} st_c668d8_0;


long long sub_c668d8(st_c668d8_1 *a0, long long a1, unsigned long long *a2, long long a3, long long a4)
{
    long long v3;  // x0
    long long v4;  // w0
    long long v5;  // x0
    long long v6;  // w0
    unsigned long v7;  // x8
    char v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a59bc4(a0->field_88);
    v4 = (unsigned int)sub_a16b20(v3);
    if (v4 < 1)
    {
LABEL_c66958:
        return 0;
    }
    if (!a1)
    {
        v7 = v4;
    }
    else if (v4 > *a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_pmeth.c", 128, "pkey_ec_sign");
        sub_a36abc(16, 100, 0);
        goto LABEL_c66958;
    }
    else
    {
        if (a0->field_98->field_8)
            v5 = sub_9c7b68(a0->field_98->field_8);
        else
            v5 = 64;
        v6 = (unsigned int)sub_a20028(v5, a3, a4, a1, &v0, v3);
        if (v6 < 1)
            return v6;
        v7 = v0;
    }
    *a2 = v7;
    return 1;
}
