/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2beb4..0xa2c0c0 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

unsigned long long sub_a2beb4(unsigned long long a0, long long a1)
{
    long long v13;  // x22
    unsigned long long v14;  // x0
    unsigned long long v23;  // x23
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // w8
    unsigned long long v26;  // 4111
    unsigned long long v27;  // x25
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // x24
    unsigned long long v32;  // 4108
    unsigned long long v15;  // x20
    unsigned long long v33;  // 4108
    unsigned long long v34;  // x27
    unsigned long long v35;  // x2
    long long v36;  // x1
    unsigned long long v16;  // x0
    unsigned long long v17;  // x8
    unsigned long long v18;  // x9
    unsigned long v19;  // cc_dep1
    unsigned long long v20;  // x22
    unsigned long long v21;  // 4108
    unsigned long long v22;  // 4108
    unsigned long long v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xb8]
    unsigned long long v2;  // [bp-0xb0]
    unsigned long long v3;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa0]
    unsigned long long v5;  // [bp-0x98]
    unsigned long v6;  // [bp-0x88]
    long long v7;  // [bp-0x80]
    unsigned long long v8;  // [bp-0x78]
    unsigned long long v9;  // [bp-0x70]
    unsigned long long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    if (a1)
    {
        if (a0 && *(long long *)(a0 + 24))
        {
            v13 = a1;
            if (sub_ad69e4(*(long long *)(a0 + 24)))
            {
                v14 = sub_a36000();
                if (!(sub_9d46fc(v13, 133, 0, 0) >> 31 & 1))
                {
                    v15 = 0;
                }
                else
                {
                    v15 = sub_9d3c1c(sub_9d2f74());
                    if (!v15)
                        return v15;
                    v13 = sub_9d4ec8();
                }
                v8 = 0;
                v9 = 0;
                v10 = 0;
                v6 = a0;
                v7 = v13;
                sub_a76f68(a0 + 56);
                v16 = sub_a2c0d8(0, &v6);
                if (!((char)v10 >> 1 & 1))
                {
                    v17 = *(long long *)a0;
                    v18 = *(long long *)(a0 + 8);
                    v19 = v17;
                    if (!v17)
                    {
                        v20 = &g_c7c2eb;
                        v21 = arm64g_calculate_condition(4, v19, 0, 0);
                        if (!(v21 & 1))
                            goto LABEL_a2c006;
LABEL_a2c005:
                        v23 = &g_c7c2eb;
                    }
                    else
                    {
                        v20 = v17;
                        v22 = arm64g_calculate_condition(4, v19, 0, 0);
                        if (v22 & 1)
                            goto LABEL_a2c005;
LABEL_a2c006:
                        v23 = "Input type: ";
                    }
                    v24 = v18;
                    if (v18)
                        v25 = !v17;
                    else
                        v25 = 1;
                    v26 = arm64g_calculate_condition(4, v24, 0, 0);
                    if (v26 & 1)
                    {
                        v27 = &g_c7c2eb;
                        v28 = arm64g_calculate_condition(4, v24, 0, 0);
                        if (!(v28 & 1))
                            goto LABEL_a2c026;
LABEL_a2c025:
                        v18 = &g_c7c2eb;
                    }
                    else
                    {
                        v27 = "Input structure: ";
                        v29 = arm64g_calculate_condition(4, v24, 0, 0);
                        if (v29 & 1)
                            goto LABEL_a2c025;
LABEL_a2c026:
                    }
                    v30 = v25;
                    if (v25)
                    {
                        v31 = &g_c7c2eb;
                        v32 = arm64g_calculate_condition(19, v30, 0, 0);
                        if (!(v32 & 1))
                            goto LABEL_a2c03a;
LABEL_a2c039:
                        v34 = &g_c7c2eb;
                    }
                    else
                    {
                        v31 = " ";
                        v33 = arm64g_calculate_condition(19, v30, 0, 0);
                        if (v33 & 1)
                            goto LABEL_a2c039;
LABEL_a2c03a:
                        v34 = ", ";
                    }
                    if (sub_a36000() == v14 || !sub_a35fe4())
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/encode_decode/decoder_lib.c", 104, "OSSL_DECODER_from_bio");
                        v4 = v27;
                        v5 = v18;
                        v2 = v20;
                        v3 = v34;
                        v0 = v31;
                        v1 = v23;
                        sub_a36abc(60, 0x8010c, "No supported data to decode. %s%s%s%s%s%s");
                    }
                    v16 = 0;
                }
                sub_a76d80(a0 + 56);
                if (!v15)
                    return v16;
                sub_9d4f1c(v15);
                sub_9d3c28(v15);
                return v16;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/decoder_lib.c", 60, "OSSL_DECODER_from_bio");
        v35 = "No decoders were found. For standard decoders you need at least one of the default or base providers available. Did you forget to load them?";
        v36 = 0x66;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/decoder_lib.c", 55, "OSSL_DECODER_from_bio");
        v36 = 786690;
        v35 = 0;
    }
    sub_a36abc(60, v36, v35);
    return 0;
}
