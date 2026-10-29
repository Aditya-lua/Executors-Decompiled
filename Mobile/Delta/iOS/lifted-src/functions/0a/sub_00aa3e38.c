/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa3e38..0xaa3fb0 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa3e38_0 {
    char padding_0[24];
    long long field_18;
} st_aa3e38_0;

typedef struct st_aa3e38_2 {
    char padding_0[20];
    unsigned int field_14;
    long long field_18;
    struct st_aa3e38_1 *field_20;
} st_aa3e38_2;

typedef struct st_aa3e38_1 {
    char padding_0[40];
    struct st_aa3e38_0 *field_28;
} st_aa3e38_1;


unsigned long long sub_aa3e38(st_aa3e38_2 *a0, unsigned int a1, unsigned long long a2)
{
    unsigned int v2;  // w0
    st_aa3e38_1 *v3;  // x8
    unsigned long long v4;  // x20
    long long v5;  // x1
    long long v6;  // x1
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99eac(a0->field_18);
    if (a1 != 2)
    {
        if (a1 != 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs7/pk7_lib.c", 66, "PKCS7_ctrl");
            v5 = 110;
        }
        else if (v2 == 22)
        {
            v3 = a0->field_20;
            if (v3)
            {
                a0->field_14 = a2;
                if (!(a2 * 0x100000000))
                    return 0;
                v4 = (int)a2;
                if (sub_a99eac(v3->field_28->field_18) != 21)
                    return v4;
                sub_9cf0f4(*(long long *)&a0->field_20->field_28[1].padding_0[0]);
                *(unsigned long long *)&a0->field_20->field_28[1].padding_0[0] = 0;
                return v4;
            }
            sub_a368c8();
            sub_a369bc("crypto/pkcs7/pk7_lib.c", 32, "PKCS7_ctrl");
            v5 = 122;
        }
        else
        {
            sub_a368c8();
            v6 = 45;
LABEL_aa3f4c:
            sub_a369bc("crypto/pkcs7/pk7_lib.c", v6, "PKCS7_ctrl");
            v5 = 104;
        }
        sub_a36abc(33, v5, 0);
        return 0;
    }
    if (v2 == 22)
    {
        if (a0->field_20 && a0->field_20->field_28)
        {
            v7 = !*(long long *)&a0->field_20->field_28[1].padding_0[0];
            a0->field_14 = v7;
            return v7;
        }
        a0->field_14 = 1;
        return 1;
    }
    sub_a368c8();
    v6 = 60;
    goto LABEL_aa3f4c;
    goto LABEL_aa3f4c;
}
