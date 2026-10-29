/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb521cc..0xb52328 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b521cc_0 {
    long long field_0;
    char padding_8[20];
    char field_1c;
    char padding_1d[83];
    long long field_70;
    long long field_78;
} st_b521cc_0;


long long sub_b521cc(st_b521cc_0 *a0, long long a1, long long a2)
{
    long long v3;  // x0
    long long v4;  // x20
    unsigned long long v5;  // x0
    unsigned long long v6;  // x22
    long long v7;  // x2
    long long v8;  // x1
    long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a40ca8(a0->field_0, a1);
    if (v3)
    {
        v4 = v3;
        v5 = sub_afe820();
        if ((int)v5 >= 1)
        {
            v6 = v5;
            if (!sub_b52614(a0, 0, a1, v6))
                goto LABEL_b522e4;
            if (sub_a6db20((char *)&a0->field_78 + 4, a1, 50) < 50)
            {
                sub_a3f52c(a0->field_70);
                a0->field_70 = v4;
                *(unsigned int *)&a0->field_78 = v6;
                a0->field_1c = a0->field_1c | 4;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 490, "rsa_setup_mgf1_md");
            v0 = a1;
            v7 = "%s exceeds name buffer length";
            v8 = 122;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 483, "rsa_setup_mgf1_md");
            v0 = a1;
            v7 = "digest=%s";
            v8 = 174;
        }
        sub_a36abc(57, v8, v7);
LABEL_b522e4:
        sub_a3f52c(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/rsa_sig.c", 475, "rsa_setup_mgf1_md");
        v0 = a1;
        sub_a36abc(57, 122, "%s could not be fetched");
    }
    return 0;
}
