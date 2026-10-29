/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa3208..0xaa33e0 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_aa3208(long long *a0, long long *a1, long long a2)
{
    long long v4;  // x19
    long long v5;  // x0
    long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x21
    long long v10;  // x1
    long long v11;  // w0
    long long v12;  // x1
    char v0;  // [bp-0x6a]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_9d3c1c(sub_a39cf0());
    if (!v4)
    {
        sub_a368c8();
        v12 = 103;
        goto LABEL_aa32fc;
    }
    v5 = sub_a99b48(&v0, 50, *a1, 0);
    sub_a36c8c(v5, 50, *a1, 0);
    v6 = sub_a2d030(a2);
    v7 = sub_a40ca8(v6, &v0, sub_9f2aec(a2));
    v8 = v7;
    if (!v7 && (v7 = sub_a58d60(&v0), !v7))
    {
        sub_a368c8(sub_a36e70());
        sub_a369bc("crypto/pkcs7/pk7_doit.c", 0x77, "pkcs7_bio_add_digest");
        v10 = 109;
        goto LABEL_aa330c;
    }
    sub_a36cd4();
    if (sub_9d46fc(v4, 111, 0, v7) > 0)
    {
        sub_a3f52c(v8);
        if (!*a0)
        {
            *a0 = v4;
            v11 = 1;
        }
        else if (sub_9d4ec8(*a0, v4))
        {
            v11 = 1;
        }
        else
        {
            sub_a368c8();
            v12 = 133;
LABEL_aa32fc:
            sub_a369bc("crypto/pkcs7/pk7_doit.c", v12, "pkcs7_bio_add_digest");
            v10 = 524320;
LABEL_aa330c:
            sub_a36abc(33, v10, 0);
LABEL_aa3350:
            sub_9d3c28(v4);
            v11 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs7/pk7_doit.c", 125, "pkcs7_bio_add_digest");
        sub_a36abc(33, 0x80020, 0);
        sub_a3f52c(v8);
        goto LABEL_aa3350;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v11;
    ___stack_chk_fail();
}
