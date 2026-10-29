/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26740..0xb26c80 (1344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

unsigned long long sub_b26740(unsigned long long a0, unsigned long long a1, unsigned long long a2)
{
    long long v9;  // x0
    unsigned long long v10;  // x21
    unsigned long v19;  // x28
    unsigned long v20;  // x28
    long long v22;  // x23
    unsigned long long v23;  // x27
    long long v24;  // x25
    unsigned long long v25;  // x26
    unsigned long long v26;  // x24
    unsigned long long v27;  // x23
    unsigned long long v28;  // x0
    unsigned long long v11;  // x20
    unsigned long long v29;  // x8
    unsigned long long v30;  // x0
    unsigned long long v31;  // x0
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long v35;  // cc_ndep
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4108
    unsigned long long v12;  // x19
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4108
    unsigned long long v40;  // x8
    unsigned long long v13;  // x26
    unsigned long long v41;  // x8
    unsigned long long v42;  // x8
    unsigned long long v14;  // x27
    unsigned long long v43;  // x22
    unsigned long long v15;  // x23
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x23
    unsigned long v0;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    long long v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x78]
    unsigned long long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    v9 = sub_ab1c98(a1);
    if (a0 && a1)
    {
        v3 = v9;
        v10 = sub_ad61b4();
        v11 = sub_ad61b4(v10);
        v12 = sub_ad61b4(v11);
        if (v10 && v11 && v12)
        {
            if (a2 & 1)
            {
                v15 = "Private-Key";
                v14 = "modulus:";
                v13 = "publicExponent:";
            }
            else if (!(a2 >> 1 & 1))
            {
                v13 = 0;
                v14 = 0;
                v15 = "RSA key";
            }
            else
            {
                v15 = "Public-Key";
                v14 = "Modulus:";
                v13 = "Exponent:";
            }
            sub_ab1ac4(a1, &v5, &v4, &v6);
            sub_ab1f90(a1, v10, v11, v12);
            v16 = sub_ad69e4(v10);
            v17 = sub_9e46a8(v5);
            if (!(a2 & 1))
            {
                v0 = v15;
                v1 = v17;
            }
            else
            {
                v1 = v17;
                v2 = v16;
                v0 = v15;
            }
            if ((int)sub_9d524c(a0) >= 1 && sub_a2fa60(a0, v14, v5) && sub_a2fa60(a0, v13, v4))
            {
                if (!(a2 & 1))
                {
LABEL_b26910:
                    if (a2 >> 7 & 1)
                    {
                        switch ((unsigned int)sub_ab1cb0(a1, 0xf000))
                        {
                        case 4096:
                            if (sub_ab8c18(v3))
                                goto LABEL_b26b0c;
                            v22 = v3;
                            v23 = sub_ab8ca8(v22);
                            v24 = sub_ab8cbc(v22);
                            v25 = sub_ab8cd0(v22);
                            v26 = sub_ab8ce4(v22);
                            v27 = sub_ab8cf8(v22);
                            if ((int)sub_9d524c(a0, "PSS parameter restrictions:\n") >= 1)
                            {
                                v28 = sub_ab8f24(v23);
                                v29 = &g_c7c2eb;
                                if ((unsigned int)v23 == 64)
                                    v29 = " (default)";
                                v0 = v28;
                                v1 = v29;
                                if ((int)sub_9d524c() >= 1)
                                {
                                    v30 = sub_ab8fcc(v24);
                                    v31 = sub_ab8f24(v25);
                                    if ((unsigned int)v25 == 64)
                                    {
                                        v36 = arm64g_calculate_condition(v32, v33, v34, v35);
                                        v37 = arm64g_calculate_condition(3, (v36 & 1 ? v24 & 0xffffffff : 0), (v36 & 1 ? 911 : 0), 0);
                                        if (!(v37 & 1))
                                            goto LABEL_b26be2;
LABEL_b26be1:
                                        v40 = " (default)";
                                    }
                                    else
                                    {
                                        v38 = arm64g_calculate_condition(v32, v33, v34, v35);
                                        v39 = arm64g_calculate_condition(0, (v38 & 1 ? v24 & 0xffffffff : 0), (v38 & 1 ? 911 : 0), 0);
                                        if (v39 & 1)
                                            goto LABEL_b26be1;
LABEL_b26be2:
                                        v40 = &g_c7c2eb;
                                    }
                                    v1 = v31;
                                    v2 = v40;
                                    v0 = v30;
                                    if ((int)sub_9d524c() >= 1)
                                    {
                                        if ((unsigned int)v26 == 20)
                                            v41 = " (default)";
                                        else
                                            v41 = &g_c7c2eb;
                                        v0 = v26;
                                        v1 = v41;
                                        if ((int)sub_9d524c() >= 1)
                                        {
                                            if ((unsigned int)v27 == 1)
                                                v42 = " (default)";
                                            else
                                                v42 = &g_c7c2eb;
                                            v0 = v27;
                                            v1 = v42;
LABEL_b26b0c:
                                            if ((int)sub_9d524c(a0) >= 1)
                                                goto LABEL_b26b1c;
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 0:
                            if (!sub_ab8c18(v3))
                                goto LABEL_b26b0c;
                        default:
                            goto LABEL_b26b1c;
                        }
                    }
                    else
                    {
LABEL_b26b1c:
                        v43 = 1;
                        goto LABEL_b26c44;
                    }
                }
                else if (sub_a2fa60(a0, "privateExponent:", v6) && sub_a2fa60(a0, "prime1:", sub_ad69f8(v10, 0)) && sub_a2fa60(a0, "prime2:", sub_ad69f8(v10, 1)) && sub_a2fa60(a0, "exponent1:", sub_ad69f8(v11, 0)) && sub_a2fa60(a0, "exponent2:", sub_ad69f8(v11, 1)) && sub_a2fa60(a0, "coefficient:", sub_ad69f8(v12, 0)))
                {
                    v18 = 2;
                    do
                    {
                        if ((int)sub_ad69e4(v10) <= (int)v18)
                            goto LABEL_b26910;
                    } while ((v0 = (unsigned int)v18 + 1, (int)sub_9d524c(a0, "prime%d:") >= 1 && !(v19 = (unsigned int)v0 - 1, !sub_a2fa60(a0, 0, sub_ad69f8(v10, v19)) || (v0 = (unsigned int)v19 + 1, (int)sub_9d524c(a0, "exponent%d:") < 1 || (v20 = (unsigned int)v0 - 1, !sub_a2fa60(a0, 0, sub_ad69f8(v11, v20)) || (v18 = (unsigned int)v20 + 1, v0 = v18, (int)sub_9d524c(a0, "coefficient%d:") < 1)))) && sub_a2fa60(a0, 0, sub_ad69f8(v12, (unsigned int)v18 - 2))));
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 482, "rsa_to_text");
            sub_a36abc(57, 0x8000f, 0);
        }
        v43 = 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 473, "rsa_to_text");
        sub_a36abc(57, 0xc0102, 0);
        v12 = 0;
        v11 = 0;
        v43 = 0;
        v10 = 0;
    }
LABEL_b26c44:
    sub_ad6020(v10);
    sub_ad6020(v11);
    sub_ad6020(v12);
    return v43;
}
