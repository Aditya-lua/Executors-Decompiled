/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa6be0..0xaa6e8c (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aa61cc;
extern long long g_aa6bd0;

char * sub_aa6be0(long long a0, char *a1, long long a2)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    char *v26;  // x0
    char *v27;  // x19
    char *v28;  // x25
    char *v29;  // x25
    char *v30;  // x25
    char *v31;  // x22
    char *v32;  // w8
    char *v33;  // x25
    char *v34;  // x25
    unsigned long long v17;  // x26
    char *v35;  // x8
    char *v36;  // x25
    char *v37;  // x25
    char *v38;  // x25
    char *v39;  // w8
    char *v40;  // x25
    char *v41;  // x25
    char *v42;  // x25
    char *v43;  // x25
    char *v44;  // x25
    unsigned long long v18;  // x25
    char *v45;  // w8
    char *v46;  // x25
    char *v47;  // x20
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    char *v0;  // [bp-0x70]
    char *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    if (!a1)
        return 0;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v26 = sub_ad6270(&g_aa61cc);
    if (!v26)
        return v26;
    v27 = v26;
    v28 = a1 - 1;
    do
    {
        v29 = v28;
        v30 = v29 + 1;
        v28 = v30;
    } while (sub_a6994c(v29[1], 8));
    v1 = v30;
    if (*v30)
    {
        v31 = sub_a6bf4c(24, "crypto/property/property_parse.c", 418);
        if (!v31)
        {
            sub_a6c2e4(v31, "crypto/property/property_parse.c", 462);
            sub_ad6958(v27, &g_aa6bd0);
            return 0;
        }
        while (1)
        {
            *(unsigned long long *)&v31[16] = 0;
            switch (v32)
            {
            case 45:
                do
                {
                    v42 = v30;
                    v43 = v42 + 1;
                    v30 = v43;
                } while (sub_a6994c(v42[1], 8));
                v1 = v43;
                *(unsigned int *)&v31[8] = 2;
                v31[12] = v31[12] & 254;
                if (!sub_aa61ec(a0, &v1, v31))
                {
                    sub_a6c2e4(v31, "crypto/property/property_parse.c", 462);
                    sub_ad6958(v27, &g_aa6bd0);
                    return 0;
                }
                goto LABEL_aa6d94;
            case 63:
                do
                {
                    v33 = v30;
                    v34 = v33 + 1;
                    v30 = v34;
                } while (sub_a6994c(v33[1], 8));
                v1 = v34;
                v35 = (char *)1;
                break;
            default:
                v35 = (char *)0;
                break;
            }
            v31[12] = v31[12] & 254 | v35;
            if (!sub_aa61ec(a0, &v1, v31))
            {
                sub_a6c2e4(v31, "crypto/property/property_parse.c", 462);
                sub_ad6958(v27, &g_aa6bd0);
                return 0;
            }
            v36 = v1;
            if (*v36 == 61)
            {
                do
                {
                    v37 = v36;
                    v38 = v37 + 1;
                    v36 = v38;
                } while (sub_a6994c(v37[1], 8));
                v39 = (char *)0;
                goto LABEL_aa6d70;
            }
            else if (sub_a6e258(v36, "!=", 2))
            {
                *(unsigned int *)&v31[4] = 0;
                *(unsigned int *)&v31[8] = 0;
                *(unsigned int *)&v31[16] = 1;
            }
            else
            {
                v40 = v36 + 1;
                do
                {
                    v41 = v40;
                    v38 = v41 + 1;
                    v40 = v38;
                } while (sub_a6994c(v41[1], 8));
                v39 = (char *)1;
LABEL_aa6d70:
                v1 = v38;
                *(unsigned int *)&v31[8] = (unsigned int)v39;
                if (!sub_aa63c0(a0, &v1, v31, a2))
                    *(unsigned int *)&v31[4] = 2;
            }
LABEL_aa6d94:
            if (!sub_ad68a0(v27, v31))
            {
                sub_a6c2e4(v31, "crypto/property/property_parse.c", 462);
                sub_ad6958(v27, &g_aa6bd0);
                return 0;
            }
            v44 = v1;
            switch (v45)
            {
            case 44:
                do
                {
                    v46 = v44;
                    v30 = v46 + 1;
                    v44 = v30;
                } while (sub_a6994c(v46[1], 8));
                v1 = v30;
                v31 = sub_a6bf4c(24, "crypto/property/property_parse.c", 418);
                if (!v31)
                {
                    sub_a6c2e4(v31, "crypto/property/property_parse.c", 462);
                    sub_ad6958(v27, &g_aa6bd0);
                    return 0;
                }
                break;
            case 0:
                goto LABEL_aa6df4;
            default:
                sub_a368c8();
                sub_a369bc("crypto/property/property_parse.c", 455, "ossl_parse_query");
                v0 = v44;
                sub_a36abc(55, 110, "HERE-->%s");
                sub_a6c2e4(0, "crypto/property/property_parse.c", 462);
                sub_ad6958(v27, &g_aa6bd0);
                return 0;
            }
        }
    }
LABEL_aa6df4:
    v47 = sub_aa6a3c(a0, v27);
    sub_a6c2e4(0, "crypto/property/property_parse.c", 462);
    sub_ad6958(v27, &g_aa6bd0);
    return v47;
}
