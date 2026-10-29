/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998220..0x998344 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_998220(long long a0, unsigned long long *a1)
{
    unsigned long long v2;  // x4
    long long v3;  // x0
    long long v4;  // x1
    long long v5;  // x2
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1[1];
    if (!*(long long *)(a0 + 4160))
    {
LABEL_9982c8:
        if (v2 <= 0x4000)
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1084, "tls_default_post_process_record");
        v3 = a0;
        v4 = 22;
        v5 = 146;
    }
    else if (v2 >= 17409)
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1073, "tls_default_post_process_record");
        v3 = a0;
        v4 = 22;
        v5 = 140;
    }
    else
    {
        if (!a1[6])
        {
            v6 = sub_a6bf4c(0x4540, "ssl/record/methods/tls_common.c", 1049);
            a1[6] = v6;
            if (!v6)
                goto LABEL_998304;
        }
        v7 = sub_9f2b98();
        if (!(v7 >> 31 & 1))
        {
            v2 = v7 & 0xffffffff;
            a1[1] = v2;
            a1[4] = a1[6];
            goto LABEL_9982c8;
        }
        else
        {
LABEL_998304:
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls_common.c", 1078, "tls_default_post_process_record");
            v3 = a0;
            v4 = 30;
            v5 = 107;
        }
    }
    sub_996e84(v3, v4, v5, 0);
    return 0;
}
