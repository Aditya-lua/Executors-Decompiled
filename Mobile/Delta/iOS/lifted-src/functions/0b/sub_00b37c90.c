/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb37c90..0xb37ea4 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b37c90_0 {
    char padding_0[8];
    long long field_8;
    struct st_b37c90_1 *field_10;
} st_b37c90_0;

typedef struct st_b37c90_1 {
    unsigned long long field_0;
} st_b37c90_1;


unsigned long long * sub_b37c90(st_b37c90_0 *a0, unsigned long long *a1, unsigned long long *a2, long long a3, unsigned long long *a4)
{
    unsigned long long *v2;  // x0
    unsigned long v3;  // x21
    long long v4;  // x1
    unsigned long long *v5;  // x0
    long long v6;  // x25
    long long v7;  // x27
    unsigned long long *v8;  // x0
    long long v9;  // x26
    unsigned long long *v10;  // w0
    unsigned long long *v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if ((int)a0->field_10)
    {
        return 0xfffffffe;
    }
    else
    {
        v3 = sub_aafbcc(a0->field_8);
        if (a1)
        {
            if (a2 && v3 > *a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/rsa_kem.c", 320, "rsasve_generate");
                v4 = 217;
                goto LABEL_b37e6c;
            }
            else
            {
                v5 = sub_9dde48(sub_c4c40(a0->field_8));
                if (!v5)
                    return v5;
                v6 = v5;
                sub_9de064();
                v7 = sub_9de208(v6);
                v8 = sub_9de208(v6);
                if (v8 && !(v9 = v8, !sub_9e4c34(v7, sub_962b90(a0->field_8)) || !sub_9ebaf8(v7, 3) || !sub_9e93c8(v9, v7, 0, v6) || !sub_9eb9e0(v9, 2)))
                {
                    v10 = (unsigned long long *)(unsigned int)sub_9e5174(v9, a3, v3);
                    sub_9de17c(v6);
                    sub_9dded4(v6);
                    if (v10 == (unsigned int)v3)
                    {
                        v11 = (unsigned long long *)(unsigned int)sub_aafbf4(v3, a3, a1, a0->field_8, 3);
                        if (v11 >= 1 && v11 == (unsigned int)v3)
                        {
                            if (a2)
                                *a2 = v3;
                            if (a4)
                            {
                                *a4 = v3;
                                return 1;
                            }
                            return 1;
                        }
                        sub_a66ec0(a3, v3);
                    }
                }
                else
                {
                    sub_9de17c(v6);
                    sub_9dded4(v6);
                }
            }
        }
        else
        {
            if (!(unsigned int)v3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/rsa_kem.c", 302, "rsasve_generate");
                v4 = 158;
LABEL_b37e6c:
                sub_a36abc(57, v4, 0);
            }
            else if (a2 || a4)
            {
                if (a2)
                    *a2 = v3;
                if (a4)
                {
                    *a4 = v3;
                    return 1;
                }
                return 1;
            }
        }
        return 0;
    }
}
