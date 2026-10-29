/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa3b80..0xaa3d38 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa3b80_0 {
    char padding_0[16];
    struct st_aa3b80_1 *field_10;
    long long field_18;
    char padding_20[8];
    long long field_28;
    char padding_30[8];
    long long field_38;
    long long field_40;
} st_aa3b80_0;

typedef struct st_aa3b80_1 {
    long long field_0;
} st_aa3b80_1;


int sub_aa3b80(st_aa3b80_0 *a0)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    long long v7;  // x0
    long long v8;  // x0
    long long v9;  // x0
    long long v10;  // x0
    unsigned long v0;  // [bp-0x58]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = 0;
    v5 = sub_a58d60(sub_a9976c(sub_a99eac(*(long long *)a0->field_10)));
    if (v5)
    {
        v6 = sub_a3f728();
        if (v6)
        {
            v7 = sub_a50a58(v5);
            v8 = sub_a2d030(a0->field_40);
            v9 = sub_9f2aec(a0->field_40);
            if ((int)sub_a565c4(v6, &v2, v7, v8, v9, a0->field_38, 0) < 1 || (v10 = sub_aa2758(), sub_9ccc7c(a0->field_18, &v1, sub_aa2758()) >> 31 & 1 || !v1 || (int)sub_a56f14(v6) < 1 || (sub_a6c2e4(v1, "crypto/pkcs7/pk7_doit.c", 982), v1 = 0, (int)sub_a5727c(v6, 0, &v0) < 1 || (v1 = sub_a6bf4c(v0, "crypto/pkcs7/pk7_doit.c", 986), !v1 || (int)sub_a5727c(v6, v1, &v0) < 1))))
                goto LABEL_aa3d00;
            sub_a3f73c(v6);
            sub_9c79a0(a0->field_28, v1, (unsigned int)v0);
            v5 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs7/pk7_doit.c", 965, "PKCS7_SIGNER_INFO_sign");
            sub_a36abc(33, 0x80006, 0);
LABEL_aa3d00:
            sub_a6c2e4(v1, "crypto/pkcs7/pk7_doit.c", 999);
            sub_a3f73c(v6);
            v5 = 0;
        }
    }
    return v5;
}
