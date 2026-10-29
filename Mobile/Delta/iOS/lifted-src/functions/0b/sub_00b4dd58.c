/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4dd58..0xb4dfe8 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4dd58_0 {
    long long field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[4];
    char field_1c;
    char field_1d;
    char padding_1e[258];
    char field_120;
    char padding_121[7];
    char field_128;
    char padding_129[55];
    long long field_160;
    long long field_168;
    unsigned long long field_170;
} st_b4dd58_0;


char sub_b4dd58(st_b4dd58_0 *a0, long long a1, char a2)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long long v22;  // x23
    long long v23;  // x1
    char v24;  // x2
    unsigned long long *v25;  // x21
    char v26;  // x23
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    char v19;  // x0
    long long v20;  // x20
    unsigned long long v21;  // x22
    long long v0;  // [bp-0x90]
    unsigned long long *v1;  // [bp-0x88], Other Possible Types: unsigned long long
    char v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!a1)
        return 1;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    if (_strlen(a1) >= 50)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/ecdsa_sig.c", 181, "ecdsa_setup_md");
        v0 = a1;
    }
    else
    {
        v19 = sub_a40ca8(a0->field_0, a1);
        if (v19)
        {
            v20 = v19;
            v21 = sub_a50ac8();
            if ((int)v21 > 0)
            {
                v22 = sub_afd8f8(v20);
                if (sub_a50b14(v20))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/ecdsa_sig.c", 209, "ecdsa_setup_md");
                    v23 = 183;
                    v24 = 0;
                }
                else if (!(a0->field_1c >> 1 & 1))
                {
                    if (!a0->field_128 || !(v25 = &a0->field_128, !sub_a509f4(v20, v25)))
                    {
                        sub_a3f52c(v20);
                        return 1;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/ecdsa_sig.c", 231, "ecdsa_setup_md");
                    v0 = a1;
                    v1 = v25;
                    v24 = (char)"digest %s != %s";
                    v23 = 174;
                }
                else
                {
                    sub_a3f73c(a0->field_168);
                    sub_a3f52c(a0->field_160);
                    *(unsigned long long *)&a0->field_120 = 0;
                    if ((unsigned int)v22)
                    {
                        if (sub_c688bc(&v2, &a0->field_1d, 0x100) && sub_b5acd4(&v2, 0xffffffff, a0->field_10, v22) && sub_a6eaf8(&v2))
                        {
                            sub_c68eb8(&v2, &a0->field_120);
                            v26 = sub_a6e990(&v2);
                            sub_a6ed4c(&v2);
                            if (v26 && *(long long *)&a0->field_120)
                                _memmove(&a0->field_1d, v26);
                        }
                        else
                        {
                            sub_a6ed4c(&v2);
                        }
                    }
                    a0->field_160 = v20;
                    a0->field_168 = 0;
                    a0->field_170 = v21 & 0xffffffff;
                    sub_a6db20(&a0->field_128, a1, 50);
                    return 1;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/ecdsa_sig.c", 195, "ecdsa_setup_md");
                v0 = a1;
                v1 = v21;
                v24 = (char)"%s has invalid md size %d";
                v23 = 122;
            }
            sub_a36abc(57, v23, v24);
            sub_a3f52c(v20);
            return 0;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/ecdsa_sig.c", 189, "ecdsa_setup_md");
        v0 = a1;
    }
    sub_a36abc(57, 122);
    return 0;
}
