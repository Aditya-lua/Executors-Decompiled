/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9545a8..0x95471c (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9545a8(long long *a0, unsigned long long a1)
{
    long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x0
    long long *v6;  // x0
    long long v7;  // x2
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0[54])
    {
LABEL_9545c8:
        if ((unsigned int)a1)
            return 1;
        sub_9d3c28(a0[53]);
        a0[53] = 0;
        return 1;
    }
    else
    {
        v3 = sub_9d46fc(a0[53], 3, 0, &v0);
        if (v3 > 0)
        {
            v4 = sub_a3f728();
            a0[54] = v4;
            if (v4)
            {
                v5 = sub_95a6a8(a0);
                if (v5)
                {
                    if (sub_a3fe04(a0[54], v5, 0) && sub_a3fe10(a0[54], v0, v3))
                        goto LABEL_9545c8;
                    sub_a368c8();
                    sub_a369bc("ssl/s3_enc.c", 299, "ssl3_digest_cached_records");
                    v6 = a0;
                    v7 = 786691;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/s3_enc.c", 294, "ssl3_digest_cached_records");
                    v6 = a0;
                    v7 = 297;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/s3_enc.c", 287, "ssl3_digest_cached_records");
                v6 = a0;
                v7 = 524294;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/s3_enc.c", 281, "ssl3_digest_cached_records");
            v6 = a0;
            v7 = 332;
        }
        sub_9a58a4(v6, 80, v7, 0);
        return 0;
    }
}
