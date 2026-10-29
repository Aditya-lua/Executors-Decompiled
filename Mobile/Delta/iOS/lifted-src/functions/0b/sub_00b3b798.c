/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3b798..0xb3bbe8 (1104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3b798_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    unsigned long long field_20;
} st_b3b798_0;


unsigned long long sub_b3b798(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x22
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    st_b3b798_0 *v20;  // x25
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    unsigned int v23;  // w25
    long long v24;  // x26
    unsigned long long v25;  // x20
    long long v8;  // x23
    long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x19
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned int v14;  // w0
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x5c]
    unsigned long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = 0;
    v1 = 0;
    v6 = sub_9ffdd0();
    if (v6)
    {
        v7 = v6;
        v8 = sub_a19700(a0);
        v9 = sub_a19708(a0);
        v10 = sub_9dddcc(v8);
        if (v10)
        {
            v11 = v10;
            sub_9de064();
            v12 = sub_a6fbc4(a1, "max-size");
            if ((!v12 || sub_a6fe3c(v12, sub_a16b20(a0))) && !(v13 = sub_a6fbc4(a1, "bits"), v13 && !sub_a6fe3c(v13, sub_a1ab64(v7))))
            {
                if (sub_a6fbc4(a1, "security-bits"))
                {
                    v14 = sub_a1ab64(v7);
                    if (sub_a6fe3c())
                        goto LABEL_b3b8cc;
                }
                else
                {
LABEL_b3b8cc:
                    v15 = sub_a6fbc4(a1, "decoded-from-explicit");
                    if (!v15 || !(v16 = sub_a1990c(a0), v16 >> 31 & 1 || !sub_a6fe3c(v15, v16)))
                    {
                        v17 = sub_a6fbc4(a1, "default-digest");
                        if (a2)
                        {
                            if (!v17 || sub_a71468())
                                goto LABEL_b3b9a4;
                        }
                        else
                        {
                            if ((!v17 || sub_a71468()) && !(v18 = sub_a6fbc4(a1, "use-cofactor-flag"), v18 && !sub_a6fe3c(v18, __ROL__(sub_a198e8(a0), 20) & 0xfff00001 & 1)))
                            {
LABEL_b3b9a4:
                                v19 = sub_a6fbc4(a1, "encoded-pub-key");
                                if (v19)
                                {
                                    v20 = v19;
                                    v21 = sub_975ff4(a0);
                                    if (v21)
                                    {
                                        v22 = sub_a1d9f8(v7, v21, 4, v20->field_10, v20->field_18, v11);
                                        v20->field_20 = v22;
                                        if (v22)
                                            goto LABEL_b3b9e8;
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("providers/implementations/keymgmt/ec_kmgmt.c", 726, "common_get_params");
                                        sub_a36abc(57, 220, 0);
                                    }
                                }
                                else
                                {
LABEL_b3b9e8:
                                    v3 = 0;
                                    v2 = 0;
                                    if (sub_a1abd4(v7) == 407)
                                    {
                                        v23 = sub_a1baa8(v7);
                                        if (v23 == 682)
                                        {
                                            v24 = "tpBasis";
                                            goto LABEL_b3ba60;
                                        }
                                        else if (v23 == 683)
                                        {
                                            v24 = "ppBasis";
LABEL_b3ba60:
                                            if (sub_a6f85c(0, a1, "m", sub_a1ad1c(v7)) && sub_a6f90c(0, a1, "basis-type", v24))
                                            {
                                                if (v23 == 682)
                                                {
                                                    if (sub_a1bafc(v7))
                                                        goto LABEL_b3bb20;
                                                }
                                                else
                                                {
                                                    if (sub_a1bb7c(v7) && sub_a6f85c(0, a1, "k1", *(unsigned int *)((void*)&v3 + 4)) && sub_a6f85c(0, a1, "k2", (unsigned int)v3))
                                                    {
LABEL_b3bb20:
                                                        if (sub_a6f85c(0, a1))
                                                            goto LABEL_b3bb30;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else
                                    {
LABEL_b3bb30:
                                        if (sub_a16ddc(v7, 0, a1, v8, v9, v11, &v0) && sub_b3bbe8(a0, 0, a1, 1, &v1))
                                        {
                                            v25 = sub_b3be28(a0, 0, a1) != 0;
                                            goto LABEL_b3bb90;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            v25 = 0;
LABEL_b3bb90:
            sub_a6c2e4(v0, "providers/implementations/keymgmt/ec_kmgmt.c", 742);
            sub_a6c2e4(v1, "providers/implementations/keymgmt/ec_kmgmt.c", 743);
            sub_9de17c(v11);
            sub_9dded4(v11);
            return v25;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ec_kmgmt.c", 632, "common_get_params");
        sub_a36abc(57, 177, 0);
    }
    return 0;
}
