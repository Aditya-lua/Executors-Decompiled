/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52328..0xb5255c (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52328_1 {
    char padding_0[60];
    unsigned long long field_3c;
    unsigned int field_44;
} st_b52328_1;

typedef struct st_b52328_0 {
    long long field_0;
    long long field_8;
    char padding_10[12];
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    long long field_28;
    unsigned int field_30;
    char field_34;
    char padding_35[59];
    unsigned long long field_70;
    unsigned int field_78;
} st_b52328_0;


unsigned long long sub_b52328(st_b52328_0 *a0, unsigned long long a1, long long a2)
{
    long long len;  // x0
    unsigned long long v5;  // x19
    unsigned long long v6;  // x0
    unsigned long long v7;  // x22
    unsigned long v9;  // x8
    st_b52328_1 *v10;  // x21
    unsigned long long v0;  // [bp-0x50]
    st_b52328_1 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a2)
    {
        a2 = a0->field_8;
        if (a1)
        {
LABEL_b52360:
            len = _strlen(a1);
            v5 = sub_a40ca8(a0->field_0, a1, a2);
            if (!v5)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 385, "rsa_setup_md");
                v0 = a1;
                sub_a36abc(57, 122);
                sub_a3f52c(v5);
                return 0;
            }
            v6 = sub_afe820(v5);
            if (!(unsigned int)v6)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 391, "rsa_setup_md");
                v0 = a1;
                sub_a36abc(57, 174);
                sub_a3f52c(v5);
                return 0;
            }
            v7 = v6;
            if (sub_a50b14(v5))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 402, "rsa_setup_md");
                sub_a36abc(57, 183);
                sub_a3f52c(v5);
                return 0;
            }
            if (!sub_b52614(a0, a1, 0, v7))
            {
                sub_a3f52c(v5);
                return 0;
            }
            if ((unsigned long long)len >= 50)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 424, "rsa_setup_md");
                v0 = a1;
                sub_a36abc(57, 122);
                sub_a3f52c(v5);
                return 0;
            }
            v9 = a0->field_1c;
            if (!(v9 >> 1 & 1))
            {
                v10 = &a0->field_34;
                if (a0->field_34 && !sub_a509f4(v5, v10))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 431, "rsa_setup_md");
                    v0 = a1;
                    v1 = v10;
                    sub_a36abc(57, 174);
                    sub_a3f52c(v5);
                    return 0;
                }
                sub_a3f52c(v5);
            }
            else
            {
                if (!(v9 >> 2 & 1))
                {
                    if (!sub_a40a98(v5))
                    {
                        sub_a3f52c(v5);
                        return 0;
                    }
                    sub_a3f52c(a0->field_70);
                    a0->field_70 = v5;
                    a0->field_78 = v7;
                    sub_a6db20(a0 + 1, a1, 50);
                }
                sub_a3f73c(a0->field_28);
                sub_a3f52c(a0->field_20);
                a0->field_20 = v5;
                a0->field_28 = 0;
                a0->field_30 = v7;
                sub_a6db20(&a0->field_34, a1, 50);
            }
        }
    }
    else if (a1)
    {
        goto LABEL_b52360;
    }
    return 1;
}
