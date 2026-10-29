/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c0d8..0xa2c518 (1088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c0d8_0 {
    long long field_0;
    char padding_8[24];
    struct st_a2c0d8_1 *field_20;
} st_a2c0d8_0;

typedef struct st_a2c0d8_1 {
    unsigned long long field_0;
} st_a2c0d8_1;


unsigned long long sub_a2c0d8(unsigned long long a0, void* a1)
{
    st_a2c0d8_0 *v12;  // x19
    long long v13;  // x24
    unsigned long long v22;  // x28
    unsigned long long v23;  // x26
    unsigned long v24;  // x8
    long long v25;  // x1
    unsigned long long v14;  // x0
    unsigned long long v15;  // x21
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x8
    unsigned long long v19;  // x26
    unsigned long i;  // x25
    unsigned long long v21;  // x0
    unsigned long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    st_a2c0d8_0 *v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x78]
    uint128_t v8;  // [bp-0x70], Other Possible Types: unsigned long long
    char v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = *(long long *)a1;
    v3 = 0;
    v4 = 0;
    v13 = v12->field_0;
    *(char *)&a1[32] = (char)a1[32] | 1;
    v6 = 0;
    v8 = 0;
    v5 = v12;
    *(long long *)&v8 = (long long)a1[24] + 1;
    if (!a0)
    {
        if (*(long long *)&v12->padding_8[16])
            v18 = sub_ad69e4();
        else
            v18 = 0;
        v15 = 0;
        *(unsigned long long *)&a1[16] = v18;
        v17 = (long long)a1[8];
        goto LABEL_a2c2c0;
    }
    v14 = sub_ad69f8(*(long long *)&v12->padding_8[16], (int)a1[16]);
    if (v14)
        v15 = *(long long *)v14;
    else
        v15 = 0;
    *(char *)&a1[32] = (char)a1[32] & 253;
    if (v12->field_20)
        v12->field_20();
    v16 = sub_a6fbc4(a0, "data");
    if (!v16)
    {
        sub_9d93e0(v16);
        sub_9d3c28(v6);
        v12->field_0 = v13;
        return 0;
    }
    if (*(int *)(v16 + 8) == 5)
    {
        v17 = sub_9d885c(*(long long *)(v16 + 16), *(int *)(v16 + 24));
        v6 = v17;
        v16 = v17;
        if (!v16)
        {
            sub_9d93e0(v16);
            sub_9d3c28(v6);
            v12->field_0 = v13;
            return 0;
        }
        if ((!sub_a6fbc4(a0, "data-type") || sub_a71bcc()) && (!sub_a6fbc4(a0, "data-structure") || sub_a71bcc()))
        {
            if (!sub_a6fbc4(a0, "input-type"))
            {
LABEL_a2c288:
                if (v4 && v3 && !sub_a6e200(v3, "type-specific"))
                    v3 = 0;
LABEL_a2c2c0:
                if ((long long)a1[16])
                {
                    v19 = sub_9d46fc(v17, 133, 0, 0);
                    if (!(v19 >> 31 & 1))
                    {
                        v16 = sub_9d9454(v17);
                        if (v16)
                        {
                            i = (long long)a1[16];
                            if (!i)
                            {
                                sub_9d93e0(v16);
                                sub_9d3c28(v6);
                                v12->field_0 = v13;
                                return 0;
                            }
                            v1 = v19 * 0x100000000;
                            v2 = v16;
                            v0 = (int)v19;
                            do
                            {
                                i -= 1;
                                v21 = sub_ad69f8(*(long long *)&v12->padding_8[16], i);
                                if (v21)
                                {
                                    v22 = *(long long *)v21;
                                    v23 = *(long long *)(v21 + 24);
                                    if (!v15)
                                        goto LABEL_a2c35c;
                                    goto LABEL_a2c334;
                                }
                                else
                                {
                                    v22 = 0;
                                    v23 = 0;
                                    if (v15)
                                    {
LABEL_a2c334:
                                        if (!sub_a2d780(v15))
                                            continue;
                                        goto LABEL_a2c36c;
                                    }
                                    else
                                    {
LABEL_a2c35c:
                                        if (v12->field_0 && sub_a6e200(v12->field_0))
                                            continue;
LABEL_a2c36c:
                                        if ((!v4 || sub_a2d73c(v22)) && (!v3 || v23 && !sub_a6e200()) && (v24 = (char)a1[32], v24 >> 2 & 1 || !*(long long *)&v12->padding_8[0] || !v23 || (*(char *)&a1[32] = (char)v24 | 4, !sub_a6e200(v23, *(long long *)&v12->padding_8[0]))))
                                        {
                                            sub_9d46fc(v17, 128, v0, 0);
                                            if (v1 == sub_9d46fc(v17, 133, 0, 0) * 0x100000000)
                                            {
                                                sub_a36c8c();
                                                v7 = i;
                                                v9 = *(char *)((void*)&v8 + 8) & 0xfffffffb | (char)a1[32] & 4;
                                                (*(long long *)(v22 + 104))();
                                            }
                                        }
                                    }
                                }
                            } while (i);
                            sub_9d93e0(v2);
                            sub_9d3c28(v6);
                            v12->field_0 = v13;
                            return 0;
                        }
                        sub_a368c8();
                        v25 = 970;
                    }
                    else
                    {
                        sub_a368c8();
                        v25 = 965;
                    }
                    sub_a369bc("crypto/encode_decode/decoder_lib.c", v25, "decoder_process");
                    sub_a36abc(60, 0x80020, 0);
                }
            }
            else if (sub_a71bcc() && *(long long *)&v12->padding_8[0] && (!sub_a6e200(*(long long *)&v12->padding_8[0], "SubjectPublicKeyInfo") || !sub_a6e200(v3, "PrivateKeyInfo") || !sub_a6e200(*(long long *)&v12->padding_8[0], "PrivateKeyInfo")))
            {
                *(char *)&a1[32] = (char)a1[32] | 4;
                goto LABEL_a2c288;
            }
        }
    }
    sub_9d93e0(0);
    sub_9d3c28(v6);
    v12->field_0 = v13;
    return 0;
}
